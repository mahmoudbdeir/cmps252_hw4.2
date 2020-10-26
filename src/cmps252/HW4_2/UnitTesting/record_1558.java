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

@Tag("10")
class Record_1558 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1558: FirstName is Beth")
	void FirstNameOfRecord1558() {
		assertEquals("Beth", customers.get(1557).getFirstName());
	}

	@Test
	@DisplayName("Record 1558: LastName is Champman")
	void LastNameOfRecord1558() {
		assertEquals("Champman", customers.get(1557).getLastName());
	}

	@Test
	@DisplayName("Record 1558: Company is Wnfa")
	void CompanyOfRecord1558() {
		assertEquals("Wnfa", customers.get(1557).getCompany());
	}

	@Test
	@DisplayName("Record 1558: Address is 3119 Ponce De Leon Blvd")
	void AddressOfRecord1558() {
		assertEquals("3119 Ponce De Leon Blvd", customers.get(1557).getAddress());
	}

	@Test
	@DisplayName("Record 1558: City is Miami")
	void CityOfRecord1558() {
		assertEquals("Miami", customers.get(1557).getCity());
	}

	@Test
	@DisplayName("Record 1558: County is Miami-Dade")
	void CountyOfRecord1558() {
		assertEquals("Miami-Dade", customers.get(1557).getCounty());
	}

	@Test
	@DisplayName("Record 1558: State is FL")
	void StateOfRecord1558() {
		assertEquals("FL", customers.get(1557).getState());
	}

	@Test
	@DisplayName("Record 1558: ZIP is 33134")
	void ZIPOfRecord1558() {
		assertEquals("33134", customers.get(1557).getZIP());
	}

	@Test
	@DisplayName("Record 1558: Phone is 305-446-0383")
	void PhoneOfRecord1558() {
		assertEquals("305-446-0383", customers.get(1557).getPhone());
	}

	@Test
	@DisplayName("Record 1558: Fax is 305-446-8794")
	void FaxOfRecord1558() {
		assertEquals("305-446-8794", customers.get(1557).getFax());
	}

	@Test
	@DisplayName("Record 1558: Email is beth@champman.com")
	void EmailOfRecord1558() {
		assertEquals("beth@champman.com", customers.get(1557).getEmail());
	}

	@Test
	@DisplayName("Record 1558: Web is http://www.bethchampman.com")
	void WebOfRecord1558() {
		assertEquals("http://www.bethchampman.com", customers.get(1557).getWeb());
	}
}
