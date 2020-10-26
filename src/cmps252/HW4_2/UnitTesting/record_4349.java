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

@Tag("33")
class Record_4349 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4349: FirstName is Jamal")
	void FirstNameOfRecord4349() {
		assertEquals("Jamal", customers.get(4348).getFirstName());
	}

	@Test
	@DisplayName("Record 4349: LastName is Lanctot")
	void LastNameOfRecord4349() {
		assertEquals("Lanctot", customers.get(4348).getLastName());
	}

	@Test
	@DisplayName("Record 4349: Company is Parness, Steven K Esq")
	void CompanyOfRecord4349() {
		assertEquals("Parness, Steven K Esq", customers.get(4348).getCompany());
	}

	@Test
	@DisplayName("Record 4349: Address is 900 Veterans Blvd  #-400")
	void AddressOfRecord4349() {
		assertEquals("900 Veterans Blvd  #-400", customers.get(4348).getAddress());
	}

	@Test
	@DisplayName("Record 4349: City is Redwood City")
	void CityOfRecord4349() {
		assertEquals("Redwood City", customers.get(4348).getCity());
	}

	@Test
	@DisplayName("Record 4349: County is San Mateo")
	void CountyOfRecord4349() {
		assertEquals("San Mateo", customers.get(4348).getCounty());
	}

	@Test
	@DisplayName("Record 4349: State is CA")
	void StateOfRecord4349() {
		assertEquals("CA", customers.get(4348).getState());
	}

	@Test
	@DisplayName("Record 4349: ZIP is 94063")
	void ZIPOfRecord4349() {
		assertEquals("94063", customers.get(4348).getZIP());
	}

	@Test
	@DisplayName("Record 4349: Phone is 650-367-2088")
	void PhoneOfRecord4349() {
		assertEquals("650-367-2088", customers.get(4348).getPhone());
	}

	@Test
	@DisplayName("Record 4349: Fax is 650-367-4695")
	void FaxOfRecord4349() {
		assertEquals("650-367-4695", customers.get(4348).getFax());
	}

	@Test
	@DisplayName("Record 4349: Email is jamal@lanctot.com")
	void EmailOfRecord4349() {
		assertEquals("jamal@lanctot.com", customers.get(4348).getEmail());
	}

	@Test
	@DisplayName("Record 4349: Web is http://www.jamallanctot.com")
	void WebOfRecord4349() {
		assertEquals("http://www.jamallanctot.com", customers.get(4348).getWeb());
	}
}
