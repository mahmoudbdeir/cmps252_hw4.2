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
class Record_3507 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3507: FirstName is Serena")
	void FirstNameOfRecord3507() {
		assertEquals("Serena", customers.get(3506).getFirstName());
	}

	@Test
	@DisplayName("Record 3507: LastName is Mok")
	void LastNameOfRecord3507() {
		assertEquals("Mok", customers.get(3506).getLastName());
	}

	@Test
	@DisplayName("Record 3507: Company is B & A Universal Toy Industries")
	void CompanyOfRecord3507() {
		assertEquals("B & A Universal Toy Industries", customers.get(3506).getCompany());
	}

	@Test
	@DisplayName("Record 3507: Address is 400 E Tioga St")
	void AddressOfRecord3507() {
		assertEquals("400 E Tioga St", customers.get(3506).getAddress());
	}

	@Test
	@DisplayName("Record 3507: City is Philadelphia")
	void CityOfRecord3507() {
		assertEquals("Philadelphia", customers.get(3506).getCity());
	}

	@Test
	@DisplayName("Record 3507: County is Philadelphia")
	void CountyOfRecord3507() {
		assertEquals("Philadelphia", customers.get(3506).getCounty());
	}

	@Test
	@DisplayName("Record 3507: State is PA")
	void StateOfRecord3507() {
		assertEquals("PA", customers.get(3506).getState());
	}

	@Test
	@DisplayName("Record 3507: ZIP is 19134")
	void ZIPOfRecord3507() {
		assertEquals("19134", customers.get(3506).getZIP());
	}

	@Test
	@DisplayName("Record 3507: Phone is 215-739-2226")
	void PhoneOfRecord3507() {
		assertEquals("215-739-2226", customers.get(3506).getPhone());
	}

	@Test
	@DisplayName("Record 3507: Fax is 215-739-2751")
	void FaxOfRecord3507() {
		assertEquals("215-739-2751", customers.get(3506).getFax());
	}

	@Test
	@DisplayName("Record 3507: Email is serena@mok.com")
	void EmailOfRecord3507() {
		assertEquals("serena@mok.com", customers.get(3506).getEmail());
	}

	@Test
	@DisplayName("Record 3507: Web is http://www.serenamok.com")
	void WebOfRecord3507() {
		assertEquals("http://www.serenamok.com", customers.get(3506).getWeb());
	}
}
