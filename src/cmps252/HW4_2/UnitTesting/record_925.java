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

@Tag("27")
class Record_925 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 925: FirstName is Lemuel")
	void FirstNameOfRecord925() {
		assertEquals("Lemuel", customers.get(924).getFirstName());
	}

	@Test
	@DisplayName("Record 925: LastName is Kressin")
	void LastNameOfRecord925() {
		assertEquals("Kressin", customers.get(924).getLastName());
	}

	@Test
	@DisplayName("Record 925: Company is White, H Jay Esq")
	void CompanyOfRecord925() {
		assertEquals("White, H Jay Esq", customers.get(924).getCompany());
	}

	@Test
	@DisplayName("Record 925: Address is 1632 Hart St")
	void AddressOfRecord925() {
		assertEquals("1632 Hart St", customers.get(924).getAddress());
	}

	@Test
	@DisplayName("Record 925: City is Honolulu")
	void CityOfRecord925() {
		assertEquals("Honolulu", customers.get(924).getCity());
	}

	@Test
	@DisplayName("Record 925: County is Honolulu")
	void CountyOfRecord925() {
		assertEquals("Honolulu", customers.get(924).getCounty());
	}

	@Test
	@DisplayName("Record 925: State is HI")
	void StateOfRecord925() {
		assertEquals("HI", customers.get(924).getState());
	}

	@Test
	@DisplayName("Record 925: ZIP is 96817")
	void ZIPOfRecord925() {
		assertEquals("96817", customers.get(924).getZIP());
	}

	@Test
	@DisplayName("Record 925: Phone is 808-533-4104")
	void PhoneOfRecord925() {
		assertEquals("808-533-4104", customers.get(924).getPhone());
	}

	@Test
	@DisplayName("Record 925: Fax is 808-533-6965")
	void FaxOfRecord925() {
		assertEquals("808-533-6965", customers.get(924).getFax());
	}

	@Test
	@DisplayName("Record 925: Email is lemuel@kressin.com")
	void EmailOfRecord925() {
		assertEquals("lemuel@kressin.com", customers.get(924).getEmail());
	}

	@Test
	@DisplayName("Record 925: Web is http://www.lemuelkressin.com")
	void WebOfRecord925() {
		assertEquals("http://www.lemuelkressin.com", customers.get(924).getWeb());
	}
}
