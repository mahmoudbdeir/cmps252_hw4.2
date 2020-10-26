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
class Record_1211 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1211: FirstName is Joel")
	void FirstNameOfRecord1211() {
		assertEquals("Joel", customers.get(1210).getFirstName());
	}

	@Test
	@DisplayName("Record 1211: LastName is Kogan")
	void LastNameOfRecord1211() {
		assertEquals("Kogan", customers.get(1210).getLastName());
	}

	@Test
	@DisplayName("Record 1211: Company is Flook, Donna Jean")
	void CompanyOfRecord1211() {
		assertEquals("Flook, Donna Jean", customers.get(1210).getCompany());
	}

	@Test
	@DisplayName("Record 1211: Address is 614 174th Ave")
	void AddressOfRecord1211() {
		assertEquals("614 174th Ave", customers.get(1210).getAddress());
	}

	@Test
	@DisplayName("Record 1211: City is Spring Lake")
	void CityOfRecord1211() {
		assertEquals("Spring Lake", customers.get(1210).getCity());
	}

	@Test
	@DisplayName("Record 1211: County is Ottawa")
	void CountyOfRecord1211() {
		assertEquals("Ottawa", customers.get(1210).getCounty());
	}

	@Test
	@DisplayName("Record 1211: State is MI")
	void StateOfRecord1211() {
		assertEquals("MI", customers.get(1210).getState());
	}

	@Test
	@DisplayName("Record 1211: ZIP is 49456")
	void ZIPOfRecord1211() {
		assertEquals("49456", customers.get(1210).getZIP());
	}

	@Test
	@DisplayName("Record 1211: Phone is 616-846-7310")
	void PhoneOfRecord1211() {
		assertEquals("616-846-7310", customers.get(1210).getPhone());
	}

	@Test
	@DisplayName("Record 1211: Fax is 616-846-6488")
	void FaxOfRecord1211() {
		assertEquals("616-846-6488", customers.get(1210).getFax());
	}

	@Test
	@DisplayName("Record 1211: Email is joel@kogan.com")
	void EmailOfRecord1211() {
		assertEquals("joel@kogan.com", customers.get(1210).getEmail());
	}

	@Test
	@DisplayName("Record 1211: Web is http://www.joelkogan.com")
	void WebOfRecord1211() {
		assertEquals("http://www.joelkogan.com", customers.get(1210).getWeb());
	}
}
