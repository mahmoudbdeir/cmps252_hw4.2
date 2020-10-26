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

@Tag("47")
class Record_1275 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1275: FirstName is Wilda")
	void FirstNameOfRecord1275() {
		assertEquals("Wilda", customers.get(1274).getFirstName());
	}

	@Test
	@DisplayName("Record 1275: LastName is Gessner")
	void LastNameOfRecord1275() {
		assertEquals("Gessner", customers.get(1274).getLastName());
	}

	@Test
	@DisplayName("Record 1275: Company is Lossini Co Inc")
	void CompanyOfRecord1275() {
		assertEquals("Lossini Co Inc", customers.get(1274).getCompany());
	}

	@Test
	@DisplayName("Record 1275: Address is 9602 Orange Ave")
	void AddressOfRecord1275() {
		assertEquals("9602 Orange Ave", customers.get(1274).getAddress());
	}

	@Test
	@DisplayName("Record 1275: City is Anahym")
	void CityOfRecord1275() {
		assertEquals("Anahym", customers.get(1274).getCity());
	}

	@Test
	@DisplayName("Record 1275: County is Orange")
	void CountyOfRecord1275() {
		assertEquals("Orange", customers.get(1274).getCounty());
	}

	@Test
	@DisplayName("Record 1275: State is CA")
	void StateOfRecord1275() {
		assertEquals("CA", customers.get(1274).getState());
	}

	@Test
	@DisplayName("Record 1275: ZIP is 92804")
	void ZIPOfRecord1275() {
		assertEquals("92804", customers.get(1274).getZIP());
	}

	@Test
	@DisplayName("Record 1275: Phone is 714-772-4974")
	void PhoneOfRecord1275() {
		assertEquals("714-772-4974", customers.get(1274).getPhone());
	}

	@Test
	@DisplayName("Record 1275: Fax is 714-772-2194")
	void FaxOfRecord1275() {
		assertEquals("714-772-2194", customers.get(1274).getFax());
	}

	@Test
	@DisplayName("Record 1275: Email is wilda@gessner.com")
	void EmailOfRecord1275() {
		assertEquals("wilda@gessner.com", customers.get(1274).getEmail());
	}

	@Test
	@DisplayName("Record 1275: Web is http://www.wildagessner.com")
	void WebOfRecord1275() {
		assertEquals("http://www.wildagessner.com", customers.get(1274).getWeb());
	}
}
