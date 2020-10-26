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

@Tag("1")
class Record_2207 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2207: FirstName is Rosario")
	void FirstNameOfRecord2207() {
		assertEquals("Rosario", customers.get(2206).getFirstName());
	}

	@Test
	@DisplayName("Record 2207: LastName is Maniar")
	void LastNameOfRecord2207() {
		assertEquals("Maniar", customers.get(2206).getLastName());
	}

	@Test
	@DisplayName("Record 2207: Company is Industrial Commission")
	void CompanyOfRecord2207() {
		assertEquals("Industrial Commission", customers.get(2206).getCompany());
	}

	@Test
	@DisplayName("Record 2207: Address is 17321 Telegraph Rd")
	void AddressOfRecord2207() {
		assertEquals("17321 Telegraph Rd", customers.get(2206).getAddress());
	}

	@Test
	@DisplayName("Record 2207: City is Detroit")
	void CityOfRecord2207() {
		assertEquals("Detroit", customers.get(2206).getCity());
	}

	@Test
	@DisplayName("Record 2207: County is Wayne")
	void CountyOfRecord2207() {
		assertEquals("Wayne", customers.get(2206).getCounty());
	}

	@Test
	@DisplayName("Record 2207: State is MI")
	void StateOfRecord2207() {
		assertEquals("MI", customers.get(2206).getState());
	}

	@Test
	@DisplayName("Record 2207: ZIP is 48219")
	void ZIPOfRecord2207() {
		assertEquals("48219", customers.get(2206).getZIP());
	}

	@Test
	@DisplayName("Record 2207: Phone is 313-535-0551")
	void PhoneOfRecord2207() {
		assertEquals("313-535-0551", customers.get(2206).getPhone());
	}

	@Test
	@DisplayName("Record 2207: Fax is 313-535-6044")
	void FaxOfRecord2207() {
		assertEquals("313-535-6044", customers.get(2206).getFax());
	}

	@Test
	@DisplayName("Record 2207: Email is rosario@maniar.com")
	void EmailOfRecord2207() {
		assertEquals("rosario@maniar.com", customers.get(2206).getEmail());
	}

	@Test
	@DisplayName("Record 2207: Web is http://www.rosariomaniar.com")
	void WebOfRecord2207() {
		assertEquals("http://www.rosariomaniar.com", customers.get(2206).getWeb());
	}
}
