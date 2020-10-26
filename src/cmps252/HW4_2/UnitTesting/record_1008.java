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

@Tag("38")
class Record_1008 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1008: FirstName is Judy")
	void FirstNameOfRecord1008() {
		assertEquals("Judy", customers.get(1007).getFirstName());
	}

	@Test
	@DisplayName("Record 1008: LastName is Babbs")
	void LastNameOfRecord1008() {
		assertEquals("Babbs", customers.get(1007).getLastName());
	}

	@Test
	@DisplayName("Record 1008: Company is Jayson Oil Company Inc")
	void CompanyOfRecord1008() {
		assertEquals("Jayson Oil Company Inc", customers.get(1007).getCompany());
	}

	@Test
	@DisplayName("Record 1008: Address is 5712 S Harlem Ave")
	void AddressOfRecord1008() {
		assertEquals("5712 S Harlem Ave", customers.get(1007).getAddress());
	}

	@Test
	@DisplayName("Record 1008: City is Summit Argo")
	void CityOfRecord1008() {
		assertEquals("Summit Argo", customers.get(1007).getCity());
	}

	@Test
	@DisplayName("Record 1008: County is Cook")
	void CountyOfRecord1008() {
		assertEquals("Cook", customers.get(1007).getCounty());
	}

	@Test
	@DisplayName("Record 1008: State is IL")
	void StateOfRecord1008() {
		assertEquals("IL", customers.get(1007).getState());
	}

	@Test
	@DisplayName("Record 1008: ZIP is 60501")
	void ZIPOfRecord1008() {
		assertEquals("60501", customers.get(1007).getZIP());
	}

	@Test
	@DisplayName("Record 1008: Phone is 708-496-3988")
	void PhoneOfRecord1008() {
		assertEquals("708-496-3988", customers.get(1007).getPhone());
	}

	@Test
	@DisplayName("Record 1008: Fax is 708-496-8716")
	void FaxOfRecord1008() {
		assertEquals("708-496-8716", customers.get(1007).getFax());
	}

	@Test
	@DisplayName("Record 1008: Email is judy@babbs.com")
	void EmailOfRecord1008() {
		assertEquals("judy@babbs.com", customers.get(1007).getEmail());
	}

	@Test
	@DisplayName("Record 1008: Web is http://www.judybabbs.com")
	void WebOfRecord1008() {
		assertEquals("http://www.judybabbs.com", customers.get(1007).getWeb());
	}
}
