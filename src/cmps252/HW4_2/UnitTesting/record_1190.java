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

@Tag("15")
class Record_1190 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1190: FirstName is Esther")
	void FirstNameOfRecord1190() {
		assertEquals("Esther", customers.get(1189).getFirstName());
	}

	@Test
	@DisplayName("Record 1190: LastName is Buddy")
	void LastNameOfRecord1190() {
		assertEquals("Buddy", customers.get(1189).getLastName());
	}

	@Test
	@DisplayName("Record 1190: Company is Rudolph, Ross Md")
	void CompanyOfRecord1190() {
		assertEquals("Rudolph, Ross Md", customers.get(1189).getCompany());
	}

	@Test
	@DisplayName("Record 1190: Address is 5312 S Division Ave")
	void AddressOfRecord1190() {
		assertEquals("5312 S Division Ave", customers.get(1189).getAddress());
	}

	@Test
	@DisplayName("Record 1190: City is Grand Rapids")
	void CityOfRecord1190() {
		assertEquals("Grand Rapids", customers.get(1189).getCity());
	}

	@Test
	@DisplayName("Record 1190: County is Kent")
	void CountyOfRecord1190() {
		assertEquals("Kent", customers.get(1189).getCounty());
	}

	@Test
	@DisplayName("Record 1190: State is MI")
	void StateOfRecord1190() {
		assertEquals("MI", customers.get(1189).getState());
	}

	@Test
	@DisplayName("Record 1190: ZIP is 49548")
	void ZIPOfRecord1190() {
		assertEquals("49548", customers.get(1189).getZIP());
	}

	@Test
	@DisplayName("Record 1190: Phone is 616-249-3729")
	void PhoneOfRecord1190() {
		assertEquals("616-249-3729", customers.get(1189).getPhone());
	}

	@Test
	@DisplayName("Record 1190: Fax is 616-249-7691")
	void FaxOfRecord1190() {
		assertEquals("616-249-7691", customers.get(1189).getFax());
	}

	@Test
	@DisplayName("Record 1190: Email is esther@buddy.com")
	void EmailOfRecord1190() {
		assertEquals("esther@buddy.com", customers.get(1189).getEmail());
	}

	@Test
	@DisplayName("Record 1190: Web is http://www.estherbuddy.com")
	void WebOfRecord1190() {
		assertEquals("http://www.estherbuddy.com", customers.get(1189).getWeb());
	}
}
