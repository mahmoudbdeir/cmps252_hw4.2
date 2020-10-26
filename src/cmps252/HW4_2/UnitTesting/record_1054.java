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

@Tag("21")
class Record_1054 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1054: FirstName is Weldon")
	void FirstNameOfRecord1054() {
		assertEquals("Weldon", customers.get(1053).getFirstName());
	}

	@Test
	@DisplayName("Record 1054: LastName is Bereznak")
	void LastNameOfRecord1054() {
		assertEquals("Bereznak", customers.get(1053).getLastName());
	}

	@Test
	@DisplayName("Record 1054: Company is Barger Computers")
	void CompanyOfRecord1054() {
		assertEquals("Barger Computers", customers.get(1053).getCompany());
	}

	@Test
	@DisplayName("Record 1054: Address is 7525 Metropolitan Dr")
	void AddressOfRecord1054() {
		assertEquals("7525 Metropolitan Dr", customers.get(1053).getAddress());
	}

	@Test
	@DisplayName("Record 1054: City is San Diego")
	void CityOfRecord1054() {
		assertEquals("San Diego", customers.get(1053).getCity());
	}

	@Test
	@DisplayName("Record 1054: County is San Diego")
	void CountyOfRecord1054() {
		assertEquals("San Diego", customers.get(1053).getCounty());
	}

	@Test
	@DisplayName("Record 1054: State is CA")
	void StateOfRecord1054() {
		assertEquals("CA", customers.get(1053).getState());
	}

	@Test
	@DisplayName("Record 1054: ZIP is 92108")
	void ZIPOfRecord1054() {
		assertEquals("92108", customers.get(1053).getZIP());
	}

	@Test
	@DisplayName("Record 1054: Phone is 619-296-2636")
	void PhoneOfRecord1054() {
		assertEquals("619-296-2636", customers.get(1053).getPhone());
	}

	@Test
	@DisplayName("Record 1054: Fax is 619-296-6164")
	void FaxOfRecord1054() {
		assertEquals("619-296-6164", customers.get(1053).getFax());
	}

	@Test
	@DisplayName("Record 1054: Email is weldon@bereznak.com")
	void EmailOfRecord1054() {
		assertEquals("weldon@bereznak.com", customers.get(1053).getEmail());
	}

	@Test
	@DisplayName("Record 1054: Web is http://www.weldonbereznak.com")
	void WebOfRecord1054() {
		assertEquals("http://www.weldonbereznak.com", customers.get(1053).getWeb());
	}
}
