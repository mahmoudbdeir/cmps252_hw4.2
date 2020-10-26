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

@Tag("41")
class Record_3466 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3466: FirstName is Bud")
	void FirstNameOfRecord3466() {
		assertEquals("Bud", customers.get(3465).getFirstName());
	}

	@Test
	@DisplayName("Record 3466: LastName is Pummell")
	void LastNameOfRecord3466() {
		assertEquals("Pummell", customers.get(3465).getLastName());
	}

	@Test
	@DisplayName("Record 3466: Company is Materials Specialists")
	void CompanyOfRecord3466() {
		assertEquals("Materials Specialists", customers.get(3465).getCompany());
	}

	@Test
	@DisplayName("Record 3466: Address is 55 Old Dover Rd")
	void AddressOfRecord3466() {
		assertEquals("55 Old Dover Rd", customers.get(3465).getAddress());
	}

	@Test
	@DisplayName("Record 3466: City is Portsmouth")
	void CityOfRecord3466() {
		assertEquals("Portsmouth", customers.get(3465).getCity());
	}

	@Test
	@DisplayName("Record 3466: County is Rockingham")
	void CountyOfRecord3466() {
		assertEquals("Rockingham", customers.get(3465).getCounty());
	}

	@Test
	@DisplayName("Record 3466: State is NH")
	void StateOfRecord3466() {
		assertEquals("NH", customers.get(3465).getState());
	}

	@Test
	@DisplayName("Record 3466: ZIP is 3801")
	void ZIPOfRecord3466() {
		assertEquals("3801", customers.get(3465).getZIP());
	}

	@Test
	@DisplayName("Record 3466: Phone is 603-433-9968")
	void PhoneOfRecord3466() {
		assertEquals("603-433-9968", customers.get(3465).getPhone());
	}

	@Test
	@DisplayName("Record 3466: Fax is 603-433-2729")
	void FaxOfRecord3466() {
		assertEquals("603-433-2729", customers.get(3465).getFax());
	}

	@Test
	@DisplayName("Record 3466: Email is bud@pummell.com")
	void EmailOfRecord3466() {
		assertEquals("bud@pummell.com", customers.get(3465).getEmail());
	}

	@Test
	@DisplayName("Record 3466: Web is http://www.budpummell.com")
	void WebOfRecord3466() {
		assertEquals("http://www.budpummell.com", customers.get(3465).getWeb());
	}
}
