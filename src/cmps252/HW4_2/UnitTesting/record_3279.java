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

@Tag("31")
class Record_3279 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3279: FirstName is Roscoe")
	void FirstNameOfRecord3279() {
		assertEquals("Roscoe", customers.get(3278).getFirstName());
	}

	@Test
	@DisplayName("Record 3279: LastName is Keadle")
	void LastNameOfRecord3279() {
		assertEquals("Keadle", customers.get(3278).getLastName());
	}

	@Test
	@DisplayName("Record 3279: Company is William B Allen Supply Co Inc")
	void CompanyOfRecord3279() {
		assertEquals("William B Allen Supply Co Inc", customers.get(3278).getCompany());
	}

	@Test
	@DisplayName("Record 3279: Address is 1860 Nw 95th St")
	void AddressOfRecord3279() {
		assertEquals("1860 Nw 95th St", customers.get(3278).getAddress());
	}

	@Test
	@DisplayName("Record 3279: City is Miami")
	void CityOfRecord3279() {
		assertEquals("Miami", customers.get(3278).getCity());
	}

	@Test
	@DisplayName("Record 3279: County is Miami-Dade")
	void CountyOfRecord3279() {
		assertEquals("Miami-Dade", customers.get(3278).getCounty());
	}

	@Test
	@DisplayName("Record 3279: State is FL")
	void StateOfRecord3279() {
		assertEquals("FL", customers.get(3278).getState());
	}

	@Test
	@DisplayName("Record 3279: ZIP is 33147")
	void ZIPOfRecord3279() {
		assertEquals("33147", customers.get(3278).getZIP());
	}

	@Test
	@DisplayName("Record 3279: Phone is 305-691-7513")
	void PhoneOfRecord3279() {
		assertEquals("305-691-7513", customers.get(3278).getPhone());
	}

	@Test
	@DisplayName("Record 3279: Fax is 305-691-9236")
	void FaxOfRecord3279() {
		assertEquals("305-691-9236", customers.get(3278).getFax());
	}

	@Test
	@DisplayName("Record 3279: Email is roscoe@keadle.com")
	void EmailOfRecord3279() {
		assertEquals("roscoe@keadle.com", customers.get(3278).getEmail());
	}

	@Test
	@DisplayName("Record 3279: Web is http://www.roscoekeadle.com")
	void WebOfRecord3279() {
		assertEquals("http://www.roscoekeadle.com", customers.get(3278).getWeb());
	}
}
