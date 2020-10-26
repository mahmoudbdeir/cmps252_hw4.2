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

@Tag("5")
class Record_1551 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1551: FirstName is Filiberto")
	void FirstNameOfRecord1551() {
		assertEquals("Filiberto", customers.get(1550).getFirstName());
	}

	@Test
	@DisplayName("Record 1551: LastName is Putcha")
	void LastNameOfRecord1551() {
		assertEquals("Putcha", customers.get(1550).getLastName());
	}

	@Test
	@DisplayName("Record 1551: Company is Wgsq 94 7 Fm Country Giant")
	void CompanyOfRecord1551() {
		assertEquals("Wgsq 94 7 Fm Country Giant", customers.get(1550).getCompany());
	}

	@Test
	@DisplayName("Record 1551: Address is 196 Morris Ave")
	void AddressOfRecord1551() {
		assertEquals("196 Morris Ave", customers.get(1550).getAddress());
	}

	@Test
	@DisplayName("Record 1551: City is Providence")
	void CityOfRecord1551() {
		assertEquals("Providence", customers.get(1550).getCity());
	}

	@Test
	@DisplayName("Record 1551: County is Providence")
	void CountyOfRecord1551() {
		assertEquals("Providence", customers.get(1550).getCounty());
	}

	@Test
	@DisplayName("Record 1551: State is RI")
	void StateOfRecord1551() {
		assertEquals("RI", customers.get(1550).getState());
	}

	@Test
	@DisplayName("Record 1551: ZIP is 2906")
	void ZIPOfRecord1551() {
		assertEquals("2906", customers.get(1550).getZIP());
	}

	@Test
	@DisplayName("Record 1551: Phone is 401-331-9652")
	void PhoneOfRecord1551() {
		assertEquals("401-331-9652", customers.get(1550).getPhone());
	}

	@Test
	@DisplayName("Record 1551: Fax is 401-331-0268")
	void FaxOfRecord1551() {
		assertEquals("401-331-0268", customers.get(1550).getFax());
	}

	@Test
	@DisplayName("Record 1551: Email is filiberto@putcha.com")
	void EmailOfRecord1551() {
		assertEquals("filiberto@putcha.com", customers.get(1550).getEmail());
	}

	@Test
	@DisplayName("Record 1551: Web is http://www.filibertoputcha.com")
	void WebOfRecord1551() {
		assertEquals("http://www.filibertoputcha.com", customers.get(1550).getWeb());
	}
}
