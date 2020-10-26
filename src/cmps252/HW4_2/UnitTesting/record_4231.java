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

@Tag("3")
class Record_4231 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4231: FirstName is Evan")
	void FirstNameOfRecord4231() {
		assertEquals("Evan", customers.get(4230).getFirstName());
	}

	@Test
	@DisplayName("Record 4231: LastName is Bundley")
	void LastNameOfRecord4231() {
		assertEquals("Bundley", customers.get(4230).getLastName());
	}

	@Test
	@DisplayName("Record 4231: Company is Ford, Alfred G Esq")
	void CompanyOfRecord4231() {
		assertEquals("Ford, Alfred G Esq", customers.get(4230).getCompany());
	}

	@Test
	@DisplayName("Record 4231: Address is 30 Two Bridges Rd")
	void AddressOfRecord4231() {
		assertEquals("30 Two Bridges Rd", customers.get(4230).getAddress());
	}

	@Test
	@DisplayName("Record 4231: City is Fairfield")
	void CityOfRecord4231() {
		assertEquals("Fairfield", customers.get(4230).getCity());
	}

	@Test
	@DisplayName("Record 4231: County is Essex")
	void CountyOfRecord4231() {
		assertEquals("Essex", customers.get(4230).getCounty());
	}

	@Test
	@DisplayName("Record 4231: State is NJ")
	void StateOfRecord4231() {
		assertEquals("NJ", customers.get(4230).getState());
	}

	@Test
	@DisplayName("Record 4231: ZIP is 7004")
	void ZIPOfRecord4231() {
		assertEquals("7004", customers.get(4230).getZIP());
	}

	@Test
	@DisplayName("Record 4231: Phone is 973-575-2427")
	void PhoneOfRecord4231() {
		assertEquals("973-575-2427", customers.get(4230).getPhone());
	}

	@Test
	@DisplayName("Record 4231: Fax is 973-575-8444")
	void FaxOfRecord4231() {
		assertEquals("973-575-8444", customers.get(4230).getFax());
	}

	@Test
	@DisplayName("Record 4231: Email is evan@bundley.com")
	void EmailOfRecord4231() {
		assertEquals("evan@bundley.com", customers.get(4230).getEmail());
	}

	@Test
	@DisplayName("Record 4231: Web is http://www.evanbundley.com")
	void WebOfRecord4231() {
		assertEquals("http://www.evanbundley.com", customers.get(4230).getWeb());
	}
}
