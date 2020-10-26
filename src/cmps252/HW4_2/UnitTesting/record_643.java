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

@Tag("30")
class Record_643 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 643: FirstName is Willis")
	void FirstNameOfRecord643() {
		assertEquals("Willis", customers.get(642).getFirstName());
	}

	@Test
	@DisplayName("Record 643: LastName is Boers")
	void LastNameOfRecord643() {
		assertEquals("Boers", customers.get(642).getLastName());
	}

	@Test
	@DisplayName("Record 643: Company is H I T Inc")
	void CompanyOfRecord643() {
		assertEquals("H I T Inc", customers.get(642).getCompany());
	}

	@Test
	@DisplayName("Record 643: Address is 532 E 9th Ave")
	void AddressOfRecord643() {
		assertEquals("532 E 9th Ave", customers.get(642).getAddress());
	}

	@Test
	@DisplayName("Record 643: City is Anchorage")
	void CityOfRecord643() {
		assertEquals("Anchorage", customers.get(642).getCity());
	}

	@Test
	@DisplayName("Record 643: County is Anchorage")
	void CountyOfRecord643() {
		assertEquals("Anchorage", customers.get(642).getCounty());
	}

	@Test
	@DisplayName("Record 643: State is AK")
	void StateOfRecord643() {
		assertEquals("AK", customers.get(642).getState());
	}

	@Test
	@DisplayName("Record 643: ZIP is 99501")
	void ZIPOfRecord643() {
		assertEquals("99501", customers.get(642).getZIP());
	}

	@Test
	@DisplayName("Record 643: Phone is 907-276-3532")
	void PhoneOfRecord643() {
		assertEquals("907-276-3532", customers.get(642).getPhone());
	}

	@Test
	@DisplayName("Record 643: Fax is 907-276-7775")
	void FaxOfRecord643() {
		assertEquals("907-276-7775", customers.get(642).getFax());
	}

	@Test
	@DisplayName("Record 643: Email is willis@boers.com")
	void EmailOfRecord643() {
		assertEquals("willis@boers.com", customers.get(642).getEmail());
	}

	@Test
	@DisplayName("Record 643: Web is http://www.willisboers.com")
	void WebOfRecord643() {
		assertEquals("http://www.willisboers.com", customers.get(642).getWeb());
	}
}
