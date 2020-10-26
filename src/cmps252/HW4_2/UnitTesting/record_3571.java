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

@Tag("18")
class Record_3571 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3571: FirstName is Judson")
	void FirstNameOfRecord3571() {
		assertEquals("Judson", customers.get(3570).getFirstName());
	}

	@Test
	@DisplayName("Record 3571: LastName is Flirt")
	void LastNameOfRecord3571() {
		assertEquals("Flirt", customers.get(3570).getLastName());
	}

	@Test
	@DisplayName("Record 3571: Company is Harris, Herbert")
	void CompanyOfRecord3571() {
		assertEquals("Harris, Herbert", customers.get(3570).getCompany());
	}

	@Test
	@DisplayName("Record 3571: Address is 1151 Cliff Rd E")
	void AddressOfRecord3571() {
		assertEquals("1151 Cliff Rd E", customers.get(3570).getAddress());
	}

	@Test
	@DisplayName("Record 3571: City is Burnsville")
	void CityOfRecord3571() {
		assertEquals("Burnsville", customers.get(3570).getCity());
	}

	@Test
	@DisplayName("Record 3571: County is Dakota")
	void CountyOfRecord3571() {
		assertEquals("Dakota", customers.get(3570).getCounty());
	}

	@Test
	@DisplayName("Record 3571: State is MN")
	void StateOfRecord3571() {
		assertEquals("MN", customers.get(3570).getState());
	}

	@Test
	@DisplayName("Record 3571: ZIP is 55337")
	void ZIPOfRecord3571() {
		assertEquals("55337", customers.get(3570).getZIP());
	}

	@Test
	@DisplayName("Record 3571: Phone is 952-890-9789")
	void PhoneOfRecord3571() {
		assertEquals("952-890-9789", customers.get(3570).getPhone());
	}

	@Test
	@DisplayName("Record 3571: Fax is 952-890-9489")
	void FaxOfRecord3571() {
		assertEquals("952-890-9489", customers.get(3570).getFax());
	}

	@Test
	@DisplayName("Record 3571: Email is judson@flirt.com")
	void EmailOfRecord3571() {
		assertEquals("judson@flirt.com", customers.get(3570).getEmail());
	}

	@Test
	@DisplayName("Record 3571: Web is http://www.judsonflirt.com")
	void WebOfRecord3571() {
		assertEquals("http://www.judsonflirt.com", customers.get(3570).getWeb());
	}
}
