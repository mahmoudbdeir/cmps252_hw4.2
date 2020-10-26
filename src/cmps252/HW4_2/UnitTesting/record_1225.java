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

@Tag("3")
class Record_1225 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1225: FirstName is Eloise")
	void FirstNameOfRecord1225() {
		assertEquals("Eloise", customers.get(1224).getFirstName());
	}

	@Test
	@DisplayName("Record 1225: LastName is Dimucci")
	void LastNameOfRecord1225() {
		assertEquals("Dimucci", customers.get(1224).getLastName());
	}

	@Test
	@DisplayName("Record 1225: Company is Iomega")
	void CompanyOfRecord1225() {
		assertEquals("Iomega", customers.get(1224).getCompany());
	}

	@Test
	@DisplayName("Record 1225: Address is 68 Green St")
	void AddressOfRecord1225() {
		assertEquals("68 Green St", customers.get(1224).getAddress());
	}

	@Test
	@DisplayName("Record 1225: City is Warner Robins")
	void CityOfRecord1225() {
		assertEquals("Warner Robins", customers.get(1224).getCity());
	}

	@Test
	@DisplayName("Record 1225: County is Houston")
	void CountyOfRecord1225() {
		assertEquals("Houston", customers.get(1224).getCounty());
	}

	@Test
	@DisplayName("Record 1225: State is GA")
	void StateOfRecord1225() {
		assertEquals("GA", customers.get(1224).getState());
	}

	@Test
	@DisplayName("Record 1225: ZIP is 31093")
	void ZIPOfRecord1225() {
		assertEquals("31093", customers.get(1224).getZIP());
	}

	@Test
	@DisplayName("Record 1225: Phone is 478-866-9443")
	void PhoneOfRecord1225() {
		assertEquals("478-866-9443", customers.get(1224).getPhone());
	}

	@Test
	@DisplayName("Record 1225: Fax is 478-866-4218")
	void FaxOfRecord1225() {
		assertEquals("478-866-4218", customers.get(1224).getFax());
	}

	@Test
	@DisplayName("Record 1225: Email is eloise@dimucci.com")
	void EmailOfRecord1225() {
		assertEquals("eloise@dimucci.com", customers.get(1224).getEmail());
	}

	@Test
	@DisplayName("Record 1225: Web is http://www.eloisedimucci.com")
	void WebOfRecord1225() {
		assertEquals("http://www.eloisedimucci.com", customers.get(1224).getWeb());
	}
}
