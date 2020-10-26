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

@Tag("32")
class Record_3594 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3594: FirstName is Ned")
	void FirstNameOfRecord3594() {
		assertEquals("Ned", customers.get(3593).getFirstName());
	}

	@Test
	@DisplayName("Record 3594: LastName is Raphael")
	void LastNameOfRecord3594() {
		assertEquals("Raphael", customers.get(3593).getLastName());
	}

	@Test
	@DisplayName("Record 3594: Company is Jacobsen, Judith A Md")
	void CompanyOfRecord3594() {
		assertEquals("Jacobsen, Judith A Md", customers.get(3593).getCompany());
	}

	@Test
	@DisplayName("Record 3594: Address is 380 Jefferson Blvd")
	void AddressOfRecord3594() {
		assertEquals("380 Jefferson Blvd", customers.get(3593).getAddress());
	}

	@Test
	@DisplayName("Record 3594: City is Warwick")
	void CityOfRecord3594() {
		assertEquals("Warwick", customers.get(3593).getCity());
	}

	@Test
	@DisplayName("Record 3594: County is Kent")
	void CountyOfRecord3594() {
		assertEquals("Kent", customers.get(3593).getCounty());
	}

	@Test
	@DisplayName("Record 3594: State is RI")
	void StateOfRecord3594() {
		assertEquals("RI", customers.get(3593).getState());
	}

	@Test
	@DisplayName("Record 3594: ZIP is 2886")
	void ZIPOfRecord3594() {
		assertEquals("2886", customers.get(3593).getZIP());
	}

	@Test
	@DisplayName("Record 3594: Phone is 401-732-7023")
	void PhoneOfRecord3594() {
		assertEquals("401-732-7023", customers.get(3593).getPhone());
	}

	@Test
	@DisplayName("Record 3594: Fax is 401-732-2018")
	void FaxOfRecord3594() {
		assertEquals("401-732-2018", customers.get(3593).getFax());
	}

	@Test
	@DisplayName("Record 3594: Email is ned@raphael.com")
	void EmailOfRecord3594() {
		assertEquals("ned@raphael.com", customers.get(3593).getEmail());
	}

	@Test
	@DisplayName("Record 3594: Web is http://www.nedraphael.com")
	void WebOfRecord3594() {
		assertEquals("http://www.nedraphael.com", customers.get(3593).getWeb());
	}
}
