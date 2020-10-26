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

@Tag("0")
class Record_3267 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3267: FirstName is Kristie")
	void FirstNameOfRecord3267() {
		assertEquals("Kristie", customers.get(3266).getFirstName());
	}

	@Test
	@DisplayName("Record 3267: LastName is Marchessault")
	void LastNameOfRecord3267() {
		assertEquals("Marchessault", customers.get(3266).getLastName());
	}

	@Test
	@DisplayName("Record 3267: Company is Angerosa, John Esq")
	void CompanyOfRecord3267() {
		assertEquals("Angerosa, John Esq", customers.get(3266).getCompany());
	}

	@Test
	@DisplayName("Record 3267: Address is 17 N 10th St")
	void AddressOfRecord3267() {
		assertEquals("17 N 10th St", customers.get(3266).getAddress());
	}

	@Test
	@DisplayName("Record 3267: City is Columbia")
	void CityOfRecord3267() {
		assertEquals("Columbia", customers.get(3266).getCity());
	}

	@Test
	@DisplayName("Record 3267: County is Boone")
	void CountyOfRecord3267() {
		assertEquals("Boone", customers.get(3266).getCounty());
	}

	@Test
	@DisplayName("Record 3267: State is MO")
	void StateOfRecord3267() {
		assertEquals("MO", customers.get(3266).getState());
	}

	@Test
	@DisplayName("Record 3267: ZIP is 65201")
	void ZIPOfRecord3267() {
		assertEquals("65201", customers.get(3266).getZIP());
	}

	@Test
	@DisplayName("Record 3267: Phone is 573-443-4457")
	void PhoneOfRecord3267() {
		assertEquals("573-443-4457", customers.get(3266).getPhone());
	}

	@Test
	@DisplayName("Record 3267: Fax is 573-443-7654")
	void FaxOfRecord3267() {
		assertEquals("573-443-7654", customers.get(3266).getFax());
	}

	@Test
	@DisplayName("Record 3267: Email is kristie@marchessault.com")
	void EmailOfRecord3267() {
		assertEquals("kristie@marchessault.com", customers.get(3266).getEmail());
	}

	@Test
	@DisplayName("Record 3267: Web is http://www.kristiemarchessault.com")
	void WebOfRecord3267() {
		assertEquals("http://www.kristiemarchessault.com", customers.get(3266).getWeb());
	}
}
