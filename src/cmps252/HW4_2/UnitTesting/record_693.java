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

@Tag("35")
class Record_693 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 693: FirstName is Marci")
	void FirstNameOfRecord693() {
		assertEquals("Marci", customers.get(692).getFirstName());
	}

	@Test
	@DisplayName("Record 693: LastName is Kady")
	void LastNameOfRecord693() {
		assertEquals("Kady", customers.get(692).getLastName());
	}

	@Test
	@DisplayName("Record 693: Company is Pak Mail Centers Of America")
	void CompanyOfRecord693() {
		assertEquals("Pak Mail Centers Of America", customers.get(692).getCompany());
	}

	@Test
	@DisplayName("Record 693: Address is 330 S Wells St")
	void AddressOfRecord693() {
		assertEquals("330 S Wells St", customers.get(692).getAddress());
	}

	@Test
	@DisplayName("Record 693: City is Chicago")
	void CityOfRecord693() {
		assertEquals("Chicago", customers.get(692).getCity());
	}

	@Test
	@DisplayName("Record 693: County is Cook")
	void CountyOfRecord693() {
		assertEquals("Cook", customers.get(692).getCounty());
	}

	@Test
	@DisplayName("Record 693: State is IL")
	void StateOfRecord693() {
		assertEquals("IL", customers.get(692).getState());
	}

	@Test
	@DisplayName("Record 693: ZIP is 60606")
	void ZIPOfRecord693() {
		assertEquals("60606", customers.get(692).getZIP());
	}

	@Test
	@DisplayName("Record 693: Phone is 312-939-3632")
	void PhoneOfRecord693() {
		assertEquals("312-939-3632", customers.get(692).getPhone());
	}

	@Test
	@DisplayName("Record 693: Fax is 312-939-0352")
	void FaxOfRecord693() {
		assertEquals("312-939-0352", customers.get(692).getFax());
	}

	@Test
	@DisplayName("Record 693: Email is marci@kady.com")
	void EmailOfRecord693() {
		assertEquals("marci@kady.com", customers.get(692).getEmail());
	}

	@Test
	@DisplayName("Record 693: Web is http://www.marcikady.com")
	void WebOfRecord693() {
		assertEquals("http://www.marcikady.com", customers.get(692).getWeb());
	}
}
