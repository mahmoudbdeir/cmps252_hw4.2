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

@Tag("32")
class Record_4325 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4325: FirstName is Marlene")
	void FirstNameOfRecord4325() {
		assertEquals("Marlene", customers.get(4324).getFirstName());
	}

	@Test
	@DisplayName("Record 4325: LastName is Caravantes")
	void LastNameOfRecord4325() {
		assertEquals("Caravantes", customers.get(4324).getLastName());
	}

	@Test
	@DisplayName("Record 4325: Company is Janney Montgomery Scott Inc")
	void CompanyOfRecord4325() {
		assertEquals("Janney Montgomery Scott Inc", customers.get(4324).getCompany());
	}

	@Test
	@DisplayName("Record 4325: Address is 850 3rd St")
	void AddressOfRecord4325() {
		assertEquals("850 3rd St", customers.get(4324).getAddress());
	}

	@Test
	@DisplayName("Record 4325: City is Santa Rosa")
	void CityOfRecord4325() {
		assertEquals("Santa Rosa", customers.get(4324).getCity());
	}

	@Test
	@DisplayName("Record 4325: County is Sonoma")
	void CountyOfRecord4325() {
		assertEquals("Sonoma", customers.get(4324).getCounty());
	}

	@Test
	@DisplayName("Record 4325: State is CA")
	void StateOfRecord4325() {
		assertEquals("CA", customers.get(4324).getState());
	}

	@Test
	@DisplayName("Record 4325: ZIP is 95404")
	void ZIPOfRecord4325() {
		assertEquals("95404", customers.get(4324).getZIP());
	}

	@Test
	@DisplayName("Record 4325: Phone is 707-575-2958")
	void PhoneOfRecord4325() {
		assertEquals("707-575-2958", customers.get(4324).getPhone());
	}

	@Test
	@DisplayName("Record 4325: Fax is 707-575-1702")
	void FaxOfRecord4325() {
		assertEquals("707-575-1702", customers.get(4324).getFax());
	}

	@Test
	@DisplayName("Record 4325: Email is marlene@caravantes.com")
	void EmailOfRecord4325() {
		assertEquals("marlene@caravantes.com", customers.get(4324).getEmail());
	}

	@Test
	@DisplayName("Record 4325: Web is http://www.marlenecaravantes.com")
	void WebOfRecord4325() {
		assertEquals("http://www.marlenecaravantes.com", customers.get(4324).getWeb());
	}
}
