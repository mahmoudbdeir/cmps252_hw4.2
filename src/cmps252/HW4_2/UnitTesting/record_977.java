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

@Tag("13")
class Record_977 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 977: FirstName is Chantel")
	void FirstNameOfRecord977() {
		assertEquals("Chantel", customers.get(976).getFirstName());
	}

	@Test
	@DisplayName("Record 977: LastName is Chmiel")
	void LastNameOfRecord977() {
		assertEquals("Chmiel", customers.get(976).getLastName());
	}

	@Test
	@DisplayName("Record 977: Company is Barton County Electric Cooprtv")
	void CompanyOfRecord977() {
		assertEquals("Barton County Electric Cooprtv", customers.get(976).getCompany());
	}

	@Test
	@DisplayName("Record 977: Address is 5605 S Westshore Blvd")
	void AddressOfRecord977() {
		assertEquals("5605 S Westshore Blvd", customers.get(976).getAddress());
	}

	@Test
	@DisplayName("Record 977: City is Tampa")
	void CityOfRecord977() {
		assertEquals("Tampa", customers.get(976).getCity());
	}

	@Test
	@DisplayName("Record 977: County is Hillsborough")
	void CountyOfRecord977() {
		assertEquals("Hillsborough", customers.get(976).getCounty());
	}

	@Test
	@DisplayName("Record 977: State is FL")
	void StateOfRecord977() {
		assertEquals("FL", customers.get(976).getState());
	}

	@Test
	@DisplayName("Record 977: ZIP is 33616")
	void ZIPOfRecord977() {
		assertEquals("33616", customers.get(976).getZIP());
	}

	@Test
	@DisplayName("Record 977: Phone is 813-831-0220")
	void PhoneOfRecord977() {
		assertEquals("813-831-0220", customers.get(976).getPhone());
	}

	@Test
	@DisplayName("Record 977: Fax is 813-831-4041")
	void FaxOfRecord977() {
		assertEquals("813-831-4041", customers.get(976).getFax());
	}

	@Test
	@DisplayName("Record 977: Email is chantel@chmiel.com")
	void EmailOfRecord977() {
		assertEquals("chantel@chmiel.com", customers.get(976).getEmail());
	}

	@Test
	@DisplayName("Record 977: Web is http://www.chantelchmiel.com")
	void WebOfRecord977() {
		assertEquals("http://www.chantelchmiel.com", customers.get(976).getWeb());
	}
}
