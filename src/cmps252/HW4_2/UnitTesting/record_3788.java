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
class Record_3788 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3788: FirstName is Lessie")
	void FirstNameOfRecord3788() {
		assertEquals("Lessie", customers.get(3787).getFirstName());
	}

	@Test
	@DisplayName("Record 3788: LastName is Samms")
	void LastNameOfRecord3788() {
		assertEquals("Samms", customers.get(3787).getLastName());
	}

	@Test
	@DisplayName("Record 3788: Company is Foster & Davies Inc")
	void CompanyOfRecord3788() {
		assertEquals("Foster & Davies Inc", customers.get(3787).getCompany());
	}

	@Test
	@DisplayName("Record 3788: Address is 2022 Swift Ave")
	void AddressOfRecord3788() {
		assertEquals("2022 Swift Ave", customers.get(3787).getAddress());
	}

	@Test
	@DisplayName("Record 3788: City is Kansas City")
	void CityOfRecord3788() {
		assertEquals("Kansas City", customers.get(3787).getCity());
	}

	@Test
	@DisplayName("Record 3788: County is Clay")
	void CountyOfRecord3788() {
		assertEquals("Clay", customers.get(3787).getCounty());
	}

	@Test
	@DisplayName("Record 3788: State is MO")
	void StateOfRecord3788() {
		assertEquals("MO", customers.get(3787).getState());
	}

	@Test
	@DisplayName("Record 3788: ZIP is 64116")
	void ZIPOfRecord3788() {
		assertEquals("64116", customers.get(3787).getZIP());
	}

	@Test
	@DisplayName("Record 3788: Phone is 816-421-0750")
	void PhoneOfRecord3788() {
		assertEquals("816-421-0750", customers.get(3787).getPhone());
	}

	@Test
	@DisplayName("Record 3788: Fax is 816-421-9488")
	void FaxOfRecord3788() {
		assertEquals("816-421-9488", customers.get(3787).getFax());
	}

	@Test
	@DisplayName("Record 3788: Email is lessie@samms.com")
	void EmailOfRecord3788() {
		assertEquals("lessie@samms.com", customers.get(3787).getEmail());
	}

	@Test
	@DisplayName("Record 3788: Web is http://www.lessiesamms.com")
	void WebOfRecord3788() {
		assertEquals("http://www.lessiesamms.com", customers.get(3787).getWeb());
	}
}
