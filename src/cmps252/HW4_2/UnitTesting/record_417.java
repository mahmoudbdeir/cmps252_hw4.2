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

@Tag("44")
class Record_417 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 417: FirstName is Luisa")
	void FirstNameOfRecord417() {
		assertEquals("Luisa", customers.get(416).getFirstName());
	}

	@Test
	@DisplayName("Record 417: LastName is Radloff")
	void LastNameOfRecord417() {
		assertEquals("Radloff", customers.get(416).getLastName());
	}

	@Test
	@DisplayName("Record 417: Company is Mercer County Blind Assn")
	void CompanyOfRecord417() {
		assertEquals("Mercer County Blind Assn", customers.get(416).getCompany());
	}

	@Test
	@DisplayName("Record 417: Address is 2501 E Truman Rd")
	void AddressOfRecord417() {
		assertEquals("2501 E Truman Rd", customers.get(416).getAddress());
	}

	@Test
	@DisplayName("Record 417: City is Kansas City")
	void CityOfRecord417() {
		assertEquals("Kansas City", customers.get(416).getCity());
	}

	@Test
	@DisplayName("Record 417: County is Jackson")
	void CountyOfRecord417() {
		assertEquals("Jackson", customers.get(416).getCounty());
	}

	@Test
	@DisplayName("Record 417: State is MO")
	void StateOfRecord417() {
		assertEquals("MO", customers.get(416).getState());
	}

	@Test
	@DisplayName("Record 417: ZIP is 64127")
	void ZIPOfRecord417() {
		assertEquals("64127", customers.get(416).getZIP());
	}

	@Test
	@DisplayName("Record 417: Phone is 816-483-4028")
	void PhoneOfRecord417() {
		assertEquals("816-483-4028", customers.get(416).getPhone());
	}

	@Test
	@DisplayName("Record 417: Fax is 816-483-6144")
	void FaxOfRecord417() {
		assertEquals("816-483-6144", customers.get(416).getFax());
	}

	@Test
	@DisplayName("Record 417: Email is luisa@radloff.com")
	void EmailOfRecord417() {
		assertEquals("luisa@radloff.com", customers.get(416).getEmail());
	}

	@Test
	@DisplayName("Record 417: Web is http://www.luisaradloff.com")
	void WebOfRecord417() {
		assertEquals("http://www.luisaradloff.com", customers.get(416).getWeb());
	}
}
