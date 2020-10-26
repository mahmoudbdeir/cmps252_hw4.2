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

@Tag("31")
class Record_3406 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3406: FirstName is Dan")
	void FirstNameOfRecord3406() {
		assertEquals("Dan", customers.get(3405).getFirstName());
	}

	@Test
	@DisplayName("Record 3406: LastName is Columbia")
	void LastNameOfRecord3406() {
		assertEquals("Columbia", customers.get(3405).getLastName());
	}

	@Test
	@DisplayName("Record 3406: Company is Ann Sacks Tile & Stone")
	void CompanyOfRecord3406() {
		assertEquals("Ann Sacks Tile & Stone", customers.get(3405).getCompany());
	}

	@Test
	@DisplayName("Record 3406: Address is 14 W Sierra Madre Blvd")
	void AddressOfRecord3406() {
		assertEquals("14 W Sierra Madre Blvd", customers.get(3405).getAddress());
	}

	@Test
	@DisplayName("Record 3406: City is Sierra Madre")
	void CityOfRecord3406() {
		assertEquals("Sierra Madre", customers.get(3405).getCity());
	}

	@Test
	@DisplayName("Record 3406: County is Los Angeles")
	void CountyOfRecord3406() {
		assertEquals("Los Angeles", customers.get(3405).getCounty());
	}

	@Test
	@DisplayName("Record 3406: State is CA")
	void StateOfRecord3406() {
		assertEquals("CA", customers.get(3405).getState());
	}

	@Test
	@DisplayName("Record 3406: ZIP is 91024")
	void ZIPOfRecord3406() {
		assertEquals("91024", customers.get(3405).getZIP());
	}

	@Test
	@DisplayName("Record 3406: Phone is 626-355-2708")
	void PhoneOfRecord3406() {
		assertEquals("626-355-2708", customers.get(3405).getPhone());
	}

	@Test
	@DisplayName("Record 3406: Fax is 626-355-7404")
	void FaxOfRecord3406() {
		assertEquals("626-355-7404", customers.get(3405).getFax());
	}

	@Test
	@DisplayName("Record 3406: Email is dan@columbia.com")
	void EmailOfRecord3406() {
		assertEquals("dan@columbia.com", customers.get(3405).getEmail());
	}

	@Test
	@DisplayName("Record 3406: Web is http://www.dancolumbia.com")
	void WebOfRecord3406() {
		assertEquals("http://www.dancolumbia.com", customers.get(3405).getWeb());
	}
}
