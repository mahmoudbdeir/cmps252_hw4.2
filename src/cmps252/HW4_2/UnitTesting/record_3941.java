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

@Tag("7")
class Record_3941 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3941: FirstName is Miles")
	void FirstNameOfRecord3941() {
		assertEquals("Miles", customers.get(3940).getFirstName());
	}

	@Test
	@DisplayName("Record 3941: LastName is Stepan")
	void LastNameOfRecord3941() {
		assertEquals("Stepan", customers.get(3940).getLastName());
	}

	@Test
	@DisplayName("Record 3941: Company is Wynberg, Melvin H")
	void CompanyOfRecord3941() {
		assertEquals("Wynberg, Melvin H", customers.get(3940).getCompany());
	}

	@Test
	@DisplayName("Record 3941: Address is 120 W 12th St  #-1800")
	void AddressOfRecord3941() {
		assertEquals("120 W 12th St  #-1800", customers.get(3940).getAddress());
	}

	@Test
	@DisplayName("Record 3941: City is Kansas City")
	void CityOfRecord3941() {
		assertEquals("Kansas City", customers.get(3940).getCity());
	}

	@Test
	@DisplayName("Record 3941: County is Jackson")
	void CountyOfRecord3941() {
		assertEquals("Jackson", customers.get(3940).getCounty());
	}

	@Test
	@DisplayName("Record 3941: State is MO")
	void StateOfRecord3941() {
		assertEquals("MO", customers.get(3940).getState());
	}

	@Test
	@DisplayName("Record 3941: ZIP is 64105")
	void ZIPOfRecord3941() {
		assertEquals("64105", customers.get(3940).getZIP());
	}

	@Test
	@DisplayName("Record 3941: Phone is 816-283-0492")
	void PhoneOfRecord3941() {
		assertEquals("816-283-0492", customers.get(3940).getPhone());
	}

	@Test
	@DisplayName("Record 3941: Fax is 816-283-4644")
	void FaxOfRecord3941() {
		assertEquals("816-283-4644", customers.get(3940).getFax());
	}

	@Test
	@DisplayName("Record 3941: Email is miles@stepan.com")
	void EmailOfRecord3941() {
		assertEquals("miles@stepan.com", customers.get(3940).getEmail());
	}

	@Test
	@DisplayName("Record 3941: Web is http://www.milesstepan.com")
	void WebOfRecord3941() {
		assertEquals("http://www.milesstepan.com", customers.get(3940).getWeb());
	}
}
