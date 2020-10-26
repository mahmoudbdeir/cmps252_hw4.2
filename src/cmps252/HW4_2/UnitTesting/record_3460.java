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

@Tag("23")
class Record_3460 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3460: FirstName is Josie")
	void FirstNameOfRecord3460() {
		assertEquals("Josie", customers.get(3459).getFirstName());
	}

	@Test
	@DisplayName("Record 3460: LastName is Mosburg")
	void LastNameOfRecord3460() {
		assertEquals("Mosburg", customers.get(3459).getLastName());
	}

	@Test
	@DisplayName("Record 3460: Company is Arizona Western Mfg Corp")
	void CompanyOfRecord3460() {
		assertEquals("Arizona Western Mfg Corp", customers.get(3459).getCompany());
	}

	@Test
	@DisplayName("Record 3460: Address is 5025 S 36th St")
	void AddressOfRecord3460() {
		assertEquals("5025 S 36th St", customers.get(3459).getAddress());
	}

	@Test
	@DisplayName("Record 3460: City is Phoenix")
	void CityOfRecord3460() {
		assertEquals("Phoenix", customers.get(3459).getCity());
	}

	@Test
	@DisplayName("Record 3460: County is Maricopa")
	void CountyOfRecord3460() {
		assertEquals("Maricopa", customers.get(3459).getCounty());
	}

	@Test
	@DisplayName("Record 3460: State is AZ")
	void StateOfRecord3460() {
		assertEquals("AZ", customers.get(3459).getState());
	}

	@Test
	@DisplayName("Record 3460: ZIP is 85040")
	void ZIPOfRecord3460() {
		assertEquals("85040", customers.get(3459).getZIP());
	}

	@Test
	@DisplayName("Record 3460: Phone is 602-437-7433")
	void PhoneOfRecord3460() {
		assertEquals("602-437-7433", customers.get(3459).getPhone());
	}

	@Test
	@DisplayName("Record 3460: Fax is 602-437-3145")
	void FaxOfRecord3460() {
		assertEquals("602-437-3145", customers.get(3459).getFax());
	}

	@Test
	@DisplayName("Record 3460: Email is josie@mosburg.com")
	void EmailOfRecord3460() {
		assertEquals("josie@mosburg.com", customers.get(3459).getEmail());
	}

	@Test
	@DisplayName("Record 3460: Web is http://www.josiemosburg.com")
	void WebOfRecord3460() {
		assertEquals("http://www.josiemosburg.com", customers.get(3459).getWeb());
	}
}
