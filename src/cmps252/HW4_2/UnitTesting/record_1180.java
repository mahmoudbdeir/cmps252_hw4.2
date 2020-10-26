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

@Tag("41")
class Record_1180 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1180: FirstName is Dannie")
	void FirstNameOfRecord1180() {
		assertEquals("Dannie", customers.get(1179).getFirstName());
	}

	@Test
	@DisplayName("Record 1180: LastName is Lysaght")
	void LastNameOfRecord1180() {
		assertEquals("Lysaght", customers.get(1179).getLastName());
	}

	@Test
	@DisplayName("Record 1180: Company is Devine, Daniel C Jr")
	void CompanyOfRecord1180() {
		assertEquals("Devine, Daniel C Jr", customers.get(1179).getCompany());
	}

	@Test
	@DisplayName("Record 1180: Address is 545 8th Ave")
	void AddressOfRecord1180() {
		assertEquals("545 8th Ave", customers.get(1179).getAddress());
	}

	@Test
	@DisplayName("Record 1180: City is New York")
	void CityOfRecord1180() {
		assertEquals("New York", customers.get(1179).getCity());
	}

	@Test
	@DisplayName("Record 1180: County is New York")
	void CountyOfRecord1180() {
		assertEquals("New York", customers.get(1179).getCounty());
	}

	@Test
	@DisplayName("Record 1180: State is NY")
	void StateOfRecord1180() {
		assertEquals("NY", customers.get(1179).getState());
	}

	@Test
	@DisplayName("Record 1180: ZIP is 10018")
	void ZIPOfRecord1180() {
		assertEquals("10018", customers.get(1179).getZIP());
	}

	@Test
	@DisplayName("Record 1180: Phone is 212-564-6231")
	void PhoneOfRecord1180() {
		assertEquals("212-564-6231", customers.get(1179).getPhone());
	}

	@Test
	@DisplayName("Record 1180: Fax is 212-564-7679")
	void FaxOfRecord1180() {
		assertEquals("212-564-7679", customers.get(1179).getFax());
	}

	@Test
	@DisplayName("Record 1180: Email is dannie@lysaght.com")
	void EmailOfRecord1180() {
		assertEquals("dannie@lysaght.com", customers.get(1179).getEmail());
	}

	@Test
	@DisplayName("Record 1180: Web is http://www.dannielysaght.com")
	void WebOfRecord1180() {
		assertEquals("http://www.dannielysaght.com", customers.get(1179).getWeb());
	}
}
