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

@Tag("24")
class Record_4324 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4324: FirstName is Claudette")
	void FirstNameOfRecord4324() {
		assertEquals("Claudette", customers.get(4323).getFirstName());
	}

	@Test
	@DisplayName("Record 4324: LastName is Hernon")
	void LastNameOfRecord4324() {
		assertEquals("Hernon", customers.get(4323).getLastName());
	}

	@Test
	@DisplayName("Record 4324: Company is M Renken Distributing")
	void CompanyOfRecord4324() {
		assertEquals("M Renken Distributing", customers.get(4323).getCompany());
	}

	@Test
	@DisplayName("Record 4324: Address is 3083 Holme Ave")
	void AddressOfRecord4324() {
		assertEquals("3083 Holme Ave", customers.get(4323).getAddress());
	}

	@Test
	@DisplayName("Record 4324: City is Philadelphia")
	void CityOfRecord4324() {
		assertEquals("Philadelphia", customers.get(4323).getCity());
	}

	@Test
	@DisplayName("Record 4324: County is Philadelphia")
	void CountyOfRecord4324() {
		assertEquals("Philadelphia", customers.get(4323).getCounty());
	}

	@Test
	@DisplayName("Record 4324: State is PA")
	void StateOfRecord4324() {
		assertEquals("PA", customers.get(4323).getState());
	}

	@Test
	@DisplayName("Record 4324: ZIP is 19136")
	void ZIPOfRecord4324() {
		assertEquals("19136", customers.get(4323).getZIP());
	}

	@Test
	@DisplayName("Record 4324: Phone is 215-673-3594")
	void PhoneOfRecord4324() {
		assertEquals("215-673-3594", customers.get(4323).getPhone());
	}

	@Test
	@DisplayName("Record 4324: Fax is 215-673-0366")
	void FaxOfRecord4324() {
		assertEquals("215-673-0366", customers.get(4323).getFax());
	}

	@Test
	@DisplayName("Record 4324: Email is claudette@hernon.com")
	void EmailOfRecord4324() {
		assertEquals("claudette@hernon.com", customers.get(4323).getEmail());
	}

	@Test
	@DisplayName("Record 4324: Web is http://www.claudettehernon.com")
	void WebOfRecord4324() {
		assertEquals("http://www.claudettehernon.com", customers.get(4323).getWeb());
	}
}
