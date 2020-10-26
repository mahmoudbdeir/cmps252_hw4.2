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

@Tag("31")
class Record_941 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 941: FirstName is Mellisa")
	void FirstNameOfRecord941() {
		assertEquals("Mellisa", customers.get(940).getFirstName());
	}

	@Test
	@DisplayName("Record 941: LastName is Mclelland")
	void LastNameOfRecord941() {
		assertEquals("Mclelland", customers.get(940).getLastName());
	}

	@Test
	@DisplayName("Record 941: Company is Harrigfeld, Karna E Esq")
	void CompanyOfRecord941() {
		assertEquals("Harrigfeld, Karna E Esq", customers.get(940).getCompany());
	}

	@Test
	@DisplayName("Record 941: Address is 103 Douglas Rd E")
	void AddressOfRecord941() {
		assertEquals("103 Douglas Rd E", customers.get(940).getAddress());
	}

	@Test
	@DisplayName("Record 941: City is Oldsmar")
	void CityOfRecord941() {
		assertEquals("Oldsmar", customers.get(940).getCity());
	}

	@Test
	@DisplayName("Record 941: County is Pinellas")
	void CountyOfRecord941() {
		assertEquals("Pinellas", customers.get(940).getCounty());
	}

	@Test
	@DisplayName("Record 941: State is FL")
	void StateOfRecord941() {
		assertEquals("FL", customers.get(940).getState());
	}

	@Test
	@DisplayName("Record 941: ZIP is 34677")
	void ZIPOfRecord941() {
		assertEquals("34677", customers.get(940).getZIP());
	}

	@Test
	@DisplayName("Record 941: Phone is 813-854-3490")
	void PhoneOfRecord941() {
		assertEquals("813-854-3490", customers.get(940).getPhone());
	}

	@Test
	@DisplayName("Record 941: Fax is 813-854-0054")
	void FaxOfRecord941() {
		assertEquals("813-854-0054", customers.get(940).getFax());
	}

	@Test
	@DisplayName("Record 941: Email is mellisa@mclelland.com")
	void EmailOfRecord941() {
		assertEquals("mellisa@mclelland.com", customers.get(940).getEmail());
	}

	@Test
	@DisplayName("Record 941: Web is http://www.mellisamclelland.com")
	void WebOfRecord941() {
		assertEquals("http://www.mellisamclelland.com", customers.get(940).getWeb());
	}
}
