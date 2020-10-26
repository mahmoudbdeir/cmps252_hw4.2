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

@Tag("12")
class Record_1339 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1339: FirstName is Brandon")
	void FirstNameOfRecord1339() {
		assertEquals("Brandon", customers.get(1338).getFirstName());
	}

	@Test
	@DisplayName("Record 1339: LastName is Kawaa")
	void LastNameOfRecord1339() {
		assertEquals("Kawaa", customers.get(1338).getLastName());
	}

	@Test
	@DisplayName("Record 1339: Company is Chessum, Jonathan R")
	void CompanyOfRecord1339() {
		assertEquals("Chessum, Jonathan R", customers.get(1338).getCompany());
	}

	@Test
	@DisplayName("Record 1339: Address is 9115 Dice Rd")
	void AddressOfRecord1339() {
		assertEquals("9115 Dice Rd", customers.get(1338).getAddress());
	}

	@Test
	@DisplayName("Record 1339: City is Santa Fe Springs")
	void CityOfRecord1339() {
		assertEquals("Santa Fe Springs", customers.get(1338).getCity());
	}

	@Test
	@DisplayName("Record 1339: County is Los Angeles")
	void CountyOfRecord1339() {
		assertEquals("Los Angeles", customers.get(1338).getCounty());
	}

	@Test
	@DisplayName("Record 1339: State is CA")
	void StateOfRecord1339() {
		assertEquals("CA", customers.get(1338).getState());
	}

	@Test
	@DisplayName("Record 1339: ZIP is 90670")
	void ZIPOfRecord1339() {
		assertEquals("90670", customers.get(1338).getZIP());
	}

	@Test
	@DisplayName("Record 1339: Phone is 562-903-0342")
	void PhoneOfRecord1339() {
		assertEquals("562-903-0342", customers.get(1338).getPhone());
	}

	@Test
	@DisplayName("Record 1339: Fax is 562-903-9962")
	void FaxOfRecord1339() {
		assertEquals("562-903-9962", customers.get(1338).getFax());
	}

	@Test
	@DisplayName("Record 1339: Email is brandon@kawaa.com")
	void EmailOfRecord1339() {
		assertEquals("brandon@kawaa.com", customers.get(1338).getEmail());
	}

	@Test
	@DisplayName("Record 1339: Web is http://www.brandonkawaa.com")
	void WebOfRecord1339() {
		assertEquals("http://www.brandonkawaa.com", customers.get(1338).getWeb());
	}
}
