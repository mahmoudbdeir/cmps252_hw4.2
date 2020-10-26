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
class Record_2763 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2763: FirstName is Leann")
	void FirstNameOfRecord2763() {
		assertEquals("Leann", customers.get(2762).getFirstName());
	}

	@Test
	@DisplayName("Record 2763: LastName is Tueller")
	void LastNameOfRecord2763() {
		assertEquals("Tueller", customers.get(2762).getLastName());
	}

	@Test
	@DisplayName("Record 2763: Company is Release International")
	void CompanyOfRecord2763() {
		assertEquals("Release International", customers.get(2762).getCompany());
	}

	@Test
	@DisplayName("Record 2763: Address is 10 Kelley St")
	void AddressOfRecord2763() {
		assertEquals("10 Kelley St", customers.get(2762).getAddress());
	}

	@Test
	@DisplayName("Record 2763: City is Palmer")
	void CityOfRecord2763() {
		assertEquals("Palmer", customers.get(2762).getCity());
	}

	@Test
	@DisplayName("Record 2763: County is Hampden")
	void CountyOfRecord2763() {
		assertEquals("Hampden", customers.get(2762).getCounty());
	}

	@Test
	@DisplayName("Record 2763: State is MA")
	void StateOfRecord2763() {
		assertEquals("MA", customers.get(2762).getState());
	}

	@Test
	@DisplayName("Record 2763: ZIP is 1069")
	void ZIPOfRecord2763() {
		assertEquals("1069", customers.get(2762).getZIP());
	}

	@Test
	@DisplayName("Record 2763: Phone is 413-283-7100")
	void PhoneOfRecord2763() {
		assertEquals("413-283-7100", customers.get(2762).getPhone());
	}

	@Test
	@DisplayName("Record 2763: Fax is 413-283-5515")
	void FaxOfRecord2763() {
		assertEquals("413-283-5515", customers.get(2762).getFax());
	}

	@Test
	@DisplayName("Record 2763: Email is leann@tueller.com")
	void EmailOfRecord2763() {
		assertEquals("leann@tueller.com", customers.get(2762).getEmail());
	}

	@Test
	@DisplayName("Record 2763: Web is http://www.leanntueller.com")
	void WebOfRecord2763() {
		assertEquals("http://www.leanntueller.com", customers.get(2762).getWeb());
	}
}
