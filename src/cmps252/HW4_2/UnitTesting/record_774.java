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

@Tag("10")
class Record_774 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 774: FirstName is Iva")
	void FirstNameOfRecord774() {
		assertEquals("Iva", customers.get(773).getFirstName());
	}

	@Test
	@DisplayName("Record 774: LastName is Sculley")
	void LastNameOfRecord774() {
		assertEquals("Sculley", customers.get(773).getLastName());
	}

	@Test
	@DisplayName("Record 774: Company is Maines Own Treats")
	void CompanyOfRecord774() {
		assertEquals("Maines Own Treats", customers.get(773).getCompany());
	}

	@Test
	@DisplayName("Record 774: Address is 618 Delaware Ave")
	void AddressOfRecord774() {
		assertEquals("618 Delaware Ave", customers.get(773).getAddress());
	}

	@Test
	@DisplayName("Record 774: City is Albany")
	void CityOfRecord774() {
		assertEquals("Albany", customers.get(773).getCity());
	}

	@Test
	@DisplayName("Record 774: County is Albany")
	void CountyOfRecord774() {
		assertEquals("Albany", customers.get(773).getCounty());
	}

	@Test
	@DisplayName("Record 774: State is NY")
	void StateOfRecord774() {
		assertEquals("NY", customers.get(773).getState());
	}

	@Test
	@DisplayName("Record 774: ZIP is 12209")
	void ZIPOfRecord774() {
		assertEquals("12209", customers.get(773).getZIP());
	}

	@Test
	@DisplayName("Record 774: Phone is 518-426-8672")
	void PhoneOfRecord774() {
		assertEquals("518-426-8672", customers.get(773).getPhone());
	}

	@Test
	@DisplayName("Record 774: Fax is 518-426-8037")
	void FaxOfRecord774() {
		assertEquals("518-426-8037", customers.get(773).getFax());
	}

	@Test
	@DisplayName("Record 774: Email is iva@sculley.com")
	void EmailOfRecord774() {
		assertEquals("iva@sculley.com", customers.get(773).getEmail());
	}

	@Test
	@DisplayName("Record 774: Web is http://www.ivasculley.com")
	void WebOfRecord774() {
		assertEquals("http://www.ivasculley.com", customers.get(773).getWeb());
	}
}
