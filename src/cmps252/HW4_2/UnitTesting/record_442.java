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

@Tag("18")
class Record_442 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 442: FirstName is Daniel")
	void FirstNameOfRecord442() {
		assertEquals("Daniel", customers.get(441).getFirstName());
	}

	@Test
	@DisplayName("Record 442: LastName is Holderness")
	void LastNameOfRecord442() {
		assertEquals("Holderness", customers.get(441).getLastName());
	}

	@Test
	@DisplayName("Record 442: Company is Compton, Todd B")
	void CompanyOfRecord442() {
		assertEquals("Compton, Todd B", customers.get(441).getCompany());
	}

	@Test
	@DisplayName("Record 442: Address is 39 State St")
	void AddressOfRecord442() {
		assertEquals("39 State St", customers.get(441).getAddress());
	}

	@Test
	@DisplayName("Record 442: City is North Haven")
	void CityOfRecord442() {
		assertEquals("North Haven", customers.get(441).getCity());
	}

	@Test
	@DisplayName("Record 442: County is New Haven")
	void CountyOfRecord442() {
		assertEquals("New Haven", customers.get(441).getCounty());
	}

	@Test
	@DisplayName("Record 442: State is CT")
	void StateOfRecord442() {
		assertEquals("CT", customers.get(441).getState());
	}

	@Test
	@DisplayName("Record 442: ZIP is 6473")
	void ZIPOfRecord442() {
		assertEquals("6473", customers.get(441).getZIP());
	}

	@Test
	@DisplayName("Record 442: Phone is 203-234-5853")
	void PhoneOfRecord442() {
		assertEquals("203-234-5853", customers.get(441).getPhone());
	}

	@Test
	@DisplayName("Record 442: Fax is 203-234-2649")
	void FaxOfRecord442() {
		assertEquals("203-234-2649", customers.get(441).getFax());
	}

	@Test
	@DisplayName("Record 442: Email is daniel@holderness.com")
	void EmailOfRecord442() {
		assertEquals("daniel@holderness.com", customers.get(441).getEmail());
	}

	@Test
	@DisplayName("Record 442: Web is http://www.danielholderness.com")
	void WebOfRecord442() {
		assertEquals("http://www.danielholderness.com", customers.get(441).getWeb());
	}
}
