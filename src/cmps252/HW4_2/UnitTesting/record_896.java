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

@Tag("11")
class Record_896 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 896: FirstName is Vincenzo")
	void FirstNameOfRecord896() {
		assertEquals("Vincenzo", customers.get(895).getFirstName());
	}

	@Test
	@DisplayName("Record 896: LastName is Legendre")
	void LastNameOfRecord896() {
		assertEquals("Legendre", customers.get(895).getLastName());
	}

	@Test
	@DisplayName("Record 896: Company is Azrael, Jonathan Esq")
	void CompanyOfRecord896() {
		assertEquals("Azrael, Jonathan Esq", customers.get(895).getCompany());
	}

	@Test
	@DisplayName("Record 896: Address is 12633 Inkster Rd")
	void AddressOfRecord896() {
		assertEquals("12633 Inkster Rd", customers.get(895).getAddress());
	}

	@Test
	@DisplayName("Record 896: City is Livonia")
	void CityOfRecord896() {
		assertEquals("Livonia", customers.get(895).getCity());
	}

	@Test
	@DisplayName("Record 896: County is Wayne")
	void CountyOfRecord896() {
		assertEquals("Wayne", customers.get(895).getCounty());
	}

	@Test
	@DisplayName("Record 896: State is MI")
	void StateOfRecord896() {
		assertEquals("MI", customers.get(895).getState());
	}

	@Test
	@DisplayName("Record 896: ZIP is 48150")
	void ZIPOfRecord896() {
		assertEquals("48150", customers.get(895).getZIP());
	}

	@Test
	@DisplayName("Record 896: Phone is 734-522-2590")
	void PhoneOfRecord896() {
		assertEquals("734-522-2590", customers.get(895).getPhone());
	}

	@Test
	@DisplayName("Record 896: Fax is 734-522-8138")
	void FaxOfRecord896() {
		assertEquals("734-522-8138", customers.get(895).getFax());
	}

	@Test
	@DisplayName("Record 896: Email is vincenzo@legendre.com")
	void EmailOfRecord896() {
		assertEquals("vincenzo@legendre.com", customers.get(895).getEmail());
	}

	@Test
	@DisplayName("Record 896: Web is http://www.vincenzolegendre.com")
	void WebOfRecord896() {
		assertEquals("http://www.vincenzolegendre.com", customers.get(895).getWeb());
	}
}
