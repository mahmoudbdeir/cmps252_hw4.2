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
class Record_2508 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2508: FirstName is Brian")
	void FirstNameOfRecord2508() {
		assertEquals("Brian", customers.get(2507).getFirstName());
	}

	@Test
	@DisplayName("Record 2508: LastName is Manquero")
	void LastNameOfRecord2508() {
		assertEquals("Manquero", customers.get(2507).getLastName());
	}

	@Test
	@DisplayName("Record 2508: Company is Detroit City Dairy Inc")
	void CompanyOfRecord2508() {
		assertEquals("Detroit City Dairy Inc", customers.get(2507).getCompany());
	}

	@Test
	@DisplayName("Record 2508: Address is 7th Aven")
	void AddressOfRecord2508() {
		assertEquals("7th Aven", customers.get(2507).getAddress());
	}

	@Test
	@DisplayName("Record 2508: City is East Meadow")
	void CityOfRecord2508() {
		assertEquals("East Meadow", customers.get(2507).getCity());
	}

	@Test
	@DisplayName("Record 2508: County is Nassau")
	void CountyOfRecord2508() {
		assertEquals("Nassau", customers.get(2507).getCounty());
	}

	@Test
	@DisplayName("Record 2508: State is NY")
	void StateOfRecord2508() {
		assertEquals("NY", customers.get(2507).getState());
	}

	@Test
	@DisplayName("Record 2508: ZIP is 11554")
	void ZIPOfRecord2508() {
		assertEquals("11554", customers.get(2507).getZIP());
	}

	@Test
	@DisplayName("Record 2508: Phone is 516-783-9180")
	void PhoneOfRecord2508() {
		assertEquals("516-783-9180", customers.get(2507).getPhone());
	}

	@Test
	@DisplayName("Record 2508: Fax is 516-783-6297")
	void FaxOfRecord2508() {
		assertEquals("516-783-6297", customers.get(2507).getFax());
	}

	@Test
	@DisplayName("Record 2508: Email is brian@manquero.com")
	void EmailOfRecord2508() {
		assertEquals("brian@manquero.com", customers.get(2507).getEmail());
	}

	@Test
	@DisplayName("Record 2508: Web is http://www.brianmanquero.com")
	void WebOfRecord2508() {
		assertEquals("http://www.brianmanquero.com", customers.get(2507).getWeb());
	}
}
