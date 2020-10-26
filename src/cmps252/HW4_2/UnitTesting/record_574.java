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

@Tag("28")
class Record_574 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 574: FirstName is Theo")
	void FirstNameOfRecord574() {
		assertEquals("Theo", customers.get(573).getFirstName());
	}

	@Test
	@DisplayName("Record 574: LastName is Wilkson")
	void LastNameOfRecord574() {
		assertEquals("Wilkson", customers.get(573).getLastName());
	}

	@Test
	@DisplayName("Record 574: Company is Romano Co")
	void CompanyOfRecord574() {
		assertEquals("Romano Co", customers.get(573).getCompany());
	}

	@Test
	@DisplayName("Record 574: Address is 5680 Euclid Ave")
	void AddressOfRecord574() {
		assertEquals("5680 Euclid Ave", customers.get(573).getAddress());
	}

	@Test
	@DisplayName("Record 574: City is Cleveland")
	void CityOfRecord574() {
		assertEquals("Cleveland", customers.get(573).getCity());
	}

	@Test
	@DisplayName("Record 574: County is Cuyahoga")
	void CountyOfRecord574() {
		assertEquals("Cuyahoga", customers.get(573).getCounty());
	}

	@Test
	@DisplayName("Record 574: State is OH")
	void StateOfRecord574() {
		assertEquals("OH", customers.get(573).getState());
	}

	@Test
	@DisplayName("Record 574: ZIP is 44103")
	void ZIPOfRecord574() {
		assertEquals("44103", customers.get(573).getZIP());
	}

	@Test
	@DisplayName("Record 574: Phone is 216-881-0212")
	void PhoneOfRecord574() {
		assertEquals("216-881-0212", customers.get(573).getPhone());
	}

	@Test
	@DisplayName("Record 574: Fax is 216-881-5145")
	void FaxOfRecord574() {
		assertEquals("216-881-5145", customers.get(573).getFax());
	}

	@Test
	@DisplayName("Record 574: Email is theo@wilkson.com")
	void EmailOfRecord574() {
		assertEquals("theo@wilkson.com", customers.get(573).getEmail());
	}

	@Test
	@DisplayName("Record 574: Web is http://www.theowilkson.com")
	void WebOfRecord574() {
		assertEquals("http://www.theowilkson.com", customers.get(573).getWeb());
	}
}
