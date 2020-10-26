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

@Tag("43")
class Record_4123 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4123: FirstName is Sophia")
	void FirstNameOfRecord4123() {
		assertEquals("Sophia", customers.get(4122).getFirstName());
	}

	@Test
	@DisplayName("Record 4123: LastName is Lansang")
	void LastNameOfRecord4123() {
		assertEquals("Lansang", customers.get(4122).getLastName());
	}

	@Test
	@DisplayName("Record 4123: Company is Protecta Pack Systems")
	void CompanyOfRecord4123() {
		assertEquals("Protecta Pack Systems", customers.get(4122).getCompany());
	}

	@Test
	@DisplayName("Record 4123: Address is Quebec")
	void AddressOfRecord4123() {
		assertEquals("Quebec", customers.get(4122).getAddress());
	}

	@Test
	@DisplayName("Record 4123: City is Littleton")
	void CityOfRecord4123() {
		assertEquals("Littleton", customers.get(4122).getCity());
	}

	@Test
	@DisplayName("Record 4123: County is Douglas")
	void CountyOfRecord4123() {
		assertEquals("Douglas", customers.get(4122).getCounty());
	}

	@Test
	@DisplayName("Record 4123: State is CO")
	void StateOfRecord4123() {
		assertEquals("CO", customers.get(4122).getState());
	}

	@Test
	@DisplayName("Record 4123: ZIP is 80126")
	void ZIPOfRecord4123() {
		assertEquals("80126", customers.get(4122).getZIP());
	}

	@Test
	@DisplayName("Record 4123: Phone is 303-694-1154")
	void PhoneOfRecord4123() {
		assertEquals("303-694-1154", customers.get(4122).getPhone());
	}

	@Test
	@DisplayName("Record 4123: Fax is 303-694-7571")
	void FaxOfRecord4123() {
		assertEquals("303-694-7571", customers.get(4122).getFax());
	}

	@Test
	@DisplayName("Record 4123: Email is sophia@lansang.com")
	void EmailOfRecord4123() {
		assertEquals("sophia@lansang.com", customers.get(4122).getEmail());
	}

	@Test
	@DisplayName("Record 4123: Web is http://www.sophialansang.com")
	void WebOfRecord4123() {
		assertEquals("http://www.sophialansang.com", customers.get(4122).getWeb());
	}
}
