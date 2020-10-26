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
class Record_347 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 347: FirstName is Yong")
	void FirstNameOfRecord347() {
		assertEquals("Yong", customers.get(346).getFirstName());
	}

	@Test
	@DisplayName("Record 347: LastName is Mcghin")
	void LastNameOfRecord347() {
		assertEquals("Mcghin", customers.get(346).getLastName());
	}

	@Test
	@DisplayName("Record 347: Company is Gallerstone, Peter E Md")
	void CompanyOfRecord347() {
		assertEquals("Gallerstone, Peter E Md", customers.get(346).getCompany());
	}

	@Test
	@DisplayName("Record 347: Address is 205 Norris Ave")
	void AddressOfRecord347() {
		assertEquals("205 Norris Ave", customers.get(346).getAddress());
	}

	@Test
	@DisplayName("Record 347: City is Mc Cook")
	void CityOfRecord347() {
		assertEquals("Mc Cook", customers.get(346).getCity());
	}

	@Test
	@DisplayName("Record 347: County is Red Willow")
	void CountyOfRecord347() {
		assertEquals("Red Willow", customers.get(346).getCounty());
	}

	@Test
	@DisplayName("Record 347: State is NE")
	void StateOfRecord347() {
		assertEquals("NE", customers.get(346).getState());
	}

	@Test
	@DisplayName("Record 347: ZIP is 69001")
	void ZIPOfRecord347() {
		assertEquals("69001", customers.get(346).getZIP());
	}

	@Test
	@DisplayName("Record 347: Phone is 308-345-9032")
	void PhoneOfRecord347() {
		assertEquals("308-345-9032", customers.get(346).getPhone());
	}

	@Test
	@DisplayName("Record 347: Fax is 308-345-9618")
	void FaxOfRecord347() {
		assertEquals("308-345-9618", customers.get(346).getFax());
	}

	@Test
	@DisplayName("Record 347: Email is yong@mcghin.com")
	void EmailOfRecord347() {
		assertEquals("yong@mcghin.com", customers.get(346).getEmail());
	}

	@Test
	@DisplayName("Record 347: Web is http://www.yongmcghin.com")
	void WebOfRecord347() {
		assertEquals("http://www.yongmcghin.com", customers.get(346).getWeb());
	}
}
