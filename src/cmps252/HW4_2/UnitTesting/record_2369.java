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

@Tag("4")
class Record_2369 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2369: FirstName is Wilfred")
	void FirstNameOfRecord2369() {
		assertEquals("Wilfred", customers.get(2368).getFirstName());
	}

	@Test
	@DisplayName("Record 2369: LastName is Kulakowski")
	void LastNameOfRecord2369() {
		assertEquals("Kulakowski", customers.get(2368).getLastName());
	}

	@Test
	@DisplayName("Record 2369: Company is Dave Mcgillivray Sports Ent")
	void CompanyOfRecord2369() {
		assertEquals("Dave Mcgillivray Sports Ent", customers.get(2368).getCompany());
	}

	@Test
	@DisplayName("Record 2369: Address is 5217 Beech St")
	void AddressOfRecord2369() {
		assertEquals("5217 Beech St", customers.get(2368).getAddress());
	}

	@Test
	@DisplayName("Record 2369: City is Cincinnati")
	void CityOfRecord2369() {
		assertEquals("Cincinnati", customers.get(2368).getCity());
	}

	@Test
	@DisplayName("Record 2369: County is Hamilton")
	void CountyOfRecord2369() {
		assertEquals("Hamilton", customers.get(2368).getCounty());
	}

	@Test
	@DisplayName("Record 2369: State is OH")
	void StateOfRecord2369() {
		assertEquals("OH", customers.get(2368).getState());
	}

	@Test
	@DisplayName("Record 2369: ZIP is 45217")
	void ZIPOfRecord2369() {
		assertEquals("45217", customers.get(2368).getZIP());
	}

	@Test
	@DisplayName("Record 2369: Phone is 513-242-8206")
	void PhoneOfRecord2369() {
		assertEquals("513-242-8206", customers.get(2368).getPhone());
	}

	@Test
	@DisplayName("Record 2369: Fax is 513-242-9968")
	void FaxOfRecord2369() {
		assertEquals("513-242-9968", customers.get(2368).getFax());
	}

	@Test
	@DisplayName("Record 2369: Email is wilfred@kulakowski.com")
	void EmailOfRecord2369() {
		assertEquals("wilfred@kulakowski.com", customers.get(2368).getEmail());
	}

	@Test
	@DisplayName("Record 2369: Web is http://www.wilfredkulakowski.com")
	void WebOfRecord2369() {
		assertEquals("http://www.wilfredkulakowski.com", customers.get(2368).getWeb());
	}
}
