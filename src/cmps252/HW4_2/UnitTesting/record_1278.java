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
class Record_1278 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1278: FirstName is Harriet")
	void FirstNameOfRecord1278() {
		assertEquals("Harriet", customers.get(1277).getFirstName());
	}

	@Test
	@DisplayName("Record 1278: LastName is Friis")
	void LastNameOfRecord1278() {
		assertEquals("Friis", customers.get(1277).getLastName());
	}

	@Test
	@DisplayName("Record 1278: Company is Cu Mortgage Corp")
	void CompanyOfRecord1278() {
		assertEquals("Cu Mortgage Corp", customers.get(1277).getCompany());
	}

	@Test
	@DisplayName("Record 1278: Address is 950 Pine St")
	void AddressOfRecord1278() {
		assertEquals("950 Pine St", customers.get(1277).getAddress());
	}

	@Test
	@DisplayName("Record 1278: City is Glenview")
	void CityOfRecord1278() {
		assertEquals("Glenview", customers.get(1277).getCity());
	}

	@Test
	@DisplayName("Record 1278: County is Cook")
	void CountyOfRecord1278() {
		assertEquals("Cook", customers.get(1277).getCounty());
	}

	@Test
	@DisplayName("Record 1278: State is IL")
	void StateOfRecord1278() {
		assertEquals("IL", customers.get(1277).getState());
	}

	@Test
	@DisplayName("Record 1278: ZIP is 60025")
	void ZIPOfRecord1278() {
		assertEquals("60025", customers.get(1277).getZIP());
	}

	@Test
	@DisplayName("Record 1278: Phone is 847-729-5686")
	void PhoneOfRecord1278() {
		assertEquals("847-729-5686", customers.get(1277).getPhone());
	}

	@Test
	@DisplayName("Record 1278: Fax is 847-729-1539")
	void FaxOfRecord1278() {
		assertEquals("847-729-1539", customers.get(1277).getFax());
	}

	@Test
	@DisplayName("Record 1278: Email is harriet@friis.com")
	void EmailOfRecord1278() {
		assertEquals("harriet@friis.com", customers.get(1277).getEmail());
	}

	@Test
	@DisplayName("Record 1278: Web is http://www.harrietfriis.com")
	void WebOfRecord1278() {
		assertEquals("http://www.harrietfriis.com", customers.get(1277).getWeb());
	}
}
