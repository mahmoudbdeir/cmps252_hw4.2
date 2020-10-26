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
class Record_4202 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4202: FirstName is Brandie")
	void FirstNameOfRecord4202() {
		assertEquals("Brandie", customers.get(4201).getFirstName());
	}

	@Test
	@DisplayName("Record 4202: LastName is Kovarovic")
	void LastNameOfRecord4202() {
		assertEquals("Kovarovic", customers.get(4201).getLastName());
	}

	@Test
	@DisplayName("Record 4202: Company is Frist Funeral Home")
	void CompanyOfRecord4202() {
		assertEquals("Frist Funeral Home", customers.get(4201).getCompany());
	}

	@Test
	@DisplayName("Record 4202: Address is 603 S Washington Ave")
	void AddressOfRecord4202() {
		assertEquals("603 S Washington Ave", customers.get(4201).getAddress());
	}

	@Test
	@DisplayName("Record 4202: City is Lansing")
	void CityOfRecord4202() {
		assertEquals("Lansing", customers.get(4201).getCity());
	}

	@Test
	@DisplayName("Record 4202: County is Ingham")
	void CountyOfRecord4202() {
		assertEquals("Ingham", customers.get(4201).getCounty());
	}

	@Test
	@DisplayName("Record 4202: State is MI")
	void StateOfRecord4202() {
		assertEquals("MI", customers.get(4201).getState());
	}

	@Test
	@DisplayName("Record 4202: ZIP is 48933")
	void ZIPOfRecord4202() {
		assertEquals("48933", customers.get(4201).getZIP());
	}

	@Test
	@DisplayName("Record 4202: Phone is 517-372-6677")
	void PhoneOfRecord4202() {
		assertEquals("517-372-6677", customers.get(4201).getPhone());
	}

	@Test
	@DisplayName("Record 4202: Fax is 517-372-5873")
	void FaxOfRecord4202() {
		assertEquals("517-372-5873", customers.get(4201).getFax());
	}

	@Test
	@DisplayName("Record 4202: Email is brandie@kovarovic.com")
	void EmailOfRecord4202() {
		assertEquals("brandie@kovarovic.com", customers.get(4201).getEmail());
	}

	@Test
	@DisplayName("Record 4202: Web is http://www.brandiekovarovic.com")
	void WebOfRecord4202() {
		assertEquals("http://www.brandiekovarovic.com", customers.get(4201).getWeb());
	}
}
