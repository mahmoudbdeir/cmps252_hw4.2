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

@Tag("36")
class Record_1819 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1819: FirstName is Geoffrey")
	void FirstNameOfRecord1819() {
		assertEquals("Geoffrey", customers.get(1818).getFirstName());
	}

	@Test
	@DisplayName("Record 1819: LastName is Workinger")
	void LastNameOfRecord1819() {
		assertEquals("Workinger", customers.get(1818).getLastName());
	}

	@Test
	@DisplayName("Record 1819: Company is Vital Systems")
	void CompanyOfRecord1819() {
		assertEquals("Vital Systems", customers.get(1818).getCompany());
	}

	@Test
	@DisplayName("Record 1819: Address is 470 Park Ave S")
	void AddressOfRecord1819() {
		assertEquals("470 Park Ave S", customers.get(1818).getAddress());
	}

	@Test
	@DisplayName("Record 1819: City is New York")
	void CityOfRecord1819() {
		assertEquals("New York", customers.get(1818).getCity());
	}

	@Test
	@DisplayName("Record 1819: County is New York")
	void CountyOfRecord1819() {
		assertEquals("New York", customers.get(1818).getCounty());
	}

	@Test
	@DisplayName("Record 1819: State is NY")
	void StateOfRecord1819() {
		assertEquals("NY", customers.get(1818).getState());
	}

	@Test
	@DisplayName("Record 1819: ZIP is 10016")
	void ZIPOfRecord1819() {
		assertEquals("10016", customers.get(1818).getZIP());
	}

	@Test
	@DisplayName("Record 1819: Phone is 212-889-0291")
	void PhoneOfRecord1819() {
		assertEquals("212-889-0291", customers.get(1818).getPhone());
	}

	@Test
	@DisplayName("Record 1819: Fax is 212-889-9598")
	void FaxOfRecord1819() {
		assertEquals("212-889-9598", customers.get(1818).getFax());
	}

	@Test
	@DisplayName("Record 1819: Email is geoffrey@workinger.com")
	void EmailOfRecord1819() {
		assertEquals("geoffrey@workinger.com", customers.get(1818).getEmail());
	}

	@Test
	@DisplayName("Record 1819: Web is http://www.geoffreyworkinger.com")
	void WebOfRecord1819() {
		assertEquals("http://www.geoffreyworkinger.com", customers.get(1818).getWeb());
	}
}
