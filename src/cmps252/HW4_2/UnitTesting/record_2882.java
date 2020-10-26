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

@Tag("28")
class Record_2882 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2882: FirstName is Shad")
	void FirstNameOfRecord2882() {
		assertEquals("Shad", customers.get(2881).getFirstName());
	}

	@Test
	@DisplayName("Record 2882: LastName is Pagnello")
	void LastNameOfRecord2882() {
		assertEquals("Pagnello", customers.get(2881).getLastName());
	}

	@Test
	@DisplayName("Record 2882: Company is Michigan Colprovia Company")
	void CompanyOfRecord2882() {
		assertEquals("Michigan Colprovia Company", customers.get(2881).getCompany());
	}

	@Test
	@DisplayName("Record 2882: Address is 221 Jefferson Blvd")
	void AddressOfRecord2882() {
		assertEquals("221 Jefferson Blvd", customers.get(2881).getAddress());
	}

	@Test
	@DisplayName("Record 2882: City is Warwick")
	void CityOfRecord2882() {
		assertEquals("Warwick", customers.get(2881).getCity());
	}

	@Test
	@DisplayName("Record 2882: County is Kent")
	void CountyOfRecord2882() {
		assertEquals("Kent", customers.get(2881).getCounty());
	}

	@Test
	@DisplayName("Record 2882: State is RI")
	void StateOfRecord2882() {
		assertEquals("RI", customers.get(2881).getState());
	}

	@Test
	@DisplayName("Record 2882: ZIP is 2888")
	void ZIPOfRecord2882() {
		assertEquals("2888", customers.get(2881).getZIP());
	}

	@Test
	@DisplayName("Record 2882: Phone is 401-738-2957")
	void PhoneOfRecord2882() {
		assertEquals("401-738-2957", customers.get(2881).getPhone());
	}

	@Test
	@DisplayName("Record 2882: Fax is 401-738-8477")
	void FaxOfRecord2882() {
		assertEquals("401-738-8477", customers.get(2881).getFax());
	}

	@Test
	@DisplayName("Record 2882: Email is shad@pagnello.com")
	void EmailOfRecord2882() {
		assertEquals("shad@pagnello.com", customers.get(2881).getEmail());
	}

	@Test
	@DisplayName("Record 2882: Web is http://www.shadpagnello.com")
	void WebOfRecord2882() {
		assertEquals("http://www.shadpagnello.com", customers.get(2881).getWeb());
	}
}
