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

@Tag("21")
class Record_3665 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3665: FirstName is Lara")
	void FirstNameOfRecord3665() {
		assertEquals("Lara", customers.get(3664).getFirstName());
	}

	@Test
	@DisplayName("Record 3665: LastName is Rebman")
	void LastNameOfRecord3665() {
		assertEquals("Rebman", customers.get(3664).getLastName());
	}

	@Test
	@DisplayName("Record 3665: Company is South Co Building Contr Inc")
	void CompanyOfRecord3665() {
		assertEquals("South Co Building Contr Inc", customers.get(3664).getCompany());
	}

	@Test
	@DisplayName("Record 3665: Address is 2029 Wyandotte St")
	void AddressOfRecord3665() {
		assertEquals("2029 Wyandotte St", customers.get(3664).getAddress());
	}

	@Test
	@DisplayName("Record 3665: City is Kansas City")
	void CityOfRecord3665() {
		assertEquals("Kansas City", customers.get(3664).getCity());
	}

	@Test
	@DisplayName("Record 3665: County is Jackson")
	void CountyOfRecord3665() {
		assertEquals("Jackson", customers.get(3664).getCounty());
	}

	@Test
	@DisplayName("Record 3665: State is MO")
	void StateOfRecord3665() {
		assertEquals("MO", customers.get(3664).getState());
	}

	@Test
	@DisplayName("Record 3665: ZIP is 64108")
	void ZIPOfRecord3665() {
		assertEquals("64108", customers.get(3664).getZIP());
	}

	@Test
	@DisplayName("Record 3665: Phone is 816-283-8553")
	void PhoneOfRecord3665() {
		assertEquals("816-283-8553", customers.get(3664).getPhone());
	}

	@Test
	@DisplayName("Record 3665: Fax is 816-283-9429")
	void FaxOfRecord3665() {
		assertEquals("816-283-9429", customers.get(3664).getFax());
	}

	@Test
	@DisplayName("Record 3665: Email is lara@rebman.com")
	void EmailOfRecord3665() {
		assertEquals("lara@rebman.com", customers.get(3664).getEmail());
	}

	@Test
	@DisplayName("Record 3665: Web is http://www.lararebman.com")
	void WebOfRecord3665() {
		assertEquals("http://www.lararebman.com", customers.get(3664).getWeb());
	}
}
