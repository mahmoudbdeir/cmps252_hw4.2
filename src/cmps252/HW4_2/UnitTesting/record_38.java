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

@Tag("49")
class Record_38 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 38: FirstName is Wade")
	void FirstNameOfRecord38() {
		assertEquals("Wade", customers.get(37).getFirstName());
	}

	@Test
	@DisplayName("Record 38: LastName is Staubin")
	void LastNameOfRecord38() {
		assertEquals("Staubin", customers.get(37).getLastName());
	}

	@Test
	@DisplayName("Record 38: Company is Clarks Mrs Foods Inc")
	void CompanyOfRecord38() {
		assertEquals("Clarks Mrs Foods Inc", customers.get(37).getCompany());
	}

	@Test
	@DisplayName("Record 38: Address is 2700 S Clinton Ave")
	void AddressOfRecord38() {
		assertEquals("2700 S Clinton Ave", customers.get(37).getAddress());
	}

	@Test
	@DisplayName("Record 38: City is South Plainfield")
	void CityOfRecord38() {
		assertEquals("South Plainfield", customers.get(37).getCity());
	}

	@Test
	@DisplayName("Record 38: County is Middlesex")
	void CountyOfRecord38() {
		assertEquals("Middlesex", customers.get(37).getCounty());
	}

	@Test
	@DisplayName("Record 38: State is NJ")
	void StateOfRecord38() {
		assertEquals("NJ", customers.get(37).getState());
	}

	@Test
	@DisplayName("Record 38: ZIP is 7080")
	void ZIPOfRecord38() {
		assertEquals("7080", customers.get(37).getZIP());
	}

	@Test
	@DisplayName("Record 38: Phone is 908-561-6197")
	void PhoneOfRecord38() {
		assertEquals("908-561-6197", customers.get(37).getPhone());
	}

	@Test
	@DisplayName("Record 38: Fax is 908-561-6536")
	void FaxOfRecord38() {
		assertEquals("908-561-6536", customers.get(37).getFax());
	}

	@Test
	@DisplayName("Record 38: Email is wade@staubin.com")
	void EmailOfRecord38() {
		assertEquals("wade@staubin.com", customers.get(37).getEmail());
	}

	@Test
	@DisplayName("Record 38: Web is http://www.wadestaubin.com")
	void WebOfRecord38() {
		assertEquals("http://www.wadestaubin.com", customers.get(37).getWeb());
	}
}
