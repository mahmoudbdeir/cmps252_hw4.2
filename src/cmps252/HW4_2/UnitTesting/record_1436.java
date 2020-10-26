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

@Tag("47")
class Record_1436 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1436: FirstName is Amanda")
	void FirstNameOfRecord1436() {
		assertEquals("Amanda", customers.get(1435).getFirstName());
	}

	@Test
	@DisplayName("Record 1436: LastName is Hyne")
	void LastNameOfRecord1436() {
		assertEquals("Hyne", customers.get(1435).getLastName());
	}

	@Test
	@DisplayName("Record 1436: Company is North American Spawn Inc")
	void CompanyOfRecord1436() {
		assertEquals("North American Spawn Inc", customers.get(1435).getCompany());
	}

	@Test
	@DisplayName("Record 1436: Address is 10 Hemmingway Dr")
	void AddressOfRecord1436() {
		assertEquals("10 Hemmingway Dr", customers.get(1435).getAddress());
	}

	@Test
	@DisplayName("Record 1436: City is Riverside")
	void CityOfRecord1436() {
		assertEquals("Riverside", customers.get(1435).getCity());
	}

	@Test
	@DisplayName("Record 1436: County is Providence")
	void CountyOfRecord1436() {
		assertEquals("Providence", customers.get(1435).getCounty());
	}

	@Test
	@DisplayName("Record 1436: State is RI")
	void StateOfRecord1436() {
		assertEquals("RI", customers.get(1435).getState());
	}

	@Test
	@DisplayName("Record 1436: ZIP is 2915")
	void ZIPOfRecord1436() {
		assertEquals("2915", customers.get(1435).getZIP());
	}

	@Test
	@DisplayName("Record 1436: Phone is 401-438-5628")
	void PhoneOfRecord1436() {
		assertEquals("401-438-5628", customers.get(1435).getPhone());
	}

	@Test
	@DisplayName("Record 1436: Fax is 401-438-2648")
	void FaxOfRecord1436() {
		assertEquals("401-438-2648", customers.get(1435).getFax());
	}

	@Test
	@DisplayName("Record 1436: Email is amanda@hyne.com")
	void EmailOfRecord1436() {
		assertEquals("amanda@hyne.com", customers.get(1435).getEmail());
	}

	@Test
	@DisplayName("Record 1436: Web is http://www.amandahyne.com")
	void WebOfRecord1436() {
		assertEquals("http://www.amandahyne.com", customers.get(1435).getWeb());
	}
}
