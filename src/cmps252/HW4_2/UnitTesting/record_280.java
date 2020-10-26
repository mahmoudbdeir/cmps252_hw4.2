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

@Tag("48")
class Record_280 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 280: FirstName is Teri")
	void FirstNameOfRecord280() {
		assertEquals("Teri", customers.get(279).getFirstName());
	}

	@Test
	@DisplayName("Record 280: LastName is Carioscia")
	void LastNameOfRecord280() {
		assertEquals("Carioscia", customers.get(279).getLastName());
	}

	@Test
	@DisplayName("Record 280: Company is Floral Dimensions")
	void CompanyOfRecord280() {
		assertEquals("Floral Dimensions", customers.get(279).getCompany());
	}

	@Test
	@DisplayName("Record 280: Address is 622 Charcot Ave  #-b")
	void AddressOfRecord280() {
		assertEquals("622 Charcot Ave  #-b", customers.get(279).getAddress());
	}

	@Test
	@DisplayName("Record 280: City is San Jose")
	void CityOfRecord280() {
		assertEquals("San Jose", customers.get(279).getCity());
	}

	@Test
	@DisplayName("Record 280: County is Santa Clara")
	void CountyOfRecord280() {
		assertEquals("Santa Clara", customers.get(279).getCounty());
	}

	@Test
	@DisplayName("Record 280: State is CA")
	void StateOfRecord280() {
		assertEquals("CA", customers.get(279).getState());
	}

	@Test
	@DisplayName("Record 280: ZIP is 95131")
	void ZIPOfRecord280() {
		assertEquals("95131", customers.get(279).getZIP());
	}

	@Test
	@DisplayName("Record 280: Phone is 408-954-2518")
	void PhoneOfRecord280() {
		assertEquals("408-954-2518", customers.get(279).getPhone());
	}

	@Test
	@DisplayName("Record 280: Fax is 408-954-1039")
	void FaxOfRecord280() {
		assertEquals("408-954-1039", customers.get(279).getFax());
	}

	@Test
	@DisplayName("Record 280: Email is teri@carioscia.com")
	void EmailOfRecord280() {
		assertEquals("teri@carioscia.com", customers.get(279).getEmail());
	}

	@Test
	@DisplayName("Record 280: Web is http://www.tericarioscia.com")
	void WebOfRecord280() {
		assertEquals("http://www.tericarioscia.com", customers.get(279).getWeb());
	}
}
