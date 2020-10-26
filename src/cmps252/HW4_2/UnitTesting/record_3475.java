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
class Record_3475 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3475: FirstName is Aimee")
	void FirstNameOfRecord3475() {
		assertEquals("Aimee", customers.get(3474).getFirstName());
	}

	@Test
	@DisplayName("Record 3475: LastName is Malta")
	void LastNameOfRecord3475() {
		assertEquals("Malta", customers.get(3474).getLastName());
	}

	@Test
	@DisplayName("Record 3475: Company is Pix Productions")
	void CompanyOfRecord3475() {
		assertEquals("Pix Productions", customers.get(3474).getCompany());
	}

	@Test
	@DisplayName("Record 3475: Address is 109 Gaither Dr")
	void AddressOfRecord3475() {
		assertEquals("109 Gaither Dr", customers.get(3474).getAddress());
	}

	@Test
	@DisplayName("Record 3475: City is Mount Laurel")
	void CityOfRecord3475() {
		assertEquals("Mount Laurel", customers.get(3474).getCity());
	}

	@Test
	@DisplayName("Record 3475: County is Burlington")
	void CountyOfRecord3475() {
		assertEquals("Burlington", customers.get(3474).getCounty());
	}

	@Test
	@DisplayName("Record 3475: State is NJ")
	void StateOfRecord3475() {
		assertEquals("NJ", customers.get(3474).getState());
	}

	@Test
	@DisplayName("Record 3475: ZIP is 8054")
	void ZIPOfRecord3475() {
		assertEquals("8054", customers.get(3474).getZIP());
	}

	@Test
	@DisplayName("Record 3475: Phone is 856-778-8121")
	void PhoneOfRecord3475() {
		assertEquals("856-778-8121", customers.get(3474).getPhone());
	}

	@Test
	@DisplayName("Record 3475: Fax is 856-778-9538")
	void FaxOfRecord3475() {
		assertEquals("856-778-9538", customers.get(3474).getFax());
	}

	@Test
	@DisplayName("Record 3475: Email is aimee@malta.com")
	void EmailOfRecord3475() {
		assertEquals("aimee@malta.com", customers.get(3474).getEmail());
	}

	@Test
	@DisplayName("Record 3475: Web is http://www.aimeemalta.com")
	void WebOfRecord3475() {
		assertEquals("http://www.aimeemalta.com", customers.get(3474).getWeb());
	}
}
