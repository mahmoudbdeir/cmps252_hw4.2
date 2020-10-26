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

@Tag("10")
class Record_4305 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4305: FirstName is Phillis")
	void FirstNameOfRecord4305() {
		assertEquals("Phillis", customers.get(4304).getFirstName());
	}

	@Test
	@DisplayName("Record 4305: LastName is Varghese")
	void LastNameOfRecord4305() {
		assertEquals("Varghese", customers.get(4304).getLastName());
	}

	@Test
	@DisplayName("Record 4305: Company is S & K Silk Flowers Import Inc")
	void CompanyOfRecord4305() {
		assertEquals("S & K Silk Flowers Import Inc", customers.get(4304).getCompany());
	}

	@Test
	@DisplayName("Record 4305: Address is 250 W Pratt St  #-800")
	void AddressOfRecord4305() {
		assertEquals("250 W Pratt St  #-800", customers.get(4304).getAddress());
	}

	@Test
	@DisplayName("Record 4305: City is Baltimore")
	void CityOfRecord4305() {
		assertEquals("Baltimore", customers.get(4304).getCity());
	}

	@Test
	@DisplayName("Record 4305: County is Baltimore City")
	void CountyOfRecord4305() {
		assertEquals("Baltimore City", customers.get(4304).getCounty());
	}

	@Test
	@DisplayName("Record 4305: State is MD")
	void StateOfRecord4305() {
		assertEquals("MD", customers.get(4304).getState());
	}

	@Test
	@DisplayName("Record 4305: ZIP is 21201")
	void ZIPOfRecord4305() {
		assertEquals("21201", customers.get(4304).getZIP());
	}

	@Test
	@DisplayName("Record 4305: Phone is 410-539-2246")
	void PhoneOfRecord4305() {
		assertEquals("410-539-2246", customers.get(4304).getPhone());
	}

	@Test
	@DisplayName("Record 4305: Fax is 410-539-5005")
	void FaxOfRecord4305() {
		assertEquals("410-539-5005", customers.get(4304).getFax());
	}

	@Test
	@DisplayName("Record 4305: Email is phillis@varghese.com")
	void EmailOfRecord4305() {
		assertEquals("phillis@varghese.com", customers.get(4304).getEmail());
	}

	@Test
	@DisplayName("Record 4305: Web is http://www.phillisvarghese.com")
	void WebOfRecord4305() {
		assertEquals("http://www.phillisvarghese.com", customers.get(4304).getWeb());
	}
}
