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

@Tag("45")
class Record_1833 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1833: FirstName is Iona")
	void FirstNameOfRecord1833() {
		assertEquals("Iona", customers.get(1832).getFirstName());
	}

	@Test
	@DisplayName("Record 1833: LastName is Stewert")
	void LastNameOfRecord1833() {
		assertEquals("Stewert", customers.get(1832).getLastName());
	}

	@Test
	@DisplayName("Record 1833: Company is Flow Engineering Inc")
	void CompanyOfRecord1833() {
		assertEquals("Flow Engineering Inc", customers.get(1832).getCompany());
	}

	@Test
	@DisplayName("Record 1833: Address is 1471 Timber Dr")
	void AddressOfRecord1833() {
		assertEquals("1471 Timber Dr", customers.get(1832).getAddress());
	}

	@Test
	@DisplayName("Record 1833: City is Elgin")
	void CityOfRecord1833() {
		assertEquals("Elgin", customers.get(1832).getCity());
	}

	@Test
	@DisplayName("Record 1833: County is Kane")
	void CountyOfRecord1833() {
		assertEquals("Kane", customers.get(1832).getCounty());
	}

	@Test
	@DisplayName("Record 1833: State is IL")
	void StateOfRecord1833() {
		assertEquals("IL", customers.get(1832).getState());
	}

	@Test
	@DisplayName("Record 1833: ZIP is 60123")
	void ZIPOfRecord1833() {
		assertEquals("60123", customers.get(1832).getZIP());
	}

	@Test
	@DisplayName("Record 1833: Phone is 847-741-8901")
	void PhoneOfRecord1833() {
		assertEquals("847-741-8901", customers.get(1832).getPhone());
	}

	@Test
	@DisplayName("Record 1833: Fax is 847-741-6268")
	void FaxOfRecord1833() {
		assertEquals("847-741-6268", customers.get(1832).getFax());
	}

	@Test
	@DisplayName("Record 1833: Email is iona@stewert.com")
	void EmailOfRecord1833() {
		assertEquals("iona@stewert.com", customers.get(1832).getEmail());
	}

	@Test
	@DisplayName("Record 1833: Web is http://www.ionastewert.com")
	void WebOfRecord1833() {
		assertEquals("http://www.ionastewert.com", customers.get(1832).getWeb());
	}
}
