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
class Record_1800 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1800: FirstName is Holly")
	void FirstNameOfRecord1800() {
		assertEquals("Holly", customers.get(1799).getFirstName());
	}

	@Test
	@DisplayName("Record 1800: LastName is Gentille")
	void LastNameOfRecord1800() {
		assertEquals("Gentille", customers.get(1799).getLastName());
	}

	@Test
	@DisplayName("Record 1800: Company is Thiensville Lumber")
	void CompanyOfRecord1800() {
		assertEquals("Thiensville Lumber", customers.get(1799).getCompany());
	}

	@Test
	@DisplayName("Record 1800: Address is 11000 Cedar Ave")
	void AddressOfRecord1800() {
		assertEquals("11000 Cedar Ave", customers.get(1799).getAddress());
	}

	@Test
	@DisplayName("Record 1800: City is Cleveland")
	void CityOfRecord1800() {
		assertEquals("Cleveland", customers.get(1799).getCity());
	}

	@Test
	@DisplayName("Record 1800: County is Cuyahoga")
	void CountyOfRecord1800() {
		assertEquals("Cuyahoga", customers.get(1799).getCounty());
	}

	@Test
	@DisplayName("Record 1800: State is OH")
	void StateOfRecord1800() {
		assertEquals("OH", customers.get(1799).getState());
	}

	@Test
	@DisplayName("Record 1800: ZIP is 44106")
	void ZIPOfRecord1800() {
		assertEquals("44106", customers.get(1799).getZIP());
	}

	@Test
	@DisplayName("Record 1800: Phone is 216-421-4025")
	void PhoneOfRecord1800() {
		assertEquals("216-421-4025", customers.get(1799).getPhone());
	}

	@Test
	@DisplayName("Record 1800: Fax is 216-421-6492")
	void FaxOfRecord1800() {
		assertEquals("216-421-6492", customers.get(1799).getFax());
	}

	@Test
	@DisplayName("Record 1800: Email is holly@gentille.com")
	void EmailOfRecord1800() {
		assertEquals("holly@gentille.com", customers.get(1799).getEmail());
	}

	@Test
	@DisplayName("Record 1800: Web is http://www.hollygentille.com")
	void WebOfRecord1800() {
		assertEquals("http://www.hollygentille.com", customers.get(1799).getWeb());
	}
}
