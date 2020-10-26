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
class Record_1628 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1628: FirstName is Everett")
	void FirstNameOfRecord1628() {
		assertEquals("Everett", customers.get(1627).getFirstName());
	}

	@Test
	@DisplayName("Record 1628: LastName is Achilles")
	void LastNameOfRecord1628() {
		assertEquals("Achilles", customers.get(1627).getLastName());
	}

	@Test
	@DisplayName("Record 1628: Company is Buchanan, John B Esq")
	void CompanyOfRecord1628() {
		assertEquals("Buchanan, John B Esq", customers.get(1627).getCompany());
	}

	@Test
	@DisplayName("Record 1628: Address is 15 Troy Hills Rd")
	void AddressOfRecord1628() {
		assertEquals("15 Troy Hills Rd", customers.get(1627).getAddress());
	}

	@Test
	@DisplayName("Record 1628: City is Whippany")
	void CityOfRecord1628() {
		assertEquals("Whippany", customers.get(1627).getCity());
	}

	@Test
	@DisplayName("Record 1628: County is Morris")
	void CountyOfRecord1628() {
		assertEquals("Morris", customers.get(1627).getCounty());
	}

	@Test
	@DisplayName("Record 1628: State is NJ")
	void StateOfRecord1628() {
		assertEquals("NJ", customers.get(1627).getState());
	}

	@Test
	@DisplayName("Record 1628: ZIP is 7981")
	void ZIPOfRecord1628() {
		assertEquals("7981", customers.get(1627).getZIP());
	}

	@Test
	@DisplayName("Record 1628: Phone is 973-887-9594")
	void PhoneOfRecord1628() {
		assertEquals("973-887-9594", customers.get(1627).getPhone());
	}

	@Test
	@DisplayName("Record 1628: Fax is 973-887-7537")
	void FaxOfRecord1628() {
		assertEquals("973-887-7537", customers.get(1627).getFax());
	}

	@Test
	@DisplayName("Record 1628: Email is everett@achilles.com")
	void EmailOfRecord1628() {
		assertEquals("everett@achilles.com", customers.get(1627).getEmail());
	}

	@Test
	@DisplayName("Record 1628: Web is http://www.everettachilles.com")
	void WebOfRecord1628() {
		assertEquals("http://www.everettachilles.com", customers.get(1627).getWeb());
	}
}
