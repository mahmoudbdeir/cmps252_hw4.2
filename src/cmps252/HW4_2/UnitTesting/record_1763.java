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

@Tag("38")
class Record_1763 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1763: FirstName is Jerry")
	void FirstNameOfRecord1763() {
		assertEquals("Jerry", customers.get(1762).getFirstName());
	}

	@Test
	@DisplayName("Record 1763: LastName is Woon")
	void LastNameOfRecord1763() {
		assertEquals("Woon", customers.get(1762).getLastName());
	}

	@Test
	@DisplayName("Record 1763: Company is Iveys  Action  Realty")
	void CompanyOfRecord1763() {
		assertEquals("Iveys  Action  Realty", customers.get(1762).getCompany());
	}

	@Test
	@DisplayName("Record 1763: Address is 1615 S Maryland Pky")
	void AddressOfRecord1763() {
		assertEquals("1615 S Maryland Pky", customers.get(1762).getAddress());
	}

	@Test
	@DisplayName("Record 1763: City is Las Vegas")
	void CityOfRecord1763() {
		assertEquals("Las Vegas", customers.get(1762).getCity());
	}

	@Test
	@DisplayName("Record 1763: County is Clark")
	void CountyOfRecord1763() {
		assertEquals("Clark", customers.get(1762).getCounty());
	}

	@Test
	@DisplayName("Record 1763: State is NV")
	void StateOfRecord1763() {
		assertEquals("NV", customers.get(1762).getState());
	}

	@Test
	@DisplayName("Record 1763: ZIP is 89104")
	void ZIPOfRecord1763() {
		assertEquals("89104", customers.get(1762).getZIP());
	}

	@Test
	@DisplayName("Record 1763: Phone is 702-477-0197")
	void PhoneOfRecord1763() {
		assertEquals("702-477-0197", customers.get(1762).getPhone());
	}

	@Test
	@DisplayName("Record 1763: Fax is 702-477-7952")
	void FaxOfRecord1763() {
		assertEquals("702-477-7952", customers.get(1762).getFax());
	}

	@Test
	@DisplayName("Record 1763: Email is jerry@woon.com")
	void EmailOfRecord1763() {
		assertEquals("jerry@woon.com", customers.get(1762).getEmail());
	}

	@Test
	@DisplayName("Record 1763: Web is http://www.jerrywoon.com")
	void WebOfRecord1763() {
		assertEquals("http://www.jerrywoon.com", customers.get(1762).getWeb());
	}
}
