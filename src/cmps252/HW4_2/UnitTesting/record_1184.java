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
class Record_1184 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1184: FirstName is Eloise")
	void FirstNameOfRecord1184() {
		assertEquals("Eloise", customers.get(1183).getFirstName());
	}

	@Test
	@DisplayName("Record 1184: LastName is Grabonski")
	void LastNameOfRecord1184() {
		assertEquals("Grabonski", customers.get(1183).getLastName());
	}

	@Test
	@DisplayName("Record 1184: Company is Big Horn Wholesale")
	void CompanyOfRecord1184() {
		assertEquals("Big Horn Wholesale", customers.get(1183).getCompany());
	}

	@Test
	@DisplayName("Record 1184: Address is 145 W Lynford Rd")
	void AddressOfRecord1184() {
		assertEquals("145 W Lynford Rd", customers.get(1183).getAddress());
	}

	@Test
	@DisplayName("Record 1184: City is Richboro")
	void CityOfRecord1184() {
		assertEquals("Richboro", customers.get(1183).getCity());
	}

	@Test
	@DisplayName("Record 1184: County is Bucks")
	void CountyOfRecord1184() {
		assertEquals("Bucks", customers.get(1183).getCounty());
	}

	@Test
	@DisplayName("Record 1184: State is PA")
	void StateOfRecord1184() {
		assertEquals("PA", customers.get(1183).getState());
	}

	@Test
	@DisplayName("Record 1184: ZIP is 18954")
	void ZIPOfRecord1184() {
		assertEquals("18954", customers.get(1183).getZIP());
	}

	@Test
	@DisplayName("Record 1184: Phone is 215-322-6937")
	void PhoneOfRecord1184() {
		assertEquals("215-322-6937", customers.get(1183).getPhone());
	}

	@Test
	@DisplayName("Record 1184: Fax is 215-322-0105")
	void FaxOfRecord1184() {
		assertEquals("215-322-0105", customers.get(1183).getFax());
	}

	@Test
	@DisplayName("Record 1184: Email is eloise@grabonski.com")
	void EmailOfRecord1184() {
		assertEquals("eloise@grabonski.com", customers.get(1183).getEmail());
	}

	@Test
	@DisplayName("Record 1184: Web is http://www.eloisegrabonski.com")
	void WebOfRecord1184() {
		assertEquals("http://www.eloisegrabonski.com", customers.get(1183).getWeb());
	}
}
