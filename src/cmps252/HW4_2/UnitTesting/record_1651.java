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
class Record_1651 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1651: FirstName is Luann")
	void FirstNameOfRecord1651() {
		assertEquals("Luann", customers.get(1650).getFirstName());
	}

	@Test
	@DisplayName("Record 1651: LastName is Branner")
	void LastNameOfRecord1651() {
		assertEquals("Branner", customers.get(1650).getLastName());
	}

	@Test
	@DisplayName("Record 1651: Company is Fence City")
	void CompanyOfRecord1651() {
		assertEquals("Fence City", customers.get(1650).getCompany());
	}

	@Test
	@DisplayName("Record 1651: Address is 606 S Main St")
	void AddressOfRecord1651() {
		assertEquals("606 S Main St", customers.get(1650).getAddress());
	}

	@Test
	@DisplayName("Record 1651: City is Phoenixville")
	void CityOfRecord1651() {
		assertEquals("Phoenixville", customers.get(1650).getCity());
	}

	@Test
	@DisplayName("Record 1651: County is Chester")
	void CountyOfRecord1651() {
		assertEquals("Chester", customers.get(1650).getCounty());
	}

	@Test
	@DisplayName("Record 1651: State is PA")
	void StateOfRecord1651() {
		assertEquals("PA", customers.get(1650).getState());
	}

	@Test
	@DisplayName("Record 1651: ZIP is 19460")
	void ZIPOfRecord1651() {
		assertEquals("19460", customers.get(1650).getZIP());
	}

	@Test
	@DisplayName("Record 1651: Phone is 610-435-9475")
	void PhoneOfRecord1651() {
		assertEquals("610-435-9475", customers.get(1650).getPhone());
	}

	@Test
	@DisplayName("Record 1651: Fax is 610-435-0002")
	void FaxOfRecord1651() {
		assertEquals("610-435-0002", customers.get(1650).getFax());
	}

	@Test
	@DisplayName("Record 1651: Email is luann@branner.com")
	void EmailOfRecord1651() {
		assertEquals("luann@branner.com", customers.get(1650).getEmail());
	}

	@Test
	@DisplayName("Record 1651: Web is http://www.luannbranner.com")
	void WebOfRecord1651() {
		assertEquals("http://www.luannbranner.com", customers.get(1650).getWeb());
	}
}
