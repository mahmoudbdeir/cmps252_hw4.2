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

@Tag("6")
class Record_3875 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3875: FirstName is Polly")
	void FirstNameOfRecord3875() {
		assertEquals("Polly", customers.get(3874).getFirstName());
	}

	@Test
	@DisplayName("Record 3875: LastName is Gabard")
	void LastNameOfRecord3875() {
		assertEquals("Gabard", customers.get(3874).getLastName());
	}

	@Test
	@DisplayName("Record 3875: Company is Verdin Co")
	void CompanyOfRecord3875() {
		assertEquals("Verdin Co", customers.get(3874).getCompany());
	}

	@Test
	@DisplayName("Record 3875: Address is 3031 E 40th Ave")
	void AddressOfRecord3875() {
		assertEquals("3031 E 40th Ave", customers.get(3874).getAddress());
	}

	@Test
	@DisplayName("Record 3875: City is Denver")
	void CityOfRecord3875() {
		assertEquals("Denver", customers.get(3874).getCity());
	}

	@Test
	@DisplayName("Record 3875: County is Denver")
	void CountyOfRecord3875() {
		assertEquals("Denver", customers.get(3874).getCounty());
	}

	@Test
	@DisplayName("Record 3875: State is CO")
	void StateOfRecord3875() {
		assertEquals("CO", customers.get(3874).getState());
	}

	@Test
	@DisplayName("Record 3875: ZIP is 80205")
	void ZIPOfRecord3875() {
		assertEquals("80205", customers.get(3874).getZIP());
	}

	@Test
	@DisplayName("Record 3875: Phone is 303-377-9137")
	void PhoneOfRecord3875() {
		assertEquals("303-377-9137", customers.get(3874).getPhone());
	}

	@Test
	@DisplayName("Record 3875: Fax is 303-377-3683")
	void FaxOfRecord3875() {
		assertEquals("303-377-3683", customers.get(3874).getFax());
	}

	@Test
	@DisplayName("Record 3875: Email is polly@gabard.com")
	void EmailOfRecord3875() {
		assertEquals("polly@gabard.com", customers.get(3874).getEmail());
	}

	@Test
	@DisplayName("Record 3875: Web is http://www.pollygabard.com")
	void WebOfRecord3875() {
		assertEquals("http://www.pollygabard.com", customers.get(3874).getWeb());
	}
}
