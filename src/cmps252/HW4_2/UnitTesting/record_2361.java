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

@Tag("22")
class Record_2361 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2361: FirstName is Paula")
	void FirstNameOfRecord2361() {
		assertEquals("Paula", customers.get(2360).getFirstName());
	}

	@Test
	@DisplayName("Record 2361: LastName is Tarkenton")
	void LastNameOfRecord2361() {
		assertEquals("Tarkenton", customers.get(2360).getLastName());
	}

	@Test
	@DisplayName("Record 2361: Company is Wilhelm, Marc G Esq")
	void CompanyOfRecord2361() {
		assertEquals("Wilhelm, Marc G Esq", customers.get(2360).getCompany());
	}

	@Test
	@DisplayName("Record 2361: Address is 18720 13th Miile")
	void AddressOfRecord2361() {
		assertEquals("18720 13th Miile", customers.get(2360).getAddress());
	}

	@Test
	@DisplayName("Record 2361: City is Roseville")
	void CityOfRecord2361() {
		assertEquals("Roseville", customers.get(2360).getCity());
	}

	@Test
	@DisplayName("Record 2361: County is Macomb")
	void CountyOfRecord2361() {
		assertEquals("Macomb", customers.get(2360).getCounty());
	}

	@Test
	@DisplayName("Record 2361: State is MI")
	void StateOfRecord2361() {
		assertEquals("MI", customers.get(2360).getState());
	}

	@Test
	@DisplayName("Record 2361: ZIP is 48066")
	void ZIPOfRecord2361() {
		assertEquals("48066", customers.get(2360).getZIP());
	}

	@Test
	@DisplayName("Record 2361: Phone is 586-773-1655")
	void PhoneOfRecord2361() {
		assertEquals("586-773-1655", customers.get(2360).getPhone());
	}

	@Test
	@DisplayName("Record 2361: Fax is 586-773-5541")
	void FaxOfRecord2361() {
		assertEquals("586-773-5541", customers.get(2360).getFax());
	}

	@Test
	@DisplayName("Record 2361: Email is paula@tarkenton.com")
	void EmailOfRecord2361() {
		assertEquals("paula@tarkenton.com", customers.get(2360).getEmail());
	}

	@Test
	@DisplayName("Record 2361: Web is http://www.paulatarkenton.com")
	void WebOfRecord2361() {
		assertEquals("http://www.paulatarkenton.com", customers.get(2360).getWeb());
	}
}
