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

@Tag("46")
class Record_2384 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2384: FirstName is Troy")
	void FirstNameOfRecord2384() {
		assertEquals("Troy", customers.get(2383).getFirstName());
	}

	@Test
	@DisplayName("Record 2384: LastName is Briel")
	void LastNameOfRecord2384() {
		assertEquals("Briel", customers.get(2383).getLastName());
	}

	@Test
	@DisplayName("Record 2384: Company is Crum Electric Supply Co")
	void CompanyOfRecord2384() {
		assertEquals("Crum Electric Supply Co", customers.get(2383).getCompany());
	}

	@Test
	@DisplayName("Record 2384: Address is O'neal Rd")
	void AddressOfRecord2384() {
		assertEquals("O'neal Rd", customers.get(2383).getAddress());
	}

	@Test
	@DisplayName("Record 2384: City is Corpus Christi")
	void CityOfRecord2384() {
		assertEquals("Corpus Christi", customers.get(2383).getCity());
	}

	@Test
	@DisplayName("Record 2384: County is Nueces")
	void CountyOfRecord2384() {
		assertEquals("Nueces", customers.get(2383).getCounty());
	}

	@Test
	@DisplayName("Record 2384: State is TX")
	void StateOfRecord2384() {
		assertEquals("TX", customers.get(2383).getState());
	}

	@Test
	@DisplayName("Record 2384: ZIP is 78415")
	void ZIPOfRecord2384() {
		assertEquals("78415", customers.get(2383).getZIP());
	}

	@Test
	@DisplayName("Record 2384: Phone is 361-855-1643")
	void PhoneOfRecord2384() {
		assertEquals("361-855-1643", customers.get(2383).getPhone());
	}

	@Test
	@DisplayName("Record 2384: Fax is 361-855-2681")
	void FaxOfRecord2384() {
		assertEquals("361-855-2681", customers.get(2383).getFax());
	}

	@Test
	@DisplayName("Record 2384: Email is troy@briel.com")
	void EmailOfRecord2384() {
		assertEquals("troy@briel.com", customers.get(2383).getEmail());
	}

	@Test
	@DisplayName("Record 2384: Web is http://www.troybriel.com")
	void WebOfRecord2384() {
		assertEquals("http://www.troybriel.com", customers.get(2383).getWeb());
	}
}
