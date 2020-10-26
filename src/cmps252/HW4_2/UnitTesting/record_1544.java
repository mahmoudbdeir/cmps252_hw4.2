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

@Tag("43")
class Record_1544 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1544: FirstName is Aurora")
	void FirstNameOfRecord1544() {
		assertEquals("Aurora", customers.get(1543).getFirstName());
	}

	@Test
	@DisplayName("Record 1544: LastName is Manzano")
	void LastNameOfRecord1544() {
		assertEquals("Manzano", customers.get(1543).getLastName());
	}

	@Test
	@DisplayName("Record 1544: Company is Girardi And Keese")
	void CompanyOfRecord1544() {
		assertEquals("Girardi And Keese", customers.get(1543).getCompany());
	}

	@Test
	@DisplayName("Record 1544: Address is 2900 Carnation Ave")
	void AddressOfRecord1544() {
		assertEquals("2900 Carnation Ave", customers.get(1543).getAddress());
	}

	@Test
	@DisplayName("Record 1544: City is Willow Grove")
	void CityOfRecord1544() {
		assertEquals("Willow Grove", customers.get(1543).getCity());
	}

	@Test
	@DisplayName("Record 1544: County is Montgomery")
	void CountyOfRecord1544() {
		assertEquals("Montgomery", customers.get(1543).getCounty());
	}

	@Test
	@DisplayName("Record 1544: State is PA")
	void StateOfRecord1544() {
		assertEquals("PA", customers.get(1543).getState());
	}

	@Test
	@DisplayName("Record 1544: ZIP is 19090")
	void ZIPOfRecord1544() {
		assertEquals("19090", customers.get(1543).getZIP());
	}

	@Test
	@DisplayName("Record 1544: Phone is 215-659-7896")
	void PhoneOfRecord1544() {
		assertEquals("215-659-7896", customers.get(1543).getPhone());
	}

	@Test
	@DisplayName("Record 1544: Fax is 215-659-5858")
	void FaxOfRecord1544() {
		assertEquals("215-659-5858", customers.get(1543).getFax());
	}

	@Test
	@DisplayName("Record 1544: Email is aurora@manzano.com")
	void EmailOfRecord1544() {
		assertEquals("aurora@manzano.com", customers.get(1543).getEmail());
	}

	@Test
	@DisplayName("Record 1544: Web is http://www.auroramanzano.com")
	void WebOfRecord1544() {
		assertEquals("http://www.auroramanzano.com", customers.get(1543).getWeb());
	}
}
