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

@Tag("5")
class Record_4347 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4347: FirstName is Thanh")
	void FirstNameOfRecord4347() {
		assertEquals("Thanh", customers.get(4346).getFirstName());
	}

	@Test
	@DisplayName("Record 4347: LastName is Maurey")
	void LastNameOfRecord4347() {
		assertEquals("Maurey", customers.get(4346).getLastName());
	}

	@Test
	@DisplayName("Record 4347: Company is Rest A Phone Corp")
	void CompanyOfRecord4347() {
		assertEquals("Rest A Phone Corp", customers.get(4346).getCompany());
	}

	@Test
	@DisplayName("Record 4347: Address is 1299 Pennsylvania Ave Nw")
	void AddressOfRecord4347() {
		assertEquals("1299 Pennsylvania Ave Nw", customers.get(4346).getAddress());
	}

	@Test
	@DisplayName("Record 4347: City is Washington")
	void CityOfRecord4347() {
		assertEquals("Washington", customers.get(4346).getCity());
	}

	@Test
	@DisplayName("Record 4347: County is District of Columbia")
	void CountyOfRecord4347() {
		assertEquals("District of Columbia", customers.get(4346).getCounty());
	}

	@Test
	@DisplayName("Record 4347: State is DC")
	void StateOfRecord4347() {
		assertEquals("DC", customers.get(4346).getState());
	}

	@Test
	@DisplayName("Record 4347: ZIP is 20004")
	void ZIPOfRecord4347() {
		assertEquals("20004", customers.get(4346).getZIP());
	}

	@Test
	@DisplayName("Record 4347: Phone is 202-383-5763")
	void PhoneOfRecord4347() {
		assertEquals("202-383-5763", customers.get(4346).getPhone());
	}

	@Test
	@DisplayName("Record 4347: Fax is 202-383-9326")
	void FaxOfRecord4347() {
		assertEquals("202-383-9326", customers.get(4346).getFax());
	}

	@Test
	@DisplayName("Record 4347: Email is thanh@maurey.com")
	void EmailOfRecord4347() {
		assertEquals("thanh@maurey.com", customers.get(4346).getEmail());
	}

	@Test
	@DisplayName("Record 4347: Web is http://www.thanhmaurey.com")
	void WebOfRecord4347() {
		assertEquals("http://www.thanhmaurey.com", customers.get(4346).getWeb());
	}
}
