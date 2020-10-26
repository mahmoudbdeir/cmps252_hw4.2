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

@Tag("30")
class Record_1903 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1903: FirstName is Yvette")
	void FirstNameOfRecord1903() {
		assertEquals("Yvette", customers.get(1902).getFirstName());
	}

	@Test
	@DisplayName("Record 1903: LastName is Koinzan")
	void LastNameOfRecord1903() {
		assertEquals("Koinzan", customers.get(1902).getLastName());
	}

	@Test
	@DisplayName("Record 1903: Company is Kluck Nursery Inc")
	void CompanyOfRecord1903() {
		assertEquals("Kluck Nursery Inc", customers.get(1902).getCompany());
	}

	@Test
	@DisplayName("Record 1903: Address is 225 Brockway Rd")
	void AddressOfRecord1903() {
		assertEquals("225 Brockway Rd", customers.get(1902).getAddress());
	}

	@Test
	@DisplayName("Record 1903: City is Yale")
	void CityOfRecord1903() {
		assertEquals("Yale", customers.get(1902).getCity());
	}

	@Test
	@DisplayName("Record 1903: County is Saint Clair")
	void CountyOfRecord1903() {
		assertEquals("Saint Clair", customers.get(1902).getCounty());
	}

	@Test
	@DisplayName("Record 1903: State is MI")
	void StateOfRecord1903() {
		assertEquals("MI", customers.get(1902).getState());
	}

	@Test
	@DisplayName("Record 1903: ZIP is 48097")
	void ZIPOfRecord1903() {
		assertEquals("48097", customers.get(1902).getZIP());
	}

	@Test
	@DisplayName("Record 1903: Phone is 810-387-5219")
	void PhoneOfRecord1903() {
		assertEquals("810-387-5219", customers.get(1902).getPhone());
	}

	@Test
	@DisplayName("Record 1903: Fax is 810-387-2011")
	void FaxOfRecord1903() {
		assertEquals("810-387-2011", customers.get(1902).getFax());
	}

	@Test
	@DisplayName("Record 1903: Email is yvette@koinzan.com")
	void EmailOfRecord1903() {
		assertEquals("yvette@koinzan.com", customers.get(1902).getEmail());
	}

	@Test
	@DisplayName("Record 1903: Web is http://www.yvettekoinzan.com")
	void WebOfRecord1903() {
		assertEquals("http://www.yvettekoinzan.com", customers.get(1902).getWeb());
	}
}
