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

@Tag("20")
class Record_710 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 710: FirstName is Ariel")
	void FirstNameOfRecord710() {
		assertEquals("Ariel", customers.get(709).getFirstName());
	}

	@Test
	@DisplayName("Record 710: LastName is Lueder")
	void LastNameOfRecord710() {
		assertEquals("Lueder", customers.get(709).getLastName());
	}

	@Test
	@DisplayName("Record 710: Company is California Business Machines")
	void CompanyOfRecord710() {
		assertEquals("California Business Machines", customers.get(709).getCompany());
	}

	@Test
	@DisplayName("Record 710: Address is 33380 Groesbeck Hwy")
	void AddressOfRecord710() {
		assertEquals("33380 Groesbeck Hwy", customers.get(709).getAddress());
	}

	@Test
	@DisplayName("Record 710: City is Fraser")
	void CityOfRecord710() {
		assertEquals("Fraser", customers.get(709).getCity());
	}

	@Test
	@DisplayName("Record 710: County is Macomb")
	void CountyOfRecord710() {
		assertEquals("Macomb", customers.get(709).getCounty());
	}

	@Test
	@DisplayName("Record 710: State is MI")
	void StateOfRecord710() {
		assertEquals("MI", customers.get(709).getState());
	}

	@Test
	@DisplayName("Record 710: ZIP is 48026")
	void ZIPOfRecord710() {
		assertEquals("48026", customers.get(709).getZIP());
	}

	@Test
	@DisplayName("Record 710: Phone is 586-294-9464")
	void PhoneOfRecord710() {
		assertEquals("586-294-9464", customers.get(709).getPhone());
	}

	@Test
	@DisplayName("Record 710: Fax is 586-294-2638")
	void FaxOfRecord710() {
		assertEquals("586-294-2638", customers.get(709).getFax());
	}

	@Test
	@DisplayName("Record 710: Email is ariel@lueder.com")
	void EmailOfRecord710() {
		assertEquals("ariel@lueder.com", customers.get(709).getEmail());
	}

	@Test
	@DisplayName("Record 710: Web is http://www.ariellueder.com")
	void WebOfRecord710() {
		assertEquals("http://www.ariellueder.com", customers.get(709).getWeb());
	}
}
