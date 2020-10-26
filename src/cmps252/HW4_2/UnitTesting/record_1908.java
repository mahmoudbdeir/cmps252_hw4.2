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
class Record_1908 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1908: FirstName is Jan")
	void FirstNameOfRecord1908() {
		assertEquals("Jan", customers.get(1907).getFirstName());
	}

	@Test
	@DisplayName("Record 1908: LastName is Delrossi")
	void LastNameOfRecord1908() {
		assertEquals("Delrossi", customers.get(1907).getLastName());
	}

	@Test
	@DisplayName("Record 1908: Company is Cavalier Tours Inc")
	void CompanyOfRecord1908() {
		assertEquals("Cavalier Tours Inc", customers.get(1907).getCompany());
	}

	@Test
	@DisplayName("Record 1908: Address is 279 Old Forge Hill Rd")
	void AddressOfRecord1908() {
		assertEquals("279 Old Forge Hill Rd", customers.get(1907).getAddress());
	}

	@Test
	@DisplayName("Record 1908: City is New Windsor")
	void CityOfRecord1908() {
		assertEquals("New Windsor", customers.get(1907).getCity());
	}

	@Test
	@DisplayName("Record 1908: County is Orange")
	void CountyOfRecord1908() {
		assertEquals("Orange", customers.get(1907).getCounty());
	}

	@Test
	@DisplayName("Record 1908: State is NY")
	void StateOfRecord1908() {
		assertEquals("NY", customers.get(1907).getState());
	}

	@Test
	@DisplayName("Record 1908: ZIP is 12553")
	void ZIPOfRecord1908() {
		assertEquals("12553", customers.get(1907).getZIP());
	}

	@Test
	@DisplayName("Record 1908: Phone is 845-561-4371")
	void PhoneOfRecord1908() {
		assertEquals("845-561-4371", customers.get(1907).getPhone());
	}

	@Test
	@DisplayName("Record 1908: Fax is 845-561-3102")
	void FaxOfRecord1908() {
		assertEquals("845-561-3102", customers.get(1907).getFax());
	}

	@Test
	@DisplayName("Record 1908: Email is jan@delrossi.com")
	void EmailOfRecord1908() {
		assertEquals("jan@delrossi.com", customers.get(1907).getEmail());
	}

	@Test
	@DisplayName("Record 1908: Web is http://www.jandelrossi.com")
	void WebOfRecord1908() {
		assertEquals("http://www.jandelrossi.com", customers.get(1907).getWeb());
	}
}
