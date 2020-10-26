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

@Tag("2")
class Record_448 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 448: FirstName is Sybil")
	void FirstNameOfRecord448() {
		assertEquals("Sybil", customers.get(447).getFirstName());
	}

	@Test
	@DisplayName("Record 448: LastName is Leyrer")
	void LastNameOfRecord448() {
		assertEquals("Leyrer", customers.get(447).getLastName());
	}

	@Test
	@DisplayName("Record 448: Company is Lillagaard Hotel")
	void CompanyOfRecord448() {
		assertEquals("Lillagaard Hotel", customers.get(447).getCompany());
	}

	@Test
	@DisplayName("Record 448: Address is 2739 W 79th St  #-18")
	void AddressOfRecord448() {
		assertEquals("2739 W 79th St  #-18", customers.get(447).getAddress());
	}

	@Test
	@DisplayName("Record 448: City is Hialeah")
	void CityOfRecord448() {
		assertEquals("Hialeah", customers.get(447).getCity());
	}

	@Test
	@DisplayName("Record 448: County is Miami-Dade")
	void CountyOfRecord448() {
		assertEquals("Miami-Dade", customers.get(447).getCounty());
	}

	@Test
	@DisplayName("Record 448: State is FL")
	void StateOfRecord448() {
		assertEquals("FL", customers.get(447).getState());
	}

	@Test
	@DisplayName("Record 448: ZIP is 33016")
	void ZIPOfRecord448() {
		assertEquals("33016", customers.get(447).getZIP());
	}

	@Test
	@DisplayName("Record 448: Phone is 305-557-8399")
	void PhoneOfRecord448() {
		assertEquals("305-557-8399", customers.get(447).getPhone());
	}

	@Test
	@DisplayName("Record 448: Fax is 305-557-1967")
	void FaxOfRecord448() {
		assertEquals("305-557-1967", customers.get(447).getFax());
	}

	@Test
	@DisplayName("Record 448: Email is sybil@leyrer.com")
	void EmailOfRecord448() {
		assertEquals("sybil@leyrer.com", customers.get(447).getEmail());
	}

	@Test
	@DisplayName("Record 448: Web is http://www.sybilleyrer.com")
	void WebOfRecord448() {
		assertEquals("http://www.sybilleyrer.com", customers.get(447).getWeb());
	}
}
