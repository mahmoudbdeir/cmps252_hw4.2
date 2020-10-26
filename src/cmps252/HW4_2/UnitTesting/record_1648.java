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

@Tag("8")
class Record_1648 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1648: FirstName is Estella")
	void FirstNameOfRecord1648() {
		assertEquals("Estella", customers.get(1647).getFirstName());
	}

	@Test
	@DisplayName("Record 1648: LastName is Freshour")
	void LastNameOfRecord1648() {
		assertEquals("Freshour", customers.get(1647).getLastName());
	}

	@Test
	@DisplayName("Record 1648: Company is Eastern Flame Hardening Co")
	void CompanyOfRecord1648() {
		assertEquals("Eastern Flame Hardening Co", customers.get(1647).getCompany());
	}

	@Test
	@DisplayName("Record 1648: Address is 3111 S Valley View Bld  #-k106")
	void AddressOfRecord1648() {
		assertEquals("3111 S Valley View Bld  #-k106", customers.get(1647).getAddress());
	}

	@Test
	@DisplayName("Record 1648: City is Las Vegas")
	void CityOfRecord1648() {
		assertEquals("Las Vegas", customers.get(1647).getCity());
	}

	@Test
	@DisplayName("Record 1648: County is Clark")
	void CountyOfRecord1648() {
		assertEquals("Clark", customers.get(1647).getCounty());
	}

	@Test
	@DisplayName("Record 1648: State is NV")
	void StateOfRecord1648() {
		assertEquals("NV", customers.get(1647).getState());
	}

	@Test
	@DisplayName("Record 1648: ZIP is 89102")
	void ZIPOfRecord1648() {
		assertEquals("89102", customers.get(1647).getZIP());
	}

	@Test
	@DisplayName("Record 1648: Phone is 702-871-8651")
	void PhoneOfRecord1648() {
		assertEquals("702-871-8651", customers.get(1647).getPhone());
	}

	@Test
	@DisplayName("Record 1648: Fax is 702-871-6166")
	void FaxOfRecord1648() {
		assertEquals("702-871-6166", customers.get(1647).getFax());
	}

	@Test
	@DisplayName("Record 1648: Email is estella@freshour.com")
	void EmailOfRecord1648() {
		assertEquals("estella@freshour.com", customers.get(1647).getEmail());
	}

	@Test
	@DisplayName("Record 1648: Web is http://www.estellafreshour.com")
	void WebOfRecord1648() {
		assertEquals("http://www.estellafreshour.com", customers.get(1647).getWeb());
	}
}
