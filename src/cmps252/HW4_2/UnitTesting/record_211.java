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

@Tag("11")
class Record_211 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 211: FirstName is Aurora")
	void FirstNameOfRecord211() {
		assertEquals("Aurora", customers.get(210).getFirstName());
	}

	@Test
	@DisplayName("Record 211: LastName is Wunsch")
	void LastNameOfRecord211() {
		assertEquals("Wunsch", customers.get(210).getLastName());
	}

	@Test
	@DisplayName("Record 211: Company is Marriott Catering")
	void CompanyOfRecord211() {
		assertEquals("Marriott Catering", customers.get(210).getCompany());
	}

	@Test
	@DisplayName("Record 211: Address is 65 Makaala St")
	void AddressOfRecord211() {
		assertEquals("65 Makaala St", customers.get(210).getAddress());
	}

	@Test
	@DisplayName("Record 211: City is Hilo")
	void CityOfRecord211() {
		assertEquals("Hilo", customers.get(210).getCity());
	}

	@Test
	@DisplayName("Record 211: County is Hawaii")
	void CountyOfRecord211() {
		assertEquals("Hawaii", customers.get(210).getCounty());
	}

	@Test
	@DisplayName("Record 211: State is HI")
	void StateOfRecord211() {
		assertEquals("HI", customers.get(210).getState());
	}

	@Test
	@DisplayName("Record 211: ZIP is 96720")
	void ZIPOfRecord211() {
		assertEquals("96720", customers.get(210).getZIP());
	}

	@Test
	@DisplayName("Record 211: Phone is 808-969-4325")
	void PhoneOfRecord211() {
		assertEquals("808-969-4325", customers.get(210).getPhone());
	}

	@Test
	@DisplayName("Record 211: Fax is 808-969-7778")
	void FaxOfRecord211() {
		assertEquals("808-969-7778", customers.get(210).getFax());
	}

	@Test
	@DisplayName("Record 211: Email is aurora@wunsch.com")
	void EmailOfRecord211() {
		assertEquals("aurora@wunsch.com", customers.get(210).getEmail());
	}

	@Test
	@DisplayName("Record 211: Web is http://www.aurorawunsch.com")
	void WebOfRecord211() {
		assertEquals("http://www.aurorawunsch.com", customers.get(210).getWeb());
	}
}
