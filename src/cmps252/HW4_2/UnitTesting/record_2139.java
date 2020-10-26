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

@Tag("20")
class Record_2139 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2139: FirstName is Keneth")
	void FirstNameOfRecord2139() {
		assertEquals("Keneth", customers.get(2138).getFirstName());
	}

	@Test
	@DisplayName("Record 2139: LastName is Nicolia")
	void LastNameOfRecord2139() {
		assertEquals("Nicolia", customers.get(2138).getLastName());
	}

	@Test
	@DisplayName("Record 2139: Company is San Diego County Empl Assn")
	void CompanyOfRecord2139() {
		assertEquals("San Diego County Empl Assn", customers.get(2138).getCompany());
	}

	@Test
	@DisplayName("Record 2139: Address is 644 Amsterdam Ave")
	void AddressOfRecord2139() {
		assertEquals("644 Amsterdam Ave", customers.get(2138).getAddress());
	}

	@Test
	@DisplayName("Record 2139: City is New York")
	void CityOfRecord2139() {
		assertEquals("New York", customers.get(2138).getCity());
	}

	@Test
	@DisplayName("Record 2139: County is New York")
	void CountyOfRecord2139() {
		assertEquals("New York", customers.get(2138).getCounty());
	}

	@Test
	@DisplayName("Record 2139: State is NY")
	void StateOfRecord2139() {
		assertEquals("NY", customers.get(2138).getState());
	}

	@Test
	@DisplayName("Record 2139: ZIP is 10025")
	void ZIPOfRecord2139() {
		assertEquals("10025", customers.get(2138).getZIP());
	}

	@Test
	@DisplayName("Record 2139: Phone is 212-874-1679")
	void PhoneOfRecord2139() {
		assertEquals("212-874-1679", customers.get(2138).getPhone());
	}

	@Test
	@DisplayName("Record 2139: Fax is 212-874-9979")
	void FaxOfRecord2139() {
		assertEquals("212-874-9979", customers.get(2138).getFax());
	}

	@Test
	@DisplayName("Record 2139: Email is keneth@nicolia.com")
	void EmailOfRecord2139() {
		assertEquals("keneth@nicolia.com", customers.get(2138).getEmail());
	}

	@Test
	@DisplayName("Record 2139: Web is http://www.kenethnicolia.com")
	void WebOfRecord2139() {
		assertEquals("http://www.kenethnicolia.com", customers.get(2138).getWeb());
	}
}
