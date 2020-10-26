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

@Tag("17")
class Record_1105 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1105: FirstName is Marcel")
	void FirstNameOfRecord1105() {
		assertEquals("Marcel", customers.get(1104).getFirstName());
	}

	@Test
	@DisplayName("Record 1105: LastName is Luening")
	void LastNameOfRecord1105() {
		assertEquals("Luening", customers.get(1104).getLastName());
	}

	@Test
	@DisplayName("Record 1105: Company is Telecom Services Group Ltd")
	void CompanyOfRecord1105() {
		assertEquals("Telecom Services Group Ltd", customers.get(1104).getCompany());
	}

	@Test
	@DisplayName("Record 1105: Address is 6510b E 64th Ave")
	void AddressOfRecord1105() {
		assertEquals("6510b E 64th Ave", customers.get(1104).getAddress());
	}

	@Test
	@DisplayName("Record 1105: City is Commerce City")
	void CityOfRecord1105() {
		assertEquals("Commerce City", customers.get(1104).getCity());
	}

	@Test
	@DisplayName("Record 1105: County is Adams")
	void CountyOfRecord1105() {
		assertEquals("Adams", customers.get(1104).getCounty());
	}

	@Test
	@DisplayName("Record 1105: State is CO")
	void StateOfRecord1105() {
		assertEquals("CO", customers.get(1104).getState());
	}

	@Test
	@DisplayName("Record 1105: ZIP is 80022")
	void ZIPOfRecord1105() {
		assertEquals("80022", customers.get(1104).getZIP());
	}

	@Test
	@DisplayName("Record 1105: Phone is 303-289-0827")
	void PhoneOfRecord1105() {
		assertEquals("303-289-0827", customers.get(1104).getPhone());
	}

	@Test
	@DisplayName("Record 1105: Fax is 303-289-5257")
	void FaxOfRecord1105() {
		assertEquals("303-289-5257", customers.get(1104).getFax());
	}

	@Test
	@DisplayName("Record 1105: Email is marcel@luening.com")
	void EmailOfRecord1105() {
		assertEquals("marcel@luening.com", customers.get(1104).getEmail());
	}

	@Test
	@DisplayName("Record 1105: Web is http://www.marcelluening.com")
	void WebOfRecord1105() {
		assertEquals("http://www.marcelluening.com", customers.get(1104).getWeb());
	}
}
