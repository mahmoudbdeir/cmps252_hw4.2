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

@Tag("41")
class Record_3878 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3878: FirstName is Ezequiel")
	void FirstNameOfRecord3878() {
		assertEquals("Ezequiel", customers.get(3877).getFirstName());
	}

	@Test
	@DisplayName("Record 3878: LastName is Booth")
	void LastNameOfRecord3878() {
		assertEquals("Booth", customers.get(3877).getLastName());
	}

	@Test
	@DisplayName("Record 3878: Company is Ktvn Tv Channel 2 Cbs")
	void CompanyOfRecord3878() {
		assertEquals("Ktvn Tv Channel 2 Cbs", customers.get(3877).getCompany());
	}

	@Test
	@DisplayName("Record 3878: Address is 3029 Allen Fork Rd")
	void AddressOfRecord3878() {
		assertEquals("3029 Allen Fork Rd", customers.get(3877).getAddress());
	}

	@Test
	@DisplayName("Record 3878: City is Burlington")
	void CityOfRecord3878() {
		assertEquals("Burlington", customers.get(3877).getCity());
	}

	@Test
	@DisplayName("Record 3878: County is Boone")
	void CountyOfRecord3878() {
		assertEquals("Boone", customers.get(3877).getCounty());
	}

	@Test
	@DisplayName("Record 3878: State is KY")
	void StateOfRecord3878() {
		assertEquals("KY", customers.get(3877).getState());
	}

	@Test
	@DisplayName("Record 3878: ZIP is 41005")
	void ZIPOfRecord3878() {
		assertEquals("41005", customers.get(3877).getZIP());
	}

	@Test
	@DisplayName("Record 3878: Phone is 859-586-0766")
	void PhoneOfRecord3878() {
		assertEquals("859-586-0766", customers.get(3877).getPhone());
	}

	@Test
	@DisplayName("Record 3878: Fax is 859-586-1138")
	void FaxOfRecord3878() {
		assertEquals("859-586-1138", customers.get(3877).getFax());
	}

	@Test
	@DisplayName("Record 3878: Email is ezequiel@booth.com")
	void EmailOfRecord3878() {
		assertEquals("ezequiel@booth.com", customers.get(3877).getEmail());
	}

	@Test
	@DisplayName("Record 3878: Web is http://www.ezequielbooth.com")
	void WebOfRecord3878() {
		assertEquals("http://www.ezequielbooth.com", customers.get(3877).getWeb());
	}
}
