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

@Tag("8")
class Record_1130 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1130: FirstName is Jesse")
	void FirstNameOfRecord1130() {
		assertEquals("Jesse", customers.get(1129).getFirstName());
	}

	@Test
	@DisplayName("Record 1130: LastName is Axley")
	void LastNameOfRecord1130() {
		assertEquals("Axley", customers.get(1129).getLastName());
	}

	@Test
	@DisplayName("Record 1130: Company is Barr, Mary H Esq")
	void CompanyOfRecord1130() {
		assertEquals("Barr, Mary H Esq", customers.get(1129).getCompany());
	}

	@Test
	@DisplayName("Record 1130: Address is 2710 R St")
	void AddressOfRecord1130() {
		assertEquals("2710 R St", customers.get(1129).getAddress());
	}

	@Test
	@DisplayName("Record 1130: City is Sacramento")
	void CityOfRecord1130() {
		assertEquals("Sacramento", customers.get(1129).getCity());
	}

	@Test
	@DisplayName("Record 1130: County is Sacramento")
	void CountyOfRecord1130() {
		assertEquals("Sacramento", customers.get(1129).getCounty());
	}

	@Test
	@DisplayName("Record 1130: State is CA")
	void StateOfRecord1130() {
		assertEquals("CA", customers.get(1129).getState());
	}

	@Test
	@DisplayName("Record 1130: ZIP is 95816")
	void ZIPOfRecord1130() {
		assertEquals("95816", customers.get(1129).getZIP());
	}

	@Test
	@DisplayName("Record 1130: Phone is 916-456-0939")
	void PhoneOfRecord1130() {
		assertEquals("916-456-0939", customers.get(1129).getPhone());
	}

	@Test
	@DisplayName("Record 1130: Fax is 916-456-5239")
	void FaxOfRecord1130() {
		assertEquals("916-456-5239", customers.get(1129).getFax());
	}

	@Test
	@DisplayName("Record 1130: Email is jesse@axley.com")
	void EmailOfRecord1130() {
		assertEquals("jesse@axley.com", customers.get(1129).getEmail());
	}

	@Test
	@DisplayName("Record 1130: Web is http://www.jesseaxley.com")
	void WebOfRecord1130() {
		assertEquals("http://www.jesseaxley.com", customers.get(1129).getWeb());
	}
}
