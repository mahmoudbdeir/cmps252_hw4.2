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

@Tag("11")
class Record_299 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 299: FirstName is Evangeline")
	void FirstNameOfRecord299() {
		assertEquals("Evangeline", customers.get(298).getFirstName());
	}

	@Test
	@DisplayName("Record 299: LastName is Lyner")
	void LastNameOfRecord299() {
		assertEquals("Lyner", customers.get(298).getLastName());
	}

	@Test
	@DisplayName("Record 299: Company is Sattler, Todd A Esq")
	void CompanyOfRecord299() {
		assertEquals("Sattler, Todd A Esq", customers.get(298).getCompany());
	}

	@Test
	@DisplayName("Record 299: Address is 5206 Fm")
	void AddressOfRecord299() {
		assertEquals("5206 Fm", customers.get(298).getAddress());
	}

	@Test
	@DisplayName("Record 299: City is Houston")
	void CityOfRecord299() {
		assertEquals("Houston", customers.get(298).getCity());
	}

	@Test
	@DisplayName("Record 299: County is Harris")
	void CountyOfRecord299() {
		assertEquals("Harris", customers.get(298).getCounty());
	}

	@Test
	@DisplayName("Record 299: State is TX")
	void StateOfRecord299() {
		assertEquals("TX", customers.get(298).getState());
	}

	@Test
	@DisplayName("Record 299: ZIP is 77069")
	void ZIPOfRecord299() {
		assertEquals("77069", customers.get(298).getZIP());
	}

	@Test
	@DisplayName("Record 299: Phone is 281-893-0313")
	void PhoneOfRecord299() {
		assertEquals("281-893-0313", customers.get(298).getPhone());
	}

	@Test
	@DisplayName("Record 299: Fax is 281-893-8553")
	void FaxOfRecord299() {
		assertEquals("281-893-8553", customers.get(298).getFax());
	}

	@Test
	@DisplayName("Record 299: Email is evangeline@lyner.com")
	void EmailOfRecord299() {
		assertEquals("evangeline@lyner.com", customers.get(298).getEmail());
	}

	@Test
	@DisplayName("Record 299: Web is http://www.evangelinelyner.com")
	void WebOfRecord299() {
		assertEquals("http://www.evangelinelyner.com", customers.get(298).getWeb());
	}
}
