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

@Tag("49")
class Record_1503 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1503: FirstName is Dolly")
	void FirstNameOfRecord1503() {
		assertEquals("Dolly", customers.get(1502).getFirstName());
	}

	@Test
	@DisplayName("Record 1503: LastName is Flessner")
	void LastNameOfRecord1503() {
		assertEquals("Flessner", customers.get(1502).getLastName());
	}

	@Test
	@DisplayName("Record 1503: Company is Jfk Hartwyck At Plainfield")
	void CompanyOfRecord1503() {
		assertEquals("Jfk Hartwyck At Plainfield", customers.get(1502).getCompany());
	}

	@Test
	@DisplayName("Record 1503: Address is 55 School Ave")
	void AddressOfRecord1503() {
		assertEquals("55 School Ave", customers.get(1502).getAddress());
	}

	@Test
	@DisplayName("Record 1503: City is Somerset")
	void CityOfRecord1503() {
		assertEquals("Somerset", customers.get(1502).getCity());
	}

	@Test
	@DisplayName("Record 1503: County is Somerset")
	void CountyOfRecord1503() {
		assertEquals("Somerset", customers.get(1502).getCounty());
	}

	@Test
	@DisplayName("Record 1503: State is NJ")
	void StateOfRecord1503() {
		assertEquals("NJ", customers.get(1502).getState());
	}

	@Test
	@DisplayName("Record 1503: ZIP is 8873")
	void ZIPOfRecord1503() {
		assertEquals("8873", customers.get(1502).getZIP());
	}

	@Test
	@DisplayName("Record 1503: Phone is 732-846-3453")
	void PhoneOfRecord1503() {
		assertEquals("732-846-3453", customers.get(1502).getPhone());
	}

	@Test
	@DisplayName("Record 1503: Fax is 732-846-7279")
	void FaxOfRecord1503() {
		assertEquals("732-846-7279", customers.get(1502).getFax());
	}

	@Test
	@DisplayName("Record 1503: Email is dolly@flessner.com")
	void EmailOfRecord1503() {
		assertEquals("dolly@flessner.com", customers.get(1502).getEmail());
	}

	@Test
	@DisplayName("Record 1503: Web is http://www.dollyflessner.com")
	void WebOfRecord1503() {
		assertEquals("http://www.dollyflessner.com", customers.get(1502).getWeb());
	}
}
