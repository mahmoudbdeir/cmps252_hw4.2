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
class Record_3736 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3736: FirstName is Lucy")
	void FirstNameOfRecord3736() {
		assertEquals("Lucy", customers.get(3735).getFirstName());
	}

	@Test
	@DisplayName("Record 3736: LastName is Carlo")
	void LastNameOfRecord3736() {
		assertEquals("Carlo", customers.get(3735).getLastName());
	}

	@Test
	@DisplayName("Record 3736: Company is Central Jersey Sign Corp")
	void CompanyOfRecord3736() {
		assertEquals("Central Jersey Sign Corp", customers.get(3735).getCompany());
	}

	@Test
	@DisplayName("Record 3736: Address is 34 Lawrence St")
	void AddressOfRecord3736() {
		assertEquals("34 Lawrence St", customers.get(3735).getAddress());
	}

	@Test
	@DisplayName("Record 3736: City is Yonkers")
	void CityOfRecord3736() {
		assertEquals("Yonkers", customers.get(3735).getCity());
	}

	@Test
	@DisplayName("Record 3736: County is Westchester")
	void CountyOfRecord3736() {
		assertEquals("Westchester", customers.get(3735).getCounty());
	}

	@Test
	@DisplayName("Record 3736: State is NY")
	void StateOfRecord3736() {
		assertEquals("NY", customers.get(3735).getState());
	}

	@Test
	@DisplayName("Record 3736: ZIP is 10705")
	void ZIPOfRecord3736() {
		assertEquals("10705", customers.get(3735).getZIP());
	}

	@Test
	@DisplayName("Record 3736: Phone is 914-423-9888")
	void PhoneOfRecord3736() {
		assertEquals("914-423-9888", customers.get(3735).getPhone());
	}

	@Test
	@DisplayName("Record 3736: Fax is 914-423-0466")
	void FaxOfRecord3736() {
		assertEquals("914-423-0466", customers.get(3735).getFax());
	}

	@Test
	@DisplayName("Record 3736: Email is lucy@carlo.com")
	void EmailOfRecord3736() {
		assertEquals("lucy@carlo.com", customers.get(3735).getEmail());
	}

	@Test
	@DisplayName("Record 3736: Web is http://www.lucycarlo.com")
	void WebOfRecord3736() {
		assertEquals("http://www.lucycarlo.com", customers.get(3735).getWeb());
	}
}
