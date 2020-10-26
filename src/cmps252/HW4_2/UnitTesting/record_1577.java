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

@Tag("46")
class Record_1577 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1577: FirstName is Benita")
	void FirstNameOfRecord1577() {
		assertEquals("Benita", customers.get(1576).getFirstName());
	}

	@Test
	@DisplayName("Record 1577: LastName is Mcgafferty")
	void LastNameOfRecord1577() {
		assertEquals("Mcgafferty", customers.get(1576).getLastName());
	}

	@Test
	@DisplayName("Record 1577: Company is Self, David C Ii")
	void CompanyOfRecord1577() {
		assertEquals("Self, David C Ii", customers.get(1576).getCompany());
	}

	@Test
	@DisplayName("Record 1577: Address is 7701 Pacific St  #-111")
	void AddressOfRecord1577() {
		assertEquals("7701 Pacific St  #-111", customers.get(1576).getAddress());
	}

	@Test
	@DisplayName("Record 1577: City is Omaha")
	void CityOfRecord1577() {
		assertEquals("Omaha", customers.get(1576).getCity());
	}

	@Test
	@DisplayName("Record 1577: County is Douglas")
	void CountyOfRecord1577() {
		assertEquals("Douglas", customers.get(1576).getCounty());
	}

	@Test
	@DisplayName("Record 1577: State is NE")
	void StateOfRecord1577() {
		assertEquals("NE", customers.get(1576).getState());
	}

	@Test
	@DisplayName("Record 1577: ZIP is 68114")
	void ZIPOfRecord1577() {
		assertEquals("68114", customers.get(1576).getZIP());
	}

	@Test
	@DisplayName("Record 1577: Phone is 402-399-3747")
	void PhoneOfRecord1577() {
		assertEquals("402-399-3747", customers.get(1576).getPhone());
	}

	@Test
	@DisplayName("Record 1577: Fax is 402-399-3708")
	void FaxOfRecord1577() {
		assertEquals("402-399-3708", customers.get(1576).getFax());
	}

	@Test
	@DisplayName("Record 1577: Email is benita@mcgafferty.com")
	void EmailOfRecord1577() {
		assertEquals("benita@mcgafferty.com", customers.get(1576).getEmail());
	}

	@Test
	@DisplayName("Record 1577: Web is http://www.benitamcgafferty.com")
	void WebOfRecord1577() {
		assertEquals("http://www.benitamcgafferty.com", customers.get(1576).getWeb());
	}
}
