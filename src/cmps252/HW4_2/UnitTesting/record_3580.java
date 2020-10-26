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

@Tag("42")
class Record_3580 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3580: FirstName is Chantel")
	void FirstNameOfRecord3580() {
		assertEquals("Chantel", customers.get(3579).getFirstName());
	}

	@Test
	@DisplayName("Record 3580: LastName is Mcqueen")
	void LastNameOfRecord3580() {
		assertEquals("Mcqueen", customers.get(3579).getLastName());
	}

	@Test
	@DisplayName("Record 3580: Company is Center For Rehab At Bmc")
	void CompanyOfRecord3580() {
		assertEquals("Center For Rehab At Bmc", customers.get(3579).getCompany());
	}

	@Test
	@DisplayName("Record 3580: Address is 268 E 4th St")
	void AddressOfRecord3580() {
		assertEquals("268 E 4th St", customers.get(3579).getAddress());
	}

	@Test
	@DisplayName("Record 3580: City is Ashland")
	void CityOfRecord3580() {
		assertEquals("Ashland", customers.get(3579).getCity());
	}

	@Test
	@DisplayName("Record 3580: County is Ashland")
	void CountyOfRecord3580() {
		assertEquals("Ashland", customers.get(3579).getCounty());
	}

	@Test
	@DisplayName("Record 3580: State is OH")
	void StateOfRecord3580() {
		assertEquals("OH", customers.get(3579).getState());
	}

	@Test
	@DisplayName("Record 3580: ZIP is 44805")
	void ZIPOfRecord3580() {
		assertEquals("44805", customers.get(3579).getZIP());
	}

	@Test
	@DisplayName("Record 3580: Phone is 419-281-2876")
	void PhoneOfRecord3580() {
		assertEquals("419-281-2876", customers.get(3579).getPhone());
	}

	@Test
	@DisplayName("Record 3580: Fax is 419-281-4623")
	void FaxOfRecord3580() {
		assertEquals("419-281-4623", customers.get(3579).getFax());
	}

	@Test
	@DisplayName("Record 3580: Email is chantel@mcqueen.com")
	void EmailOfRecord3580() {
		assertEquals("chantel@mcqueen.com", customers.get(3579).getEmail());
	}

	@Test
	@DisplayName("Record 3580: Web is http://www.chantelmcqueen.com")
	void WebOfRecord3580() {
		assertEquals("http://www.chantelmcqueen.com", customers.get(3579).getWeb());
	}
}
