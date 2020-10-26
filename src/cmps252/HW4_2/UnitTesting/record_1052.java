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

@Tag("7")
class Record_1052 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1052: FirstName is Helga")
	void FirstNameOfRecord1052() {
		assertEquals("Helga", customers.get(1051).getFirstName());
	}

	@Test
	@DisplayName("Record 1052: LastName is Arntt")
	void LastNameOfRecord1052() {
		assertEquals("Arntt", customers.get(1051).getLastName());
	}

	@Test
	@DisplayName("Record 1052: Company is Milacron Federal Credit Union")
	void CompanyOfRecord1052() {
		assertEquals("Milacron Federal Credit Union", customers.get(1051).getCompany());
	}

	@Test
	@DisplayName("Record 1052: Address is 416 Penn Ave")
	void AddressOfRecord1052() {
		assertEquals("416 Penn Ave", customers.get(1051).getAddress());
	}

	@Test
	@DisplayName("Record 1052: City is Reading")
	void CityOfRecord1052() {
		assertEquals("Reading", customers.get(1051).getCity());
	}

	@Test
	@DisplayName("Record 1052: County is Berks")
	void CountyOfRecord1052() {
		assertEquals("Berks", customers.get(1051).getCounty());
	}

	@Test
	@DisplayName("Record 1052: State is PA")
	void StateOfRecord1052() {
		assertEquals("PA", customers.get(1051).getState());
	}

	@Test
	@DisplayName("Record 1052: ZIP is 19611")
	void ZIPOfRecord1052() {
		assertEquals("19611", customers.get(1051).getZIP());
	}

	@Test
	@DisplayName("Record 1052: Phone is 610-374-4241")
	void PhoneOfRecord1052() {
		assertEquals("610-374-4241", customers.get(1051).getPhone());
	}

	@Test
	@DisplayName("Record 1052: Fax is 610-374-3708")
	void FaxOfRecord1052() {
		assertEquals("610-374-3708", customers.get(1051).getFax());
	}

	@Test
	@DisplayName("Record 1052: Email is helga@arntt.com")
	void EmailOfRecord1052() {
		assertEquals("helga@arntt.com", customers.get(1051).getEmail());
	}

	@Test
	@DisplayName("Record 1052: Web is http://www.helgaarntt.com")
	void WebOfRecord1052() {
		assertEquals("http://www.helgaarntt.com", customers.get(1051).getWeb());
	}
}
