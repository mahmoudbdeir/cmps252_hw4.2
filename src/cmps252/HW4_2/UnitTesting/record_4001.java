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

@Tag("9")
class Record_4001 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4001: FirstName is Gaston")
	void FirstNameOfRecord4001() {
		assertEquals("Gaston", customers.get(4000).getFirstName());
	}

	@Test
	@DisplayName("Record 4001: LastName is Ackroyd")
	void LastNameOfRecord4001() {
		assertEquals("Ackroyd", customers.get(4000).getLastName());
	}

	@Test
	@DisplayName("Record 4001: Company is Crathern & Smith Inc")
	void CompanyOfRecord4001() {
		assertEquals("Crathern & Smith Inc", customers.get(4000).getCompany());
	}

	@Test
	@DisplayName("Record 4001: Address is 24 Spielman Rd")
	void AddressOfRecord4001() {
		assertEquals("24 Spielman Rd", customers.get(4000).getAddress());
	}

	@Test
	@DisplayName("Record 4001: City is Fairfield")
	void CityOfRecord4001() {
		assertEquals("Fairfield", customers.get(4000).getCity());
	}

	@Test
	@DisplayName("Record 4001: County is Essex")
	void CountyOfRecord4001() {
		assertEquals("Essex", customers.get(4000).getCounty());
	}

	@Test
	@DisplayName("Record 4001: State is NJ")
	void StateOfRecord4001() {
		assertEquals("NJ", customers.get(4000).getState());
	}

	@Test
	@DisplayName("Record 4001: ZIP is 7004")
	void ZIPOfRecord4001() {
		assertEquals("7004", customers.get(4000).getZIP());
	}

	@Test
	@DisplayName("Record 4001: Phone is 973-227-2993")
	void PhoneOfRecord4001() {
		assertEquals("973-227-2993", customers.get(4000).getPhone());
	}

	@Test
	@DisplayName("Record 4001: Fax is 973-227-3853")
	void FaxOfRecord4001() {
		assertEquals("973-227-3853", customers.get(4000).getFax());
	}

	@Test
	@DisplayName("Record 4001: Email is gaston@ackroyd.com")
	void EmailOfRecord4001() {
		assertEquals("gaston@ackroyd.com", customers.get(4000).getEmail());
	}

	@Test
	@DisplayName("Record 4001: Web is http://www.gastonackroyd.com")
	void WebOfRecord4001() {
		assertEquals("http://www.gastonackroyd.com", customers.get(4000).getWeb());
	}
}
