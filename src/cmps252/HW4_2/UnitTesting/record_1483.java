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
class Record_1483 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1483: FirstName is Pamela")
	void FirstNameOfRecord1483() {
		assertEquals("Pamela", customers.get(1482).getFirstName());
	}

	@Test
	@DisplayName("Record 1483: LastName is Hett")
	void LastNameOfRecord1483() {
		assertEquals("Hett", customers.get(1482).getLastName());
	}

	@Test
	@DisplayName("Record 1483: Company is Video Connection")
	void CompanyOfRecord1483() {
		assertEquals("Video Connection", customers.get(1482).getCompany());
	}

	@Test
	@DisplayName("Record 1483: Address is 7100 San Bernardo Ave")
	void AddressOfRecord1483() {
		assertEquals("7100 San Bernardo Ave", customers.get(1482).getAddress());
	}

	@Test
	@DisplayName("Record 1483: City is Laredo")
	void CityOfRecord1483() {
		assertEquals("Laredo", customers.get(1482).getCity());
	}

	@Test
	@DisplayName("Record 1483: County is Webb")
	void CountyOfRecord1483() {
		assertEquals("Webb", customers.get(1482).getCounty());
	}

	@Test
	@DisplayName("Record 1483: State is TX")
	void StateOfRecord1483() {
		assertEquals("TX", customers.get(1482).getState());
	}

	@Test
	@DisplayName("Record 1483: ZIP is 78041")
	void ZIPOfRecord1483() {
		assertEquals("78041", customers.get(1482).getZIP());
	}

	@Test
	@DisplayName("Record 1483: Phone is 956-725-0664")
	void PhoneOfRecord1483() {
		assertEquals("956-725-0664", customers.get(1482).getPhone());
	}

	@Test
	@DisplayName("Record 1483: Fax is 956-725-1823")
	void FaxOfRecord1483() {
		assertEquals("956-725-1823", customers.get(1482).getFax());
	}

	@Test
	@DisplayName("Record 1483: Email is pamela@hett.com")
	void EmailOfRecord1483() {
		assertEquals("pamela@hett.com", customers.get(1482).getEmail());
	}

	@Test
	@DisplayName("Record 1483: Web is http://www.pamelahett.com")
	void WebOfRecord1483() {
		assertEquals("http://www.pamelahett.com", customers.get(1482).getWeb());
	}
}
