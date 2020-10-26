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

@Tag("7")
class Record_219 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 219: FirstName is Clay")
	void FirstNameOfRecord219() {
		assertEquals("Clay", customers.get(218).getFirstName());
	}

	@Test
	@DisplayName("Record 219: LastName is Cote")
	void LastNameOfRecord219() {
		assertEquals("Cote", customers.get(218).getLastName());
	}

	@Test
	@DisplayName("Record 219: Company is Magic Valley Speedway")
	void CompanyOfRecord219() {
		assertEquals("Magic Valley Speedway", customers.get(218).getCompany());
	}

	@Test
	@DisplayName("Record 219: Address is 1225 Bloomfield Ave")
	void AddressOfRecord219() {
		assertEquals("1225 Bloomfield Ave", customers.get(218).getAddress());
	}

	@Test
	@DisplayName("Record 219: City is Fairfield")
	void CityOfRecord219() {
		assertEquals("Fairfield", customers.get(218).getCity());
	}

	@Test
	@DisplayName("Record 219: County is Essex")
	void CountyOfRecord219() {
		assertEquals("Essex", customers.get(218).getCounty());
	}

	@Test
	@DisplayName("Record 219: State is NJ")
	void StateOfRecord219() {
		assertEquals("NJ", customers.get(218).getState());
	}

	@Test
	@DisplayName("Record 219: ZIP is 7004")
	void ZIPOfRecord219() {
		assertEquals("7004", customers.get(218).getZIP());
	}

	@Test
	@DisplayName("Record 219: Phone is 973-882-1413")
	void PhoneOfRecord219() {
		assertEquals("973-882-1413", customers.get(218).getPhone());
	}

	@Test
	@DisplayName("Record 219: Fax is 973-882-1728")
	void FaxOfRecord219() {
		assertEquals("973-882-1728", customers.get(218).getFax());
	}

	@Test
	@DisplayName("Record 219: Email is clay@cote.com")
	void EmailOfRecord219() {
		assertEquals("clay@cote.com", customers.get(218).getEmail());
	}

	@Test
	@DisplayName("Record 219: Web is http://www.claycote.com")
	void WebOfRecord219() {
		assertEquals("http://www.claycote.com", customers.get(218).getWeb());
	}
}
