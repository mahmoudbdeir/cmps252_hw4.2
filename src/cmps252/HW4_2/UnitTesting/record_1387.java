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

@Tag("14")
class Record_1387 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1387: FirstName is Jake")
	void FirstNameOfRecord1387() {
		assertEquals("Jake", customers.get(1386).getFirstName());
	}

	@Test
	@DisplayName("Record 1387: LastName is Shipman")
	void LastNameOfRecord1387() {
		assertEquals("Shipman", customers.get(1386).getLastName());
	}

	@Test
	@DisplayName("Record 1387: Company is Lima Painting Co")
	void CompanyOfRecord1387() {
		assertEquals("Lima Painting Co", customers.get(1386).getCompany());
	}

	@Test
	@DisplayName("Record 1387: Address is 500 N Congress Ave")
	void AddressOfRecord1387() {
		assertEquals("500 N Congress Ave", customers.get(1386).getAddress());
	}

	@Test
	@DisplayName("Record 1387: City is Evansville")
	void CityOfRecord1387() {
		assertEquals("Evansville", customers.get(1386).getCity());
	}

	@Test
	@DisplayName("Record 1387: County is Vanderburgh")
	void CountyOfRecord1387() {
		assertEquals("Vanderburgh", customers.get(1386).getCounty());
	}

	@Test
	@DisplayName("Record 1387: State is IN")
	void StateOfRecord1387() {
		assertEquals("IN", customers.get(1386).getState());
	}

	@Test
	@DisplayName("Record 1387: ZIP is 47715")
	void ZIPOfRecord1387() {
		assertEquals("47715", customers.get(1386).getZIP());
	}

	@Test
	@DisplayName("Record 1387: Phone is 812-473-9217")
	void PhoneOfRecord1387() {
		assertEquals("812-473-9217", customers.get(1386).getPhone());
	}

	@Test
	@DisplayName("Record 1387: Fax is 812-473-1326")
	void FaxOfRecord1387() {
		assertEquals("812-473-1326", customers.get(1386).getFax());
	}

	@Test
	@DisplayName("Record 1387: Email is jake@shipman.com")
	void EmailOfRecord1387() {
		assertEquals("jake@shipman.com", customers.get(1386).getEmail());
	}

	@Test
	@DisplayName("Record 1387: Web is http://www.jakeshipman.com")
	void WebOfRecord1387() {
		assertEquals("http://www.jakeshipman.com", customers.get(1386).getWeb());
	}
}
