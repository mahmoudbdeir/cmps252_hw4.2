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

@Tag("22")
class Record_1490 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1490: FirstName is Elton")
	void FirstNameOfRecord1490() {
		assertEquals("Elton", customers.get(1489).getFirstName());
	}

	@Test
	@DisplayName("Record 1490: LastName is Frazell")
	void LastNameOfRecord1490() {
		assertEquals("Frazell", customers.get(1489).getLastName());
	}

	@Test
	@DisplayName("Record 1490: Company is Industrial Fasteners Institute")
	void CompanyOfRecord1490() {
		assertEquals("Industrial Fasteners Institute", customers.get(1489).getCompany());
	}

	@Test
	@DisplayName("Record 1490: Address is 3939 Germantown Ave")
	void AddressOfRecord1490() {
		assertEquals("3939 Germantown Ave", customers.get(1489).getAddress());
	}

	@Test
	@DisplayName("Record 1490: City is Philadelphia")
	void CityOfRecord1490() {
		assertEquals("Philadelphia", customers.get(1489).getCity());
	}

	@Test
	@DisplayName("Record 1490: County is Philadelphia")
	void CountyOfRecord1490() {
		assertEquals("Philadelphia", customers.get(1489).getCounty());
	}

	@Test
	@DisplayName("Record 1490: State is PA")
	void StateOfRecord1490() {
		assertEquals("PA", customers.get(1489).getState());
	}

	@Test
	@DisplayName("Record 1490: ZIP is 19140")
	void ZIPOfRecord1490() {
		assertEquals("19140", customers.get(1489).getZIP());
	}

	@Test
	@DisplayName("Record 1490: Phone is 215-225-1144")
	void PhoneOfRecord1490() {
		assertEquals("215-225-1144", customers.get(1489).getPhone());
	}

	@Test
	@DisplayName("Record 1490: Fax is 215-225-7096")
	void FaxOfRecord1490() {
		assertEquals("215-225-7096", customers.get(1489).getFax());
	}

	@Test
	@DisplayName("Record 1490: Email is elton@frazell.com")
	void EmailOfRecord1490() {
		assertEquals("elton@frazell.com", customers.get(1489).getEmail());
	}

	@Test
	@DisplayName("Record 1490: Web is http://www.eltonfrazell.com")
	void WebOfRecord1490() {
		assertEquals("http://www.eltonfrazell.com", customers.get(1489).getWeb());
	}
}
