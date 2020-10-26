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

@Tag("23")
class Record_1964 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1964: FirstName is King")
	void FirstNameOfRecord1964() {
		assertEquals("King", customers.get(1963).getFirstName());
	}

	@Test
	@DisplayName("Record 1964: LastName is Forsberg")
	void LastNameOfRecord1964() {
		assertEquals("Forsberg", customers.get(1963).getLastName());
	}

	@Test
	@DisplayName("Record 1964: Company is Grl Associates")
	void CompanyOfRecord1964() {
		assertEquals("Grl Associates", customers.get(1963).getCompany());
	}

	@Test
	@DisplayName("Record 1964: Address is 1058 S Vandeventer Ave")
	void AddressOfRecord1964() {
		assertEquals("1058 S Vandeventer Ave", customers.get(1963).getAddress());
	}

	@Test
	@DisplayName("Record 1964: City is Saint Louis")
	void CityOfRecord1964() {
		assertEquals("Saint Louis", customers.get(1963).getCity());
	}

	@Test
	@DisplayName("Record 1964: County is Saint Louis City")
	void CountyOfRecord1964() {
		assertEquals("Saint Louis City", customers.get(1963).getCounty());
	}

	@Test
	@DisplayName("Record 1964: State is MO")
	void StateOfRecord1964() {
		assertEquals("MO", customers.get(1963).getState());
	}

	@Test
	@DisplayName("Record 1964: ZIP is 63110")
	void ZIPOfRecord1964() {
		assertEquals("63110", customers.get(1963).getZIP());
	}

	@Test
	@DisplayName("Record 1964: Phone is 314-531-4387")
	void PhoneOfRecord1964() {
		assertEquals("314-531-4387", customers.get(1963).getPhone());
	}

	@Test
	@DisplayName("Record 1964: Fax is 314-531-5585")
	void FaxOfRecord1964() {
		assertEquals("314-531-5585", customers.get(1963).getFax());
	}

	@Test
	@DisplayName("Record 1964: Email is king@forsberg.com")
	void EmailOfRecord1964() {
		assertEquals("king@forsberg.com", customers.get(1963).getEmail());
	}

	@Test
	@DisplayName("Record 1964: Web is http://www.kingforsberg.com")
	void WebOfRecord1964() {
		assertEquals("http://www.kingforsberg.com", customers.get(1963).getWeb());
	}
}
