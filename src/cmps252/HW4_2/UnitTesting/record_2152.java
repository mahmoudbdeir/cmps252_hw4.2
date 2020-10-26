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

@Tag("7")
class Record_2152 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2152: FirstName is Jessica")
	void FirstNameOfRecord2152() {
		assertEquals("Jessica", customers.get(2151).getFirstName());
	}

	@Test
	@DisplayName("Record 2152: LastName is Sarlinas")
	void LastNameOfRecord2152() {
		assertEquals("Sarlinas", customers.get(2151).getLastName());
	}

	@Test
	@DisplayName("Record 2152: Company is Trophy Shoppe")
	void CompanyOfRecord2152() {
		assertEquals("Trophy Shoppe", customers.get(2151).getCompany());
	}

	@Test
	@DisplayName("Record 2152: Address is 20875 Highway 1")
	void AddressOfRecord2152() {
		assertEquals("20875 Highway 1", customers.get(2151).getAddress());
	}

	@Test
	@DisplayName("Record 2152: City is Golden Meadow")
	void CityOfRecord2152() {
		assertEquals("Golden Meadow", customers.get(2151).getCity());
	}

	@Test
	@DisplayName("Record 2152: County is Lafourche")
	void CountyOfRecord2152() {
		assertEquals("Lafourche", customers.get(2151).getCounty());
	}

	@Test
	@DisplayName("Record 2152: State is LA")
	void StateOfRecord2152() {
		assertEquals("LA", customers.get(2151).getState());
	}

	@Test
	@DisplayName("Record 2152: ZIP is 70357")
	void ZIPOfRecord2152() {
		assertEquals("70357", customers.get(2151).getZIP());
	}

	@Test
	@DisplayName("Record 2152: Phone is 985-475-6525")
	void PhoneOfRecord2152() {
		assertEquals("985-475-6525", customers.get(2151).getPhone());
	}

	@Test
	@DisplayName("Record 2152: Fax is 985-475-6699")
	void FaxOfRecord2152() {
		assertEquals("985-475-6699", customers.get(2151).getFax());
	}

	@Test
	@DisplayName("Record 2152: Email is jessica@sarlinas.com")
	void EmailOfRecord2152() {
		assertEquals("jessica@sarlinas.com", customers.get(2151).getEmail());
	}

	@Test
	@DisplayName("Record 2152: Web is http://www.jessicasarlinas.com")
	void WebOfRecord2152() {
		assertEquals("http://www.jessicasarlinas.com", customers.get(2151).getWeb());
	}
}
