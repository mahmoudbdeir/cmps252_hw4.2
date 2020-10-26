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

@Tag("4")
class Record_4006 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4006: FirstName is Jerry")
	void FirstNameOfRecord4006() {
		assertEquals("Jerry", customers.get(4005).getFirstName());
	}

	@Test
	@DisplayName("Record 4006: LastName is Virtue")
	void LastNameOfRecord4006() {
		assertEquals("Virtue", customers.get(4005).getLastName());
	}

	@Test
	@DisplayName("Record 4006: Company is Adco Pro Cleaning Supply Co")
	void CompanyOfRecord4006() {
		assertEquals("Adco Pro Cleaning Supply Co", customers.get(4005).getCompany());
	}

	@Test
	@DisplayName("Record 4006: Address is 2120 G St")
	void AddressOfRecord4006() {
		assertEquals("2120 G St", customers.get(4005).getAddress());
	}

	@Test
	@DisplayName("Record 4006: City is Sacramento")
	void CityOfRecord4006() {
		assertEquals("Sacramento", customers.get(4005).getCity());
	}

	@Test
	@DisplayName("Record 4006: County is Sacramento")
	void CountyOfRecord4006() {
		assertEquals("Sacramento", customers.get(4005).getCounty());
	}

	@Test
	@DisplayName("Record 4006: State is CA")
	void StateOfRecord4006() {
		assertEquals("CA", customers.get(4005).getState());
	}

	@Test
	@DisplayName("Record 4006: ZIP is 95816")
	void ZIPOfRecord4006() {
		assertEquals("95816", customers.get(4005).getZIP());
	}

	@Test
	@DisplayName("Record 4006: Phone is 916-441-0182")
	void PhoneOfRecord4006() {
		assertEquals("916-441-0182", customers.get(4005).getPhone());
	}

	@Test
	@DisplayName("Record 4006: Fax is 916-441-5319")
	void FaxOfRecord4006() {
		assertEquals("916-441-5319", customers.get(4005).getFax());
	}

	@Test
	@DisplayName("Record 4006: Email is jerry@virtue.com")
	void EmailOfRecord4006() {
		assertEquals("jerry@virtue.com", customers.get(4005).getEmail());
	}

	@Test
	@DisplayName("Record 4006: Web is http://www.jerryvirtue.com")
	void WebOfRecord4006() {
		assertEquals("http://www.jerryvirtue.com", customers.get(4005).getWeb());
	}
}
