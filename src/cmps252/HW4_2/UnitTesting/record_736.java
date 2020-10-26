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

@Tag("30")
class Record_736 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 736: FirstName is Kari")
	void FirstNameOfRecord736() {
		assertEquals("Kari", customers.get(735).getFirstName());
	}

	@Test
	@DisplayName("Record 736: LastName is Blakeslee")
	void LastNameOfRecord736() {
		assertEquals("Blakeslee", customers.get(735).getLastName());
	}

	@Test
	@DisplayName("Record 736: Company is Desert Valley Ag Services Inc")
	void CompanyOfRecord736() {
		assertEquals("Desert Valley Ag Services Inc", customers.get(735).getCompany());
	}

	@Test
	@DisplayName("Record 736: Address is 3320 S Cobb Dr")
	void AddressOfRecord736() {
		assertEquals("3320 S Cobb Dr", customers.get(735).getAddress());
	}

	@Test
	@DisplayName("Record 736: City is Smyrna")
	void CityOfRecord736() {
		assertEquals("Smyrna", customers.get(735).getCity());
	}

	@Test
	@DisplayName("Record 736: County is Cobb")
	void CountyOfRecord736() {
		assertEquals("Cobb", customers.get(735).getCounty());
	}

	@Test
	@DisplayName("Record 736: State is GA")
	void StateOfRecord736() {
		assertEquals("GA", customers.get(735).getState());
	}

	@Test
	@DisplayName("Record 736: ZIP is 30080")
	void ZIPOfRecord736() {
		assertEquals("30080", customers.get(735).getZIP());
	}

	@Test
	@DisplayName("Record 736: Phone is 770-436-0456")
	void PhoneOfRecord736() {
		assertEquals("770-436-0456", customers.get(735).getPhone());
	}

	@Test
	@DisplayName("Record 736: Fax is 770-436-1942")
	void FaxOfRecord736() {
		assertEquals("770-436-1942", customers.get(735).getFax());
	}

	@Test
	@DisplayName("Record 736: Email is kari@blakeslee.com")
	void EmailOfRecord736() {
		assertEquals("kari@blakeslee.com", customers.get(735).getEmail());
	}

	@Test
	@DisplayName("Record 736: Web is http://www.kariblakeslee.com")
	void WebOfRecord736() {
		assertEquals("http://www.kariblakeslee.com", customers.get(735).getWeb());
	}
}
