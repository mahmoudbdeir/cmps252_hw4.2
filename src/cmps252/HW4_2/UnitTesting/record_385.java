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

@Tag("13")
class Record_385 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 385: FirstName is Alfredo")
	void FirstNameOfRecord385() {
		assertEquals("Alfredo", customers.get(384).getFirstName());
	}

	@Test
	@DisplayName("Record 385: LastName is Felman")
	void LastNameOfRecord385() {
		assertEquals("Felman", customers.get(384).getLastName());
	}

	@Test
	@DisplayName("Record 385: Company is L Mason Capitani Inc")
	void CompanyOfRecord385() {
		assertEquals("L Mason Capitani Inc", customers.get(384).getCompany());
	}

	@Test
	@DisplayName("Record 385: Address is 5500 Logan St")
	void AddressOfRecord385() {
		assertEquals("5500 Logan St", customers.get(384).getAddress());
	}

	@Test
	@DisplayName("Record 385: City is Denver")
	void CityOfRecord385() {
		assertEquals("Denver", customers.get(384).getCity());
	}

	@Test
	@DisplayName("Record 385: County is Denver")
	void CountyOfRecord385() {
		assertEquals("Denver", customers.get(384).getCounty());
	}

	@Test
	@DisplayName("Record 385: State is CO")
	void StateOfRecord385() {
		assertEquals("CO", customers.get(384).getState());
	}

	@Test
	@DisplayName("Record 385: ZIP is 80216")
	void ZIPOfRecord385() {
		assertEquals("80216", customers.get(384).getZIP());
	}

	@Test
	@DisplayName("Record 385: Phone is 303-296-4229")
	void PhoneOfRecord385() {
		assertEquals("303-296-4229", customers.get(384).getPhone());
	}

	@Test
	@DisplayName("Record 385: Fax is 303-296-4649")
	void FaxOfRecord385() {
		assertEquals("303-296-4649", customers.get(384).getFax());
	}

	@Test
	@DisplayName("Record 385: Email is alfredo@felman.com")
	void EmailOfRecord385() {
		assertEquals("alfredo@felman.com", customers.get(384).getEmail());
	}

	@Test
	@DisplayName("Record 385: Web is http://www.alfredofelman.com")
	void WebOfRecord385() {
		assertEquals("http://www.alfredofelman.com", customers.get(384).getWeb());
	}
}
