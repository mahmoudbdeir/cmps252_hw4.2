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

@Tag("3")
class Record_3917 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3917: FirstName is Von")
	void FirstNameOfRecord3917() {
		assertEquals("Von", customers.get(3916).getFirstName());
	}

	@Test
	@DisplayName("Record 3917: LastName is Pacholski")
	void LastNameOfRecord3917() {
		assertEquals("Pacholski", customers.get(3916).getLastName());
	}

	@Test
	@DisplayName("Record 3917: Company is A Metro Alarms & Locksmiths")
	void CompanyOfRecord3917() {
		assertEquals("A Metro Alarms & Locksmiths", customers.get(3916).getCompany());
	}

	@Test
	@DisplayName("Record 3917: Address is 72 Everett Rd")
	void AddressOfRecord3917() {
		assertEquals("72 Everett Rd", customers.get(3916).getAddress());
	}

	@Test
	@DisplayName("Record 3917: City is Albany")
	void CityOfRecord3917() {
		assertEquals("Albany", customers.get(3916).getCity());
	}

	@Test
	@DisplayName("Record 3917: County is Albany")
	void CountyOfRecord3917() {
		assertEquals("Albany", customers.get(3916).getCounty());
	}

	@Test
	@DisplayName("Record 3917: State is NY")
	void StateOfRecord3917() {
		assertEquals("NY", customers.get(3916).getState());
	}

	@Test
	@DisplayName("Record 3917: ZIP is 12205")
	void ZIPOfRecord3917() {
		assertEquals("12205", customers.get(3916).getZIP());
	}

	@Test
	@DisplayName("Record 3917: Phone is 518-438-8904")
	void PhoneOfRecord3917() {
		assertEquals("518-438-8904", customers.get(3916).getPhone());
	}

	@Test
	@DisplayName("Record 3917: Fax is 518-438-3105")
	void FaxOfRecord3917() {
		assertEquals("518-438-3105", customers.get(3916).getFax());
	}

	@Test
	@DisplayName("Record 3917: Email is von@pacholski.com")
	void EmailOfRecord3917() {
		assertEquals("von@pacholski.com", customers.get(3916).getEmail());
	}

	@Test
	@DisplayName("Record 3917: Web is http://www.vonpacholski.com")
	void WebOfRecord3917() {
		assertEquals("http://www.vonpacholski.com", customers.get(3916).getWeb());
	}
}
