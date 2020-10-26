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

@Tag("7")
class Record_429 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 429: FirstName is Hector")
	void FirstNameOfRecord429() {
		assertEquals("Hector", customers.get(428).getFirstName());
	}

	@Test
	@DisplayName("Record 429: LastName is Leemow")
	void LastNameOfRecord429() {
		assertEquals("Leemow", customers.get(428).getLastName());
	}

	@Test
	@DisplayName("Record 429: Company is Design Library")
	void CompanyOfRecord429() {
		assertEquals("Design Library", customers.get(428).getCompany());
	}

	@Test
	@DisplayName("Record 429: Address is 25 Andrews Dr")
	void AddressOfRecord429() {
		assertEquals("25 Andrews Dr", customers.get(428).getAddress());
	}

	@Test
	@DisplayName("Record 429: City is Little Falls")
	void CityOfRecord429() {
		assertEquals("Little Falls", customers.get(428).getCity());
	}

	@Test
	@DisplayName("Record 429: County is Passaic")
	void CountyOfRecord429() {
		assertEquals("Passaic", customers.get(428).getCounty());
	}

	@Test
	@DisplayName("Record 429: State is NJ")
	void StateOfRecord429() {
		assertEquals("NJ", customers.get(428).getState());
	}

	@Test
	@DisplayName("Record 429: ZIP is 7424")
	void ZIPOfRecord429() {
		assertEquals("7424", customers.get(428).getZIP());
	}

	@Test
	@DisplayName("Record 429: Phone is 973-812-9079")
	void PhoneOfRecord429() {
		assertEquals("973-812-9079", customers.get(428).getPhone());
	}

	@Test
	@DisplayName("Record 429: Fax is 973-812-4962")
	void FaxOfRecord429() {
		assertEquals("973-812-4962", customers.get(428).getFax());
	}

	@Test
	@DisplayName("Record 429: Email is hector@leemow.com")
	void EmailOfRecord429() {
		assertEquals("hector@leemow.com", customers.get(428).getEmail());
	}

	@Test
	@DisplayName("Record 429: Web is http://www.hectorleemow.com")
	void WebOfRecord429() {
		assertEquals("http://www.hectorleemow.com", customers.get(428).getWeb());
	}
}
