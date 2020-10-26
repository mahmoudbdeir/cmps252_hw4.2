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

@Tag("23")
class Record_1164 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1164: FirstName is Ashlygh")
	void FirstNameOfRecord1164() {
		assertEquals("Ashlygh", customers.get(1163).getFirstName());
	}

	@Test
	@DisplayName("Record 1164: LastName is Lehnert")
	void LastNameOfRecord1164() {
		assertEquals("Lehnert", customers.get(1163).getLastName());
	}

	@Test
	@DisplayName("Record 1164: Company is Stephan Wood Products")
	void CompanyOfRecord1164() {
		assertEquals("Stephan Wood Products", customers.get(1163).getCompany());
	}

	@Test
	@DisplayName("Record 1164: Address is 4418 William Penn Hwy")
	void AddressOfRecord1164() {
		assertEquals("4418 William Penn Hwy", customers.get(1163).getAddress());
	}

	@Test
	@DisplayName("Record 1164: City is Bethlehem")
	void CityOfRecord1164() {
		assertEquals("Bethlehem", customers.get(1163).getCity());
	}

	@Test
	@DisplayName("Record 1164: County is Northampton")
	void CountyOfRecord1164() {
		assertEquals("Northampton", customers.get(1163).getCounty());
	}

	@Test
	@DisplayName("Record 1164: State is PA")
	void StateOfRecord1164() {
		assertEquals("PA", customers.get(1163).getState());
	}

	@Test
	@DisplayName("Record 1164: ZIP is 18017")
	void ZIPOfRecord1164() {
		assertEquals("18017", customers.get(1163).getZIP());
	}

	@Test
	@DisplayName("Record 1164: Phone is 610-807-3949")
	void PhoneOfRecord1164() {
		assertEquals("610-807-3949", customers.get(1163).getPhone());
	}

	@Test
	@DisplayName("Record 1164: Fax is 610-807-3524")
	void FaxOfRecord1164() {
		assertEquals("610-807-3524", customers.get(1163).getFax());
	}

	@Test
	@DisplayName("Record 1164: Email is ashlygh@lehnert.com")
	void EmailOfRecord1164() {
		assertEquals("ashlygh@lehnert.com", customers.get(1163).getEmail());
	}

	@Test
	@DisplayName("Record 1164: Web is http://www.ashlyghlehnert.com")
	void WebOfRecord1164() {
		assertEquals("http://www.ashlyghlehnert.com", customers.get(1163).getWeb());
	}
}
