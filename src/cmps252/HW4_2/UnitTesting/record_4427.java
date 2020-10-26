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

@Tag("49")
class Record_4427 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4427: FirstName is Tania")
	void FirstNameOfRecord4427() {
		assertEquals("Tania", customers.get(4426).getFirstName());
	}

	@Test
	@DisplayName("Record 4427: LastName is Smialek")
	void LastNameOfRecord4427() {
		assertEquals("Smialek", customers.get(4426).getLastName());
	}

	@Test
	@DisplayName("Record 4427: Company is Frets & Necks Guitar Specialty")
	void CompanyOfRecord4427() {
		assertEquals("Frets & Necks Guitar Specialty", customers.get(4426).getCompany());
	}

	@Test
	@DisplayName("Record 4427: Address is 380 Fee Fee Rd")
	void AddressOfRecord4427() {
		assertEquals("380 Fee Fee Rd", customers.get(4426).getAddress());
	}

	@Test
	@DisplayName("Record 4427: City is Maryland Hyghts")
	void CityOfRecord4427() {
		assertEquals("Maryland Hyghts", customers.get(4426).getCity());
	}

	@Test
	@DisplayName("Record 4427: County is Saint Louis")
	void CountyOfRecord4427() {
		assertEquals("Saint Louis", customers.get(4426).getCounty());
	}

	@Test
	@DisplayName("Record 4427: State is MO")
	void StateOfRecord4427() {
		assertEquals("MO", customers.get(4426).getState());
	}

	@Test
	@DisplayName("Record 4427: ZIP is 63043")
	void ZIPOfRecord4427() {
		assertEquals("63043", customers.get(4426).getZIP());
	}

	@Test
	@DisplayName("Record 4427: Phone is 314-291-6505")
	void PhoneOfRecord4427() {
		assertEquals("314-291-6505", customers.get(4426).getPhone());
	}

	@Test
	@DisplayName("Record 4427: Fax is 314-291-2728")
	void FaxOfRecord4427() {
		assertEquals("314-291-2728", customers.get(4426).getFax());
	}

	@Test
	@DisplayName("Record 4427: Email is tania@smialek.com")
	void EmailOfRecord4427() {
		assertEquals("tania@smialek.com", customers.get(4426).getEmail());
	}

	@Test
	@DisplayName("Record 4427: Web is http://www.taniasmialek.com")
	void WebOfRecord4427() {
		assertEquals("http://www.taniasmialek.com", customers.get(4426).getWeb());
	}
}
