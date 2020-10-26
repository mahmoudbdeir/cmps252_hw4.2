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
class Record_1870 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1870: FirstName is Rudolf")
	void FirstNameOfRecord1870() {
		assertEquals("Rudolf", customers.get(1869).getFirstName());
	}

	@Test
	@DisplayName("Record 1870: LastName is Seres")
	void LastNameOfRecord1870() {
		assertEquals("Seres", customers.get(1869).getLastName());
	}

	@Test
	@DisplayName("Record 1870: Company is American Society Mechl Engrs")
	void CompanyOfRecord1870() {
		assertEquals("American Society Mechl Engrs", customers.get(1869).getCompany());
	}

	@Test
	@DisplayName("Record 1870: Address is 610 W P St")
	void AddressOfRecord1870() {
		assertEquals("610 W P St", customers.get(1869).getAddress());
	}

	@Test
	@DisplayName("Record 1870: City is Lincoln")
	void CityOfRecord1870() {
		assertEquals("Lincoln", customers.get(1869).getCity());
	}

	@Test
	@DisplayName("Record 1870: County is Lancaster")
	void CountyOfRecord1870() {
		assertEquals("Lancaster", customers.get(1869).getCounty());
	}

	@Test
	@DisplayName("Record 1870: State is NE")
	void StateOfRecord1870() {
		assertEquals("NE", customers.get(1869).getState());
	}

	@Test
	@DisplayName("Record 1870: ZIP is 68528")
	void ZIPOfRecord1870() {
		assertEquals("68528", customers.get(1869).getZIP());
	}

	@Test
	@DisplayName("Record 1870: Phone is 402-476-3270")
	void PhoneOfRecord1870() {
		assertEquals("402-476-3270", customers.get(1869).getPhone());
	}

	@Test
	@DisplayName("Record 1870: Fax is 402-476-9546")
	void FaxOfRecord1870() {
		assertEquals("402-476-9546", customers.get(1869).getFax());
	}

	@Test
	@DisplayName("Record 1870: Email is rudolf@seres.com")
	void EmailOfRecord1870() {
		assertEquals("rudolf@seres.com", customers.get(1869).getEmail());
	}

	@Test
	@DisplayName("Record 1870: Web is http://www.rudolfseres.com")
	void WebOfRecord1870() {
		assertEquals("http://www.rudolfseres.com", customers.get(1869).getWeb());
	}
}
