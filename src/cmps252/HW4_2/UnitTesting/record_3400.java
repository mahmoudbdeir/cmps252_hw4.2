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
class Record_3400 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3400: FirstName is Geneva")
	void FirstNameOfRecord3400() {
		assertEquals("Geneva", customers.get(3399).getFirstName());
	}

	@Test
	@DisplayName("Record 3400: LastName is Terhar")
	void LastNameOfRecord3400() {
		assertEquals("Terhar", customers.get(3399).getLastName());
	}

	@Test
	@DisplayName("Record 3400: Company is Central Maxi Storage")
	void CompanyOfRecord3400() {
		assertEquals("Central Maxi Storage", customers.get(3399).getCompany());
	}

	@Test
	@DisplayName("Record 3400: Address is 1560 Locust Ave")
	void AddressOfRecord3400() {
		assertEquals("1560 Locust Ave", customers.get(3399).getAddress());
	}

	@Test
	@DisplayName("Record 3400: City is Bohemia")
	void CityOfRecord3400() {
		assertEquals("Bohemia", customers.get(3399).getCity());
	}

	@Test
	@DisplayName("Record 3400: County is Suffolk")
	void CountyOfRecord3400() {
		assertEquals("Suffolk", customers.get(3399).getCounty());
	}

	@Test
	@DisplayName("Record 3400: State is NY")
	void StateOfRecord3400() {
		assertEquals("NY", customers.get(3399).getState());
	}

	@Test
	@DisplayName("Record 3400: ZIP is 11716")
	void ZIPOfRecord3400() {
		assertEquals("11716", customers.get(3399).getZIP());
	}

	@Test
	@DisplayName("Record 3400: Phone is 631-589-6773")
	void PhoneOfRecord3400() {
		assertEquals("631-589-6773", customers.get(3399).getPhone());
	}

	@Test
	@DisplayName("Record 3400: Fax is 631-589-2251")
	void FaxOfRecord3400() {
		assertEquals("631-589-2251", customers.get(3399).getFax());
	}

	@Test
	@DisplayName("Record 3400: Email is geneva@terhar.com")
	void EmailOfRecord3400() {
		assertEquals("geneva@terhar.com", customers.get(3399).getEmail());
	}

	@Test
	@DisplayName("Record 3400: Web is http://www.genevaterhar.com")
	void WebOfRecord3400() {
		assertEquals("http://www.genevaterhar.com", customers.get(3399).getWeb());
	}
}
