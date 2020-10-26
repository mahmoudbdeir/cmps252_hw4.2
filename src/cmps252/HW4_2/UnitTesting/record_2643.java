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

@Tag("12")
class Record_2643 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2643: FirstName is Dixie")
	void FirstNameOfRecord2643() {
		assertEquals("Dixie", customers.get(2642).getFirstName());
	}

	@Test
	@DisplayName("Record 2643: LastName is Bokor")
	void LastNameOfRecord2643() {
		assertEquals("Bokor", customers.get(2642).getLastName());
	}

	@Test
	@DisplayName("Record 2643: Company is Norwalk Furniture Corp")
	void CompanyOfRecord2643() {
		assertEquals("Norwalk Furniture Corp", customers.get(2642).getCompany());
	}

	@Test
	@DisplayName("Record 2643: Address is 5610 Lamar St")
	void AddressOfRecord2643() {
		assertEquals("5610 Lamar St", customers.get(2642).getAddress());
	}

	@Test
	@DisplayName("Record 2643: City is Arvada")
	void CityOfRecord2643() {
		assertEquals("Arvada", customers.get(2642).getCity());
	}

	@Test
	@DisplayName("Record 2643: County is Jefferson")
	void CountyOfRecord2643() {
		assertEquals("Jefferson", customers.get(2642).getCounty());
	}

	@Test
	@DisplayName("Record 2643: State is CO")
	void StateOfRecord2643() {
		assertEquals("CO", customers.get(2642).getState());
	}

	@Test
	@DisplayName("Record 2643: ZIP is 80002")
	void ZIPOfRecord2643() {
		assertEquals("80002", customers.get(2642).getZIP());
	}

	@Test
	@DisplayName("Record 2643: Phone is 303-424-5517")
	void PhoneOfRecord2643() {
		assertEquals("303-424-5517", customers.get(2642).getPhone());
	}

	@Test
	@DisplayName("Record 2643: Fax is 303-424-3202")
	void FaxOfRecord2643() {
		assertEquals("303-424-3202", customers.get(2642).getFax());
	}

	@Test
	@DisplayName("Record 2643: Email is dixie@bokor.com")
	void EmailOfRecord2643() {
		assertEquals("dixie@bokor.com", customers.get(2642).getEmail());
	}

	@Test
	@DisplayName("Record 2643: Web is http://www.dixiebokor.com")
	void WebOfRecord2643() {
		assertEquals("http://www.dixiebokor.com", customers.get(2642).getWeb());
	}
}
