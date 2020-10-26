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

@Tag("6")
class Record_1782 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1782: FirstName is Del")
	void FirstNameOfRecord1782() {
		assertEquals("Del", customers.get(1781).getFirstName());
	}

	@Test
	@DisplayName("Record 1782: LastName is Slomski")
	void LastNameOfRecord1782() {
		assertEquals("Slomski", customers.get(1781).getLastName());
	}

	@Test
	@DisplayName("Record 1782: Company is County Line Auto Parts")
	void CompanyOfRecord1782() {
		assertEquals("County Line Auto Parts", customers.get(1781).getCompany());
	}

	@Test
	@DisplayName("Record 1782: Address is 300 Fairfield Rd")
	void AddressOfRecord1782() {
		assertEquals("300 Fairfield Rd", customers.get(1781).getAddress());
	}

	@Test
	@DisplayName("Record 1782: City is Fairfield")
	void CityOfRecord1782() {
		assertEquals("Fairfield", customers.get(1781).getCity());
	}

	@Test
	@DisplayName("Record 1782: County is Essex")
	void CountyOfRecord1782() {
		assertEquals("Essex", customers.get(1781).getCounty());
	}

	@Test
	@DisplayName("Record 1782: State is NJ")
	void StateOfRecord1782() {
		assertEquals("NJ", customers.get(1781).getState());
	}

	@Test
	@DisplayName("Record 1782: ZIP is 7004")
	void ZIPOfRecord1782() {
		assertEquals("7004", customers.get(1781).getZIP());
	}

	@Test
	@DisplayName("Record 1782: Phone is 973-575-0016")
	void PhoneOfRecord1782() {
		assertEquals("973-575-0016", customers.get(1781).getPhone());
	}

	@Test
	@DisplayName("Record 1782: Fax is 973-575-2665")
	void FaxOfRecord1782() {
		assertEquals("973-575-2665", customers.get(1781).getFax());
	}

	@Test
	@DisplayName("Record 1782: Email is del@slomski.com")
	void EmailOfRecord1782() {
		assertEquals("del@slomski.com", customers.get(1781).getEmail());
	}

	@Test
	@DisplayName("Record 1782: Web is http://www.delslomski.com")
	void WebOfRecord1782() {
		assertEquals("http://www.delslomski.com", customers.get(1781).getWeb());
	}
}
