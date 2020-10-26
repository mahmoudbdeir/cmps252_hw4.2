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

@Tag("2")
class Record_738 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 738: FirstName is Bess")
	void FirstNameOfRecord738() {
		assertEquals("Bess", customers.get(737).getFirstName());
	}

	@Test
	@DisplayName("Record 738: LastName is Wallin")
	void LastNameOfRecord738() {
		assertEquals("Wallin", customers.get(737).getLastName());
	}

	@Test
	@DisplayName("Record 738: Company is Maytag Dairy Farms Inc")
	void CompanyOfRecord738() {
		assertEquals("Maytag Dairy Farms Inc", customers.get(737).getCompany());
	}

	@Test
	@DisplayName("Record 738: Address is 12842 New Hampshire Ave")
	void AddressOfRecord738() {
		assertEquals("12842 New Hampshire Ave", customers.get(737).getAddress());
	}

	@Test
	@DisplayName("Record 738: City is Silver Spring")
	void CityOfRecord738() {
		assertEquals("Silver Spring", customers.get(737).getCity());
	}

	@Test
	@DisplayName("Record 738: County is Montgomery")
	void CountyOfRecord738() {
		assertEquals("Montgomery", customers.get(737).getCounty());
	}

	@Test
	@DisplayName("Record 738: State is MD")
	void StateOfRecord738() {
		assertEquals("MD", customers.get(737).getState());
	}

	@Test
	@DisplayName("Record 738: ZIP is 20904")
	void ZIPOfRecord738() {
		assertEquals("20904", customers.get(737).getZIP());
	}

	@Test
	@DisplayName("Record 738: Phone is 301-622-9864")
	void PhoneOfRecord738() {
		assertEquals("301-622-9864", customers.get(737).getPhone());
	}

	@Test
	@DisplayName("Record 738: Fax is 301-622-8418")
	void FaxOfRecord738() {
		assertEquals("301-622-8418", customers.get(737).getFax());
	}

	@Test
	@DisplayName("Record 738: Email is bess@wallin.com")
	void EmailOfRecord738() {
		assertEquals("bess@wallin.com", customers.get(737).getEmail());
	}

	@Test
	@DisplayName("Record 738: Web is http://www.besswallin.com")
	void WebOfRecord738() {
		assertEquals("http://www.besswallin.com", customers.get(737).getWeb());
	}
}
