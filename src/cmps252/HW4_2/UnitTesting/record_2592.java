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

@Tag("12")
class Record_2592 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2592: FirstName is Toni")
	void FirstNameOfRecord2592() {
		assertEquals("Toni", customers.get(2591).getFirstName());
	}

	@Test
	@DisplayName("Record 2592: LastName is Yamanaka")
	void LastNameOfRecord2592() {
		assertEquals("Yamanaka", customers.get(2591).getLastName());
	}

	@Test
	@DisplayName("Record 2592: Company is San Diego Foreclosure Svc Inc")
	void CompanyOfRecord2592() {
		assertEquals("San Diego Foreclosure Svc Inc", customers.get(2591).getCompany());
	}

	@Test
	@DisplayName("Record 2592: Address is 37841 Euclid Ave")
	void AddressOfRecord2592() {
		assertEquals("37841 Euclid Ave", customers.get(2591).getAddress());
	}

	@Test
	@DisplayName("Record 2592: City is Willoughby")
	void CityOfRecord2592() {
		assertEquals("Willoughby", customers.get(2591).getCity());
	}

	@Test
	@DisplayName("Record 2592: County is Lake")
	void CountyOfRecord2592() {
		assertEquals("Lake", customers.get(2591).getCounty());
	}

	@Test
	@DisplayName("Record 2592: State is OH")
	void StateOfRecord2592() {
		assertEquals("OH", customers.get(2591).getState());
	}

	@Test
	@DisplayName("Record 2592: ZIP is 44094")
	void ZIPOfRecord2592() {
		assertEquals("44094", customers.get(2591).getZIP());
	}

	@Test
	@DisplayName("Record 2592: Phone is 440-951-4283")
	void PhoneOfRecord2592() {
		assertEquals("440-951-4283", customers.get(2591).getPhone());
	}

	@Test
	@DisplayName("Record 2592: Fax is 440-951-4434")
	void FaxOfRecord2592() {
		assertEquals("440-951-4434", customers.get(2591).getFax());
	}

	@Test
	@DisplayName("Record 2592: Email is toni@yamanaka.com")
	void EmailOfRecord2592() {
		assertEquals("toni@yamanaka.com", customers.get(2591).getEmail());
	}

	@Test
	@DisplayName("Record 2592: Web is http://www.toniyamanaka.com")
	void WebOfRecord2592() {
		assertEquals("http://www.toniyamanaka.com", customers.get(2591).getWeb());
	}
}
