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

@Tag("27")
class Record_1946 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1946: FirstName is Erik")
	void FirstNameOfRecord1946() {
		assertEquals("Erik", customers.get(1945).getFirstName());
	}

	@Test
	@DisplayName("Record 1946: LastName is Opteyndt")
	void LastNameOfRecord1946() {
		assertEquals("Opteyndt", customers.get(1945).getLastName());
	}

	@Test
	@DisplayName("Record 1946: Company is Frants, Christopher E Esq")
	void CompanyOfRecord1946() {
		assertEquals("Frants, Christopher E Esq", customers.get(1945).getCompany());
	}

	@Test
	@DisplayName("Record 1946: Address is 1 Dock St")
	void AddressOfRecord1946() {
		assertEquals("1 Dock St", customers.get(1945).getAddress());
	}

	@Test
	@DisplayName("Record 1946: City is Stamford")
	void CityOfRecord1946() {
		assertEquals("Stamford", customers.get(1945).getCity());
	}

	@Test
	@DisplayName("Record 1946: County is Fairfield")
	void CountyOfRecord1946() {
		assertEquals("Fairfield", customers.get(1945).getCounty());
	}

	@Test
	@DisplayName("Record 1946: State is CT")
	void StateOfRecord1946() {
		assertEquals("CT", customers.get(1945).getState());
	}

	@Test
	@DisplayName("Record 1946: ZIP is 6902")
	void ZIPOfRecord1946() {
		assertEquals("6902", customers.get(1945).getZIP());
	}

	@Test
	@DisplayName("Record 1946: Phone is 203-967-6020")
	void PhoneOfRecord1946() {
		assertEquals("203-967-6020", customers.get(1945).getPhone());
	}

	@Test
	@DisplayName("Record 1946: Fax is 203-967-5415")
	void FaxOfRecord1946() {
		assertEquals("203-967-5415", customers.get(1945).getFax());
	}

	@Test
	@DisplayName("Record 1946: Email is erik@opteyndt.com")
	void EmailOfRecord1946() {
		assertEquals("erik@opteyndt.com", customers.get(1945).getEmail());
	}

	@Test
	@DisplayName("Record 1946: Web is http://www.erikopteyndt.com")
	void WebOfRecord1946() {
		assertEquals("http://www.erikopteyndt.com", customers.get(1945).getWeb());
	}
}
