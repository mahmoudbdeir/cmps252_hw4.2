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

@Tag("40")
class Record_1014 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1014: FirstName is Anna")
	void FirstNameOfRecord1014() {
		assertEquals("Anna", customers.get(1013).getFirstName());
	}

	@Test
	@DisplayName("Record 1014: LastName is Knoebel")
	void LastNameOfRecord1014() {
		assertEquals("Knoebel", customers.get(1013).getLastName());
	}

	@Test
	@DisplayName("Record 1014: Company is Kelly Temporary Services")
	void CompanyOfRecord1014() {
		assertEquals("Kelly Temporary Services", customers.get(1013).getCompany());
	}

	@Test
	@DisplayName("Record 1014: Address is 6025 N Dale Mabry Hwy")
	void AddressOfRecord1014() {
		assertEquals("6025 N Dale Mabry Hwy", customers.get(1013).getAddress());
	}

	@Test
	@DisplayName("Record 1014: City is Tampa")
	void CityOfRecord1014() {
		assertEquals("Tampa", customers.get(1013).getCity());
	}

	@Test
	@DisplayName("Record 1014: County is Hillsborough")
	void CountyOfRecord1014() {
		assertEquals("Hillsborough", customers.get(1013).getCounty());
	}

	@Test
	@DisplayName("Record 1014: State is FL")
	void StateOfRecord1014() {
		assertEquals("FL", customers.get(1013).getState());
	}

	@Test
	@DisplayName("Record 1014: ZIP is 33614")
	void ZIPOfRecord1014() {
		assertEquals("33614", customers.get(1013).getZIP());
	}

	@Test
	@DisplayName("Record 1014: Phone is 813-933-6772")
	void PhoneOfRecord1014() {
		assertEquals("813-933-6772", customers.get(1013).getPhone());
	}

	@Test
	@DisplayName("Record 1014: Fax is 813-933-0891")
	void FaxOfRecord1014() {
		assertEquals("813-933-0891", customers.get(1013).getFax());
	}

	@Test
	@DisplayName("Record 1014: Email is anna@knoebel.com")
	void EmailOfRecord1014() {
		assertEquals("anna@knoebel.com", customers.get(1013).getEmail());
	}

	@Test
	@DisplayName("Record 1014: Web is http://www.annaknoebel.com")
	void WebOfRecord1014() {
		assertEquals("http://www.annaknoebel.com", customers.get(1013).getWeb());
	}
}
