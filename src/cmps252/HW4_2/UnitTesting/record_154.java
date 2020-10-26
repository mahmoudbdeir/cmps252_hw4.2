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

@Tag("37")
class Record_154 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 154: FirstName is Luigi")
	void FirstNameOfRecord154() {
		assertEquals("Luigi", customers.get(153).getFirstName());
	}

	@Test
	@DisplayName("Record 154: LastName is Silvis")
	void LastNameOfRecord154() {
		assertEquals("Silvis", customers.get(153).getLastName());
	}

	@Test
	@DisplayName("Record 154: Company is Packet Facilities Inc")
	void CompanyOfRecord154() {
		assertEquals("Packet Facilities Inc", customers.get(153).getCompany());
	}

	@Test
	@DisplayName("Record 154: Address is 18153 Napa St")
	void AddressOfRecord154() {
		assertEquals("18153 Napa St", customers.get(153).getAddress());
	}

	@Test
	@DisplayName("Record 154: City is Northridge")
	void CityOfRecord154() {
		assertEquals("Northridge", customers.get(153).getCity());
	}

	@Test
	@DisplayName("Record 154: County is Los Angeles")
	void CountyOfRecord154() {
		assertEquals("Los Angeles", customers.get(153).getCounty());
	}

	@Test
	@DisplayName("Record 154: State is CA")
	void StateOfRecord154() {
		assertEquals("CA", customers.get(153).getState());
	}

	@Test
	@DisplayName("Record 154: ZIP is 91325")
	void ZIPOfRecord154() {
		assertEquals("91325", customers.get(153).getZIP());
	}

	@Test
	@DisplayName("Record 154: Phone is 818-886-7434")
	void PhoneOfRecord154() {
		assertEquals("818-886-7434", customers.get(153).getPhone());
	}

	@Test
	@DisplayName("Record 154: Fax is 818-886-1632")
	void FaxOfRecord154() {
		assertEquals("818-886-1632", customers.get(153).getFax());
	}

	@Test
	@DisplayName("Record 154: Email is luigi@silvis.com")
	void EmailOfRecord154() {
		assertEquals("luigi@silvis.com", customers.get(153).getEmail());
	}

	@Test
	@DisplayName("Record 154: Web is http://www.luigisilvis.com")
	void WebOfRecord154() {
		assertEquals("http://www.luigisilvis.com", customers.get(153).getWeb());
	}
}
