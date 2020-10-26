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

@Tag("36")
class Record_2283 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2283: FirstName is Cortez")
	void FirstNameOfRecord2283() {
		assertEquals("Cortez", customers.get(2282).getFirstName());
	}

	@Test
	@DisplayName("Record 2283: LastName is Hymowits")
	void LastNameOfRecord2283() {
		assertEquals("Hymowits", customers.get(2282).getLastName());
	}

	@Test
	@DisplayName("Record 2283: Company is Markushewski, W Thomas Esq")
	void CompanyOfRecord2283() {
		assertEquals("Markushewski, W Thomas Esq", customers.get(2282).getCompany());
	}

	@Test
	@DisplayName("Record 2283: Address is 328 S Beverly Dr")
	void AddressOfRecord2283() {
		assertEquals("328 S Beverly Dr", customers.get(2282).getAddress());
	}

	@Test
	@DisplayName("Record 2283: City is Beverly Hills")
	void CityOfRecord2283() {
		assertEquals("Beverly Hills", customers.get(2282).getCity());
	}

	@Test
	@DisplayName("Record 2283: County is Los Angeles")
	void CountyOfRecord2283() {
		assertEquals("Los Angeles", customers.get(2282).getCounty());
	}

	@Test
	@DisplayName("Record 2283: State is CA")
	void StateOfRecord2283() {
		assertEquals("CA", customers.get(2282).getState());
	}

	@Test
	@DisplayName("Record 2283: ZIP is 90212")
	void ZIPOfRecord2283() {
		assertEquals("90212", customers.get(2282).getZIP());
	}

	@Test
	@DisplayName("Record 2283: Phone is 310-276-8709")
	void PhoneOfRecord2283() {
		assertEquals("310-276-8709", customers.get(2282).getPhone());
	}

	@Test
	@DisplayName("Record 2283: Fax is 310-276-9207")
	void FaxOfRecord2283() {
		assertEquals("310-276-9207", customers.get(2282).getFax());
	}

	@Test
	@DisplayName("Record 2283: Email is cortez@hymowits.com")
	void EmailOfRecord2283() {
		assertEquals("cortez@hymowits.com", customers.get(2282).getEmail());
	}

	@Test
	@DisplayName("Record 2283: Web is http://www.cortezhymowits.com")
	void WebOfRecord2283() {
		assertEquals("http://www.cortezhymowits.com", customers.get(2282).getWeb());
	}
}
