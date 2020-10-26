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

@Tag("13")
class Record_95 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 95: FirstName is Eusebio")
	void FirstNameOfRecord95() {
		assertEquals("Eusebio", customers.get(94).getFirstName());
	}

	@Test
	@DisplayName("Record 95: LastName is Mchaney")
	void LastNameOfRecord95() {
		assertEquals("Mchaney", customers.get(94).getLastName());
	}

	@Test
	@DisplayName("Record 95: Company is Orr, E Wycliffe Esq")
	void CompanyOfRecord95() {
		assertEquals("Orr, E Wycliffe Esq", customers.get(94).getCompany());
	}

	@Test
	@DisplayName("Record 95: Address is 2817 Arts St")
	void AddressOfRecord95() {
		assertEquals("2817 Arts St", customers.get(94).getAddress());
	}

	@Test
	@DisplayName("Record 95: City is New Orleans")
	void CityOfRecord95() {
		assertEquals("New Orleans", customers.get(94).getCity());
	}

	@Test
	@DisplayName("Record 95: County is Orleans")
	void CountyOfRecord95() {
		assertEquals("Orleans", customers.get(94).getCounty());
	}

	@Test
	@DisplayName("Record 95: State is LA")
	void StateOfRecord95() {
		assertEquals("LA", customers.get(94).getState());
	}

	@Test
	@DisplayName("Record 95: ZIP is 70122")
	void ZIPOfRecord95() {
		assertEquals("70122", customers.get(94).getZIP());
	}

	@Test
	@DisplayName("Record 95: Phone is 504-944-6962")
	void PhoneOfRecord95() {
		assertEquals("504-944-6962", customers.get(94).getPhone());
	}

	@Test
	@DisplayName("Record 95: Fax is 504-944-5371")
	void FaxOfRecord95() {
		assertEquals("504-944-5371", customers.get(94).getFax());
	}

	@Test
	@DisplayName("Record 95: Email is eusebio@mchaney.com")
	void EmailOfRecord95() {
		assertEquals("eusebio@mchaney.com", customers.get(94).getEmail());
	}

	@Test
	@DisplayName("Record 95: Web is http://www.eusebiomchaney.com")
	void WebOfRecord95() {
		assertEquals("http://www.eusebiomchaney.com", customers.get(94).getWeb());
	}
}
