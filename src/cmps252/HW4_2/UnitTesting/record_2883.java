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

@Tag("39")
class Record_2883 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2883: FirstName is Zachary")
	void FirstNameOfRecord2883() {
		assertEquals("Zachary", customers.get(2882).getFirstName());
	}

	@Test
	@DisplayName("Record 2883: LastName is Wittenborn")
	void LastNameOfRecord2883() {
		assertEquals("Wittenborn", customers.get(2882).getLastName());
	}

	@Test
	@DisplayName("Record 2883: Company is Gnb Battery Tech Recycle Divsn")
	void CompanyOfRecord2883() {
		assertEquals("Gnb Battery Tech Recycle Divsn", customers.get(2882).getCompany());
	}

	@Test
	@DisplayName("Record 2883: Address is 151 Giralda Ave")
	void AddressOfRecord2883() {
		assertEquals("151 Giralda Ave", customers.get(2882).getAddress());
	}

	@Test
	@DisplayName("Record 2883: City is Miami")
	void CityOfRecord2883() {
		assertEquals("Miami", customers.get(2882).getCity());
	}

	@Test
	@DisplayName("Record 2883: County is Miami-Dade")
	void CountyOfRecord2883() {
		assertEquals("Miami-Dade", customers.get(2882).getCounty());
	}

	@Test
	@DisplayName("Record 2883: State is FL")
	void StateOfRecord2883() {
		assertEquals("FL", customers.get(2882).getState());
	}

	@Test
	@DisplayName("Record 2883: ZIP is 33134")
	void ZIPOfRecord2883() {
		assertEquals("33134", customers.get(2882).getZIP());
	}

	@Test
	@DisplayName("Record 2883: Phone is 305-446-3551")
	void PhoneOfRecord2883() {
		assertEquals("305-446-3551", customers.get(2882).getPhone());
	}

	@Test
	@DisplayName("Record 2883: Fax is 305-446-3803")
	void FaxOfRecord2883() {
		assertEquals("305-446-3803", customers.get(2882).getFax());
	}

	@Test
	@DisplayName("Record 2883: Email is zachary@wittenborn.com")
	void EmailOfRecord2883() {
		assertEquals("zachary@wittenborn.com", customers.get(2882).getEmail());
	}

	@Test
	@DisplayName("Record 2883: Web is http://www.zacharywittenborn.com")
	void WebOfRecord2883() {
		assertEquals("http://www.zacharywittenborn.com", customers.get(2882).getWeb());
	}
}
