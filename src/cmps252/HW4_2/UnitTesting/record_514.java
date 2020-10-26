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

@Tag("26")
class Record_514 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 514: FirstName is Gail")
	void FirstNameOfRecord514() {
		assertEquals("Gail", customers.get(513).getFirstName());
	}

	@Test
	@DisplayName("Record 514: LastName is Munstermann")
	void LastNameOfRecord514() {
		assertEquals("Munstermann", customers.get(513).getLastName());
	}

	@Test
	@DisplayName("Record 514: Company is J A Campoli & Sons")
	void CompanyOfRecord514() {
		assertEquals("J A Campoli & Sons", customers.get(513).getCompany());
	}

	@Test
	@DisplayName("Record 514: Address is 913 State Route 22")
	void AddressOfRecord514() {
		assertEquals("913 State Route 22", customers.get(513).getAddress());
	}

	@Test
	@DisplayName("Record 514: City is Fox River Grove")
	void CityOfRecord514() {
		assertEquals("Fox River Grove", customers.get(513).getCity());
	}

	@Test
	@DisplayName("Record 514: County is McHenry")
	void CountyOfRecord514() {
		assertEquals("McHenry", customers.get(513).getCounty());
	}

	@Test
	@DisplayName("Record 514: State is IL")
	void StateOfRecord514() {
		assertEquals("IL", customers.get(513).getState());
	}

	@Test
	@DisplayName("Record 514: ZIP is 60021")
	void ZIPOfRecord514() {
		assertEquals("60021", customers.get(513).getZIP());
	}

	@Test
	@DisplayName("Record 514: Phone is 847-381-2959")
	void PhoneOfRecord514() {
		assertEquals("847-381-2959", customers.get(513).getPhone());
	}

	@Test
	@DisplayName("Record 514: Fax is 847-381-6994")
	void FaxOfRecord514() {
		assertEquals("847-381-6994", customers.get(513).getFax());
	}

	@Test
	@DisplayName("Record 514: Email is gail@munstermann.com")
	void EmailOfRecord514() {
		assertEquals("gail@munstermann.com", customers.get(513).getEmail());
	}

	@Test
	@DisplayName("Record 514: Web is http://www.gailmunstermann.com")
	void WebOfRecord514() {
		assertEquals("http://www.gailmunstermann.com", customers.get(513).getWeb());
	}
}
