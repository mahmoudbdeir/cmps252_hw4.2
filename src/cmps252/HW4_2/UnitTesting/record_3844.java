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

@Tag("1")
class Record_3844 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3844: FirstName is Michale")
	void FirstNameOfRecord3844() {
		assertEquals("Michale", customers.get(3843).getFirstName());
	}

	@Test
	@DisplayName("Record 3844: LastName is Mcray")
	void LastNameOfRecord3844() {
		assertEquals("Mcray", customers.get(3843).getLastName());
	}

	@Test
	@DisplayName("Record 3844: Company is Fywell, Murray J Esq")
	void CompanyOfRecord3844() {
		assertEquals("Fywell, Murray J Esq", customers.get(3843).getCompany());
	}

	@Test
	@DisplayName("Record 3844: Address is 2284 S Ballenger Hwy")
	void AddressOfRecord3844() {
		assertEquals("2284 S Ballenger Hwy", customers.get(3843).getAddress());
	}

	@Test
	@DisplayName("Record 3844: City is Flint")
	void CityOfRecord3844() {
		assertEquals("Flint", customers.get(3843).getCity());
	}

	@Test
	@DisplayName("Record 3844: County is Genesee")
	void CountyOfRecord3844() {
		assertEquals("Genesee", customers.get(3843).getCounty());
	}

	@Test
	@DisplayName("Record 3844: State is MI")
	void StateOfRecord3844() {
		assertEquals("MI", customers.get(3843).getState());
	}

	@Test
	@DisplayName("Record 3844: ZIP is 48503")
	void ZIPOfRecord3844() {
		assertEquals("48503", customers.get(3843).getZIP());
	}

	@Test
	@DisplayName("Record 3844: Phone is 810-767-3812")
	void PhoneOfRecord3844() {
		assertEquals("810-767-3812", customers.get(3843).getPhone());
	}

	@Test
	@DisplayName("Record 3844: Fax is 810-767-1347")
	void FaxOfRecord3844() {
		assertEquals("810-767-1347", customers.get(3843).getFax());
	}

	@Test
	@DisplayName("Record 3844: Email is michale@mcray.com")
	void EmailOfRecord3844() {
		assertEquals("michale@mcray.com", customers.get(3843).getEmail());
	}

	@Test
	@DisplayName("Record 3844: Web is http://www.michalemcray.com")
	void WebOfRecord3844() {
		assertEquals("http://www.michalemcray.com", customers.get(3843).getWeb());
	}
}
