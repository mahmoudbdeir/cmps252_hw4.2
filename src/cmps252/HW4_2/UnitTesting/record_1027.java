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

@Tag("10")
class Record_1027 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1027: FirstName is Mellisa")
	void FirstNameOfRecord1027() {
		assertEquals("Mellisa", customers.get(1026).getFirstName());
	}

	@Test
	@DisplayName("Record 1027: LastName is Archacki")
	void LastNameOfRecord1027() {
		assertEquals("Archacki", customers.get(1026).getLastName());
	}

	@Test
	@DisplayName("Record 1027: Company is Pioneer X Ray Inc")
	void CompanyOfRecord1027() {
		assertEquals("Pioneer X Ray Inc", customers.get(1026).getCompany());
	}

	@Test
	@DisplayName("Record 1027: Address is 540 W Ogden Ave")
	void AddressOfRecord1027() {
		assertEquals("540 W Ogden Ave", customers.get(1026).getAddress());
	}

	@Test
	@DisplayName("Record 1027: City is Hinsdale")
	void CityOfRecord1027() {
		assertEquals("Hinsdale", customers.get(1026).getCity());
	}

	@Test
	@DisplayName("Record 1027: County is DuPage")
	void CountyOfRecord1027() {
		assertEquals("DuPage", customers.get(1026).getCounty());
	}

	@Test
	@DisplayName("Record 1027: State is IL")
	void StateOfRecord1027() {
		assertEquals("IL", customers.get(1026).getState());
	}

	@Test
	@DisplayName("Record 1027: ZIP is 60521")
	void ZIPOfRecord1027() {
		assertEquals("60521", customers.get(1026).getZIP());
	}

	@Test
	@DisplayName("Record 1027: Phone is 630-654-2416")
	void PhoneOfRecord1027() {
		assertEquals("630-654-2416", customers.get(1026).getPhone());
	}

	@Test
	@DisplayName("Record 1027: Fax is 630-654-5208")
	void FaxOfRecord1027() {
		assertEquals("630-654-5208", customers.get(1026).getFax());
	}

	@Test
	@DisplayName("Record 1027: Email is mellisa@archacki.com")
	void EmailOfRecord1027() {
		assertEquals("mellisa@archacki.com", customers.get(1026).getEmail());
	}

	@Test
	@DisplayName("Record 1027: Web is http://www.mellisaarchacki.com")
	void WebOfRecord1027() {
		assertEquals("http://www.mellisaarchacki.com", customers.get(1026).getWeb());
	}
}
