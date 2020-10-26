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

@Tag("47")
class Record_2145 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2145: FirstName is Harold")
	void FirstNameOfRecord2145() {
		assertEquals("Harold", customers.get(2144).getFirstName());
	}

	@Test
	@DisplayName("Record 2145: LastName is Babula")
	void LastNameOfRecord2145() {
		assertEquals("Babula", customers.get(2144).getLastName());
	}

	@Test
	@DisplayName("Record 2145: Company is Fairwind Travel Inc")
	void CompanyOfRecord2145() {
		assertEquals("Fairwind Travel Inc", customers.get(2144).getCompany());
	}

	@Test
	@DisplayName("Record 2145: Address is 12019 Garfield Ave")
	void AddressOfRecord2145() {
		assertEquals("12019 Garfield Ave", customers.get(2144).getAddress());
	}

	@Test
	@DisplayName("Record 2145: City is South Gate")
	void CityOfRecord2145() {
		assertEquals("South Gate", customers.get(2144).getCity());
	}

	@Test
	@DisplayName("Record 2145: County is Los Angeles")
	void CountyOfRecord2145() {
		assertEquals("Los Angeles", customers.get(2144).getCounty());
	}

	@Test
	@DisplayName("Record 2145: State is CA")
	void StateOfRecord2145() {
		assertEquals("CA", customers.get(2144).getState());
	}

	@Test
	@DisplayName("Record 2145: ZIP is 90280")
	void ZIPOfRecord2145() {
		assertEquals("90280", customers.get(2144).getZIP());
	}

	@Test
	@DisplayName("Record 2145: Phone is 323-529-5454")
	void PhoneOfRecord2145() {
		assertEquals("323-529-5454", customers.get(2144).getPhone());
	}

	@Test
	@DisplayName("Record 2145: Fax is 323-529-6513")
	void FaxOfRecord2145() {
		assertEquals("323-529-6513", customers.get(2144).getFax());
	}

	@Test
	@DisplayName("Record 2145: Email is harold@babula.com")
	void EmailOfRecord2145() {
		assertEquals("harold@babula.com", customers.get(2144).getEmail());
	}

	@Test
	@DisplayName("Record 2145: Web is http://www.haroldbabula.com")
	void WebOfRecord2145() {
		assertEquals("http://www.haroldbabula.com", customers.get(2144).getWeb());
	}
}
