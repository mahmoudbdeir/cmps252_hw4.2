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
class Record_3256 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3256: FirstName is Diane")
	void FirstNameOfRecord3256() {
		assertEquals("Diane", customers.get(3255).getFirstName());
	}

	@Test
	@DisplayName("Record 3256: LastName is Wess")
	void LastNameOfRecord3256() {
		assertEquals("Wess", customers.get(3255).getLastName());
	}

	@Test
	@DisplayName("Record 3256: Company is David Critelli & Associates")
	void CompanyOfRecord3256() {
		assertEquals("David Critelli & Associates", customers.get(3255).getCompany());
	}

	@Test
	@DisplayName("Record 3256: Address is 2100 Touhy Ave")
	void AddressOfRecord3256() {
		assertEquals("2100 Touhy Ave", customers.get(3255).getAddress());
	}

	@Test
	@DisplayName("Record 3256: City is Elk Grove Village")
	void CityOfRecord3256() {
		assertEquals("Elk Grove Village", customers.get(3255).getCity());
	}

	@Test
	@DisplayName("Record 3256: County is Cook")
	void CountyOfRecord3256() {
		assertEquals("Cook", customers.get(3255).getCounty());
	}

	@Test
	@DisplayName("Record 3256: State is IL")
	void StateOfRecord3256() {
		assertEquals("IL", customers.get(3255).getState());
	}

	@Test
	@DisplayName("Record 3256: ZIP is 60007")
	void ZIPOfRecord3256() {
		assertEquals("60007", customers.get(3255).getZIP());
	}

	@Test
	@DisplayName("Record 3256: Phone is 847-439-1858")
	void PhoneOfRecord3256() {
		assertEquals("847-439-1858", customers.get(3255).getPhone());
	}

	@Test
	@DisplayName("Record 3256: Fax is 847-439-0003")
	void FaxOfRecord3256() {
		assertEquals("847-439-0003", customers.get(3255).getFax());
	}

	@Test
	@DisplayName("Record 3256: Email is diane@wess.com")
	void EmailOfRecord3256() {
		assertEquals("diane@wess.com", customers.get(3255).getEmail());
	}

	@Test
	@DisplayName("Record 3256: Web is http://www.dianewess.com")
	void WebOfRecord3256() {
		assertEquals("http://www.dianewess.com", customers.get(3255).getWeb());
	}
}
