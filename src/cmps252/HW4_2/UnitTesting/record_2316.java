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

@Tag("20")
class Record_2316 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2316: FirstName is Devon")
	void FirstNameOfRecord2316() {
		assertEquals("Devon", customers.get(2315).getFirstName());
	}

	@Test
	@DisplayName("Record 2316: LastName is Pittman")
	void LastNameOfRecord2316() {
		assertEquals("Pittman", customers.get(2315).getLastName());
	}

	@Test
	@DisplayName("Record 2316: Company is Perel, Aaron Cpa")
	void CompanyOfRecord2316() {
		assertEquals("Perel, Aaron Cpa", customers.get(2315).getCompany());
	}

	@Test
	@DisplayName("Record 2316: Address is 243 Quigley Blvd  #-f")
	void AddressOfRecord2316() {
		assertEquals("243 Quigley Blvd  #-f", customers.get(2315).getAddress());
	}

	@Test
	@DisplayName("Record 2316: City is New Castle")
	void CityOfRecord2316() {
		assertEquals("New Castle", customers.get(2315).getCity());
	}

	@Test
	@DisplayName("Record 2316: County is New Castle")
	void CountyOfRecord2316() {
		assertEquals("New Castle", customers.get(2315).getCounty());
	}

	@Test
	@DisplayName("Record 2316: State is DE")
	void StateOfRecord2316() {
		assertEquals("DE", customers.get(2315).getState());
	}

	@Test
	@DisplayName("Record 2316: ZIP is 19720")
	void ZIPOfRecord2316() {
		assertEquals("19720", customers.get(2315).getZIP());
	}

	@Test
	@DisplayName("Record 2316: Phone is 302-323-3923")
	void PhoneOfRecord2316() {
		assertEquals("302-323-3923", customers.get(2315).getPhone());
	}

	@Test
	@DisplayName("Record 2316: Fax is 302-323-1717")
	void FaxOfRecord2316() {
		assertEquals("302-323-1717", customers.get(2315).getFax());
	}

	@Test
	@DisplayName("Record 2316: Email is devon@pittman.com")
	void EmailOfRecord2316() {
		assertEquals("devon@pittman.com", customers.get(2315).getEmail());
	}

	@Test
	@DisplayName("Record 2316: Web is http://www.devonpittman.com")
	void WebOfRecord2316() {
		assertEquals("http://www.devonpittman.com", customers.get(2315).getWeb());
	}
}
