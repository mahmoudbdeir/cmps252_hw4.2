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

@Tag("2")
class Record_1017 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1017: FirstName is Fausto")
	void FirstNameOfRecord1017() {
		assertEquals("Fausto", customers.get(1016).getFirstName());
	}

	@Test
	@DisplayName("Record 1017: LastName is Kylholz")
	void LastNameOfRecord1017() {
		assertEquals("Kylholz", customers.get(1016).getLastName());
	}

	@Test
	@DisplayName("Record 1017: Company is Allen Contracting Co")
	void CompanyOfRecord1017() {
		assertEquals("Allen Contracting Co", customers.get(1016).getCompany());
	}

	@Test
	@DisplayName("Record 1017: Address is 2555 34th St Ne")
	void AddressOfRecord1017() {
		assertEquals("2555 34th St Ne", customers.get(1016).getAddress());
	}

	@Test
	@DisplayName("Record 1017: City is Canton")
	void CityOfRecord1017() {
		assertEquals("Canton", customers.get(1016).getCity());
	}

	@Test
	@DisplayName("Record 1017: County is Stark")
	void CountyOfRecord1017() {
		assertEquals("Stark", customers.get(1016).getCounty());
	}

	@Test
	@DisplayName("Record 1017: State is OH")
	void StateOfRecord1017() {
		assertEquals("OH", customers.get(1016).getState());
	}

	@Test
	@DisplayName("Record 1017: ZIP is 44705")
	void ZIPOfRecord1017() {
		assertEquals("44705", customers.get(1016).getZIP());
	}

	@Test
	@DisplayName("Record 1017: Phone is 330-456-8093")
	void PhoneOfRecord1017() {
		assertEquals("330-456-8093", customers.get(1016).getPhone());
	}

	@Test
	@DisplayName("Record 1017: Fax is 330-456-2197")
	void FaxOfRecord1017() {
		assertEquals("330-456-2197", customers.get(1016).getFax());
	}

	@Test
	@DisplayName("Record 1017: Email is fausto@kylholz.com")
	void EmailOfRecord1017() {
		assertEquals("fausto@kylholz.com", customers.get(1016).getEmail());
	}

	@Test
	@DisplayName("Record 1017: Web is http://www.faustokylholz.com")
	void WebOfRecord1017() {
		assertEquals("http://www.faustokylholz.com", customers.get(1016).getWeb());
	}
}
