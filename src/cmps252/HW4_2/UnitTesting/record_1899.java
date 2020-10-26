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

@Tag("31")
class Record_1899 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1899: FirstName is Demetria")
	void FirstNameOfRecord1899() {
		assertEquals("Demetria", customers.get(1898).getFirstName());
	}

	@Test
	@DisplayName("Record 1899: LastName is Clemenson")
	void LastNameOfRecord1899() {
		assertEquals("Clemenson", customers.get(1898).getLastName());
	}

	@Test
	@DisplayName("Record 1899: Company is Uniforce Temp Svcs")
	void CompanyOfRecord1899() {
		assertEquals("Uniforce Temp Svcs", customers.get(1898).getCompany());
	}

	@Test
	@DisplayName("Record 1899: Address is 500 Hanover Pike")
	void AddressOfRecord1899() {
		assertEquals("500 Hanover Pike", customers.get(1898).getAddress());
	}

	@Test
	@DisplayName("Record 1899: City is Hampstead")
	void CityOfRecord1899() {
		assertEquals("Hampstead", customers.get(1898).getCity());
	}

	@Test
	@DisplayName("Record 1899: County is Carroll")
	void CountyOfRecord1899() {
		assertEquals("Carroll", customers.get(1898).getCounty());
	}

	@Test
	@DisplayName("Record 1899: State is MD")
	void StateOfRecord1899() {
		assertEquals("MD", customers.get(1898).getState());
	}

	@Test
	@DisplayName("Record 1899: ZIP is 21074")
	void ZIPOfRecord1899() {
		assertEquals("21074", customers.get(1898).getZIP());
	}

	@Test
	@DisplayName("Record 1899: Phone is 410-239-4274")
	void PhoneOfRecord1899() {
		assertEquals("410-239-4274", customers.get(1898).getPhone());
	}

	@Test
	@DisplayName("Record 1899: Fax is 410-239-7382")
	void FaxOfRecord1899() {
		assertEquals("410-239-7382", customers.get(1898).getFax());
	}

	@Test
	@DisplayName("Record 1899: Email is demetria@clemenson.com")
	void EmailOfRecord1899() {
		assertEquals("demetria@clemenson.com", customers.get(1898).getEmail());
	}

	@Test
	@DisplayName("Record 1899: Web is http://www.demetriaclemenson.com")
	void WebOfRecord1899() {
		assertEquals("http://www.demetriaclemenson.com", customers.get(1898).getWeb());
	}
}
