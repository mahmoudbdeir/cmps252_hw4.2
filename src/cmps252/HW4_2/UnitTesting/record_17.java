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

@Tag("43")
class Record_17 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 17: FirstName is Lauren")
	void FirstNameOfRecord17() {
		assertEquals("Lauren", customers.get(16).getFirstName());
	}

	@Test
	@DisplayName("Record 17: LastName is Langenbach")
	void LastNameOfRecord17() {
		assertEquals("Langenbach", customers.get(16).getLastName());
	}

	@Test
	@DisplayName("Record 17: Company is Albright, David F Esq")
	void CompanyOfRecord17() {
		assertEquals("Albright, David F Esq", customers.get(16).getCompany());
	}

	@Test
	@DisplayName("Record 17: Address is 99 Rv Cent")
	void AddressOfRecord17() {
		assertEquals("99 Rv Cent", customers.get(16).getAddress());
	}

	@Test
	@DisplayName("Record 17: City is Everett")
	void CityOfRecord17() {
		assertEquals("Everett", customers.get(16).getCity());
	}

	@Test
	@DisplayName("Record 17: County is Snohomish")
	void CountyOfRecord17() {
		assertEquals("Snohomish", customers.get(16).getCounty());
	}

	@Test
	@DisplayName("Record 17: State is WA")
	void StateOfRecord17() {
		assertEquals("WA", customers.get(16).getState());
	}

	@Test
	@DisplayName("Record 17: ZIP is 98204")
	void ZIPOfRecord17() {
		assertEquals("98204", customers.get(16).getZIP());
	}

	@Test
	@DisplayName("Record 17: Phone is 425-745-5517")
	void PhoneOfRecord17() {
		assertEquals("425-745-5517", customers.get(16).getPhone());
	}

	@Test
	@DisplayName("Record 17: Fax is 425-745-4356")
	void FaxOfRecord17() {
		assertEquals("425-745-4356", customers.get(16).getFax());
	}

	@Test
	@DisplayName("Record 17: Email is lauren@langenbach.com")
	void EmailOfRecord17() {
		assertEquals("lauren@langenbach.com", customers.get(16).getEmail());
	}

	@Test
	@DisplayName("Record 17: Web is http://www.laurenlangenbach.com")
	void WebOfRecord17() {
		assertEquals("http://www.laurenlangenbach.com", customers.get(16).getWeb());
	}
}
