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

@Tag("0")
class Record_1226 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1226: FirstName is Whitney")
	void FirstNameOfRecord1226() {
		assertEquals("Whitney", customers.get(1225).getFirstName());
	}

	@Test
	@DisplayName("Record 1226: LastName is Barchacky")
	void LastNameOfRecord1226() {
		assertEquals("Barchacky", customers.get(1225).getLastName());
	}

	@Test
	@DisplayName("Record 1226: Company is Sos Metals Inc")
	void CompanyOfRecord1226() {
		assertEquals("Sos Metals Inc", customers.get(1225).getCompany());
	}

	@Test
	@DisplayName("Record 1226: Address is 800 Chestnut St")
	void AddressOfRecord1226() {
		assertEquals("800 Chestnut St", customers.get(1225).getAddress());
	}

	@Test
	@DisplayName("Record 1226: City is Philadelphia")
	void CityOfRecord1226() {
		assertEquals("Philadelphia", customers.get(1225).getCity());
	}

	@Test
	@DisplayName("Record 1226: County is Philadelphia")
	void CountyOfRecord1226() {
		assertEquals("Philadelphia", customers.get(1225).getCounty());
	}

	@Test
	@DisplayName("Record 1226: State is PA")
	void StateOfRecord1226() {
		assertEquals("PA", customers.get(1225).getState());
	}

	@Test
	@DisplayName("Record 1226: ZIP is 19107")
	void ZIPOfRecord1226() {
		assertEquals("19107", customers.get(1225).getZIP());
	}

	@Test
	@DisplayName("Record 1226: Phone is 215-922-1278")
	void PhoneOfRecord1226() {
		assertEquals("215-922-1278", customers.get(1225).getPhone());
	}

	@Test
	@DisplayName("Record 1226: Fax is 215-922-8668")
	void FaxOfRecord1226() {
		assertEquals("215-922-8668", customers.get(1225).getFax());
	}

	@Test
	@DisplayName("Record 1226: Email is whitney@barchacky.com")
	void EmailOfRecord1226() {
		assertEquals("whitney@barchacky.com", customers.get(1225).getEmail());
	}

	@Test
	@DisplayName("Record 1226: Web is http://www.whitneybarchacky.com")
	void WebOfRecord1226() {
		assertEquals("http://www.whitneybarchacky.com", customers.get(1225).getWeb());
	}
}
