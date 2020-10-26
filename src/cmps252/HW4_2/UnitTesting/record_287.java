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
class Record_287 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 287: FirstName is Lyndon")
	void FirstNameOfRecord287() {
		assertEquals("Lyndon", customers.get(286).getFirstName());
	}

	@Test
	@DisplayName("Record 287: LastName is Aydlett")
	void LastNameOfRecord287() {
		assertEquals("Aydlett", customers.get(286).getLastName());
	}

	@Test
	@DisplayName("Record 287: Company is Btg Inc")
	void CompanyOfRecord287() {
		assertEquals("Btg Inc", customers.get(286).getCompany());
	}

	@Test
	@DisplayName("Record 287: Address is 154 E Main St")
	void AddressOfRecord287() {
		assertEquals("154 E Main St", customers.get(286).getAddress());
	}

	@Test
	@DisplayName("Record 287: City is Manchester")
	void CityOfRecord287() {
		assertEquals("Manchester", customers.get(286).getCity());
	}

	@Test
	@DisplayName("Record 287: County is Washtenaw")
	void CountyOfRecord287() {
		assertEquals("Washtenaw", customers.get(286).getCounty());
	}

	@Test
	@DisplayName("Record 287: State is MI")
	void StateOfRecord287() {
		assertEquals("MI", customers.get(286).getState());
	}

	@Test
	@DisplayName("Record 287: ZIP is 48158")
	void ZIPOfRecord287() {
		assertEquals("48158", customers.get(286).getZIP());
	}

	@Test
	@DisplayName("Record 287: Phone is 734-428-2672")
	void PhoneOfRecord287() {
		assertEquals("734-428-2672", customers.get(286).getPhone());
	}

	@Test
	@DisplayName("Record 287: Fax is 734-428-2181")
	void FaxOfRecord287() {
		assertEquals("734-428-2181", customers.get(286).getFax());
	}

	@Test
	@DisplayName("Record 287: Email is lyndon@aydlett.com")
	void EmailOfRecord287() {
		assertEquals("lyndon@aydlett.com", customers.get(286).getEmail());
	}

	@Test
	@DisplayName("Record 287: Web is http://www.lyndonaydlett.com")
	void WebOfRecord287() {
		assertEquals("http://www.lyndonaydlett.com", customers.get(286).getWeb());
	}
}
