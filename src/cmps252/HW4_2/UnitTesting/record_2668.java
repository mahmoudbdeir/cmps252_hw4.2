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

@Tag("17")
class Record_2668 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2668: FirstName is Esther")
	void FirstNameOfRecord2668() {
		assertEquals("Esther", customers.get(2667).getFirstName());
	}

	@Test
	@DisplayName("Record 2668: LastName is Deere")
	void LastNameOfRecord2668() {
		assertEquals("Deere", customers.get(2667).getLastName());
	}

	@Test
	@DisplayName("Record 2668: Company is Coatesville Flower Shop")
	void CompanyOfRecord2668() {
		assertEquals("Coatesville Flower Shop", customers.get(2667).getCompany());
	}

	@Test
	@DisplayName("Record 2668: Address is 399 Liberty St")
	void AddressOfRecord2668() {
		assertEquals("399 Liberty St", customers.get(2667).getAddress());
	}

	@Test
	@DisplayName("Record 2668: City is Springfield")
	void CityOfRecord2668() {
		assertEquals("Springfield", customers.get(2667).getCity());
	}

	@Test
	@DisplayName("Record 2668: County is Hampden")
	void CountyOfRecord2668() {
		assertEquals("Hampden", customers.get(2667).getCounty());
	}

	@Test
	@DisplayName("Record 2668: State is MA")
	void StateOfRecord2668() {
		assertEquals("MA", customers.get(2667).getState());
	}

	@Test
	@DisplayName("Record 2668: ZIP is 1104")
	void ZIPOfRecord2668() {
		assertEquals("1104", customers.get(2667).getZIP());
	}

	@Test
	@DisplayName("Record 2668: Phone is 413-734-5838")
	void PhoneOfRecord2668() {
		assertEquals("413-734-5838", customers.get(2667).getPhone());
	}

	@Test
	@DisplayName("Record 2668: Fax is 413-734-0328")
	void FaxOfRecord2668() {
		assertEquals("413-734-0328", customers.get(2667).getFax());
	}

	@Test
	@DisplayName("Record 2668: Email is esther@deere.com")
	void EmailOfRecord2668() {
		assertEquals("esther@deere.com", customers.get(2667).getEmail());
	}

	@Test
	@DisplayName("Record 2668: Web is http://www.estherdeere.com")
	void WebOfRecord2668() {
		assertEquals("http://www.estherdeere.com", customers.get(2667).getWeb());
	}
}
