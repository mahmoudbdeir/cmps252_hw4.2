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

@Tag("40")
class Record_305 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 305: FirstName is Mason")
	void FirstNameOfRecord305() {
		assertEquals("Mason", customers.get(304).getFirstName());
	}

	@Test
	@DisplayName("Record 305: LastName is Bonnet")
	void LastNameOfRecord305() {
		assertEquals("Bonnet", customers.get(304).getLastName());
	}

	@Test
	@DisplayName("Record 305: Company is Ryder, Bruce D Esq")
	void CompanyOfRecord305() {
		assertEquals("Ryder, Bruce D Esq", customers.get(304).getCompany());
	}

	@Test
	@DisplayName("Record 305: Address is 3800 E Pacific Coast Hwy")
	void AddressOfRecord305() {
		assertEquals("3800 E Pacific Coast Hwy", customers.get(304).getAddress());
	}

	@Test
	@DisplayName("Record 305: City is Long Beach")
	void CityOfRecord305() {
		assertEquals("Long Beach", customers.get(304).getCity());
	}

	@Test
	@DisplayName("Record 305: County is Los Angeles")
	void CountyOfRecord305() {
		assertEquals("Los Angeles", customers.get(304).getCounty());
	}

	@Test
	@DisplayName("Record 305: State is CA")
	void StateOfRecord305() {
		assertEquals("CA", customers.get(304).getState());
	}

	@Test
	@DisplayName("Record 305: ZIP is 90804")
	void ZIPOfRecord305() {
		assertEquals("90804", customers.get(304).getZIP());
	}

	@Test
	@DisplayName("Record 305: Phone is 562-986-3409")
	void PhoneOfRecord305() {
		assertEquals("562-986-3409", customers.get(304).getPhone());
	}

	@Test
	@DisplayName("Record 305: Fax is 562-986-3502")
	void FaxOfRecord305() {
		assertEquals("562-986-3502", customers.get(304).getFax());
	}

	@Test
	@DisplayName("Record 305: Email is mason@bonnet.com")
	void EmailOfRecord305() {
		assertEquals("mason@bonnet.com", customers.get(304).getEmail());
	}

	@Test
	@DisplayName("Record 305: Web is http://www.masonbonnet.com")
	void WebOfRecord305() {
		assertEquals("http://www.masonbonnet.com", customers.get(304).getWeb());
	}
}
