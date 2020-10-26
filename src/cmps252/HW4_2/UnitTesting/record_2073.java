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
class Record_2073 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2073: FirstName is Glenda")
	void FirstNameOfRecord2073() {
		assertEquals("Glenda", customers.get(2072).getFirstName());
	}

	@Test
	@DisplayName("Record 2073: LastName is Skomsky")
	void LastNameOfRecord2073() {
		assertEquals("Skomsky", customers.get(2072).getLastName());
	}

	@Test
	@DisplayName("Record 2073: Company is Rega Manufacturing Co")
	void CompanyOfRecord2073() {
		assertEquals("Rega Manufacturing Co", customers.get(2072).getCompany());
	}

	@Test
	@DisplayName("Record 2073: Address is 2110 Enterprise St Se")
	void AddressOfRecord2073() {
		assertEquals("2110 Enterprise St Se", customers.get(2072).getAddress());
	}

	@Test
	@DisplayName("Record 2073: City is Grand Rapids")
	void CityOfRecord2073() {
		assertEquals("Grand Rapids", customers.get(2072).getCity());
	}

	@Test
	@DisplayName("Record 2073: County is Kent")
	void CountyOfRecord2073() {
		assertEquals("Kent", customers.get(2072).getCounty());
	}

	@Test
	@DisplayName("Record 2073: State is MI")
	void StateOfRecord2073() {
		assertEquals("MI", customers.get(2072).getState());
	}

	@Test
	@DisplayName("Record 2073: ZIP is 49508")
	void ZIPOfRecord2073() {
		assertEquals("49508", customers.get(2072).getZIP());
	}

	@Test
	@DisplayName("Record 2073: Phone is 616-235-3322")
	void PhoneOfRecord2073() {
		assertEquals("616-235-3322", customers.get(2072).getPhone());
	}

	@Test
	@DisplayName("Record 2073: Fax is 616-235-0267")
	void FaxOfRecord2073() {
		assertEquals("616-235-0267", customers.get(2072).getFax());
	}

	@Test
	@DisplayName("Record 2073: Email is glenda@skomsky.com")
	void EmailOfRecord2073() {
		assertEquals("glenda@skomsky.com", customers.get(2072).getEmail());
	}

	@Test
	@DisplayName("Record 2073: Web is http://www.glendaskomsky.com")
	void WebOfRecord2073() {
		assertEquals("http://www.glendaskomsky.com", customers.get(2072).getWeb());
	}
}
