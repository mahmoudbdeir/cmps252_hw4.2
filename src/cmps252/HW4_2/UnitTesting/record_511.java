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

@Tag("47")
class Record_511 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 511: FirstName is Corinne")
	void FirstNameOfRecord511() {
		assertEquals("Corinne", customers.get(510).getFirstName());
	}

	@Test
	@DisplayName("Record 511: LastName is Langon")
	void LastNameOfRecord511() {
		assertEquals("Langon", customers.get(510).getLastName());
	}

	@Test
	@DisplayName("Record 511: Company is Dorgan, John R Esq")
	void CompanyOfRecord511() {
		assertEquals("Dorgan, John R Esq", customers.get(510).getCompany());
	}

	@Test
	@DisplayName("Record 511: Address is 2860 State Route 10")
	void AddressOfRecord511() {
		assertEquals("2860 State Route 10", customers.get(510).getAddress());
	}

	@Test
	@DisplayName("Record 511: City is Morris Plains")
	void CityOfRecord511() {
		assertEquals("Morris Plains", customers.get(510).getCity());
	}

	@Test
	@DisplayName("Record 511: County is Morris")
	void CountyOfRecord511() {
		assertEquals("Morris", customers.get(510).getCounty());
	}

	@Test
	@DisplayName("Record 511: State is NJ")
	void StateOfRecord511() {
		assertEquals("NJ", customers.get(510).getState());
	}

	@Test
	@DisplayName("Record 511: ZIP is 7950")
	void ZIPOfRecord511() {
		assertEquals("7950", customers.get(510).getZIP());
	}

	@Test
	@DisplayName("Record 511: Phone is 973-540-2830")
	void PhoneOfRecord511() {
		assertEquals("973-540-2830", customers.get(510).getPhone());
	}

	@Test
	@DisplayName("Record 511: Fax is 973-540-8959")
	void FaxOfRecord511() {
		assertEquals("973-540-8959", customers.get(510).getFax());
	}

	@Test
	@DisplayName("Record 511: Email is corinne@langon.com")
	void EmailOfRecord511() {
		assertEquals("corinne@langon.com", customers.get(510).getEmail());
	}

	@Test
	@DisplayName("Record 511: Web is http://www.corinnelangon.com")
	void WebOfRecord511() {
		assertEquals("http://www.corinnelangon.com", customers.get(510).getWeb());
	}
}
