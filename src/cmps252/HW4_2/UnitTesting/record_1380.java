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

@Tag("38")
class Record_1380 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1380: FirstName is Evelyn")
	void FirstNameOfRecord1380() {
		assertEquals("Evelyn", customers.get(1379).getFirstName());
	}

	@Test
	@DisplayName("Record 1380: LastName is Moseman")
	void LastNameOfRecord1380() {
		assertEquals("Moseman", customers.get(1379).getLastName());
	}

	@Test
	@DisplayName("Record 1380: Company is Tv Cable Of Central Pa")
	void CompanyOfRecord1380() {
		assertEquals("Tv Cable Of Central Pa", customers.get(1379).getCompany());
	}

	@Test
	@DisplayName("Record 1380: Address is 348 E Liberty St")
	void AddressOfRecord1380() {
		assertEquals("348 E Liberty St", customers.get(1379).getAddress());
	}

	@Test
	@DisplayName("Record 1380: City is Wooster")
	void CityOfRecord1380() {
		assertEquals("Wooster", customers.get(1379).getCity());
	}

	@Test
	@DisplayName("Record 1380: County is Wayne")
	void CountyOfRecord1380() {
		assertEquals("Wayne", customers.get(1379).getCounty());
	}

	@Test
	@DisplayName("Record 1380: State is OH")
	void StateOfRecord1380() {
		assertEquals("OH", customers.get(1379).getState());
	}

	@Test
	@DisplayName("Record 1380: ZIP is 44691")
	void ZIPOfRecord1380() {
		assertEquals("44691", customers.get(1379).getZIP());
	}

	@Test
	@DisplayName("Record 1380: Phone is 330-264-5619")
	void PhoneOfRecord1380() {
		assertEquals("330-264-5619", customers.get(1379).getPhone());
	}

	@Test
	@DisplayName("Record 1380: Fax is 330-264-5209")
	void FaxOfRecord1380() {
		assertEquals("330-264-5209", customers.get(1379).getFax());
	}

	@Test
	@DisplayName("Record 1380: Email is evelyn@moseman.com")
	void EmailOfRecord1380() {
		assertEquals("evelyn@moseman.com", customers.get(1379).getEmail());
	}

	@Test
	@DisplayName("Record 1380: Web is http://www.evelynmoseman.com")
	void WebOfRecord1380() {
		assertEquals("http://www.evelynmoseman.com", customers.get(1379).getWeb());
	}
}
