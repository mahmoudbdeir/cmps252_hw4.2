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

@Tag("34")
class Record_1379 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1379: FirstName is Charles")
	void FirstNameOfRecord1379() {
		assertEquals("Charles", customers.get(1378).getFirstName());
	}

	@Test
	@DisplayName("Record 1379: LastName is Andreoni")
	void LastNameOfRecord1379() {
		assertEquals("Andreoni", customers.get(1378).getLastName());
	}

	@Test
	@DisplayName("Record 1379: Company is Foam Source")
	void CompanyOfRecord1379() {
		assertEquals("Foam Source", customers.get(1378).getCompany());
	}

	@Test
	@DisplayName("Record 1379: Address is 606 New York Ave")
	void AddressOfRecord1379() {
		assertEquals("606 New York Ave", customers.get(1378).getAddress());
	}

	@Test
	@DisplayName("Record 1379: City is Trenton")
	void CityOfRecord1379() {
		assertEquals("Trenton", customers.get(1378).getCity());
	}

	@Test
	@DisplayName("Record 1379: County is Mercer")
	void CountyOfRecord1379() {
		assertEquals("Mercer", customers.get(1378).getCounty());
	}

	@Test
	@DisplayName("Record 1379: State is NJ")
	void StateOfRecord1379() {
		assertEquals("NJ", customers.get(1378).getState());
	}

	@Test
	@DisplayName("Record 1379: ZIP is 8638")
	void ZIPOfRecord1379() {
		assertEquals("8638", customers.get(1378).getZIP());
	}

	@Test
	@DisplayName("Record 1379: Phone is 609-393-3072")
	void PhoneOfRecord1379() {
		assertEquals("609-393-3072", customers.get(1378).getPhone());
	}

	@Test
	@DisplayName("Record 1379: Fax is 609-393-1766")
	void FaxOfRecord1379() {
		assertEquals("609-393-1766", customers.get(1378).getFax());
	}

	@Test
	@DisplayName("Record 1379: Email is charles@andreoni.com")
	void EmailOfRecord1379() {
		assertEquals("charles@andreoni.com", customers.get(1378).getEmail());
	}

	@Test
	@DisplayName("Record 1379: Web is http://www.charlesandreoni.com")
	void WebOfRecord1379() {
		assertEquals("http://www.charlesandreoni.com", customers.get(1378).getWeb());
	}
}
