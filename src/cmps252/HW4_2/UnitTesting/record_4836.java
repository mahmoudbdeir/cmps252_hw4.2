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

@Tag("24")
class Record_4836 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4836: FirstName is Terence")
	void FirstNameOfRecord4836() {
		assertEquals("Terence", customers.get(4835).getFirstName());
	}

	@Test
	@DisplayName("Record 4836: LastName is Lathrum")
	void LastNameOfRecord4836() {
		assertEquals("Lathrum", customers.get(4835).getLastName());
	}

	@Test
	@DisplayName("Record 4836: Company is O A Inc")
	void CompanyOfRecord4836() {
		assertEquals("O A Inc", customers.get(4835).getCompany());
	}

	@Test
	@DisplayName("Record 4836: Address is 9820 Drysdale Ln")
	void AddressOfRecord4836() {
		assertEquals("9820 Drysdale Ln", customers.get(4835).getAddress());
	}

	@Test
	@DisplayName("Record 4836: City is Houston")
	void CityOfRecord4836() {
		assertEquals("Houston", customers.get(4835).getCity());
	}

	@Test
	@DisplayName("Record 4836: County is Harris")
	void CountyOfRecord4836() {
		assertEquals("Harris", customers.get(4835).getCounty());
	}

	@Test
	@DisplayName("Record 4836: State is TX")
	void StateOfRecord4836() {
		assertEquals("TX", customers.get(4835).getState());
	}

	@Test
	@DisplayName("Record 4836: ZIP is 77041")
	void ZIPOfRecord4836() {
		assertEquals("77041", customers.get(4835).getZIP());
	}

	@Test
	@DisplayName("Record 4836: Phone is 713-895-4153")
	void PhoneOfRecord4836() {
		assertEquals("713-895-4153", customers.get(4835).getPhone());
	}

	@Test
	@DisplayName("Record 4836: Fax is 713-895-4084")
	void FaxOfRecord4836() {
		assertEquals("713-895-4084", customers.get(4835).getFax());
	}

	@Test
	@DisplayName("Record 4836: Email is terence@lathrum.com")
	void EmailOfRecord4836() {
		assertEquals("terence@lathrum.com", customers.get(4835).getEmail());
	}

	@Test
	@DisplayName("Record 4836: Web is http://www.terencelathrum.com")
	void WebOfRecord4836() {
		assertEquals("http://www.terencelathrum.com", customers.get(4835).getWeb());
	}
}
