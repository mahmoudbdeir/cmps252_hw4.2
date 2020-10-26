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

@Tag("30")
class Record_1941 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1941: FirstName is Kerry")
	void FirstNameOfRecord1941() {
		assertEquals("Kerry", customers.get(1940).getFirstName());
	}

	@Test
	@DisplayName("Record 1941: LastName is Lenart")
	void LastNameOfRecord1941() {
		assertEquals("Lenart", customers.get(1940).getLastName());
	}

	@Test
	@DisplayName("Record 1941: Company is Abo Uris & Altenburger")
	void CompanyOfRecord1941() {
		assertEquals("Abo Uris & Altenburger", customers.get(1940).getCompany());
	}

	@Test
	@DisplayName("Record 1941: Address is 5700 Cherokee Rd")
	void AddressOfRecord1941() {
		assertEquals("5700 Cherokee Rd", customers.get(1940).getAddress());
	}

	@Test
	@DisplayName("Record 1941: City is Stockton")
	void CityOfRecord1941() {
		assertEquals("Stockton", customers.get(1940).getCity());
	}

	@Test
	@DisplayName("Record 1941: County is San Joaquin")
	void CountyOfRecord1941() {
		assertEquals("San Joaquin", customers.get(1940).getCounty());
	}

	@Test
	@DisplayName("Record 1941: State is CA")
	void StateOfRecord1941() {
		assertEquals("CA", customers.get(1940).getState());
	}

	@Test
	@DisplayName("Record 1941: ZIP is 95215")
	void ZIPOfRecord1941() {
		assertEquals("95215", customers.get(1940).getZIP());
	}

	@Test
	@DisplayName("Record 1941: Phone is 209-931-0416")
	void PhoneOfRecord1941() {
		assertEquals("209-931-0416", customers.get(1940).getPhone());
	}

	@Test
	@DisplayName("Record 1941: Fax is 209-931-6926")
	void FaxOfRecord1941() {
		assertEquals("209-931-6926", customers.get(1940).getFax());
	}

	@Test
	@DisplayName("Record 1941: Email is kerry@lenart.com")
	void EmailOfRecord1941() {
		assertEquals("kerry@lenart.com", customers.get(1940).getEmail());
	}

	@Test
	@DisplayName("Record 1941: Web is http://www.kerrylenart.com")
	void WebOfRecord1941() {
		assertEquals("http://www.kerrylenart.com", customers.get(1940).getWeb());
	}
}
