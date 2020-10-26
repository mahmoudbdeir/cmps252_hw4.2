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

@Tag("3")
class Record_3954 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3954: FirstName is Monte")
	void FirstNameOfRecord3954() {
		assertEquals("Monte", customers.get(3953).getFirstName());
	}

	@Test
	@DisplayName("Record 3954: LastName is Wowk")
	void LastNameOfRecord3954() {
		assertEquals("Wowk", customers.get(3953).getLastName());
	}

	@Test
	@DisplayName("Record 3954: Company is Safety & Occuptnl Hlth Cncl")
	void CompanyOfRecord3954() {
		assertEquals("Safety & Occuptnl Hlth Cncl", customers.get(3953).getCompany());
	}

	@Test
	@DisplayName("Record 3954: Address is 26 W Bel Air Ave")
	void AddressOfRecord3954() {
		assertEquals("26 W Bel Air Ave", customers.get(3953).getAddress());
	}

	@Test
	@DisplayName("Record 3954: City is Aberdeen")
	void CityOfRecord3954() {
		assertEquals("Aberdeen", customers.get(3953).getCity());
	}

	@Test
	@DisplayName("Record 3954: County is Harford")
	void CountyOfRecord3954() {
		assertEquals("Harford", customers.get(3953).getCounty());
	}

	@Test
	@DisplayName("Record 3954: State is MD")
	void StateOfRecord3954() {
		assertEquals("MD", customers.get(3953).getState());
	}

	@Test
	@DisplayName("Record 3954: ZIP is 21001")
	void ZIPOfRecord3954() {
		assertEquals("21001", customers.get(3953).getZIP());
	}

	@Test
	@DisplayName("Record 3954: Phone is 410-272-0313")
	void PhoneOfRecord3954() {
		assertEquals("410-272-0313", customers.get(3953).getPhone());
	}

	@Test
	@DisplayName("Record 3954: Fax is 410-272-8602")
	void FaxOfRecord3954() {
		assertEquals("410-272-8602", customers.get(3953).getFax());
	}

	@Test
	@DisplayName("Record 3954: Email is monte@wowk.com")
	void EmailOfRecord3954() {
		assertEquals("monte@wowk.com", customers.get(3953).getEmail());
	}

	@Test
	@DisplayName("Record 3954: Web is http://www.montewowk.com")
	void WebOfRecord3954() {
		assertEquals("http://www.montewowk.com", customers.get(3953).getWeb());
	}
}
