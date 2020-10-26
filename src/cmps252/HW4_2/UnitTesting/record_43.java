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
class Record_43 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 43: FirstName is Oscar")
	void FirstNameOfRecord43() {
		assertEquals("Oscar", customers.get(42).getFirstName());
	}

	@Test
	@DisplayName("Record 43: LastName is Madge")
	void LastNameOfRecord43() {
		assertEquals("Madge", customers.get(42).getLastName());
	}

	@Test
	@DisplayName("Record 43: Company is Carlson, Jodie L Esq")
	void CompanyOfRecord43() {
		assertEquals("Carlson, Jodie L Esq", customers.get(42).getCompany());
	}

	@Test
	@DisplayName("Record 43: Address is 8272 Berry Ave")
	void AddressOfRecord43() {
		assertEquals("8272 Berry Ave", customers.get(42).getAddress());
	}

	@Test
	@DisplayName("Record 43: City is Sacramento")
	void CityOfRecord43() {
		assertEquals("Sacramento", customers.get(42).getCity());
	}

	@Test
	@DisplayName("Record 43: County is Sacramento")
	void CountyOfRecord43() {
		assertEquals("Sacramento", customers.get(42).getCounty());
	}

	@Test
	@DisplayName("Record 43: State is CA")
	void StateOfRecord43() {
		assertEquals("CA", customers.get(42).getState());
	}

	@Test
	@DisplayName("Record 43: ZIP is 95828")
	void ZIPOfRecord43() {
		assertEquals("95828", customers.get(42).getZIP());
	}

	@Test
	@DisplayName("Record 43: Phone is 916-383-9286")
	void PhoneOfRecord43() {
		assertEquals("916-383-9286", customers.get(42).getPhone());
	}

	@Test
	@DisplayName("Record 43: Fax is 916-383-7061")
	void FaxOfRecord43() {
		assertEquals("916-383-7061", customers.get(42).getFax());
	}

	@Test
	@DisplayName("Record 43: Email is oscar@madge.com")
	void EmailOfRecord43() {
		assertEquals("oscar@madge.com", customers.get(42).getEmail());
	}

	@Test
	@DisplayName("Record 43: Web is http://www.oscarmadge.com")
	void WebOfRecord43() {
		assertEquals("http://www.oscarmadge.com", customers.get(42).getWeb());
	}
}
