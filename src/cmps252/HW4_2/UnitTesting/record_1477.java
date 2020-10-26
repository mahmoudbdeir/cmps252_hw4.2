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

@Tag("21")
class Record_1477 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1477: FirstName is Cruz")
	void FirstNameOfRecord1477() {
		assertEquals("Cruz", customers.get(1476).getFirstName());
	}

	@Test
	@DisplayName("Record 1477: LastName is Vote")
	void LastNameOfRecord1477() {
		assertEquals("Vote", customers.get(1476).getLastName());
	}

	@Test
	@DisplayName("Record 1477: Company is Stout, Roger W")
	void CompanyOfRecord1477() {
		assertEquals("Stout, Roger W", customers.get(1476).getCompany());
	}

	@Test
	@DisplayName("Record 1477: Address is 24901 Northwestern Hwy")
	void AddressOfRecord1477() {
		assertEquals("24901 Northwestern Hwy", customers.get(1476).getAddress());
	}

	@Test
	@DisplayName("Record 1477: City is Southfield")
	void CityOfRecord1477() {
		assertEquals("Southfield", customers.get(1476).getCity());
	}

	@Test
	@DisplayName("Record 1477: County is Oakland")
	void CountyOfRecord1477() {
		assertEquals("Oakland", customers.get(1476).getCounty());
	}

	@Test
	@DisplayName("Record 1477: State is MI")
	void StateOfRecord1477() {
		assertEquals("MI", customers.get(1476).getState());
	}

	@Test
	@DisplayName("Record 1477: ZIP is 48075")
	void ZIPOfRecord1477() {
		assertEquals("48075", customers.get(1476).getZIP());
	}

	@Test
	@DisplayName("Record 1477: Phone is 248-356-7966")
	void PhoneOfRecord1477() {
		assertEquals("248-356-7966", customers.get(1476).getPhone());
	}

	@Test
	@DisplayName("Record 1477: Fax is 248-356-4322")
	void FaxOfRecord1477() {
		assertEquals("248-356-4322", customers.get(1476).getFax());
	}

	@Test
	@DisplayName("Record 1477: Email is cruz@vote.com")
	void EmailOfRecord1477() {
		assertEquals("cruz@vote.com", customers.get(1476).getEmail());
	}

	@Test
	@DisplayName("Record 1477: Web is http://www.cruzvote.com")
	void WebOfRecord1477() {
		assertEquals("http://www.cruzvote.com", customers.get(1476).getWeb());
	}
}
