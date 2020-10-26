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

@Tag("34")
class Record_582 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 582: FirstName is Gilda")
	void FirstNameOfRecord582() {
		assertEquals("Gilda", customers.get(581).getFirstName());
	}

	@Test
	@DisplayName("Record 582: LastName is Gorena")
	void LastNameOfRecord582() {
		assertEquals("Gorena", customers.get(581).getLastName());
	}

	@Test
	@DisplayName("Record 582: Company is Copy Machine Store")
	void CompanyOfRecord582() {
		assertEquals("Copy Machine Store", customers.get(581).getCompany());
	}

	@Test
	@DisplayName("Record 582: Address is 5650 Old Seward Hwy")
	void AddressOfRecord582() {
		assertEquals("5650 Old Seward Hwy", customers.get(581).getAddress());
	}

	@Test
	@DisplayName("Record 582: City is Anchorage")
	void CityOfRecord582() {
		assertEquals("Anchorage", customers.get(581).getCity());
	}

	@Test
	@DisplayName("Record 582: County is Anchorage")
	void CountyOfRecord582() {
		assertEquals("Anchorage", customers.get(581).getCounty());
	}

	@Test
	@DisplayName("Record 582: State is AK")
	void StateOfRecord582() {
		assertEquals("AK", customers.get(581).getState());
	}

	@Test
	@DisplayName("Record 582: ZIP is 99518")
	void ZIPOfRecord582() {
		assertEquals("99518", customers.get(581).getZIP());
	}

	@Test
	@DisplayName("Record 582: Phone is 907-561-0911")
	void PhoneOfRecord582() {
		assertEquals("907-561-0911", customers.get(581).getPhone());
	}

	@Test
	@DisplayName("Record 582: Fax is 907-561-2839")
	void FaxOfRecord582() {
		assertEquals("907-561-2839", customers.get(581).getFax());
	}

	@Test
	@DisplayName("Record 582: Email is gilda@gorena.com")
	void EmailOfRecord582() {
		assertEquals("gilda@gorena.com", customers.get(581).getEmail());
	}

	@Test
	@DisplayName("Record 582: Web is http://www.gildagorena.com")
	void WebOfRecord582() {
		assertEquals("http://www.gildagorena.com", customers.get(581).getWeb());
	}
}
