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

@Tag("49")
class Record_4119 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4119: FirstName is Nikki")
	void FirstNameOfRecord4119() {
		assertEquals("Nikki", customers.get(4118).getFirstName());
	}

	@Test
	@DisplayName("Record 4119: LastName is Sajovic")
	void LastNameOfRecord4119() {
		assertEquals("Sajovic", customers.get(4118).getLastName());
	}

	@Test
	@DisplayName("Record 4119: Company is Paladino, Peter T Jr")
	void CompanyOfRecord4119() {
		assertEquals("Paladino, Peter T Jr", customers.get(4118).getCompany());
	}

	@Test
	@DisplayName("Record 4119: Address is 1095 Branham Ln")
	void AddressOfRecord4119() {
		assertEquals("1095 Branham Ln", customers.get(4118).getAddress());
	}

	@Test
	@DisplayName("Record 4119: City is San Jose")
	void CityOfRecord4119() {
		assertEquals("San Jose", customers.get(4118).getCity());
	}

	@Test
	@DisplayName("Record 4119: County is Santa Clara")
	void CountyOfRecord4119() {
		assertEquals("Santa Clara", customers.get(4118).getCounty());
	}

	@Test
	@DisplayName("Record 4119: State is CA")
	void StateOfRecord4119() {
		assertEquals("CA", customers.get(4118).getState());
	}

	@Test
	@DisplayName("Record 4119: ZIP is 95136")
	void ZIPOfRecord4119() {
		assertEquals("95136", customers.get(4118).getZIP());
	}

	@Test
	@DisplayName("Record 4119: Phone is 408-723-1933")
	void PhoneOfRecord4119() {
		assertEquals("408-723-1933", customers.get(4118).getPhone());
	}

	@Test
	@DisplayName("Record 4119: Fax is 408-723-6693")
	void FaxOfRecord4119() {
		assertEquals("408-723-6693", customers.get(4118).getFax());
	}

	@Test
	@DisplayName("Record 4119: Email is nikki@sajovic.com")
	void EmailOfRecord4119() {
		assertEquals("nikki@sajovic.com", customers.get(4118).getEmail());
	}

	@Test
	@DisplayName("Record 4119: Web is http://www.nikkisajovic.com")
	void WebOfRecord4119() {
		assertEquals("http://www.nikkisajovic.com", customers.get(4118).getWeb());
	}
}
