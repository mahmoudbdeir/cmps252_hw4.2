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

@Tag("29")
class Record_860 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 860: FirstName is Collin")
	void FirstNameOfRecord860() {
		assertEquals("Collin", customers.get(859).getFirstName());
	}

	@Test
	@DisplayName("Record 860: LastName is Temp")
	void LastNameOfRecord860() {
		assertEquals("Temp", customers.get(859).getLastName());
	}

	@Test
	@DisplayName("Record 860: Company is Team Design")
	void CompanyOfRecord860() {
		assertEquals("Team Design", customers.get(859).getCompany());
	}

	@Test
	@DisplayName("Record 860: Address is 5124 N Nebraska Ave")
	void AddressOfRecord860() {
		assertEquals("5124 N Nebraska Ave", customers.get(859).getAddress());
	}

	@Test
	@DisplayName("Record 860: City is Tampa")
	void CityOfRecord860() {
		assertEquals("Tampa", customers.get(859).getCity());
	}

	@Test
	@DisplayName("Record 860: County is Hillsborough")
	void CountyOfRecord860() {
		assertEquals("Hillsborough", customers.get(859).getCounty());
	}

	@Test
	@DisplayName("Record 860: State is FL")
	void StateOfRecord860() {
		assertEquals("FL", customers.get(859).getState());
	}

	@Test
	@DisplayName("Record 860: ZIP is 33603")
	void ZIPOfRecord860() {
		assertEquals("33603", customers.get(859).getZIP());
	}

	@Test
	@DisplayName("Record 860: Phone is 813-238-9640")
	void PhoneOfRecord860() {
		assertEquals("813-238-9640", customers.get(859).getPhone());
	}

	@Test
	@DisplayName("Record 860: Fax is 813-238-5242")
	void FaxOfRecord860() {
		assertEquals("813-238-5242", customers.get(859).getFax());
	}

	@Test
	@DisplayName("Record 860: Email is collin@temp.com")
	void EmailOfRecord860() {
		assertEquals("collin@temp.com", customers.get(859).getEmail());
	}

	@Test
	@DisplayName("Record 860: Web is http://www.collintemp.com")
	void WebOfRecord860() {
		assertEquals("http://www.collintemp.com", customers.get(859).getWeb());
	}
}
