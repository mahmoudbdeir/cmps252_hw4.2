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

@Tag("39")
class Record_3831 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3831: FirstName is Nathaniel")
	void FirstNameOfRecord3831() {
		assertEquals("Nathaniel", customers.get(3830).getFirstName());
	}

	@Test
	@DisplayName("Record 3831: LastName is Scott")
	void LastNameOfRecord3831() {
		assertEquals("Scott", customers.get(3830).getLastName());
	}

	@Test
	@DisplayName("Record 3831: Company is Alpha Microsystems Computers")
	void CompanyOfRecord3831() {
		assertEquals("Alpha Microsystems Computers", customers.get(3830).getCompany());
	}

	@Test
	@DisplayName("Record 3831: Address is 5981 Maywood Ave")
	void AddressOfRecord3831() {
		assertEquals("5981 Maywood Ave", customers.get(3830).getAddress());
	}

	@Test
	@DisplayName("Record 3831: City is Huntington Park")
	void CityOfRecord3831() {
		assertEquals("Huntington Park", customers.get(3830).getCity());
	}

	@Test
	@DisplayName("Record 3831: County is Los Angeles")
	void CountyOfRecord3831() {
		assertEquals("Los Angeles", customers.get(3830).getCounty());
	}

	@Test
	@DisplayName("Record 3831: State is CA")
	void StateOfRecord3831() {
		assertEquals("CA", customers.get(3830).getState());
	}

	@Test
	@DisplayName("Record 3831: ZIP is 90255")
	void ZIPOfRecord3831() {
		assertEquals("90255", customers.get(3830).getZIP());
	}

	@Test
	@DisplayName("Record 3831: Phone is 323-583-6858")
	void PhoneOfRecord3831() {
		assertEquals("323-583-6858", customers.get(3830).getPhone());
	}

	@Test
	@DisplayName("Record 3831: Fax is 323-583-2571")
	void FaxOfRecord3831() {
		assertEquals("323-583-2571", customers.get(3830).getFax());
	}

	@Test
	@DisplayName("Record 3831: Email is nathaniel@scott.com")
	void EmailOfRecord3831() {
		assertEquals("nathaniel@scott.com", customers.get(3830).getEmail());
	}

	@Test
	@DisplayName("Record 3831: Web is http://www.nathanielscott.com")
	void WebOfRecord3831() {
		assertEquals("http://www.nathanielscott.com", customers.get(3830).getWeb());
	}
}
