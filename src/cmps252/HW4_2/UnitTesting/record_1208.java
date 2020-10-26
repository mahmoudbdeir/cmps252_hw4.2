package cmps252.HW4_2.UnitTesting;

import static org.junit.jupiter.api.Assertions.*;
import java.io.FileNotFoundException;
import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import cmps252.HW4_2.Customer;
import cmps252.HW4_2.FileParser;

@Tag("41")
class Record_1208 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1208: FirstName is Mindy")
	void FirstNameOfRecord1208() {
		assertEquals("Mindy", customers.get(1207).getFirstName());
	}

	@Test
	@DisplayName("Record 1208: LastName is Bucciarelli")
	void LastNameOfRecord1208() {
		assertEquals("Bucciarelli", customers.get(1207).getLastName());
	}

	@Test
	@DisplayName("Record 1208: Company is R & W Distribution Inc")
	void CompanyOfRecord1208() {
		assertEquals("R & W Distribution Inc", customers.get(1207).getCompany());
	}

	@Test
	@DisplayName("Record 1208: Address is 321 S Hamilton St")
	void AddressOfRecord1208() {
		assertEquals("321 S Hamilton St", customers.get(1207).getAddress());
	}

	@Test
	@DisplayName("Record 1208: City is Sullivan")
	void CityOfRecord1208() {
		assertEquals("Sullivan", customers.get(1207).getCity());
	}

	@Test
	@DisplayName("Record 1208: County is Moultrie")
	void CountyOfRecord1208() {
		assertEquals("Moultrie", customers.get(1207).getCounty());
	}

	@Test
	@DisplayName("Record 1208: State is IL")
	void StateOfRecord1208() {
		assertEquals("IL", customers.get(1207).getState());
	}

	@Test
	@DisplayName("Record 1208: ZIP is 61951")
	void ZIPOfRecord1208() {
		assertEquals("61951", customers.get(1207).getZIP());
	}

	@Test
	@DisplayName("Record 1208: Phone is 217-728-3423")
	void PhoneOfRecord1208() {
		assertEquals("217-728-3423", customers.get(1207).getPhone());
	}

	@Test
	@DisplayName("Record 1208: Fax is 217-728-6773")
	void FaxOfRecord1208() {
		assertEquals("217-728-6773", customers.get(1207).getFax());
	}

	@Test
	@DisplayName("Record 1208: Email is mindy@bucciarelli.com")
	void EmailOfRecord1208() {
		assertEquals("mindy@bucciarelli.com", customers.get(1207).getEmail());
	}

	@Test
	@DisplayName("Record 1208: Web is http://www.mindybucciarelli.com")
	void WebOfRecord1208() {
		assertEquals("http://www.mindybucciarelli.com", customers.get(1207).getWeb());
	}
}
