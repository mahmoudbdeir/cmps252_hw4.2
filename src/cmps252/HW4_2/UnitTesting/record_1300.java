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
class Record_1300 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1300: FirstName is Terra")
	void FirstNameOfRecord1300() {
		assertEquals("Terra", customers.get(1299).getFirstName());
	}

	@Test
	@DisplayName("Record 1300: LastName is Denne")
	void LastNameOfRecord1300() {
		assertEquals("Denne", customers.get(1299).getLastName());
	}

	@Test
	@DisplayName("Record 1300: Company is Hartford Area Chamber Commrce")
	void CompanyOfRecord1300() {
		assertEquals("Hartford Area Chamber Commrce", customers.get(1299).getCompany());
	}

	@Test
	@DisplayName("Record 1300: Address is 930 Lippitt Dr")
	void AddressOfRecord1300() {
		assertEquals("930 Lippitt Dr", customers.get(1299).getAddress());
	}

	@Test
	@DisplayName("Record 1300: City is Albany")
	void CityOfRecord1300() {
		assertEquals("Albany", customers.get(1299).getCity());
	}

	@Test
	@DisplayName("Record 1300: County is Dougherty")
	void CountyOfRecord1300() {
		assertEquals("Dougherty", customers.get(1299).getCounty());
	}

	@Test
	@DisplayName("Record 1300: State is GA")
	void StateOfRecord1300() {
		assertEquals("GA", customers.get(1299).getState());
	}

	@Test
	@DisplayName("Record 1300: ZIP is 31701")
	void ZIPOfRecord1300() {
		assertEquals("31701", customers.get(1299).getZIP());
	}

	@Test
	@DisplayName("Record 1300: Phone is 229-431-0273")
	void PhoneOfRecord1300() {
		assertEquals("229-431-0273", customers.get(1299).getPhone());
	}

	@Test
	@DisplayName("Record 1300: Fax is 229-431-7741")
	void FaxOfRecord1300() {
		assertEquals("229-431-7741", customers.get(1299).getFax());
	}

	@Test
	@DisplayName("Record 1300: Email is terra@denne.com")
	void EmailOfRecord1300() {
		assertEquals("terra@denne.com", customers.get(1299).getEmail());
	}

	@Test
	@DisplayName("Record 1300: Web is http://www.terradenne.com")
	void WebOfRecord1300() {
		assertEquals("http://www.terradenne.com", customers.get(1299).getWeb());
	}
}
