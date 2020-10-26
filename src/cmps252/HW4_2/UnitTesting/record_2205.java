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

@Tag("33")
class Record_2205 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2205: FirstName is Alecia")
	void FirstNameOfRecord2205() {
		assertEquals("Alecia", customers.get(2204).getFirstName());
	}

	@Test
	@DisplayName("Record 2205: LastName is Roccio")
	void LastNameOfRecord2205() {
		assertEquals("Roccio", customers.get(2204).getLastName());
	}

	@Test
	@DisplayName("Record 2205: Company is Naco Industries Valor Division")
	void CompanyOfRecord2205() {
		assertEquals("Naco Industries Valor Division", customers.get(2204).getCompany());
	}

	@Test
	@DisplayName("Record 2205: Address is 387 Shuman Blvd")
	void AddressOfRecord2205() {
		assertEquals("387 Shuman Blvd", customers.get(2204).getAddress());
	}

	@Test
	@DisplayName("Record 2205: City is Naperville")
	void CityOfRecord2205() {
		assertEquals("Naperville", customers.get(2204).getCity());
	}

	@Test
	@DisplayName("Record 2205: County is DuPage")
	void CountyOfRecord2205() {
		assertEquals("DuPage", customers.get(2204).getCounty());
	}

	@Test
	@DisplayName("Record 2205: State is IL")
	void StateOfRecord2205() {
		assertEquals("IL", customers.get(2204).getState());
	}

	@Test
	@DisplayName("Record 2205: ZIP is 60563")
	void ZIPOfRecord2205() {
		assertEquals("60563", customers.get(2204).getZIP());
	}

	@Test
	@DisplayName("Record 2205: Phone is 630-778-3542")
	void PhoneOfRecord2205() {
		assertEquals("630-778-3542", customers.get(2204).getPhone());
	}

	@Test
	@DisplayName("Record 2205: Fax is 630-778-8982")
	void FaxOfRecord2205() {
		assertEquals("630-778-8982", customers.get(2204).getFax());
	}

	@Test
	@DisplayName("Record 2205: Email is alecia@roccio.com")
	void EmailOfRecord2205() {
		assertEquals("alecia@roccio.com", customers.get(2204).getEmail());
	}

	@Test
	@DisplayName("Record 2205: Web is http://www.aleciaroccio.com")
	void WebOfRecord2205() {
		assertEquals("http://www.aleciaroccio.com", customers.get(2204).getWeb());
	}
}
