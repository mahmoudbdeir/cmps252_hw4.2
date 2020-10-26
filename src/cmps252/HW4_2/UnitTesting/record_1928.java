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

@Tag("35")
class Record_1928 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1928: FirstName is Ricky")
	void FirstNameOfRecord1928() {
		assertEquals("Ricky", customers.get(1927).getFirstName());
	}

	@Test
	@DisplayName("Record 1928: LastName is Quituqua")
	void LastNameOfRecord1928() {
		assertEquals("Quituqua", customers.get(1927).getLastName());
	}

	@Test
	@DisplayName("Record 1928: Company is Babin, Bill J Jr")
	void CompanyOfRecord1928() {
		assertEquals("Babin, Bill J Jr", customers.get(1927).getCompany());
	}

	@Test
	@DisplayName("Record 1928: Address is 3755 Lake City Hwy  #-1")
	void AddressOfRecord1928() {
		assertEquals("3755 Lake City Hwy  #-1", customers.get(1927).getAddress());
	}

	@Test
	@DisplayName("Record 1928: City is Warsaw")
	void CityOfRecord1928() {
		assertEquals("Warsaw", customers.get(1927).getCity());
	}

	@Test
	@DisplayName("Record 1928: County is Kosciusko")
	void CountyOfRecord1928() {
		assertEquals("Kosciusko", customers.get(1927).getCounty());
	}

	@Test
	@DisplayName("Record 1928: State is IN")
	void StateOfRecord1928() {
		assertEquals("IN", customers.get(1927).getState());
	}

	@Test
	@DisplayName("Record 1928: ZIP is 46580")
	void ZIPOfRecord1928() {
		assertEquals("46580", customers.get(1927).getZIP());
	}

	@Test
	@DisplayName("Record 1928: Phone is 574-268-8651")
	void PhoneOfRecord1928() {
		assertEquals("574-268-8651", customers.get(1927).getPhone());
	}

	@Test
	@DisplayName("Record 1928: Fax is 574-268-7329")
	void FaxOfRecord1928() {
		assertEquals("574-268-7329", customers.get(1927).getFax());
	}

	@Test
	@DisplayName("Record 1928: Email is ricky@quituqua.com")
	void EmailOfRecord1928() {
		assertEquals("ricky@quituqua.com", customers.get(1927).getEmail());
	}

	@Test
	@DisplayName("Record 1928: Web is http://www.rickyquituqua.com")
	void WebOfRecord1928() {
		assertEquals("http://www.rickyquituqua.com", customers.get(1927).getWeb());
	}
}
