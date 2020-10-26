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

@Tag("44")
class Record_2905 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2905: FirstName is Zoila")
	void FirstNameOfRecord2905() {
		assertEquals("Zoila", customers.get(2904).getFirstName());
	}

	@Test
	@DisplayName("Record 2905: LastName is Buchanon")
	void LastNameOfRecord2905() {
		assertEquals("Buchanon", customers.get(2904).getLastName());
	}

	@Test
	@DisplayName("Record 2905: Company is Bradshaw Praeger & Co")
	void CompanyOfRecord2905() {
		assertEquals("Bradshaw Praeger & Co", customers.get(2904).getCompany());
	}

	@Test
	@DisplayName("Record 2905: Address is 2610 Glencairin Dr Nw")
	void AddressOfRecord2905() {
		assertEquals("2610 Glencairin Dr Nw", customers.get(2904).getAddress());
	}

	@Test
	@DisplayName("Record 2905: City is Grand Rapids")
	void CityOfRecord2905() {
		assertEquals("Grand Rapids", customers.get(2904).getCity());
	}

	@Test
	@DisplayName("Record 2905: County is Kent")
	void CountyOfRecord2905() {
		assertEquals("Kent", customers.get(2904).getCounty());
	}

	@Test
	@DisplayName("Record 2905: State is MI")
	void StateOfRecord2905() {
		assertEquals("MI", customers.get(2904).getState());
	}

	@Test
	@DisplayName("Record 2905: ZIP is 49504")
	void ZIPOfRecord2905() {
		assertEquals("49504", customers.get(2904).getZIP());
	}

	@Test
	@DisplayName("Record 2905: Phone is 616-453-9506")
	void PhoneOfRecord2905() {
		assertEquals("616-453-9506", customers.get(2904).getPhone());
	}

	@Test
	@DisplayName("Record 2905: Fax is 616-453-0684")
	void FaxOfRecord2905() {
		assertEquals("616-453-0684", customers.get(2904).getFax());
	}

	@Test
	@DisplayName("Record 2905: Email is zoila@buchanon.com")
	void EmailOfRecord2905() {
		assertEquals("zoila@buchanon.com", customers.get(2904).getEmail());
	}

	@Test
	@DisplayName("Record 2905: Web is http://www.zoilabuchanon.com")
	void WebOfRecord2905() {
		assertEquals("http://www.zoilabuchanon.com", customers.get(2904).getWeb());
	}
}
