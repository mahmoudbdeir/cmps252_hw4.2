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

@Tag("10")
class Record_4027 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4027: FirstName is Renaldo")
	void FirstNameOfRecord4027() {
		assertEquals("Renaldo", customers.get(4026).getFirstName());
	}

	@Test
	@DisplayName("Record 4027: LastName is Din")
	void LastNameOfRecord4027() {
		assertEquals("Din", customers.get(4026).getLastName());
	}

	@Test
	@DisplayName("Record 4027: Company is Marble Restoration Inc")
	void CompanyOfRecord4027() {
		assertEquals("Marble Restoration Inc", customers.get(4026).getCompany());
	}

	@Test
	@DisplayName("Record 4027: Address is 182 Lund Farm Way")
	void AddressOfRecord4027() {
		assertEquals("182 Lund Farm Way", customers.get(4026).getAddress());
	}

	@Test
	@DisplayName("Record 4027: City is Brewster")
	void CityOfRecord4027() {
		assertEquals("Brewster", customers.get(4026).getCity());
	}

	@Test
	@DisplayName("Record 4027: County is Barnstable")
	void CountyOfRecord4027() {
		assertEquals("Barnstable", customers.get(4026).getCounty());
	}

	@Test
	@DisplayName("Record 4027: State is MA")
	void StateOfRecord4027() {
		assertEquals("MA", customers.get(4026).getState());
	}

	@Test
	@DisplayName("Record 4027: ZIP is 2631")
	void ZIPOfRecord4027() {
		assertEquals("2631", customers.get(4026).getZIP());
	}

	@Test
	@DisplayName("Record 4027: Phone is 508-896-6786")
	void PhoneOfRecord4027() {
		assertEquals("508-896-6786", customers.get(4026).getPhone());
	}

	@Test
	@DisplayName("Record 4027: Fax is 508-896-6594")
	void FaxOfRecord4027() {
		assertEquals("508-896-6594", customers.get(4026).getFax());
	}

	@Test
	@DisplayName("Record 4027: Email is renaldo@din.com")
	void EmailOfRecord4027() {
		assertEquals("renaldo@din.com", customers.get(4026).getEmail());
	}

	@Test
	@DisplayName("Record 4027: Web is http://www.renaldodin.com")
	void WebOfRecord4027() {
		assertEquals("http://www.renaldodin.com", customers.get(4026).getWeb());
	}
}
