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

@Tag("10")
class Record_2745 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2745: FirstName is Jo")
	void FirstNameOfRecord2745() {
		assertEquals("Jo", customers.get(2744).getFirstName());
	}

	@Test
	@DisplayName("Record 2745: LastName is Mabe")
	void LastNameOfRecord2745() {
		assertEquals("Mabe", customers.get(2744).getLastName());
	}

	@Test
	@DisplayName("Record 2745: Company is Von Hagen, Donald R Esq")
	void CompanyOfRecord2745() {
		assertEquals("Von Hagen, Donald R Esq", customers.get(2744).getCompany());
	}

	@Test
	@DisplayName("Record 2745: Address is 297 Monroe St")
	void AddressOfRecord2745() {
		assertEquals("297 Monroe St", customers.get(2744).getAddress());
	}

	@Test
	@DisplayName("Record 2745: City is Passaic")
	void CityOfRecord2745() {
		assertEquals("Passaic", customers.get(2744).getCity());
	}

	@Test
	@DisplayName("Record 2745: County is Passaic")
	void CountyOfRecord2745() {
		assertEquals("Passaic", customers.get(2744).getCounty());
	}

	@Test
	@DisplayName("Record 2745: State is NJ")
	void StateOfRecord2745() {
		assertEquals("NJ", customers.get(2744).getState());
	}

	@Test
	@DisplayName("Record 2745: ZIP is 7055")
	void ZIPOfRecord2745() {
		assertEquals("7055", customers.get(2744).getZIP());
	}

	@Test
	@DisplayName("Record 2745: Phone is 973-471-2968")
	void PhoneOfRecord2745() {
		assertEquals("973-471-2968", customers.get(2744).getPhone());
	}

	@Test
	@DisplayName("Record 2745: Fax is 973-471-0677")
	void FaxOfRecord2745() {
		assertEquals("973-471-0677", customers.get(2744).getFax());
	}

	@Test
	@DisplayName("Record 2745: Email is jo@mabe.com")
	void EmailOfRecord2745() {
		assertEquals("jo@mabe.com", customers.get(2744).getEmail());
	}

	@Test
	@DisplayName("Record 2745: Web is http://www.jomabe.com")
	void WebOfRecord2745() {
		assertEquals("http://www.jomabe.com", customers.get(2744).getWeb());
	}
}
