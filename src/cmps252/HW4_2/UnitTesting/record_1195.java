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

@Tag("45")
class Record_1195 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1195: FirstName is Monty")
	void FirstNameOfRecord1195() {
		assertEquals("Monty", customers.get(1194).getFirstName());
	}

	@Test
	@DisplayName("Record 1195: LastName is Hektner")
	void LastNameOfRecord1195() {
		assertEquals("Hektner", customers.get(1194).getLastName());
	}

	@Test
	@DisplayName("Record 1195: Company is Asia Enterprises Inc")
	void CompanyOfRecord1195() {
		assertEquals("Asia Enterprises Inc", customers.get(1194).getCompany());
	}

	@Test
	@DisplayName("Record 1195: Address is 6280 W Las Positas  #-230")
	void AddressOfRecord1195() {
		assertEquals("6280 W Las Positas  #-230", customers.get(1194).getAddress());
	}

	@Test
	@DisplayName("Record 1195: City is Pleasanton")
	void CityOfRecord1195() {
		assertEquals("Pleasanton", customers.get(1194).getCity());
	}

	@Test
	@DisplayName("Record 1195: County is Alameda")
	void CountyOfRecord1195() {
		assertEquals("Alameda", customers.get(1194).getCounty());
	}

	@Test
	@DisplayName("Record 1195: State is CA")
	void StateOfRecord1195() {
		assertEquals("CA", customers.get(1194).getState());
	}

	@Test
	@DisplayName("Record 1195: ZIP is 94588")
	void ZIPOfRecord1195() {
		assertEquals("94588", customers.get(1194).getZIP());
	}

	@Test
	@DisplayName("Record 1195: Phone is 925-846-3722")
	void PhoneOfRecord1195() {
		assertEquals("925-846-3722", customers.get(1194).getPhone());
	}

	@Test
	@DisplayName("Record 1195: Fax is 925-846-0188")
	void FaxOfRecord1195() {
		assertEquals("925-846-0188", customers.get(1194).getFax());
	}

	@Test
	@DisplayName("Record 1195: Email is monty@hektner.com")
	void EmailOfRecord1195() {
		assertEquals("monty@hektner.com", customers.get(1194).getEmail());
	}

	@Test
	@DisplayName("Record 1195: Web is http://www.montyhektner.com")
	void WebOfRecord1195() {
		assertEquals("http://www.montyhektner.com", customers.get(1194).getWeb());
	}
}
