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

@Tag("40")
class Record_3156 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3156: FirstName is Monika")
	void FirstNameOfRecord3156() {
		assertEquals("Monika", customers.get(3155).getFirstName());
	}

	@Test
	@DisplayName("Record 3156: LastName is Arostegui")
	void LastNameOfRecord3156() {
		assertEquals("Arostegui", customers.get(3155).getLastName());
	}

	@Test
	@DisplayName("Record 3156: Company is W L S Stamping Co")
	void CompanyOfRecord3156() {
		assertEquals("W L S Stamping Co", customers.get(3155).getCompany());
	}

	@Test
	@DisplayName("Record 3156: Address is 5750 Labath Ave")
	void AddressOfRecord3156() {
		assertEquals("5750 Labath Ave", customers.get(3155).getAddress());
	}

	@Test
	@DisplayName("Record 3156: City is Rohnert Park")
	void CityOfRecord3156() {
		assertEquals("Rohnert Park", customers.get(3155).getCity());
	}

	@Test
	@DisplayName("Record 3156: County is Sonoma")
	void CountyOfRecord3156() {
		assertEquals("Sonoma", customers.get(3155).getCounty());
	}

	@Test
	@DisplayName("Record 3156: State is CA")
	void StateOfRecord3156() {
		assertEquals("CA", customers.get(3155).getState());
	}

	@Test
	@DisplayName("Record 3156: ZIP is 94928")
	void ZIPOfRecord3156() {
		assertEquals("94928", customers.get(3155).getZIP());
	}

	@Test
	@DisplayName("Record 3156: Phone is 707-588-1724")
	void PhoneOfRecord3156() {
		assertEquals("707-588-1724", customers.get(3155).getPhone());
	}

	@Test
	@DisplayName("Record 3156: Fax is 707-588-2911")
	void FaxOfRecord3156() {
		assertEquals("707-588-2911", customers.get(3155).getFax());
	}

	@Test
	@DisplayName("Record 3156: Email is monika@arostegui.com")
	void EmailOfRecord3156() {
		assertEquals("monika@arostegui.com", customers.get(3155).getEmail());
	}

	@Test
	@DisplayName("Record 3156: Web is http://www.monikaarostegui.com")
	void WebOfRecord3156() {
		assertEquals("http://www.monikaarostegui.com", customers.get(3155).getWeb());
	}
}
