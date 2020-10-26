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

@Tag("46")
class Record_4925 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4925: FirstName is Marian")
	void FirstNameOfRecord4925() {
		assertEquals("Marian", customers.get(4924).getFirstName());
	}

	@Test
	@DisplayName("Record 4925: LastName is Isbister")
	void LastNameOfRecord4925() {
		assertEquals("Isbister", customers.get(4924).getLastName());
	}

	@Test
	@DisplayName("Record 4925: Company is Funk, David M Jr")
	void CompanyOfRecord4925() {
		assertEquals("Funk, David M Jr", customers.get(4924).getCompany());
	}

	@Test
	@DisplayName("Record 4925: Address is 354 ysenhower Pky")
	void AddressOfRecord4925() {
		assertEquals("354 ysenhower Pky", customers.get(4924).getAddress());
	}

	@Test
	@DisplayName("Record 4925: City is Livingston")
	void CityOfRecord4925() {
		assertEquals("Livingston", customers.get(4924).getCity());
	}

	@Test
	@DisplayName("Record 4925: County is Essex")
	void CountyOfRecord4925() {
		assertEquals("Essex", customers.get(4924).getCounty());
	}

	@Test
	@DisplayName("Record 4925: State is NJ")
	void StateOfRecord4925() {
		assertEquals("NJ", customers.get(4924).getState());
	}

	@Test
	@DisplayName("Record 4925: ZIP is 7039")
	void ZIPOfRecord4925() {
		assertEquals("7039", customers.get(4924).getZIP());
	}

	@Test
	@DisplayName("Record 4925: Phone is 973-533-3597")
	void PhoneOfRecord4925() {
		assertEquals("973-533-3597", customers.get(4924).getPhone());
	}

	@Test
	@DisplayName("Record 4925: Fax is 973-533-3252")
	void FaxOfRecord4925() {
		assertEquals("973-533-3252", customers.get(4924).getFax());
	}

	@Test
	@DisplayName("Record 4925: Email is marian@isbister.com")
	void EmailOfRecord4925() {
		assertEquals("marian@isbister.com", customers.get(4924).getEmail());
	}

	@Test
	@DisplayName("Record 4925: Web is http://www.marianisbister.com")
	void WebOfRecord4925() {
		assertEquals("http://www.marianisbister.com", customers.get(4924).getWeb());
	}
}
