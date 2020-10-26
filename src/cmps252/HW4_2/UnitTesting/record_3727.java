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

@Tag("4")
class Record_3727 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3727: FirstName is Tabatha")
	void FirstNameOfRecord3727() {
		assertEquals("Tabatha", customers.get(3726).getFirstName());
	}

	@Test
	@DisplayName("Record 3727: LastName is Sturner")
	void LastNameOfRecord3727() {
		assertEquals("Sturner", customers.get(3726).getLastName());
	}

	@Test
	@DisplayName("Record 3727: Company is Bartlesville Area C Of C")
	void CompanyOfRecord3727() {
		assertEquals("Bartlesville Area C Of C", customers.get(3726).getCompany());
	}

	@Test
	@DisplayName("Record 3727: Address is 1300 E Camelback Rd")
	void AddressOfRecord3727() {
		assertEquals("1300 E Camelback Rd", customers.get(3726).getAddress());
	}

	@Test
	@DisplayName("Record 3727: City is Phoenix")
	void CityOfRecord3727() {
		assertEquals("Phoenix", customers.get(3726).getCity());
	}

	@Test
	@DisplayName("Record 3727: County is Maricopa")
	void CountyOfRecord3727() {
		assertEquals("Maricopa", customers.get(3726).getCounty());
	}

	@Test
	@DisplayName("Record 3727: State is AZ")
	void StateOfRecord3727() {
		assertEquals("AZ", customers.get(3726).getState());
	}

	@Test
	@DisplayName("Record 3727: ZIP is 85014")
	void ZIPOfRecord3727() {
		assertEquals("85014", customers.get(3726).getZIP());
	}

	@Test
	@DisplayName("Record 3727: Phone is 602-234-4187")
	void PhoneOfRecord3727() {
		assertEquals("602-234-4187", customers.get(3726).getPhone());
	}

	@Test
	@DisplayName("Record 3727: Fax is 602-234-4985")
	void FaxOfRecord3727() {
		assertEquals("602-234-4985", customers.get(3726).getFax());
	}

	@Test
	@DisplayName("Record 3727: Email is tabatha@sturner.com")
	void EmailOfRecord3727() {
		assertEquals("tabatha@sturner.com", customers.get(3726).getEmail());
	}

	@Test
	@DisplayName("Record 3727: Web is http://www.tabathasturner.com")
	void WebOfRecord3727() {
		assertEquals("http://www.tabathasturner.com", customers.get(3726).getWeb());
	}
}
