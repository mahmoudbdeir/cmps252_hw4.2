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

@Tag("26")
class Record_875 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 875: FirstName is Cecil")
	void FirstNameOfRecord875() {
		assertEquals("Cecil", customers.get(874).getFirstName());
	}

	@Test
	@DisplayName("Record 875: LastName is Drullard")
	void LastNameOfRecord875() {
		assertEquals("Drullard", customers.get(874).getLastName());
	}

	@Test
	@DisplayName("Record 875: Company is Active Video")
	void CompanyOfRecord875() {
		assertEquals("Active Video", customers.get(874).getCompany());
	}

	@Test
	@DisplayName("Record 875: Address is 12444 Victory Blvd")
	void AddressOfRecord875() {
		assertEquals("12444 Victory Blvd", customers.get(874).getAddress());
	}

	@Test
	@DisplayName("Record 875: City is North Hollywood")
	void CityOfRecord875() {
		assertEquals("North Hollywood", customers.get(874).getCity());
	}

	@Test
	@DisplayName("Record 875: County is Los Angeles")
	void CountyOfRecord875() {
		assertEquals("Los Angeles", customers.get(874).getCounty());
	}

	@Test
	@DisplayName("Record 875: State is CA")
	void StateOfRecord875() {
		assertEquals("CA", customers.get(874).getState());
	}

	@Test
	@DisplayName("Record 875: ZIP is 91606")
	void ZIPOfRecord875() {
		assertEquals("91606", customers.get(874).getZIP());
	}

	@Test
	@DisplayName("Record 875: Phone is 818-505-7742")
	void PhoneOfRecord875() {
		assertEquals("818-505-7742", customers.get(874).getPhone());
	}

	@Test
	@DisplayName("Record 875: Fax is 818-505-5973")
	void FaxOfRecord875() {
		assertEquals("818-505-5973", customers.get(874).getFax());
	}

	@Test
	@DisplayName("Record 875: Email is cecil@drullard.com")
	void EmailOfRecord875() {
		assertEquals("cecil@drullard.com", customers.get(874).getEmail());
	}

	@Test
	@DisplayName("Record 875: Web is http://www.cecildrullard.com")
	void WebOfRecord875() {
		assertEquals("http://www.cecildrullard.com", customers.get(874).getWeb());
	}
}
