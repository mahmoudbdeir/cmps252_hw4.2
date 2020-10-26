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

@Tag("19")
class Record_1307 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1307: FirstName is Nyl")
	void FirstNameOfRecord1307() {
		assertEquals("Nyl", customers.get(1306).getFirstName());
	}

	@Test
	@DisplayName("Record 1307: LastName is Pizana")
	void LastNameOfRecord1307() {
		assertEquals("Pizana", customers.get(1306).getLastName());
	}

	@Test
	@DisplayName("Record 1307: Company is Wyner, Michael P Esq")
	void CompanyOfRecord1307() {
		assertEquals("Wyner, Michael P Esq", customers.get(1306).getCompany());
	}

	@Test
	@DisplayName("Record 1307: Address is 840 Bond St")
	void AddressOfRecord1307() {
		assertEquals("840 Bond St", customers.get(1306).getAddress());
	}

	@Test
	@DisplayName("Record 1307: City is Elizabeth")
	void CityOfRecord1307() {
		assertEquals("Elizabeth", customers.get(1306).getCity());
	}

	@Test
	@DisplayName("Record 1307: County is Union")
	void CountyOfRecord1307() {
		assertEquals("Union", customers.get(1306).getCounty());
	}

	@Test
	@DisplayName("Record 1307: State is NJ")
	void StateOfRecord1307() {
		assertEquals("NJ", customers.get(1306).getState());
	}

	@Test
	@DisplayName("Record 1307: ZIP is 7201")
	void ZIPOfRecord1307() {
		assertEquals("7201", customers.get(1306).getZIP());
	}

	@Test
	@DisplayName("Record 1307: Phone is 908-353-6691")
	void PhoneOfRecord1307() {
		assertEquals("908-353-6691", customers.get(1306).getPhone());
	}

	@Test
	@DisplayName("Record 1307: Fax is 908-353-5874")
	void FaxOfRecord1307() {
		assertEquals("908-353-5874", customers.get(1306).getFax());
	}

	@Test
	@DisplayName("Record 1307: Email is nyl@pizana.com")
	void EmailOfRecord1307() {
		assertEquals("nyl@pizana.com", customers.get(1306).getEmail());
	}

	@Test
	@DisplayName("Record 1307: Web is http://www.nylpizana.com")
	void WebOfRecord1307() {
		assertEquals("http://www.nylpizana.com", customers.get(1306).getWeb());
	}
}
