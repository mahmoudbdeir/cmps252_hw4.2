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

@Tag("35")
class Record_4841 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4841: FirstName is Jo")
	void FirstNameOfRecord4841() {
		assertEquals("Jo", customers.get(4840).getFirstName());
	}

	@Test
	@DisplayName("Record 4841: LastName is Ryner")
	void LastNameOfRecord4841() {
		assertEquals("Ryner", customers.get(4840).getLastName());
	}

	@Test
	@DisplayName("Record 4841: Company is Johnson, Bernie T")
	void CompanyOfRecord4841() {
		assertEquals("Johnson, Bernie T", customers.get(4840).getCompany());
	}

	@Test
	@DisplayName("Record 4841: Address is 320 5th Ave  #-905")
	void AddressOfRecord4841() {
		assertEquals("320 5th Ave  #-905", customers.get(4840).getAddress());
	}

	@Test
	@DisplayName("Record 4841: City is New York")
	void CityOfRecord4841() {
		assertEquals("New York", customers.get(4840).getCity());
	}

	@Test
	@DisplayName("Record 4841: County is New York")
	void CountyOfRecord4841() {
		assertEquals("New York", customers.get(4840).getCounty());
	}

	@Test
	@DisplayName("Record 4841: State is NY")
	void StateOfRecord4841() {
		assertEquals("NY", customers.get(4840).getState());
	}

	@Test
	@DisplayName("Record 4841: ZIP is 10001")
	void ZIPOfRecord4841() {
		assertEquals("10001", customers.get(4840).getZIP());
	}

	@Test
	@DisplayName("Record 4841: Phone is 212-967-2019")
	void PhoneOfRecord4841() {
		assertEquals("212-967-2019", customers.get(4840).getPhone());
	}

	@Test
	@DisplayName("Record 4841: Fax is 212-967-8545")
	void FaxOfRecord4841() {
		assertEquals("212-967-8545", customers.get(4840).getFax());
	}

	@Test
	@DisplayName("Record 4841: Email is jo@ryner.com")
	void EmailOfRecord4841() {
		assertEquals("jo@ryner.com", customers.get(4840).getEmail());
	}

	@Test
	@DisplayName("Record 4841: Web is http://www.joryner.com")
	void WebOfRecord4841() {
		assertEquals("http://www.joryner.com", customers.get(4840).getWeb());
	}
}
