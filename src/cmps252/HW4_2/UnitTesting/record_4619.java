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
class Record_4619 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4619: FirstName is Edison")
	void FirstNameOfRecord4619() {
		assertEquals("Edison", customers.get(4618).getFirstName());
	}

	@Test
	@DisplayName("Record 4619: LastName is Hemanes")
	void LastNameOfRecord4619() {
		assertEquals("Hemanes", customers.get(4618).getLastName());
	}

	@Test
	@DisplayName("Record 4619: Company is Guida & Associates")
	void CompanyOfRecord4619() {
		assertEquals("Guida & Associates", customers.get(4618).getCompany());
	}

	@Test
	@DisplayName("Record 4619: Address is 77 Lafayette Ave")
	void AddressOfRecord4619() {
		assertEquals("77 Lafayette Ave", customers.get(4618).getAddress());
	}

	@Test
	@DisplayName("Record 4619: City is White Plains")
	void CityOfRecord4619() {
		assertEquals("White Plains", customers.get(4618).getCity());
	}

	@Test
	@DisplayName("Record 4619: County is Westchester")
	void CountyOfRecord4619() {
		assertEquals("Westchester", customers.get(4618).getCounty());
	}

	@Test
	@DisplayName("Record 4619: State is NY")
	void StateOfRecord4619() {
		assertEquals("NY", customers.get(4618).getState());
	}

	@Test
	@DisplayName("Record 4619: ZIP is 10603")
	void ZIPOfRecord4619() {
		assertEquals("10603", customers.get(4618).getZIP());
	}

	@Test
	@DisplayName("Record 4619: Phone is 914-949-2179")
	void PhoneOfRecord4619() {
		assertEquals("914-949-2179", customers.get(4618).getPhone());
	}

	@Test
	@DisplayName("Record 4619: Fax is 914-949-1709")
	void FaxOfRecord4619() {
		assertEquals("914-949-1709", customers.get(4618).getFax());
	}

	@Test
	@DisplayName("Record 4619: Email is edison@hemanes.com")
	void EmailOfRecord4619() {
		assertEquals("edison@hemanes.com", customers.get(4618).getEmail());
	}

	@Test
	@DisplayName("Record 4619: Web is http://www.edisonhemanes.com")
	void WebOfRecord4619() {
		assertEquals("http://www.edisonhemanes.com", customers.get(4618).getWeb());
	}
}
