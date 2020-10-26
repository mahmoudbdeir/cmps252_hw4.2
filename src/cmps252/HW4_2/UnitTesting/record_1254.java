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
class Record_1254 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1254: FirstName is Amos")
	void FirstNameOfRecord1254() {
		assertEquals("Amos", customers.get(1253).getFirstName());
	}

	@Test
	@DisplayName("Record 1254: LastName is Fyndt")
	void LastNameOfRecord1254() {
		assertEquals("Fyndt", customers.get(1253).getLastName());
	}

	@Test
	@DisplayName("Record 1254: Company is Mountain Man Engine")
	void CompanyOfRecord1254() {
		assertEquals("Mountain Man Engine", customers.get(1253).getCompany());
	}

	@Test
	@DisplayName("Record 1254: Address is 1517 W Devon Ave")
	void AddressOfRecord1254() {
		assertEquals("1517 W Devon Ave", customers.get(1253).getAddress());
	}

	@Test
	@DisplayName("Record 1254: City is Chicago")
	void CityOfRecord1254() {
		assertEquals("Chicago", customers.get(1253).getCity());
	}

	@Test
	@DisplayName("Record 1254: County is Cook")
	void CountyOfRecord1254() {
		assertEquals("Cook", customers.get(1253).getCounty());
	}

	@Test
	@DisplayName("Record 1254: State is IL")
	void StateOfRecord1254() {
		assertEquals("IL", customers.get(1253).getState());
	}

	@Test
	@DisplayName("Record 1254: ZIP is 60660")
	void ZIPOfRecord1254() {
		assertEquals("60660", customers.get(1253).getZIP());
	}

	@Test
	@DisplayName("Record 1254: Phone is 773-465-7857")
	void PhoneOfRecord1254() {
		assertEquals("773-465-7857", customers.get(1253).getPhone());
	}

	@Test
	@DisplayName("Record 1254: Fax is 773-465-3747")
	void FaxOfRecord1254() {
		assertEquals("773-465-3747", customers.get(1253).getFax());
	}

	@Test
	@DisplayName("Record 1254: Email is amos@fyndt.com")
	void EmailOfRecord1254() {
		assertEquals("amos@fyndt.com", customers.get(1253).getEmail());
	}

	@Test
	@DisplayName("Record 1254: Web is http://www.amosfyndt.com")
	void WebOfRecord1254() {
		assertEquals("http://www.amosfyndt.com", customers.get(1253).getWeb());
	}
}
