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

@Tag("44")
class Record_490 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 490: FirstName is Christian")
	void FirstNameOfRecord490() {
		assertEquals("Christian", customers.get(489).getFirstName());
	}

	@Test
	@DisplayName("Record 490: LastName is Domianus")
	void LastNameOfRecord490() {
		assertEquals("Domianus", customers.get(489).getLastName());
	}

	@Test
	@DisplayName("Record 490: Company is Judicial Arbiter Group")
	void CompanyOfRecord490() {
		assertEquals("Judicial Arbiter Group", customers.get(489).getCompany());
	}

	@Test
	@DisplayName("Record 490: Address is 108 San Jacinto Ave")
	void AddressOfRecord490() {
		assertEquals("108 San Jacinto Ave", customers.get(489).getAddress());
	}

	@Test
	@DisplayName("Record 490: City is Bryan")
	void CityOfRecord490() {
		assertEquals("Bryan", customers.get(489).getCity());
	}

	@Test
	@DisplayName("Record 490: County is Brazos")
	void CountyOfRecord490() {
		assertEquals("Brazos", customers.get(489).getCounty());
	}

	@Test
	@DisplayName("Record 490: State is TX")
	void StateOfRecord490() {
		assertEquals("TX", customers.get(489).getState());
	}

	@Test
	@DisplayName("Record 490: ZIP is 77803")
	void ZIPOfRecord490() {
		assertEquals("77803", customers.get(489).getZIP());
	}

	@Test
	@DisplayName("Record 490: Phone is 979-823-4579")
	void PhoneOfRecord490() {
		assertEquals("979-823-4579", customers.get(489).getPhone());
	}

	@Test
	@DisplayName("Record 490: Fax is 979-823-8868")
	void FaxOfRecord490() {
		assertEquals("979-823-8868", customers.get(489).getFax());
	}

	@Test
	@DisplayName("Record 490: Email is christian@domianus.com")
	void EmailOfRecord490() {
		assertEquals("christian@domianus.com", customers.get(489).getEmail());
	}

	@Test
	@DisplayName("Record 490: Web is http://www.christiandomianus.com")
	void WebOfRecord490() {
		assertEquals("http://www.christiandomianus.com", customers.get(489).getWeb());
	}
}
