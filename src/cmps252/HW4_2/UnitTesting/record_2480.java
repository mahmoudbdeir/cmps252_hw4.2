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
class Record_2480 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2480: FirstName is Rodrick")
	void FirstNameOfRecord2480() {
		assertEquals("Rodrick", customers.get(2479).getFirstName());
	}

	@Test
	@DisplayName("Record 2480: LastName is Damrell")
	void LastNameOfRecord2480() {
		assertEquals("Damrell", customers.get(2479).getLastName());
	}

	@Test
	@DisplayName("Record 2480: Company is Robert D Newell Jr Pa")
	void CompanyOfRecord2480() {
		assertEquals("Robert D Newell Jr Pa", customers.get(2479).getCompany());
	}

	@Test
	@DisplayName("Record 2480: Address is 940 E 67th St")
	void AddressOfRecord2480() {
		assertEquals("940 E 67th St", customers.get(2479).getAddress());
	}

	@Test
	@DisplayName("Record 2480: City is Cleveland")
	void CityOfRecord2480() {
		assertEquals("Cleveland", customers.get(2479).getCity());
	}

	@Test
	@DisplayName("Record 2480: County is Cuyahoga")
	void CountyOfRecord2480() {
		assertEquals("Cuyahoga", customers.get(2479).getCounty());
	}

	@Test
	@DisplayName("Record 2480: State is OH")
	void StateOfRecord2480() {
		assertEquals("OH", customers.get(2479).getState());
	}

	@Test
	@DisplayName("Record 2480: ZIP is 44103")
	void ZIPOfRecord2480() {
		assertEquals("44103", customers.get(2479).getZIP());
	}

	@Test
	@DisplayName("Record 2480: Phone is 216-431-9696")
	void PhoneOfRecord2480() {
		assertEquals("216-431-9696", customers.get(2479).getPhone());
	}

	@Test
	@DisplayName("Record 2480: Fax is 216-431-5652")
	void FaxOfRecord2480() {
		assertEquals("216-431-5652", customers.get(2479).getFax());
	}

	@Test
	@DisplayName("Record 2480: Email is rodrick@damrell.com")
	void EmailOfRecord2480() {
		assertEquals("rodrick@damrell.com", customers.get(2479).getEmail());
	}

	@Test
	@DisplayName("Record 2480: Web is http://www.rodrickdamrell.com")
	void WebOfRecord2480() {
		assertEquals("http://www.rodrickdamrell.com", customers.get(2479).getWeb());
	}
}
