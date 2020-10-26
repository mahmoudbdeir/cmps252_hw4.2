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
class Record_4943 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4943: FirstName is Gwendolyn")
	void FirstNameOfRecord4943() {
		assertEquals("Gwendolyn", customers.get(4942).getFirstName());
	}

	@Test
	@DisplayName("Record 4943: LastName is Zerkle")
	void LastNameOfRecord4943() {
		assertEquals("Zerkle", customers.get(4942).getLastName());
	}

	@Test
	@DisplayName("Record 4943: Company is Ambassador Inn")
	void CompanyOfRecord4943() {
		assertEquals("Ambassador Inn", customers.get(4942).getCompany());
	}

	@Test
	@DisplayName("Record 4943: Address is 3100 W End Ave")
	void AddressOfRecord4943() {
		assertEquals("3100 W End Ave", customers.get(4942).getAddress());
	}

	@Test
	@DisplayName("Record 4943: City is Nashville")
	void CityOfRecord4943() {
		assertEquals("Nashville", customers.get(4942).getCity());
	}

	@Test
	@DisplayName("Record 4943: County is Davidson")
	void CountyOfRecord4943() {
		assertEquals("Davidson", customers.get(4942).getCounty());
	}

	@Test
	@DisplayName("Record 4943: State is TN")
	void StateOfRecord4943() {
		assertEquals("TN", customers.get(4942).getState());
	}

	@Test
	@DisplayName("Record 4943: ZIP is 37203")
	void ZIPOfRecord4943() {
		assertEquals("37203", customers.get(4942).getZIP());
	}

	@Test
	@DisplayName("Record 4943: Phone is 615-385-4918")
	void PhoneOfRecord4943() {
		assertEquals("615-385-4918", customers.get(4942).getPhone());
	}

	@Test
	@DisplayName("Record 4943: Fax is 615-385-6469")
	void FaxOfRecord4943() {
		assertEquals("615-385-6469", customers.get(4942).getFax());
	}

	@Test
	@DisplayName("Record 4943: Email is gwendolyn@zerkle.com")
	void EmailOfRecord4943() {
		assertEquals("gwendolyn@zerkle.com", customers.get(4942).getEmail());
	}

	@Test
	@DisplayName("Record 4943: Web is http://www.gwendolynzerkle.com")
	void WebOfRecord4943() {
		assertEquals("http://www.gwendolynzerkle.com", customers.get(4942).getWeb());
	}
}
