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

@Tag("16")
class Record_435 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 435: FirstName is Mary")
	void FirstNameOfRecord435() {
		assertEquals("Mary", customers.get(434).getFirstName());
	}

	@Test
	@DisplayName("Record 435: LastName is Pruss")
	void LastNameOfRecord435() {
		assertEquals("Pruss", customers.get(434).getLastName());
	}

	@Test
	@DisplayName("Record 435: Company is Greenville Tile Distributors")
	void CompanyOfRecord435() {
		assertEquals("Greenville Tile Distributors", customers.get(434).getCompany());
	}

	@Test
	@DisplayName("Record 435: Address is Rte 209")
	void AddressOfRecord435() {
		assertEquals("Rte 209", customers.get(434).getAddress());
	}

	@Test
	@DisplayName("Record 435: City is Stroudsburg")
	void CityOfRecord435() {
		assertEquals("Stroudsburg", customers.get(434).getCity());
	}

	@Test
	@DisplayName("Record 435: County is Monroe")
	void CountyOfRecord435() {
		assertEquals("Monroe", customers.get(434).getCounty());
	}

	@Test
	@DisplayName("Record 435: State is PA")
	void StateOfRecord435() {
		assertEquals("PA", customers.get(434).getState());
	}

	@Test
	@DisplayName("Record 435: ZIP is 18360")
	void ZIPOfRecord435() {
		assertEquals("18360", customers.get(434).getZIP());
	}

	@Test
	@DisplayName("Record 435: Phone is 570-424-7925")
	void PhoneOfRecord435() {
		assertEquals("570-424-7925", customers.get(434).getPhone());
	}

	@Test
	@DisplayName("Record 435: Fax is 570-424-2814")
	void FaxOfRecord435() {
		assertEquals("570-424-2814", customers.get(434).getFax());
	}

	@Test
	@DisplayName("Record 435: Email is mary@pruss.com")
	void EmailOfRecord435() {
		assertEquals("mary@pruss.com", customers.get(434).getEmail());
	}

	@Test
	@DisplayName("Record 435: Web is http://www.marypruss.com")
	void WebOfRecord435() {
		assertEquals("http://www.marypruss.com", customers.get(434).getWeb());
	}
}
