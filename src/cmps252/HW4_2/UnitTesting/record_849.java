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

@Tag("25")
class Record_849 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 849: FirstName is Shyla")
	void FirstNameOfRecord849() {
		assertEquals("Shyla", customers.get(848).getFirstName());
	}

	@Test
	@DisplayName("Record 849: LastName is Hofford")
	void LastNameOfRecord849() {
		assertEquals("Hofford", customers.get(848).getLastName());
	}

	@Test
	@DisplayName("Record 849: Company is Independent Mechanical Ind Inc")
	void CompanyOfRecord849() {
		assertEquals("Independent Mechanical Ind Inc", customers.get(848).getCompany());
	}

	@Test
	@DisplayName("Record 849: Address is 25472 Base Line St")
	void AddressOfRecord849() {
		assertEquals("25472 Base Line St", customers.get(848).getAddress());
	}

	@Test
	@DisplayName("Record 849: City is San Bernardino")
	void CityOfRecord849() {
		assertEquals("San Bernardino", customers.get(848).getCity());
	}

	@Test
	@DisplayName("Record 849: County is San Bernardino")
	void CountyOfRecord849() {
		assertEquals("San Bernardino", customers.get(848).getCounty());
	}

	@Test
	@DisplayName("Record 849: State is CA")
	void StateOfRecord849() {
		assertEquals("CA", customers.get(848).getState());
	}

	@Test
	@DisplayName("Record 849: ZIP is 92410")
	void ZIPOfRecord849() {
		assertEquals("92410", customers.get(848).getZIP());
	}

	@Test
	@DisplayName("Record 849: Phone is 909-884-0134")
	void PhoneOfRecord849() {
		assertEquals("909-884-0134", customers.get(848).getPhone());
	}

	@Test
	@DisplayName("Record 849: Fax is 909-884-7591")
	void FaxOfRecord849() {
		assertEquals("909-884-7591", customers.get(848).getFax());
	}

	@Test
	@DisplayName("Record 849: Email is shyla@hofford.com")
	void EmailOfRecord849() {
		assertEquals("shyla@hofford.com", customers.get(848).getEmail());
	}

	@Test
	@DisplayName("Record 849: Web is http://www.shylahofford.com")
	void WebOfRecord849() {
		assertEquals("http://www.shylahofford.com", customers.get(848).getWeb());
	}
}
