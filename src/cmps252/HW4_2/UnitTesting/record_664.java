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
class Record_664 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 664: FirstName is Mellisa")
	void FirstNameOfRecord664() {
		assertEquals("Mellisa", customers.get(663).getFirstName());
	}

	@Test
	@DisplayName("Record 664: LastName is Covington")
	void LastNameOfRecord664() {
		assertEquals("Covington", customers.get(663).getLastName());
	}

	@Test
	@DisplayName("Record 664: Company is Delaware Concrete Pump Sls Inc")
	void CompanyOfRecord664() {
		assertEquals("Delaware Concrete Pump Sls Inc", customers.get(663).getCompany());
	}

	@Test
	@DisplayName("Record 664: Address is 204 S Union St")
	void AddressOfRecord664() {
		assertEquals("204 S Union St", customers.get(663).getAddress());
	}

	@Test
	@DisplayName("Record 664: City is Kokomo")
	void CityOfRecord664() {
		assertEquals("Kokomo", customers.get(663).getCity());
	}

	@Test
	@DisplayName("Record 664: County is Howard")
	void CountyOfRecord664() {
		assertEquals("Howard", customers.get(663).getCounty());
	}

	@Test
	@DisplayName("Record 664: State is IN")
	void StateOfRecord664() {
		assertEquals("IN", customers.get(663).getState());
	}

	@Test
	@DisplayName("Record 664: ZIP is 46901")
	void ZIPOfRecord664() {
		assertEquals("46901", customers.get(663).getZIP());
	}

	@Test
	@DisplayName("Record 664: Phone is 765-452-2198")
	void PhoneOfRecord664() {
		assertEquals("765-452-2198", customers.get(663).getPhone());
	}

	@Test
	@DisplayName("Record 664: Fax is 765-452-4466")
	void FaxOfRecord664() {
		assertEquals("765-452-4466", customers.get(663).getFax());
	}

	@Test
	@DisplayName("Record 664: Email is mellisa@covington.com")
	void EmailOfRecord664() {
		assertEquals("mellisa@covington.com", customers.get(663).getEmail());
	}

	@Test
	@DisplayName("Record 664: Web is http://www.mellisacovington.com")
	void WebOfRecord664() {
		assertEquals("http://www.mellisacovington.com", customers.get(663).getWeb());
	}
}
