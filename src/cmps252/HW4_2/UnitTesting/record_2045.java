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

@Tag("17")
class Record_2045 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2045: FirstName is Quincy")
	void FirstNameOfRecord2045() {
		assertEquals("Quincy", customers.get(2044).getFirstName());
	}

	@Test
	@DisplayName("Record 2045: LastName is Wickware")
	void LastNameOfRecord2045() {
		assertEquals("Wickware", customers.get(2044).getLastName());
	}

	@Test
	@DisplayName("Record 2045: Company is Wilson & Wilson")
	void CompanyOfRecord2045() {
		assertEquals("Wilson & Wilson", customers.get(2044).getCompany());
	}

	@Test
	@DisplayName("Record 2045: Address is 777 Grant St  #-600")
	void AddressOfRecord2045() {
		assertEquals("777 Grant St  #-600", customers.get(2044).getAddress());
	}

	@Test
	@DisplayName("Record 2045: City is Denver")
	void CityOfRecord2045() {
		assertEquals("Denver", customers.get(2044).getCity());
	}

	@Test
	@DisplayName("Record 2045: County is Denver")
	void CountyOfRecord2045() {
		assertEquals("Denver", customers.get(2044).getCounty());
	}

	@Test
	@DisplayName("Record 2045: State is CO")
	void StateOfRecord2045() {
		assertEquals("CO", customers.get(2044).getState());
	}

	@Test
	@DisplayName("Record 2045: ZIP is 80203")
	void ZIPOfRecord2045() {
		assertEquals("80203", customers.get(2044).getZIP());
	}

	@Test
	@DisplayName("Record 2045: Phone is 303-832-8740")
	void PhoneOfRecord2045() {
		assertEquals("303-832-8740", customers.get(2044).getPhone());
	}

	@Test
	@DisplayName("Record 2045: Fax is 303-832-0627")
	void FaxOfRecord2045() {
		assertEquals("303-832-0627", customers.get(2044).getFax());
	}

	@Test
	@DisplayName("Record 2045: Email is quincy@wickware.com")
	void EmailOfRecord2045() {
		assertEquals("quincy@wickware.com", customers.get(2044).getEmail());
	}

	@Test
	@DisplayName("Record 2045: Web is http://www.quincywickware.com")
	void WebOfRecord2045() {
		assertEquals("http://www.quincywickware.com", customers.get(2044).getWeb());
	}
}
