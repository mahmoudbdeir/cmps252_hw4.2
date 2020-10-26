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

@Tag("10")
class Record_1508 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1508: FirstName is Felix")
	void FirstNameOfRecord1508() {
		assertEquals("Felix", customers.get(1507).getFirstName());
	}

	@Test
	@DisplayName("Record 1508: LastName is Punch")
	void LastNameOfRecord1508() {
		assertEquals("Punch", customers.get(1507).getLastName());
	}

	@Test
	@DisplayName("Record 1508: Company is Hawaii Pest Control")
	void CompanyOfRecord1508() {
		assertEquals("Hawaii Pest Control", customers.get(1507).getCompany());
	}

	@Test
	@DisplayName("Record 1508: Address is 825 W 6th Ave")
	void AddressOfRecord1508() {
		assertEquals("825 W 6th Ave", customers.get(1507).getAddress());
	}

	@Test
	@DisplayName("Record 1508: City is Anchorage")
	void CityOfRecord1508() {
		assertEquals("Anchorage", customers.get(1507).getCity());
	}

	@Test
	@DisplayName("Record 1508: County is Anchorage")
	void CountyOfRecord1508() {
		assertEquals("Anchorage", customers.get(1507).getCounty());
	}

	@Test
	@DisplayName("Record 1508: State is AK")
	void StateOfRecord1508() {
		assertEquals("AK", customers.get(1507).getState());
	}

	@Test
	@DisplayName("Record 1508: ZIP is 99501")
	void ZIPOfRecord1508() {
		assertEquals("99501", customers.get(1507).getZIP());
	}

	@Test
	@DisplayName("Record 1508: Phone is 907-276-2718")
	void PhoneOfRecord1508() {
		assertEquals("907-276-2718", customers.get(1507).getPhone());
	}

	@Test
	@DisplayName("Record 1508: Fax is 907-276-5872")
	void FaxOfRecord1508() {
		assertEquals("907-276-5872", customers.get(1507).getFax());
	}

	@Test
	@DisplayName("Record 1508: Email is felix@punch.com")
	void EmailOfRecord1508() {
		assertEquals("felix@punch.com", customers.get(1507).getEmail());
	}

	@Test
	@DisplayName("Record 1508: Web is http://www.felixpunch.com")
	void WebOfRecord1508() {
		assertEquals("http://www.felixpunch.com", customers.get(1507).getWeb());
	}
}
