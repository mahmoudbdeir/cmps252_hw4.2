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

@Tag("32")
class Record_2131 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2131: FirstName is Antoinette")
	void FirstNameOfRecord2131() {
		assertEquals("Antoinette", customers.get(2130).getFirstName());
	}

	@Test
	@DisplayName("Record 2131: LastName is Alejos")
	void LastNameOfRecord2131() {
		assertEquals("Alejos", customers.get(2130).getLastName());
	}

	@Test
	@DisplayName("Record 2131: Company is Vanini Fine Imported Antiques")
	void CompanyOfRecord2131() {
		assertEquals("Vanini Fine Imported Antiques", customers.get(2130).getCompany());
	}

	@Test
	@DisplayName("Record 2131: Address is 325 W 38th St")
	void AddressOfRecord2131() {
		assertEquals("325 W 38th St", customers.get(2130).getAddress());
	}

	@Test
	@DisplayName("Record 2131: City is New York")
	void CityOfRecord2131() {
		assertEquals("New York", customers.get(2130).getCity());
	}

	@Test
	@DisplayName("Record 2131: County is New York")
	void CountyOfRecord2131() {
		assertEquals("New York", customers.get(2130).getCounty());
	}

	@Test
	@DisplayName("Record 2131: State is NY")
	void StateOfRecord2131() {
		assertEquals("NY", customers.get(2130).getState());
	}

	@Test
	@DisplayName("Record 2131: ZIP is 10018")
	void ZIPOfRecord2131() {
		assertEquals("10018", customers.get(2130).getZIP());
	}

	@Test
	@DisplayName("Record 2131: Phone is 212-594-7140")
	void PhoneOfRecord2131() {
		assertEquals("212-594-7140", customers.get(2130).getPhone());
	}

	@Test
	@DisplayName("Record 2131: Fax is 212-594-7967")
	void FaxOfRecord2131() {
		assertEquals("212-594-7967", customers.get(2130).getFax());
	}

	@Test
	@DisplayName("Record 2131: Email is antoinette@alejos.com")
	void EmailOfRecord2131() {
		assertEquals("antoinette@alejos.com", customers.get(2130).getEmail());
	}

	@Test
	@DisplayName("Record 2131: Web is http://www.antoinettealejos.com")
	void WebOfRecord2131() {
		assertEquals("http://www.antoinettealejos.com", customers.get(2130).getWeb());
	}
}
