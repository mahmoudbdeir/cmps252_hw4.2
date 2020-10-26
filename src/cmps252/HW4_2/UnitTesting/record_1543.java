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

@Tag("35")
class Record_1543 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1543: FirstName is Samual")
	void FirstNameOfRecord1543() {
		assertEquals("Samual", customers.get(1542).getFirstName());
	}

	@Test
	@DisplayName("Record 1543: LastName is Paul")
	void LastNameOfRecord1543() {
		assertEquals("Paul", customers.get(1542).getLastName());
	}

	@Test
	@DisplayName("Record 1543: Company is Fain Kaufman & Young")
	void CompanyOfRecord1543() {
		assertEquals("Fain Kaufman & Young", customers.get(1542).getCompany());
	}

	@Test
	@DisplayName("Record 1543: Address is 22611 Markey Ct  #-113")
	void AddressOfRecord1543() {
		assertEquals("22611 Markey Ct  #-113", customers.get(1542).getAddress());
	}

	@Test
	@DisplayName("Record 1543: City is Sterling")
	void CityOfRecord1543() {
		assertEquals("Sterling", customers.get(1542).getCity());
	}

	@Test
	@DisplayName("Record 1543: County is Loudoun")
	void CountyOfRecord1543() {
		assertEquals("Loudoun", customers.get(1542).getCounty());
	}

	@Test
	@DisplayName("Record 1543: State is VA")
	void StateOfRecord1543() {
		assertEquals("VA", customers.get(1542).getState());
	}

	@Test
	@DisplayName("Record 1543: ZIP is 20166")
	void ZIPOfRecord1543() {
		assertEquals("20166", customers.get(1542).getZIP());
	}

	@Test
	@DisplayName("Record 1543: Phone is 703-450-5356")
	void PhoneOfRecord1543() {
		assertEquals("703-450-5356", customers.get(1542).getPhone());
	}

	@Test
	@DisplayName("Record 1543: Fax is 703-450-7233")
	void FaxOfRecord1543() {
		assertEquals("703-450-7233", customers.get(1542).getFax());
	}

	@Test
	@DisplayName("Record 1543: Email is samual@paul.com")
	void EmailOfRecord1543() {
		assertEquals("samual@paul.com", customers.get(1542).getEmail());
	}

	@Test
	@DisplayName("Record 1543: Web is http://www.samualpaul.com")
	void WebOfRecord1543() {
		assertEquals("http://www.samualpaul.com", customers.get(1542).getWeb());
	}
}
