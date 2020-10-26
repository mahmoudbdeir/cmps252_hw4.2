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
class Record_3275 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3275: FirstName is Lucia")
	void FirstNameOfRecord3275() {
		assertEquals("Lucia", customers.get(3274).getFirstName());
	}

	@Test
	@DisplayName("Record 3275: LastName is Westmark")
	void LastNameOfRecord3275() {
		assertEquals("Westmark", customers.get(3274).getLastName());
	}

	@Test
	@DisplayName("Record 3275: Company is Rudolph, Michael D Esq")
	void CompanyOfRecord3275() {
		assertEquals("Rudolph, Michael D Esq", customers.get(3274).getCompany());
	}

	@Test
	@DisplayName("Record 3275: Address is Dover Ave")
	void AddressOfRecord3275() {
		assertEquals("Dover Ave", customers.get(3274).getAddress());
	}

	@Test
	@DisplayName("Record 3275: City is Trenton")
	void CityOfRecord3275() {
		assertEquals("Trenton", customers.get(3274).getCity());
	}

	@Test
	@DisplayName("Record 3275: County is Mercer")
	void CountyOfRecord3275() {
		assertEquals("Mercer", customers.get(3274).getCounty());
	}

	@Test
	@DisplayName("Record 3275: State is NJ")
	void StateOfRecord3275() {
		assertEquals("NJ", customers.get(3274).getState());
	}

	@Test
	@DisplayName("Record 3275: ZIP is 8620")
	void ZIPOfRecord3275() {
		assertEquals("8620", customers.get(3274).getZIP());
	}

	@Test
	@DisplayName("Record 3275: Phone is 609-882-2124")
	void PhoneOfRecord3275() {
		assertEquals("609-882-2124", customers.get(3274).getPhone());
	}

	@Test
	@DisplayName("Record 3275: Fax is 609-882-1019")
	void FaxOfRecord3275() {
		assertEquals("609-882-1019", customers.get(3274).getFax());
	}

	@Test
	@DisplayName("Record 3275: Email is lucia@westmark.com")
	void EmailOfRecord3275() {
		assertEquals("lucia@westmark.com", customers.get(3274).getEmail());
	}

	@Test
	@DisplayName("Record 3275: Web is http://www.luciawestmark.com")
	void WebOfRecord3275() {
		assertEquals("http://www.luciawestmark.com", customers.get(3274).getWeb());
	}
}
