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

@Tag("42")
class Record_4307 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4307: FirstName is Haley")
	void FirstNameOfRecord4307() {
		assertEquals("Haley", customers.get(4306).getFirstName());
	}

	@Test
	@DisplayName("Record 4307: LastName is Sagendorf")
	void LastNameOfRecord4307() {
		assertEquals("Sagendorf", customers.get(4306).getLastName());
	}

	@Test
	@DisplayName("Record 4307: Company is Signs Now")
	void CompanyOfRecord4307() {
		assertEquals("Signs Now", customers.get(4306).getCompany());
	}

	@Test
	@DisplayName("Record 4307: Address is 25800 Science Park Dr")
	void AddressOfRecord4307() {
		assertEquals("25800 Science Park Dr", customers.get(4306).getAddress());
	}

	@Test
	@DisplayName("Record 4307: City is Beachwood")
	void CityOfRecord4307() {
		assertEquals("Beachwood", customers.get(4306).getCity());
	}

	@Test
	@DisplayName("Record 4307: County is Cuyahoga")
	void CountyOfRecord4307() {
		assertEquals("Cuyahoga", customers.get(4306).getCounty());
	}

	@Test
	@DisplayName("Record 4307: State is OH")
	void StateOfRecord4307() {
		assertEquals("OH", customers.get(4306).getState());
	}

	@Test
	@DisplayName("Record 4307: ZIP is 44122")
	void ZIPOfRecord4307() {
		assertEquals("44122", customers.get(4306).getZIP());
	}

	@Test
	@DisplayName("Record 4307: Phone is 216-591-5599")
	void PhoneOfRecord4307() {
		assertEquals("216-591-5599", customers.get(4306).getPhone());
	}

	@Test
	@DisplayName("Record 4307: Fax is 216-591-2494")
	void FaxOfRecord4307() {
		assertEquals("216-591-2494", customers.get(4306).getFax());
	}

	@Test
	@DisplayName("Record 4307: Email is haley@sagendorf.com")
	void EmailOfRecord4307() {
		assertEquals("haley@sagendorf.com", customers.get(4306).getEmail());
	}

	@Test
	@DisplayName("Record 4307: Web is http://www.haleysagendorf.com")
	void WebOfRecord4307() {
		assertEquals("http://www.haleysagendorf.com", customers.get(4306).getWeb());
	}
}
