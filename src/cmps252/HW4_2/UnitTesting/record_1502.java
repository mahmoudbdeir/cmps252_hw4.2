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

@Tag("24")
class Record_1502 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1502: FirstName is Johnson")
	void FirstNameOfRecord1502() {
		assertEquals("Johnson", customers.get(1501).getFirstName());
	}

	@Test
	@DisplayName("Record 1502: LastName is Crowson")
	void LastNameOfRecord1502() {
		assertEquals("Crowson", customers.get(1501).getLastName());
	}

	@Test
	@DisplayName("Record 1502: Company is Tool Tronics")
	void CompanyOfRecord1502() {
		assertEquals("Tool Tronics", customers.get(1501).getCompany());
	}

	@Test
	@DisplayName("Record 1502: Address is 320 5th Ave")
	void AddressOfRecord1502() {
		assertEquals("320 5th Ave", customers.get(1501).getAddress());
	}

	@Test
	@DisplayName("Record 1502: City is New York")
	void CityOfRecord1502() {
		assertEquals("New York", customers.get(1501).getCity());
	}

	@Test
	@DisplayName("Record 1502: County is New York")
	void CountyOfRecord1502() {
		assertEquals("New York", customers.get(1501).getCounty());
	}

	@Test
	@DisplayName("Record 1502: State is NY")
	void StateOfRecord1502() {
		assertEquals("NY", customers.get(1501).getState());
	}

	@Test
	@DisplayName("Record 1502: ZIP is 10001")
	void ZIPOfRecord1502() {
		assertEquals("10001", customers.get(1501).getZIP());
	}

	@Test
	@DisplayName("Record 1502: Phone is 212-947-6546")
	void PhoneOfRecord1502() {
		assertEquals("212-947-6546", customers.get(1501).getPhone());
	}

	@Test
	@DisplayName("Record 1502: Fax is 212-947-3266")
	void FaxOfRecord1502() {
		assertEquals("212-947-3266", customers.get(1501).getFax());
	}

	@Test
	@DisplayName("Record 1502: Email is johnson@crowson.com")
	void EmailOfRecord1502() {
		assertEquals("johnson@crowson.com", customers.get(1501).getEmail());
	}

	@Test
	@DisplayName("Record 1502: Web is http://www.johnsoncrowson.com")
	void WebOfRecord1502() {
		assertEquals("http://www.johnsoncrowson.com", customers.get(1501).getWeb());
	}
}
