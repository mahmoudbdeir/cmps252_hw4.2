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

@Tag("45")
class Record_2790 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2790: FirstName is Krystle")
	void FirstNameOfRecord2790() {
		assertEquals("Krystle", customers.get(2789).getFirstName());
	}

	@Test
	@DisplayName("Record 2790: LastName is Chowdhury")
	void LastNameOfRecord2790() {
		assertEquals("Chowdhury", customers.get(2789).getLastName());
	}

	@Test
	@DisplayName("Record 2790: Company is Wkyk")
	void CompanyOfRecord2790() {
		assertEquals("Wkyk", customers.get(2789).getCompany());
	}

	@Test
	@DisplayName("Record 2790: Address is 601 S Mc Kinley Ave")
	void AddressOfRecord2790() {
		assertEquals("601 S Mc Kinley Ave", customers.get(2789).getAddress());
	}

	@Test
	@DisplayName("Record 2790: City is Joplin")
	void CityOfRecord2790() {
		assertEquals("Joplin", customers.get(2789).getCity());
	}

	@Test
	@DisplayName("Record 2790: County is Jasper")
	void CountyOfRecord2790() {
		assertEquals("Jasper", customers.get(2789).getCounty());
	}

	@Test
	@DisplayName("Record 2790: State is MO")
	void StateOfRecord2790() {
		assertEquals("MO", customers.get(2789).getState());
	}

	@Test
	@DisplayName("Record 2790: ZIP is 64801")
	void ZIPOfRecord2790() {
		assertEquals("64801", customers.get(2789).getZIP());
	}

	@Test
	@DisplayName("Record 2790: Phone is 417-623-6356")
	void PhoneOfRecord2790() {
		assertEquals("417-623-6356", customers.get(2789).getPhone());
	}

	@Test
	@DisplayName("Record 2790: Fax is 417-623-9738")
	void FaxOfRecord2790() {
		assertEquals("417-623-9738", customers.get(2789).getFax());
	}

	@Test
	@DisplayName("Record 2790: Email is krystle@chowdhury.com")
	void EmailOfRecord2790() {
		assertEquals("krystle@chowdhury.com", customers.get(2789).getEmail());
	}

	@Test
	@DisplayName("Record 2790: Web is http://www.krystlechowdhury.com")
	void WebOfRecord2790() {
		assertEquals("http://www.krystlechowdhury.com", customers.get(2789).getWeb());
	}
}
