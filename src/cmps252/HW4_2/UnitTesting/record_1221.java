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

@Tag("2")
class Record_1221 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1221: FirstName is Dawn")
	void FirstNameOfRecord1221() {
		assertEquals("Dawn", customers.get(1220).getFirstName());
	}

	@Test
	@DisplayName("Record 1221: LastName is Ambert")
	void LastNameOfRecord1221() {
		assertEquals("Ambert", customers.get(1220).getLastName());
	}

	@Test
	@DisplayName("Record 1221: Company is Brokerage Services Inc")
	void CompanyOfRecord1221() {
		assertEquals("Brokerage Services Inc", customers.get(1220).getCompany());
	}

	@Test
	@DisplayName("Record 1221: Address is 53 W Jackson Blvd")
	void AddressOfRecord1221() {
		assertEquals("53 W Jackson Blvd", customers.get(1220).getAddress());
	}

	@Test
	@DisplayName("Record 1221: City is Chicago")
	void CityOfRecord1221() {
		assertEquals("Chicago", customers.get(1220).getCity());
	}

	@Test
	@DisplayName("Record 1221: County is Cook")
	void CountyOfRecord1221() {
		assertEquals("Cook", customers.get(1220).getCounty());
	}

	@Test
	@DisplayName("Record 1221: State is IL")
	void StateOfRecord1221() {
		assertEquals("IL", customers.get(1220).getState());
	}

	@Test
	@DisplayName("Record 1221: ZIP is 60604")
	void ZIPOfRecord1221() {
		assertEquals("60604", customers.get(1220).getZIP());
	}

	@Test
	@DisplayName("Record 1221: Phone is 312-347-3931")
	void PhoneOfRecord1221() {
		assertEquals("312-347-3931", customers.get(1220).getPhone());
	}

	@Test
	@DisplayName("Record 1221: Fax is 312-347-9214")
	void FaxOfRecord1221() {
		assertEquals("312-347-9214", customers.get(1220).getFax());
	}

	@Test
	@DisplayName("Record 1221: Email is dawn@ambert.com")
	void EmailOfRecord1221() {
		assertEquals("dawn@ambert.com", customers.get(1220).getEmail());
	}

	@Test
	@DisplayName("Record 1221: Web is http://www.dawnambert.com")
	void WebOfRecord1221() {
		assertEquals("http://www.dawnambert.com", customers.get(1220).getWeb());
	}
}
