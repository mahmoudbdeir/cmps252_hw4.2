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

@Tag("15")
class Record_3206 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3206: FirstName is Cecilia")
	void FirstNameOfRecord3206() {
		assertEquals("Cecilia", customers.get(3205).getFirstName());
	}

	@Test
	@DisplayName("Record 3206: LastName is Broadstone")
	void LastNameOfRecord3206() {
		assertEquals("Broadstone", customers.get(3205).getLastName());
	}

	@Test
	@DisplayName("Record 3206: Company is Aci Computers")
	void CompanyOfRecord3206() {
		assertEquals("Aci Computers", customers.get(3205).getCompany());
	}

	@Test
	@DisplayName("Record 3206: Address is 1716 K Ave")
	void AddressOfRecord3206() {
		assertEquals("1716 K Ave", customers.get(3205).getAddress());
	}

	@Test
	@DisplayName("Record 3206: City is Plano")
	void CityOfRecord3206() {
		assertEquals("Plano", customers.get(3205).getCity());
	}

	@Test
	@DisplayName("Record 3206: County is Collin")
	void CountyOfRecord3206() {
		assertEquals("Collin", customers.get(3205).getCounty());
	}

	@Test
	@DisplayName("Record 3206: State is TX")
	void StateOfRecord3206() {
		assertEquals("TX", customers.get(3205).getState());
	}

	@Test
	@DisplayName("Record 3206: ZIP is 75074")
	void ZIPOfRecord3206() {
		assertEquals("75074", customers.get(3205).getZIP());
	}

	@Test
	@DisplayName("Record 3206: Phone is 972-422-6576")
	void PhoneOfRecord3206() {
		assertEquals("972-422-6576", customers.get(3205).getPhone());
	}

	@Test
	@DisplayName("Record 3206: Fax is 972-422-1662")
	void FaxOfRecord3206() {
		assertEquals("972-422-1662", customers.get(3205).getFax());
	}

	@Test
	@DisplayName("Record 3206: Email is cecilia@broadstone.com")
	void EmailOfRecord3206() {
		assertEquals("cecilia@broadstone.com", customers.get(3205).getEmail());
	}

	@Test
	@DisplayName("Record 3206: Web is http://www.ceciliabroadstone.com")
	void WebOfRecord3206() {
		assertEquals("http://www.ceciliabroadstone.com", customers.get(3205).getWeb());
	}
}
