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

@Tag("26")
class Record_4871 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4871: FirstName is Adan")
	void FirstNameOfRecord4871() {
		assertEquals("Adan", customers.get(4870).getFirstName());
	}

	@Test
	@DisplayName("Record 4871: LastName is Minihan")
	void LastNameOfRecord4871() {
		assertEquals("Minihan", customers.get(4870).getLastName());
	}

	@Test
	@DisplayName("Record 4871: Company is Beneficent House")
	void CompanyOfRecord4871() {
		assertEquals("Beneficent House", customers.get(4870).getCompany());
	}

	@Test
	@DisplayName("Record 4871: Address is 333 Market St")
	void AddressOfRecord4871() {
		assertEquals("333 Market St", customers.get(4870).getAddress());
	}

	@Test
	@DisplayName("Record 4871: City is San Francisco")
	void CityOfRecord4871() {
		assertEquals("San Francisco", customers.get(4870).getCity());
	}

	@Test
	@DisplayName("Record 4871: County is San Francisco")
	void CountyOfRecord4871() {
		assertEquals("San Francisco", customers.get(4870).getCounty());
	}

	@Test
	@DisplayName("Record 4871: State is CA")
	void StateOfRecord4871() {
		assertEquals("CA", customers.get(4870).getState());
	}

	@Test
	@DisplayName("Record 4871: ZIP is 94105")
	void ZIPOfRecord4871() {
		assertEquals("94105", customers.get(4870).getZIP());
	}

	@Test
	@DisplayName("Record 4871: Phone is 415-541-7324")
	void PhoneOfRecord4871() {
		assertEquals("415-541-7324", customers.get(4870).getPhone());
	}

	@Test
	@DisplayName("Record 4871: Fax is 415-541-8889")
	void FaxOfRecord4871() {
		assertEquals("415-541-8889", customers.get(4870).getFax());
	}

	@Test
	@DisplayName("Record 4871: Email is adan@minihan.com")
	void EmailOfRecord4871() {
		assertEquals("adan@minihan.com", customers.get(4870).getEmail());
	}

	@Test
	@DisplayName("Record 4871: Web is http://www.adanminihan.com")
	void WebOfRecord4871() {
		assertEquals("http://www.adanminihan.com", customers.get(4870).getWeb());
	}
}
