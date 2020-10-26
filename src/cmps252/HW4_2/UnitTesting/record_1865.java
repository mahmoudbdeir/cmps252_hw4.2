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

@Tag("32")
class Record_1865 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1865: FirstName is Phillip")
	void FirstNameOfRecord1865() {
		assertEquals("Phillip", customers.get(1864).getFirstName());
	}

	@Test
	@DisplayName("Record 1865: LastName is Bidner")
	void LastNameOfRecord1865() {
		assertEquals("Bidner", customers.get(1864).getLastName());
	}

	@Test
	@DisplayName("Record 1865: Company is Stewart, John T Esq")
	void CompanyOfRecord1865() {
		assertEquals("Stewart, John T Esq", customers.get(1864).getCompany());
	}

	@Test
	@DisplayName("Record 1865: Address is 19919 Shawnee Mission Pky")
	void AddressOfRecord1865() {
		assertEquals("19919 Shawnee Mission Pky", customers.get(1864).getAddress());
	}

	@Test
	@DisplayName("Record 1865: City is Shawnee")
	void CityOfRecord1865() {
		assertEquals("Shawnee", customers.get(1864).getCity());
	}

	@Test
	@DisplayName("Record 1865: County is Johnson")
	void CountyOfRecord1865() {
		assertEquals("Johnson", customers.get(1864).getCounty());
	}

	@Test
	@DisplayName("Record 1865: State is KS")
	void StateOfRecord1865() {
		assertEquals("KS", customers.get(1864).getState());
	}

	@Test
	@DisplayName("Record 1865: ZIP is 66218")
	void ZIPOfRecord1865() {
		assertEquals("66218", customers.get(1864).getZIP());
	}

	@Test
	@DisplayName("Record 1865: Phone is 913-441-7608")
	void PhoneOfRecord1865() {
		assertEquals("913-441-7608", customers.get(1864).getPhone());
	}

	@Test
	@DisplayName("Record 1865: Fax is 913-441-1685")
	void FaxOfRecord1865() {
		assertEquals("913-441-1685", customers.get(1864).getFax());
	}

	@Test
	@DisplayName("Record 1865: Email is phillip@bidner.com")
	void EmailOfRecord1865() {
		assertEquals("phillip@bidner.com", customers.get(1864).getEmail());
	}

	@Test
	@DisplayName("Record 1865: Web is http://www.phillipbidner.com")
	void WebOfRecord1865() {
		assertEquals("http://www.phillipbidner.com", customers.get(1864).getWeb());
	}
}
