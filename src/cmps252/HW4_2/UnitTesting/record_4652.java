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

@Tag("40")
class Record_4652 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4652: FirstName is Fermin")
	void FirstNameOfRecord4652() {
		assertEquals("Fermin", customers.get(4651).getFirstName());
	}

	@Test
	@DisplayName("Record 4652: LastName is Waisner")
	void LastNameOfRecord4652() {
		assertEquals("Waisner", customers.get(4651).getLastName());
	}

	@Test
	@DisplayName("Record 4652: Company is Catey Controls Inc")
	void CompanyOfRecord4652() {
		assertEquals("Catey Controls Inc", customers.get(4651).getCompany());
	}

	@Test
	@DisplayName("Record 4652: Address is 4563 Hamann Industrial Pky")
	void AddressOfRecord4652() {
		assertEquals("4563 Hamann Industrial Pky", customers.get(4651).getAddress());
	}

	@Test
	@DisplayName("Record 4652: City is Willoughby")
	void CityOfRecord4652() {
		assertEquals("Willoughby", customers.get(4651).getCity());
	}

	@Test
	@DisplayName("Record 4652: County is Lake")
	void CountyOfRecord4652() {
		assertEquals("Lake", customers.get(4651).getCounty());
	}

	@Test
	@DisplayName("Record 4652: State is OH")
	void StateOfRecord4652() {
		assertEquals("OH", customers.get(4651).getState());
	}

	@Test
	@DisplayName("Record 4652: ZIP is 44094")
	void ZIPOfRecord4652() {
		assertEquals("44094", customers.get(4651).getZIP());
	}

	@Test
	@DisplayName("Record 4652: Phone is 440-946-5584")
	void PhoneOfRecord4652() {
		assertEquals("440-946-5584", customers.get(4651).getPhone());
	}

	@Test
	@DisplayName("Record 4652: Fax is 440-946-2579")
	void FaxOfRecord4652() {
		assertEquals("440-946-2579", customers.get(4651).getFax());
	}

	@Test
	@DisplayName("Record 4652: Email is fermin@waisner.com")
	void EmailOfRecord4652() {
		assertEquals("fermin@waisner.com", customers.get(4651).getEmail());
	}

	@Test
	@DisplayName("Record 4652: Web is http://www.ferminwaisner.com")
	void WebOfRecord4652() {
		assertEquals("http://www.ferminwaisner.com", customers.get(4651).getWeb());
	}
}
