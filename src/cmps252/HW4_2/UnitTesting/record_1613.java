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
class Record_1613 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1613: FirstName is Hilda")
	void FirstNameOfRecord1613() {
		assertEquals("Hilda", customers.get(1612).getFirstName());
	}

	@Test
	@DisplayName("Record 1613: LastName is Blankenbaker")
	void LastNameOfRecord1613() {
		assertEquals("Blankenbaker", customers.get(1612).getLastName());
	}

	@Test
	@DisplayName("Record 1613: Company is John Robert Powers School")
	void CompanyOfRecord1613() {
		assertEquals("John Robert Powers School", customers.get(1612).getCompany());
	}

	@Test
	@DisplayName("Record 1613: Address is 430 Hancock St")
	void AddressOfRecord1613() {
		assertEquals("430 Hancock St", customers.get(1612).getAddress());
	}

	@Test
	@DisplayName("Record 1613: City is Quincy")
	void CityOfRecord1613() {
		assertEquals("Quincy", customers.get(1612).getCity());
	}

	@Test
	@DisplayName("Record 1613: County is Norfolk")
	void CountyOfRecord1613() {
		assertEquals("Norfolk", customers.get(1612).getCounty());
	}

	@Test
	@DisplayName("Record 1613: State is MA")
	void StateOfRecord1613() {
		assertEquals("MA", customers.get(1612).getState());
	}

	@Test
	@DisplayName("Record 1613: ZIP is 2171")
	void ZIPOfRecord1613() {
		assertEquals("2171", customers.get(1612).getZIP());
	}

	@Test
	@DisplayName("Record 1613: Phone is 617-328-6665")
	void PhoneOfRecord1613() {
		assertEquals("617-328-6665", customers.get(1612).getPhone());
	}

	@Test
	@DisplayName("Record 1613: Fax is 617-328-2808")
	void FaxOfRecord1613() {
		assertEquals("617-328-2808", customers.get(1612).getFax());
	}

	@Test
	@DisplayName("Record 1613: Email is hilda@blankenbaker.com")
	void EmailOfRecord1613() {
		assertEquals("hilda@blankenbaker.com", customers.get(1612).getEmail());
	}

	@Test
	@DisplayName("Record 1613: Web is http://www.hildablankenbaker.com")
	void WebOfRecord1613() {
		assertEquals("http://www.hildablankenbaker.com", customers.get(1612).getWeb());
	}
}
