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
class Record_1679 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1679: FirstName is Robert")
	void FirstNameOfRecord1679() {
		assertEquals("Robert", customers.get(1678).getFirstName());
	}

	@Test
	@DisplayName("Record 1679: LastName is Lourence")
	void LastNameOfRecord1679() {
		assertEquals("Lourence", customers.get(1678).getLastName());
	}

	@Test
	@DisplayName("Record 1679: Company is Thomas, Louise K Esq")
	void CompanyOfRecord1679() {
		assertEquals("Thomas, Louise K Esq", customers.get(1678).getCompany());
	}

	@Test
	@DisplayName("Record 1679: Address is 300 Welsh Rd")
	void AddressOfRecord1679() {
		assertEquals("300 Welsh Rd", customers.get(1678).getAddress());
	}

	@Test
	@DisplayName("Record 1679: City is Horsham")
	void CityOfRecord1679() {
		assertEquals("Horsham", customers.get(1678).getCity());
	}

	@Test
	@DisplayName("Record 1679: County is Montgomery")
	void CountyOfRecord1679() {
		assertEquals("Montgomery", customers.get(1678).getCounty());
	}

	@Test
	@DisplayName("Record 1679: State is PA")
	void StateOfRecord1679() {
		assertEquals("PA", customers.get(1678).getState());
	}

	@Test
	@DisplayName("Record 1679: ZIP is 19044")
	void ZIPOfRecord1679() {
		assertEquals("19044", customers.get(1678).getZIP());
	}

	@Test
	@DisplayName("Record 1679: Phone is 215-659-9188")
	void PhoneOfRecord1679() {
		assertEquals("215-659-9188", customers.get(1678).getPhone());
	}

	@Test
	@DisplayName("Record 1679: Fax is 215-659-4836")
	void FaxOfRecord1679() {
		assertEquals("215-659-4836", customers.get(1678).getFax());
	}

	@Test
	@DisplayName("Record 1679: Email is robert@lourence.com")
	void EmailOfRecord1679() {
		assertEquals("robert@lourence.com", customers.get(1678).getEmail());
	}

	@Test
	@DisplayName("Record 1679: Web is http://www.robertlourence.com")
	void WebOfRecord1679() {
		assertEquals("http://www.robertlourence.com", customers.get(1678).getWeb());
	}
}
