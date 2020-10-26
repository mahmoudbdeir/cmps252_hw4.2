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

@Tag("41")
class Record_2452 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2452: FirstName is Lindsey")
	void FirstNameOfRecord2452() {
		assertEquals("Lindsey", customers.get(2451).getFirstName());
	}

	@Test
	@DisplayName("Record 2452: LastName is Dohring")
	void LastNameOfRecord2452() {
		assertEquals("Dohring", customers.get(2451).getLastName());
	}

	@Test
	@DisplayName("Record 2452: Company is Sierra Nut House")
	void CompanyOfRecord2452() {
		assertEquals("Sierra Nut House", customers.get(2451).getCompany());
	}

	@Test
	@DisplayName("Record 2452: Address is 3493 Lamar Ave")
	void AddressOfRecord2452() {
		assertEquals("3493 Lamar Ave", customers.get(2451).getAddress());
	}

	@Test
	@DisplayName("Record 2452: City is Memphis")
	void CityOfRecord2452() {
		assertEquals("Memphis", customers.get(2451).getCity());
	}

	@Test
	@DisplayName("Record 2452: County is Shelby")
	void CountyOfRecord2452() {
		assertEquals("Shelby", customers.get(2451).getCounty());
	}

	@Test
	@DisplayName("Record 2452: State is TN")
	void StateOfRecord2452() {
		assertEquals("TN", customers.get(2451).getState());
	}

	@Test
	@DisplayName("Record 2452: ZIP is 38118")
	void ZIPOfRecord2452() {
		assertEquals("38118", customers.get(2451).getZIP());
	}

	@Test
	@DisplayName("Record 2452: Phone is 901-362-7313")
	void PhoneOfRecord2452() {
		assertEquals("901-362-7313", customers.get(2451).getPhone());
	}

	@Test
	@DisplayName("Record 2452: Fax is 901-362-0315")
	void FaxOfRecord2452() {
		assertEquals("901-362-0315", customers.get(2451).getFax());
	}

	@Test
	@DisplayName("Record 2452: Email is lindsey@dohring.com")
	void EmailOfRecord2452() {
		assertEquals("lindsey@dohring.com", customers.get(2451).getEmail());
	}

	@Test
	@DisplayName("Record 2452: Web is http://www.lindseydohring.com")
	void WebOfRecord2452() {
		assertEquals("http://www.lindseydohring.com", customers.get(2451).getWeb());
	}
}
