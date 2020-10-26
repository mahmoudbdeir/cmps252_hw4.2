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

@Tag("14")
class Record_677 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 677: FirstName is Cathy")
	void FirstNameOfRecord677() {
		assertEquals("Cathy", customers.get(676).getFirstName());
	}

	@Test
	@DisplayName("Record 677: LastName is Clynes")
	void LastNameOfRecord677() {
		assertEquals("Clynes", customers.get(676).getLastName());
	}

	@Test
	@DisplayName("Record 677: Company is Waddell Realty Co")
	void CompanyOfRecord677() {
		assertEquals("Waddell Realty Co", customers.get(676).getCompany());
	}

	@Test
	@DisplayName("Record 677: Address is 5601 W National Ave")
	void AddressOfRecord677() {
		assertEquals("5601 W National Ave", customers.get(676).getAddress());
	}

	@Test
	@DisplayName("Record 677: City is Milwaukee")
	void CityOfRecord677() {
		assertEquals("Milwaukee", customers.get(676).getCity());
	}

	@Test
	@DisplayName("Record 677: County is Milwaukee")
	void CountyOfRecord677() {
		assertEquals("Milwaukee", customers.get(676).getCounty());
	}

	@Test
	@DisplayName("Record 677: State is WI")
	void StateOfRecord677() {
		assertEquals("WI", customers.get(676).getState());
	}

	@Test
	@DisplayName("Record 677: ZIP is 53214")
	void ZIPOfRecord677() {
		assertEquals("53214", customers.get(676).getZIP());
	}

	@Test
	@DisplayName("Record 677: Phone is 414-258-1628")
	void PhoneOfRecord677() {
		assertEquals("414-258-1628", customers.get(676).getPhone());
	}

	@Test
	@DisplayName("Record 677: Fax is 414-258-7844")
	void FaxOfRecord677() {
		assertEquals("414-258-7844", customers.get(676).getFax());
	}

	@Test
	@DisplayName("Record 677: Email is cathy@clynes.com")
	void EmailOfRecord677() {
		assertEquals("cathy@clynes.com", customers.get(676).getEmail());
	}

	@Test
	@DisplayName("Record 677: Web is http://www.cathyclynes.com")
	void WebOfRecord677() {
		assertEquals("http://www.cathyclynes.com", customers.get(676).getWeb());
	}
}
