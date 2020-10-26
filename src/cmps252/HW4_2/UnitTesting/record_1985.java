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

@Tag("9")
class Record_1985 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1985: FirstName is Mariana")
	void FirstNameOfRecord1985() {
		assertEquals("Mariana", customers.get(1984).getFirstName());
	}

	@Test
	@DisplayName("Record 1985: LastName is Haab")
	void LastNameOfRecord1985() {
		assertEquals("Haab", customers.get(1984).getLastName());
	}

	@Test
	@DisplayName("Record 1985: Company is Kirby, Joseph D Esq")
	void CompanyOfRecord1985() {
		assertEquals("Kirby, Joseph D Esq", customers.get(1984).getCompany());
	}

	@Test
	@DisplayName("Record 1985: Address is 2500 E 6th Ave")
	void AddressOfRecord1985() {
		assertEquals("2500 E 6th Ave", customers.get(1984).getAddress());
	}

	@Test
	@DisplayName("Record 1985: City is Denver")
	void CityOfRecord1985() {
		assertEquals("Denver", customers.get(1984).getCity());
	}

	@Test
	@DisplayName("Record 1985: County is Denver")
	void CountyOfRecord1985() {
		assertEquals("Denver", customers.get(1984).getCounty());
	}

	@Test
	@DisplayName("Record 1985: State is CO")
	void StateOfRecord1985() {
		assertEquals("CO", customers.get(1984).getState());
	}

	@Test
	@DisplayName("Record 1985: ZIP is 80206")
	void ZIPOfRecord1985() {
		assertEquals("80206", customers.get(1984).getZIP());
	}

	@Test
	@DisplayName("Record 1985: Phone is 303-322-5392")
	void PhoneOfRecord1985() {
		assertEquals("303-322-5392", customers.get(1984).getPhone());
	}

	@Test
	@DisplayName("Record 1985: Fax is 303-322-5741")
	void FaxOfRecord1985() {
		assertEquals("303-322-5741", customers.get(1984).getFax());
	}

	@Test
	@DisplayName("Record 1985: Email is mariana@haab.com")
	void EmailOfRecord1985() {
		assertEquals("mariana@haab.com", customers.get(1984).getEmail());
	}

	@Test
	@DisplayName("Record 1985: Web is http://www.marianahaab.com")
	void WebOfRecord1985() {
		assertEquals("http://www.marianahaab.com", customers.get(1984).getWeb());
	}
}
