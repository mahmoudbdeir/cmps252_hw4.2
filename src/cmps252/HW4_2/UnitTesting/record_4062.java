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

@Tag("38")
class Record_4062 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4062: FirstName is Latonya")
	void FirstNameOfRecord4062() {
		assertEquals("Latonya", customers.get(4061).getFirstName());
	}

	@Test
	@DisplayName("Record 4062: LastName is Macgregor")
	void LastNameOfRecord4062() {
		assertEquals("Macgregor", customers.get(4061).getLastName());
	}

	@Test
	@DisplayName("Record 4062: Company is A O Barnes Div")
	void CompanyOfRecord4062() {
		assertEquals("A O Barnes Div", customers.get(4061).getCompany());
	}

	@Test
	@DisplayName("Record 4062: Address is 222 E Carrillo St")
	void AddressOfRecord4062() {
		assertEquals("222 E Carrillo St", customers.get(4061).getAddress());
	}

	@Test
	@DisplayName("Record 4062: City is Santa Barbara")
	void CityOfRecord4062() {
		assertEquals("Santa Barbara", customers.get(4061).getCity());
	}

	@Test
	@DisplayName("Record 4062: County is Santa Barbara")
	void CountyOfRecord4062() {
		assertEquals("Santa Barbara", customers.get(4061).getCounty());
	}

	@Test
	@DisplayName("Record 4062: State is CA")
	void StateOfRecord4062() {
		assertEquals("CA", customers.get(4061).getState());
	}

	@Test
	@DisplayName("Record 4062: ZIP is 93101")
	void ZIPOfRecord4062() {
		assertEquals("93101", customers.get(4061).getZIP());
	}

	@Test
	@DisplayName("Record 4062: Phone is 805-965-5397")
	void PhoneOfRecord4062() {
		assertEquals("805-965-5397", customers.get(4061).getPhone());
	}

	@Test
	@DisplayName("Record 4062: Fax is 805-965-4743")
	void FaxOfRecord4062() {
		assertEquals("805-965-4743", customers.get(4061).getFax());
	}

	@Test
	@DisplayName("Record 4062: Email is latonya@macgregor.com")
	void EmailOfRecord4062() {
		assertEquals("latonya@macgregor.com", customers.get(4061).getEmail());
	}

	@Test
	@DisplayName("Record 4062: Web is http://www.latonyamacgregor.com")
	void WebOfRecord4062() {
		assertEquals("http://www.latonyamacgregor.com", customers.get(4061).getWeb());
	}
}
