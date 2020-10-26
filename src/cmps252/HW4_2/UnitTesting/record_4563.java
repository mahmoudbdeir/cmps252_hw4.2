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
class Record_4563 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4563: FirstName is Mollie")
	void FirstNameOfRecord4563() {
		assertEquals("Mollie", customers.get(4562).getFirstName());
	}

	@Test
	@DisplayName("Record 4563: LastName is Planty")
	void LastNameOfRecord4563() {
		assertEquals("Planty", customers.get(4562).getLastName());
	}

	@Test
	@DisplayName("Record 4563: Company is Redwood Printing & Design")
	void CompanyOfRecord4563() {
		assertEquals("Redwood Printing & Design", customers.get(4562).getCompany());
	}

	@Test
	@DisplayName("Record 4563: Address is 3201 Arch St")
	void AddressOfRecord4563() {
		assertEquals("3201 Arch St", customers.get(4562).getAddress());
	}

	@Test
	@DisplayName("Record 4563: City is Philadelphia")
	void CityOfRecord4563() {
		assertEquals("Philadelphia", customers.get(4562).getCity());
	}

	@Test
	@DisplayName("Record 4563: County is Philadelphia")
	void CountyOfRecord4563() {
		assertEquals("Philadelphia", customers.get(4562).getCounty());
	}

	@Test
	@DisplayName("Record 4563: State is PA")
	void StateOfRecord4563() {
		assertEquals("PA", customers.get(4562).getState());
	}

	@Test
	@DisplayName("Record 4563: ZIP is 19104")
	void ZIPOfRecord4563() {
		assertEquals("19104", customers.get(4562).getZIP());
	}

	@Test
	@DisplayName("Record 4563: Phone is 215-662-6979")
	void PhoneOfRecord4563() {
		assertEquals("215-662-6979", customers.get(4562).getPhone());
	}

	@Test
	@DisplayName("Record 4563: Fax is 215-662-0324")
	void FaxOfRecord4563() {
		assertEquals("215-662-0324", customers.get(4562).getFax());
	}

	@Test
	@DisplayName("Record 4563: Email is mollie@planty.com")
	void EmailOfRecord4563() {
		assertEquals("mollie@planty.com", customers.get(4562).getEmail());
	}

	@Test
	@DisplayName("Record 4563: Web is http://www.mollieplanty.com")
	void WebOfRecord4563() {
		assertEquals("http://www.mollieplanty.com", customers.get(4562).getWeb());
	}
}
