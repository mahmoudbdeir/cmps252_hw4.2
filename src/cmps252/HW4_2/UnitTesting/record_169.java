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
class Record_169 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 169: FirstName is Paris")
	void FirstNameOfRecord169() {
		assertEquals("Paris", customers.get(168).getFirstName());
	}

	@Test
	@DisplayName("Record 169: LastName is Zeanah")
	void LastNameOfRecord169() {
		assertEquals("Zeanah", customers.get(168).getLastName());
	}

	@Test
	@DisplayName("Record 169: Company is Therapeutic Pool")
	void CompanyOfRecord169() {
		assertEquals("Therapeutic Pool", customers.get(168).getCompany());
	}

	@Test
	@DisplayName("Record 169: Address is Box #-532")
	void AddressOfRecord169() {
		assertEquals("Box #-532", customers.get(168).getAddress());
	}

	@Test
	@DisplayName("Record 169: City is Lewiston")
	void CityOfRecord169() {
		assertEquals("Lewiston", customers.get(168).getCity());
	}

	@Test
	@DisplayName("Record 169: County is Nez Perce")
	void CountyOfRecord169() {
		assertEquals("Nez Perce", customers.get(168).getCounty());
	}

	@Test
	@DisplayName("Record 169: State is ID")
	void StateOfRecord169() {
		assertEquals("ID", customers.get(168).getState());
	}

	@Test
	@DisplayName("Record 169: ZIP is 83501")
	void ZIPOfRecord169() {
		assertEquals("83501", customers.get(168).getZIP());
	}

	@Test
	@DisplayName("Record 169: Phone is 208-746-1333")
	void PhoneOfRecord169() {
		assertEquals("208-746-1333", customers.get(168).getPhone());
	}

	@Test
	@DisplayName("Record 169: Fax is 208-746-0741")
	void FaxOfRecord169() {
		assertEquals("208-746-0741", customers.get(168).getFax());
	}

	@Test
	@DisplayName("Record 169: Email is paris@zeanah.com")
	void EmailOfRecord169() {
		assertEquals("paris@zeanah.com", customers.get(168).getEmail());
	}

	@Test
	@DisplayName("Record 169: Web is http://www.pariszeanah.com")
	void WebOfRecord169() {
		assertEquals("http://www.pariszeanah.com", customers.get(168).getWeb());
	}
}
