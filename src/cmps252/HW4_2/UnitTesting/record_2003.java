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

@Tag("31")
class Record_2003 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2003: FirstName is Marion")
	void FirstNameOfRecord2003() {
		assertEquals("Marion", customers.get(2002).getFirstName());
	}

	@Test
	@DisplayName("Record 2003: LastName is Frerichs")
	void LastNameOfRecord2003() {
		assertEquals("Frerichs", customers.get(2002).getLastName());
	}

	@Test
	@DisplayName("Record 2003: Company is Northland Ind Trck Co Inc")
	void CompanyOfRecord2003() {
		assertEquals("Northland Ind Trck Co Inc", customers.get(2002).getCompany());
	}

	@Test
	@DisplayName("Record 2003: Address is 476 Broadway")
	void AddressOfRecord2003() {
		assertEquals("476 Broadway", customers.get(2002).getAddress());
	}

	@Test
	@DisplayName("Record 2003: City is New York")
	void CityOfRecord2003() {
		assertEquals("New York", customers.get(2002).getCity());
	}

	@Test
	@DisplayName("Record 2003: County is New York")
	void CountyOfRecord2003() {
		assertEquals("New York", customers.get(2002).getCounty());
	}

	@Test
	@DisplayName("Record 2003: State is NY")
	void StateOfRecord2003() {
		assertEquals("NY", customers.get(2002).getState());
	}

	@Test
	@DisplayName("Record 2003: ZIP is 10013")
	void ZIPOfRecord2003() {
		assertEquals("10013", customers.get(2002).getZIP());
	}

	@Test
	@DisplayName("Record 2003: Phone is 212-966-2928")
	void PhoneOfRecord2003() {
		assertEquals("212-966-2928", customers.get(2002).getPhone());
	}

	@Test
	@DisplayName("Record 2003: Fax is 212-966-3875")
	void FaxOfRecord2003() {
		assertEquals("212-966-3875", customers.get(2002).getFax());
	}

	@Test
	@DisplayName("Record 2003: Email is marion@frerichs.com")
	void EmailOfRecord2003() {
		assertEquals("marion@frerichs.com", customers.get(2002).getEmail());
	}

	@Test
	@DisplayName("Record 2003: Web is http://www.marionfrerichs.com")
	void WebOfRecord2003() {
		assertEquals("http://www.marionfrerichs.com", customers.get(2002).getWeb());
	}
}
