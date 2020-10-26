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

@Tag("22")
class Record_334 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 334: FirstName is Chas")
	void FirstNameOfRecord334() {
		assertEquals("Chas", customers.get(333).getFirstName());
	}

	@Test
	@DisplayName("Record 334: LastName is Brechbill")
	void LastNameOfRecord334() {
		assertEquals("Brechbill", customers.get(333).getLastName());
	}

	@Test
	@DisplayName("Record 334: Company is Patio Florist")
	void CompanyOfRecord334() {
		assertEquals("Patio Florist", customers.get(333).getCompany());
	}

	@Test
	@DisplayName("Record 334: Address is 1337 Excalibur Dr")
	void AddressOfRecord334() {
		assertEquals("1337 Excalibur Dr", customers.get(333).getAddress());
	}

	@Test
	@DisplayName("Record 334: City is Janesville")
	void CityOfRecord334() {
		assertEquals("Janesville", customers.get(333).getCity());
	}

	@Test
	@DisplayName("Record 334: County is Rock")
	void CountyOfRecord334() {
		assertEquals("Rock", customers.get(333).getCounty());
	}

	@Test
	@DisplayName("Record 334: State is WI")
	void StateOfRecord334() {
		assertEquals("WI", customers.get(333).getState());
	}

	@Test
	@DisplayName("Record 334: ZIP is 53546")
	void ZIPOfRecord334() {
		assertEquals("53546", customers.get(333).getZIP());
	}

	@Test
	@DisplayName("Record 334: Phone is 608-754-5123")
	void PhoneOfRecord334() {
		assertEquals("608-754-5123", customers.get(333).getPhone());
	}

	@Test
	@DisplayName("Record 334: Fax is 608-754-9592")
	void FaxOfRecord334() {
		assertEquals("608-754-9592", customers.get(333).getFax());
	}

	@Test
	@DisplayName("Record 334: Email is chas@brechbill.com")
	void EmailOfRecord334() {
		assertEquals("chas@brechbill.com", customers.get(333).getEmail());
	}

	@Test
	@DisplayName("Record 334: Web is http://www.chasbrechbill.com")
	void WebOfRecord334() {
		assertEquals("http://www.chasbrechbill.com", customers.get(333).getWeb());
	}
}
