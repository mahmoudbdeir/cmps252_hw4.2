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

@Tag("33")
class Record_2245 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2245: FirstName is Johnathan")
	void FirstNameOfRecord2245() {
		assertEquals("Johnathan", customers.get(2244).getFirstName());
	}

	@Test
	@DisplayName("Record 2245: LastName is Blaney")
	void LastNameOfRecord2245() {
		assertEquals("Blaney", customers.get(2244).getLastName());
	}

	@Test
	@DisplayName("Record 2245: Company is All Texas Health Care")
	void CompanyOfRecord2245() {
		assertEquals("All Texas Health Care", customers.get(2244).getCompany());
	}

	@Test
	@DisplayName("Record 2245: Address is 264 Duffy Ave")
	void AddressOfRecord2245() {
		assertEquals("264 Duffy Ave", customers.get(2244).getAddress());
	}

	@Test
	@DisplayName("Record 2245: City is Hicksville")
	void CityOfRecord2245() {
		assertEquals("Hicksville", customers.get(2244).getCity());
	}

	@Test
	@DisplayName("Record 2245: County is Nassau")
	void CountyOfRecord2245() {
		assertEquals("Nassau", customers.get(2244).getCounty());
	}

	@Test
	@DisplayName("Record 2245: State is NY")
	void StateOfRecord2245() {
		assertEquals("NY", customers.get(2244).getState());
	}

	@Test
	@DisplayName("Record 2245: ZIP is 11801")
	void ZIPOfRecord2245() {
		assertEquals("11801", customers.get(2244).getZIP());
	}

	@Test
	@DisplayName("Record 2245: Phone is 516-433-9215")
	void PhoneOfRecord2245() {
		assertEquals("516-433-9215", customers.get(2244).getPhone());
	}

	@Test
	@DisplayName("Record 2245: Fax is 516-433-1511")
	void FaxOfRecord2245() {
		assertEquals("516-433-1511", customers.get(2244).getFax());
	}

	@Test
	@DisplayName("Record 2245: Email is johnathan@blaney.com")
	void EmailOfRecord2245() {
		assertEquals("johnathan@blaney.com", customers.get(2244).getEmail());
	}

	@Test
	@DisplayName("Record 2245: Web is http://www.johnathanblaney.com")
	void WebOfRecord2245() {
		assertEquals("http://www.johnathanblaney.com", customers.get(2244).getWeb());
	}
}
