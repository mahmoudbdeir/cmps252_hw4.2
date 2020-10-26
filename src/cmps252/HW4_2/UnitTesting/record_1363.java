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

@Tag("9")
class Record_1363 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1363: FirstName is Geraldine")
	void FirstNameOfRecord1363() {
		assertEquals("Geraldine", customers.get(1362).getFirstName());
	}

	@Test
	@DisplayName("Record 1363: LastName is Cadorette")
	void LastNameOfRecord1363() {
		assertEquals("Cadorette", customers.get(1362).getLastName());
	}

	@Test
	@DisplayName("Record 1363: Company is Thomas Investigative Publ Inc")
	void CompanyOfRecord1363() {
		assertEquals("Thomas Investigative Publ Inc", customers.get(1362).getCompany());
	}

	@Test
	@DisplayName("Record 1363: Address is 4299 S Apple Creek Rd")
	void AddressOfRecord1363() {
		assertEquals("4299 S Apple Creek Rd", customers.get(1362).getAddress());
	}

	@Test
	@DisplayName("Record 1363: City is Apple Creek")
	void CityOfRecord1363() {
		assertEquals("Apple Creek", customers.get(1362).getCity());
	}

	@Test
	@DisplayName("Record 1363: County is Wayne")
	void CountyOfRecord1363() {
		assertEquals("Wayne", customers.get(1362).getCounty());
	}

	@Test
	@DisplayName("Record 1363: State is OH")
	void StateOfRecord1363() {
		assertEquals("OH", customers.get(1362).getState());
	}

	@Test
	@DisplayName("Record 1363: ZIP is 44606")
	void ZIPOfRecord1363() {
		assertEquals("44606", customers.get(1362).getZIP());
	}

	@Test
	@DisplayName("Record 1363: Phone is 330-698-9479")
	void PhoneOfRecord1363() {
		assertEquals("330-698-9479", customers.get(1362).getPhone());
	}

	@Test
	@DisplayName("Record 1363: Fax is 330-698-1498")
	void FaxOfRecord1363() {
		assertEquals("330-698-1498", customers.get(1362).getFax());
	}

	@Test
	@DisplayName("Record 1363: Email is geraldine@cadorette.com")
	void EmailOfRecord1363() {
		assertEquals("geraldine@cadorette.com", customers.get(1362).getEmail());
	}

	@Test
	@DisplayName("Record 1363: Web is http://www.geraldinecadorette.com")
	void WebOfRecord1363() {
		assertEquals("http://www.geraldinecadorette.com", customers.get(1362).getWeb());
	}
}
