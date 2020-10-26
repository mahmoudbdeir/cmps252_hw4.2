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
class Record_2159 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2159: FirstName is Debra")
	void FirstNameOfRecord2159() {
		assertEquals("Debra", customers.get(2158).getFirstName());
	}

	@Test
	@DisplayName("Record 2159: LastName is Sanz")
	void LastNameOfRecord2159() {
		assertEquals("Sanz", customers.get(2158).getLastName());
	}

	@Test
	@DisplayName("Record 2159: Company is Kaleel Bros Inc")
	void CompanyOfRecord2159() {
		assertEquals("Kaleel Bros Inc", customers.get(2158).getCompany());
	}

	@Test
	@DisplayName("Record 2159: Address is 7122 S Jeffery Blvd")
	void AddressOfRecord2159() {
		assertEquals("7122 S Jeffery Blvd", customers.get(2158).getAddress());
	}

	@Test
	@DisplayName("Record 2159: City is Chicago")
	void CityOfRecord2159() {
		assertEquals("Chicago", customers.get(2158).getCity());
	}

	@Test
	@DisplayName("Record 2159: County is Cook")
	void CountyOfRecord2159() {
		assertEquals("Cook", customers.get(2158).getCounty());
	}

	@Test
	@DisplayName("Record 2159: State is IL")
	void StateOfRecord2159() {
		assertEquals("IL", customers.get(2158).getState());
	}

	@Test
	@DisplayName("Record 2159: ZIP is 60649")
	void ZIPOfRecord2159() {
		assertEquals("60649", customers.get(2158).getZIP());
	}

	@Test
	@DisplayName("Record 2159: Phone is 773-363-9184")
	void PhoneOfRecord2159() {
		assertEquals("773-363-9184", customers.get(2158).getPhone());
	}

	@Test
	@DisplayName("Record 2159: Fax is 773-363-3206")
	void FaxOfRecord2159() {
		assertEquals("773-363-3206", customers.get(2158).getFax());
	}

	@Test
	@DisplayName("Record 2159: Email is debra@sanz.com")
	void EmailOfRecord2159() {
		assertEquals("debra@sanz.com", customers.get(2158).getEmail());
	}

	@Test
	@DisplayName("Record 2159: Web is http://www.debrasanz.com")
	void WebOfRecord2159() {
		assertEquals("http://www.debrasanz.com", customers.get(2158).getWeb());
	}
}
