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

@Tag("11")
class Record_483 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 483: FirstName is Jeannie")
	void FirstNameOfRecord483() {
		assertEquals("Jeannie", customers.get(482).getFirstName());
	}

	@Test
	@DisplayName("Record 483: LastName is Jurasek")
	void LastNameOfRecord483() {
		assertEquals("Jurasek", customers.get(482).getLastName());
	}

	@Test
	@DisplayName("Record 483: Company is Giddings, Theresa")
	void CompanyOfRecord483() {
		assertEquals("Giddings, Theresa", customers.get(482).getCompany());
	}

	@Test
	@DisplayName("Record 483: Address is 17197 N Laurel Park Dr  #-500")
	void AddressOfRecord483() {
		assertEquals("17197 N Laurel Park Dr  #-500", customers.get(482).getAddress());
	}

	@Test
	@DisplayName("Record 483: City is Livonia")
	void CityOfRecord483() {
		assertEquals("Livonia", customers.get(482).getCity());
	}

	@Test
	@DisplayName("Record 483: County is Wayne")
	void CountyOfRecord483() {
		assertEquals("Wayne", customers.get(482).getCounty());
	}

	@Test
	@DisplayName("Record 483: State is MI")
	void StateOfRecord483() {
		assertEquals("MI", customers.get(482).getState());
	}

	@Test
	@DisplayName("Record 483: ZIP is 48152")
	void ZIPOfRecord483() {
		assertEquals("48152", customers.get(482).getZIP());
	}

	@Test
	@DisplayName("Record 483: Phone is 734-462-4005")
	void PhoneOfRecord483() {
		assertEquals("734-462-4005", customers.get(482).getPhone());
	}

	@Test
	@DisplayName("Record 483: Fax is 734-462-7685")
	void FaxOfRecord483() {
		assertEquals("734-462-7685", customers.get(482).getFax());
	}

	@Test
	@DisplayName("Record 483: Email is jeannie@jurasek.com")
	void EmailOfRecord483() {
		assertEquals("jeannie@jurasek.com", customers.get(482).getEmail());
	}

	@Test
	@DisplayName("Record 483: Web is http://www.jeanniejurasek.com")
	void WebOfRecord483() {
		assertEquals("http://www.jeanniejurasek.com", customers.get(482).getWeb());
	}
}
