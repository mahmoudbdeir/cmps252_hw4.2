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

@Tag("18")
class Record_2223 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2223: FirstName is Erlinda")
	void FirstNameOfRecord2223() {
		assertEquals("Erlinda", customers.get(2222).getFirstName());
	}

	@Test
	@DisplayName("Record 2223: LastName is Winek")
	void LastNameOfRecord2223() {
		assertEquals("Winek", customers.get(2222).getLastName());
	}

	@Test
	@DisplayName("Record 2223: Company is Ashland Cheml Inc Suby Ashland")
	void CompanyOfRecord2223() {
		assertEquals("Ashland Cheml Inc Suby Ashland", customers.get(2222).getCompany());
	}

	@Test
	@DisplayName("Record 2223: Address is 4667 Somerton Rd  #-a")
	void AddressOfRecord2223() {
		assertEquals("4667 Somerton Rd  #-a", customers.get(2222).getAddress());
	}

	@Test
	@DisplayName("Record 2223: City is Feasterville Trevose")
	void CityOfRecord2223() {
		assertEquals("Feasterville Trevose", customers.get(2222).getCity());
	}

	@Test
	@DisplayName("Record 2223: County is Bucks")
	void CountyOfRecord2223() {
		assertEquals("Bucks", customers.get(2222).getCounty());
	}

	@Test
	@DisplayName("Record 2223: State is PA")
	void StateOfRecord2223() {
		assertEquals("PA", customers.get(2222).getState());
	}

	@Test
	@DisplayName("Record 2223: ZIP is 19053")
	void ZIPOfRecord2223() {
		assertEquals("19053", customers.get(2222).getZIP());
	}

	@Test
	@DisplayName("Record 2223: Phone is 215-364-9502")
	void PhoneOfRecord2223() {
		assertEquals("215-364-9502", customers.get(2222).getPhone());
	}

	@Test
	@DisplayName("Record 2223: Fax is 215-364-7148")
	void FaxOfRecord2223() {
		assertEquals("215-364-7148", customers.get(2222).getFax());
	}

	@Test
	@DisplayName("Record 2223: Email is erlinda@winek.com")
	void EmailOfRecord2223() {
		assertEquals("erlinda@winek.com", customers.get(2222).getEmail());
	}

	@Test
	@DisplayName("Record 2223: Web is http://www.erlindawinek.com")
	void WebOfRecord2223() {
		assertEquals("http://www.erlindawinek.com", customers.get(2222).getWeb());
	}
}
