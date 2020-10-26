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

@Tag("2")
class Record_2709 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2709: FirstName is Grant")
	void FirstNameOfRecord2709() {
		assertEquals("Grant", customers.get(2708).getFirstName());
	}

	@Test
	@DisplayName("Record 2709: LastName is Besecker")
	void LastNameOfRecord2709() {
		assertEquals("Besecker", customers.get(2708).getLastName());
	}

	@Test
	@DisplayName("Record 2709: Company is Ats Products Inc")
	void CompanyOfRecord2709() {
		assertEquals("Ats Products Inc", customers.get(2708).getCompany());
	}

	@Test
	@DisplayName("Record 2709: Address is 99 Fairfield Rd")
	void AddressOfRecord2709() {
		assertEquals("99 Fairfield Rd", customers.get(2708).getAddress());
	}

	@Test
	@DisplayName("Record 2709: City is Fairfield")
	void CityOfRecord2709() {
		assertEquals("Fairfield", customers.get(2708).getCity());
	}

	@Test
	@DisplayName("Record 2709: County is Essex")
	void CountyOfRecord2709() {
		assertEquals("Essex", customers.get(2708).getCounty());
	}

	@Test
	@DisplayName("Record 2709: State is NJ")
	void StateOfRecord2709() {
		assertEquals("NJ", customers.get(2708).getState());
	}

	@Test
	@DisplayName("Record 2709: ZIP is 7004")
	void ZIPOfRecord2709() {
		assertEquals("7004", customers.get(2708).getZIP());
	}

	@Test
	@DisplayName("Record 2709: Phone is 973-575-6434")
	void PhoneOfRecord2709() {
		assertEquals("973-575-6434", customers.get(2708).getPhone());
	}

	@Test
	@DisplayName("Record 2709: Fax is 973-575-7332")
	void FaxOfRecord2709() {
		assertEquals("973-575-7332", customers.get(2708).getFax());
	}

	@Test
	@DisplayName("Record 2709: Email is grant@besecker.com")
	void EmailOfRecord2709() {
		assertEquals("grant@besecker.com", customers.get(2708).getEmail());
	}

	@Test
	@DisplayName("Record 2709: Web is http://www.grantbesecker.com")
	void WebOfRecord2709() {
		assertEquals("http://www.grantbesecker.com", customers.get(2708).getWeb());
	}
}
