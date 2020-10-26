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

@Tag("21")
class Record_4807 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4807: FirstName is Pilar")
	void FirstNameOfRecord4807() {
		assertEquals("Pilar", customers.get(4806).getFirstName());
	}

	@Test
	@DisplayName("Record 4807: LastName is Geraldes")
	void LastNameOfRecord4807() {
		assertEquals("Geraldes", customers.get(4806).getLastName());
	}

	@Test
	@DisplayName("Record 4807: Company is Golden Dragon Fortune Cookies")
	void CompanyOfRecord4807() {
		assertEquals("Golden Dragon Fortune Cookies", customers.get(4806).getCompany());
	}

	@Test
	@DisplayName("Record 4807: Address is 1091 River Ave")
	void AddressOfRecord4807() {
		assertEquals("1091 River Ave", customers.get(4806).getAddress());
	}

	@Test
	@DisplayName("Record 4807: City is Lakewood")
	void CityOfRecord4807() {
		assertEquals("Lakewood", customers.get(4806).getCity());
	}

	@Test
	@DisplayName("Record 4807: County is Ocean")
	void CountyOfRecord4807() {
		assertEquals("Ocean", customers.get(4806).getCounty());
	}

	@Test
	@DisplayName("Record 4807: State is NJ")
	void StateOfRecord4807() {
		assertEquals("NJ", customers.get(4806).getState());
	}

	@Test
	@DisplayName("Record 4807: ZIP is 8701")
	void ZIPOfRecord4807() {
		assertEquals("8701", customers.get(4806).getZIP());
	}

	@Test
	@DisplayName("Record 4807: Phone is 732-370-7986")
	void PhoneOfRecord4807() {
		assertEquals("732-370-7986", customers.get(4806).getPhone());
	}

	@Test
	@DisplayName("Record 4807: Fax is 732-370-6327")
	void FaxOfRecord4807() {
		assertEquals("732-370-6327", customers.get(4806).getFax());
	}

	@Test
	@DisplayName("Record 4807: Email is pilar@geraldes.com")
	void EmailOfRecord4807() {
		assertEquals("pilar@geraldes.com", customers.get(4806).getEmail());
	}

	@Test
	@DisplayName("Record 4807: Web is http://www.pilargeraldes.com")
	void WebOfRecord4807() {
		assertEquals("http://www.pilargeraldes.com", customers.get(4806).getWeb());
	}
}
