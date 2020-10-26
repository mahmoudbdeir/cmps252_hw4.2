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

@Tag("3")
class Record_2166 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2166: FirstName is Nichole")
	void FirstNameOfRecord2166() {
		assertEquals("Nichole", customers.get(2165).getFirstName());
	}

	@Test
	@DisplayName("Record 2166: LastName is Metevier")
	void LastNameOfRecord2166() {
		assertEquals("Metevier", customers.get(2165).getLastName());
	}

	@Test
	@DisplayName("Record 2166: Company is Cockle, Richard")
	void CompanyOfRecord2166() {
		assertEquals("Cockle, Richard", customers.get(2165).getCompany());
	}

	@Test
	@DisplayName("Record 2166: Address is 1611 N Interstate 35")
	void AddressOfRecord2166() {
		assertEquals("1611 N Interstate 35", customers.get(2165).getAddress());
	}

	@Test
	@DisplayName("Record 2166: City is Carrollton")
	void CityOfRecord2166() {
		assertEquals("Carrollton", customers.get(2165).getCity());
	}

	@Test
	@DisplayName("Record 2166: County is Dallas")
	void CountyOfRecord2166() {
		assertEquals("Dallas", customers.get(2165).getCounty());
	}

	@Test
	@DisplayName("Record 2166: State is TX")
	void StateOfRecord2166() {
		assertEquals("TX", customers.get(2165).getState());
	}

	@Test
	@DisplayName("Record 2166: ZIP is 75006")
	void ZIPOfRecord2166() {
		assertEquals("75006", customers.get(2165).getZIP());
	}

	@Test
	@DisplayName("Record 2166: Phone is 972-466-0591")
	void PhoneOfRecord2166() {
		assertEquals("972-466-0591", customers.get(2165).getPhone());
	}

	@Test
	@DisplayName("Record 2166: Fax is 972-466-9981")
	void FaxOfRecord2166() {
		assertEquals("972-466-9981", customers.get(2165).getFax());
	}

	@Test
	@DisplayName("Record 2166: Email is nichole@metevier.com")
	void EmailOfRecord2166() {
		assertEquals("nichole@metevier.com", customers.get(2165).getEmail());
	}

	@Test
	@DisplayName("Record 2166: Web is http://www.nicholemetevier.com")
	void WebOfRecord2166() {
		assertEquals("http://www.nicholemetevier.com", customers.get(2165).getWeb());
	}
}
