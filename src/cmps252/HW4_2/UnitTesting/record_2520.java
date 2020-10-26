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

@Tag("31")
class Record_2520 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2520: FirstName is Elijah")
	void FirstNameOfRecord2520() {
		assertEquals("Elijah", customers.get(2519).getFirstName());
	}

	@Test
	@DisplayName("Record 2520: LastName is Myts")
	void LastNameOfRecord2520() {
		assertEquals("Myts", customers.get(2519).getLastName());
	}

	@Test
	@DisplayName("Record 2520: Company is Wilkins Creative Printing")
	void CompanyOfRecord2520() {
		assertEquals("Wilkins Creative Printing", customers.get(2519).getCompany());
	}

	@Test
	@DisplayName("Record 2520: Address is 300 Railway Ave")
	void AddressOfRecord2520() {
		assertEquals("300 Railway Ave", customers.get(2519).getAddress());
	}

	@Test
	@DisplayName("Record 2520: City is Campbell")
	void CityOfRecord2520() {
		assertEquals("Campbell", customers.get(2519).getCity());
	}

	@Test
	@DisplayName("Record 2520: County is Santa Clara")
	void CountyOfRecord2520() {
		assertEquals("Santa Clara", customers.get(2519).getCounty());
	}

	@Test
	@DisplayName("Record 2520: State is CA")
	void StateOfRecord2520() {
		assertEquals("CA", customers.get(2519).getState());
	}

	@Test
	@DisplayName("Record 2520: ZIP is 95008")
	void ZIPOfRecord2520() {
		assertEquals("95008", customers.get(2519).getZIP());
	}

	@Test
	@DisplayName("Record 2520: Phone is 408-379-9407")
	void PhoneOfRecord2520() {
		assertEquals("408-379-9407", customers.get(2519).getPhone());
	}

	@Test
	@DisplayName("Record 2520: Fax is 408-379-7736")
	void FaxOfRecord2520() {
		assertEquals("408-379-7736", customers.get(2519).getFax());
	}

	@Test
	@DisplayName("Record 2520: Email is elijah@myts.com")
	void EmailOfRecord2520() {
		assertEquals("elijah@myts.com", customers.get(2519).getEmail());
	}

	@Test
	@DisplayName("Record 2520: Web is http://www.elijahmyts.com")
	void WebOfRecord2520() {
		assertEquals("http://www.elijahmyts.com", customers.get(2519).getWeb());
	}
}
