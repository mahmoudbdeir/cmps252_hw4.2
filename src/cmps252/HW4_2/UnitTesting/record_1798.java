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

@Tag("24")
class Record_1798 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1798: FirstName is Grant")
	void FirstNameOfRecord1798() {
		assertEquals("Grant", customers.get(1797).getFirstName());
	}

	@Test
	@DisplayName("Record 1798: LastName is Wandler")
	void LastNameOfRecord1798() {
		assertEquals("Wandler", customers.get(1797).getLastName());
	}

	@Test
	@DisplayName("Record 1798: Company is Ames Industrial Supply Co")
	void CompanyOfRecord1798() {
		assertEquals("Ames Industrial Supply Co", customers.get(1797).getCompany());
	}

	@Test
	@DisplayName("Record 1798: Address is 2415 S 18th Pl")
	void AddressOfRecord1798() {
		assertEquals("2415 S 18th Pl", customers.get(1797).getAddress());
	}

	@Test
	@DisplayName("Record 1798: City is Phoenix")
	void CityOfRecord1798() {
		assertEquals("Phoenix", customers.get(1797).getCity());
	}

	@Test
	@DisplayName("Record 1798: County is Maricopa")
	void CountyOfRecord1798() {
		assertEquals("Maricopa", customers.get(1797).getCounty());
	}

	@Test
	@DisplayName("Record 1798: State is AZ")
	void StateOfRecord1798() {
		assertEquals("AZ", customers.get(1797).getState());
	}

	@Test
	@DisplayName("Record 1798: ZIP is 85034")
	void ZIPOfRecord1798() {
		assertEquals("85034", customers.get(1797).getZIP());
	}

	@Test
	@DisplayName("Record 1798: Phone is 602-252-6635")
	void PhoneOfRecord1798() {
		assertEquals("602-252-6635", customers.get(1797).getPhone());
	}

	@Test
	@DisplayName("Record 1798: Fax is 602-252-7386")
	void FaxOfRecord1798() {
		assertEquals("602-252-7386", customers.get(1797).getFax());
	}

	@Test
	@DisplayName("Record 1798: Email is grant@wandler.com")
	void EmailOfRecord1798() {
		assertEquals("grant@wandler.com", customers.get(1797).getEmail());
	}

	@Test
	@DisplayName("Record 1798: Web is http://www.grantwandler.com")
	void WebOfRecord1798() {
		assertEquals("http://www.grantwandler.com", customers.get(1797).getWeb());
	}
}
