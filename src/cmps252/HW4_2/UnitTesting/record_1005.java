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

@Tag("25")
class Record_1005 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1005: FirstName is Dane")
	void FirstNameOfRecord1005() {
		assertEquals("Dane", customers.get(1004).getFirstName());
	}

	@Test
	@DisplayName("Record 1005: LastName is Wormwood")
	void LastNameOfRecord1005() {
		assertEquals("Wormwood", customers.get(1004).getLastName());
	}

	@Test
	@DisplayName("Record 1005: Company is Palmer, Douglas S Jr")
	void CompanyOfRecord1005() {
		assertEquals("Palmer, Douglas S Jr", customers.get(1004).getCompany());
	}

	@Test
	@DisplayName("Record 1005: Address is 230 E Potter Dr")
	void AddressOfRecord1005() {
		assertEquals("230 E Potter Dr", customers.get(1004).getAddress());
	}

	@Test
	@DisplayName("Record 1005: City is Anchorage")
	void CityOfRecord1005() {
		assertEquals("Anchorage", customers.get(1004).getCity());
	}

	@Test
	@DisplayName("Record 1005: County is Anchorage")
	void CountyOfRecord1005() {
		assertEquals("Anchorage", customers.get(1004).getCounty());
	}

	@Test
	@DisplayName("Record 1005: State is AK")
	void StateOfRecord1005() {
		assertEquals("AK", customers.get(1004).getState());
	}

	@Test
	@DisplayName("Record 1005: ZIP is 99518")
	void ZIPOfRecord1005() {
		assertEquals("99518", customers.get(1004).getZIP());
	}

	@Test
	@DisplayName("Record 1005: Phone is 907-563-6250")
	void PhoneOfRecord1005() {
		assertEquals("907-563-6250", customers.get(1004).getPhone());
	}

	@Test
	@DisplayName("Record 1005: Fax is 907-563-8102")
	void FaxOfRecord1005() {
		assertEquals("907-563-8102", customers.get(1004).getFax());
	}

	@Test
	@DisplayName("Record 1005: Email is dane@wormwood.com")
	void EmailOfRecord1005() {
		assertEquals("dane@wormwood.com", customers.get(1004).getEmail());
	}

	@Test
	@DisplayName("Record 1005: Web is http://www.danewormwood.com")
	void WebOfRecord1005() {
		assertEquals("http://www.danewormwood.com", customers.get(1004).getWeb());
	}
}
