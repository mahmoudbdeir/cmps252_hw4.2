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
class Record_851 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 851: FirstName is Jeannette")
	void FirstNameOfRecord851() {
		assertEquals("Jeannette", customers.get(850).getFirstName());
	}

	@Test
	@DisplayName("Record 851: LastName is Stranger")
	void LastNameOfRecord851() {
		assertEquals("Stranger", customers.get(850).getLastName());
	}

	@Test
	@DisplayName("Record 851: Company is Deangelo, Dante A Dds")
	void CompanyOfRecord851() {
		assertEquals("Deangelo, Dante A Dds", customers.get(850).getCompany());
	}

	@Test
	@DisplayName("Record 851: Address is 2020 Wadsworth Blvd")
	void AddressOfRecord851() {
		assertEquals("2020 Wadsworth Blvd", customers.get(850).getAddress());
	}

	@Test
	@DisplayName("Record 851: City is Denver")
	void CityOfRecord851() {
		assertEquals("Denver", customers.get(850).getCity());
	}

	@Test
	@DisplayName("Record 851: County is Jefferson")
	void CountyOfRecord851() {
		assertEquals("Jefferson", customers.get(850).getCounty());
	}

	@Test
	@DisplayName("Record 851: State is CO")
	void StateOfRecord851() {
		assertEquals("CO", customers.get(850).getState());
	}

	@Test
	@DisplayName("Record 851: ZIP is 80215")
	void ZIPOfRecord851() {
		assertEquals("80215", customers.get(850).getZIP());
	}

	@Test
	@DisplayName("Record 851: Phone is 303-238-6076")
	void PhoneOfRecord851() {
		assertEquals("303-238-6076", customers.get(850).getPhone());
	}

	@Test
	@DisplayName("Record 851: Fax is 303-238-0664")
	void FaxOfRecord851() {
		assertEquals("303-238-0664", customers.get(850).getFax());
	}

	@Test
	@DisplayName("Record 851: Email is jeannette@stranger.com")
	void EmailOfRecord851() {
		assertEquals("jeannette@stranger.com", customers.get(850).getEmail());
	}

	@Test
	@DisplayName("Record 851: Web is http://www.jeannettestranger.com")
	void WebOfRecord851() {
		assertEquals("http://www.jeannettestranger.com", customers.get(850).getWeb());
	}
}
