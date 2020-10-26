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

@Tag("24")
class Record_1468 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1468: FirstName is Michelle")
	void FirstNameOfRecord1468() {
		assertEquals("Michelle", customers.get(1467).getFirstName());
	}

	@Test
	@DisplayName("Record 1468: LastName is Piorkowski")
	void LastNameOfRecord1468() {
		assertEquals("Piorkowski", customers.get(1467).getLastName());
	}

	@Test
	@DisplayName("Record 1468: Company is Office Machine Technologies")
	void CompanyOfRecord1468() {
		assertEquals("Office Machine Technologies", customers.get(1467).getCompany());
	}

	@Test
	@DisplayName("Record 1468: Address is 114 Mayfield Ave")
	void AddressOfRecord1468() {
		assertEquals("114 Mayfield Ave", customers.get(1467).getAddress());
	}

	@Test
	@DisplayName("Record 1468: City is Edison")
	void CityOfRecord1468() {
		assertEquals("Edison", customers.get(1467).getCity());
	}

	@Test
	@DisplayName("Record 1468: County is Middlesex")
	void CountyOfRecord1468() {
		assertEquals("Middlesex", customers.get(1467).getCounty());
	}

	@Test
	@DisplayName("Record 1468: State is NJ")
	void StateOfRecord1468() {
		assertEquals("NJ", customers.get(1467).getState());
	}

	@Test
	@DisplayName("Record 1468: ZIP is 08837")
	void ZIPOfRecord1468() {
		assertEquals("08837", customers.get(1467).getZIP());
	}

	@Test
	@DisplayName("Record 1468: Phone is 732-417-5657")
	void PhoneOfRecord1468() {
		assertEquals("732-417-5657", customers.get(1467).getPhone());
	}

	@Test
	@DisplayName("Record 1468: Fax is 732-417-2245")
	void FaxOfRecord1468() {
		assertEquals("732-417-2245", customers.get(1467).getFax());
	}

	@Test
	@DisplayName("Record 1468: Email is michelle@piorkowski.com")
	void EmailOfRecord1468() {
		assertEquals("michelle@piorkowski.com", customers.get(1467).getEmail());
	}

	@Test
	@DisplayName("Record 1468: Web is http://www.michellepiorkowski.com")
	void WebOfRecord1468() {
		assertEquals("http://www.michellepiorkowski.com", customers.get(1467).getWeb());
	}
}
