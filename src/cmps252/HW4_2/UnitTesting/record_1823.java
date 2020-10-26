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

@Tag("29")
class Record_1823 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1823: FirstName is Carmen")
	void FirstNameOfRecord1823() {
		assertEquals("Carmen", customers.get(1822).getFirstName());
	}

	@Test
	@DisplayName("Record 1823: LastName is Miramontes")
	void LastNameOfRecord1823() {
		assertEquals("Miramontes", customers.get(1822).getLastName());
	}

	@Test
	@DisplayName("Record 1823: Company is Pro Mark Corp")
	void CompanyOfRecord1823() {
		assertEquals("Pro Mark Corp", customers.get(1822).getCompany());
	}

	@Test
	@DisplayName("Record 1823: Address is 3313 Elizabeth Ave")
	void AddressOfRecord1823() {
		assertEquals("3313 Elizabeth Ave", customers.get(1822).getAddress());
	}

	@Test
	@DisplayName("Record 1823: City is Wilmington")
	void CityOfRecord1823() {
		assertEquals("Wilmington", customers.get(1822).getCity());
	}

	@Test
	@DisplayName("Record 1823: County is New Castle")
	void CountyOfRecord1823() {
		assertEquals("New Castle", customers.get(1822).getCounty());
	}

	@Test
	@DisplayName("Record 1823: State is DE")
	void StateOfRecord1823() {
		assertEquals("DE", customers.get(1822).getState());
	}

	@Test
	@DisplayName("Record 1823: ZIP is 19808")
	void ZIPOfRecord1823() {
		assertEquals("19808", customers.get(1822).getZIP());
	}

	@Test
	@DisplayName("Record 1823: Phone is 302-999-1896")
	void PhoneOfRecord1823() {
		assertEquals("302-999-1896", customers.get(1822).getPhone());
	}

	@Test
	@DisplayName("Record 1823: Fax is 302-999-2893")
	void FaxOfRecord1823() {
		assertEquals("302-999-2893", customers.get(1822).getFax());
	}

	@Test
	@DisplayName("Record 1823: Email is carmen@miramontes.com")
	void EmailOfRecord1823() {
		assertEquals("carmen@miramontes.com", customers.get(1822).getEmail());
	}

	@Test
	@DisplayName("Record 1823: Web is http://www.carmenmiramontes.com")
	void WebOfRecord1823() {
		assertEquals("http://www.carmenmiramontes.com", customers.get(1822).getWeb());
	}
}
