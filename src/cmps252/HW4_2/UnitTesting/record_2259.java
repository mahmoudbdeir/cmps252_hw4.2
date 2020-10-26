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

@Tag("26")
class Record_2259 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2259: FirstName is Rosalinda")
	void FirstNameOfRecord2259() {
		assertEquals("Rosalinda", customers.get(2258).getFirstName());
	}

	@Test
	@DisplayName("Record 2259: LastName is Bacman")
	void LastNameOfRecord2259() {
		assertEquals("Bacman", customers.get(2258).getLastName());
	}

	@Test
	@DisplayName("Record 2259: Company is Comic Art Gallery")
	void CompanyOfRecord2259() {
		assertEquals("Comic Art Gallery", customers.get(2258).getCompany());
	}

	@Test
	@DisplayName("Record 2259: Address is Food Distrbutn")
	void AddressOfRecord2259() {
		assertEquals("Food Distrbutn", customers.get(2258).getAddress());
	}

	@Test
	@DisplayName("Record 2259: City is Philadelphia")
	void CityOfRecord2259() {
		assertEquals("Philadelphia", customers.get(2258).getCity());
	}

	@Test
	@DisplayName("Record 2259: County is Philadelphia")
	void CountyOfRecord2259() {
		assertEquals("Philadelphia", customers.get(2258).getCounty());
	}

	@Test
	@DisplayName("Record 2259: State is PA")
	void StateOfRecord2259() {
		assertEquals("PA", customers.get(2258).getState());
	}

	@Test
	@DisplayName("Record 2259: ZIP is 19148")
	void ZIPOfRecord2259() {
		assertEquals("19148", customers.get(2258).getZIP());
	}

	@Test
	@DisplayName("Record 2259: Phone is 215-336-3395")
	void PhoneOfRecord2259() {
		assertEquals("215-336-3395", customers.get(2258).getPhone());
	}

	@Test
	@DisplayName("Record 2259: Fax is 215-336-4357")
	void FaxOfRecord2259() {
		assertEquals("215-336-4357", customers.get(2258).getFax());
	}

	@Test
	@DisplayName("Record 2259: Email is rosalinda@bacman.com")
	void EmailOfRecord2259() {
		assertEquals("rosalinda@bacman.com", customers.get(2258).getEmail());
	}

	@Test
	@DisplayName("Record 2259: Web is http://www.rosalindabacman.com")
	void WebOfRecord2259() {
		assertEquals("http://www.rosalindabacman.com", customers.get(2258).getWeb());
	}
}
