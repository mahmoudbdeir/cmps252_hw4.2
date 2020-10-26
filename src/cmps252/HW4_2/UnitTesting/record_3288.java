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

@Tag("39")
class Record_3288 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3288: FirstName is Christian")
	void FirstNameOfRecord3288() {
		assertEquals("Christian", customers.get(3287).getFirstName());
	}

	@Test
	@DisplayName("Record 3288: LastName is Helems")
	void LastNameOfRecord3288() {
		assertEquals("Helems", customers.get(3287).getLastName());
	}

	@Test
	@DisplayName("Record 3288: Company is Roots Nuts & Sweets")
	void CompanyOfRecord3288() {
		assertEquals("Roots Nuts & Sweets", customers.get(3287).getCompany());
	}

	@Test
	@DisplayName("Record 3288: Address is 159 Tea Town Rd")
	void AddressOfRecord3288() {
		assertEquals("159 Tea Town Rd", customers.get(3287).getAddress());
	}

	@Test
	@DisplayName("Record 3288: City is Croton on Hudson")
	void CityOfRecord3288() {
		assertEquals("Croton on Hudson", customers.get(3287).getCity());
	}

	@Test
	@DisplayName("Record 3288: County is Westchester")
	void CountyOfRecord3288() {
		assertEquals("Westchester", customers.get(3287).getCounty());
	}

	@Test
	@DisplayName("Record 3288: State is NY")
	void StateOfRecord3288() {
		assertEquals("NY", customers.get(3287).getState());
	}

	@Test
	@DisplayName("Record 3288: ZIP is 10520")
	void ZIPOfRecord3288() {
		assertEquals("10520", customers.get(3287).getZIP());
	}

	@Test
	@DisplayName("Record 3288: Phone is 914-271-0790")
	void PhoneOfRecord3288() {
		assertEquals("914-271-0790", customers.get(3287).getPhone());
	}

	@Test
	@DisplayName("Record 3288: Fax is 914-271-4211")
	void FaxOfRecord3288() {
		assertEquals("914-271-4211", customers.get(3287).getFax());
	}

	@Test
	@DisplayName("Record 3288: Email is christian@helems.com")
	void EmailOfRecord3288() {
		assertEquals("christian@helems.com", customers.get(3287).getEmail());
	}

	@Test
	@DisplayName("Record 3288: Web is http://www.christianhelems.com")
	void WebOfRecord3288() {
		assertEquals("http://www.christianhelems.com", customers.get(3287).getWeb());
	}
}
