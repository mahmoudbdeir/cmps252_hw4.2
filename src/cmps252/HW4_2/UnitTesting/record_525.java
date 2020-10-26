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
class Record_525 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 525: FirstName is Vera")
	void FirstNameOfRecord525() {
		assertEquals("Vera", customers.get(524).getFirstName());
	}

	@Test
	@DisplayName("Record 525: LastName is Jock")
	void LastNameOfRecord525() {
		assertEquals("Jock", customers.get(524).getLastName());
	}

	@Test
	@DisplayName("Record 525: Company is Inter American Bar Association")
	void CompanyOfRecord525() {
		assertEquals("Inter American Bar Association", customers.get(524).getCompany());
	}

	@Test
	@DisplayName("Record 525: Address is 11701 Central Ave")
	void AddressOfRecord525() {
		assertEquals("11701 Central Ave", customers.get(524).getAddress());
	}

	@Test
	@DisplayName("Record 525: City is Waldorf")
	void CityOfRecord525() {
		assertEquals("Waldorf", customers.get(524).getCity());
	}

	@Test
	@DisplayName("Record 525: County is Charles")
	void CountyOfRecord525() {
		assertEquals("Charles", customers.get(524).getCounty());
	}

	@Test
	@DisplayName("Record 525: State is MD")
	void StateOfRecord525() {
		assertEquals("MD", customers.get(524).getState());
	}

	@Test
	@DisplayName("Record 525: ZIP is 20601")
	void ZIPOfRecord525() {
		assertEquals("20601", customers.get(524).getZIP());
	}

	@Test
	@DisplayName("Record 525: Phone is 301-645-1130")
	void PhoneOfRecord525() {
		assertEquals("301-645-1130", customers.get(524).getPhone());
	}

	@Test
	@DisplayName("Record 525: Fax is 301-645-9478")
	void FaxOfRecord525() {
		assertEquals("301-645-9478", customers.get(524).getFax());
	}

	@Test
	@DisplayName("Record 525: Email is vera@jock.com")
	void EmailOfRecord525() {
		assertEquals("vera@jock.com", customers.get(524).getEmail());
	}

	@Test
	@DisplayName("Record 525: Web is http://www.verajock.com")
	void WebOfRecord525() {
		assertEquals("http://www.verajock.com", customers.get(524).getWeb());
	}
}
