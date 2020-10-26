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
class Record_4916 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4916: FirstName is Guillermo")
	void FirstNameOfRecord4916() {
		assertEquals("Guillermo", customers.get(4915).getFirstName());
	}

	@Test
	@DisplayName("Record 4916: LastName is Shure")
	void LastNameOfRecord4916() {
		assertEquals("Shure", customers.get(4915).getLastName());
	}

	@Test
	@DisplayName("Record 4916: Company is Davenport Airport")
	void CompanyOfRecord4916() {
		assertEquals("Davenport Airport", customers.get(4915).getCompany());
	}

	@Test
	@DisplayName("Record 4916: Address is 535 5th Ave")
	void AddressOfRecord4916() {
		assertEquals("535 5th Ave", customers.get(4915).getAddress());
	}

	@Test
	@DisplayName("Record 4916: City is New York")
	void CityOfRecord4916() {
		assertEquals("New York", customers.get(4915).getCity());
	}

	@Test
	@DisplayName("Record 4916: County is New York")
	void CountyOfRecord4916() {
		assertEquals("New York", customers.get(4915).getCounty());
	}

	@Test
	@DisplayName("Record 4916: State is NY")
	void StateOfRecord4916() {
		assertEquals("NY", customers.get(4915).getState());
	}

	@Test
	@DisplayName("Record 4916: ZIP is 10017")
	void ZIPOfRecord4916() {
		assertEquals("10017", customers.get(4915).getZIP());
	}

	@Test
	@DisplayName("Record 4916: Phone is 212-682-6138")
	void PhoneOfRecord4916() {
		assertEquals("212-682-6138", customers.get(4915).getPhone());
	}

	@Test
	@DisplayName("Record 4916: Fax is 212-682-9794")
	void FaxOfRecord4916() {
		assertEquals("212-682-9794", customers.get(4915).getFax());
	}

	@Test
	@DisplayName("Record 4916: Email is guillermo@shure.com")
	void EmailOfRecord4916() {
		assertEquals("guillermo@shure.com", customers.get(4915).getEmail());
	}

	@Test
	@DisplayName("Record 4916: Web is http://www.guillermoshure.com")
	void WebOfRecord4916() {
		assertEquals("http://www.guillermoshure.com", customers.get(4915).getWeb());
	}
}
