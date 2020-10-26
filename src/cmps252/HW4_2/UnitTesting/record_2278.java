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

@Tag("43")
class Record_2278 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2278: FirstName is Sharon")
	void FirstNameOfRecord2278() {
		assertEquals("Sharon", customers.get(2277).getFirstName());
	}

	@Test
	@DisplayName("Record 2278: LastName is Presti")
	void LastNameOfRecord2278() {
		assertEquals("Presti", customers.get(2277).getLastName());
	}

	@Test
	@DisplayName("Record 2278: Company is Nhs Printng Corp")
	void CompanyOfRecord2278() {
		assertEquals("Nhs Printng Corp", customers.get(2277).getCompany());
	}

	@Test
	@DisplayName("Record 2278: Address is 1444 I St Nw")
	void AddressOfRecord2278() {
		assertEquals("1444 I St Nw", customers.get(2277).getAddress());
	}

	@Test
	@DisplayName("Record 2278: City is Washington")
	void CityOfRecord2278() {
		assertEquals("Washington", customers.get(2277).getCity());
	}

	@Test
	@DisplayName("Record 2278: County is District of Columbia")
	void CountyOfRecord2278() {
		assertEquals("District of Columbia", customers.get(2277).getCounty());
	}

	@Test
	@DisplayName("Record 2278: State is DC")
	void StateOfRecord2278() {
		assertEquals("DC", customers.get(2277).getState());
	}

	@Test
	@DisplayName("Record 2278: ZIP is 20005")
	void ZIPOfRecord2278() {
		assertEquals("20005", customers.get(2277).getZIP());
	}

	@Test
	@DisplayName("Record 2278: Phone is 202-289-1961")
	void PhoneOfRecord2278() {
		assertEquals("202-289-1961", customers.get(2277).getPhone());
	}

	@Test
	@DisplayName("Record 2278: Fax is 202-289-6425")
	void FaxOfRecord2278() {
		assertEquals("202-289-6425", customers.get(2277).getFax());
	}

	@Test
	@DisplayName("Record 2278: Email is sharon@presti.com")
	void EmailOfRecord2278() {
		assertEquals("sharon@presti.com", customers.get(2277).getEmail());
	}

	@Test
	@DisplayName("Record 2278: Web is http://www.sharonpresti.com")
	void WebOfRecord2278() {
		assertEquals("http://www.sharonpresti.com", customers.get(2277).getWeb());
	}
}
