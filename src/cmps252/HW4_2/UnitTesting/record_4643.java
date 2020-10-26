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

@Tag("5")
class Record_4643 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4643: FirstName is Elisabeth")
	void FirstNameOfRecord4643() {
		assertEquals("Elisabeth", customers.get(4642).getFirstName());
	}

	@Test
	@DisplayName("Record 4643: LastName is Duckhorn")
	void LastNameOfRecord4643() {
		assertEquals("Duckhorn", customers.get(4642).getLastName());
	}

	@Test
	@DisplayName("Record 4643: Company is Btc Laboratories Inc")
	void CompanyOfRecord4643() {
		assertEquals("Btc Laboratories Inc", customers.get(4642).getCompany());
	}

	@Test
	@DisplayName("Record 4643: Address is 315 De Belier Rue")
	void AddressOfRecord4643() {
		assertEquals("315 De Belier Rue", customers.get(4642).getAddress());
	}

	@Test
	@DisplayName("Record 4643: City is Lafayette")
	void CityOfRecord4643() {
		assertEquals("Lafayette", customers.get(4642).getCity());
	}

	@Test
	@DisplayName("Record 4643: County is Lafayette")
	void CountyOfRecord4643() {
		assertEquals("Lafayette", customers.get(4642).getCounty());
	}

	@Test
	@DisplayName("Record 4643: State is LA")
	void StateOfRecord4643() {
		assertEquals("LA", customers.get(4642).getState());
	}

	@Test
	@DisplayName("Record 4643: ZIP is 70506")
	void ZIPOfRecord4643() {
		assertEquals("70506", customers.get(4642).getZIP());
	}

	@Test
	@DisplayName("Record 4643: Phone is 337-984-7888")
	void PhoneOfRecord4643() {
		assertEquals("337-984-7888", customers.get(4642).getPhone());
	}

	@Test
	@DisplayName("Record 4643: Fax is 337-984-7809")
	void FaxOfRecord4643() {
		assertEquals("337-984-7809", customers.get(4642).getFax());
	}

	@Test
	@DisplayName("Record 4643: Email is elisabeth@duckhorn.com")
	void EmailOfRecord4643() {
		assertEquals("elisabeth@duckhorn.com", customers.get(4642).getEmail());
	}

	@Test
	@DisplayName("Record 4643: Web is http://www.elisabethduckhorn.com")
	void WebOfRecord4643() {
		assertEquals("http://www.elisabethduckhorn.com", customers.get(4642).getWeb());
	}
}
