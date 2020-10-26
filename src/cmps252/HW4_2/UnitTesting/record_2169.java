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
class Record_2169 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2169: FirstName is Frank")
	void FirstNameOfRecord2169() {
		assertEquals("Frank", customers.get(2168).getFirstName());
	}

	@Test
	@DisplayName("Record 2169: LastName is Valtierra")
	void LastNameOfRecord2169() {
		assertEquals("Valtierra", customers.get(2168).getLastName());
	}

	@Test
	@DisplayName("Record 2169: Company is Wolds Popcorn & Snack Foods")
	void CompanyOfRecord2169() {
		assertEquals("Wolds Popcorn & Snack Foods", customers.get(2168).getCompany());
	}

	@Test
	@DisplayName("Record 2169: Address is 13100 Sw 128th St")
	void AddressOfRecord2169() {
		assertEquals("13100 Sw 128th St", customers.get(2168).getAddress());
	}

	@Test
	@DisplayName("Record 2169: City is Miami")
	void CityOfRecord2169() {
		assertEquals("Miami", customers.get(2168).getCity());
	}

	@Test
	@DisplayName("Record 2169: County is Miami-Dade")
	void CountyOfRecord2169() {
		assertEquals("Miami-Dade", customers.get(2168).getCounty());
	}

	@Test
	@DisplayName("Record 2169: State is FL")
	void StateOfRecord2169() {
		assertEquals("FL", customers.get(2168).getState());
	}

	@Test
	@DisplayName("Record 2169: ZIP is 33186")
	void ZIPOfRecord2169() {
		assertEquals("33186", customers.get(2168).getZIP());
	}

	@Test
	@DisplayName("Record 2169: Phone is 305-235-0386")
	void PhoneOfRecord2169() {
		assertEquals("305-235-0386", customers.get(2168).getPhone());
	}

	@Test
	@DisplayName("Record 2169: Fax is 305-235-1598")
	void FaxOfRecord2169() {
		assertEquals("305-235-1598", customers.get(2168).getFax());
	}

	@Test
	@DisplayName("Record 2169: Email is frank@valtierra.com")
	void EmailOfRecord2169() {
		assertEquals("frank@valtierra.com", customers.get(2168).getEmail());
	}

	@Test
	@DisplayName("Record 2169: Web is http://www.frankvaltierra.com")
	void WebOfRecord2169() {
		assertEquals("http://www.frankvaltierra.com", customers.get(2168).getWeb());
	}
}
