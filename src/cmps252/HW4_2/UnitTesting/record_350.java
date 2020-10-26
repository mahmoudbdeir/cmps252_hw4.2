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

@Tag("0")
class Record_350 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 350: FirstName is Carole")
	void FirstNameOfRecord350() {
		assertEquals("Carole", customers.get(349).getFirstName());
	}

	@Test
	@DisplayName("Record 350: LastName is Rayside")
	void LastNameOfRecord350() {
		assertEquals("Rayside", customers.get(349).getLastName());
	}

	@Test
	@DisplayName("Record 350: Company is Thompson Pipe & Steel Co")
	void CompanyOfRecord350() {
		assertEquals("Thompson Pipe & Steel Co", customers.get(349).getCompany());
	}

	@Test
	@DisplayName("Record 350: Address is 1414 Campbell St")
	void AddressOfRecord350() {
		assertEquals("1414 Campbell St", customers.get(349).getAddress());
	}

	@Test
	@DisplayName("Record 350: City is Rahway")
	void CityOfRecord350() {
		assertEquals("Rahway", customers.get(349).getCity());
	}

	@Test
	@DisplayName("Record 350: County is Union")
	void CountyOfRecord350() {
		assertEquals("Union", customers.get(349).getCounty());
	}

	@Test
	@DisplayName("Record 350: State is NJ")
	void StateOfRecord350() {
		assertEquals("NJ", customers.get(349).getState());
	}

	@Test
	@DisplayName("Record 350: ZIP is 7065")
	void ZIPOfRecord350() {
		assertEquals("7065", customers.get(349).getZIP());
	}

	@Test
	@DisplayName("Record 350: Phone is 732-574-0126")
	void PhoneOfRecord350() {
		assertEquals("732-574-0126", customers.get(349).getPhone());
	}

	@Test
	@DisplayName("Record 350: Fax is 732-574-5124")
	void FaxOfRecord350() {
		assertEquals("732-574-5124", customers.get(349).getFax());
	}

	@Test
	@DisplayName("Record 350: Email is carole@rayside.com")
	void EmailOfRecord350() {
		assertEquals("carole@rayside.com", customers.get(349).getEmail());
	}

	@Test
	@DisplayName("Record 350: Web is http://www.carolerayside.com")
	void WebOfRecord350() {
		assertEquals("http://www.carolerayside.com", customers.get(349).getWeb());
	}
}
