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

@Tag("2")
class Record_96 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 96: FirstName is Rafael")
	void FirstNameOfRecord96() {
		assertEquals("Rafael", customers.get(95).getFirstName());
	}

	@Test
	@DisplayName("Record 96: LastName is Corrya")
	void LastNameOfRecord96() {
		assertEquals("Corrya", customers.get(95).getLastName());
	}

	@Test
	@DisplayName("Record 96: Company is Aa Rubber Stamp Co")
	void CompanyOfRecord96() {
		assertEquals("Aa Rubber Stamp Co", customers.get(95).getCompany());
	}

	@Test
	@DisplayName("Record 96: Address is 8201 E Pacific Pl  #-607")
	void AddressOfRecord96() {
		assertEquals("8201 E Pacific Pl  #-607", customers.get(95).getAddress());
	}

	@Test
	@DisplayName("Record 96: City is Denver")
	void CityOfRecord96() {
		assertEquals("Denver", customers.get(95).getCity());
	}

	@Test
	@DisplayName("Record 96: County is Denver")
	void CountyOfRecord96() {
		assertEquals("Denver", customers.get(95).getCounty());
	}

	@Test
	@DisplayName("Record 96: State is CO")
	void StateOfRecord96() {
		assertEquals("CO", customers.get(95).getState());
	}

	@Test
	@DisplayName("Record 96: ZIP is 80231")
	void ZIPOfRecord96() {
		assertEquals("80231", customers.get(95).getZIP());
	}

	@Test
	@DisplayName("Record 96: Phone is 303-745-5679")
	void PhoneOfRecord96() {
		assertEquals("303-745-5679", customers.get(95).getPhone());
	}

	@Test
	@DisplayName("Record 96: Fax is 303-745-2597")
	void FaxOfRecord96() {
		assertEquals("303-745-2597", customers.get(95).getFax());
	}

	@Test
	@DisplayName("Record 96: Email is rafael@corrya.com")
	void EmailOfRecord96() {
		assertEquals("rafael@corrya.com", customers.get(95).getEmail());
	}

	@Test
	@DisplayName("Record 96: Web is http://www.rafaelcorrya.com")
	void WebOfRecord96() {
		assertEquals("http://www.rafaelcorrya.com", customers.get(95).getWeb());
	}
}
