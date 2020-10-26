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

@Tag("15")
class Record_2116 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2116: FirstName is Elisa")
	void FirstNameOfRecord2116() {
		assertEquals("Elisa", customers.get(2115).getFirstName());
	}

	@Test
	@DisplayName("Record 2116: LastName is Ranalli")
	void LastNameOfRecord2116() {
		assertEquals("Ranalli", customers.get(2115).getLastName());
	}

	@Test
	@DisplayName("Record 2116: Company is Smith Western Inc")
	void CompanyOfRecord2116() {
		assertEquals("Smith Western Inc", customers.get(2115).getCompany());
	}

	@Test
	@DisplayName("Record 2116: Address is 120 Allies Boul")
	void AddressOfRecord2116() {
		assertEquals("120 Allies Boul", customers.get(2115).getAddress());
	}

	@Test
	@DisplayName("Record 2116: City is Pittsburgh")
	void CityOfRecord2116() {
		assertEquals("Pittsburgh", customers.get(2115).getCity());
	}

	@Test
	@DisplayName("Record 2116: County is Allegheny")
	void CountyOfRecord2116() {
		assertEquals("Allegheny", customers.get(2115).getCounty());
	}

	@Test
	@DisplayName("Record 2116: State is PA")
	void StateOfRecord2116() {
		assertEquals("PA", customers.get(2115).getState());
	}

	@Test
	@DisplayName("Record 2116: ZIP is 15222")
	void ZIPOfRecord2116() {
		assertEquals("15222", customers.get(2115).getZIP());
	}

	@Test
	@DisplayName("Record 2116: Phone is 412-261-0187")
	void PhoneOfRecord2116() {
		assertEquals("412-261-0187", customers.get(2115).getPhone());
	}

	@Test
	@DisplayName("Record 2116: Fax is 412-261-9179")
	void FaxOfRecord2116() {
		assertEquals("412-261-9179", customers.get(2115).getFax());
	}

	@Test
	@DisplayName("Record 2116: Email is elisa@ranalli.com")
	void EmailOfRecord2116() {
		assertEquals("elisa@ranalli.com", customers.get(2115).getEmail());
	}

	@Test
	@DisplayName("Record 2116: Web is http://www.elisaranalli.com")
	void WebOfRecord2116() {
		assertEquals("http://www.elisaranalli.com", customers.get(2115).getWeb());
	}
}
