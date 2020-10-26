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

@Tag("30")
class Record_916 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 916: FirstName is Blair")
	void FirstNameOfRecord916() {
		assertEquals("Blair", customers.get(915).getFirstName());
	}

	@Test
	@DisplayName("Record 916: LastName is Beschorner")
	void LastNameOfRecord916() {
		assertEquals("Beschorner", customers.get(915).getLastName());
	}

	@Test
	@DisplayName("Record 916: Company is M J Graphics")
	void CompanyOfRecord916() {
		assertEquals("M J Graphics", customers.get(915).getCompany());
	}

	@Test
	@DisplayName("Record 916: Address is 6100 S New England Ave")
	void AddressOfRecord916() {
		assertEquals("6100 S New England Ave", customers.get(915).getAddress());
	}

	@Test
	@DisplayName("Record 916: City is Chicago")
	void CityOfRecord916() {
		assertEquals("Chicago", customers.get(915).getCity());
	}

	@Test
	@DisplayName("Record 916: County is Cook")
	void CountyOfRecord916() {
		assertEquals("Cook", customers.get(915).getCounty());
	}

	@Test
	@DisplayName("Record 916: State is IL")
	void StateOfRecord916() {
		assertEquals("IL", customers.get(915).getState());
	}

	@Test
	@DisplayName("Record 916: ZIP is 60638")
	void ZIPOfRecord916() {
		assertEquals("60638", customers.get(915).getZIP());
	}

	@Test
	@DisplayName("Record 916: Phone is 773-586-0559")
	void PhoneOfRecord916() {
		assertEquals("773-586-0559", customers.get(915).getPhone());
	}

	@Test
	@DisplayName("Record 916: Fax is 773-586-3313")
	void FaxOfRecord916() {
		assertEquals("773-586-3313", customers.get(915).getFax());
	}

	@Test
	@DisplayName("Record 916: Email is blair@beschorner.com")
	void EmailOfRecord916() {
		assertEquals("blair@beschorner.com", customers.get(915).getEmail());
	}

	@Test
	@DisplayName("Record 916: Web is http://www.blairbeschorner.com")
	void WebOfRecord916() {
		assertEquals("http://www.blairbeschorner.com", customers.get(915).getWeb());
	}
}
