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

@Tag("30")
class Record_839 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 839: FirstName is Ann")
	void FirstNameOfRecord839() {
		assertEquals("Ann", customers.get(838).getFirstName());
	}

	@Test
	@DisplayName("Record 839: LastName is Nocum")
	void LastNameOfRecord839() {
		assertEquals("Nocum", customers.get(838).getLastName());
	}

	@Test
	@DisplayName("Record 839: Company is Ksup Radio")
	void CompanyOfRecord839() {
		assertEquals("Ksup Radio", customers.get(838).getCompany());
	}

	@Test
	@DisplayName("Record 839: Address is 109 E Pine St")
	void AddressOfRecord839() {
		assertEquals("109 E Pine St", customers.get(838).getAddress());
	}

	@Test
	@DisplayName("Record 839: City is Orlando")
	void CityOfRecord839() {
		assertEquals("Orlando", customers.get(838).getCity());
	}

	@Test
	@DisplayName("Record 839: County is Orange")
	void CountyOfRecord839() {
		assertEquals("Orange", customers.get(838).getCounty());
	}

	@Test
	@DisplayName("Record 839: State is FL")
	void StateOfRecord839() {
		assertEquals("FL", customers.get(838).getState());
	}

	@Test
	@DisplayName("Record 839: ZIP is 32801")
	void ZIPOfRecord839() {
		assertEquals("32801", customers.get(838).getZIP());
	}

	@Test
	@DisplayName("Record 839: Phone is 407-843-9127")
	void PhoneOfRecord839() {
		assertEquals("407-843-9127", customers.get(838).getPhone());
	}

	@Test
	@DisplayName("Record 839: Fax is 407-843-5127")
	void FaxOfRecord839() {
		assertEquals("407-843-5127", customers.get(838).getFax());
	}

	@Test
	@DisplayName("Record 839: Email is ann@nocum.com")
	void EmailOfRecord839() {
		assertEquals("ann@nocum.com", customers.get(838).getEmail());
	}

	@Test
	@DisplayName("Record 839: Web is http://www.annnocum.com")
	void WebOfRecord839() {
		assertEquals("http://www.annnocum.com", customers.get(838).getWeb());
	}
}
