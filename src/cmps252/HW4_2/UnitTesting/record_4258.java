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
class Record_4258 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4258: FirstName is Stefanie")
	void FirstNameOfRecord4258() {
		assertEquals("Stefanie", customers.get(4257).getFirstName());
	}

	@Test
	@DisplayName("Record 4258: LastName is Temple")
	void LastNameOfRecord4258() {
		assertEquals("Temple", customers.get(4257).getLastName());
	}

	@Test
	@DisplayName("Record 4258: Company is Scheurich, G Michael Esq")
	void CompanyOfRecord4258() {
		assertEquals("Scheurich, G Michael Esq", customers.get(4257).getCompany());
	}

	@Test
	@DisplayName("Record 4258: Address is 800 Commerce St")
	void AddressOfRecord4258() {
		assertEquals("800 Commerce St", customers.get(4257).getAddress());
	}

	@Test
	@DisplayName("Record 4258: City is Houston")
	void CityOfRecord4258() {
		assertEquals("Houston", customers.get(4257).getCity());
	}

	@Test
	@DisplayName("Record 4258: County is Harris")
	void CountyOfRecord4258() {
		assertEquals("Harris", customers.get(4257).getCounty());
	}

	@Test
	@DisplayName("Record 4258: State is TX")
	void StateOfRecord4258() {
		assertEquals("TX", customers.get(4257).getState());
	}

	@Test
	@DisplayName("Record 4258: ZIP is 77002")
	void ZIPOfRecord4258() {
		assertEquals("77002", customers.get(4257).getZIP());
	}

	@Test
	@DisplayName("Record 4258: Phone is 713-225-5024")
	void PhoneOfRecord4258() {
		assertEquals("713-225-5024", customers.get(4257).getPhone());
	}

	@Test
	@DisplayName("Record 4258: Fax is 713-225-7612")
	void FaxOfRecord4258() {
		assertEquals("713-225-7612", customers.get(4257).getFax());
	}

	@Test
	@DisplayName("Record 4258: Email is stefanie@temple.com")
	void EmailOfRecord4258() {
		assertEquals("stefanie@temple.com", customers.get(4257).getEmail());
	}

	@Test
	@DisplayName("Record 4258: Web is http://www.stefanietemple.com")
	void WebOfRecord4258() {
		assertEquals("http://www.stefanietemple.com", customers.get(4257).getWeb());
	}
}
