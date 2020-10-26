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

@Tag("24")
class Record_3719 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3719: FirstName is Dona")
	void FirstNameOfRecord3719() {
		assertEquals("Dona", customers.get(3718).getFirstName());
	}

	@Test
	@DisplayName("Record 3719: LastName is Billing")
	void LastNameOfRecord3719() {
		assertEquals("Billing", customers.get(3718).getLastName());
	}

	@Test
	@DisplayName("Record 3719: Company is Elissa, Griffith Waldron Esq")
	void CompanyOfRecord3719() {
		assertEquals("Elissa, Griffith Waldron Esq", customers.get(3718).getCompany());
	}

	@Test
	@DisplayName("Record 3719: Address is 154 Holomua St")
	void AddressOfRecord3719() {
		assertEquals("154 Holomua St", customers.get(3718).getAddress());
	}

	@Test
	@DisplayName("Record 3719: City is Hilo")
	void CityOfRecord3719() {
		assertEquals("Hilo", customers.get(3718).getCity());
	}

	@Test
	@DisplayName("Record 3719: County is Hawaii")
	void CountyOfRecord3719() {
		assertEquals("Hawaii", customers.get(3718).getCounty());
	}

	@Test
	@DisplayName("Record 3719: State is HI")
	void StateOfRecord3719() {
		assertEquals("HI", customers.get(3718).getState());
	}

	@Test
	@DisplayName("Record 3719: ZIP is 96720")
	void ZIPOfRecord3719() {
		assertEquals("96720", customers.get(3718).getZIP());
	}

	@Test
	@DisplayName("Record 3719: Phone is 808-935-2152")
	void PhoneOfRecord3719() {
		assertEquals("808-935-2152", customers.get(3718).getPhone());
	}

	@Test
	@DisplayName("Record 3719: Fax is 808-935-8301")
	void FaxOfRecord3719() {
		assertEquals("808-935-8301", customers.get(3718).getFax());
	}

	@Test
	@DisplayName("Record 3719: Email is dona@billing.com")
	void EmailOfRecord3719() {
		assertEquals("dona@billing.com", customers.get(3718).getEmail());
	}

	@Test
	@DisplayName("Record 3719: Web is http://www.donabilling.com")
	void WebOfRecord3719() {
		assertEquals("http://www.donabilling.com", customers.get(3718).getWeb());
	}
}
