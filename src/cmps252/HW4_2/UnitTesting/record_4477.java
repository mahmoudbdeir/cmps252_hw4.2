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

@Tag("14")
class Record_4477 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4477: FirstName is Bianca")
	void FirstNameOfRecord4477() {
		assertEquals("Bianca", customers.get(4476).getFirstName());
	}

	@Test
	@DisplayName("Record 4477: LastName is Doughty")
	void LastNameOfRecord4477() {
		assertEquals("Doughty", customers.get(4476).getLastName());
	}

	@Test
	@DisplayName("Record 4477: Company is Minnesota Maintenance Supl Co")
	void CompanyOfRecord4477() {
		assertEquals("Minnesota Maintenance Supl Co", customers.get(4476).getCompany());
	}

	@Test
	@DisplayName("Record 4477: Address is 5424 Bridge St")
	void AddressOfRecord4477() {
		assertEquals("5424 Bridge St", customers.get(4476).getAddress());
	}

	@Test
	@DisplayName("Record 4477: City is Roscoe")
	void CityOfRecord4477() {
		assertEquals("Roscoe", customers.get(4476).getCity());
	}

	@Test
	@DisplayName("Record 4477: County is Winnebago")
	void CountyOfRecord4477() {
		assertEquals("Winnebago", customers.get(4476).getCounty());
	}

	@Test
	@DisplayName("Record 4477: State is IL")
	void StateOfRecord4477() {
		assertEquals("IL", customers.get(4476).getState());
	}

	@Test
	@DisplayName("Record 4477: ZIP is 61073")
	void ZIPOfRecord4477() {
		assertEquals("61073", customers.get(4476).getZIP());
	}

	@Test
	@DisplayName("Record 4477: Phone is 815-623-8820")
	void PhoneOfRecord4477() {
		assertEquals("815-623-8820", customers.get(4476).getPhone());
	}

	@Test
	@DisplayName("Record 4477: Fax is 815-623-9245")
	void FaxOfRecord4477() {
		assertEquals("815-623-9245", customers.get(4476).getFax());
	}

	@Test
	@DisplayName("Record 4477: Email is bianca@doughty.com")
	void EmailOfRecord4477() {
		assertEquals("bianca@doughty.com", customers.get(4476).getEmail());
	}

	@Test
	@DisplayName("Record 4477: Web is http://www.biancadoughty.com")
	void WebOfRecord4477() {
		assertEquals("http://www.biancadoughty.com", customers.get(4476).getWeb());
	}
}
