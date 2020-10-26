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
class Record_327 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 327: FirstName is Vito")
	void FirstNameOfRecord327() {
		assertEquals("Vito", customers.get(326).getFirstName());
	}

	@Test
	@DisplayName("Record 327: LastName is Wendlandt")
	void LastNameOfRecord327() {
		assertEquals("Wendlandt", customers.get(326).getLastName());
	}

	@Test
	@DisplayName("Record 327: Company is Sharon, Jeffrey S Esq")
	void CompanyOfRecord327() {
		assertEquals("Sharon, Jeffrey S Esq", customers.get(326).getCompany());
	}

	@Test
	@DisplayName("Record 327: Address is 306 S Buchanan St")
	void AddressOfRecord327() {
		assertEquals("306 S Buchanan St", customers.get(326).getAddress());
	}

	@Test
	@DisplayName("Record 327: City is Lafayette")
	void CityOfRecord327() {
		assertEquals("Lafayette", customers.get(326).getCity());
	}

	@Test
	@DisplayName("Record 327: County is Lafayette")
	void CountyOfRecord327() {
		assertEquals("Lafayette", customers.get(326).getCounty());
	}

	@Test
	@DisplayName("Record 327: State is LA")
	void StateOfRecord327() {
		assertEquals("LA", customers.get(326).getState());
	}

	@Test
	@DisplayName("Record 327: ZIP is 70501")
	void ZIPOfRecord327() {
		assertEquals("70501", customers.get(326).getZIP());
	}

	@Test
	@DisplayName("Record 327: Phone is 337-233-9384")
	void PhoneOfRecord327() {
		assertEquals("337-233-9384", customers.get(326).getPhone());
	}

	@Test
	@DisplayName("Record 327: Fax is 337-233-4008")
	void FaxOfRecord327() {
		assertEquals("337-233-4008", customers.get(326).getFax());
	}

	@Test
	@DisplayName("Record 327: Email is vito@wendlandt.com")
	void EmailOfRecord327() {
		assertEquals("vito@wendlandt.com", customers.get(326).getEmail());
	}

	@Test
	@DisplayName("Record 327: Web is http://www.vitowendlandt.com")
	void WebOfRecord327() {
		assertEquals("http://www.vitowendlandt.com", customers.get(326).getWeb());
	}
}
