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

@Tag("48")
class Record_3312 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3312: FirstName is Jessica")
	void FirstNameOfRecord3312() {
		assertEquals("Jessica", customers.get(3311).getFirstName());
	}

	@Test
	@DisplayName("Record 3312: LastName is Mynzer")
	void LastNameOfRecord3312() {
		assertEquals("Mynzer", customers.get(3311).getLastName());
	}

	@Test
	@DisplayName("Record 3312: Company is Pats Secretarial Services")
	void CompanyOfRecord3312() {
		assertEquals("Pats Secretarial Services", customers.get(3311).getCompany());
	}

	@Test
	@DisplayName("Record 3312: Address is 3232 Santa Monica Blvd")
	void AddressOfRecord3312() {
		assertEquals("3232 Santa Monica Blvd", customers.get(3311).getAddress());
	}

	@Test
	@DisplayName("Record 3312: City is Santa Monica")
	void CityOfRecord3312() {
		assertEquals("Santa Monica", customers.get(3311).getCity());
	}

	@Test
	@DisplayName("Record 3312: County is Los Angeles")
	void CountyOfRecord3312() {
		assertEquals("Los Angeles", customers.get(3311).getCounty());
	}

	@Test
	@DisplayName("Record 3312: State is CA")
	void StateOfRecord3312() {
		assertEquals("CA", customers.get(3311).getState());
	}

	@Test
	@DisplayName("Record 3312: ZIP is 90404")
	void ZIPOfRecord3312() {
		assertEquals("90404", customers.get(3311).getZIP());
	}

	@Test
	@DisplayName("Record 3312: Phone is 310-828-6411")
	void PhoneOfRecord3312() {
		assertEquals("310-828-6411", customers.get(3311).getPhone());
	}

	@Test
	@DisplayName("Record 3312: Fax is 310-828-7671")
	void FaxOfRecord3312() {
		assertEquals("310-828-7671", customers.get(3311).getFax());
	}

	@Test
	@DisplayName("Record 3312: Email is jessica@mynzer.com")
	void EmailOfRecord3312() {
		assertEquals("jessica@mynzer.com", customers.get(3311).getEmail());
	}

	@Test
	@DisplayName("Record 3312: Web is http://www.jessicamynzer.com")
	void WebOfRecord3312() {
		assertEquals("http://www.jessicamynzer.com", customers.get(3311).getWeb());
	}
}
