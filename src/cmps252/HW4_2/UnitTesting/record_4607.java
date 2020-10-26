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

@Tag("1")
class Record_4607 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4607: FirstName is Rayford")
	void FirstNameOfRecord4607() {
		assertEquals("Rayford", customers.get(4606).getFirstName());
	}

	@Test
	@DisplayName("Record 4607: LastName is Frisino")
	void LastNameOfRecord4607() {
		assertEquals("Frisino", customers.get(4606).getLastName());
	}

	@Test
	@DisplayName("Record 4607: Company is Traffic Safety Supply Co")
	void CompanyOfRecord4607() {
		assertEquals("Traffic Safety Supply Co", customers.get(4606).getCompany());
	}

	@Test
	@DisplayName("Record 4607: Address is Brentwood Rd")
	void AddressOfRecord4607() {
		assertEquals("Brentwood Rd", customers.get(4606).getAddress());
	}

	@Test
	@DisplayName("Record 4607: City is Brentwood")
	void CityOfRecord4607() {
		assertEquals("Brentwood", customers.get(4606).getCity());
	}

	@Test
	@DisplayName("Record 4607: County is Suffolk")
	void CountyOfRecord4607() {
		assertEquals("Suffolk", customers.get(4606).getCounty());
	}

	@Test
	@DisplayName("Record 4607: State is NY")
	void StateOfRecord4607() {
		assertEquals("NY", customers.get(4606).getState());
	}

	@Test
	@DisplayName("Record 4607: ZIP is 11717")
	void ZIPOfRecord4607() {
		assertEquals("11717", customers.get(4606).getZIP());
	}

	@Test
	@DisplayName("Record 4607: Phone is 631-231-6880")
	void PhoneOfRecord4607() {
		assertEquals("631-231-6880", customers.get(4606).getPhone());
	}

	@Test
	@DisplayName("Record 4607: Fax is 631-231-2262")
	void FaxOfRecord4607() {
		assertEquals("631-231-2262", customers.get(4606).getFax());
	}

	@Test
	@DisplayName("Record 4607: Email is rayford@frisino.com")
	void EmailOfRecord4607() {
		assertEquals("rayford@frisino.com", customers.get(4606).getEmail());
	}

	@Test
	@DisplayName("Record 4607: Web is http://www.rayfordfrisino.com")
	void WebOfRecord4607() {
		assertEquals("http://www.rayfordfrisino.com", customers.get(4606).getWeb());
	}
}
