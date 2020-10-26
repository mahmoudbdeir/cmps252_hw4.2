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

@Tag("17")
class Record_3699 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3699: FirstName is Randell")
	void FirstNameOfRecord3699() {
		assertEquals("Randell", customers.get(3698).getFirstName());
	}

	@Test
	@DisplayName("Record 3699: LastName is Rhoads")
	void LastNameOfRecord3699() {
		assertEquals("Rhoads", customers.get(3698).getLastName());
	}

	@Test
	@DisplayName("Record 3699: Company is Airline Delivery Svces")
	void CompanyOfRecord3699() {
		assertEquals("Airline Delivery Svces", customers.get(3698).getCompany());
	}

	@Test
	@DisplayName("Record 3699: Address is 10520 Hickman Rd")
	void AddressOfRecord3699() {
		assertEquals("10520 Hickman Rd", customers.get(3698).getAddress());
	}

	@Test
	@DisplayName("Record 3699: City is Clive")
	void CityOfRecord3699() {
		assertEquals("Clive", customers.get(3698).getCity());
	}

	@Test
	@DisplayName("Record 3699: County is Polk")
	void CountyOfRecord3699() {
		assertEquals("Polk", customers.get(3698).getCounty());
	}

	@Test
	@DisplayName("Record 3699: State is IA")
	void StateOfRecord3699() {
		assertEquals("IA", customers.get(3698).getState());
	}

	@Test
	@DisplayName("Record 3699: ZIP is 50325")
	void ZIPOfRecord3699() {
		assertEquals("50325", customers.get(3698).getZIP());
	}

	@Test
	@DisplayName("Record 3699: Phone is 515-223-1936")
	void PhoneOfRecord3699() {
		assertEquals("515-223-1936", customers.get(3698).getPhone());
	}

	@Test
	@DisplayName("Record 3699: Fax is 515-223-5515")
	void FaxOfRecord3699() {
		assertEquals("515-223-5515", customers.get(3698).getFax());
	}

	@Test
	@DisplayName("Record 3699: Email is randell@rhoads.com")
	void EmailOfRecord3699() {
		assertEquals("randell@rhoads.com", customers.get(3698).getEmail());
	}

	@Test
	@DisplayName("Record 3699: Web is http://www.randellrhoads.com")
	void WebOfRecord3699() {
		assertEquals("http://www.randellrhoads.com", customers.get(3698).getWeb());
	}
}
