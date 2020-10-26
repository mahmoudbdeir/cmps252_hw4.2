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

@Tag("28")
class Record_1271 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1271: FirstName is Dalton")
	void FirstNameOfRecord1271() {
		assertEquals("Dalton", customers.get(1270).getFirstName());
	}

	@Test
	@DisplayName("Record 1271: LastName is Stambach")
	void LastNameOfRecord1271() {
		assertEquals("Stambach", customers.get(1270).getLastName());
	}

	@Test
	@DisplayName("Record 1271: Company is Abeles, Gary Cpa")
	void CompanyOfRecord1271() {
		assertEquals("Abeles, Gary Cpa", customers.get(1270).getCompany());
	}

	@Test
	@DisplayName("Record 1271: Address is 644 Amsterdam Ave")
	void AddressOfRecord1271() {
		assertEquals("644 Amsterdam Ave", customers.get(1270).getAddress());
	}

	@Test
	@DisplayName("Record 1271: City is New York")
	void CityOfRecord1271() {
		assertEquals("New York", customers.get(1270).getCity());
	}

	@Test
	@DisplayName("Record 1271: County is New York")
	void CountyOfRecord1271() {
		assertEquals("New York", customers.get(1270).getCounty());
	}

	@Test
	@DisplayName("Record 1271: State is NY")
	void StateOfRecord1271() {
		assertEquals("NY", customers.get(1270).getState());
	}

	@Test
	@DisplayName("Record 1271: ZIP is 10025")
	void ZIPOfRecord1271() {
		assertEquals("10025", customers.get(1270).getZIP());
	}

	@Test
	@DisplayName("Record 1271: Phone is 212-874-1417")
	void PhoneOfRecord1271() {
		assertEquals("212-874-1417", customers.get(1270).getPhone());
	}

	@Test
	@DisplayName("Record 1271: Fax is 212-874-7623")
	void FaxOfRecord1271() {
		assertEquals("212-874-7623", customers.get(1270).getFax());
	}

	@Test
	@DisplayName("Record 1271: Email is dalton@stambach.com")
	void EmailOfRecord1271() {
		assertEquals("dalton@stambach.com", customers.get(1270).getEmail());
	}

	@Test
	@DisplayName("Record 1271: Web is http://www.daltonstambach.com")
	void WebOfRecord1271() {
		assertEquals("http://www.daltonstambach.com", customers.get(1270).getWeb());
	}
}
