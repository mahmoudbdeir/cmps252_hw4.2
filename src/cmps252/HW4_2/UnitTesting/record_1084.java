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

@Tag("40")
class Record_1084 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1084: FirstName is August")
	void FirstNameOfRecord1084() {
		assertEquals("August", customers.get(1083).getFirstName());
	}

	@Test
	@DisplayName("Record 1084: LastName is Reeh")
	void LastNameOfRecord1084() {
		assertEquals("Reeh", customers.get(1083).getLastName());
	}

	@Test
	@DisplayName("Record 1084: Company is Veenstra, Lynette B Esq")
	void CompanyOfRecord1084() {
		assertEquals("Veenstra, Lynette B Esq", customers.get(1083).getCompany());
	}

	@Test
	@DisplayName("Record 1084: Address is 8209 Camelia Dr")
	void AddressOfRecord1084() {
		assertEquals("8209 Camelia Dr", customers.get(1083).getAddress());
	}

	@Test
	@DisplayName("Record 1084: City is Benton")
	void CityOfRecord1084() {
		assertEquals("Benton", customers.get(1083).getCity());
	}

	@Test
	@DisplayName("Record 1084: County is Saline")
	void CountyOfRecord1084() {
		assertEquals("Saline", customers.get(1083).getCounty());
	}

	@Test
	@DisplayName("Record 1084: State is AR")
	void StateOfRecord1084() {
		assertEquals("AR", customers.get(1083).getState());
	}

	@Test
	@DisplayName("Record 1084: ZIP is 72015")
	void ZIPOfRecord1084() {
		assertEquals("72015", customers.get(1083).getZIP());
	}

	@Test
	@DisplayName("Record 1084: Phone is 501-794-5465")
	void PhoneOfRecord1084() {
		assertEquals("501-794-5465", customers.get(1083).getPhone());
	}

	@Test
	@DisplayName("Record 1084: Fax is 501-794-3115")
	void FaxOfRecord1084() {
		assertEquals("501-794-3115", customers.get(1083).getFax());
	}

	@Test
	@DisplayName("Record 1084: Email is august@reeh.com")
	void EmailOfRecord1084() {
		assertEquals("august@reeh.com", customers.get(1083).getEmail());
	}

	@Test
	@DisplayName("Record 1084: Web is http://www.augustreeh.com")
	void WebOfRecord1084() {
		assertEquals("http://www.augustreeh.com", customers.get(1083).getWeb());
	}
}
