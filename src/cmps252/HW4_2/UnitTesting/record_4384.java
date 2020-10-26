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

@Tag("42")
class Record_4384 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4384: FirstName is Marietta")
	void FirstNameOfRecord4384() {
		assertEquals("Marietta", customers.get(4383).getFirstName());
	}

	@Test
	@DisplayName("Record 4384: LastName is Massanelli")
	void LastNameOfRecord4384() {
		assertEquals("Massanelli", customers.get(4383).getLastName());
	}

	@Test
	@DisplayName("Record 4384: Company is First National Bank Monticello")
	void CompanyOfRecord4384() {
		assertEquals("First National Bank Monticello", customers.get(4383).getCompany());
	}

	@Test
	@DisplayName("Record 4384: Address is 2500 Crane Centre Dr")
	void AddressOfRecord4384() {
		assertEquals("2500 Crane Centre Dr", customers.get(4383).getAddress());
	}

	@Test
	@DisplayName("Record 4384: City is Streetsboro")
	void CityOfRecord4384() {
		assertEquals("Streetsboro", customers.get(4383).getCity());
	}

	@Test
	@DisplayName("Record 4384: County is Portage")
	void CountyOfRecord4384() {
		assertEquals("Portage", customers.get(4383).getCounty());
	}

	@Test
	@DisplayName("Record 4384: State is OH")
	void StateOfRecord4384() {
		assertEquals("OH", customers.get(4383).getState());
	}

	@Test
	@DisplayName("Record 4384: ZIP is 44241")
	void ZIPOfRecord4384() {
		assertEquals("44241", customers.get(4383).getZIP());
	}

	@Test
	@DisplayName("Record 4384: Phone is 330-562-6702")
	void PhoneOfRecord4384() {
		assertEquals("330-562-6702", customers.get(4383).getPhone());
	}

	@Test
	@DisplayName("Record 4384: Fax is 330-562-2415")
	void FaxOfRecord4384() {
		assertEquals("330-562-2415", customers.get(4383).getFax());
	}

	@Test
	@DisplayName("Record 4384: Email is marietta@massanelli.com")
	void EmailOfRecord4384() {
		assertEquals("marietta@massanelli.com", customers.get(4383).getEmail());
	}

	@Test
	@DisplayName("Record 4384: Web is http://www.mariettamassanelli.com")
	void WebOfRecord4384() {
		assertEquals("http://www.mariettamassanelli.com", customers.get(4383).getWeb());
	}
}
