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

@Tag("49")
class Record_1395 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1395: FirstName is Madge")
	void FirstNameOfRecord1395() {
		assertEquals("Madge", customers.get(1394).getFirstName());
	}

	@Test
	@DisplayName("Record 1395: LastName is Lapradd")
	void LastNameOfRecord1395() {
		assertEquals("Lapradd", customers.get(1394).getLastName());
	}

	@Test
	@DisplayName("Record 1395: Company is Southern Tobacco & Candy Assn")
	void CompanyOfRecord1395() {
		assertEquals("Southern Tobacco & Candy Assn", customers.get(1394).getCompany());
	}

	@Test
	@DisplayName("Record 1395: Address is 700 Broadway  #-1133")
	void AddressOfRecord1395() {
		assertEquals("700 Broadway  #-1133", customers.get(1394).getAddress());
	}

	@Test
	@DisplayName("Record 1395: City is Denver")
	void CityOfRecord1395() {
		assertEquals("Denver", customers.get(1394).getCity());
	}

	@Test
	@DisplayName("Record 1395: County is Denver")
	void CountyOfRecord1395() {
		assertEquals("Denver", customers.get(1394).getCounty());
	}

	@Test
	@DisplayName("Record 1395: State is CO")
	void StateOfRecord1395() {
		assertEquals("CO", customers.get(1394).getState());
	}

	@Test
	@DisplayName("Record 1395: ZIP is 80203")
	void ZIPOfRecord1395() {
		assertEquals("80203", customers.get(1394).getZIP());
	}

	@Test
	@DisplayName("Record 1395: Phone is 303-831-1817")
	void PhoneOfRecord1395() {
		assertEquals("303-831-1817", customers.get(1394).getPhone());
	}

	@Test
	@DisplayName("Record 1395: Fax is 303-831-7636")
	void FaxOfRecord1395() {
		assertEquals("303-831-7636", customers.get(1394).getFax());
	}

	@Test
	@DisplayName("Record 1395: Email is madge@lapradd.com")
	void EmailOfRecord1395() {
		assertEquals("madge@lapradd.com", customers.get(1394).getEmail());
	}

	@Test
	@DisplayName("Record 1395: Web is http://www.madgelapradd.com")
	void WebOfRecord1395() {
		assertEquals("http://www.madgelapradd.com", customers.get(1394).getWeb());
	}
}
