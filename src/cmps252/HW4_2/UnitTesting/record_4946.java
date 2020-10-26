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
class Record_4946 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4946: FirstName is Brent")
	void FirstNameOfRecord4946() {
		assertEquals("Brent", customers.get(4945).getFirstName());
	}

	@Test
	@DisplayName("Record 4946: LastName is Salzer")
	void LastNameOfRecord4946() {
		assertEquals("Salzer", customers.get(4945).getLastName());
	}

	@Test
	@DisplayName("Record 4946: Company is Pacific Fruit Processors")
	void CompanyOfRecord4946() {
		assertEquals("Pacific Fruit Processors", customers.get(4945).getCompany());
	}

	@Test
	@DisplayName("Record 4946: Address is 2800 W Higgins Rd")
	void AddressOfRecord4946() {
		assertEquals("2800 W Higgins Rd", customers.get(4945).getAddress());
	}

	@Test
	@DisplayName("Record 4946: City is Schaumburg")
	void CityOfRecord4946() {
		assertEquals("Schaumburg", customers.get(4945).getCity());
	}

	@Test
	@DisplayName("Record 4946: County is Cook")
	void CountyOfRecord4946() {
		assertEquals("Cook", customers.get(4945).getCounty());
	}

	@Test
	@DisplayName("Record 4946: State is IL")
	void StateOfRecord4946() {
		assertEquals("IL", customers.get(4945).getState());
	}

	@Test
	@DisplayName("Record 4946: ZIP is 60195")
	void ZIPOfRecord4946() {
		assertEquals("60195", customers.get(4945).getZIP());
	}

	@Test
	@DisplayName("Record 4946: Phone is 847-885-3081")
	void PhoneOfRecord4946() {
		assertEquals("847-885-3081", customers.get(4945).getPhone());
	}

	@Test
	@DisplayName("Record 4946: Fax is 847-885-0888")
	void FaxOfRecord4946() {
		assertEquals("847-885-0888", customers.get(4945).getFax());
	}

	@Test
	@DisplayName("Record 4946: Email is brent@salzer.com")
	void EmailOfRecord4946() {
		assertEquals("brent@salzer.com", customers.get(4945).getEmail());
	}

	@Test
	@DisplayName("Record 4946: Web is http://www.brentsalzer.com")
	void WebOfRecord4946() {
		assertEquals("http://www.brentsalzer.com", customers.get(4945).getWeb());
	}
}
