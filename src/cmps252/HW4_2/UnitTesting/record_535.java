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

@Tag("28")
class Record_535 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 535: FirstName is Garth")
	void FirstNameOfRecord535() {
		assertEquals("Garth", customers.get(534).getFirstName());
	}

	@Test
	@DisplayName("Record 535: LastName is Hendershott")
	void LastNameOfRecord535() {
		assertEquals("Hendershott", customers.get(534).getLastName());
	}

	@Test
	@DisplayName("Record 535: Company is Genealogy")
	void CompanyOfRecord535() {
		assertEquals("Genealogy", customers.get(534).getCompany());
	}

	@Test
	@DisplayName("Record 535: Address is 80 W Upper Ferry Rd")
	void AddressOfRecord535() {
		assertEquals("80 W Upper Ferry Rd", customers.get(534).getAddress());
	}

	@Test
	@DisplayName("Record 535: City is Trenton")
	void CityOfRecord535() {
		assertEquals("Trenton", customers.get(534).getCity());
	}

	@Test
	@DisplayName("Record 535: County is Mercer")
	void CountyOfRecord535() {
		assertEquals("Mercer", customers.get(534).getCounty());
	}

	@Test
	@DisplayName("Record 535: State is NJ")
	void StateOfRecord535() {
		assertEquals("NJ", customers.get(534).getState());
	}

	@Test
	@DisplayName("Record 535: ZIP is 8628")
	void ZIPOfRecord535() {
		assertEquals("8628", customers.get(534).getZIP());
	}

	@Test
	@DisplayName("Record 535: Phone is 609-585-9225")
	void PhoneOfRecord535() {
		assertEquals("609-585-9225", customers.get(534).getPhone());
	}

	@Test
	@DisplayName("Record 535: Fax is 609-585-4209")
	void FaxOfRecord535() {
		assertEquals("609-585-4209", customers.get(534).getFax());
	}

	@Test
	@DisplayName("Record 535: Email is garth@hendershott.com")
	void EmailOfRecord535() {
		assertEquals("garth@hendershott.com", customers.get(534).getEmail());
	}

	@Test
	@DisplayName("Record 535: Web is http://www.garthhendershott.com")
	void WebOfRecord535() {
		assertEquals("http://www.garthhendershott.com", customers.get(534).getWeb());
	}
}
