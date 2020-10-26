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

@Tag("29")
class Record_4015 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4015: FirstName is Levi")
	void FirstNameOfRecord4015() {
		assertEquals("Levi", customers.get(4014).getFirstName());
	}

	@Test
	@DisplayName("Record 4015: LastName is Beougher")
	void LastNameOfRecord4015() {
		assertEquals("Beougher", customers.get(4014).getLastName());
	}

	@Test
	@DisplayName("Record 4015: Company is E S E")
	void CompanyOfRecord4015() {
		assertEquals("E S E", customers.get(4014).getCompany());
	}

	@Test
	@DisplayName("Record 4015: Address is 810 N 6th St")
	void AddressOfRecord4015() {
		assertEquals("810 N 6th St", customers.get(4014).getAddress());
	}

	@Test
	@DisplayName("Record 4015: City is Abilene")
	void CityOfRecord4015() {
		assertEquals("Abilene", customers.get(4014).getCity());
	}

	@Test
	@DisplayName("Record 4015: County is Taylor")
	void CountyOfRecord4015() {
		assertEquals("Taylor", customers.get(4014).getCounty());
	}

	@Test
	@DisplayName("Record 4015: State is TX")
	void StateOfRecord4015() {
		assertEquals("TX", customers.get(4014).getState());
	}

	@Test
	@DisplayName("Record 4015: ZIP is 79601")
	void ZIPOfRecord4015() {
		assertEquals("79601", customers.get(4014).getZIP());
	}

	@Test
	@DisplayName("Record 4015: Phone is 325-673-9094")
	void PhoneOfRecord4015() {
		assertEquals("325-673-9094", customers.get(4014).getPhone());
	}

	@Test
	@DisplayName("Record 4015: Fax is 325-673-6167")
	void FaxOfRecord4015() {
		assertEquals("325-673-6167", customers.get(4014).getFax());
	}

	@Test
	@DisplayName("Record 4015: Email is levi@beougher.com")
	void EmailOfRecord4015() {
		assertEquals("levi@beougher.com", customers.get(4014).getEmail());
	}

	@Test
	@DisplayName("Record 4015: Web is http://www.levibeougher.com")
	void WebOfRecord4015() {
		assertEquals("http://www.levibeougher.com", customers.get(4014).getWeb());
	}
}
