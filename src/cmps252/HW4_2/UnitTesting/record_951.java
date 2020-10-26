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
class Record_951 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 951: FirstName is Adele")
	void FirstNameOfRecord951() {
		assertEquals("Adele", customers.get(950).getFirstName());
	}

	@Test
	@DisplayName("Record 951: LastName is Zasso")
	void LastNameOfRecord951() {
		assertEquals("Zasso", customers.get(950).getLastName());
	}

	@Test
	@DisplayName("Record 951: Company is Properties Of Distinctions Inc")
	void CompanyOfRecord951() {
		assertEquals("Properties Of Distinctions Inc", customers.get(950).getCompany());
	}

	@Test
	@DisplayName("Record 951: Address is 109 E Pine St")
	void AddressOfRecord951() {
		assertEquals("109 E Pine St", customers.get(950).getAddress());
	}

	@Test
	@DisplayName("Record 951: City is Orlando")
	void CityOfRecord951() {
		assertEquals("Orlando", customers.get(950).getCity());
	}

	@Test
	@DisplayName("Record 951: County is Orange")
	void CountyOfRecord951() {
		assertEquals("Orange", customers.get(950).getCounty());
	}

	@Test
	@DisplayName("Record 951: State is FL")
	void StateOfRecord951() {
		assertEquals("FL", customers.get(950).getState());
	}

	@Test
	@DisplayName("Record 951: ZIP is 32801")
	void ZIPOfRecord951() {
		assertEquals("32801", customers.get(950).getZIP());
	}

	@Test
	@DisplayName("Record 951: Phone is 407-843-2965")
	void PhoneOfRecord951() {
		assertEquals("407-843-2965", customers.get(950).getPhone());
	}

	@Test
	@DisplayName("Record 951: Fax is 407-843-7151")
	void FaxOfRecord951() {
		assertEquals("407-843-7151", customers.get(950).getFax());
	}

	@Test
	@DisplayName("Record 951: Email is adele@zasso.com")
	void EmailOfRecord951() {
		assertEquals("adele@zasso.com", customers.get(950).getEmail());
	}

	@Test
	@DisplayName("Record 951: Web is http://www.adelezasso.com")
	void WebOfRecord951() {
		assertEquals("http://www.adelezasso.com", customers.get(950).getWeb());
	}
}
