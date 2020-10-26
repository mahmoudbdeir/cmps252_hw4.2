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
class Record_422 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 422: FirstName is Byron")
	void FirstNameOfRecord422() {
		assertEquals("Byron", customers.get(421).getFirstName());
	}

	@Test
	@DisplayName("Record 422: LastName is Snyder")
	void LastNameOfRecord422() {
		assertEquals("Snyder", customers.get(421).getLastName());
	}

	@Test
	@DisplayName("Record 422: Company is Lerner, Brad D Md")
	void CompanyOfRecord422() {
		assertEquals("Lerner, Brad D Md", customers.get(421).getCompany());
	}

	@Test
	@DisplayName("Record 422: Address is 2277 High St")
	void AddressOfRecord422() {
		assertEquals("2277 High St", customers.get(421).getAddress());
	}

	@Test
	@DisplayName("Record 422: City is Canon City")
	void CityOfRecord422() {
		assertEquals("Canon City", customers.get(421).getCity());
	}

	@Test
	@DisplayName("Record 422: County is Fremont")
	void CountyOfRecord422() {
		assertEquals("Fremont", customers.get(421).getCounty());
	}

	@Test
	@DisplayName("Record 422: State is CO")
	void StateOfRecord422() {
		assertEquals("CO", customers.get(421).getState());
	}

	@Test
	@DisplayName("Record 422: ZIP is 81212")
	void ZIPOfRecord422() {
		assertEquals("81212", customers.get(421).getZIP());
	}

	@Test
	@DisplayName("Record 422: Phone is 719-275-0740")
	void PhoneOfRecord422() {
		assertEquals("719-275-0740", customers.get(421).getPhone());
	}

	@Test
	@DisplayName("Record 422: Fax is 719-275-7385")
	void FaxOfRecord422() {
		assertEquals("719-275-7385", customers.get(421).getFax());
	}

	@Test
	@DisplayName("Record 422: Email is byron@snyder.com")
	void EmailOfRecord422() {
		assertEquals("byron@snyder.com", customers.get(421).getEmail());
	}

	@Test
	@DisplayName("Record 422: Web is http://www.byronsnyder.com")
	void WebOfRecord422() {
		assertEquals("http://www.byronsnyder.com", customers.get(421).getWeb());
	}
}
