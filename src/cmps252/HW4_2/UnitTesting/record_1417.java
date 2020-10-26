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

@Tag("4")
class Record_1417 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1417: FirstName is Zachery")
	void FirstNameOfRecord1417() {
		assertEquals("Zachery", customers.get(1416).getFirstName());
	}

	@Test
	@DisplayName("Record 1417: LastName is Veness")
	void LastNameOfRecord1417() {
		assertEquals("Veness", customers.get(1416).getLastName());
	}

	@Test
	@DisplayName("Record 1417: Company is Professional Security Bur Ltd")
	void CompanyOfRecord1417() {
		assertEquals("Professional Security Bur Ltd", customers.get(1416).getCompany());
	}

	@Test
	@DisplayName("Record 1417: Address is 15 N Wood Ave")
	void AddressOfRecord1417() {
		assertEquals("15 N Wood Ave", customers.get(1416).getAddress());
	}

	@Test
	@DisplayName("Record 1417: City is Linden")
	void CityOfRecord1417() {
		assertEquals("Linden", customers.get(1416).getCity());
	}

	@Test
	@DisplayName("Record 1417: County is Union")
	void CountyOfRecord1417() {
		assertEquals("Union", customers.get(1416).getCounty());
	}

	@Test
	@DisplayName("Record 1417: State is NJ")
	void StateOfRecord1417() {
		assertEquals("NJ", customers.get(1416).getState());
	}

	@Test
	@DisplayName("Record 1417: ZIP is 7036")
	void ZIPOfRecord1417() {
		assertEquals("7036", customers.get(1416).getZIP());
	}

	@Test
	@DisplayName("Record 1417: Phone is 908-862-9729")
	void PhoneOfRecord1417() {
		assertEquals("908-862-9729", customers.get(1416).getPhone());
	}

	@Test
	@DisplayName("Record 1417: Fax is 908-862-1035")
	void FaxOfRecord1417() {
		assertEquals("908-862-1035", customers.get(1416).getFax());
	}

	@Test
	@DisplayName("Record 1417: Email is zachery@veness.com")
	void EmailOfRecord1417() {
		assertEquals("zachery@veness.com", customers.get(1416).getEmail());
	}

	@Test
	@DisplayName("Record 1417: Web is http://www.zacheryveness.com")
	void WebOfRecord1417() {
		assertEquals("http://www.zacheryveness.com", customers.get(1416).getWeb());
	}
}
