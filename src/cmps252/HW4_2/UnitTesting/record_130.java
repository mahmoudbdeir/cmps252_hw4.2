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

@Tag("4")
class Record_130 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 130: FirstName is Chi")
	void FirstNameOfRecord130() {
		assertEquals("Chi", customers.get(129).getFirstName());
	}

	@Test
	@DisplayName("Record 130: LastName is Yamaki")
	void LastNameOfRecord130() {
		assertEquals("Yamaki", customers.get(129).getLastName());
	}

	@Test
	@DisplayName("Record 130: Company is Paulsen Travel Bureau")
	void CompanyOfRecord130() {
		assertEquals("Paulsen Travel Bureau", customers.get(129).getCompany());
	}

	@Test
	@DisplayName("Record 130: Address is 42 Fernwood Ave")
	void AddressOfRecord130() {
		assertEquals("42 Fernwood Ave", customers.get(129).getAddress());
	}

	@Test
	@DisplayName("Record 130: City is Rochester")
	void CityOfRecord130() {
		assertEquals("Rochester", customers.get(129).getCity());
	}

	@Test
	@DisplayName("Record 130: County is Monroe")
	void CountyOfRecord130() {
		assertEquals("Monroe", customers.get(129).getCounty());
	}

	@Test
	@DisplayName("Record 130: State is NY")
	void StateOfRecord130() {
		assertEquals("NY", customers.get(129).getState());
	}

	@Test
	@DisplayName("Record 130: ZIP is 14621")
	void ZIPOfRecord130() {
		assertEquals("14621", customers.get(129).getZIP());
	}

	@Test
	@DisplayName("Record 130: Phone is 585-266-7808")
	void PhoneOfRecord130() {
		assertEquals("585-266-7808", customers.get(129).getPhone());
	}

	@Test
	@DisplayName("Record 130: Fax is 585-266-1433")
	void FaxOfRecord130() {
		assertEquals("585-266-1433", customers.get(129).getFax());
	}

	@Test
	@DisplayName("Record 130: Email is chi@yamaki.com")
	void EmailOfRecord130() {
		assertEquals("chi@yamaki.com", customers.get(129).getEmail());
	}

	@Test
	@DisplayName("Record 130: Web is http://www.chiyamaki.com")
	void WebOfRecord130() {
		assertEquals("http://www.chiyamaki.com", customers.get(129).getWeb());
	}
}
