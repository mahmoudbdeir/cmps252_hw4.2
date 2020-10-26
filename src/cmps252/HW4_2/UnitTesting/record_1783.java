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

@Tag("4")
class Record_1783 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1783: FirstName is Lynne")
	void FirstNameOfRecord1783() {
		assertEquals("Lynne", customers.get(1782).getFirstName());
	}

	@Test
	@DisplayName("Record 1783: LastName is Medick")
	void LastNameOfRecord1783() {
		assertEquals("Medick", customers.get(1782).getLastName());
	}

	@Test
	@DisplayName("Record 1783: Company is Kasbar National Industries")
	void CompanyOfRecord1783() {
		assertEquals("Kasbar National Industries", customers.get(1782).getCompany());
	}

	@Test
	@DisplayName("Record 1783: Address is 417 Frenchmen St")
	void AddressOfRecord1783() {
		assertEquals("417 Frenchmen St", customers.get(1782).getAddress());
	}

	@Test
	@DisplayName("Record 1783: City is New Orleans")
	void CityOfRecord1783() {
		assertEquals("New Orleans", customers.get(1782).getCity());
	}

	@Test
	@DisplayName("Record 1783: County is Orleans")
	void CountyOfRecord1783() {
		assertEquals("Orleans", customers.get(1782).getCounty());
	}

	@Test
	@DisplayName("Record 1783: State is LA")
	void StateOfRecord1783() {
		assertEquals("LA", customers.get(1782).getState());
	}

	@Test
	@DisplayName("Record 1783: ZIP is 70116")
	void ZIPOfRecord1783() {
		assertEquals("70116", customers.get(1782).getZIP());
	}

	@Test
	@DisplayName("Record 1783: Phone is 504-948-7211")
	void PhoneOfRecord1783() {
		assertEquals("504-948-7211", customers.get(1782).getPhone());
	}

	@Test
	@DisplayName("Record 1783: Fax is 504-948-7738")
	void FaxOfRecord1783() {
		assertEquals("504-948-7738", customers.get(1782).getFax());
	}

	@Test
	@DisplayName("Record 1783: Email is lynne@medick.com")
	void EmailOfRecord1783() {
		assertEquals("lynne@medick.com", customers.get(1782).getEmail());
	}

	@Test
	@DisplayName("Record 1783: Web is http://www.lynnemedick.com")
	void WebOfRecord1783() {
		assertEquals("http://www.lynnemedick.com", customers.get(1782).getWeb());
	}
}
