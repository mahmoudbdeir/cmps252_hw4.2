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
class Record_3089 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3089: FirstName is Omar")
	void FirstNameOfRecord3089() {
		assertEquals("Omar", customers.get(3088).getFirstName());
	}

	@Test
	@DisplayName("Record 3089: LastName is Offner")
	void LastNameOfRecord3089() {
		assertEquals("Offner", customers.get(3088).getLastName());
	}

	@Test
	@DisplayName("Record 3089: Company is Lopez, Diego A Esq")
	void CompanyOfRecord3089() {
		assertEquals("Lopez, Diego A Esq", customers.get(3088).getCompany());
	}

	@Test
	@DisplayName("Record 3089: Address is 2223 Woodbridge Ave")
	void AddressOfRecord3089() {
		assertEquals("2223 Woodbridge Ave", customers.get(3088).getAddress());
	}

	@Test
	@DisplayName("Record 3089: City is Edison")
	void CityOfRecord3089() {
		assertEquals("Edison", customers.get(3088).getCity());
	}

	@Test
	@DisplayName("Record 3089: County is Middlesex")
	void CountyOfRecord3089() {
		assertEquals("Middlesex", customers.get(3088).getCounty());
	}

	@Test
	@DisplayName("Record 3089: State is NJ")
	void StateOfRecord3089() {
		assertEquals("NJ", customers.get(3088).getState());
	}

	@Test
	@DisplayName("Record 3089: ZIP is 8817")
	void ZIPOfRecord3089() {
		assertEquals("8817", customers.get(3088).getZIP());
	}

	@Test
	@DisplayName("Record 3089: Phone is 732-572-7117")
	void PhoneOfRecord3089() {
		assertEquals("732-572-7117", customers.get(3088).getPhone());
	}

	@Test
	@DisplayName("Record 3089: Fax is 732-572-4238")
	void FaxOfRecord3089() {
		assertEquals("732-572-4238", customers.get(3088).getFax());
	}

	@Test
	@DisplayName("Record 3089: Email is omar@offner.com")
	void EmailOfRecord3089() {
		assertEquals("omar@offner.com", customers.get(3088).getEmail());
	}

	@Test
	@DisplayName("Record 3089: Web is http://www.omaroffner.com")
	void WebOfRecord3089() {
		assertEquals("http://www.omaroffner.com", customers.get(3088).getWeb());
	}
}
