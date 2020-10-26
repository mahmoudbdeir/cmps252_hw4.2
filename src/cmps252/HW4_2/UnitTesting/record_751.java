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

@Tag("32")
class Record_751 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 751: FirstName is Darrel")
	void FirstNameOfRecord751() {
		assertEquals("Darrel", customers.get(750).getFirstName());
	}

	@Test
	@DisplayName("Record 751: LastName is Caillier")
	void LastNameOfRecord751() {
		assertEquals("Caillier", customers.get(750).getLastName());
	}

	@Test
	@DisplayName("Record 751: Company is Hawkins Jewelers")
	void CompanyOfRecord751() {
		assertEquals("Hawkins Jewelers", customers.get(750).getCompany());
	}

	@Test
	@DisplayName("Record 751: Address is 840 39th Ave")
	void AddressOfRecord751() {
		assertEquals("840 39th Ave", customers.get(750).getAddress());
	}

	@Test
	@DisplayName("Record 751: City is Rockford")
	void CityOfRecord751() {
		assertEquals("Rockford", customers.get(750).getCity());
	}

	@Test
	@DisplayName("Record 751: County is Winnebago")
	void CountyOfRecord751() {
		assertEquals("Winnebago", customers.get(750).getCounty());
	}

	@Test
	@DisplayName("Record 751: State is IL")
	void StateOfRecord751() {
		assertEquals("IL", customers.get(750).getState());
	}

	@Test
	@DisplayName("Record 751: ZIP is 61109")
	void ZIPOfRecord751() {
		assertEquals("61109", customers.get(750).getZIP());
	}

	@Test
	@DisplayName("Record 751: Phone is 815-226-4042")
	void PhoneOfRecord751() {
		assertEquals("815-226-4042", customers.get(750).getPhone());
	}

	@Test
	@DisplayName("Record 751: Fax is 815-226-7579")
	void FaxOfRecord751() {
		assertEquals("815-226-7579", customers.get(750).getFax());
	}

	@Test
	@DisplayName("Record 751: Email is darrel@caillier.com")
	void EmailOfRecord751() {
		assertEquals("darrel@caillier.com", customers.get(750).getEmail());
	}

	@Test
	@DisplayName("Record 751: Web is http://www.darrelcaillier.com")
	void WebOfRecord751() {
		assertEquals("http://www.darrelcaillier.com", customers.get(750).getWeb());
	}
}
