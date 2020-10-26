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
class Record_2686 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2686: FirstName is Betty")
	void FirstNameOfRecord2686() {
		assertEquals("Betty", customers.get(2685).getFirstName());
	}

	@Test
	@DisplayName("Record 2686: LastName is Koener")
	void LastNameOfRecord2686() {
		assertEquals("Koener", customers.get(2685).getLastName());
	}

	@Test
	@DisplayName("Record 2686: Company is Brandt, Gail F Esq")
	void CompanyOfRecord2686() {
		assertEquals("Brandt, Gail F Esq", customers.get(2685).getCompany());
	}

	@Test
	@DisplayName("Record 2686: Address is 1990 S Bundy Dr")
	void AddressOfRecord2686() {
		assertEquals("1990 S Bundy Dr", customers.get(2685).getAddress());
	}

	@Test
	@DisplayName("Record 2686: City is Los Angeles")
	void CityOfRecord2686() {
		assertEquals("Los Angeles", customers.get(2685).getCity());
	}

	@Test
	@DisplayName("Record 2686: County is Los Angeles")
	void CountyOfRecord2686() {
		assertEquals("Los Angeles", customers.get(2685).getCounty());
	}

	@Test
	@DisplayName("Record 2686: State is CA")
	void StateOfRecord2686() {
		assertEquals("CA", customers.get(2685).getState());
	}

	@Test
	@DisplayName("Record 2686: ZIP is 90025")
	void ZIPOfRecord2686() {
		assertEquals("90025", customers.get(2685).getZIP());
	}

	@Test
	@DisplayName("Record 2686: Phone is 310-662-5794")
	void PhoneOfRecord2686() {
		assertEquals("310-662-5794", customers.get(2685).getPhone());
	}

	@Test
	@DisplayName("Record 2686: Fax is 310-662-2631")
	void FaxOfRecord2686() {
		assertEquals("310-662-2631", customers.get(2685).getFax());
	}

	@Test
	@DisplayName("Record 2686: Email is betty@koener.com")
	void EmailOfRecord2686() {
		assertEquals("betty@koener.com", customers.get(2685).getEmail());
	}

	@Test
	@DisplayName("Record 2686: Web is http://www.bettykoener.com")
	void WebOfRecord2686() {
		assertEquals("http://www.bettykoener.com", customers.get(2685).getWeb());
	}
}
