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

@Tag("28")
class Record_447 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 447: FirstName is Maurice")
	void FirstNameOfRecord447() {
		assertEquals("Maurice", customers.get(446).getFirstName());
	}

	@Test
	@DisplayName("Record 447: LastName is Stokey")
	void LastNameOfRecord447() {
		assertEquals("Stokey", customers.get(446).getLastName());
	}

	@Test
	@DisplayName("Record 447: Company is Acme Roofing Inc")
	void CompanyOfRecord447() {
		assertEquals("Acme Roofing Inc", customers.get(446).getCompany());
	}

	@Test
	@DisplayName("Record 447: Address is 551 W 189th St")
	void AddressOfRecord447() {
		assertEquals("551 W 189th St", customers.get(446).getAddress());
	}

	@Test
	@DisplayName("Record 447: City is Gardena")
	void CityOfRecord447() {
		assertEquals("Gardena", customers.get(446).getCity());
	}

	@Test
	@DisplayName("Record 447: County is Los Angeles")
	void CountyOfRecord447() {
		assertEquals("Los Angeles", customers.get(446).getCounty());
	}

	@Test
	@DisplayName("Record 447: State is CA")
	void StateOfRecord447() {
		assertEquals("CA", customers.get(446).getState());
	}

	@Test
	@DisplayName("Record 447: ZIP is 90248")
	void ZIPOfRecord447() {
		assertEquals("90248", customers.get(446).getZIP());
	}

	@Test
	@DisplayName("Record 447: Phone is 310-769-4671")
	void PhoneOfRecord447() {
		assertEquals("310-769-4671", customers.get(446).getPhone());
	}

	@Test
	@DisplayName("Record 447: Fax is 310-769-1614")
	void FaxOfRecord447() {
		assertEquals("310-769-1614", customers.get(446).getFax());
	}

	@Test
	@DisplayName("Record 447: Email is maurice@stokey.com")
	void EmailOfRecord447() {
		assertEquals("maurice@stokey.com", customers.get(446).getEmail());
	}

	@Test
	@DisplayName("Record 447: Web is http://www.mauricestokey.com")
	void WebOfRecord447() {
		assertEquals("http://www.mauricestokey.com", customers.get(446).getWeb());
	}
}
