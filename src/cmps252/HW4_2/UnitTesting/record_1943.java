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
class Record_1943 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1943: FirstName is Royce")
	void FirstNameOfRecord1943() {
		assertEquals("Royce", customers.get(1942).getFirstName());
	}

	@Test
	@DisplayName("Record 1943: LastName is Hornstrom")
	void LastNameOfRecord1943() {
		assertEquals("Hornstrom", customers.get(1942).getLastName());
	}

	@Test
	@DisplayName("Record 1943: Company is Nishiki Koi Usa Inc")
	void CompanyOfRecord1943() {
		assertEquals("Nishiki Koi Usa Inc", customers.get(1942).getCompany());
	}

	@Test
	@DisplayName("Record 1943: Address is 6510 Arctic Spur Rd")
	void AddressOfRecord1943() {
		assertEquals("6510 Arctic Spur Rd", customers.get(1942).getAddress());
	}

	@Test
	@DisplayName("Record 1943: City is Anchorage")
	void CityOfRecord1943() {
		assertEquals("Anchorage", customers.get(1942).getCity());
	}

	@Test
	@DisplayName("Record 1943: County is Anchorage")
	void CountyOfRecord1943() {
		assertEquals("Anchorage", customers.get(1942).getCounty());
	}

	@Test
	@DisplayName("Record 1943: State is AK")
	void StateOfRecord1943() {
		assertEquals("AK", customers.get(1942).getState());
	}

	@Test
	@DisplayName("Record 1943: ZIP is 99518")
	void ZIPOfRecord1943() {
		assertEquals("99518", customers.get(1942).getZIP());
	}

	@Test
	@DisplayName("Record 1943: Phone is 907-562-6671")
	void PhoneOfRecord1943() {
		assertEquals("907-562-6671", customers.get(1942).getPhone());
	}

	@Test
	@DisplayName("Record 1943: Fax is 907-562-2175")
	void FaxOfRecord1943() {
		assertEquals("907-562-2175", customers.get(1942).getFax());
	}

	@Test
	@DisplayName("Record 1943: Email is royce@hornstrom.com")
	void EmailOfRecord1943() {
		assertEquals("royce@hornstrom.com", customers.get(1942).getEmail());
	}

	@Test
	@DisplayName("Record 1943: Web is http://www.roycehornstrom.com")
	void WebOfRecord1943() {
		assertEquals("http://www.roycehornstrom.com", customers.get(1942).getWeb());
	}
}
