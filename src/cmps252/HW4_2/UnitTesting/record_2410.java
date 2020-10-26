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
class Record_2410 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2410: FirstName is Janie")
	void FirstNameOfRecord2410() {
		assertEquals("Janie", customers.get(2409).getFirstName());
	}

	@Test
	@DisplayName("Record 2410: LastName is Immel")
	void LastNameOfRecord2410() {
		assertEquals("Immel", customers.get(2409).getLastName());
	}

	@Test
	@DisplayName("Record 2410: Company is Quick Tanks Inc")
	void CompanyOfRecord2410() {
		assertEquals("Quick Tanks Inc", customers.get(2409).getCompany());
	}

	@Test
	@DisplayName("Record 2410: Address is 1717 W Belmont Ave")
	void AddressOfRecord2410() {
		assertEquals("1717 W Belmont Ave", customers.get(2409).getAddress());
	}

	@Test
	@DisplayName("Record 2410: City is Chicago")
	void CityOfRecord2410() {
		assertEquals("Chicago", customers.get(2409).getCity());
	}

	@Test
	@DisplayName("Record 2410: County is Cook")
	void CountyOfRecord2410() {
		assertEquals("Cook", customers.get(2409).getCounty());
	}

	@Test
	@DisplayName("Record 2410: State is IL")
	void StateOfRecord2410() {
		assertEquals("IL", customers.get(2409).getState());
	}

	@Test
	@DisplayName("Record 2410: ZIP is 60657")
	void ZIPOfRecord2410() {
		assertEquals("60657", customers.get(2409).getZIP());
	}

	@Test
	@DisplayName("Record 2410: Phone is 773-248-4259")
	void PhoneOfRecord2410() {
		assertEquals("773-248-4259", customers.get(2409).getPhone());
	}

	@Test
	@DisplayName("Record 2410: Fax is 773-248-1046")
	void FaxOfRecord2410() {
		assertEquals("773-248-1046", customers.get(2409).getFax());
	}

	@Test
	@DisplayName("Record 2410: Email is janie@immel.com")
	void EmailOfRecord2410() {
		assertEquals("janie@immel.com", customers.get(2409).getEmail());
	}

	@Test
	@DisplayName("Record 2410: Web is http://www.janiymmel.com")
	void WebOfRecord2410() {
		assertEquals("http://www.janiymmel.com", customers.get(2409).getWeb());
	}
}
