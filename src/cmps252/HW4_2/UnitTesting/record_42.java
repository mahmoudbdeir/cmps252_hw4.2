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

@Tag("49")
class Record_42 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 42: FirstName is Kristopher")
	void FirstNameOfRecord42() {
		assertEquals("Kristopher", customers.get(41).getFirstName());
	}

	@Test
	@DisplayName("Record 42: LastName is Hatteyer")
	void LastNameOfRecord42() {
		assertEquals("Hatteyer", customers.get(41).getLastName());
	}

	@Test
	@DisplayName("Record 42: Company is Genie Personnel Services Inc")
	void CompanyOfRecord42() {
		assertEquals("Genie Personnel Services Inc", customers.get(41).getCompany());
	}

	@Test
	@DisplayName("Record 42: Address is 105 Riverdale Rd")
	void AddressOfRecord42() {
		assertEquals("105 Riverdale Rd", customers.get(41).getAddress());
	}

	@Test
	@DisplayName("Record 42: City is Riverdale")
	void CityOfRecord42() {
		assertEquals("Riverdale", customers.get(41).getCity());
	}

	@Test
	@DisplayName("Record 42: County is Morris")
	void CountyOfRecord42() {
		assertEquals("Morris", customers.get(41).getCounty());
	}

	@Test
	@DisplayName("Record 42: State is NJ")
	void StateOfRecord42() {
		assertEquals("NJ", customers.get(41).getState());
	}

	@Test
	@DisplayName("Record 42: ZIP is 7457")
	void ZIPOfRecord42() {
		assertEquals("7457", customers.get(41).getZIP());
	}

	@Test
	@DisplayName("Record 42: Phone is 973-835-6472")
	void PhoneOfRecord42() {
		assertEquals("973-835-6472", customers.get(41).getPhone());
	}

	@Test
	@DisplayName("Record 42: Fax is 973-835-5645")
	void FaxOfRecord42() {
		assertEquals("973-835-5645", customers.get(41).getFax());
	}

	@Test
	@DisplayName("Record 42: Email is kristopher@hatteyer.com")
	void EmailOfRecord42() {
		assertEquals("kristopher@hatteyer.com", customers.get(41).getEmail());
	}

	@Test
	@DisplayName("Record 42: Web is http://www.kristopherhatteyer.com")
	void WebOfRecord42() {
		assertEquals("http://www.kristopherhatteyer.com", customers.get(41).getWeb());
	}
}
