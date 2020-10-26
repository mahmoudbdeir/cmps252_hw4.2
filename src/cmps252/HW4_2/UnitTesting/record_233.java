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

@Tag("10")
class Record_233 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 233: FirstName is Sheldon")
	void FirstNameOfRecord233() {
		assertEquals("Sheldon", customers.get(232).getFirstName());
	}

	@Test
	@DisplayName("Record 233: LastName is Litke")
	void LastNameOfRecord233() {
		assertEquals("Litke", customers.get(232).getLastName());
	}

	@Test
	@DisplayName("Record 233: Company is Frank Gumpert Printing")
	void CompanyOfRecord233() {
		assertEquals("Frank Gumpert Printing", customers.get(232).getCompany());
	}

	@Test
	@DisplayName("Record 233: Address is 1701 State Route 27")
	void AddressOfRecord233() {
		assertEquals("1701 State Route 27", customers.get(232).getAddress());
	}

	@Test
	@DisplayName("Record 233: City is Somerset")
	void CityOfRecord233() {
		assertEquals("Somerset", customers.get(232).getCity());
	}

	@Test
	@DisplayName("Record 233: County is Somerset")
	void CountyOfRecord233() {
		assertEquals("Somerset", customers.get(232).getCounty());
	}

	@Test
	@DisplayName("Record 233: State is NJ")
	void StateOfRecord233() {
		assertEquals("NJ", customers.get(232).getState());
	}

	@Test
	@DisplayName("Record 233: ZIP is 8873")
	void ZIPOfRecord233() {
		assertEquals("8873", customers.get(232).getZIP());
	}

	@Test
	@DisplayName("Record 233: Phone is 732-745-1011")
	void PhoneOfRecord233() {
		assertEquals("732-745-1011", customers.get(232).getPhone());
	}

	@Test
	@DisplayName("Record 233: Fax is 732-745-3743")
	void FaxOfRecord233() {
		assertEquals("732-745-3743", customers.get(232).getFax());
	}

	@Test
	@DisplayName("Record 233: Email is sheldon@litke.com")
	void EmailOfRecord233() {
		assertEquals("sheldon@litke.com", customers.get(232).getEmail());
	}

	@Test
	@DisplayName("Record 233: Web is http://www.sheldonlitke.com")
	void WebOfRecord233() {
		assertEquals("http://www.sheldonlitke.com", customers.get(232).getWeb());
	}
}
