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

@Tag("19")
class Record_1074 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1074: FirstName is Kasey")
	void FirstNameOfRecord1074() {
		assertEquals("Kasey", customers.get(1073).getFirstName());
	}

	@Test
	@DisplayName("Record 1074: LastName is Szerlong")
	void LastNameOfRecord1074() {
		assertEquals("Szerlong", customers.get(1073).getLastName());
	}

	@Test
	@DisplayName("Record 1074: Company is Terminal Tech Inc")
	void CompanyOfRecord1074() {
		assertEquals("Terminal Tech Inc", customers.get(1073).getCompany());
	}

	@Test
	@DisplayName("Record 1074: Address is 1620 Atlantic Ave")
	void AddressOfRecord1074() {
		assertEquals("1620 Atlantic Ave", customers.get(1073).getAddress());
	}

	@Test
	@DisplayName("Record 1074: City is Brooklyn")
	void CityOfRecord1074() {
		assertEquals("Brooklyn", customers.get(1073).getCity());
	}

	@Test
	@DisplayName("Record 1074: County is Kings")
	void CountyOfRecord1074() {
		assertEquals("Kings", customers.get(1073).getCounty());
	}

	@Test
	@DisplayName("Record 1074: State is NY")
	void StateOfRecord1074() {
		assertEquals("NY", customers.get(1073).getState());
	}

	@Test
	@DisplayName("Record 1074: ZIP is 11213")
	void ZIPOfRecord1074() {
		assertEquals("11213", customers.get(1073).getZIP());
	}

	@Test
	@DisplayName("Record 1074: Phone is 718-756-7230")
	void PhoneOfRecord1074() {
		assertEquals("718-756-7230", customers.get(1073).getPhone());
	}

	@Test
	@DisplayName("Record 1074: Fax is 718-756-4545")
	void FaxOfRecord1074() {
		assertEquals("718-756-4545", customers.get(1073).getFax());
	}

	@Test
	@DisplayName("Record 1074: Email is kasey@szerlong.com")
	void EmailOfRecord1074() {
		assertEquals("kasey@szerlong.com", customers.get(1073).getEmail());
	}

	@Test
	@DisplayName("Record 1074: Web is http://www.kaseyszerlong.com")
	void WebOfRecord1074() {
		assertEquals("http://www.kaseyszerlong.com", customers.get(1073).getWeb());
	}
}
