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

@Tag("8")
class Record_1752 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1752: FirstName is Scott")
	void FirstNameOfRecord1752() {
		assertEquals("Scott", customers.get(1751).getFirstName());
	}

	@Test
	@DisplayName("Record 1752: LastName is Slim")
	void LastNameOfRecord1752() {
		assertEquals("Slim", customers.get(1751).getLastName());
	}

	@Test
	@DisplayName("Record 1752: Company is Baseline Software Group")
	void CompanyOfRecord1752() {
		assertEquals("Baseline Software Group", customers.get(1751).getCompany());
	}

	@Test
	@DisplayName("Record 1752: Address is 3060 South Ave")
	void AddressOfRecord1752() {
		assertEquals("3060 South Ave", customers.get(1751).getAddress());
	}

	@Test
	@DisplayName("Record 1752: City is Toledo")
	void CityOfRecord1752() {
		assertEquals("Toledo", customers.get(1751).getCity());
	}

	@Test
	@DisplayName("Record 1752: County is Lucas")
	void CountyOfRecord1752() {
		assertEquals("Lucas", customers.get(1751).getCounty());
	}

	@Test
	@DisplayName("Record 1752: State is OH")
	void StateOfRecord1752() {
		assertEquals("OH", customers.get(1751).getState());
	}

	@Test
	@DisplayName("Record 1752: ZIP is 43609")
	void ZIPOfRecord1752() {
		assertEquals("43609", customers.get(1751).getZIP());
	}

	@Test
	@DisplayName("Record 1752: Phone is 419-385-8238")
	void PhoneOfRecord1752() {
		assertEquals("419-385-8238", customers.get(1751).getPhone());
	}

	@Test
	@DisplayName("Record 1752: Fax is 419-385-3835")
	void FaxOfRecord1752() {
		assertEquals("419-385-3835", customers.get(1751).getFax());
	}

	@Test
	@DisplayName("Record 1752: Email is scott@slim.com")
	void EmailOfRecord1752() {
		assertEquals("scott@slim.com", customers.get(1751).getEmail());
	}

	@Test
	@DisplayName("Record 1752: Web is http://www.scottslim.com")
	void WebOfRecord1752() {
		assertEquals("http://www.scottslim.com", customers.get(1751).getWeb());
	}
}
