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

@Tag("13")
class Record_57 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 57: FirstName is Victor")
	void FirstNameOfRecord57() {
		assertEquals("Victor", customers.get(56).getFirstName());
	}

	@Test
	@DisplayName("Record 57: LastName is Magel")
	void LastNameOfRecord57() {
		assertEquals("Magel", customers.get(56).getLastName());
	}

	@Test
	@DisplayName("Record 57: Company is P C & C Research Corp")
	void CompanyOfRecord57() {
		assertEquals("P C & C Research Corp", customers.get(56).getCompany());
	}

	@Test
	@DisplayName("Record 57: Address is 814 N Kenilworth Ave")
	void AddressOfRecord57() {
		assertEquals("814 N Kenilworth Ave", customers.get(56).getAddress());
	}

	@Test
	@DisplayName("Record 57: City is Glendale")
	void CityOfRecord57() {
		assertEquals("Glendale", customers.get(56).getCity());
	}

	@Test
	@DisplayName("Record 57: County is Los Angeles")
	void CountyOfRecord57() {
		assertEquals("Los Angeles", customers.get(56).getCounty());
	}

	@Test
	@DisplayName("Record 57: State is CA")
	void StateOfRecord57() {
		assertEquals("CA", customers.get(56).getState());
	}

	@Test
	@DisplayName("Record 57: ZIP is 91203")
	void ZIPOfRecord57() {
		assertEquals("91203", customers.get(56).getZIP());
	}

	@Test
	@DisplayName("Record 57: Phone is 818-500-5950")
	void PhoneOfRecord57() {
		assertEquals("818-500-5950", customers.get(56).getPhone());
	}

	@Test
	@DisplayName("Record 57: Fax is 818-500-4897")
	void FaxOfRecord57() {
		assertEquals("818-500-4897", customers.get(56).getFax());
	}

	@Test
	@DisplayName("Record 57: Email is victor@magel.com")
	void EmailOfRecord57() {
		assertEquals("victor@magel.com", customers.get(56).getEmail());
	}

	@Test
	@DisplayName("Record 57: Web is http://www.victormagel.com")
	void WebOfRecord57() {
		assertEquals("http://www.victormagel.com", customers.get(56).getWeb());
	}
}
