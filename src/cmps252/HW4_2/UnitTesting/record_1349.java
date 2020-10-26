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

@Tag("2")
class Record_1349 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1349: FirstName is Jessie")
	void FirstNameOfRecord1349() {
		assertEquals("Jessie", customers.get(1348).getFirstName());
	}

	@Test
	@DisplayName("Record 1349: LastName is Buerk")
	void LastNameOfRecord1349() {
		assertEquals("Buerk", customers.get(1348).getLastName());
	}

	@Test
	@DisplayName("Record 1349: Company is Wilson, Elizabeth D Esq")
	void CompanyOfRecord1349() {
		assertEquals("Wilson, Elizabeth D Esq", customers.get(1348).getCompany());
	}

	@Test
	@DisplayName("Record 1349: Address is 1753 Milton Ave")
	void AddressOfRecord1349() {
		assertEquals("1753 Milton Ave", customers.get(1348).getAddress());
	}

	@Test
	@DisplayName("Record 1349: City is Syracuse")
	void CityOfRecord1349() {
		assertEquals("Syracuse", customers.get(1348).getCity());
	}

	@Test
	@DisplayName("Record 1349: County is Onondaga")
	void CountyOfRecord1349() {
		assertEquals("Onondaga", customers.get(1348).getCounty());
	}

	@Test
	@DisplayName("Record 1349: State is NY")
	void StateOfRecord1349() {
		assertEquals("NY", customers.get(1348).getState());
	}

	@Test
	@DisplayName("Record 1349: ZIP is 13209")
	void ZIPOfRecord1349() {
		assertEquals("13209", customers.get(1348).getZIP());
	}

	@Test
	@DisplayName("Record 1349: Phone is 315-488-8971")
	void PhoneOfRecord1349() {
		assertEquals("315-488-8971", customers.get(1348).getPhone());
	}

	@Test
	@DisplayName("Record 1349: Fax is 315-488-1843")
	void FaxOfRecord1349() {
		assertEquals("315-488-1843", customers.get(1348).getFax());
	}

	@Test
	@DisplayName("Record 1349: Email is jessie@buerk.com")
	void EmailOfRecord1349() {
		assertEquals("jessie@buerk.com", customers.get(1348).getEmail());
	}

	@Test
	@DisplayName("Record 1349: Web is http://www.jessiebuerk.com")
	void WebOfRecord1349() {
		assertEquals("http://www.jessiebuerk.com", customers.get(1348).getWeb());
	}
}
