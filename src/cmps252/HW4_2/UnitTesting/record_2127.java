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

@Tag("41")
class Record_2127 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2127: FirstName is Alma")
	void FirstNameOfRecord2127() {
		assertEquals("Alma", customers.get(2126).getFirstName());
	}

	@Test
	@DisplayName("Record 2127: LastName is Boger")
	void LastNameOfRecord2127() {
		assertEquals("Boger", customers.get(2126).getLastName());
	}

	@Test
	@DisplayName("Record 2127: Company is Warren Conner")
	void CompanyOfRecord2127() {
		assertEquals("Warren Conner", customers.get(2126).getCompany());
	}

	@Test
	@DisplayName("Record 2127: Address is 510 W Belmont Ave")
	void AddressOfRecord2127() {
		assertEquals("510 W Belmont Ave", customers.get(2126).getAddress());
	}

	@Test
	@DisplayName("Record 2127: City is Chicago")
	void CityOfRecord2127() {
		assertEquals("Chicago", customers.get(2126).getCity());
	}

	@Test
	@DisplayName("Record 2127: County is Cook")
	void CountyOfRecord2127() {
		assertEquals("Cook", customers.get(2126).getCounty());
	}

	@Test
	@DisplayName("Record 2127: State is IL")
	void StateOfRecord2127() {
		assertEquals("IL", customers.get(2126).getState());
	}

	@Test
	@DisplayName("Record 2127: ZIP is 60657")
	void ZIPOfRecord2127() {
		assertEquals("60657", customers.get(2126).getZIP());
	}

	@Test
	@DisplayName("Record 2127: Phone is 773-883-5141")
	void PhoneOfRecord2127() {
		assertEquals("773-883-5141", customers.get(2126).getPhone());
	}

	@Test
	@DisplayName("Record 2127: Fax is 773-883-9475")
	void FaxOfRecord2127() {
		assertEquals("773-883-9475", customers.get(2126).getFax());
	}

	@Test
	@DisplayName("Record 2127: Email is alma@boger.com")
	void EmailOfRecord2127() {
		assertEquals("alma@boger.com", customers.get(2126).getEmail());
	}

	@Test
	@DisplayName("Record 2127: Web is http://www.almaboger.com")
	void WebOfRecord2127() {
		assertEquals("http://www.almaboger.com", customers.get(2126).getWeb());
	}
}
