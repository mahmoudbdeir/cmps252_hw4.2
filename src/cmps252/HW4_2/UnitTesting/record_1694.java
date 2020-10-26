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

@Tag("20")
class Record_1694 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1694: FirstName is Maurice")
	void FirstNameOfRecord1694() {
		assertEquals("Maurice", customers.get(1693).getFirstName());
	}

	@Test
	@DisplayName("Record 1694: LastName is Slape")
	void LastNameOfRecord1694() {
		assertEquals("Slape", customers.get(1693).getLastName());
	}

	@Test
	@DisplayName("Record 1694: Company is A Personal Secretary Inc")
	void CompanyOfRecord1694() {
		assertEquals("A Personal Secretary Inc", customers.get(1693).getCompany());
	}

	@Test
	@DisplayName("Record 1694: Address is 4578 Brazil St")
	void AddressOfRecord1694() {
		assertEquals("4578 Brazil St", customers.get(1693).getAddress());
	}

	@Test
	@DisplayName("Record 1694: City is Los Angeles")
	void CityOfRecord1694() {
		assertEquals("Los Angeles", customers.get(1693).getCity());
	}

	@Test
	@DisplayName("Record 1694: County is Los Angeles")
	void CountyOfRecord1694() {
		assertEquals("Los Angeles", customers.get(1693).getCounty());
	}

	@Test
	@DisplayName("Record 1694: State is CA")
	void StateOfRecord1694() {
		assertEquals("CA", customers.get(1693).getState());
	}

	@Test
	@DisplayName("Record 1694: ZIP is 90039")
	void ZIPOfRecord1694() {
		assertEquals("90039", customers.get(1693).getZIP());
	}

	@Test
	@DisplayName("Record 1694: Phone is 323-242-8901")
	void PhoneOfRecord1694() {
		assertEquals("323-242-8901", customers.get(1693).getPhone());
	}

	@Test
	@DisplayName("Record 1694: Fax is 323-242-1521")
	void FaxOfRecord1694() {
		assertEquals("323-242-1521", customers.get(1693).getFax());
	}

	@Test
	@DisplayName("Record 1694: Email is maurice@slape.com")
	void EmailOfRecord1694() {
		assertEquals("maurice@slape.com", customers.get(1693).getEmail());
	}

	@Test
	@DisplayName("Record 1694: Web is http://www.mauriceslape.com")
	void WebOfRecord1694() {
		assertEquals("http://www.mauriceslape.com", customers.get(1693).getWeb());
	}
}
