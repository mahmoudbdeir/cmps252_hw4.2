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

@Tag("48")
class Record_2999 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2999: FirstName is Quentin")
	void FirstNameOfRecord2999() {
		assertEquals("Quentin", customers.get(2998).getFirstName());
	}

	@Test
	@DisplayName("Record 2999: LastName is Lehrian")
	void LastNameOfRecord2999() {
		assertEquals("Lehrian", customers.get(2998).getLastName());
	}

	@Test
	@DisplayName("Record 2999: Company is Bates, Douglas Thompson Iii")
	void CompanyOfRecord2999() {
		assertEquals("Bates, Douglas Thompson Iii", customers.get(2998).getCompany());
	}

	@Test
	@DisplayName("Record 2999: Address is 4120 E Truman Rd")
	void AddressOfRecord2999() {
		assertEquals("4120 E Truman Rd", customers.get(2998).getAddress());
	}

	@Test
	@DisplayName("Record 2999: City is Kansas City")
	void CityOfRecord2999() {
		assertEquals("Kansas City", customers.get(2998).getCity());
	}

	@Test
	@DisplayName("Record 2999: County is Jackson")
	void CountyOfRecord2999() {
		assertEquals("Jackson", customers.get(2998).getCounty());
	}

	@Test
	@DisplayName("Record 2999: State is MO")
	void StateOfRecord2999() {
		assertEquals("MO", customers.get(2998).getState());
	}

	@Test
	@DisplayName("Record 2999: ZIP is 64127")
	void ZIPOfRecord2999() {
		assertEquals("64127", customers.get(2998).getZIP());
	}

	@Test
	@DisplayName("Record 2999: Phone is 816-231-5432")
	void PhoneOfRecord2999() {
		assertEquals("816-231-5432", customers.get(2998).getPhone());
	}

	@Test
	@DisplayName("Record 2999: Fax is 816-231-0366")
	void FaxOfRecord2999() {
		assertEquals("816-231-0366", customers.get(2998).getFax());
	}

	@Test
	@DisplayName("Record 2999: Email is quentin@lehrian.com")
	void EmailOfRecord2999() {
		assertEquals("quentin@lehrian.com", customers.get(2998).getEmail());
	}

	@Test
	@DisplayName("Record 2999: Web is http://www.quentinlehrian.com")
	void WebOfRecord2999() {
		assertEquals("http://www.quentinlehrian.com", customers.get(2998).getWeb());
	}
}
