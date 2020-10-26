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

@Tag("11")
class Record_163 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 163: FirstName is Dong")
	void FirstNameOfRecord163() {
		assertEquals("Dong", customers.get(162).getFirstName());
	}

	@Test
	@DisplayName("Record 163: LastName is Bolick")
	void LastNameOfRecord163() {
		assertEquals("Bolick", customers.get(162).getLastName());
	}

	@Test
	@DisplayName("Record 163: Company is Georgetown Skating Center")
	void CompanyOfRecord163() {
		assertEquals("Georgetown Skating Center", customers.get(162).getCompany());
	}

	@Test
	@DisplayName("Record 163: Address is 2086 Central Ave")
	void AddressOfRecord163() {
		assertEquals("2086 Central Ave", customers.get(162).getAddress());
	}

	@Test
	@DisplayName("Record 163: City is Duarte")
	void CityOfRecord163() {
		assertEquals("Duarte", customers.get(162).getCity());
	}

	@Test
	@DisplayName("Record 163: County is Los Angeles")
	void CountyOfRecord163() {
		assertEquals("Los Angeles", customers.get(162).getCounty());
	}

	@Test
	@DisplayName("Record 163: State is CA")
	void StateOfRecord163() {
		assertEquals("CA", customers.get(162).getState());
	}

	@Test
	@DisplayName("Record 163: ZIP is 91010")
	void ZIPOfRecord163() {
		assertEquals("91010", customers.get(162).getZIP());
	}

	@Test
	@DisplayName("Record 163: Phone is 626-303-8909")
	void PhoneOfRecord163() {
		assertEquals("626-303-8909", customers.get(162).getPhone());
	}

	@Test
	@DisplayName("Record 163: Fax is 626-303-7626")
	void FaxOfRecord163() {
		assertEquals("626-303-7626", customers.get(162).getFax());
	}

	@Test
	@DisplayName("Record 163: Email is dong@bolick.com")
	void EmailOfRecord163() {
		assertEquals("dong@bolick.com", customers.get(162).getEmail());
	}

	@Test
	@DisplayName("Record 163: Web is http://www.dongbolick.com")
	void WebOfRecord163() {
		assertEquals("http://www.dongbolick.com", customers.get(162).getWeb());
	}
}
