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
class Record_801 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 801: FirstName is Celestine")
	void FirstNameOfRecord801() {
		assertEquals("Celestine", customers.get(800).getFirstName());
	}

	@Test
	@DisplayName("Record 801: LastName is Niederhauser")
	void LastNameOfRecord801() {
		assertEquals("Niederhauser", customers.get(800).getLastName());
	}

	@Test
	@DisplayName("Record 801: Company is M & S Service Co")
	void CompanyOfRecord801() {
		assertEquals("M & S Service Co", customers.get(800).getCompany());
	}

	@Test
	@DisplayName("Record 801: Address is 5395 Old Bethel Rd")
	void AddressOfRecord801() {
		assertEquals("5395 Old Bethel Rd", customers.get(800).getAddress());
	}

	@Test
	@DisplayName("Record 801: City is Crestview")
	void CityOfRecord801() {
		assertEquals("Crestview", customers.get(800).getCity());
	}

	@Test
	@DisplayName("Record 801: County is Okaloosa")
	void CountyOfRecord801() {
		assertEquals("Okaloosa", customers.get(800).getCounty());
	}

	@Test
	@DisplayName("Record 801: State is FL")
	void StateOfRecord801() {
		assertEquals("FL", customers.get(800).getState());
	}

	@Test
	@DisplayName("Record 801: ZIP is 32536")
	void ZIPOfRecord801() {
		assertEquals("32536", customers.get(800).getZIP());
	}

	@Test
	@DisplayName("Record 801: Phone is 850-682-3979")
	void PhoneOfRecord801() {
		assertEquals("850-682-3979", customers.get(800).getPhone());
	}

	@Test
	@DisplayName("Record 801: Fax is 850-682-2275")
	void FaxOfRecord801() {
		assertEquals("850-682-2275", customers.get(800).getFax());
	}

	@Test
	@DisplayName("Record 801: Email is celestine@niederhauser.com")
	void EmailOfRecord801() {
		assertEquals("celestine@niederhauser.com", customers.get(800).getEmail());
	}

	@Test
	@DisplayName("Record 801: Web is http://www.celestineniederhauser.com")
	void WebOfRecord801() {
		assertEquals("http://www.celestineniederhauser.com", customers.get(800).getWeb());
	}
}
