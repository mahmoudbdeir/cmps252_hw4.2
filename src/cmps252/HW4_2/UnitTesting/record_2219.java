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

@Tag("23")
class Record_2219 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2219: FirstName is Rolando")
	void FirstNameOfRecord2219() {
		assertEquals("Rolando", customers.get(2218).getFirstName());
	}

	@Test
	@DisplayName("Record 2219: LastName is Bonnel")
	void LastNameOfRecord2219() {
		assertEquals("Bonnel", customers.get(2218).getLastName());
	}

	@Test
	@DisplayName("Record 2219: Company is Lagerman, Lars O Esq")
	void CompanyOfRecord2219() {
		assertEquals("Lagerman, Lars O Esq", customers.get(2218).getCompany());
	}

	@Test
	@DisplayName("Record 2219: Address is 875 Main St")
	void AddressOfRecord2219() {
		assertEquals("875 Main St", customers.get(2218).getAddress());
	}

	@Test
	@DisplayName("Record 2219: City is Worcester")
	void CityOfRecord2219() {
		assertEquals("Worcester", customers.get(2218).getCity());
	}

	@Test
	@DisplayName("Record 2219: County is Worcester")
	void CountyOfRecord2219() {
		assertEquals("Worcester", customers.get(2218).getCounty());
	}

	@Test
	@DisplayName("Record 2219: State is MA")
	void StateOfRecord2219() {
		assertEquals("MA", customers.get(2218).getState());
	}

	@Test
	@DisplayName("Record 2219: ZIP is 1610")
	void ZIPOfRecord2219() {
		assertEquals("1610", customers.get(2218).getZIP());
	}

	@Test
	@DisplayName("Record 2219: Phone is 508-791-1489")
	void PhoneOfRecord2219() {
		assertEquals("508-791-1489", customers.get(2218).getPhone());
	}

	@Test
	@DisplayName("Record 2219: Fax is 508-791-2268")
	void FaxOfRecord2219() {
		assertEquals("508-791-2268", customers.get(2218).getFax());
	}

	@Test
	@DisplayName("Record 2219: Email is rolando@bonnel.com")
	void EmailOfRecord2219() {
		assertEquals("rolando@bonnel.com", customers.get(2218).getEmail());
	}

	@Test
	@DisplayName("Record 2219: Web is http://www.rolandobonnel.com")
	void WebOfRecord2219() {
		assertEquals("http://www.rolandobonnel.com", customers.get(2218).getWeb());
	}
}
