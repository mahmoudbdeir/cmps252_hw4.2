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
class Record_441 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 441: FirstName is Gerald")
	void FirstNameOfRecord441() {
		assertEquals("Gerald", customers.get(440).getFirstName());
	}

	@Test
	@DisplayName("Record 441: LastName is Tyer")
	void LastNameOfRecord441() {
		assertEquals("Tyer", customers.get(440).getLastName());
	}

	@Test
	@DisplayName("Record 441: Company is Safety Containment Company Scc")
	void CompanyOfRecord441() {
		assertEquals("Safety Containment Company Scc", customers.get(440).getCompany());
	}

	@Test
	@DisplayName("Record 441: Address is 222 S Main St")
	void AddressOfRecord441() {
		assertEquals("222 S Main St", customers.get(440).getAddress());
	}

	@Test
	@DisplayName("Record 441: City is Monroe City")
	void CityOfRecord441() {
		assertEquals("Monroe City", customers.get(440).getCity());
	}

	@Test
	@DisplayName("Record 441: County is Monroe")
	void CountyOfRecord441() {
		assertEquals("Monroe", customers.get(440).getCounty());
	}

	@Test
	@DisplayName("Record 441: State is MO")
	void StateOfRecord441() {
		assertEquals("MO", customers.get(440).getState());
	}

	@Test
	@DisplayName("Record 441: ZIP is 63456")
	void ZIPOfRecord441() {
		assertEquals("63456", customers.get(440).getZIP());
	}

	@Test
	@DisplayName("Record 441: Phone is 573-735-1178")
	void PhoneOfRecord441() {
		assertEquals("573-735-1178", customers.get(440).getPhone());
	}

	@Test
	@DisplayName("Record 441: Fax is 573-735-0743")
	void FaxOfRecord441() {
		assertEquals("573-735-0743", customers.get(440).getFax());
	}

	@Test
	@DisplayName("Record 441: Email is gerald@tyer.com")
	void EmailOfRecord441() {
		assertEquals("gerald@tyer.com", customers.get(440).getEmail());
	}

	@Test
	@DisplayName("Record 441: Web is http://www.geraldtyer.com")
	void WebOfRecord441() {
		assertEquals("http://www.geraldtyer.com", customers.get(440).getWeb());
	}
}
