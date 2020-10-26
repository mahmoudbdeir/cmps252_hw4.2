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

@Tag("49")
class Record_4784 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4784: FirstName is Monte")
	void FirstNameOfRecord4784() {
		assertEquals("Monte", customers.get(4783).getFirstName());
	}

	@Test
	@DisplayName("Record 4784: LastName is Topping")
	void LastNameOfRecord4784() {
		assertEquals("Topping", customers.get(4783).getLastName());
	}

	@Test
	@DisplayName("Record 4784: Company is Wheatland Abstract Co")
	void CompanyOfRecord4784() {
		assertEquals("Wheatland Abstract Co", customers.get(4783).getCompany());
	}

	@Test
	@DisplayName("Record 4784: Address is 6850 Manhattan Blvd  #-202")
	void AddressOfRecord4784() {
		assertEquals("6850 Manhattan Blvd  #-202", customers.get(4783).getAddress());
	}

	@Test
	@DisplayName("Record 4784: City is Fort Worth")
	void CityOfRecord4784() {
		assertEquals("Fort Worth", customers.get(4783).getCity());
	}

	@Test
	@DisplayName("Record 4784: County is Tarrant")
	void CountyOfRecord4784() {
		assertEquals("Tarrant", customers.get(4783).getCounty());
	}

	@Test
	@DisplayName("Record 4784: State is TX")
	void StateOfRecord4784() {
		assertEquals("TX", customers.get(4783).getState());
	}

	@Test
	@DisplayName("Record 4784: ZIP is 76120")
	void ZIPOfRecord4784() {
		assertEquals("76120", customers.get(4783).getZIP());
	}

	@Test
	@DisplayName("Record 4784: Phone is 817-446-2384")
	void PhoneOfRecord4784() {
		assertEquals("817-446-2384", customers.get(4783).getPhone());
	}

	@Test
	@DisplayName("Record 4784: Fax is 817-446-5162")
	void FaxOfRecord4784() {
		assertEquals("817-446-5162", customers.get(4783).getFax());
	}

	@Test
	@DisplayName("Record 4784: Email is monte@topping.com")
	void EmailOfRecord4784() {
		assertEquals("monte@topping.com", customers.get(4783).getEmail());
	}

	@Test
	@DisplayName("Record 4784: Web is http://www.montetopping.com")
	void WebOfRecord4784() {
		assertEquals("http://www.montetopping.com", customers.get(4783).getWeb());
	}
}
