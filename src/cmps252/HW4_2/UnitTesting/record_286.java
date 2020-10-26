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

@Tag("6")
class Record_286 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 286: FirstName is Shelia")
	void FirstNameOfRecord286() {
		assertEquals("Shelia", customers.get(285).getFirstName());
	}

	@Test
	@DisplayName("Record 286: LastName is Feehan")
	void LastNameOfRecord286() {
		assertEquals("Feehan", customers.get(285).getLastName());
	}

	@Test
	@DisplayName("Record 286: Company is Monif, Gilles R Md")
	void CompanyOfRecord286() {
		assertEquals("Monif, Gilles R Md", customers.get(285).getCompany());
	}

	@Test
	@DisplayName("Record 286: Address is 5594 N Dixboro Rd")
	void AddressOfRecord286() {
		assertEquals("5594 N Dixboro Rd", customers.get(285).getAddress());
	}

	@Test
	@DisplayName("Record 286: City is Ann Arbor")
	void CityOfRecord286() {
		assertEquals("Ann Arbor", customers.get(285).getCity());
	}

	@Test
	@DisplayName("Record 286: County is Washtenaw")
	void CountyOfRecord286() {
		assertEquals("Washtenaw", customers.get(285).getCounty());
	}

	@Test
	@DisplayName("Record 286: State is MI")
	void StateOfRecord286() {
		assertEquals("MI", customers.get(285).getState());
	}

	@Test
	@DisplayName("Record 286: ZIP is 48105")
	void ZIPOfRecord286() {
		assertEquals("48105", customers.get(285).getZIP());
	}

	@Test
	@DisplayName("Record 286: Phone is 734-428-2671")
	void PhoneOfRecord286() {
		assertEquals("734-428-2671", customers.get(285).getPhone());
	}

	@Test
	@DisplayName("Record 286: Fax is 734-428-8828")
	void FaxOfRecord286() {
		assertEquals("734-428-8828", customers.get(285).getFax());
	}

	@Test
	@DisplayName("Record 286: Email is shelia@feehan.com")
	void EmailOfRecord286() {
		assertEquals("shelia@feehan.com", customers.get(285).getEmail());
	}

	@Test
	@DisplayName("Record 286: Web is http://www.sheliafeehan.com")
	void WebOfRecord286() {
		assertEquals("http://www.sheliafeehan.com", customers.get(285).getWeb());
	}
}
