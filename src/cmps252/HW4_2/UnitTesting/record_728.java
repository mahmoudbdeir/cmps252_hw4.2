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

@Tag("16")
class Record_728 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 728: FirstName is Sung")
	void FirstNameOfRecord728() {
		assertEquals("Sung", customers.get(727).getFirstName());
	}

	@Test
	@DisplayName("Record 728: LastName is Sersen")
	void LastNameOfRecord728() {
		assertEquals("Sersen", customers.get(727).getLastName());
	}

	@Test
	@DisplayName("Record 728: Company is Rockwell Kitchen Cabinet Whslr")
	void CompanyOfRecord728() {
		assertEquals("Rockwell Kitchen Cabinet Whslr", customers.get(727).getCompany());
	}

	@Test
	@DisplayName("Record 728: Address is 205 N College Ave  #-512")
	void AddressOfRecord728() {
		assertEquals("205 N College Ave  #-512", customers.get(727).getAddress());
	}

	@Test
	@DisplayName("Record 728: City is Bloomington")
	void CityOfRecord728() {
		assertEquals("Bloomington", customers.get(727).getCity());
	}

	@Test
	@DisplayName("Record 728: County is Monroe")
	void CountyOfRecord728() {
		assertEquals("Monroe", customers.get(727).getCounty());
	}

	@Test
	@DisplayName("Record 728: State is IN")
	void StateOfRecord728() {
		assertEquals("IN", customers.get(727).getState());
	}

	@Test
	@DisplayName("Record 728: ZIP is 47404")
	void ZIPOfRecord728() {
		assertEquals("47404", customers.get(727).getZIP());
	}

	@Test
	@DisplayName("Record 728: Phone is 812-336-2605")
	void PhoneOfRecord728() {
		assertEquals("812-336-2605", customers.get(727).getPhone());
	}

	@Test
	@DisplayName("Record 728: Fax is 812-336-9252")
	void FaxOfRecord728() {
		assertEquals("812-336-9252", customers.get(727).getFax());
	}

	@Test
	@DisplayName("Record 728: Email is sung@sersen.com")
	void EmailOfRecord728() {
		assertEquals("sung@sersen.com", customers.get(727).getEmail());
	}

	@Test
	@DisplayName("Record 728: Web is http://www.sungsersen.com")
	void WebOfRecord728() {
		assertEquals("http://www.sungsersen.com", customers.get(727).getWeb());
	}
}
