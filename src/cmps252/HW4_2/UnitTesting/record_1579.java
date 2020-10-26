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

@Tag("16")
class Record_1579 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1579: FirstName is Lakesha")
	void FirstNameOfRecord1579() {
		assertEquals("Lakesha", customers.get(1578).getFirstName());
	}

	@Test
	@DisplayName("Record 1579: LastName is Bury")
	void LastNameOfRecord1579() {
		assertEquals("Bury", customers.get(1578).getLastName());
	}

	@Test
	@DisplayName("Record 1579: Company is Whalen And Company")
	void CompanyOfRecord1579() {
		assertEquals("Whalen And Company", customers.get(1578).getCompany());
	}

	@Test
	@DisplayName("Record 1579: Address is 519 8th Ave")
	void AddressOfRecord1579() {
		assertEquals("519 8th Ave", customers.get(1578).getAddress());
	}

	@Test
	@DisplayName("Record 1579: City is New York")
	void CityOfRecord1579() {
		assertEquals("New York", customers.get(1578).getCity());
	}

	@Test
	@DisplayName("Record 1579: County is New York")
	void CountyOfRecord1579() {
		assertEquals("New York", customers.get(1578).getCounty());
	}

	@Test
	@DisplayName("Record 1579: State is NY")
	void StateOfRecord1579() {
		assertEquals("NY", customers.get(1578).getState());
	}

	@Test
	@DisplayName("Record 1579: ZIP is 10018")
	void ZIPOfRecord1579() {
		assertEquals("10018", customers.get(1578).getZIP());
	}

	@Test
	@DisplayName("Record 1579: Phone is 212-967-0556")
	void PhoneOfRecord1579() {
		assertEquals("212-967-0556", customers.get(1578).getPhone());
	}

	@Test
	@DisplayName("Record 1579: Fax is 212-967-1127")
	void FaxOfRecord1579() {
		assertEquals("212-967-1127", customers.get(1578).getFax());
	}

	@Test
	@DisplayName("Record 1579: Email is lakesha@bury.com")
	void EmailOfRecord1579() {
		assertEquals("lakesha@bury.com", customers.get(1578).getEmail());
	}

	@Test
	@DisplayName("Record 1579: Web is http://www.lakeshabury.com")
	void WebOfRecord1579() {
		assertEquals("http://www.lakeshabury.com", customers.get(1578).getWeb());
	}
}
