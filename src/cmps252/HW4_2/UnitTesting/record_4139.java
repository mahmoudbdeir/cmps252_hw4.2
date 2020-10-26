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

@Tag("15")
class Record_4139 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4139: FirstName is Dorsey")
	void FirstNameOfRecord4139() {
		assertEquals("Dorsey", customers.get(4138).getFirstName());
	}

	@Test
	@DisplayName("Record 4139: LastName is Stenger")
	void LastNameOfRecord4139() {
		assertEquals("Stenger", customers.get(4138).getLastName());
	}

	@Test
	@DisplayName("Record 4139: Company is Capitol Services")
	void CompanyOfRecord4139() {
		assertEquals("Capitol Services", customers.get(4138).getCompany());
	}

	@Test
	@DisplayName("Record 4139: Address is 5020 23rd St")
	void AddressOfRecord4139() {
		assertEquals("5020 23rd St", customers.get(4138).getAddress());
	}

	@Test
	@DisplayName("Record 4139: City is Long Island City")
	void CityOfRecord4139() {
		assertEquals("Long Island City", customers.get(4138).getCity());
	}

	@Test
	@DisplayName("Record 4139: County is Queens")
	void CountyOfRecord4139() {
		assertEquals("Queens", customers.get(4138).getCounty());
	}

	@Test
	@DisplayName("Record 4139: State is NY")
	void StateOfRecord4139() {
		assertEquals("NY", customers.get(4138).getState());
	}

	@Test
	@DisplayName("Record 4139: ZIP is 11101")
	void ZIPOfRecord4139() {
		assertEquals("11101", customers.get(4138).getZIP());
	}

	@Test
	@DisplayName("Record 4139: Phone is 718-937-9747")
	void PhoneOfRecord4139() {
		assertEquals("718-937-9747", customers.get(4138).getPhone());
	}

	@Test
	@DisplayName("Record 4139: Fax is 718-937-5512")
	void FaxOfRecord4139() {
		assertEquals("718-937-5512", customers.get(4138).getFax());
	}

	@Test
	@DisplayName("Record 4139: Email is dorsey@stenger.com")
	void EmailOfRecord4139() {
		assertEquals("dorsey@stenger.com", customers.get(4138).getEmail());
	}

	@Test
	@DisplayName("Record 4139: Web is http://www.dorseystenger.com")
	void WebOfRecord4139() {
		assertEquals("http://www.dorseystenger.com", customers.get(4138).getWeb());
	}
}
