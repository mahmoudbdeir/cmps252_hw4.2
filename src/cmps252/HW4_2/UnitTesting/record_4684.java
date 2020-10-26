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

@Tag("22")
class Record_4684 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4684: FirstName is Mitch")
	void FirstNameOfRecord4684() {
		assertEquals("Mitch", customers.get(4683).getFirstName());
	}

	@Test
	@DisplayName("Record 4684: LastName is Fehr")
	void LastNameOfRecord4684() {
		assertEquals("Fehr", customers.get(4683).getLastName());
	}

	@Test
	@DisplayName("Record 4684: Company is Fremont Beverages Inc")
	void CompanyOfRecord4684() {
		assertEquals("Fremont Beverages Inc", customers.get(4683).getCompany());
	}

	@Test
	@DisplayName("Record 4684: Address is 303 E 17th Ave  #-108")
	void AddressOfRecord4684() {
		assertEquals("303 E 17th Ave  #-108", customers.get(4683).getAddress());
	}

	@Test
	@DisplayName("Record 4684: City is Denver")
	void CityOfRecord4684() {
		assertEquals("Denver", customers.get(4683).getCity());
	}

	@Test
	@DisplayName("Record 4684: County is Denver")
	void CountyOfRecord4684() {
		assertEquals("Denver", customers.get(4683).getCounty());
	}

	@Test
	@DisplayName("Record 4684: State is CO")
	void StateOfRecord4684() {
		assertEquals("CO", customers.get(4683).getState());
	}

	@Test
	@DisplayName("Record 4684: ZIP is 80203")
	void ZIPOfRecord4684() {
		assertEquals("80203", customers.get(4683).getZIP());
	}

	@Test
	@DisplayName("Record 4684: Phone is 303-863-4309")
	void PhoneOfRecord4684() {
		assertEquals("303-863-4309", customers.get(4683).getPhone());
	}

	@Test
	@DisplayName("Record 4684: Fax is 303-863-5887")
	void FaxOfRecord4684() {
		assertEquals("303-863-5887", customers.get(4683).getFax());
	}

	@Test
	@DisplayName("Record 4684: Email is mitch@fehr.com")
	void EmailOfRecord4684() {
		assertEquals("mitch@fehr.com", customers.get(4683).getEmail());
	}

	@Test
	@DisplayName("Record 4684: Web is http://www.mitchfehr.com")
	void WebOfRecord4684() {
		assertEquals("http://www.mitchfehr.com", customers.get(4683).getWeb());
	}
}
