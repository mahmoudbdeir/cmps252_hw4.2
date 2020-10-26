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
class Record_853 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 853: FirstName is Jess")
	void FirstNameOfRecord853() {
		assertEquals("Jess", customers.get(852).getFirstName());
	}

	@Test
	@DisplayName("Record 853: LastName is Hercules")
	void LastNameOfRecord853() {
		assertEquals("Hercules", customers.get(852).getLastName());
	}

	@Test
	@DisplayName("Record 853: Company is Hang Up Shoppes Inc")
	void CompanyOfRecord853() {
		assertEquals("Hang Up Shoppes Inc", customers.get(852).getCompany());
	}

	@Test
	@DisplayName("Record 853: Address is 2115 S State St")
	void AddressOfRecord853() {
		assertEquals("2115 S State St", customers.get(852).getAddress());
	}

	@Test
	@DisplayName("Record 853: City is Ann Arbor")
	void CityOfRecord853() {
		assertEquals("Ann Arbor", customers.get(852).getCity());
	}

	@Test
	@DisplayName("Record 853: County is Washtenaw")
	void CountyOfRecord853() {
		assertEquals("Washtenaw", customers.get(852).getCounty());
	}

	@Test
	@DisplayName("Record 853: State is MI")
	void StateOfRecord853() {
		assertEquals("MI", customers.get(852).getState());
	}

	@Test
	@DisplayName("Record 853: ZIP is 48104")
	void ZIPOfRecord853() {
		assertEquals("48104", customers.get(852).getZIP());
	}

	@Test
	@DisplayName("Record 853: Phone is 734-426-0446")
	void PhoneOfRecord853() {
		assertEquals("734-426-0446", customers.get(852).getPhone());
	}

	@Test
	@DisplayName("Record 853: Fax is 734-426-8515")
	void FaxOfRecord853() {
		assertEquals("734-426-8515", customers.get(852).getFax());
	}

	@Test
	@DisplayName("Record 853: Email is jess@hercules.com")
	void EmailOfRecord853() {
		assertEquals("jess@hercules.com", customers.get(852).getEmail());
	}

	@Test
	@DisplayName("Record 853: Web is http://www.jesshercules.com")
	void WebOfRecord853() {
		assertEquals("http://www.jesshercules.com", customers.get(852).getWeb());
	}
}
