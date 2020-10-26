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

@Tag("0")
class Record_493 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 493: FirstName is Tyrell")
	void FirstNameOfRecord493() {
		assertEquals("Tyrell", customers.get(492).getFirstName());
	}

	@Test
	@DisplayName("Record 493: LastName is Shorey")
	void LastNameOfRecord493() {
		assertEquals("Shorey", customers.get(492).getLastName());
	}

	@Test
	@DisplayName("Record 493: Company is Odom, F Perry Esq")
	void CompanyOfRecord493() {
		assertEquals("Odom, F Perry Esq", customers.get(492).getCompany());
	}

	@Test
	@DisplayName("Record 493: Address is 735581 Lawehana St")
	void AddressOfRecord493() {
		assertEquals("735581 Lawehana St", customers.get(492).getAddress());
	}

	@Test
	@DisplayName("Record 493: City is Kailua Kona")
	void CityOfRecord493() {
		assertEquals("Kailua Kona", customers.get(492).getCity());
	}

	@Test
	@DisplayName("Record 493: County is Hawaii")
	void CountyOfRecord493() {
		assertEquals("Hawaii", customers.get(492).getCounty());
	}

	@Test
	@DisplayName("Record 493: State is HI")
	void StateOfRecord493() {
		assertEquals("HI", customers.get(492).getState());
	}

	@Test
	@DisplayName("Record 493: ZIP is 96740")
	void ZIPOfRecord493() {
		assertEquals("96740", customers.get(492).getZIP());
	}

	@Test
	@DisplayName("Record 493: Phone is 808-329-6007")
	void PhoneOfRecord493() {
		assertEquals("808-329-6007", customers.get(492).getPhone());
	}

	@Test
	@DisplayName("Record 493: Fax is 808-329-6887")
	void FaxOfRecord493() {
		assertEquals("808-329-6887", customers.get(492).getFax());
	}

	@Test
	@DisplayName("Record 493: Email is tyrell@shorey.com")
	void EmailOfRecord493() {
		assertEquals("tyrell@shorey.com", customers.get(492).getEmail());
	}

	@Test
	@DisplayName("Record 493: Web is http://www.tyrellshorey.com")
	void WebOfRecord493() {
		assertEquals("http://www.tyrellshorey.com", customers.get(492).getWeb());
	}
}
