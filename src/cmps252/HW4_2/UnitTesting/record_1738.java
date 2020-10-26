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

@Tag("1")
class Record_1738 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1738: FirstName is Alton")
	void FirstNameOfRecord1738() {
		assertEquals("Alton", customers.get(1737).getFirstName());
	}

	@Test
	@DisplayName("Record 1738: LastName is Rupke")
	void LastNameOfRecord1738() {
		assertEquals("Rupke", customers.get(1737).getLastName());
	}

	@Test
	@DisplayName("Record 1738: Company is P C Service")
	void CompanyOfRecord1738() {
		assertEquals("P C Service", customers.get(1737).getCompany());
	}

	@Test
	@DisplayName("Record 1738: Address is 47 Brownell St")
	void AddressOfRecord1738() {
		assertEquals("47 Brownell St", customers.get(1737).getAddress());
	}

	@Test
	@DisplayName("Record 1738: City is Worcester")
	void CityOfRecord1738() {
		assertEquals("Worcester", customers.get(1737).getCity());
	}

	@Test
	@DisplayName("Record 1738: County is Worcester")
	void CountyOfRecord1738() {
		assertEquals("Worcester", customers.get(1737).getCounty());
	}

	@Test
	@DisplayName("Record 1738: State is MA")
	void StateOfRecord1738() {
		assertEquals("MA", customers.get(1737).getState());
	}

	@Test
	@DisplayName("Record 1738: ZIP is 1602")
	void ZIPOfRecord1738() {
		assertEquals("1602", customers.get(1737).getZIP());
	}

	@Test
	@DisplayName("Record 1738: Phone is 508-791-5154")
	void PhoneOfRecord1738() {
		assertEquals("508-791-5154", customers.get(1737).getPhone());
	}

	@Test
	@DisplayName("Record 1738: Fax is 508-791-6997")
	void FaxOfRecord1738() {
		assertEquals("508-791-6997", customers.get(1737).getFax());
	}

	@Test
	@DisplayName("Record 1738: Email is alton@rupke.com")
	void EmailOfRecord1738() {
		assertEquals("alton@rupke.com", customers.get(1737).getEmail());
	}

	@Test
	@DisplayName("Record 1738: Web is http://www.altonrupke.com")
	void WebOfRecord1738() {
		assertEquals("http://www.altonrupke.com", customers.get(1737).getWeb());
	}
}
