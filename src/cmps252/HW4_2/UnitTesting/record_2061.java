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
class Record_2061 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2061: FirstName is Martina")
	void FirstNameOfRecord2061() {
		assertEquals("Martina", customers.get(2060).getFirstName());
	}

	@Test
	@DisplayName("Record 2061: LastName is Holway")
	void LastNameOfRecord2061() {
		assertEquals("Holway", customers.get(2060).getLastName());
	}

	@Test
	@DisplayName("Record 2061: Company is Wiederkehr Wynkeller Rstrnt")
	void CompanyOfRecord2061() {
		assertEquals("Wiederkehr Wynkeller Rstrnt", customers.get(2060).getCompany());
	}

	@Test
	@DisplayName("Record 2061: Address is Box #-1228")
	void AddressOfRecord2061() {
		assertEquals("Box #-1228", customers.get(2060).getAddress());
	}

	@Test
	@DisplayName("Record 2061: City is Oakdale")
	void CityOfRecord2061() {
		assertEquals("Oakdale", customers.get(2060).getCity());
	}

	@Test
	@DisplayName("Record 2061: County is Stanislaus")
	void CountyOfRecord2061() {
		assertEquals("Stanislaus", customers.get(2060).getCounty());
	}

	@Test
	@DisplayName("Record 2061: State is CA")
	void StateOfRecord2061() {
		assertEquals("CA", customers.get(2060).getState());
	}

	@Test
	@DisplayName("Record 2061: ZIP is 95361")
	void ZIPOfRecord2061() {
		assertEquals("95361", customers.get(2060).getZIP());
	}

	@Test
	@DisplayName("Record 2061: Phone is 209-545-8515")
	void PhoneOfRecord2061() {
		assertEquals("209-545-8515", customers.get(2060).getPhone());
	}

	@Test
	@DisplayName("Record 2061: Fax is 209-545-0048")
	void FaxOfRecord2061() {
		assertEquals("209-545-0048", customers.get(2060).getFax());
	}

	@Test
	@DisplayName("Record 2061: Email is martina@holway.com")
	void EmailOfRecord2061() {
		assertEquals("martina@holway.com", customers.get(2060).getEmail());
	}

	@Test
	@DisplayName("Record 2061: Web is http://www.martinaholway.com")
	void WebOfRecord2061() {
		assertEquals("http://www.martinaholway.com", customers.get(2060).getWeb());
	}
}
