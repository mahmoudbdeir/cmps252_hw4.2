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

@Tag("24")
class Record_1179 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1179: FirstName is Marquita")
	void FirstNameOfRecord1179() {
		assertEquals("Marquita", customers.get(1178).getFirstName());
	}

	@Test
	@DisplayName("Record 1179: LastName is Loynes")
	void LastNameOfRecord1179() {
		assertEquals("Loynes", customers.get(1178).getLastName());
	}

	@Test
	@DisplayName("Record 1179: Company is Gilian Instrument Corp")
	void CompanyOfRecord1179() {
		assertEquals("Gilian Instrument Corp", customers.get(1178).getCompany());
	}

	@Test
	@DisplayName("Record 1179: Address is 279 States St")
	void AddressOfRecord1179() {
		assertEquals("279 States St", customers.get(1178).getAddress());
	}

	@Test
	@DisplayName("Record 1179: City is San Francisco")
	void CityOfRecord1179() {
		assertEquals("San Francisco", customers.get(1178).getCity());
	}

	@Test
	@DisplayName("Record 1179: County is San Francisco")
	void CountyOfRecord1179() {
		assertEquals("San Francisco", customers.get(1178).getCounty());
	}

	@Test
	@DisplayName("Record 1179: State is CA")
	void StateOfRecord1179() {
		assertEquals("CA", customers.get(1178).getState());
	}

	@Test
	@DisplayName("Record 1179: ZIP is 94114")
	void ZIPOfRecord1179() {
		assertEquals("94114", customers.get(1178).getZIP());
	}

	@Test
	@DisplayName("Record 1179: Phone is 415-431-3079")
	void PhoneOfRecord1179() {
		assertEquals("415-431-3079", customers.get(1178).getPhone());
	}

	@Test
	@DisplayName("Record 1179: Fax is 415-431-7963")
	void FaxOfRecord1179() {
		assertEquals("415-431-7963", customers.get(1178).getFax());
	}

	@Test
	@DisplayName("Record 1179: Email is marquita@loynes.com")
	void EmailOfRecord1179() {
		assertEquals("marquita@loynes.com", customers.get(1178).getEmail());
	}

	@Test
	@DisplayName("Record 1179: Web is http://www.marquitaloynes.com")
	void WebOfRecord1179() {
		assertEquals("http://www.marquitaloynes.com", customers.get(1178).getWeb());
	}
}
