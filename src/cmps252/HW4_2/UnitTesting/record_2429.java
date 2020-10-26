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

@Tag("38")
class Record_2429 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2429: FirstName is Domenic")
	void FirstNameOfRecord2429() {
		assertEquals("Domenic", customers.get(2428).getFirstName());
	}

	@Test
	@DisplayName("Record 2429: LastName is Kuck")
	void LastNameOfRecord2429() {
		assertEquals("Kuck", customers.get(2428).getLastName());
	}

	@Test
	@DisplayName("Record 2429: Company is Seven Hills Inn & Resort")
	void CompanyOfRecord2429() {
		assertEquals("Seven Hills Inn & Resort", customers.get(2428).getCompany());
	}

	@Test
	@DisplayName("Record 2429: Address is 880 W Benjamin Holt Dr")
	void AddressOfRecord2429() {
		assertEquals("880 W Benjamin Holt Dr", customers.get(2428).getAddress());
	}

	@Test
	@DisplayName("Record 2429: City is Stockton")
	void CityOfRecord2429() {
		assertEquals("Stockton", customers.get(2428).getCity());
	}

	@Test
	@DisplayName("Record 2429: County is San Joaquin")
	void CountyOfRecord2429() {
		assertEquals("San Joaquin", customers.get(2428).getCounty());
	}

	@Test
	@DisplayName("Record 2429: State is CA")
	void StateOfRecord2429() {
		assertEquals("CA", customers.get(2428).getState());
	}

	@Test
	@DisplayName("Record 2429: ZIP is 95207")
	void ZIPOfRecord2429() {
		assertEquals("95207", customers.get(2428).getZIP());
	}

	@Test
	@DisplayName("Record 2429: Phone is 209-957-1651")
	void PhoneOfRecord2429() {
		assertEquals("209-957-1651", customers.get(2428).getPhone());
	}

	@Test
	@DisplayName("Record 2429: Fax is 209-957-5694")
	void FaxOfRecord2429() {
		assertEquals("209-957-5694", customers.get(2428).getFax());
	}

	@Test
	@DisplayName("Record 2429: Email is domenic@kuck.com")
	void EmailOfRecord2429() {
		assertEquals("domenic@kuck.com", customers.get(2428).getEmail());
	}

	@Test
	@DisplayName("Record 2429: Web is http://www.domenickuck.com")
	void WebOfRecord2429() {
		assertEquals("http://www.domenickuck.com", customers.get(2428).getWeb());
	}
}
