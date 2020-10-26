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
class Record_2226 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2226: FirstName is Ericka")
	void FirstNameOfRecord2226() {
		assertEquals("Ericka", customers.get(2225).getFirstName());
	}

	@Test
	@DisplayName("Record 2226: LastName is Yacono")
	void LastNameOfRecord2226() {
		assertEquals("Yacono", customers.get(2225).getLastName());
	}

	@Test
	@DisplayName("Record 2226: Company is Stamp, David W Esq")
	void CompanyOfRecord2226() {
		assertEquals("Stamp, David W Esq", customers.get(2225).getCompany());
	}

	@Test
	@DisplayName("Record 2226: Address is Main Dr")
	void AddressOfRecord2226() {
		assertEquals("Main Dr", customers.get(2225).getAddress());
	}

	@Test
	@DisplayName("Record 2226: City is Newport News")
	void CityOfRecord2226() {
		assertEquals("Newport News", customers.get(2225).getCity());
	}

	@Test
	@DisplayName("Record 2226: County is Newport News City")
	void CountyOfRecord2226() {
		assertEquals("Newport News City", customers.get(2225).getCounty());
	}

	@Test
	@DisplayName("Record 2226: State is VA")
	void StateOfRecord2226() {
		assertEquals("VA", customers.get(2225).getState());
	}

	@Test
	@DisplayName("Record 2226: ZIP is 23606")
	void ZIPOfRecord2226() {
		assertEquals("23606", customers.get(2225).getZIP());
	}

	@Test
	@DisplayName("Record 2226: Phone is 757-873-1209")
	void PhoneOfRecord2226() {
		assertEquals("757-873-1209", customers.get(2225).getPhone());
	}

	@Test
	@DisplayName("Record 2226: Fax is 757-873-7341")
	void FaxOfRecord2226() {
		assertEquals("757-873-7341", customers.get(2225).getFax());
	}

	@Test
	@DisplayName("Record 2226: Email is ericka@yacono.com")
	void EmailOfRecord2226() {
		assertEquals("ericka@yacono.com", customers.get(2225).getEmail());
	}

	@Test
	@DisplayName("Record 2226: Web is http://www.erickayacono.com")
	void WebOfRecord2226() {
		assertEquals("http://www.erickayacono.com", customers.get(2225).getWeb());
	}
}
