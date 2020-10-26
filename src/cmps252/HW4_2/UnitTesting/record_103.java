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
class Record_103 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 103: FirstName is David")
	void FirstNameOfRecord103() {
		assertEquals("David", customers.get(102).getFirstName());
	}

	@Test
	@DisplayName("Record 103: LastName is Cressy")
	void LastNameOfRecord103() {
		assertEquals("Cressy", customers.get(102).getLastName());
	}

	@Test
	@DisplayName("Record 103: Company is William D Ryals Pc")
	void CompanyOfRecord103() {
		assertEquals("William D Ryals Pc", customers.get(102).getCompany());
	}

	@Test
	@DisplayName("Record 103: Address is 2813 S Macarthur Dr")
	void AddressOfRecord103() {
		assertEquals("2813 S Macarthur Dr", customers.get(102).getAddress());
	}

	@Test
	@DisplayName("Record 103: City is Alexandria")
	void CityOfRecord103() {
		assertEquals("Alexandria", customers.get(102).getCity());
	}

	@Test
	@DisplayName("Record 103: County is Rapides")
	void CountyOfRecord103() {
		assertEquals("Rapides", customers.get(102).getCounty());
	}

	@Test
	@DisplayName("Record 103: State is LA")
	void StateOfRecord103() {
		assertEquals("LA", customers.get(102).getState());
	}

	@Test
	@DisplayName("Record 103: ZIP is 71301")
	void ZIPOfRecord103() {
		assertEquals("71301", customers.get(102).getZIP());
	}

	@Test
	@DisplayName("Record 103: Phone is 318-487-3817")
	void PhoneOfRecord103() {
		assertEquals("318-487-3817", customers.get(102).getPhone());
	}

	@Test
	@DisplayName("Record 103: Fax is 318-487-3058")
	void FaxOfRecord103() {
		assertEquals("318-487-3058", customers.get(102).getFax());
	}

	@Test
	@DisplayName("Record 103: Email is david@cressy.com")
	void EmailOfRecord103() {
		assertEquals("david@cressy.com", customers.get(102).getEmail());
	}

	@Test
	@DisplayName("Record 103: Web is http://www.davidcressy.com")
	void WebOfRecord103() {
		assertEquals("http://www.davidcressy.com", customers.get(102).getWeb());
	}
}
