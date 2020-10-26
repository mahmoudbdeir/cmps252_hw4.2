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

@Tag("3")
class Record_236 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 236: FirstName is Andre")
	void FirstNameOfRecord236() {
		assertEquals("Andre", customers.get(235).getFirstName());
	}

	@Test
	@DisplayName("Record 236: LastName is Flatley")
	void LastNameOfRecord236() {
		assertEquals("Flatley", customers.get(235).getLastName());
	}

	@Test
	@DisplayName("Record 236: Company is Phelps & Associates Pc")
	void CompanyOfRecord236() {
		assertEquals("Phelps & Associates Pc", customers.get(235).getCompany());
	}

	@Test
	@DisplayName("Record 236: Address is 170 Point Pleasant Rd")
	void AddressOfRecord236() {
		assertEquals("170 Point Pleasant Rd", customers.get(235).getAddress());
	}

	@Test
	@DisplayName("Record 236: City is Rochester")
	void CityOfRecord236() {
		assertEquals("Rochester", customers.get(235).getCity());
	}

	@Test
	@DisplayName("Record 236: County is Monroe")
	void CountyOfRecord236() {
		assertEquals("Monroe", customers.get(235).getCounty());
	}

	@Test
	@DisplayName("Record 236: State is NY")
	void StateOfRecord236() {
		assertEquals("NY", customers.get(235).getState());
	}

	@Test
	@DisplayName("Record 236: ZIP is 14622")
	void ZIPOfRecord236() {
		assertEquals("14622", customers.get(235).getZIP());
	}

	@Test
	@DisplayName("Record 236: Phone is 585-323-6504")
	void PhoneOfRecord236() {
		assertEquals("585-323-6504", customers.get(235).getPhone());
	}

	@Test
	@DisplayName("Record 236: Fax is 585-323-2587")
	void FaxOfRecord236() {
		assertEquals("585-323-2587", customers.get(235).getFax());
	}

	@Test
	@DisplayName("Record 236: Email is andre@flatley.com")
	void EmailOfRecord236() {
		assertEquals("andre@flatley.com", customers.get(235).getEmail());
	}

	@Test
	@DisplayName("Record 236: Web is http://www.andreflatley.com")
	void WebOfRecord236() {
		assertEquals("http://www.andreflatley.com", customers.get(235).getWeb());
	}
}
