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
class Record_2111 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2111: FirstName is Brain")
	void FirstNameOfRecord2111() {
		assertEquals("Brain", customers.get(2110).getFirstName());
	}

	@Test
	@DisplayName("Record 2111: LastName is Gidcumb")
	void LastNameOfRecord2111() {
		assertEquals("Gidcumb", customers.get(2110).getLastName());
	}

	@Test
	@DisplayName("Record 2111: Company is Cabinet Shop")
	void CompanyOfRecord2111() {
		assertEquals("Cabinet Shop", customers.get(2110).getCompany());
	}

	@Test
	@DisplayName("Record 2111: Address is 8318 Sherwick Ct")
	void AddressOfRecord2111() {
		assertEquals("8318 Sherwick Ct", customers.get(2110).getAddress());
	}

	@Test
	@DisplayName("Record 2111: City is Jessup")
	void CityOfRecord2111() {
		assertEquals("Jessup", customers.get(2110).getCity());
	}

	@Test
	@DisplayName("Record 2111: County is Howard")
	void CountyOfRecord2111() {
		assertEquals("Howard", customers.get(2110).getCounty());
	}

	@Test
	@DisplayName("Record 2111: State is MD")
	void StateOfRecord2111() {
		assertEquals("MD", customers.get(2110).getState());
	}

	@Test
	@DisplayName("Record 2111: ZIP is 20794")
	void ZIPOfRecord2111() {
		assertEquals("20794", customers.get(2110).getZIP());
	}

	@Test
	@DisplayName("Record 2111: Phone is 410-953-5668")
	void PhoneOfRecord2111() {
		assertEquals("410-953-5668", customers.get(2110).getPhone());
	}

	@Test
	@DisplayName("Record 2111: Fax is 410-953-5098")
	void FaxOfRecord2111() {
		assertEquals("410-953-5098", customers.get(2110).getFax());
	}

	@Test
	@DisplayName("Record 2111: Email is brain@gidcumb.com")
	void EmailOfRecord2111() {
		assertEquals("brain@gidcumb.com", customers.get(2110).getEmail());
	}

	@Test
	@DisplayName("Record 2111: Web is http://www.braingidcumb.com")
	void WebOfRecord2111() {
		assertEquals("http://www.braingidcumb.com", customers.get(2110).getWeb());
	}
}
