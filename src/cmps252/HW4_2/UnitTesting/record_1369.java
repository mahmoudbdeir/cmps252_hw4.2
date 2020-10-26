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

@Tag("14")
class Record_1369 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1369: FirstName is Hunter")
	void FirstNameOfRecord1369() {
		assertEquals("Hunter", customers.get(1368).getFirstName());
	}

	@Test
	@DisplayName("Record 1369: LastName is Whitewater")
	void LastNameOfRecord1369() {
		assertEquals("Whitewater", customers.get(1368).getLastName());
	}

	@Test
	@DisplayName("Record 1369: Company is Miller Freeman Inc")
	void CompanyOfRecord1369() {
		assertEquals("Miller Freeman Inc", customers.get(1368).getCompany());
	}

	@Test
	@DisplayName("Record 1369: Address is 279 New Brunswick Ave")
	void AddressOfRecord1369() {
		assertEquals("279 New Brunswick Ave", customers.get(1368).getAddress());
	}

	@Test
	@DisplayName("Record 1369: City is Fords")
	void CityOfRecord1369() {
		assertEquals("Fords", customers.get(1368).getCity());
	}

	@Test
	@DisplayName("Record 1369: County is Middlesex")
	void CountyOfRecord1369() {
		assertEquals("Middlesex", customers.get(1368).getCounty());
	}

	@Test
	@DisplayName("Record 1369: State is NJ")
	void StateOfRecord1369() {
		assertEquals("NJ", customers.get(1368).getState());
	}

	@Test
	@DisplayName("Record 1369: ZIP is 8863")
	void ZIPOfRecord1369() {
		assertEquals("8863", customers.get(1368).getZIP());
	}

	@Test
	@DisplayName("Record 1369: Phone is 732-738-8678")
	void PhoneOfRecord1369() {
		assertEquals("732-738-8678", customers.get(1368).getPhone());
	}

	@Test
	@DisplayName("Record 1369: Fax is 732-738-3583")
	void FaxOfRecord1369() {
		assertEquals("732-738-3583", customers.get(1368).getFax());
	}

	@Test
	@DisplayName("Record 1369: Email is hunter@whitewater.com")
	void EmailOfRecord1369() {
		assertEquals("hunter@whitewater.com", customers.get(1368).getEmail());
	}

	@Test
	@DisplayName("Record 1369: Web is http://www.hunterwhitewater.com")
	void WebOfRecord1369() {
		assertEquals("http://www.hunterwhitewater.com", customers.get(1368).getWeb());
	}
}
