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

@Tag("43")
class Record_1002 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1002: FirstName is Wilton")
	void FirstNameOfRecord1002() {
		assertEquals("Wilton", customers.get(1001).getFirstName());
	}

	@Test
	@DisplayName("Record 1002: LastName is Leaver")
	void LastNameOfRecord1002() {
		assertEquals("Leaver", customers.get(1001).getLastName());
	}

	@Test
	@DisplayName("Record 1002: Company is Bozarth, Ronald L Esq")
	void CompanyOfRecord1002() {
		assertEquals("Bozarth, Ronald L Esq", customers.get(1001).getCompany());
	}

	@Test
	@DisplayName("Record 1002: Address is 719 E 11th Ave")
	void AddressOfRecord1002() {
		assertEquals("719 E 11th Ave", customers.get(1001).getAddress());
	}

	@Test
	@DisplayName("Record 1002: City is Anchorage")
	void CityOfRecord1002() {
		assertEquals("Anchorage", customers.get(1001).getCity());
	}

	@Test
	@DisplayName("Record 1002: County is Anchorage")
	void CountyOfRecord1002() {
		assertEquals("Anchorage", customers.get(1001).getCounty());
	}

	@Test
	@DisplayName("Record 1002: State is AK")
	void StateOfRecord1002() {
		assertEquals("AK", customers.get(1001).getState());
	}

	@Test
	@DisplayName("Record 1002: ZIP is 99501")
	void ZIPOfRecord1002() {
		assertEquals("99501", customers.get(1001).getZIP());
	}

	@Test
	@DisplayName("Record 1002: Phone is 907-258-2720")
	void PhoneOfRecord1002() {
		assertEquals("907-258-2720", customers.get(1001).getPhone());
	}

	@Test
	@DisplayName("Record 1002: Fax is 907-258-4937")
	void FaxOfRecord1002() {
		assertEquals("907-258-4937", customers.get(1001).getFax());
	}

	@Test
	@DisplayName("Record 1002: Email is wilton@leaver.com")
	void EmailOfRecord1002() {
		assertEquals("wilton@leaver.com", customers.get(1001).getEmail());
	}

	@Test
	@DisplayName("Record 1002: Web is http://www.wiltonleaver.com")
	void WebOfRecord1002() {
		assertEquals("http://www.wiltonleaver.com", customers.get(1001).getWeb());
	}
}
