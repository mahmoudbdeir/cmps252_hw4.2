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

@Tag("25")
class Record_3028 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3028: FirstName is Glen")
	void FirstNameOfRecord3028() {
		assertEquals("Glen", customers.get(3027).getFirstName());
	}

	@Test
	@DisplayName("Record 3028: LastName is Shiro")
	void LastNameOfRecord3028() {
		assertEquals("Shiro", customers.get(3027).getLastName());
	}

	@Test
	@DisplayName("Record 3028: Company is Eskridge, T Hillis Esq")
	void CompanyOfRecord3028() {
		assertEquals("Eskridge, T Hillis Esq", customers.get(3027).getCompany());
	}

	@Test
	@DisplayName("Record 3028: Address is 3141 Ambrose Ave")
	void AddressOfRecord3028() {
		assertEquals("3141 Ambrose Ave", customers.get(3027).getAddress());
	}

	@Test
	@DisplayName("Record 3028: City is Nashville")
	void CityOfRecord3028() {
		assertEquals("Nashville", customers.get(3027).getCity());
	}

	@Test
	@DisplayName("Record 3028: County is Davidson")
	void CountyOfRecord3028() {
		assertEquals("Davidson", customers.get(3027).getCounty());
	}

	@Test
	@DisplayName("Record 3028: State is TN")
	void StateOfRecord3028() {
		assertEquals("TN", customers.get(3027).getState());
	}

	@Test
	@DisplayName("Record 3028: ZIP is 37207")
	void ZIPOfRecord3028() {
		assertEquals("37207", customers.get(3027).getZIP());
	}

	@Test
	@DisplayName("Record 3028: Phone is 615-227-2755")
	void PhoneOfRecord3028() {
		assertEquals("615-227-2755", customers.get(3027).getPhone());
	}

	@Test
	@DisplayName("Record 3028: Fax is 615-227-3551")
	void FaxOfRecord3028() {
		assertEquals("615-227-3551", customers.get(3027).getFax());
	}

	@Test
	@DisplayName("Record 3028: Email is glen@shiro.com")
	void EmailOfRecord3028() {
		assertEquals("glen@shiro.com", customers.get(3027).getEmail());
	}

	@Test
	@DisplayName("Record 3028: Web is http://www.glenshiro.com")
	void WebOfRecord3028() {
		assertEquals("http://www.glenshiro.com", customers.get(3027).getWeb());
	}
}
