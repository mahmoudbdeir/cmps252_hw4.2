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

@Tag("47")
class Record_314 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 314: FirstName is Donna")
	void FirstNameOfRecord314() {
		assertEquals("Donna", customers.get(313).getFirstName());
	}

	@Test
	@DisplayName("Record 314: LastName is Rossini")
	void LastNameOfRecord314() {
		assertEquals("Rossini", customers.get(313).getLastName());
	}

	@Test
	@DisplayName("Record 314: Company is Inn At Willow Pond")
	void CompanyOfRecord314() {
		assertEquals("Inn At Willow Pond", customers.get(313).getCompany());
	}

	@Test
	@DisplayName("Record 314: Address is 2424 Rock Island Rd")
	void AddressOfRecord314() {
		assertEquals("2424 Rock Island Rd", customers.get(313).getAddress());
	}

	@Test
	@DisplayName("Record 314: City is Irving")
	void CityOfRecord314() {
		assertEquals("Irving", customers.get(313).getCity());
	}

	@Test
	@DisplayName("Record 314: County is Dallas")
	void CountyOfRecord314() {
		assertEquals("Dallas", customers.get(313).getCounty());
	}

	@Test
	@DisplayName("Record 314: State is TX")
	void StateOfRecord314() {
		assertEquals("TX", customers.get(313).getState());
	}

	@Test
	@DisplayName("Record 314: ZIP is 75060")
	void ZIPOfRecord314() {
		assertEquals("75060", customers.get(313).getZIP());
	}

	@Test
	@DisplayName("Record 314: Phone is 972-986-4144")
	void PhoneOfRecord314() {
		assertEquals("972-986-4144", customers.get(313).getPhone());
	}

	@Test
	@DisplayName("Record 314: Fax is 972-986-1843")
	void FaxOfRecord314() {
		assertEquals("972-986-1843", customers.get(313).getFax());
	}

	@Test
	@DisplayName("Record 314: Email is donna@rossini.com")
	void EmailOfRecord314() {
		assertEquals("donna@rossini.com", customers.get(313).getEmail());
	}

	@Test
	@DisplayName("Record 314: Web is http://www.donnarossini.com")
	void WebOfRecord314() {
		assertEquals("http://www.donnarossini.com", customers.get(313).getWeb());
	}
}
