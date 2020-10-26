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
class Record_2496 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2496: FirstName is Ivan")
	void FirstNameOfRecord2496() {
		assertEquals("Ivan", customers.get(2495).getFirstName());
	}

	@Test
	@DisplayName("Record 2496: LastName is Inkavesvanitc")
	void LastNameOfRecord2496() {
		assertEquals("Inkavesvanitc", customers.get(2495).getLastName());
	}

	@Test
	@DisplayName("Record 2496: Company is Milford Plaza Hotel")
	void CompanyOfRecord2496() {
		assertEquals("Milford Plaza Hotel", customers.get(2495).getCompany());
	}

	@Test
	@DisplayName("Record 2496: Address is 4200 Pennsylvania Ave")
	void AddressOfRecord2496() {
		assertEquals("4200 Pennsylvania Ave", customers.get(2495).getAddress());
	}

	@Test
	@DisplayName("Record 2496: City is Kansas City")
	void CityOfRecord2496() {
		assertEquals("Kansas City", customers.get(2495).getCity());
	}

	@Test
	@DisplayName("Record 2496: County is Jackson")
	void CountyOfRecord2496() {
		assertEquals("Jackson", customers.get(2495).getCounty());
	}

	@Test
	@DisplayName("Record 2496: State is MO")
	void StateOfRecord2496() {
		assertEquals("MO", customers.get(2495).getState());
	}

	@Test
	@DisplayName("Record 2496: ZIP is 64111")
	void ZIPOfRecord2496() {
		assertEquals("64111", customers.get(2495).getZIP());
	}

	@Test
	@DisplayName("Record 2496: Phone is 816-753-5206")
	void PhoneOfRecord2496() {
		assertEquals("816-753-5206", customers.get(2495).getPhone());
	}

	@Test
	@DisplayName("Record 2496: Fax is 816-753-3644")
	void FaxOfRecord2496() {
		assertEquals("816-753-3644", customers.get(2495).getFax());
	}

	@Test
	@DisplayName("Record 2496: Email is ivan@inkavesvanitc.com")
	void EmailOfRecord2496() {
		assertEquals("ivan@inkavesvanitc.com", customers.get(2495).getEmail());
	}

	@Test
	@DisplayName("Record 2496: Web is http://www.ivaninkavesvanitc.com")
	void WebOfRecord2496() {
		assertEquals("http://www.ivaninkavesvanitc.com", customers.get(2495).getWeb());
	}
}
