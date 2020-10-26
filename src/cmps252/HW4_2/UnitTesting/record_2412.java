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

@Tag("37")
class Record_2412 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2412: FirstName is Dirk")
	void FirstNameOfRecord2412() {
		assertEquals("Dirk", customers.get(2411).getFirstName());
	}

	@Test
	@DisplayName("Record 2412: LastName is Flint")
	void LastNameOfRecord2412() {
		assertEquals("Flint", customers.get(2411).getLastName());
	}

	@Test
	@DisplayName("Record 2412: Company is Lloyds Electronics Inc")
	void CompanyOfRecord2412() {
		assertEquals("Lloyds Electronics Inc", customers.get(2411).getCompany());
	}

	@Test
	@DisplayName("Record 2412: Address is 1901 Vestal Pky E")
	void AddressOfRecord2412() {
		assertEquals("1901 Vestal Pky E", customers.get(2411).getAddress());
	}

	@Test
	@DisplayName("Record 2412: City is Vestal")
	void CityOfRecord2412() {
		assertEquals("Vestal", customers.get(2411).getCity());
	}

	@Test
	@DisplayName("Record 2412: County is Broome")
	void CountyOfRecord2412() {
		assertEquals("Broome", customers.get(2411).getCounty());
	}

	@Test
	@DisplayName("Record 2412: State is NY")
	void StateOfRecord2412() {
		assertEquals("NY", customers.get(2411).getState());
	}

	@Test
	@DisplayName("Record 2412: ZIP is 13850")
	void ZIPOfRecord2412() {
		assertEquals("13850", customers.get(2411).getZIP());
	}

	@Test
	@DisplayName("Record 2412: Phone is 607-786-9561")
	void PhoneOfRecord2412() {
		assertEquals("607-786-9561", customers.get(2411).getPhone());
	}

	@Test
	@DisplayName("Record 2412: Fax is 607-786-5278")
	void FaxOfRecord2412() {
		assertEquals("607-786-5278", customers.get(2411).getFax());
	}

	@Test
	@DisplayName("Record 2412: Email is dirk@flint.com")
	void EmailOfRecord2412() {
		assertEquals("dirk@flint.com", customers.get(2411).getEmail());
	}

	@Test
	@DisplayName("Record 2412: Web is http://www.dirkflint.com")
	void WebOfRecord2412() {
		assertEquals("http://www.dirkflint.com", customers.get(2411).getWeb());
	}
}
