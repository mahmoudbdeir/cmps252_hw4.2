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

@Tag("15")
class Record_1009 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1009: FirstName is Katie")
	void FirstNameOfRecord1009() {
		assertEquals("Katie", customers.get(1008).getFirstName());
	}

	@Test
	@DisplayName("Record 1009: LastName is Lafauci")
	void LastNameOfRecord1009() {
		assertEquals("Lafauci", customers.get(1008).getLastName());
	}

	@Test
	@DisplayName("Record 1009: Company is Davis Time For Travel")
	void CompanyOfRecord1009() {
		assertEquals("Davis Time For Travel", customers.get(1008).getCompany());
	}

	@Test
	@DisplayName("Record 1009: Address is 885 Lakehurst Ave")
	void AddressOfRecord1009() {
		assertEquals("885 Lakehurst Ave", customers.get(1008).getAddress());
	}

	@Test
	@DisplayName("Record 1009: City is Jackson")
	void CityOfRecord1009() {
		assertEquals("Jackson", customers.get(1008).getCity());
	}

	@Test
	@DisplayName("Record 1009: County is Ocean")
	void CountyOfRecord1009() {
		assertEquals("Ocean", customers.get(1008).getCounty());
	}

	@Test
	@DisplayName("Record 1009: State is NJ")
	void StateOfRecord1009() {
		assertEquals("NJ", customers.get(1008).getState());
	}

	@Test
	@DisplayName("Record 1009: ZIP is 8527")
	void ZIPOfRecord1009() {
		assertEquals("8527", customers.get(1008).getZIP());
	}

	@Test
	@DisplayName("Record 1009: Phone is 732-928-4594")
	void PhoneOfRecord1009() {
		assertEquals("732-928-4594", customers.get(1008).getPhone());
	}

	@Test
	@DisplayName("Record 1009: Fax is 732-928-4935")
	void FaxOfRecord1009() {
		assertEquals("732-928-4935", customers.get(1008).getFax());
	}

	@Test
	@DisplayName("Record 1009: Email is katie@lafauci.com")
	void EmailOfRecord1009() {
		assertEquals("katie@lafauci.com", customers.get(1008).getEmail());
	}

	@Test
	@DisplayName("Record 1009: Web is http://www.katielafauci.com")
	void WebOfRecord1009() {
		assertEquals("http://www.katielafauci.com", customers.get(1008).getWeb());
	}
}
