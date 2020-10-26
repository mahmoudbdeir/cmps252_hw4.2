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
class Record_1776 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1776: FirstName is Johnny")
	void FirstNameOfRecord1776() {
		assertEquals("Johnny", customers.get(1775).getFirstName());
	}

	@Test
	@DisplayName("Record 1776: LastName is Bowlin")
	void LastNameOfRecord1776() {
		assertEquals("Bowlin", customers.get(1775).getLastName());
	}

	@Test
	@DisplayName("Record 1776: Company is Hy Tek Matrl Handling")
	void CompanyOfRecord1776() {
		assertEquals("Hy Tek Matrl Handling", customers.get(1775).getCompany());
	}

	@Test
	@DisplayName("Record 1776: Address is 5200 Central Ave")
	void AddressOfRecord1776() {
		assertEquals("5200 Central Ave", customers.get(1775).getAddress());
	}

	@Test
	@DisplayName("Record 1776: City is Saint Petersburg")
	void CityOfRecord1776() {
		assertEquals("Saint Petersburg", customers.get(1775).getCity());
	}

	@Test
	@DisplayName("Record 1776: County is Pinellas")
	void CountyOfRecord1776() {
		assertEquals("Pinellas", customers.get(1775).getCounty());
	}

	@Test
	@DisplayName("Record 1776: State is FL")
	void StateOfRecord1776() {
		assertEquals("FL", customers.get(1775).getState());
	}

	@Test
	@DisplayName("Record 1776: ZIP is 33707")
	void ZIPOfRecord1776() {
		assertEquals("33707", customers.get(1775).getZIP());
	}

	@Test
	@DisplayName("Record 1776: Phone is 727-328-9988")
	void PhoneOfRecord1776() {
		assertEquals("727-328-9988", customers.get(1775).getPhone());
	}

	@Test
	@DisplayName("Record 1776: Fax is 727-328-4159")
	void FaxOfRecord1776() {
		assertEquals("727-328-4159", customers.get(1775).getFax());
	}

	@Test
	@DisplayName("Record 1776: Email is johnny@bowlin.com")
	void EmailOfRecord1776() {
		assertEquals("johnny@bowlin.com", customers.get(1775).getEmail());
	}

	@Test
	@DisplayName("Record 1776: Web is http://www.johnnybowlin.com")
	void WebOfRecord1776() {
		assertEquals("http://www.johnnybowlin.com", customers.get(1775).getWeb());
	}
}
