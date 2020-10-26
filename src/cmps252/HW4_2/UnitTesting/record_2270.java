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

@Tag("43")
class Record_2270 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2270: FirstName is Beau")
	void FirstNameOfRecord2270() {
		assertEquals("Beau", customers.get(2269).getFirstName());
	}

	@Test
	@DisplayName("Record 2270: LastName is Trease")
	void LastNameOfRecord2270() {
		assertEquals("Trease", customers.get(2269).getLastName());
	}

	@Test
	@DisplayName("Record 2270: Company is J S Securities Inc")
	void CompanyOfRecord2270() {
		assertEquals("J S Securities Inc", customers.get(2269).getCompany());
	}

	@Test
	@DisplayName("Record 2270: Address is 39 Putter Dr")
	void AddressOfRecord2270() {
		assertEquals("39 Putter Dr", customers.get(2269).getAddress());
	}

	@Test
	@DisplayName("Record 2270: City is Stamford")
	void CityOfRecord2270() {
		assertEquals("Stamford", customers.get(2269).getCity());
	}

	@Test
	@DisplayName("Record 2270: County is Fairfield")
	void CountyOfRecord2270() {
		assertEquals("Fairfield", customers.get(2269).getCounty());
	}

	@Test
	@DisplayName("Record 2270: State is CT")
	void StateOfRecord2270() {
		assertEquals("CT", customers.get(2269).getState());
	}

	@Test
	@DisplayName("Record 2270: ZIP is 6907")
	void ZIPOfRecord2270() {
		assertEquals("6907", customers.get(2269).getZIP());
	}

	@Test
	@DisplayName("Record 2270: Phone is 203-967-2194")
	void PhoneOfRecord2270() {
		assertEquals("203-967-2194", customers.get(2269).getPhone());
	}

	@Test
	@DisplayName("Record 2270: Fax is 203-967-3396")
	void FaxOfRecord2270() {
		assertEquals("203-967-3396", customers.get(2269).getFax());
	}

	@Test
	@DisplayName("Record 2270: Email is beau@trease.com")
	void EmailOfRecord2270() {
		assertEquals("beau@trease.com", customers.get(2269).getEmail());
	}

	@Test
	@DisplayName("Record 2270: Web is http://www.beautrease.com")
	void WebOfRecord2270() {
		assertEquals("http://www.beautrease.com", customers.get(2269).getWeb());
	}
}
