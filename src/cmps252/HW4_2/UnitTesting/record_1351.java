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

@Tag("13")
class Record_1351 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1351: FirstName is Gayle")
	void FirstNameOfRecord1351() {
		assertEquals("Gayle", customers.get(1350).getFirstName());
	}

	@Test
	@DisplayName("Record 1351: LastName is Pilgrim")
	void LastNameOfRecord1351() {
		assertEquals("Pilgrim", customers.get(1350).getLastName());
	}

	@Test
	@DisplayName("Record 1351: Company is Levy & Schneps Pc")
	void CompanyOfRecord1351() {
		assertEquals("Levy & Schneps Pc", customers.get(1350).getCompany());
	}

	@Test
	@DisplayName("Record 1351: Address is 1565 Massillon Rd")
	void AddressOfRecord1351() {
		assertEquals("1565 Massillon Rd", customers.get(1350).getAddress());
	}

	@Test
	@DisplayName("Record 1351: City is Akron")
	void CityOfRecord1351() {
		assertEquals("Akron", customers.get(1350).getCity());
	}

	@Test
	@DisplayName("Record 1351: County is Summit")
	void CountyOfRecord1351() {
		assertEquals("Summit", customers.get(1350).getCounty());
	}

	@Test
	@DisplayName("Record 1351: State is OH")
	void StateOfRecord1351() {
		assertEquals("OH", customers.get(1350).getState());
	}

	@Test
	@DisplayName("Record 1351: ZIP is 44312")
	void ZIPOfRecord1351() {
		assertEquals("44312", customers.get(1350).getZIP());
	}

	@Test
	@DisplayName("Record 1351: Phone is 330-733-7850")
	void PhoneOfRecord1351() {
		assertEquals("330-733-7850", customers.get(1350).getPhone());
	}

	@Test
	@DisplayName("Record 1351: Fax is 330-733-6245")
	void FaxOfRecord1351() {
		assertEquals("330-733-6245", customers.get(1350).getFax());
	}

	@Test
	@DisplayName("Record 1351: Email is gayle@pilgrim.com")
	void EmailOfRecord1351() {
		assertEquals("gayle@pilgrim.com", customers.get(1350).getEmail());
	}

	@Test
	@DisplayName("Record 1351: Web is http://www.gaylepilgrim.com")
	void WebOfRecord1351() {
		assertEquals("http://www.gaylepilgrim.com", customers.get(1350).getWeb());
	}
}
