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

@Tag("13")
class Record_2087 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2087: FirstName is Arron")
	void FirstNameOfRecord2087() {
		assertEquals("Arron", customers.get(2086).getFirstName());
	}

	@Test
	@DisplayName("Record 2087: LastName is Tooke")
	void LastNameOfRecord2087() {
		assertEquals("Tooke", customers.get(2086).getLastName());
	}

	@Test
	@DisplayName("Record 2087: Company is Roberts Hill Calligan Bragg")
	void CompanyOfRecord2087() {
		assertEquals("Roberts Hill Calligan Bragg", customers.get(2086).getCompany());
	}

	@Test
	@DisplayName("Record 2087: Address is 12774 Old Meridian St")
	void AddressOfRecord2087() {
		assertEquals("12774 Old Meridian St", customers.get(2086).getAddress());
	}

	@Test
	@DisplayName("Record 2087: City is Carmel")
	void CityOfRecord2087() {
		assertEquals("Carmel", customers.get(2086).getCity());
	}

	@Test
	@DisplayName("Record 2087: County is Hamilton")
	void CountyOfRecord2087() {
		assertEquals("Hamilton", customers.get(2086).getCounty());
	}

	@Test
	@DisplayName("Record 2087: State is IN")
	void StateOfRecord2087() {
		assertEquals("IN", customers.get(2086).getState());
	}

	@Test
	@DisplayName("Record 2087: ZIP is 46032")
	void ZIPOfRecord2087() {
		assertEquals("46032", customers.get(2086).getZIP());
	}

	@Test
	@DisplayName("Record 2087: Phone is 317-573-4981")
	void PhoneOfRecord2087() {
		assertEquals("317-573-4981", customers.get(2086).getPhone());
	}

	@Test
	@DisplayName("Record 2087: Fax is 317-573-8113")
	void FaxOfRecord2087() {
		assertEquals("317-573-8113", customers.get(2086).getFax());
	}

	@Test
	@DisplayName("Record 2087: Email is arron@tooke.com")
	void EmailOfRecord2087() {
		assertEquals("arron@tooke.com", customers.get(2086).getEmail());
	}

	@Test
	@DisplayName("Record 2087: Web is http://www.arrontooke.com")
	void WebOfRecord2087() {
		assertEquals("http://www.arrontooke.com", customers.get(2086).getWeb());
	}
}
