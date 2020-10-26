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
class Record_4357 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4357: FirstName is Olive")
	void FirstNameOfRecord4357() {
		assertEquals("Olive", customers.get(4356).getFirstName());
	}

	@Test
	@DisplayName("Record 4357: LastName is Sessions")
	void LastNameOfRecord4357() {
		assertEquals("Sessions", customers.get(4356).getLastName());
	}

	@Test
	@DisplayName("Record 4357: Company is Best Western Classic Inn")
	void CompanyOfRecord4357() {
		assertEquals("Best Western Classic Inn", customers.get(4356).getCompany());
	}

	@Test
	@DisplayName("Record 4357: Address is 17 E Gabilan St")
	void AddressOfRecord4357() {
		assertEquals("17 E Gabilan St", customers.get(4356).getAddress());
	}

	@Test
	@DisplayName("Record 4357: City is Salinas")
	void CityOfRecord4357() {
		assertEquals("Salinas", customers.get(4356).getCity());
	}

	@Test
	@DisplayName("Record 4357: County is Monterey")
	void CountyOfRecord4357() {
		assertEquals("Monterey", customers.get(4356).getCounty());
	}

	@Test
	@DisplayName("Record 4357: State is CA")
	void StateOfRecord4357() {
		assertEquals("CA", customers.get(4356).getState());
	}

	@Test
	@DisplayName("Record 4357: ZIP is 93901")
	void ZIPOfRecord4357() {
		assertEquals("93901", customers.get(4356).getZIP());
	}

	@Test
	@DisplayName("Record 4357: Phone is 831-758-4087")
	void PhoneOfRecord4357() {
		assertEquals("831-758-4087", customers.get(4356).getPhone());
	}

	@Test
	@DisplayName("Record 4357: Fax is 831-758-2124")
	void FaxOfRecord4357() {
		assertEquals("831-758-2124", customers.get(4356).getFax());
	}

	@Test
	@DisplayName("Record 4357: Email is olive@sessions.com")
	void EmailOfRecord4357() {
		assertEquals("olive@sessions.com", customers.get(4356).getEmail());
	}

	@Test
	@DisplayName("Record 4357: Web is http://www.olivesessions.com")
	void WebOfRecord4357() {
		assertEquals("http://www.olivesessions.com", customers.get(4356).getWeb());
	}
}
