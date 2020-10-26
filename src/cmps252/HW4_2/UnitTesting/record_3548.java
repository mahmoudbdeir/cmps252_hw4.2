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
class Record_3548 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3548: FirstName is Ernesto")
	void FirstNameOfRecord3548() {
		assertEquals("Ernesto", customers.get(3547).getFirstName());
	}

	@Test
	@DisplayName("Record 3548: LastName is Neuby")
	void LastNameOfRecord3548() {
		assertEquals("Neuby", customers.get(3547).getLastName());
	}

	@Test
	@DisplayName("Record 3548: Company is Acdmy St Josephs Secondary")
	void CompanyOfRecord3548() {
		assertEquals("Acdmy St Josephs Secondary", customers.get(3547).getCompany());
	}

	@Test
	@DisplayName("Record 3548: Address is 3711 10th St")
	void AddressOfRecord3548() {
		assertEquals("3711 10th St", customers.get(3547).getAddress());
	}

	@Test
	@DisplayName("Record 3548: City is Long Island City")
	void CityOfRecord3548() {
		assertEquals("Long Island City", customers.get(3547).getCity());
	}

	@Test
	@DisplayName("Record 3548: County is Queens")
	void CountyOfRecord3548() {
		assertEquals("Queens", customers.get(3547).getCounty());
	}

	@Test
	@DisplayName("Record 3548: State is NY")
	void StateOfRecord3548() {
		assertEquals("NY", customers.get(3547).getState());
	}

	@Test
	@DisplayName("Record 3548: ZIP is 11101")
	void ZIPOfRecord3548() {
		assertEquals("11101", customers.get(3547).getZIP());
	}

	@Test
	@DisplayName("Record 3548: Phone is 718-392-4661")
	void PhoneOfRecord3548() {
		assertEquals("718-392-4661", customers.get(3547).getPhone());
	}

	@Test
	@DisplayName("Record 3548: Fax is 718-392-6797")
	void FaxOfRecord3548() {
		assertEquals("718-392-6797", customers.get(3547).getFax());
	}

	@Test
	@DisplayName("Record 3548: Email is ernesto@neuby.com")
	void EmailOfRecord3548() {
		assertEquals("ernesto@neuby.com", customers.get(3547).getEmail());
	}

	@Test
	@DisplayName("Record 3548: Web is http://www.ernestoneuby.com")
	void WebOfRecord3548() {
		assertEquals("http://www.ernestoneuby.com", customers.get(3547).getWeb());
	}
}
