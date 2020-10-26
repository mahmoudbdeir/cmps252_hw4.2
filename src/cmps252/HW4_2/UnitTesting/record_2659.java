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

@Tag("3")
class Record_2659 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2659: FirstName is Hassan")
	void FirstNameOfRecord2659() {
		assertEquals("Hassan", customers.get(2658).getFirstName());
	}

	@Test
	@DisplayName("Record 2659: LastName is Zadorozny")
	void LastNameOfRecord2659() {
		assertEquals("Zadorozny", customers.get(2658).getLastName());
	}

	@Test
	@DisplayName("Record 2659: Company is N Webster Prod Div Heaters Eng")
	void CompanyOfRecord2659() {
		assertEquals("N Webster Prod Div Heaters Eng", customers.get(2658).getCompany());
	}

	@Test
	@DisplayName("Record 2659: Address is 179 High St Se")
	void AddressOfRecord2659() {
		assertEquals("179 High St Se", customers.get(2658).getAddress());
	}

	@Test
	@DisplayName("Record 2659: City is Salem")
	void CityOfRecord2659() {
		assertEquals("Salem", customers.get(2658).getCity());
	}

	@Test
	@DisplayName("Record 2659: County is Marion")
	void CountyOfRecord2659() {
		assertEquals("Marion", customers.get(2658).getCounty());
	}

	@Test
	@DisplayName("Record 2659: State is OR")
	void StateOfRecord2659() {
		assertEquals("OR", customers.get(2658).getState());
	}

	@Test
	@DisplayName("Record 2659: ZIP is 97301")
	void ZIPOfRecord2659() {
		assertEquals("97301", customers.get(2658).getZIP());
	}

	@Test
	@DisplayName("Record 2659: Phone is 503-399-0062")
	void PhoneOfRecord2659() {
		assertEquals("503-399-0062", customers.get(2658).getPhone());
	}

	@Test
	@DisplayName("Record 2659: Fax is 503-399-0825")
	void FaxOfRecord2659() {
		assertEquals("503-399-0825", customers.get(2658).getFax());
	}

	@Test
	@DisplayName("Record 2659: Email is hassan@zadorozny.com")
	void EmailOfRecord2659() {
		assertEquals("hassan@zadorozny.com", customers.get(2658).getEmail());
	}

	@Test
	@DisplayName("Record 2659: Web is http://www.hassanzadorozny.com")
	void WebOfRecord2659() {
		assertEquals("http://www.hassanzadorozny.com", customers.get(2658).getWeb());
	}
}
