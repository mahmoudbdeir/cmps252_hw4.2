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

@Tag("23")
class Record_3650 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3650: FirstName is Malik")
	void FirstNameOfRecord3650() {
		assertEquals("Malik", customers.get(3649).getFirstName());
	}

	@Test
	@DisplayName("Record 3650: LastName is Jaramillo")
	void LastNameOfRecord3650() {
		assertEquals("Jaramillo", customers.get(3649).getLastName());
	}

	@Test
	@DisplayName("Record 3650: Company is Roymal Coatings & Chemls Co")
	void CompanyOfRecord3650() {
		assertEquals("Roymal Coatings & Chemls Co", customers.get(3649).getCompany());
	}

	@Test
	@DisplayName("Record 3650: Address is 1032 Stelton Rd")
	void AddressOfRecord3650() {
		assertEquals("1032 Stelton Rd", customers.get(3649).getAddress());
	}

	@Test
	@DisplayName("Record 3650: City is Piscataway")
	void CityOfRecord3650() {
		assertEquals("Piscataway", customers.get(3649).getCity());
	}

	@Test
	@DisplayName("Record 3650: County is Middlesex")
	void CountyOfRecord3650() {
		assertEquals("Middlesex", customers.get(3649).getCounty());
	}

	@Test
	@DisplayName("Record 3650: State is NJ")
	void StateOfRecord3650() {
		assertEquals("NJ", customers.get(3649).getState());
	}

	@Test
	@DisplayName("Record 3650: ZIP is 8854")
	void ZIPOfRecord3650() {
		assertEquals("8854", customers.get(3649).getZIP());
	}

	@Test
	@DisplayName("Record 3650: Phone is 732-981-5798")
	void PhoneOfRecord3650() {
		assertEquals("732-981-5798", customers.get(3649).getPhone());
	}

	@Test
	@DisplayName("Record 3650: Fax is 732-981-0039")
	void FaxOfRecord3650() {
		assertEquals("732-981-0039", customers.get(3649).getFax());
	}

	@Test
	@DisplayName("Record 3650: Email is malik@jaramillo.com")
	void EmailOfRecord3650() {
		assertEquals("malik@jaramillo.com", customers.get(3649).getEmail());
	}

	@Test
	@DisplayName("Record 3650: Web is http://www.malikjaramillo.com")
	void WebOfRecord3650() {
		assertEquals("http://www.malikjaramillo.com", customers.get(3649).getWeb());
	}
}
