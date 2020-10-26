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

@Tag("21")
class Record_695 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 695: FirstName is Mario")
	void FirstNameOfRecord695() {
		assertEquals("Mario", customers.get(694).getFirstName());
	}

	@Test
	@DisplayName("Record 695: LastName is Wrighton")
	void LastNameOfRecord695() {
		assertEquals("Wrighton", customers.get(694).getLastName());
	}

	@Test
	@DisplayName("Record 695: Company is Super 8 Motel")
	void CompanyOfRecord695() {
		assertEquals("Super 8 Motel", customers.get(694).getCompany());
	}

	@Test
	@DisplayName("Record 695: Address is 763 Imperial Ct")
	void AddressOfRecord695() {
		assertEquals("763 Imperial Ct", customers.get(694).getAddress());
	}

	@Test
	@DisplayName("Record 695: City is West Bend")
	void CityOfRecord695() {
		assertEquals("West Bend", customers.get(694).getCity());
	}

	@Test
	@DisplayName("Record 695: County is Washington")
	void CountyOfRecord695() {
		assertEquals("Washington", customers.get(694).getCounty());
	}

	@Test
	@DisplayName("Record 695: State is WI")
	void StateOfRecord695() {
		assertEquals("WI", customers.get(694).getState());
	}

	@Test
	@DisplayName("Record 695: ZIP is 53095")
	void ZIPOfRecord695() {
		assertEquals("53095", customers.get(694).getZIP());
	}

	@Test
	@DisplayName("Record 695: Phone is 262-335-4565")
	void PhoneOfRecord695() {
		assertEquals("262-335-4565", customers.get(694).getPhone());
	}

	@Test
	@DisplayName("Record 695: Fax is 262-335-4161")
	void FaxOfRecord695() {
		assertEquals("262-335-4161", customers.get(694).getFax());
	}

	@Test
	@DisplayName("Record 695: Email is mario@wrighton.com")
	void EmailOfRecord695() {
		assertEquals("mario@wrighton.com", customers.get(694).getEmail());
	}

	@Test
	@DisplayName("Record 695: Web is http://www.mariowrighton.com")
	void WebOfRecord695() {
		assertEquals("http://www.mariowrighton.com", customers.get(694).getWeb());
	}
}
