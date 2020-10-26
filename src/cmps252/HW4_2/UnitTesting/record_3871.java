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

@Tag("45")
class Record_3871 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3871: FirstName is Santiago")
	void FirstNameOfRecord3871() {
		assertEquals("Santiago", customers.get(3870).getFirstName());
	}

	@Test
	@DisplayName("Record 3871: LastName is Escalet")
	void LastNameOfRecord3871() {
		assertEquals("Escalet", customers.get(3870).getLastName());
	}

	@Test
	@DisplayName("Record 3871: Company is Vangy Toll Co Inc")
	void CompanyOfRecord3871() {
		assertEquals("Vangy Toll Co Inc", customers.get(3870).getCompany());
	}

	@Test
	@DisplayName("Record 3871: Address is 44 E 29th St")
	void AddressOfRecord3871() {
		assertEquals("44 E 29th St", customers.get(3870).getAddress());
	}

	@Test
	@DisplayName("Record 3871: City is New York")
	void CityOfRecord3871() {
		assertEquals("New York", customers.get(3870).getCity());
	}

	@Test
	@DisplayName("Record 3871: County is New York")
	void CountyOfRecord3871() {
		assertEquals("New York", customers.get(3870).getCounty());
	}

	@Test
	@DisplayName("Record 3871: State is NY")
	void StateOfRecord3871() {
		assertEquals("NY", customers.get(3870).getState());
	}

	@Test
	@DisplayName("Record 3871: ZIP is 10016")
	void ZIPOfRecord3871() {
		assertEquals("10016", customers.get(3870).getZIP());
	}

	@Test
	@DisplayName("Record 3871: Phone is 212-779-7386")
	void PhoneOfRecord3871() {
		assertEquals("212-779-7386", customers.get(3870).getPhone());
	}

	@Test
	@DisplayName("Record 3871: Fax is 212-779-1247")
	void FaxOfRecord3871() {
		assertEquals("212-779-1247", customers.get(3870).getFax());
	}

	@Test
	@DisplayName("Record 3871: Email is santiago@escalet.com")
	void EmailOfRecord3871() {
		assertEquals("santiago@escalet.com", customers.get(3870).getEmail());
	}

	@Test
	@DisplayName("Record 3871: Web is http://www.santiagoescalet.com")
	void WebOfRecord3871() {
		assertEquals("http://www.santiagoescalet.com", customers.get(3870).getWeb());
	}
}
