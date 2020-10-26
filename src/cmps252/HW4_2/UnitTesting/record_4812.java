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
class Record_4812 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4812: FirstName is Mary")
	void FirstNameOfRecord4812() {
		assertEquals("Mary", customers.get(4811).getFirstName());
	}

	@Test
	@DisplayName("Record 4812: LastName is Dam")
	void LastNameOfRecord4812() {
		assertEquals("Dam", customers.get(4811).getLastName());
	}

	@Test
	@DisplayName("Record 4812: Company is Bma Inc")
	void CompanyOfRecord4812() {
		assertEquals("Bma Inc", customers.get(4811).getCompany());
	}

	@Test
	@DisplayName("Record 4812: Address is 1880 Century Park E")
	void AddressOfRecord4812() {
		assertEquals("1880 Century Park E", customers.get(4811).getAddress());
	}

	@Test
	@DisplayName("Record 4812: City is Los Angeles")
	void CityOfRecord4812() {
		assertEquals("Los Angeles", customers.get(4811).getCity());
	}

	@Test
	@DisplayName("Record 4812: County is Los Angeles")
	void CountyOfRecord4812() {
		assertEquals("Los Angeles", customers.get(4811).getCounty());
	}

	@Test
	@DisplayName("Record 4812: State is CA")
	void StateOfRecord4812() {
		assertEquals("CA", customers.get(4811).getState());
	}

	@Test
	@DisplayName("Record 4812: ZIP is 90067")
	void ZIPOfRecord4812() {
		assertEquals("90067", customers.get(4811).getZIP());
	}

	@Test
	@DisplayName("Record 4812: Phone is 310-552-3196")
	void PhoneOfRecord4812() {
		assertEquals("310-552-3196", customers.get(4811).getPhone());
	}

	@Test
	@DisplayName("Record 4812: Fax is 310-552-3475")
	void FaxOfRecord4812() {
		assertEquals("310-552-3475", customers.get(4811).getFax());
	}

	@Test
	@DisplayName("Record 4812: Email is mary@dam.com")
	void EmailOfRecord4812() {
		assertEquals("mary@dam.com", customers.get(4811).getEmail());
	}

	@Test
	@DisplayName("Record 4812: Web is http://www.marydam.com")
	void WebOfRecord4812() {
		assertEquals("http://www.marydam.com", customers.get(4811).getWeb());
	}
}
