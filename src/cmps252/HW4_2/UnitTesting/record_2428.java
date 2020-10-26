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

@Tag("31")
class Record_2428 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2428: FirstName is Lorrie")
	void FirstNameOfRecord2428() {
		assertEquals("Lorrie", customers.get(2427).getFirstName());
	}

	@Test
	@DisplayName("Record 2428: LastName is Pacini")
	void LastNameOfRecord2428() {
		assertEquals("Pacini", customers.get(2427).getLastName());
	}

	@Test
	@DisplayName("Record 2428: Company is Latin American Chamber Commrce")
	void CompanyOfRecord2428() {
		assertEquals("Latin American Chamber Commrce", customers.get(2427).getCompany());
	}

	@Test
	@DisplayName("Record 2428: Address is 2805 Mount Vernon Ave")
	void AddressOfRecord2428() {
		assertEquals("2805 Mount Vernon Ave", customers.get(2427).getAddress());
	}

	@Test
	@DisplayName("Record 2428: City is Alexandria")
	void CityOfRecord2428() {
		assertEquals("Alexandria", customers.get(2427).getCity());
	}

	@Test
	@DisplayName("Record 2428: County is Alexandria City")
	void CountyOfRecord2428() {
		assertEquals("Alexandria City", customers.get(2427).getCounty());
	}

	@Test
	@DisplayName("Record 2428: State is VA")
	void StateOfRecord2428() {
		assertEquals("VA", customers.get(2427).getState());
	}

	@Test
	@DisplayName("Record 2428: ZIP is 22301")
	void ZIPOfRecord2428() {
		assertEquals("22301", customers.get(2427).getZIP());
	}

	@Test
	@DisplayName("Record 2428: Phone is 703-684-6851")
	void PhoneOfRecord2428() {
		assertEquals("703-684-6851", customers.get(2427).getPhone());
	}

	@Test
	@DisplayName("Record 2428: Fax is 703-684-6522")
	void FaxOfRecord2428() {
		assertEquals("703-684-6522", customers.get(2427).getFax());
	}

	@Test
	@DisplayName("Record 2428: Email is lorrie@pacini.com")
	void EmailOfRecord2428() {
		assertEquals("lorrie@pacini.com", customers.get(2427).getEmail());
	}

	@Test
	@DisplayName("Record 2428: Web is http://www.lorriepacini.com")
	void WebOfRecord2428() {
		assertEquals("http://www.lorriepacini.com", customers.get(2427).getWeb());
	}
}
