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

@Tag("37")
class Record_2032 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2032: FirstName is Adele")
	void FirstNameOfRecord2032() {
		assertEquals("Adele", customers.get(2031).getFirstName());
	}

	@Test
	@DisplayName("Record 2032: LastName is Graeter")
	void LastNameOfRecord2032() {
		assertEquals("Graeter", customers.get(2031).getLastName());
	}

	@Test
	@DisplayName("Record 2032: Company is Improved Consumer Products Inc")
	void CompanyOfRecord2032() {
		assertEquals("Improved Consumer Products Inc", customers.get(2031).getCompany());
	}

	@Test
	@DisplayName("Record 2032: Address is 6218 26th Ave")
	void AddressOfRecord2032() {
		assertEquals("6218 26th Ave", customers.get(2031).getAddress());
	}

	@Test
	@DisplayName("Record 2032: City is Kenosha")
	void CityOfRecord2032() {
		assertEquals("Kenosha", customers.get(2031).getCity());
	}

	@Test
	@DisplayName("Record 2032: County is Kenosha")
	void CountyOfRecord2032() {
		assertEquals("Kenosha", customers.get(2031).getCounty());
	}

	@Test
	@DisplayName("Record 2032: State is WI")
	void StateOfRecord2032() {
		assertEquals("WI", customers.get(2031).getState());
	}

	@Test
	@DisplayName("Record 2032: ZIP is 53143")
	void ZIPOfRecord2032() {
		assertEquals("53143", customers.get(2031).getZIP());
	}

	@Test
	@DisplayName("Record 2032: Phone is 262-658-0236")
	void PhoneOfRecord2032() {
		assertEquals("262-658-0236", customers.get(2031).getPhone());
	}

	@Test
	@DisplayName("Record 2032: Fax is 262-658-7727")
	void FaxOfRecord2032() {
		assertEquals("262-658-7727", customers.get(2031).getFax());
	}

	@Test
	@DisplayName("Record 2032: Email is adele@graeter.com")
	void EmailOfRecord2032() {
		assertEquals("adele@graeter.com", customers.get(2031).getEmail());
	}

	@Test
	@DisplayName("Record 2032: Web is http://www.adelegraeter.com")
	void WebOfRecord2032() {
		assertEquals("http://www.adelegraeter.com", customers.get(2031).getWeb());
	}
}
