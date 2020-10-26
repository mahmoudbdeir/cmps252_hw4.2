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

@Tag("34")
class Record_1695 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1695: FirstName is Julie")
	void FirstNameOfRecord1695() {
		assertEquals("Julie", customers.get(1694).getFirstName());
	}

	@Test
	@DisplayName("Record 1695: LastName is Schreyer")
	void LastNameOfRecord1695() {
		assertEquals("Schreyer", customers.get(1694).getLastName());
	}

	@Test
	@DisplayName("Record 1695: Company is Red Roof Inns")
	void CompanyOfRecord1695() {
		assertEquals("Red Roof Inns", customers.get(1694).getCompany());
	}

	@Test
	@DisplayName("Record 1695: Address is 1710 Fair Lawn Ave")
	void AddressOfRecord1695() {
		assertEquals("1710 Fair Lawn Ave", customers.get(1694).getAddress());
	}

	@Test
	@DisplayName("Record 1695: City is Fair Lawn")
	void CityOfRecord1695() {
		assertEquals("Fair Lawn", customers.get(1694).getCity());
	}

	@Test
	@DisplayName("Record 1695: County is Bergen")
	void CountyOfRecord1695() {
		assertEquals("Bergen", customers.get(1694).getCounty());
	}

	@Test
	@DisplayName("Record 1695: State is NJ")
	void StateOfRecord1695() {
		assertEquals("NJ", customers.get(1694).getState());
	}

	@Test
	@DisplayName("Record 1695: ZIP is 7410")
	void ZIPOfRecord1695() {
		assertEquals("7410", customers.get(1694).getZIP());
	}

	@Test
	@DisplayName("Record 1695: Phone is 201-796-6412")
	void PhoneOfRecord1695() {
		assertEquals("201-796-6412", customers.get(1694).getPhone());
	}

	@Test
	@DisplayName("Record 1695: Fax is 201-796-7347")
	void FaxOfRecord1695() {
		assertEquals("201-796-7347", customers.get(1694).getFax());
	}

	@Test
	@DisplayName("Record 1695: Email is julie@schreyer.com")
	void EmailOfRecord1695() {
		assertEquals("julie@schreyer.com", customers.get(1694).getEmail());
	}

	@Test
	@DisplayName("Record 1695: Web is http://www.julieschreyer.com")
	void WebOfRecord1695() {
		assertEquals("http://www.julieschreyer.com", customers.get(1694).getWeb());
	}
}
