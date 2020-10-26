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

@Tag("41")
class Record_4501 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4501: FirstName is Greta")
	void FirstNameOfRecord4501() {
		assertEquals("Greta", customers.get(4500).getFirstName());
	}

	@Test
	@DisplayName("Record 4501: LastName is Pechaira")
	void LastNameOfRecord4501() {
		assertEquals("Pechaira", customers.get(4500).getLastName());
	}

	@Test
	@DisplayName("Record 4501: Company is Oasis Ford Inc")
	void CompanyOfRecord4501() {
		assertEquals("Oasis Ford Inc", customers.get(4500).getCompany());
	}

	@Test
	@DisplayName("Record 4501: Address is 3032 Industrial Dr")
	void AddressOfRecord4501() {
		assertEquals("3032 Industrial Dr", customers.get(4500).getAddress());
	}

	@Test
	@DisplayName("Record 4501: City is Middletown")
	void CityOfRecord4501() {
		assertEquals("Middletown", customers.get(4500).getCity());
	}

	@Test
	@DisplayName("Record 4501: County is Orange")
	void CountyOfRecord4501() {
		assertEquals("Orange", customers.get(4500).getCounty());
	}

	@Test
	@DisplayName("Record 4501: State is NY")
	void StateOfRecord4501() {
		assertEquals("NY", customers.get(4500).getState());
	}

	@Test
	@DisplayName("Record 4501: ZIP is 10940")
	void ZIPOfRecord4501() {
		assertEquals("10940", customers.get(4500).getZIP());
	}

	@Test
	@DisplayName("Record 4501: Phone is 845-692-0985")
	void PhoneOfRecord4501() {
		assertEquals("845-692-0985", customers.get(4500).getPhone());
	}

	@Test
	@DisplayName("Record 4501: Fax is 845-692-8155")
	void FaxOfRecord4501() {
		assertEquals("845-692-8155", customers.get(4500).getFax());
	}

	@Test
	@DisplayName("Record 4501: Email is greta@pechaira.com")
	void EmailOfRecord4501() {
		assertEquals("greta@pechaira.com", customers.get(4500).getEmail());
	}

	@Test
	@DisplayName("Record 4501: Web is http://www.gretapechaira.com")
	void WebOfRecord4501() {
		assertEquals("http://www.gretapechaira.com", customers.get(4500).getWeb());
	}
}
