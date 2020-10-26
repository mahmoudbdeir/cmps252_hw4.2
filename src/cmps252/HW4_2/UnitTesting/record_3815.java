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

@Tag("42")
class Record_3815 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3815: FirstName is Emery")
	void FirstNameOfRecord3815() {
		assertEquals("Emery", customers.get(3814).getFirstName());
	}

	@Test
	@DisplayName("Record 3815: LastName is Nofsinger")
	void LastNameOfRecord3815() {
		assertEquals("Nofsinger", customers.get(3814).getLastName());
	}

	@Test
	@DisplayName("Record 3815: Company is Odonnell Sign Co")
	void CompanyOfRecord3815() {
		assertEquals("Odonnell Sign Co", customers.get(3814).getCompany());
	}

	@Test
	@DisplayName("Record 3815: Address is 2300 Woodbridge Ave")
	void AddressOfRecord3815() {
		assertEquals("2300 Woodbridge Ave", customers.get(3814).getAddress());
	}

	@Test
	@DisplayName("Record 3815: City is Edison")
	void CityOfRecord3815() {
		assertEquals("Edison", customers.get(3814).getCity());
	}

	@Test
	@DisplayName("Record 3815: County is Middlesex")
	void CountyOfRecord3815() {
		assertEquals("Middlesex", customers.get(3814).getCounty());
	}

	@Test
	@DisplayName("Record 3815: State is NJ")
	void StateOfRecord3815() {
		assertEquals("NJ", customers.get(3814).getState());
	}

	@Test
	@DisplayName("Record 3815: ZIP is 8817")
	void ZIPOfRecord3815() {
		assertEquals("8817", customers.get(3814).getZIP());
	}

	@Test
	@DisplayName("Record 3815: Phone is 732-572-8132")
	void PhoneOfRecord3815() {
		assertEquals("732-572-8132", customers.get(3814).getPhone());
	}

	@Test
	@DisplayName("Record 3815: Fax is 732-572-2373")
	void FaxOfRecord3815() {
		assertEquals("732-572-2373", customers.get(3814).getFax());
	}

	@Test
	@DisplayName("Record 3815: Email is emery@nofsinger.com")
	void EmailOfRecord3815() {
		assertEquals("emery@nofsinger.com", customers.get(3814).getEmail());
	}

	@Test
	@DisplayName("Record 3815: Web is http://www.emerynofsinger.com")
	void WebOfRecord3815() {
		assertEquals("http://www.emerynofsinger.com", customers.get(3814).getWeb());
	}
}
