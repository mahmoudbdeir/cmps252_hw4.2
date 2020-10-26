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

@Tag("43")
class Record_4926 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4926: FirstName is Christi")
	void FirstNameOfRecord4926() {
		assertEquals("Christi", customers.get(4925).getFirstName());
	}

	@Test
	@DisplayName("Record 4926: LastName is Raad")
	void LastNameOfRecord4926() {
		assertEquals("Raad", customers.get(4925).getLastName());
	}

	@Test
	@DisplayName("Record 4926: Company is Young, Lowell S Md")
	void CompanyOfRecord4926() {
		assertEquals("Young, Lowell S Md", customers.get(4925).getCompany());
	}

	@Test
	@DisplayName("Record 4926: Address is 138 Washington Rd")
	void AddressOfRecord4926() {
		assertEquals("138 Washington Rd", customers.get(4925).getAddress());
	}

	@Test
	@DisplayName("Record 4926: City is Princeton")
	void CityOfRecord4926() {
		assertEquals("Princeton", customers.get(4925).getCity());
	}

	@Test
	@DisplayName("Record 4926: County is Mercer")
	void CountyOfRecord4926() {
		assertEquals("Mercer", customers.get(4925).getCounty());
	}

	@Test
	@DisplayName("Record 4926: State is NJ")
	void StateOfRecord4926() {
		assertEquals("NJ", customers.get(4925).getState());
	}

	@Test
	@DisplayName("Record 4926: ZIP is 8540")
	void ZIPOfRecord4926() {
		assertEquals("8540", customers.get(4925).getZIP());
	}

	@Test
	@DisplayName("Record 4926: Phone is 609-494-6520")
	void PhoneOfRecord4926() {
		assertEquals("609-494-6520", customers.get(4925).getPhone());
	}

	@Test
	@DisplayName("Record 4926: Fax is 609-494-6866")
	void FaxOfRecord4926() {
		assertEquals("609-494-6866", customers.get(4925).getFax());
	}

	@Test
	@DisplayName("Record 4926: Email is christi@raad.com")
	void EmailOfRecord4926() {
		assertEquals("christi@raad.com", customers.get(4925).getEmail());
	}

	@Test
	@DisplayName("Record 4926: Web is http://www.christiraad.com")
	void WebOfRecord4926() {
		assertEquals("http://www.christiraad.com", customers.get(4925).getWeb());
	}
}
