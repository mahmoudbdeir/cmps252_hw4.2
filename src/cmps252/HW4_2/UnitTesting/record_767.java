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

@Tag("19")
class Record_767 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 767: FirstName is Gayle")
	void FirstNameOfRecord767() {
		assertEquals("Gayle", customers.get(766).getFirstName());
	}

	@Test
	@DisplayName("Record 767: LastName is Argue")
	void LastNameOfRecord767() {
		assertEquals("Argue", customers.get(766).getLastName());
	}

	@Test
	@DisplayName("Record 767: Company is B P Oil Inc")
	void CompanyOfRecord767() {
		assertEquals("B P Oil Inc", customers.get(766).getCompany());
	}

	@Test
	@DisplayName("Record 767: Address is 50 Eads St")
	void AddressOfRecord767() {
		assertEquals("50 Eads St", customers.get(766).getAddress());
	}

	@Test
	@DisplayName("Record 767: City is West Babylon")
	void CityOfRecord767() {
		assertEquals("West Babylon", customers.get(766).getCity());
	}

	@Test
	@DisplayName("Record 767: County is Suffolk")
	void CountyOfRecord767() {
		assertEquals("Suffolk", customers.get(766).getCounty());
	}

	@Test
	@DisplayName("Record 767: State is NY")
	void StateOfRecord767() {
		assertEquals("NY", customers.get(766).getState());
	}

	@Test
	@DisplayName("Record 767: ZIP is 11704")
	void ZIPOfRecord767() {
		assertEquals("11704", customers.get(766).getZIP());
	}

	@Test
	@DisplayName("Record 767: Phone is 631-293-8235")
	void PhoneOfRecord767() {
		assertEquals("631-293-8235", customers.get(766).getPhone());
	}

	@Test
	@DisplayName("Record 767: Fax is 631-293-1329")
	void FaxOfRecord767() {
		assertEquals("631-293-1329", customers.get(766).getFax());
	}

	@Test
	@DisplayName("Record 767: Email is gayle@argue.com")
	void EmailOfRecord767() {
		assertEquals("gayle@argue.com", customers.get(766).getEmail());
	}

	@Test
	@DisplayName("Record 767: Web is http://www.gayleargue.com")
	void WebOfRecord767() {
		assertEquals("http://www.gayleargue.com", customers.get(766).getWeb());
	}
}
