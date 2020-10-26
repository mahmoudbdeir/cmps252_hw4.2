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

@Tag("49")
class Record_1365 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1365: FirstName is Austin")
	void FirstNameOfRecord1365() {
		assertEquals("Austin", customers.get(1364).getFirstName());
	}

	@Test
	@DisplayName("Record 1365: LastName is Raschilla")
	void LastNameOfRecord1365() {
		assertEquals("Raschilla", customers.get(1364).getLastName());
	}

	@Test
	@DisplayName("Record 1365: Company is Century 21 Homes R Us Inc")
	void CompanyOfRecord1365() {
		assertEquals("Century 21 Homes R Us Inc", customers.get(1364).getCompany());
	}

	@Test
	@DisplayName("Record 1365: Address is 17 Joyce St")
	void AddressOfRecord1365() {
		assertEquals("17 Joyce St", customers.get(1364).getAddress());
	}

	@Test
	@DisplayName("Record 1365: City is Lynn")
	void CityOfRecord1365() {
		assertEquals("Lynn", customers.get(1364).getCity());
	}

	@Test
	@DisplayName("Record 1365: County is Essex")
	void CountyOfRecord1365() {
		assertEquals("Essex", customers.get(1364).getCounty());
	}

	@Test
	@DisplayName("Record 1365: State is MA")
	void StateOfRecord1365() {
		assertEquals("MA", customers.get(1364).getState());
	}

	@Test
	@DisplayName("Record 1365: ZIP is 1902")
	void ZIPOfRecord1365() {
		assertEquals("1902", customers.get(1364).getZIP());
	}

	@Test
	@DisplayName("Record 1365: Phone is 781-592-7302")
	void PhoneOfRecord1365() {
		assertEquals("781-592-7302", customers.get(1364).getPhone());
	}

	@Test
	@DisplayName("Record 1365: Fax is 781-592-6361")
	void FaxOfRecord1365() {
		assertEquals("781-592-6361", customers.get(1364).getFax());
	}

	@Test
	@DisplayName("Record 1365: Email is austin@raschilla.com")
	void EmailOfRecord1365() {
		assertEquals("austin@raschilla.com", customers.get(1364).getEmail());
	}

	@Test
	@DisplayName("Record 1365: Web is http://www.austinraschilla.com")
	void WebOfRecord1365() {
		assertEquals("http://www.austinraschilla.com", customers.get(1364).getWeb());
	}
}
