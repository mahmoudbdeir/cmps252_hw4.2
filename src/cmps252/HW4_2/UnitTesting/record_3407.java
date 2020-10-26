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

@Tag("44")
class Record_3407 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3407: FirstName is Ellie")
	void FirstNameOfRecord3407() {
		assertEquals("Ellie", customers.get(3406).getFirstName());
	}

	@Test
	@DisplayName("Record 3407: LastName is Lawrey")
	void LastNameOfRecord3407() {
		assertEquals("Lawrey", customers.get(3406).getLastName());
	}

	@Test
	@DisplayName("Record 3407: Company is Fax 9 Public Fax Service")
	void CompanyOfRecord3407() {
		assertEquals("Fax 9 Public Fax Service", customers.get(3406).getCompany());
	}

	@Test
	@DisplayName("Record 3407: Address is 8023 E 11th Ct")
	void AddressOfRecord3407() {
		assertEquals("8023 E 11th Ct", customers.get(3406).getAddress());
	}

	@Test
	@DisplayName("Record 3407: City is Anchorage")
	void CityOfRecord3407() {
		assertEquals("Anchorage", customers.get(3406).getCity());
	}

	@Test
	@DisplayName("Record 3407: County is Anchorage")
	void CountyOfRecord3407() {
		assertEquals("Anchorage", customers.get(3406).getCounty());
	}

	@Test
	@DisplayName("Record 3407: State is AK")
	void StateOfRecord3407() {
		assertEquals("AK", customers.get(3406).getState());
	}

	@Test
	@DisplayName("Record 3407: ZIP is 99504")
	void ZIPOfRecord3407() {
		assertEquals("99504", customers.get(3406).getZIP());
	}

	@Test
	@DisplayName("Record 3407: Phone is 907-338-4913")
	void PhoneOfRecord3407() {
		assertEquals("907-338-4913", customers.get(3406).getPhone());
	}

	@Test
	@DisplayName("Record 3407: Fax is 907-338-6283")
	void FaxOfRecord3407() {
		assertEquals("907-338-6283", customers.get(3406).getFax());
	}

	@Test
	@DisplayName("Record 3407: Email is ellie@lawrey.com")
	void EmailOfRecord3407() {
		assertEquals("ellie@lawrey.com", customers.get(3406).getEmail());
	}

	@Test
	@DisplayName("Record 3407: Web is http://www.ellielawrey.com")
	void WebOfRecord3407() {
		assertEquals("http://www.ellielawrey.com", customers.get(3406).getWeb());
	}
}
