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

@Tag("17")
class Record_3734 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3734: FirstName is Marian")
	void FirstNameOfRecord3734() {
		assertEquals("Marian", customers.get(3733).getFirstName());
	}

	@Test
	@DisplayName("Record 3734: LastName is Penwell")
	void LastNameOfRecord3734() {
		assertEquals("Penwell", customers.get(3733).getLastName());
	}

	@Test
	@DisplayName("Record 3734: Company is Clark Fork Valley Press")
	void CompanyOfRecord3734() {
		assertEquals("Clark Fork Valley Press", customers.get(3733).getCompany());
	}

	@Test
	@DisplayName("Record 3734: Address is 116 Se Yamhill St")
	void AddressOfRecord3734() {
		assertEquals("116 Se Yamhill St", customers.get(3733).getAddress());
	}

	@Test
	@DisplayName("Record 3734: City is Portland")
	void CityOfRecord3734() {
		assertEquals("Portland", customers.get(3733).getCity());
	}

	@Test
	@DisplayName("Record 3734: County is Multnomah")
	void CountyOfRecord3734() {
		assertEquals("Multnomah", customers.get(3733).getCounty());
	}

	@Test
	@DisplayName("Record 3734: State is OR")
	void StateOfRecord3734() {
		assertEquals("OR", customers.get(3733).getState());
	}

	@Test
	@DisplayName("Record 3734: ZIP is 97214")
	void ZIPOfRecord3734() {
		assertEquals("97214", customers.get(3733).getZIP());
	}

	@Test
	@DisplayName("Record 3734: Phone is 503-232-2191")
	void PhoneOfRecord3734() {
		assertEquals("503-232-2191", customers.get(3733).getPhone());
	}

	@Test
	@DisplayName("Record 3734: Fax is 503-232-0153")
	void FaxOfRecord3734() {
		assertEquals("503-232-0153", customers.get(3733).getFax());
	}

	@Test
	@DisplayName("Record 3734: Email is marian@penwell.com")
	void EmailOfRecord3734() {
		assertEquals("marian@penwell.com", customers.get(3733).getEmail());
	}

	@Test
	@DisplayName("Record 3734: Web is http://www.marianpenwell.com")
	void WebOfRecord3734() {
		assertEquals("http://www.marianpenwell.com", customers.get(3733).getWeb());
	}
}
