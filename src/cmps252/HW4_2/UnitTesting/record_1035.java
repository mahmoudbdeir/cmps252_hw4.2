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

@Tag("31")
class Record_1035 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1035: FirstName is Clement")
	void FirstNameOfRecord1035() {
		assertEquals("Clement", customers.get(1034).getFirstName());
	}

	@Test
	@DisplayName("Record 1035: LastName is Deavila")
	void LastNameOfRecord1035() {
		assertEquals("Deavila", customers.get(1034).getLastName());
	}

	@Test
	@DisplayName("Record 1035: Company is Kortick Manufacturing Co")
	void CompanyOfRecord1035() {
		assertEquals("Kortick Manufacturing Co", customers.get(1034).getCompany());
	}

	@Test
	@DisplayName("Record 1035: Address is 568 Charcot Ave")
	void AddressOfRecord1035() {
		assertEquals("568 Charcot Ave", customers.get(1034).getAddress());
	}

	@Test
	@DisplayName("Record 1035: City is San Jose")
	void CityOfRecord1035() {
		assertEquals("San Jose", customers.get(1034).getCity());
	}

	@Test
	@DisplayName("Record 1035: County is Santa Clara")
	void CountyOfRecord1035() {
		assertEquals("Santa Clara", customers.get(1034).getCounty());
	}

	@Test
	@DisplayName("Record 1035: State is CA")
	void StateOfRecord1035() {
		assertEquals("CA", customers.get(1034).getState());
	}

	@Test
	@DisplayName("Record 1035: ZIP is 95131")
	void ZIPOfRecord1035() {
		assertEquals("95131", customers.get(1034).getZIP());
	}

	@Test
	@DisplayName("Record 1035: Phone is 408-435-0151")
	void PhoneOfRecord1035() {
		assertEquals("408-435-0151", customers.get(1034).getPhone());
	}

	@Test
	@DisplayName("Record 1035: Fax is 408-435-6756")
	void FaxOfRecord1035() {
		assertEquals("408-435-6756", customers.get(1034).getFax());
	}

	@Test
	@DisplayName("Record 1035: Email is clement@deavila.com")
	void EmailOfRecord1035() {
		assertEquals("clement@deavila.com", customers.get(1034).getEmail());
	}

	@Test
	@DisplayName("Record 1035: Web is http://www.clementdeavila.com")
	void WebOfRecord1035() {
		assertEquals("http://www.clementdeavila.com", customers.get(1034).getWeb());
	}
}
