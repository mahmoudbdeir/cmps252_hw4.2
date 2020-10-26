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

@Tag("40")
class Record_4826 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4826: FirstName is Adelaide")
	void FirstNameOfRecord4826() {
		assertEquals("Adelaide", customers.get(4825).getFirstName());
	}

	@Test
	@DisplayName("Record 4826: LastName is Midyett")
	void LastNameOfRecord4826() {
		assertEquals("Midyett", customers.get(4825).getLastName());
	}

	@Test
	@DisplayName("Record 4826: Company is Pro Log Corp")
	void CompanyOfRecord4826() {
		assertEquals("Pro Log Corp", customers.get(4825).getCompany());
	}

	@Test
	@DisplayName("Record 4826: Address is 1455 S State St  #-c")
	void AddressOfRecord4826() {
		assertEquals("1455 S State St  #-c", customers.get(4825).getAddress());
	}

	@Test
	@DisplayName("Record 4826: City is Provo")
	void CityOfRecord4826() {
		assertEquals("Provo", customers.get(4825).getCity());
	}

	@Test
	@DisplayName("Record 4826: County is Utah")
	void CountyOfRecord4826() {
		assertEquals("Utah", customers.get(4825).getCounty());
	}

	@Test
	@DisplayName("Record 4826: State is UT")
	void StateOfRecord4826() {
		assertEquals("UT", customers.get(4825).getState());
	}

	@Test
	@DisplayName("Record 4826: ZIP is 84606")
	void ZIPOfRecord4826() {
		assertEquals("84606", customers.get(4825).getZIP());
	}

	@Test
	@DisplayName("Record 4826: Phone is 801-221-8236")
	void PhoneOfRecord4826() {
		assertEquals("801-221-8236", customers.get(4825).getPhone());
	}

	@Test
	@DisplayName("Record 4826: Fax is 801-221-4718")
	void FaxOfRecord4826() {
		assertEquals("801-221-4718", customers.get(4825).getFax());
	}

	@Test
	@DisplayName("Record 4826: Email is adelaide@midyett.com")
	void EmailOfRecord4826() {
		assertEquals("adelaide@midyett.com", customers.get(4825).getEmail());
	}

	@Test
	@DisplayName("Record 4826: Web is http://www.adelaidemidyett.com")
	void WebOfRecord4826() {
		assertEquals("http://www.adelaidemidyett.com", customers.get(4825).getWeb());
	}
}
