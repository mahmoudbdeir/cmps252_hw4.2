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

@Tag("20")
class Record_955 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 955: FirstName is Roy")
	void FirstNameOfRecord955() {
		assertEquals("Roy", customers.get(954).getFirstName());
	}

	@Test
	@DisplayName("Record 955: LastName is Pecue")
	void LastNameOfRecord955() {
		assertEquals("Pecue", customers.get(954).getLastName());
	}

	@Test
	@DisplayName("Record 955: Company is Diversified Industries")
	void CompanyOfRecord955() {
		assertEquals("Diversified Industries", customers.get(954).getCompany());
	}

	@Test
	@DisplayName("Record 955: Address is 4593 Broadway St  #-c109")
	void AddressOfRecord955() {
		assertEquals("4593 Broadway St  #-c109", customers.get(954).getAddress());
	}

	@Test
	@DisplayName("Record 955: City is Boulder")
	void CityOfRecord955() {
		assertEquals("Boulder", customers.get(954).getCity());
	}

	@Test
	@DisplayName("Record 955: County is Boulder")
	void CountyOfRecord955() {
		assertEquals("Boulder", customers.get(954).getCounty());
	}

	@Test
	@DisplayName("Record 955: State is CO")
	void StateOfRecord955() {
		assertEquals("CO", customers.get(954).getState());
	}

	@Test
	@DisplayName("Record 955: ZIP is 80304")
	void ZIPOfRecord955() {
		assertEquals("80304", customers.get(954).getZIP());
	}

	@Test
	@DisplayName("Record 955: Phone is 303-444-6235")
	void PhoneOfRecord955() {
		assertEquals("303-444-6235", customers.get(954).getPhone());
	}

	@Test
	@DisplayName("Record 955: Fax is 303-444-8831")
	void FaxOfRecord955() {
		assertEquals("303-444-8831", customers.get(954).getFax());
	}

	@Test
	@DisplayName("Record 955: Email is roy@pecue.com")
	void EmailOfRecord955() {
		assertEquals("roy@pecue.com", customers.get(954).getEmail());
	}

	@Test
	@DisplayName("Record 955: Web is http://www.roypecue.com")
	void WebOfRecord955() {
		assertEquals("http://www.roypecue.com", customers.get(954).getWeb());
	}
}
