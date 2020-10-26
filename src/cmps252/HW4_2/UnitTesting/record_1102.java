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

@Tag("31")
class Record_1102 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1102: FirstName is Lettie")
	void FirstNameOfRecord1102() {
		assertEquals("Lettie", customers.get(1101).getFirstName());
	}

	@Test
	@DisplayName("Record 1102: LastName is Sellen")
	void LastNameOfRecord1102() {
		assertEquals("Sellen", customers.get(1101).getLastName());
	}

	@Test
	@DisplayName("Record 1102: Company is R E Michel Co Inc")
	void CompanyOfRecord1102() {
		assertEquals("R E Michel Co Inc", customers.get(1101).getCompany());
	}

	@Test
	@DisplayName("Record 1102: Address is 4004 Oleander Dr")
	void AddressOfRecord1102() {
		assertEquals("4004 Oleander Dr", customers.get(1101).getAddress());
	}

	@Test
	@DisplayName("Record 1102: City is Wilmington")
	void CityOfRecord1102() {
		assertEquals("Wilmington", customers.get(1101).getCity());
	}

	@Test
	@DisplayName("Record 1102: County is New Hanover")
	void CountyOfRecord1102() {
		assertEquals("New Hanover", customers.get(1101).getCounty());
	}

	@Test
	@DisplayName("Record 1102: State is NC")
	void StateOfRecord1102() {
		assertEquals("NC", customers.get(1101).getState());
	}

	@Test
	@DisplayName("Record 1102: ZIP is 28403")
	void ZIPOfRecord1102() {
		assertEquals("28403", customers.get(1101).getZIP());
	}

	@Test
	@DisplayName("Record 1102: Phone is 910-799-1595")
	void PhoneOfRecord1102() {
		assertEquals("910-799-1595", customers.get(1101).getPhone());
	}

	@Test
	@DisplayName("Record 1102: Fax is 910-799-8224")
	void FaxOfRecord1102() {
		assertEquals("910-799-8224", customers.get(1101).getFax());
	}

	@Test
	@DisplayName("Record 1102: Email is lettie@sellen.com")
	void EmailOfRecord1102() {
		assertEquals("lettie@sellen.com", customers.get(1101).getEmail());
	}

	@Test
	@DisplayName("Record 1102: Web is http://www.lettiesellen.com")
	void WebOfRecord1102() {
		assertEquals("http://www.lettiesellen.com", customers.get(1101).getWeb());
	}
}
