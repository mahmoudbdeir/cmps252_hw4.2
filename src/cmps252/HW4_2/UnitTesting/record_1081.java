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

@Tag("12")
class Record_1081 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1081: FirstName is Bill")
	void FirstNameOfRecord1081() {
		assertEquals("Bill", customers.get(1080).getFirstName());
	}

	@Test
	@DisplayName("Record 1081: LastName is Millikin")
	void LastNameOfRecord1081() {
		assertEquals("Millikin", customers.get(1080).getLastName());
	}

	@Test
	@DisplayName("Record 1081: Company is Electronics Marketing Corp")
	void CompanyOfRecord1081() {
		assertEquals("Electronics Marketing Corp", customers.get(1080).getCompany());
	}

	@Test
	@DisplayName("Record 1081: Address is 17550 15th Ave Ne")
	void AddressOfRecord1081() {
		assertEquals("17550 15th Ave Ne", customers.get(1080).getAddress());
	}

	@Test
	@DisplayName("Record 1081: City is Seattle")
	void CityOfRecord1081() {
		assertEquals("Seattle", customers.get(1080).getCity());
	}

	@Test
	@DisplayName("Record 1081: County is King")
	void CountyOfRecord1081() {
		assertEquals("King", customers.get(1080).getCounty());
	}

	@Test
	@DisplayName("Record 1081: State is WA")
	void StateOfRecord1081() {
		assertEquals("WA", customers.get(1080).getState());
	}

	@Test
	@DisplayName("Record 1081: ZIP is 98155")
	void ZIPOfRecord1081() {
		assertEquals("98155", customers.get(1080).getZIP());
	}

	@Test
	@DisplayName("Record 1081: Phone is 206-364-7351")
	void PhoneOfRecord1081() {
		assertEquals("206-364-7351", customers.get(1080).getPhone());
	}

	@Test
	@DisplayName("Record 1081: Fax is 206-364-7314")
	void FaxOfRecord1081() {
		assertEquals("206-364-7314", customers.get(1080).getFax());
	}

	@Test
	@DisplayName("Record 1081: Email is bill@millikin.com")
	void EmailOfRecord1081() {
		assertEquals("bill@millikin.com", customers.get(1080).getEmail());
	}

	@Test
	@DisplayName("Record 1081: Web is http://www.billmillikin.com")
	void WebOfRecord1081() {
		assertEquals("http://www.billmillikin.com", customers.get(1080).getWeb());
	}
}
