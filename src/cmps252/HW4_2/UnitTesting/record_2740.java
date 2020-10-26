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

@Tag("37")
class Record_2740 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2740: FirstName is Sybil")
	void FirstNameOfRecord2740() {
		assertEquals("Sybil", customers.get(2739).getFirstName());
	}

	@Test
	@DisplayName("Record 2740: LastName is Cartmill")
	void LastNameOfRecord2740() {
		assertEquals("Cartmill", customers.get(2739).getLastName());
	}

	@Test
	@DisplayName("Record 2740: Company is Macdougall & Pierce Constrctn")
	void CompanyOfRecord2740() {
		assertEquals("Macdougall & Pierce Constrctn", customers.get(2739).getCompany());
	}

	@Test
	@DisplayName("Record 2740: Address is 437 N 500 W")
	void AddressOfRecord2740() {
		assertEquals("437 N 500 W", customers.get(2739).getAddress());
	}

	@Test
	@DisplayName("Record 2740: City is Salt Lake City")
	void CityOfRecord2740() {
		assertEquals("Salt Lake City", customers.get(2739).getCity());
	}

	@Test
	@DisplayName("Record 2740: County is Salt Lake")
	void CountyOfRecord2740() {
		assertEquals("Salt Lake", customers.get(2739).getCounty());
	}

	@Test
	@DisplayName("Record 2740: State is UT")
	void StateOfRecord2740() {
		assertEquals("UT", customers.get(2739).getState());
	}

	@Test
	@DisplayName("Record 2740: ZIP is 84116")
	void ZIPOfRecord2740() {
		assertEquals("84116", customers.get(2739).getZIP());
	}

	@Test
	@DisplayName("Record 2740: Phone is 801-328-4889")
	void PhoneOfRecord2740() {
		assertEquals("801-328-4889", customers.get(2739).getPhone());
	}

	@Test
	@DisplayName("Record 2740: Fax is 801-328-4537")
	void FaxOfRecord2740() {
		assertEquals("801-328-4537", customers.get(2739).getFax());
	}

	@Test
	@DisplayName("Record 2740: Email is sybil@cartmill.com")
	void EmailOfRecord2740() {
		assertEquals("sybil@cartmill.com", customers.get(2739).getEmail());
	}

	@Test
	@DisplayName("Record 2740: Web is http://www.sybilcartmill.com")
	void WebOfRecord2740() {
		assertEquals("http://www.sybilcartmill.com", customers.get(2739).getWeb());
	}
}
