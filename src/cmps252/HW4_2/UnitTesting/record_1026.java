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

@Tag("17")
class Record_1026 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1026: FirstName is Kenneth")
	void FirstNameOfRecord1026() {
		assertEquals("Kenneth", customers.get(1025).getFirstName());
	}

	@Test
	@DisplayName("Record 1026: LastName is Corriveau")
	void LastNameOfRecord1026() {
		assertEquals("Corriveau", customers.get(1025).getLastName());
	}

	@Test
	@DisplayName("Record 1026: Company is Waller Sales Co")
	void CompanyOfRecord1026() {
		assertEquals("Waller Sales Co", customers.get(1025).getCompany());
	}

	@Test
	@DisplayName("Record 1026: Address is 8749 Tampa Ave")
	void AddressOfRecord1026() {
		assertEquals("8749 Tampa Ave", customers.get(1025).getAddress());
	}

	@Test
	@DisplayName("Record 1026: City is Northridge")
	void CityOfRecord1026() {
		assertEquals("Northridge", customers.get(1025).getCity());
	}

	@Test
	@DisplayName("Record 1026: County is Los Angeles")
	void CountyOfRecord1026() {
		assertEquals("Los Angeles", customers.get(1025).getCounty());
	}

	@Test
	@DisplayName("Record 1026: State is CA")
	void StateOfRecord1026() {
		assertEquals("CA", customers.get(1025).getState());
	}

	@Test
	@DisplayName("Record 1026: ZIP is 91324")
	void ZIPOfRecord1026() {
		assertEquals("91324", customers.get(1025).getZIP());
	}

	@Test
	@DisplayName("Record 1026: Phone is 818-349-0103")
	void PhoneOfRecord1026() {
		assertEquals("818-349-0103", customers.get(1025).getPhone());
	}

	@Test
	@DisplayName("Record 1026: Fax is 818-349-8833")
	void FaxOfRecord1026() {
		assertEquals("818-349-8833", customers.get(1025).getFax());
	}

	@Test
	@DisplayName("Record 1026: Email is kenneth@corriveau.com")
	void EmailOfRecord1026() {
		assertEquals("kenneth@corriveau.com", customers.get(1025).getEmail());
	}

	@Test
	@DisplayName("Record 1026: Web is http://www.kennethcorriveau.com")
	void WebOfRecord1026() {
		assertEquals("http://www.kennethcorriveau.com", customers.get(1025).getWeb());
	}
}
