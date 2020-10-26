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

@Tag("42")
class Record_2849 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2849: FirstName is Anderson")
	void FirstNameOfRecord2849() {
		assertEquals("Anderson", customers.get(2848).getFirstName());
	}

	@Test
	@DisplayName("Record 2849: LastName is Rayow")
	void LastNameOfRecord2849() {
		assertEquals("Rayow", customers.get(2848).getLastName());
	}

	@Test
	@DisplayName("Record 2849: Company is Main Street Auto Parts")
	void CompanyOfRecord2849() {
		assertEquals("Main Street Auto Parts", customers.get(2848).getCompany());
	}

	@Test
	@DisplayName("Record 2849: Address is 7002 N Little River Trnp")
	void AddressOfRecord2849() {
		assertEquals("7002 N Little River Trnp", customers.get(2848).getAddress());
	}

	@Test
	@DisplayName("Record 2849: City is Annandale")
	void CityOfRecord2849() {
		assertEquals("Annandale", customers.get(2848).getCity());
	}

	@Test
	@DisplayName("Record 2849: County is Fairfax")
	void CountyOfRecord2849() {
		assertEquals("Fairfax", customers.get(2848).getCounty());
	}

	@Test
	@DisplayName("Record 2849: State is VA")
	void StateOfRecord2849() {
		assertEquals("VA", customers.get(2848).getState());
	}

	@Test
	@DisplayName("Record 2849: ZIP is 22003")
	void ZIPOfRecord2849() {
		assertEquals("22003", customers.get(2848).getZIP());
	}

	@Test
	@DisplayName("Record 2849: Phone is 703-642-8005")
	void PhoneOfRecord2849() {
		assertEquals("703-642-8005", customers.get(2848).getPhone());
	}

	@Test
	@DisplayName("Record 2849: Fax is 703-642-0944")
	void FaxOfRecord2849() {
		assertEquals("703-642-0944", customers.get(2848).getFax());
	}

	@Test
	@DisplayName("Record 2849: Email is anderson@rayow.com")
	void EmailOfRecord2849() {
		assertEquals("anderson@rayow.com", customers.get(2848).getEmail());
	}

	@Test
	@DisplayName("Record 2849: Web is http://www.andersonrayow.com")
	void WebOfRecord2849() {
		assertEquals("http://www.andersonrayow.com", customers.get(2848).getWeb());
	}
}
