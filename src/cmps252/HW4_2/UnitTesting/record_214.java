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
class Record_214 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 214: FirstName is Ivy")
	void FirstNameOfRecord214() {
		assertEquals("Ivy", customers.get(213).getFirstName());
	}

	@Test
	@DisplayName("Record 214: LastName is Fietsam")
	void LastNameOfRecord214() {
		assertEquals("Fietsam", customers.get(213).getLastName());
	}

	@Test
	@DisplayName("Record 214: Company is Cold Metal Products Co Inn")
	void CompanyOfRecord214() {
		assertEquals("Cold Metal Products Co Inn", customers.get(213).getCompany());
	}

	@Test
	@DisplayName("Record 214: Address is 3030 S Susan St")
	void AddressOfRecord214() {
		assertEquals("3030 S Susan St", customers.get(213).getAddress());
	}

	@Test
	@DisplayName("Record 214: City is Santa Ana")
	void CityOfRecord214() {
		assertEquals("Santa Ana", customers.get(213).getCity());
	}

	@Test
	@DisplayName("Record 214: County is Orange")
	void CountyOfRecord214() {
		assertEquals("Orange", customers.get(213).getCounty());
	}

	@Test
	@DisplayName("Record 214: State is CA")
	void StateOfRecord214() {
		assertEquals("CA", customers.get(213).getState());
	}

	@Test
	@DisplayName("Record 214: ZIP is 92704")
	void ZIPOfRecord214() {
		assertEquals("92704", customers.get(213).getZIP());
	}

	@Test
	@DisplayName("Record 214: Phone is 714-545-7821")
	void PhoneOfRecord214() {
		assertEquals("714-545-7821", customers.get(213).getPhone());
	}

	@Test
	@DisplayName("Record 214: Fax is 714-545-8205")
	void FaxOfRecord214() {
		assertEquals("714-545-8205", customers.get(213).getFax());
	}

	@Test
	@DisplayName("Record 214: Email is ivy@fietsam.com")
	void EmailOfRecord214() {
		assertEquals("ivy@fietsam.com", customers.get(213).getEmail());
	}

	@Test
	@DisplayName("Record 214: Web is http://www.ivyfietsam.com")
	void WebOfRecord214() {
		assertEquals("http://www.ivyfietsam.com", customers.get(213).getWeb());
	}
}
