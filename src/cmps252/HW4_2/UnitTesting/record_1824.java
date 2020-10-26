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

@Tag("47")
class Record_1824 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1824: FirstName is Maudie")
	void FirstNameOfRecord1824() {
		assertEquals("Maudie", customers.get(1823).getFirstName());
	}

	@Test
	@DisplayName("Record 1824: LastName is Skaar")
	void LastNameOfRecord1824() {
		assertEquals("Skaar", customers.get(1823).getLastName());
	}

	@Test
	@DisplayName("Record 1824: Company is Winbco Tank Company")
	void CompanyOfRecord1824() {
		assertEquals("Winbco Tank Company", customers.get(1823).getCompany());
	}

	@Test
	@DisplayName("Record 1824: Address is 3559 Greenwood Ave")
	void AddressOfRecord1824() {
		assertEquals("3559 Greenwood Ave", customers.get(1823).getAddress());
	}

	@Test
	@DisplayName("Record 1824: City is Los Angeles")
	void CityOfRecord1824() {
		assertEquals("Los Angeles", customers.get(1823).getCity());
	}

	@Test
	@DisplayName("Record 1824: County is Los Angeles")
	void CountyOfRecord1824() {
		assertEquals("Los Angeles", customers.get(1823).getCounty());
	}

	@Test
	@DisplayName("Record 1824: State is CA")
	void StateOfRecord1824() {
		assertEquals("CA", customers.get(1823).getState());
	}

	@Test
	@DisplayName("Record 1824: ZIP is 90040")
	void ZIPOfRecord1824() {
		assertEquals("90040", customers.get(1823).getZIP());
	}

	@Test
	@DisplayName("Record 1824: Phone is 323-725-1285")
	void PhoneOfRecord1824() {
		assertEquals("323-725-1285", customers.get(1823).getPhone());
	}

	@Test
	@DisplayName("Record 1824: Fax is 323-725-7253")
	void FaxOfRecord1824() {
		assertEquals("323-725-7253", customers.get(1823).getFax());
	}

	@Test
	@DisplayName("Record 1824: Email is maudie@skaar.com")
	void EmailOfRecord1824() {
		assertEquals("maudie@skaar.com", customers.get(1823).getEmail());
	}

	@Test
	@DisplayName("Record 1824: Web is http://www.maudieskaar.com")
	void WebOfRecord1824() {
		assertEquals("http://www.maudieskaar.com", customers.get(1823).getWeb());
	}
}
