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

@Tag("18")
class Record_3410 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3410: FirstName is Woodrow")
	void FirstNameOfRecord3410() {
		assertEquals("Woodrow", customers.get(3409).getFirstName());
	}

	@Test
	@DisplayName("Record 3410: LastName is Branon")
	void LastNameOfRecord3410() {
		assertEquals("Branon", customers.get(3409).getLastName());
	}

	@Test
	@DisplayName("Record 3410: Company is Printex")
	void CompanyOfRecord3410() {
		assertEquals("Printex", customers.get(3409).getCompany());
	}

	@Test
	@DisplayName("Record 3410: Address is 610 Gusryan St")
	void AddressOfRecord3410() {
		assertEquals("610 Gusryan St", customers.get(3409).getAddress());
	}

	@Test
	@DisplayName("Record 3410: City is Baltimore")
	void CityOfRecord3410() {
		assertEquals("Baltimore", customers.get(3409).getCity());
	}

	@Test
	@DisplayName("Record 3410: County is Baltimore City")
	void CountyOfRecord3410() {
		assertEquals("Baltimore City", customers.get(3409).getCounty());
	}

	@Test
	@DisplayName("Record 3410: State is MD")
	void StateOfRecord3410() {
		assertEquals("MD", customers.get(3409).getState());
	}

	@Test
	@DisplayName("Record 3410: ZIP is 21224")
	void ZIPOfRecord3410() {
		assertEquals("21224", customers.get(3409).getZIP());
	}

	@Test
	@DisplayName("Record 3410: Phone is 410-633-5633")
	void PhoneOfRecord3410() {
		assertEquals("410-633-5633", customers.get(3409).getPhone());
	}

	@Test
	@DisplayName("Record 3410: Fax is 410-633-1203")
	void FaxOfRecord3410() {
		assertEquals("410-633-1203", customers.get(3409).getFax());
	}

	@Test
	@DisplayName("Record 3410: Email is woodrow@branon.com")
	void EmailOfRecord3410() {
		assertEquals("woodrow@branon.com", customers.get(3409).getEmail());
	}

	@Test
	@DisplayName("Record 3410: Web is http://www.woodrowbranon.com")
	void WebOfRecord3410() {
		assertEquals("http://www.woodrowbranon.com", customers.get(3409).getWeb());
	}
}
