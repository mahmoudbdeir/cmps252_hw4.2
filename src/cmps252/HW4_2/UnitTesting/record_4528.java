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

@Tag("20")
class Record_4528 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4528: FirstName is Fern")
	void FirstNameOfRecord4528() {
		assertEquals("Fern", customers.get(4527).getFirstName());
	}

	@Test
	@DisplayName("Record 4528: LastName is Karnes")
	void LastNameOfRecord4528() {
		assertEquals("Karnes", customers.get(4527).getLastName());
	}

	@Test
	@DisplayName("Record 4528: Company is Sierra Inn")
	void CompanyOfRecord4528() {
		assertEquals("Sierra Inn", customers.get(4527).getCompany());
	}

	@Test
	@DisplayName("Record 4528: Address is 30 Mcdonald Blvd")
	void AddressOfRecord4528() {
		assertEquals("30 Mcdonald Blvd", customers.get(4527).getAddress());
	}

	@Test
	@DisplayName("Record 4528: City is Aston")
	void CityOfRecord4528() {
		assertEquals("Aston", customers.get(4527).getCity());
	}

	@Test
	@DisplayName("Record 4528: County is Delaware")
	void CountyOfRecord4528() {
		assertEquals("Delaware", customers.get(4527).getCounty());
	}

	@Test
	@DisplayName("Record 4528: State is PA")
	void StateOfRecord4528() {
		assertEquals("PA", customers.get(4527).getState());
	}

	@Test
	@DisplayName("Record 4528: ZIP is 19014")
	void ZIPOfRecord4528() {
		assertEquals("19014", customers.get(4527).getZIP());
	}

	@Test
	@DisplayName("Record 4528: Phone is 610-497-3734")
	void PhoneOfRecord4528() {
		assertEquals("610-497-3734", customers.get(4527).getPhone());
	}

	@Test
	@DisplayName("Record 4528: Fax is 610-497-7857")
	void FaxOfRecord4528() {
		assertEquals("610-497-7857", customers.get(4527).getFax());
	}

	@Test
	@DisplayName("Record 4528: Email is fern@karnes.com")
	void EmailOfRecord4528() {
		assertEquals("fern@karnes.com", customers.get(4527).getEmail());
	}

	@Test
	@DisplayName("Record 4528: Web is http://www.fernkarnes.com")
	void WebOfRecord4528() {
		assertEquals("http://www.fernkarnes.com", customers.get(4527).getWeb());
	}
}
