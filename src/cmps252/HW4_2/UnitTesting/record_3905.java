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

@Tag("33")
class Record_3905 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3905: FirstName is Lonny")
	void FirstNameOfRecord3905() {
		assertEquals("Lonny", customers.get(3904).getFirstName());
	}

	@Test
	@DisplayName("Record 3905: LastName is Bryd")
	void LastNameOfRecord3905() {
		assertEquals("Bryd", customers.get(3904).getLastName());
	}

	@Test
	@DisplayName("Record 3905: Company is Gables Inn")
	void CompanyOfRecord3905() {
		assertEquals("Gables Inn", customers.get(3904).getCompany());
	}

	@Test
	@DisplayName("Record 3905: Address is 1 Metropolitan Sq")
	void AddressOfRecord3905() {
		assertEquals("1 Metropolitan Sq", customers.get(3904).getAddress());
	}

	@Test
	@DisplayName("Record 3905: City is Saint Louis")
	void CityOfRecord3905() {
		assertEquals("Saint Louis", customers.get(3904).getCity());
	}

	@Test
	@DisplayName("Record 3905: County is Saint Louis City")
	void CountyOfRecord3905() {
		assertEquals("Saint Louis City", customers.get(3904).getCounty());
	}

	@Test
	@DisplayName("Record 3905: State is MO")
	void StateOfRecord3905() {
		assertEquals("MO", customers.get(3904).getState());
	}

	@Test
	@DisplayName("Record 3905: ZIP is 63102")
	void ZIPOfRecord3905() {
		assertEquals("63102", customers.get(3904).getZIP());
	}

	@Test
	@DisplayName("Record 3905: Phone is 314-259-7283")
	void PhoneOfRecord3905() {
		assertEquals("314-259-7283", customers.get(3904).getPhone());
	}

	@Test
	@DisplayName("Record 3905: Fax is 314-259-6598")
	void FaxOfRecord3905() {
		assertEquals("314-259-6598", customers.get(3904).getFax());
	}

	@Test
	@DisplayName("Record 3905: Email is lonny@bryd.com")
	void EmailOfRecord3905() {
		assertEquals("lonny@bryd.com", customers.get(3904).getEmail());
	}

	@Test
	@DisplayName("Record 3905: Web is http://www.lonnybryd.com")
	void WebOfRecord3905() {
		assertEquals("http://www.lonnybryd.com", customers.get(3904).getWeb());
	}
}
