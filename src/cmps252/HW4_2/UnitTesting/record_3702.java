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

@Tag("2")
class Record_3702 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3702: FirstName is Collin")
	void FirstNameOfRecord3702() {
		assertEquals("Collin", customers.get(3701).getFirstName());
	}

	@Test
	@DisplayName("Record 3702: LastName is Osbourn")
	void LastNameOfRecord3702() {
		assertEquals("Osbourn", customers.get(3701).getLastName());
	}

	@Test
	@DisplayName("Record 3702: Company is All States Brick & Stone Mfg")
	void CompanyOfRecord3702() {
		assertEquals("All States Brick & Stone Mfg", customers.get(3701).getCompany());
	}

	@Test
	@DisplayName("Record 3702: Address is 936 Asbury Ave")
	void AddressOfRecord3702() {
		assertEquals("936 Asbury Ave", customers.get(3701).getAddress());
	}

	@Test
	@DisplayName("Record 3702: City is Ocean City")
	void CityOfRecord3702() {
		assertEquals("Ocean City", customers.get(3701).getCity());
	}

	@Test
	@DisplayName("Record 3702: County is Cape May")
	void CountyOfRecord3702() {
		assertEquals("Cape May", customers.get(3701).getCounty());
	}

	@Test
	@DisplayName("Record 3702: State is NJ")
	void StateOfRecord3702() {
		assertEquals("NJ", customers.get(3701).getState());
	}

	@Test
	@DisplayName("Record 3702: ZIP is 8226")
	void ZIPOfRecord3702() {
		assertEquals("8226", customers.get(3701).getZIP());
	}

	@Test
	@DisplayName("Record 3702: Phone is 609-399-3877")
	void PhoneOfRecord3702() {
		assertEquals("609-399-3877", customers.get(3701).getPhone());
	}

	@Test
	@DisplayName("Record 3702: Fax is 609-399-0675")
	void FaxOfRecord3702() {
		assertEquals("609-399-0675", customers.get(3701).getFax());
	}

	@Test
	@DisplayName("Record 3702: Email is collin@osbourn.com")
	void EmailOfRecord3702() {
		assertEquals("collin@osbourn.com", customers.get(3701).getEmail());
	}

	@Test
	@DisplayName("Record 3702: Web is http://www.collinosbourn.com")
	void WebOfRecord3702() {
		assertEquals("http://www.collinosbourn.com", customers.get(3701).getWeb());
	}
}
