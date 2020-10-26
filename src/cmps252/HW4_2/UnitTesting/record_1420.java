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

@Tag("22")
class Record_1420 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1420: FirstName is Jill")
	void FirstNameOfRecord1420() {
		assertEquals("Jill", customers.get(1419).getFirstName());
	}

	@Test
	@DisplayName("Record 1420: LastName is Somoza")
	void LastNameOfRecord1420() {
		assertEquals("Somoza", customers.get(1419).getLastName());
	}

	@Test
	@DisplayName("Record 1420: Company is Motor Club Of America")
	void CompanyOfRecord1420() {
		assertEquals("Motor Club Of America", customers.get(1419).getCompany());
	}

	@Test
	@DisplayName("Record 1420: Address is 11450 Cherokee St  #-a5")
	void AddressOfRecord1420() {
		assertEquals("11450 Cherokee St  #-a5", customers.get(1419).getAddress());
	}

	@Test
	@DisplayName("Record 1420: City is Denver")
	void CityOfRecord1420() {
		assertEquals("Denver", customers.get(1419).getCity());
	}

	@Test
	@DisplayName("Record 1420: County is Adams")
	void CountyOfRecord1420() {
		assertEquals("Adams", customers.get(1419).getCounty());
	}

	@Test
	@DisplayName("Record 1420: State is CO")
	void StateOfRecord1420() {
		assertEquals("CO", customers.get(1419).getState());
	}

	@Test
	@DisplayName("Record 1420: ZIP is 80234")
	void ZIPOfRecord1420() {
		assertEquals("80234", customers.get(1419).getZIP());
	}

	@Test
	@DisplayName("Record 1420: Phone is 303-457-8456")
	void PhoneOfRecord1420() {
		assertEquals("303-457-8456", customers.get(1419).getPhone());
	}

	@Test
	@DisplayName("Record 1420: Fax is 303-457-0338")
	void FaxOfRecord1420() {
		assertEquals("303-457-0338", customers.get(1419).getFax());
	}

	@Test
	@DisplayName("Record 1420: Email is jill@somoza.com")
	void EmailOfRecord1420() {
		assertEquals("jill@somoza.com", customers.get(1419).getEmail());
	}

	@Test
	@DisplayName("Record 1420: Web is http://www.jillsomoza.com")
	void WebOfRecord1420() {
		assertEquals("http://www.jillsomoza.com", customers.get(1419).getWeb());
	}
}
