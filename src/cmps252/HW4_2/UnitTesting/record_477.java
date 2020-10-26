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

@Tag("36")
class Record_477 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 477: FirstName is Valeria")
	void FirstNameOfRecord477() {
		assertEquals("Valeria", customers.get(476).getFirstName());
	}

	@Test
	@DisplayName("Record 477: LastName is Kanniard")
	void LastNameOfRecord477() {
		assertEquals("Kanniard", customers.get(476).getLastName());
	}

	@Test
	@DisplayName("Record 477: Company is D A Daniel Ross Acctncy Corp")
	void CompanyOfRecord477() {
		assertEquals("D A Daniel Ross Acctncy Corp", customers.get(476).getCompany());
	}

	@Test
	@DisplayName("Record 477: Address is 405 West St")
	void AddressOfRecord477() {
		assertEquals("405 West St", customers.get(476).getAddress());
	}

	@Test
	@DisplayName("Record 477: City is Walpole")
	void CityOfRecord477() {
		assertEquals("Walpole", customers.get(476).getCity());
	}

	@Test
	@DisplayName("Record 477: County is Norfolk")
	void CountyOfRecord477() {
		assertEquals("Norfolk", customers.get(476).getCounty());
	}

	@Test
	@DisplayName("Record 477: State is MA")
	void StateOfRecord477() {
		assertEquals("MA", customers.get(476).getState());
	}

	@Test
	@DisplayName("Record 477: ZIP is 2081")
	void ZIPOfRecord477() {
		assertEquals("2081", customers.get(476).getZIP());
	}

	@Test
	@DisplayName("Record 477: Phone is 508-660-4920")
	void PhoneOfRecord477() {
		assertEquals("508-660-4920", customers.get(476).getPhone());
	}

	@Test
	@DisplayName("Record 477: Fax is 508-660-8289")
	void FaxOfRecord477() {
		assertEquals("508-660-8289", customers.get(476).getFax());
	}

	@Test
	@DisplayName("Record 477: Email is valeria@kanniard.com")
	void EmailOfRecord477() {
		assertEquals("valeria@kanniard.com", customers.get(476).getEmail());
	}

	@Test
	@DisplayName("Record 477: Web is http://www.valeriakanniard.com")
	void WebOfRecord477() {
		assertEquals("http://www.valeriakanniard.com", customers.get(476).getWeb());
	}
}
