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

@Tag("24")
class Record_509 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 509: FirstName is Jed")
	void FirstNameOfRecord509() {
		assertEquals("Jed", customers.get(508).getFirstName());
	}

	@Test
	@DisplayName("Record 509: LastName is Kirkling")
	void LastNameOfRecord509() {
		assertEquals("Kirkling", customers.get(508).getLastName());
	}

	@Test
	@DisplayName("Record 509: Company is Grobe & Associates")
	void CompanyOfRecord509() {
		assertEquals("Grobe & Associates", customers.get(508).getCompany());
	}

	@Test
	@DisplayName("Record 509: Address is Main")
	void AddressOfRecord509() {
		assertEquals("Main", customers.get(508).getAddress());
	}

	@Test
	@DisplayName("Record 509: City is Mansfield")
	void CityOfRecord509() {
		assertEquals("Mansfield", customers.get(508).getCity());
	}

	@Test
	@DisplayName("Record 509: County is Richland")
	void CountyOfRecord509() {
		assertEquals("Richland", customers.get(508).getCounty());
	}

	@Test
	@DisplayName("Record 509: State is OH")
	void StateOfRecord509() {
		assertEquals("OH", customers.get(508).getState());
	}

	@Test
	@DisplayName("Record 509: ZIP is 44905")
	void ZIPOfRecord509() {
		assertEquals("44905", customers.get(508).getZIP());
	}

	@Test
	@DisplayName("Record 509: Phone is 419-589-4437")
	void PhoneOfRecord509() {
		assertEquals("419-589-4437", customers.get(508).getPhone());
	}

	@Test
	@DisplayName("Record 509: Fax is 419-589-8366")
	void FaxOfRecord509() {
		assertEquals("419-589-8366", customers.get(508).getFax());
	}

	@Test
	@DisplayName("Record 509: Email is jed@kirkling.com")
	void EmailOfRecord509() {
		assertEquals("jed@kirkling.com", customers.get(508).getEmail());
	}

	@Test
	@DisplayName("Record 509: Web is http://www.jedkirkling.com")
	void WebOfRecord509() {
		assertEquals("http://www.jedkirkling.com", customers.get(508).getWeb());
	}
}
