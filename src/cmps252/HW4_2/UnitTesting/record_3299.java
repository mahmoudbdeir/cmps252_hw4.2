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

@Tag("46")
class Record_3299 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3299: FirstName is Benny")
	void FirstNameOfRecord3299() {
		assertEquals("Benny", customers.get(3298).getFirstName());
	}

	@Test
	@DisplayName("Record 3299: LastName is Zaffuto")
	void LastNameOfRecord3299() {
		assertEquals("Zaffuto", customers.get(3298).getLastName());
	}

	@Test
	@DisplayName("Record 3299: Company is American Cancer Society")
	void CompanyOfRecord3299() {
		assertEquals("American Cancer Society", customers.get(3298).getCompany());
	}

	@Test
	@DisplayName("Record 3299: Address is 20 Mohawk Dr")
	void AddressOfRecord3299() {
		assertEquals("20 Mohawk Dr", customers.get(3298).getAddress());
	}

	@Test
	@DisplayName("Record 3299: City is Leominster")
	void CityOfRecord3299() {
		assertEquals("Leominster", customers.get(3298).getCity());
	}

	@Test
	@DisplayName("Record 3299: County is Worcester")
	void CountyOfRecord3299() {
		assertEquals("Worcester", customers.get(3298).getCounty());
	}

	@Test
	@DisplayName("Record 3299: State is MA")
	void StateOfRecord3299() {
		assertEquals("MA", customers.get(3298).getState());
	}

	@Test
	@DisplayName("Record 3299: ZIP is 1453")
	void ZIPOfRecord3299() {
		assertEquals("1453", customers.get(3298).getZIP());
	}

	@Test
	@DisplayName("Record 3299: Phone is 978-537-4738")
	void PhoneOfRecord3299() {
		assertEquals("978-537-4738", customers.get(3298).getPhone());
	}

	@Test
	@DisplayName("Record 3299: Fax is 978-537-8155")
	void FaxOfRecord3299() {
		assertEquals("978-537-8155", customers.get(3298).getFax());
	}

	@Test
	@DisplayName("Record 3299: Email is benny@zaffuto.com")
	void EmailOfRecord3299() {
		assertEquals("benny@zaffuto.com", customers.get(3298).getEmail());
	}

	@Test
	@DisplayName("Record 3299: Web is http://www.bennyzaffuto.com")
	void WebOfRecord3299() {
		assertEquals("http://www.bennyzaffuto.com", customers.get(3298).getWeb());
	}
}
