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

@Tag("17")
class Record_1832 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1832: FirstName is Nathan")
	void FirstNameOfRecord1832() {
		assertEquals("Nathan", customers.get(1831).getFirstName());
	}

	@Test
	@DisplayName("Record 1832: LastName is Hovermale")
	void LastNameOfRecord1832() {
		assertEquals("Hovermale", customers.get(1831).getLastName());
	}

	@Test
	@DisplayName("Record 1832: Company is Hume Lake Christian Camps Inc")
	void CompanyOfRecord1832() {
		assertEquals("Hume Lake Christian Camps Inc", customers.get(1831).getCompany());
	}

	@Test
	@DisplayName("Record 1832: Address is 401 Interstate 45 S")
	void AddressOfRecord1832() {
		assertEquals("401 Interstate 45 S", customers.get(1831).getAddress());
	}

	@Test
	@DisplayName("Record 1832: City is Conroe")
	void CityOfRecord1832() {
		assertEquals("Conroe", customers.get(1831).getCity());
	}

	@Test
	@DisplayName("Record 1832: County is Montgomery")
	void CountyOfRecord1832() {
		assertEquals("Montgomery", customers.get(1831).getCounty());
	}

	@Test
	@DisplayName("Record 1832: State is TX")
	void StateOfRecord1832() {
		assertEquals("TX", customers.get(1831).getState());
	}

	@Test
	@DisplayName("Record 1832: ZIP is 77301")
	void ZIPOfRecord1832() {
		assertEquals("77301", customers.get(1831).getZIP());
	}

	@Test
	@DisplayName("Record 1832: Phone is 936-760-8246")
	void PhoneOfRecord1832() {
		assertEquals("936-760-8246", customers.get(1831).getPhone());
	}

	@Test
	@DisplayName("Record 1832: Fax is 936-760-4553")
	void FaxOfRecord1832() {
		assertEquals("936-760-4553", customers.get(1831).getFax());
	}

	@Test
	@DisplayName("Record 1832: Email is nathan@hovermale.com")
	void EmailOfRecord1832() {
		assertEquals("nathan@hovermale.com", customers.get(1831).getEmail());
	}

	@Test
	@DisplayName("Record 1832: Web is http://www.nathanhovermale.com")
	void WebOfRecord1832() {
		assertEquals("http://www.nathanhovermale.com", customers.get(1831).getWeb());
	}
}
