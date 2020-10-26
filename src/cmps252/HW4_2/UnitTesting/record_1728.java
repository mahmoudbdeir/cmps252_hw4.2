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

@Tag("17")
class Record_1728 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1728: FirstName is Bobbie")
	void FirstNameOfRecord1728() {
		assertEquals("Bobbie", customers.get(1727).getFirstName());
	}

	@Test
	@DisplayName("Record 1728: LastName is Takashima")
	void LastNameOfRecord1728() {
		assertEquals("Takashima", customers.get(1727).getLastName());
	}

	@Test
	@DisplayName("Record 1728: Company is Greenblum, Robert Md")
	void CompanyOfRecord1728() {
		assertEquals("Greenblum, Robert Md", customers.get(1727).getCompany());
	}

	@Test
	@DisplayName("Record 1728: Address is 231 Sand Island Accesse")
	void AddressOfRecord1728() {
		assertEquals("231 Sand Island Accesse", customers.get(1727).getAddress());
	}

	@Test
	@DisplayName("Record 1728: City is Honolulu")
	void CityOfRecord1728() {
		assertEquals("Honolulu", customers.get(1727).getCity());
	}

	@Test
	@DisplayName("Record 1728: County is Honolulu")
	void CountyOfRecord1728() {
		assertEquals("Honolulu", customers.get(1727).getCounty());
	}

	@Test
	@DisplayName("Record 1728: State is HI")
	void StateOfRecord1728() {
		assertEquals("HI", customers.get(1727).getState());
	}

	@Test
	@DisplayName("Record 1728: ZIP is 96819")
	void ZIPOfRecord1728() {
		assertEquals("96819", customers.get(1727).getZIP());
	}

	@Test
	@DisplayName("Record 1728: Phone is 808-848-9854")
	void PhoneOfRecord1728() {
		assertEquals("808-848-9854", customers.get(1727).getPhone());
	}

	@Test
	@DisplayName("Record 1728: Fax is 808-848-7287")
	void FaxOfRecord1728() {
		assertEquals("808-848-7287", customers.get(1727).getFax());
	}

	@Test
	@DisplayName("Record 1728: Email is bobbie@takashima.com")
	void EmailOfRecord1728() {
		assertEquals("bobbie@takashima.com", customers.get(1727).getEmail());
	}

	@Test
	@DisplayName("Record 1728: Web is http://www.bobbietakashima.com")
	void WebOfRecord1728() {
		assertEquals("http://www.bobbietakashima.com", customers.get(1727).getWeb());
	}
}
