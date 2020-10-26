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

@Tag("9")
class Record_1411 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1411: FirstName is Megan")
	void FirstNameOfRecord1411() {
		assertEquals("Megan", customers.get(1410).getFirstName());
	}

	@Test
	@DisplayName("Record 1411: LastName is Crossen")
	void LastNameOfRecord1411() {
		assertEquals("Crossen", customers.get(1410).getLastName());
	}

	@Test
	@DisplayName("Record 1411: Company is Elevage Center")
	void CompanyOfRecord1411() {
		assertEquals("Elevage Center", customers.get(1410).getCompany());
	}

	@Test
	@DisplayName("Record 1411: Address is 190 E 100 S")
	void AddressOfRecord1411() {
		assertEquals("190 E 100 S", customers.get(1410).getAddress());
	}

	@Test
	@DisplayName("Record 1411: City is Provo")
	void CityOfRecord1411() {
		assertEquals("Provo", customers.get(1410).getCity());
	}

	@Test
	@DisplayName("Record 1411: County is Utah")
	void CountyOfRecord1411() {
		assertEquals("Utah", customers.get(1410).getCounty());
	}

	@Test
	@DisplayName("Record 1411: State is UT")
	void StateOfRecord1411() {
		assertEquals("UT", customers.get(1410).getState());
	}

	@Test
	@DisplayName("Record 1411: ZIP is 84606")
	void ZIPOfRecord1411() {
		assertEquals("84606", customers.get(1410).getZIP());
	}

	@Test
	@DisplayName("Record 1411: Phone is 801-373-0938")
	void PhoneOfRecord1411() {
		assertEquals("801-373-0938", customers.get(1410).getPhone());
	}

	@Test
	@DisplayName("Record 1411: Fax is 801-373-1452")
	void FaxOfRecord1411() {
		assertEquals("801-373-1452", customers.get(1410).getFax());
	}

	@Test
	@DisplayName("Record 1411: Email is megan@crossen.com")
	void EmailOfRecord1411() {
		assertEquals("megan@crossen.com", customers.get(1410).getEmail());
	}

	@Test
	@DisplayName("Record 1411: Web is http://www.megancrossen.com")
	void WebOfRecord1411() {
		assertEquals("http://www.megancrossen.com", customers.get(1410).getWeb());
	}
}
