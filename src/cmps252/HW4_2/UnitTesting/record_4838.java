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
class Record_4838 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4838: FirstName is Steven")
	void FirstNameOfRecord4838() {
		assertEquals("Steven", customers.get(4837).getFirstName());
	}

	@Test
	@DisplayName("Record 4838: LastName is Magouyrk")
	void LastNameOfRecord4838() {
		assertEquals("Magouyrk", customers.get(4837).getLastName());
	}

	@Test
	@DisplayName("Record 4838: Company is Going Sign Co Inc")
	void CompanyOfRecord4838() {
		assertEquals("Going Sign Co Inc", customers.get(4837).getCompany());
	}

	@Test
	@DisplayName("Record 4838: Address is 1953 10th Ave N")
	void AddressOfRecord4838() {
		assertEquals("1953 10th Ave N", customers.get(4837).getAddress());
	}

	@Test
	@DisplayName("Record 4838: City is Lake Worth")
	void CityOfRecord4838() {
		assertEquals("Lake Worth", customers.get(4837).getCity());
	}

	@Test
	@DisplayName("Record 4838: County is Palm Beach")
	void CountyOfRecord4838() {
		assertEquals("Palm Beach", customers.get(4837).getCounty());
	}

	@Test
	@DisplayName("Record 4838: State is FL")
	void StateOfRecord4838() {
		assertEquals("FL", customers.get(4837).getState());
	}

	@Test
	@DisplayName("Record 4838: ZIP is 33461")
	void ZIPOfRecord4838() {
		assertEquals("33461", customers.get(4837).getZIP());
	}

	@Test
	@DisplayName("Record 4838: Phone is 561-582-5785")
	void PhoneOfRecord4838() {
		assertEquals("561-582-5785", customers.get(4837).getPhone());
	}

	@Test
	@DisplayName("Record 4838: Fax is 561-582-4393")
	void FaxOfRecord4838() {
		assertEquals("561-582-4393", customers.get(4837).getFax());
	}

	@Test
	@DisplayName("Record 4838: Email is steven@magouyrk.com")
	void EmailOfRecord4838() {
		assertEquals("steven@magouyrk.com", customers.get(4837).getEmail());
	}

	@Test
	@DisplayName("Record 4838: Web is http://www.stevenmagouyrk.com")
	void WebOfRecord4838() {
		assertEquals("http://www.stevenmagouyrk.com", customers.get(4837).getWeb());
	}
}
