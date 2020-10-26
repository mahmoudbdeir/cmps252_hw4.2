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

@Tag("33")
class Record_2837 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2837: FirstName is Pat")
	void FirstNameOfRecord2837() {
		assertEquals("Pat", customers.get(2836).getFirstName());
	}

	@Test
	@DisplayName("Record 2837: LastName is Berardino")
	void LastNameOfRecord2837() {
		assertEquals("Berardino", customers.get(2836).getLastName());
	}

	@Test
	@DisplayName("Record 2837: Company is Fleming, John P Esq")
	void CompanyOfRecord2837() {
		assertEquals("Fleming, John P Esq", customers.get(2836).getCompany());
	}

	@Test
	@DisplayName("Record 2837: Address is 18 Saw Mill River Rd")
	void AddressOfRecord2837() {
		assertEquals("18 Saw Mill River Rd", customers.get(2836).getAddress());
	}

	@Test
	@DisplayName("Record 2837: City is Elmsford")
	void CityOfRecord2837() {
		assertEquals("Elmsford", customers.get(2836).getCity());
	}

	@Test
	@DisplayName("Record 2837: County is Westchester")
	void CountyOfRecord2837() {
		assertEquals("Westchester", customers.get(2836).getCounty());
	}

	@Test
	@DisplayName("Record 2837: State is NY")
	void StateOfRecord2837() {
		assertEquals("NY", customers.get(2836).getState());
	}

	@Test
	@DisplayName("Record 2837: ZIP is 10523")
	void ZIPOfRecord2837() {
		assertEquals("10523", customers.get(2836).getZIP());
	}

	@Test
	@DisplayName("Record 2837: Phone is 914-592-4021")
	void PhoneOfRecord2837() {
		assertEquals("914-592-4021", customers.get(2836).getPhone());
	}

	@Test
	@DisplayName("Record 2837: Fax is 914-592-9858")
	void FaxOfRecord2837() {
		assertEquals("914-592-9858", customers.get(2836).getFax());
	}

	@Test
	@DisplayName("Record 2837: Email is pat@berardino.com")
	void EmailOfRecord2837() {
		assertEquals("pat@berardino.com", customers.get(2836).getEmail());
	}

	@Test
	@DisplayName("Record 2837: Web is http://www.patberardino.com")
	void WebOfRecord2837() {
		assertEquals("http://www.patberardino.com", customers.get(2836).getWeb());
	}
}
