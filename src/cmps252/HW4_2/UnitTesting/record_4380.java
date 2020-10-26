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

@Tag("2")
class Record_4380 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4380: FirstName is Cyrus")
	void FirstNameOfRecord4380() {
		assertEquals("Cyrus", customers.get(4379).getFirstName());
	}

	@Test
	@DisplayName("Record 4380: LastName is Erazmus")
	void LastNameOfRecord4380() {
		assertEquals("Erazmus", customers.get(4379).getLastName());
	}

	@Test
	@DisplayName("Record 4380: Company is Hotel Edison Beauty Shop")
	void CompanyOfRecord4380() {
		assertEquals("Hotel Edison Beauty Shop", customers.get(4379).getCompany());
	}

	@Test
	@DisplayName("Record 4380: Address is 17 E Gabilan St")
	void AddressOfRecord4380() {
		assertEquals("17 E Gabilan St", customers.get(4379).getAddress());
	}

	@Test
	@DisplayName("Record 4380: City is Salinas")
	void CityOfRecord4380() {
		assertEquals("Salinas", customers.get(4379).getCity());
	}

	@Test
	@DisplayName("Record 4380: County is Monterey")
	void CountyOfRecord4380() {
		assertEquals("Monterey", customers.get(4379).getCounty());
	}

	@Test
	@DisplayName("Record 4380: State is CA")
	void StateOfRecord4380() {
		assertEquals("CA", customers.get(4379).getState());
	}

	@Test
	@DisplayName("Record 4380: ZIP is 93901")
	void ZIPOfRecord4380() {
		assertEquals("93901", customers.get(4379).getZIP());
	}

	@Test
	@DisplayName("Record 4380: Phone is 831-758-8001")
	void PhoneOfRecord4380() {
		assertEquals("831-758-8001", customers.get(4379).getPhone());
	}

	@Test
	@DisplayName("Record 4380: Fax is 831-758-5939")
	void FaxOfRecord4380() {
		assertEquals("831-758-5939", customers.get(4379).getFax());
	}

	@Test
	@DisplayName("Record 4380: Email is cyrus@erazmus.com")
	void EmailOfRecord4380() {
		assertEquals("cyrus@erazmus.com", customers.get(4379).getEmail());
	}

	@Test
	@DisplayName("Record 4380: Web is http://www.cyruserazmus.com")
	void WebOfRecord4380() {
		assertEquals("http://www.cyruserazmus.com", customers.get(4379).getWeb());
	}
}
