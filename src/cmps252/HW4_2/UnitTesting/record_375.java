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

@Tag("28")
class Record_375 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 375: FirstName is Stefan")
	void FirstNameOfRecord375() {
		assertEquals("Stefan", customers.get(374).getFirstName());
	}

	@Test
	@DisplayName("Record 375: LastName is Stray")
	void LastNameOfRecord375() {
		assertEquals("Stray", customers.get(374).getLastName());
	}

	@Test
	@DisplayName("Record 375: Company is Hudson Co")
	void CompanyOfRecord375() {
		assertEquals("Hudson Co", customers.get(374).getCompany());
	}

	@Test
	@DisplayName("Record 375: Address is 977 Withlacoochee St")
	void AddressOfRecord375() {
		assertEquals("977 Withlacoochee St", customers.get(374).getAddress());
	}

	@Test
	@DisplayName("Record 375: City is Safety Harbor")
	void CityOfRecord375() {
		assertEquals("Safety Harbor", customers.get(374).getCity());
	}

	@Test
	@DisplayName("Record 375: County is Pinellas")
	void CountyOfRecord375() {
		assertEquals("Pinellas", customers.get(374).getCounty());
	}

	@Test
	@DisplayName("Record 375: State is FL")
	void StateOfRecord375() {
		assertEquals("FL", customers.get(374).getState());
	}

	@Test
	@DisplayName("Record 375: ZIP is 34695")
	void ZIPOfRecord375() {
		assertEquals("34695", customers.get(374).getZIP());
	}

	@Test
	@DisplayName("Record 375: Phone is 727-726-5220")
	void PhoneOfRecord375() {
		assertEquals("727-726-5220", customers.get(374).getPhone());
	}

	@Test
	@DisplayName("Record 375: Fax is 727-726-8767")
	void FaxOfRecord375() {
		assertEquals("727-726-8767", customers.get(374).getFax());
	}

	@Test
	@DisplayName("Record 375: Email is stefan@stray.com")
	void EmailOfRecord375() {
		assertEquals("stefan@stray.com", customers.get(374).getEmail());
	}

	@Test
	@DisplayName("Record 375: Web is http://www.stefanstray.com")
	void WebOfRecord375() {
		assertEquals("http://www.stefanstray.com", customers.get(374).getWeb());
	}
}
