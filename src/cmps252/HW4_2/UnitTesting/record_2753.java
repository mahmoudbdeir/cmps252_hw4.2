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

@Tag("29")
class Record_2753 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2753: FirstName is Weston")
	void FirstNameOfRecord2753() {
		assertEquals("Weston", customers.get(2752).getFirstName());
	}

	@Test
	@DisplayName("Record 2753: LastName is Shoaf")
	void LastNameOfRecord2753() {
		assertEquals("Shoaf", customers.get(2752).getLastName());
	}

	@Test
	@DisplayName("Record 2753: Company is Anselmo, Christopher A Pa")
	void CompanyOfRecord2753() {
		assertEquals("Anselmo, Christopher A Pa", customers.get(2752).getCompany());
	}

	@Test
	@DisplayName("Record 2753: Address is 5517 N Highway 67 Th")
	void AddressOfRecord2753() {
		assertEquals("5517 N Highway 67 Th", customers.get(2752).getAddress());
	}

	@Test
	@DisplayName("Record 2753: City is Florissant")
	void CityOfRecord2753() {
		assertEquals("Florissant", customers.get(2752).getCity());
	}

	@Test
	@DisplayName("Record 2753: County is Saint Louis")
	void CountyOfRecord2753() {
		assertEquals("Saint Louis", customers.get(2752).getCounty());
	}

	@Test
	@DisplayName("Record 2753: State is MO")
	void StateOfRecord2753() {
		assertEquals("MO", customers.get(2752).getState());
	}

	@Test
	@DisplayName("Record 2753: ZIP is 63034")
	void ZIPOfRecord2753() {
		assertEquals("63034", customers.get(2752).getZIP());
	}

	@Test
	@DisplayName("Record 2753: Phone is 314-741-3591")
	void PhoneOfRecord2753() {
		assertEquals("314-741-3591", customers.get(2752).getPhone());
	}

	@Test
	@DisplayName("Record 2753: Fax is 314-741-6735")
	void FaxOfRecord2753() {
		assertEquals("314-741-6735", customers.get(2752).getFax());
	}

	@Test
	@DisplayName("Record 2753: Email is weston@shoaf.com")
	void EmailOfRecord2753() {
		assertEquals("weston@shoaf.com", customers.get(2752).getEmail());
	}

	@Test
	@DisplayName("Record 2753: Web is http://www.westonshoaf.com")
	void WebOfRecord2753() {
		assertEquals("http://www.westonshoaf.com", customers.get(2752).getWeb());
	}
}
