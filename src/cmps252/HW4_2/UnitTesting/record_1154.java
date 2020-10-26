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

@Tag("14")
class Record_1154 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1154: FirstName is Joesph")
	void FirstNameOfRecord1154() {
		assertEquals("Joesph", customers.get(1153).getFirstName());
	}

	@Test
	@DisplayName("Record 1154: LastName is Stolley")
	void LastNameOfRecord1154() {
		assertEquals("Stolley", customers.get(1153).getLastName());
	}

	@Test
	@DisplayName("Record 1154: Company is Golden Bear Travel Inc")
	void CompanyOfRecord1154() {
		assertEquals("Golden Bear Travel Inc", customers.get(1153).getCompany());
	}

	@Test
	@DisplayName("Record 1154: Address is 13125 Midway Pl")
	void AddressOfRecord1154() {
		assertEquals("13125 Midway Pl", customers.get(1153).getAddress());
	}

	@Test
	@DisplayName("Record 1154: City is Cerritos")
	void CityOfRecord1154() {
		assertEquals("Cerritos", customers.get(1153).getCity());
	}

	@Test
	@DisplayName("Record 1154: County is Los Angeles")
	void CountyOfRecord1154() {
		assertEquals("Los Angeles", customers.get(1153).getCounty());
	}

	@Test
	@DisplayName("Record 1154: State is CA")
	void StateOfRecord1154() {
		assertEquals("CA", customers.get(1153).getState());
	}

	@Test
	@DisplayName("Record 1154: ZIP is 90703")
	void ZIPOfRecord1154() {
		assertEquals("90703", customers.get(1153).getZIP());
	}

	@Test
	@DisplayName("Record 1154: Phone is 562-802-7197")
	void PhoneOfRecord1154() {
		assertEquals("562-802-7197", customers.get(1153).getPhone());
	}

	@Test
	@DisplayName("Record 1154: Fax is 562-802-9003")
	void FaxOfRecord1154() {
		assertEquals("562-802-9003", customers.get(1153).getFax());
	}

	@Test
	@DisplayName("Record 1154: Email is joesph@stolley.com")
	void EmailOfRecord1154() {
		assertEquals("joesph@stolley.com", customers.get(1153).getEmail());
	}

	@Test
	@DisplayName("Record 1154: Web is http://www.joesphstolley.com")
	void WebOfRecord1154() {
		assertEquals("http://www.joesphstolley.com", customers.get(1153).getWeb());
	}
}
