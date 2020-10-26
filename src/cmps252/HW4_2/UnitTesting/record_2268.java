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
class Record_2268 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2268: FirstName is Glenda")
	void FirstNameOfRecord2268() {
		assertEquals("Glenda", customers.get(2267).getFirstName());
	}

	@Test
	@DisplayName("Record 2268: LastName is Krahulec")
	void LastNameOfRecord2268() {
		assertEquals("Krahulec", customers.get(2267).getLastName());
	}

	@Test
	@DisplayName("Record 2268: Company is Furniture World")
	void CompanyOfRecord2268() {
		assertEquals("Furniture World", customers.get(2267).getCompany());
	}

	@Test
	@DisplayName("Record 2268: Address is 510 Grand Plaza Plac")
	void AddressOfRecord2268() {
		assertEquals("510 Grand Plaza Plac", customers.get(2267).getAddress());
	}

	@Test
	@DisplayName("Record 2268: City is Grand Rapids")
	void CityOfRecord2268() {
		assertEquals("Grand Rapids", customers.get(2267).getCity());
	}

	@Test
	@DisplayName("Record 2268: County is Kent")
	void CountyOfRecord2268() {
		assertEquals("Kent", customers.get(2267).getCounty());
	}

	@Test
	@DisplayName("Record 2268: State is MI")
	void StateOfRecord2268() {
		assertEquals("MI", customers.get(2267).getState());
	}

	@Test
	@DisplayName("Record 2268: ZIP is 49503")
	void ZIPOfRecord2268() {
		assertEquals("49503", customers.get(2267).getZIP());
	}

	@Test
	@DisplayName("Record 2268: Phone is 616-451-9095")
	void PhoneOfRecord2268() {
		assertEquals("616-451-9095", customers.get(2267).getPhone());
	}

	@Test
	@DisplayName("Record 2268: Fax is 616-451-3176")
	void FaxOfRecord2268() {
		assertEquals("616-451-3176", customers.get(2267).getFax());
	}

	@Test
	@DisplayName("Record 2268: Email is glenda@krahulec.com")
	void EmailOfRecord2268() {
		assertEquals("glenda@krahulec.com", customers.get(2267).getEmail());
	}

	@Test
	@DisplayName("Record 2268: Web is http://www.glendakrahulec.com")
	void WebOfRecord2268() {
		assertEquals("http://www.glendakrahulec.com", customers.get(2267).getWeb());
	}
}
