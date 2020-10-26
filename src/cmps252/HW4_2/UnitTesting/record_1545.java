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

@Tag("40")
class Record_1545 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1545: FirstName is Noel")
	void FirstNameOfRecord1545() {
		assertEquals("Noel", customers.get(1544).getFirstName());
	}

	@Test
	@DisplayName("Record 1545: LastName is Giessler")
	void LastNameOfRecord1545() {
		assertEquals("Giessler", customers.get(1544).getLastName());
	}

	@Test
	@DisplayName("Record 1545: Company is Ladd, John C Esq")
	void CompanyOfRecord1545() {
		assertEquals("Ladd, John C Esq", customers.get(1544).getCompany());
	}

	@Test
	@DisplayName("Record 1545: Address is 31100 Bainbridge Rd")
	void AddressOfRecord1545() {
		assertEquals("31100 Bainbridge Rd", customers.get(1544).getAddress());
	}

	@Test
	@DisplayName("Record 1545: City is Solon")
	void CityOfRecord1545() {
		assertEquals("Solon", customers.get(1544).getCity());
	}

	@Test
	@DisplayName("Record 1545: County is Cuyahoga")
	void CountyOfRecord1545() {
		assertEquals("Cuyahoga", customers.get(1544).getCounty());
	}

	@Test
	@DisplayName("Record 1545: State is OH")
	void StateOfRecord1545() {
		assertEquals("OH", customers.get(1544).getState());
	}

	@Test
	@DisplayName("Record 1545: ZIP is 44139")
	void ZIPOfRecord1545() {
		assertEquals("44139", customers.get(1544).getZIP());
	}

	@Test
	@DisplayName("Record 1545: Phone is 440-248-6301")
	void PhoneOfRecord1545() {
		assertEquals("440-248-6301", customers.get(1544).getPhone());
	}

	@Test
	@DisplayName("Record 1545: Fax is 440-248-4464")
	void FaxOfRecord1545() {
		assertEquals("440-248-4464", customers.get(1544).getFax());
	}

	@Test
	@DisplayName("Record 1545: Email is noel@giessler.com")
	void EmailOfRecord1545() {
		assertEquals("noel@giessler.com", customers.get(1544).getEmail());
	}

	@Test
	@DisplayName("Record 1545: Web is http://www.noelgiessler.com")
	void WebOfRecord1545() {
		assertEquals("http://www.noelgiessler.com", customers.get(1544).getWeb());
	}
}
