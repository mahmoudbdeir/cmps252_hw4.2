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

@Tag("25")
class Record_1980 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1980: FirstName is Laura")
	void FirstNameOfRecord1980() {
		assertEquals("Laura", customers.get(1979).getFirstName());
	}

	@Test
	@DisplayName("Record 1980: LastName is Bunyard")
	void LastNameOfRecord1980() {
		assertEquals("Bunyard", customers.get(1979).getLastName());
	}

	@Test
	@DisplayName("Record 1980: Company is Burdett Associates")
	void CompanyOfRecord1980() {
		assertEquals("Burdett Associates", customers.get(1979).getCompany());
	}

	@Test
	@DisplayName("Record 1980: Address is 8005 Cessna Ave")
	void AddressOfRecord1980() {
		assertEquals("8005 Cessna Ave", customers.get(1979).getAddress());
	}

	@Test
	@DisplayName("Record 1980: City is Gaithersburg")
	void CityOfRecord1980() {
		assertEquals("Gaithersburg", customers.get(1979).getCity());
	}

	@Test
	@DisplayName("Record 1980: County is Montgomery")
	void CountyOfRecord1980() {
		assertEquals("Montgomery", customers.get(1979).getCounty());
	}

	@Test
	@DisplayName("Record 1980: State is MD")
	void StateOfRecord1980() {
		assertEquals("MD", customers.get(1979).getState());
	}

	@Test
	@DisplayName("Record 1980: ZIP is 20879")
	void ZIPOfRecord1980() {
		assertEquals("20879", customers.get(1979).getZIP());
	}

	@Test
	@DisplayName("Record 1980: Phone is 301-840-9304")
	void PhoneOfRecord1980() {
		assertEquals("301-840-9304", customers.get(1979).getPhone());
	}

	@Test
	@DisplayName("Record 1980: Fax is 301-840-5986")
	void FaxOfRecord1980() {
		assertEquals("301-840-5986", customers.get(1979).getFax());
	}

	@Test
	@DisplayName("Record 1980: Email is laura@bunyard.com")
	void EmailOfRecord1980() {
		assertEquals("laura@bunyard.com", customers.get(1979).getEmail());
	}

	@Test
	@DisplayName("Record 1980: Web is http://www.laurabunyard.com")
	void WebOfRecord1980() {
		assertEquals("http://www.laurabunyard.com", customers.get(1979).getWeb());
	}
}
