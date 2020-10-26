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

@Tag("12")
class Record_2419 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2419: FirstName is Natalia")
	void FirstNameOfRecord2419() {
		assertEquals("Natalia", customers.get(2418).getFirstName());
	}

	@Test
	@DisplayName("Record 2419: LastName is Leverson")
	void LastNameOfRecord2419() {
		assertEquals("Leverson", customers.get(2418).getLastName());
	}

	@Test
	@DisplayName("Record 2419: Company is Scrma")
	void CompanyOfRecord2419() {
		assertEquals("Scrma", customers.get(2418).getCompany());
	}

	@Test
	@DisplayName("Record 2419: Address is 947 S Main St")
	void AddressOfRecord2419() {
		assertEquals("947 S Main St", customers.get(2418).getAddress());
	}

	@Test
	@DisplayName("Record 2419: City is Kalispell")
	void CityOfRecord2419() {
		assertEquals("Kalispell", customers.get(2418).getCity());
	}

	@Test
	@DisplayName("Record 2419: County is Flathead")
	void CountyOfRecord2419() {
		assertEquals("Flathead", customers.get(2418).getCounty());
	}

	@Test
	@DisplayName("Record 2419: State is MT")
	void StateOfRecord2419() {
		assertEquals("MT", customers.get(2418).getState());
	}

	@Test
	@DisplayName("Record 2419: ZIP is 59901")
	void ZIPOfRecord2419() {
		assertEquals("59901", customers.get(2418).getZIP());
	}

	@Test
	@DisplayName("Record 2419: Phone is 406-257-4723")
	void PhoneOfRecord2419() {
		assertEquals("406-257-4723", customers.get(2418).getPhone());
	}

	@Test
	@DisplayName("Record 2419: Fax is 406-257-8229")
	void FaxOfRecord2419() {
		assertEquals("406-257-8229", customers.get(2418).getFax());
	}

	@Test
	@DisplayName("Record 2419: Email is natalia@leverson.com")
	void EmailOfRecord2419() {
		assertEquals("natalia@leverson.com", customers.get(2418).getEmail());
	}

	@Test
	@DisplayName("Record 2419: Web is http://www.natalialeverson.com")
	void WebOfRecord2419() {
		assertEquals("http://www.natalialeverson.com", customers.get(2418).getWeb());
	}
}
