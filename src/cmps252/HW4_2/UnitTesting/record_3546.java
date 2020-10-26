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

@Tag("27")
class Record_3546 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3546: FirstName is Haley")
	void FirstNameOfRecord3546() {
		assertEquals("Haley", customers.get(3545).getFirstName());
	}

	@Test
	@DisplayName("Record 3546: LastName is Mccay")
	void LastNameOfRecord3546() {
		assertEquals("Mccay", customers.get(3545).getLastName());
	}

	@Test
	@DisplayName("Record 3546: Company is Lillian T Smith & Associates")
	void CompanyOfRecord3546() {
		assertEquals("Lillian T Smith & Associates", customers.get(3545).getCompany());
	}

	@Test
	@DisplayName("Record 3546: Address is 340 Prince Drew Rd")
	void AddressOfRecord3546() {
		assertEquals("340 Prince Drew Rd", customers.get(3545).getAddress());
	}

	@Test
	@DisplayName("Record 3546: City is Newport News")
	void CityOfRecord3546() {
		assertEquals("Newport News", customers.get(3545).getCity());
	}

	@Test
	@DisplayName("Record 3546: County is Newport News City")
	void CountyOfRecord3546() {
		assertEquals("Newport News City", customers.get(3545).getCounty());
	}

	@Test
	@DisplayName("Record 3546: State is VA")
	void StateOfRecord3546() {
		assertEquals("VA", customers.get(3545).getState());
	}

	@Test
	@DisplayName("Record 3546: ZIP is 23606")
	void ZIPOfRecord3546() {
		assertEquals("23606", customers.get(3545).getZIP());
	}

	@Test
	@DisplayName("Record 3546: Phone is 757-599-6241")
	void PhoneOfRecord3546() {
		assertEquals("757-599-6241", customers.get(3545).getPhone());
	}

	@Test
	@DisplayName("Record 3546: Fax is 757-599-9322")
	void FaxOfRecord3546() {
		assertEquals("757-599-9322", customers.get(3545).getFax());
	}

	@Test
	@DisplayName("Record 3546: Email is haley@mccay.com")
	void EmailOfRecord3546() {
		assertEquals("haley@mccay.com", customers.get(3545).getEmail());
	}

	@Test
	@DisplayName("Record 3546: Web is http://www.haleymccay.com")
	void WebOfRecord3546() {
		assertEquals("http://www.haleymccay.com", customers.get(3545).getWeb());
	}
}
