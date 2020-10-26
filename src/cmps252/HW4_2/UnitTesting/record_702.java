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

@Tag("22")
class Record_702 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 702: FirstName is Lionel")
	void FirstNameOfRecord702() {
		assertEquals("Lionel", customers.get(701).getFirstName());
	}

	@Test
	@DisplayName("Record 702: LastName is Hudmon")
	void LastNameOfRecord702() {
		assertEquals("Hudmon", customers.get(701).getLastName());
	}

	@Test
	@DisplayName("Record 702: Company is Cass, Bertrand M Jr")
	void CompanyOfRecord702() {
		assertEquals("Cass, Bertrand M Jr", customers.get(701).getCompany());
	}

	@Test
	@DisplayName("Record 702: Address is 555 Coolidge St")
	void AddressOfRecord702() {
		assertEquals("555 Coolidge St", customers.get(701).getAddress());
	}

	@Test
	@DisplayName("Record 702: City is New Orleans")
	void CityOfRecord702() {
		assertEquals("New Orleans", customers.get(701).getCity());
	}

	@Test
	@DisplayName("Record 702: County is Jefferson")
	void CountyOfRecord702() {
		assertEquals("Jefferson", customers.get(701).getCounty());
	}

	@Test
	@DisplayName("Record 702: State is LA")
	void StateOfRecord702() {
		assertEquals("LA", customers.get(701).getState());
	}

	@Test
	@DisplayName("Record 702: ZIP is 70121")
	void ZIPOfRecord702() {
		assertEquals("70121", customers.get(701).getZIP());
	}

	@Test
	@DisplayName("Record 702: Phone is 504-835-1557")
	void PhoneOfRecord702() {
		assertEquals("504-835-1557", customers.get(701).getPhone());
	}

	@Test
	@DisplayName("Record 702: Fax is 504-835-2015")
	void FaxOfRecord702() {
		assertEquals("504-835-2015", customers.get(701).getFax());
	}

	@Test
	@DisplayName("Record 702: Email is lionel@hudmon.com")
	void EmailOfRecord702() {
		assertEquals("lionel@hudmon.com", customers.get(701).getEmail());
	}

	@Test
	@DisplayName("Record 702: Web is http://www.lionelhudmon.com")
	void WebOfRecord702() {
		assertEquals("http://www.lionelhudmon.com", customers.get(701).getWeb());
	}
}
