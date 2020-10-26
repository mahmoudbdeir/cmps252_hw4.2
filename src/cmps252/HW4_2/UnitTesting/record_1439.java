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

@Tag("36")
class Record_1439 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1439: FirstName is Eva")
	void FirstNameOfRecord1439() {
		assertEquals("Eva", customers.get(1438).getFirstName());
	}

	@Test
	@DisplayName("Record 1439: LastName is Goldsborough")
	void LastNameOfRecord1439() {
		assertEquals("Goldsborough", customers.get(1438).getLastName());
	}

	@Test
	@DisplayName("Record 1439: Company is Times Record")
	void CompanyOfRecord1439() {
		assertEquals("Times Record", customers.get(1438).getCompany());
	}

	@Test
	@DisplayName("Record 1439: Address is 10620 W Bluemound Rd")
	void AddressOfRecord1439() {
		assertEquals("10620 W Bluemound Rd", customers.get(1438).getAddress());
	}

	@Test
	@DisplayName("Record 1439: City is Milwaukee")
	void CityOfRecord1439() {
		assertEquals("Milwaukee", customers.get(1438).getCity());
	}

	@Test
	@DisplayName("Record 1439: County is Milwaukee")
	void CountyOfRecord1439() {
		assertEquals("Milwaukee", customers.get(1438).getCounty());
	}

	@Test
	@DisplayName("Record 1439: State is WI")
	void StateOfRecord1439() {
		assertEquals("WI", customers.get(1438).getState());
	}

	@Test
	@DisplayName("Record 1439: ZIP is 53226")
	void ZIPOfRecord1439() {
		assertEquals("53226", customers.get(1438).getZIP());
	}

	@Test
	@DisplayName("Record 1439: Phone is 414-259-3124")
	void PhoneOfRecord1439() {
		assertEquals("414-259-3124", customers.get(1438).getPhone());
	}

	@Test
	@DisplayName("Record 1439: Fax is 414-259-4589")
	void FaxOfRecord1439() {
		assertEquals("414-259-4589", customers.get(1438).getFax());
	}

	@Test
	@DisplayName("Record 1439: Email is eva@goldsborough.com")
	void EmailOfRecord1439() {
		assertEquals("eva@goldsborough.com", customers.get(1438).getEmail());
	}

	@Test
	@DisplayName("Record 1439: Web is http://www.evagoldsborough.com")
	void WebOfRecord1439() {
		assertEquals("http://www.evagoldsborough.com", customers.get(1438).getWeb());
	}
}
