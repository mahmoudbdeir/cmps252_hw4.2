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

@Tag("19")
class Record_1731 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1731: FirstName is Caitlin")
	void FirstNameOfRecord1731() {
		assertEquals("Caitlin", customers.get(1730).getFirstName());
	}

	@Test
	@DisplayName("Record 1731: LastName is Zarnick")
	void LastNameOfRecord1731() {
		assertEquals("Zarnick", customers.get(1730).getLastName());
	}

	@Test
	@DisplayName("Record 1731: Company is Haas Publishing Companies Inc")
	void CompanyOfRecord1731() {
		assertEquals("Haas Publishing Companies Inc", customers.get(1730).getCompany());
	}

	@Test
	@DisplayName("Record 1731: Address is 1043 Taft St")
	void AddressOfRecord1731() {
		assertEquals("1043 Taft St", customers.get(1730).getAddress());
	}

	@Test
	@DisplayName("Record 1731: City is Rockville")
	void CityOfRecord1731() {
		assertEquals("Rockville", customers.get(1730).getCity());
	}

	@Test
	@DisplayName("Record 1731: County is Montgomery")
	void CountyOfRecord1731() {
		assertEquals("Montgomery", customers.get(1730).getCounty());
	}

	@Test
	@DisplayName("Record 1731: State is MD")
	void StateOfRecord1731() {
		assertEquals("MD", customers.get(1730).getState());
	}

	@Test
	@DisplayName("Record 1731: ZIP is 20850")
	void ZIPOfRecord1731() {
		assertEquals("20850", customers.get(1730).getZIP());
	}

	@Test
	@DisplayName("Record 1731: Phone is 301-762-7679")
	void PhoneOfRecord1731() {
		assertEquals("301-762-7679", customers.get(1730).getPhone());
	}

	@Test
	@DisplayName("Record 1731: Fax is 301-762-1027")
	void FaxOfRecord1731() {
		assertEquals("301-762-1027", customers.get(1730).getFax());
	}

	@Test
	@DisplayName("Record 1731: Email is caitlin@zarnick.com")
	void EmailOfRecord1731() {
		assertEquals("caitlin@zarnick.com", customers.get(1730).getEmail());
	}

	@Test
	@DisplayName("Record 1731: Web is http://www.caitlinzarnick.com")
	void WebOfRecord1731() {
		assertEquals("http://www.caitlinzarnick.com", customers.get(1730).getWeb());
	}
}
