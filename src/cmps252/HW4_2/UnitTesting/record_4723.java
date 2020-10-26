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

@Tag("33")
class Record_4723 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4723: FirstName is Santo")
	void FirstNameOfRecord4723() {
		assertEquals("Santo", customers.get(4722).getFirstName());
	}

	@Test
	@DisplayName("Record 4723: LastName is Tress")
	void LastNameOfRecord4723() {
		assertEquals("Tress", customers.get(4722).getLastName());
	}

	@Test
	@DisplayName("Record 4723: Company is Westbrook Engineering Inc")
	void CompanyOfRecord4723() {
		assertEquals("Westbrook Engineering Inc", customers.get(4722).getCompany());
	}

	@Test
	@DisplayName("Record 4723: Address is 421 Sheridan Rd")
	void AddressOfRecord4723() {
		assertEquals("421 Sheridan Rd", customers.get(4722).getAddress());
	}

	@Test
	@DisplayName("Record 4723: City is Highland Park")
	void CityOfRecord4723() {
		assertEquals("Highland Park", customers.get(4722).getCity());
	}

	@Test
	@DisplayName("Record 4723: County is Lake")
	void CountyOfRecord4723() {
		assertEquals("Lake", customers.get(4722).getCounty());
	}

	@Test
	@DisplayName("Record 4723: State is IL")
	void StateOfRecord4723() {
		assertEquals("IL", customers.get(4722).getState());
	}

	@Test
	@DisplayName("Record 4723: ZIP is 60035")
	void ZIPOfRecord4723() {
		assertEquals("60035", customers.get(4722).getZIP());
	}

	@Test
	@DisplayName("Record 4723: Phone is 847-433-3465")
	void PhoneOfRecord4723() {
		assertEquals("847-433-3465", customers.get(4722).getPhone());
	}

	@Test
	@DisplayName("Record 4723: Fax is 847-433-5806")
	void FaxOfRecord4723() {
		assertEquals("847-433-5806", customers.get(4722).getFax());
	}

	@Test
	@DisplayName("Record 4723: Email is santo@tress.com")
	void EmailOfRecord4723() {
		assertEquals("santo@tress.com", customers.get(4722).getEmail());
	}

	@Test
	@DisplayName("Record 4723: Web is http://www.santotress.com")
	void WebOfRecord4723() {
		assertEquals("http://www.santotress.com", customers.get(4722).getWeb());
	}
}
