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

@Tag("6")
class Record_2875 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2875: FirstName is Len")
	void FirstNameOfRecord2875() {
		assertEquals("Len", customers.get(2874).getFirstName());
	}

	@Test
	@DisplayName("Record 2875: LastName is Trapeni")
	void LastNameOfRecord2875() {
		assertEquals("Trapeni", customers.get(2874).getLastName());
	}

	@Test
	@DisplayName("Record 2875: Company is Senter, William L Esq")
	void CompanyOfRecord2875() {
		assertEquals("Senter, William L Esq", customers.get(2874).getCompany());
	}

	@Test
	@DisplayName("Record 2875: Address is 10254 Main St")
	void AddressOfRecord2875() {
		assertEquals("10254 Main St", customers.get(2874).getAddress());
	}

	@Test
	@DisplayName("Record 2875: City is Fairfax")
	void CityOfRecord2875() {
		assertEquals("Fairfax", customers.get(2874).getCity());
	}

	@Test
	@DisplayName("Record 2875: County is Fairfax City")
	void CountyOfRecord2875() {
		assertEquals("Fairfax City", customers.get(2874).getCounty());
	}

	@Test
	@DisplayName("Record 2875: State is VA")
	void StateOfRecord2875() {
		assertEquals("VA", customers.get(2874).getState());
	}

	@Test
	@DisplayName("Record 2875: ZIP is 22030")
	void ZIPOfRecord2875() {
		assertEquals("22030", customers.get(2874).getZIP());
	}

	@Test
	@DisplayName("Record 2875: Phone is 703-273-5393")
	void PhoneOfRecord2875() {
		assertEquals("703-273-5393", customers.get(2874).getPhone());
	}

	@Test
	@DisplayName("Record 2875: Fax is 703-273-0134")
	void FaxOfRecord2875() {
		assertEquals("703-273-0134", customers.get(2874).getFax());
	}

	@Test
	@DisplayName("Record 2875: Email is len@trapeni.com")
	void EmailOfRecord2875() {
		assertEquals("len@trapeni.com", customers.get(2874).getEmail());
	}

	@Test
	@DisplayName("Record 2875: Web is http://www.lentrapeni.com")
	void WebOfRecord2875() {
		assertEquals("http://www.lentrapeni.com", customers.get(2874).getWeb());
	}
}
