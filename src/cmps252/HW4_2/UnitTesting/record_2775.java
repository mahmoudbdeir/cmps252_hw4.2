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

@Tag("46")
class Record_2775 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2775: FirstName is Elva")
	void FirstNameOfRecord2775() {
		assertEquals("Elva", customers.get(2774).getFirstName());
	}

	@Test
	@DisplayName("Record 2775: LastName is Neally")
	void LastNameOfRecord2775() {
		assertEquals("Neally", customers.get(2774).getLastName());
	}

	@Test
	@DisplayName("Record 2775: Company is Industrial Mineral Research")
	void CompanyOfRecord2775() {
		assertEquals("Industrial Mineral Research", customers.get(2774).getCompany());
	}

	@Test
	@DisplayName("Record 2775: Address is 1221 S Broadway St")
	void AddressOfRecord2775() {
		assertEquals("1221 S Broadway St", customers.get(2774).getAddress());
	}

	@Test
	@DisplayName("Record 2775: City is Wichita")
	void CityOfRecord2775() {
		assertEquals("Wichita", customers.get(2774).getCity());
	}

	@Test
	@DisplayName("Record 2775: County is Sedgwick")
	void CountyOfRecord2775() {
		assertEquals("Sedgwick", customers.get(2774).getCounty());
	}

	@Test
	@DisplayName("Record 2775: State is KS")
	void StateOfRecord2775() {
		assertEquals("KS", customers.get(2774).getState());
	}

	@Test
	@DisplayName("Record 2775: ZIP is 67211")
	void ZIPOfRecord2775() {
		assertEquals("67211", customers.get(2774).getZIP());
	}

	@Test
	@DisplayName("Record 2775: Phone is 316-262-6201")
	void PhoneOfRecord2775() {
		assertEquals("316-262-6201", customers.get(2774).getPhone());
	}

	@Test
	@DisplayName("Record 2775: Fax is 316-262-8549")
	void FaxOfRecord2775() {
		assertEquals("316-262-8549", customers.get(2774).getFax());
	}

	@Test
	@DisplayName("Record 2775: Email is elva@neally.com")
	void EmailOfRecord2775() {
		assertEquals("elva@neally.com", customers.get(2774).getEmail());
	}

	@Test
	@DisplayName("Record 2775: Web is http://www.elvaneally.com")
	void WebOfRecord2775() {
		assertEquals("http://www.elvaneally.com", customers.get(2774).getWeb());
	}
}
