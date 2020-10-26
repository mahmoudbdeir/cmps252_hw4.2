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
class Record_4335 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4335: FirstName is Mollie")
	void FirstNameOfRecord4335() {
		assertEquals("Mollie", customers.get(4334).getFirstName());
	}

	@Test
	@DisplayName("Record 4335: LastName is Tharrington")
	void LastNameOfRecord4335() {
		assertEquals("Tharrington", customers.get(4334).getLastName());
	}

	@Test
	@DisplayName("Record 4335: Company is American Tool Companies Inc")
	void CompanyOfRecord4335() {
		assertEquals("American Tool Companies Inc", customers.get(4334).getCompany());
	}

	@Test
	@DisplayName("Record 4335: Address is 100 S Charles St")
	void AddressOfRecord4335() {
		assertEquals("100 S Charles St", customers.get(4334).getAddress());
	}

	@Test
	@DisplayName("Record 4335: City is Baltimore")
	void CityOfRecord4335() {
		assertEquals("Baltimore", customers.get(4334).getCity());
	}

	@Test
	@DisplayName("Record 4335: County is Baltimore City")
	void CountyOfRecord4335() {
		assertEquals("Baltimore City", customers.get(4334).getCounty());
	}

	@Test
	@DisplayName("Record 4335: State is MD")
	void StateOfRecord4335() {
		assertEquals("MD", customers.get(4334).getState());
	}

	@Test
	@DisplayName("Record 4335: ZIP is 21201")
	void ZIPOfRecord4335() {
		assertEquals("21201", customers.get(4334).getZIP());
	}

	@Test
	@DisplayName("Record 4335: Phone is 410-332-3257")
	void PhoneOfRecord4335() {
		assertEquals("410-332-3257", customers.get(4334).getPhone());
	}

	@Test
	@DisplayName("Record 4335: Fax is 410-332-1704")
	void FaxOfRecord4335() {
		assertEquals("410-332-1704", customers.get(4334).getFax());
	}

	@Test
	@DisplayName("Record 4335: Email is mollie@tharrington.com")
	void EmailOfRecord4335() {
		assertEquals("mollie@tharrington.com", customers.get(4334).getEmail());
	}

	@Test
	@DisplayName("Record 4335: Web is http://www.mollietharrington.com")
	void WebOfRecord4335() {
		assertEquals("http://www.mollietharrington.com", customers.get(4334).getWeb());
	}
}
