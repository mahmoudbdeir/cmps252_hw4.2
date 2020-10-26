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

@Tag("28")
class Record_1531 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1531: FirstName is Shawn")
	void FirstNameOfRecord1531() {
		assertEquals("Shawn", customers.get(1530).getFirstName());
	}

	@Test
	@DisplayName("Record 1531: LastName is Rufer")
	void LastNameOfRecord1531() {
		assertEquals("Rufer", customers.get(1530).getLastName());
	}

	@Test
	@DisplayName("Record 1531: Company is Advanced Building Inc")
	void CompanyOfRecord1531() {
		assertEquals("Advanced Building Inc", customers.get(1530).getCompany());
	}

	@Test
	@DisplayName("Record 1531: Address is 3912 Broadway Ave")
	void AddressOfRecord1531() {
		assertEquals("3912 Broadway Ave", customers.get(1530).getAddress());
	}

	@Test
	@DisplayName("Record 1531: City is Haltom City")
	void CityOfRecord1531() {
		assertEquals("Haltom City", customers.get(1530).getCity());
	}

	@Test
	@DisplayName("Record 1531: County is Tarrant")
	void CountyOfRecord1531() {
		assertEquals("Tarrant", customers.get(1530).getCounty());
	}

	@Test
	@DisplayName("Record 1531: State is TX")
	void StateOfRecord1531() {
		assertEquals("TX", customers.get(1530).getState());
	}

	@Test
	@DisplayName("Record 1531: ZIP is 76117")
	void ZIPOfRecord1531() {
		assertEquals("76117", customers.get(1530).getZIP());
	}

	@Test
	@DisplayName("Record 1531: Phone is 817-831-8277")
	void PhoneOfRecord1531() {
		assertEquals("817-831-8277", customers.get(1530).getPhone());
	}

	@Test
	@DisplayName("Record 1531: Fax is 817-831-2638")
	void FaxOfRecord1531() {
		assertEquals("817-831-2638", customers.get(1530).getFax());
	}

	@Test
	@DisplayName("Record 1531: Email is shawn@rufer.com")
	void EmailOfRecord1531() {
		assertEquals("shawn@rufer.com", customers.get(1530).getEmail());
	}

	@Test
	@DisplayName("Record 1531: Web is http://www.shawnrufer.com")
	void WebOfRecord1531() {
		assertEquals("http://www.shawnrufer.com", customers.get(1530).getWeb());
	}
}
