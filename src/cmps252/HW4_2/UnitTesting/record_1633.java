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
class Record_1633 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1633: FirstName is Daron")
	void FirstNameOfRecord1633() {
		assertEquals("Daron", customers.get(1632).getFirstName());
	}

	@Test
	@DisplayName("Record 1633: LastName is Tinstman")
	void LastNameOfRecord1633() {
		assertEquals("Tinstman", customers.get(1632).getLastName());
	}

	@Test
	@DisplayName("Record 1633: Company is Roslyn News")
	void CompanyOfRecord1633() {
		assertEquals("Roslyn News", customers.get(1632).getCompany());
	}

	@Test
	@DisplayName("Record 1633: Address is 1230 Mccarter Hwy")
	void AddressOfRecord1633() {
		assertEquals("1230 Mccarter Hwy", customers.get(1632).getAddress());
	}

	@Test
	@DisplayName("Record 1633: City is Newark")
	void CityOfRecord1633() {
		assertEquals("Newark", customers.get(1632).getCity());
	}

	@Test
	@DisplayName("Record 1633: County is Essex")
	void CountyOfRecord1633() {
		assertEquals("Essex", customers.get(1632).getCounty());
	}

	@Test
	@DisplayName("Record 1633: State is NJ")
	void StateOfRecord1633() {
		assertEquals("NJ", customers.get(1632).getState());
	}

	@Test
	@DisplayName("Record 1633: ZIP is 7104")
	void ZIPOfRecord1633() {
		assertEquals("7104", customers.get(1632).getZIP());
	}

	@Test
	@DisplayName("Record 1633: Phone is 973-481-3538")
	void PhoneOfRecord1633() {
		assertEquals("973-481-3538", customers.get(1632).getPhone());
	}

	@Test
	@DisplayName("Record 1633: Fax is 973-481-5084")
	void FaxOfRecord1633() {
		assertEquals("973-481-5084", customers.get(1632).getFax());
	}

	@Test
	@DisplayName("Record 1633: Email is daron@tinstman.com")
	void EmailOfRecord1633() {
		assertEquals("daron@tinstman.com", customers.get(1632).getEmail());
	}

	@Test
	@DisplayName("Record 1633: Web is http://www.darontinstman.com")
	void WebOfRecord1633() {
		assertEquals("http://www.darontinstman.com", customers.get(1632).getWeb());
	}
}
