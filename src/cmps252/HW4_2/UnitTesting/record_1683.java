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

@Tag("19")
class Record_1683 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1683: FirstName is Liz")
	void FirstNameOfRecord1683() {
		assertEquals("Liz", customers.get(1682).getFirstName());
	}

	@Test
	@DisplayName("Record 1683: LastName is Deus")
	void LastNameOfRecord1683() {
		assertEquals("Deus", customers.get(1682).getLastName());
	}

	@Test
	@DisplayName("Record 1683: Company is Checks & Balances")
	void CompanyOfRecord1683() {
		assertEquals("Checks & Balances", customers.get(1682).getCompany());
	}

	@Test
	@DisplayName("Record 1683: Address is 530 Center St Ne")
	void AddressOfRecord1683() {
		assertEquals("530 Center St Ne", customers.get(1682).getAddress());
	}

	@Test
	@DisplayName("Record 1683: City is Salem")
	void CityOfRecord1683() {
		assertEquals("Salem", customers.get(1682).getCity());
	}

	@Test
	@DisplayName("Record 1683: County is Marion")
	void CountyOfRecord1683() {
		assertEquals("Marion", customers.get(1682).getCounty());
	}

	@Test
	@DisplayName("Record 1683: State is OR")
	void StateOfRecord1683() {
		assertEquals("OR", customers.get(1682).getState());
	}

	@Test
	@DisplayName("Record 1683: ZIP is 97301")
	void ZIPOfRecord1683() {
		assertEquals("97301", customers.get(1682).getZIP());
	}

	@Test
	@DisplayName("Record 1683: Phone is 503-371-5906")
	void PhoneOfRecord1683() {
		assertEquals("503-371-5906", customers.get(1682).getPhone());
	}

	@Test
	@DisplayName("Record 1683: Fax is 503-371-5133")
	void FaxOfRecord1683() {
		assertEquals("503-371-5133", customers.get(1682).getFax());
	}

	@Test
	@DisplayName("Record 1683: Email is liz@deus.com")
	void EmailOfRecord1683() {
		assertEquals("liz@deus.com", customers.get(1682).getEmail());
	}

	@Test
	@DisplayName("Record 1683: Web is http://www.lizdeus.com")
	void WebOfRecord1683() {
		assertEquals("http://www.lizdeus.com", customers.get(1682).getWeb());
	}
}
