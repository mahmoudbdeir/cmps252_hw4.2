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

@Tag("23")
class Record_2896 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2896: FirstName is Danny")
	void FirstNameOfRecord2896() {
		assertEquals("Danny", customers.get(2895).getFirstName());
	}

	@Test
	@DisplayName("Record 2896: LastName is Bauch")
	void LastNameOfRecord2896() {
		assertEquals("Bauch", customers.get(2895).getLastName());
	}

	@Test
	@DisplayName("Record 2896: Company is Cozen, Stephen A Esq")
	void CompanyOfRecord2896() {
		assertEquals("Cozen, Stephen A Esq", customers.get(2895).getCompany());
	}

	@Test
	@DisplayName("Record 2896: Address is 112 Bank St")
	void AddressOfRecord2896() {
		assertEquals("112 Bank St", customers.get(2895).getAddress());
	}

	@Test
	@DisplayName("Record 2896: City is Attleboro")
	void CityOfRecord2896() {
		assertEquals("Attleboro", customers.get(2895).getCity());
	}

	@Test
	@DisplayName("Record 2896: County is Bristol")
	void CountyOfRecord2896() {
		assertEquals("Bristol", customers.get(2895).getCounty());
	}

	@Test
	@DisplayName("Record 2896: State is MA")
	void StateOfRecord2896() {
		assertEquals("MA", customers.get(2895).getState());
	}

	@Test
	@DisplayName("Record 2896: ZIP is 2703")
	void ZIPOfRecord2896() {
		assertEquals("2703", customers.get(2895).getZIP());
	}

	@Test
	@DisplayName("Record 2896: Phone is 508-226-8809")
	void PhoneOfRecord2896() {
		assertEquals("508-226-8809", customers.get(2895).getPhone());
	}

	@Test
	@DisplayName("Record 2896: Fax is 508-226-4292")
	void FaxOfRecord2896() {
		assertEquals("508-226-4292", customers.get(2895).getFax());
	}

	@Test
	@DisplayName("Record 2896: Email is danny@bauch.com")
	void EmailOfRecord2896() {
		assertEquals("danny@bauch.com", customers.get(2895).getEmail());
	}

	@Test
	@DisplayName("Record 2896: Web is http://www.dannybauch.com")
	void WebOfRecord2896() {
		assertEquals("http://www.dannybauch.com", customers.get(2895).getWeb());
	}
}
