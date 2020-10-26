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

@Tag("4")
class Record_3053 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3053: FirstName is Brittney")
	void FirstNameOfRecord3053() {
		assertEquals("Brittney", customers.get(3052).getFirstName());
	}

	@Test
	@DisplayName("Record 3053: LastName is Simzer")
	void LastNameOfRecord3053() {
		assertEquals("Simzer", customers.get(3052).getLastName());
	}

	@Test
	@DisplayName("Record 3053: Company is Richmond Hill Inn")
	void CompanyOfRecord3053() {
		assertEquals("Richmond Hill Inn", customers.get(3052).getCompany());
	}

	@Test
	@DisplayName("Record 3053: Address is 800 W Airport Fwy")
	void AddressOfRecord3053() {
		assertEquals("800 W Airport Fwy", customers.get(3052).getAddress());
	}

	@Test
	@DisplayName("Record 3053: City is Irving")
	void CityOfRecord3053() {
		assertEquals("Irving", customers.get(3052).getCity());
	}

	@Test
	@DisplayName("Record 3053: County is Dallas")
	void CountyOfRecord3053() {
		assertEquals("Dallas", customers.get(3052).getCounty());
	}

	@Test
	@DisplayName("Record 3053: State is TX")
	void StateOfRecord3053() {
		assertEquals("TX", customers.get(3052).getState());
	}

	@Test
	@DisplayName("Record 3053: ZIP is 75062")
	void ZIPOfRecord3053() {
		assertEquals("75062", customers.get(3052).getZIP());
	}

	@Test
	@DisplayName("Record 3053: Phone is 972-445-3693")
	void PhoneOfRecord3053() {
		assertEquals("972-445-3693", customers.get(3052).getPhone());
	}

	@Test
	@DisplayName("Record 3053: Fax is 972-445-5902")
	void FaxOfRecord3053() {
		assertEquals("972-445-5902", customers.get(3052).getFax());
	}

	@Test
	@DisplayName("Record 3053: Email is brittney@simzer.com")
	void EmailOfRecord3053() {
		assertEquals("brittney@simzer.com", customers.get(3052).getEmail());
	}

	@Test
	@DisplayName("Record 3053: Web is http://www.brittneysimzer.com")
	void WebOfRecord3053() {
		assertEquals("http://www.brittneysimzer.com", customers.get(3052).getWeb());
	}
}
