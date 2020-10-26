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

@Tag("38")
class Record_3839 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3839: FirstName is Stewart")
	void FirstNameOfRecord3839() {
		assertEquals("Stewart", customers.get(3838).getFirstName());
	}

	@Test
	@DisplayName("Record 3839: LastName is Hsu")
	void LastNameOfRecord3839() {
		assertEquals("Hsu", customers.get(3838).getLastName());
	}

	@Test
	@DisplayName("Record 3839: Company is Photoquick")
	void CompanyOfRecord3839() {
		assertEquals("Photoquick", customers.get(3838).getCompany());
	}

	@Test
	@DisplayName("Record 3839: Address is 12220 12th Ave S")
	void AddressOfRecord3839() {
		assertEquals("12220 12th Ave S", customers.get(3838).getAddress());
	}

	@Test
	@DisplayName("Record 3839: City is Burnsville")
	void CityOfRecord3839() {
		assertEquals("Burnsville", customers.get(3838).getCity());
	}

	@Test
	@DisplayName("Record 3839: County is Dakota")
	void CountyOfRecord3839() {
		assertEquals("Dakota", customers.get(3838).getCounty());
	}

	@Test
	@DisplayName("Record 3839: State is MN")
	void StateOfRecord3839() {
		assertEquals("MN", customers.get(3838).getState());
	}

	@Test
	@DisplayName("Record 3839: ZIP is 55337")
	void ZIPOfRecord3839() {
		assertEquals("55337", customers.get(3838).getZIP());
	}

	@Test
	@DisplayName("Record 3839: Phone is 952-890-8415")
	void PhoneOfRecord3839() {
		assertEquals("952-890-8415", customers.get(3838).getPhone());
	}

	@Test
	@DisplayName("Record 3839: Fax is 952-890-6231")
	void FaxOfRecord3839() {
		assertEquals("952-890-6231", customers.get(3838).getFax());
	}

	@Test
	@DisplayName("Record 3839: Email is stewart@hsu.com")
	void EmailOfRecord3839() {
		assertEquals("stewart@hsu.com", customers.get(3838).getEmail());
	}

	@Test
	@DisplayName("Record 3839: Web is http://www.stewarthsu.com")
	void WebOfRecord3839() {
		assertEquals("http://www.stewarthsu.com", customers.get(3838).getWeb());
	}
}
