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

@Tag("11")
class Record_2132 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2132: FirstName is Stan")
	void FirstNameOfRecord2132() {
		assertEquals("Stan", customers.get(2131).getFirstName());
	}

	@Test
	@DisplayName("Record 2132: LastName is Ballestas")
	void LastNameOfRecord2132() {
		assertEquals("Ballestas", customers.get(2131).getLastName());
	}

	@Test
	@DisplayName("Record 2132: Company is Brunswick Bank & Trust Co")
	void CompanyOfRecord2132() {
		assertEquals("Brunswick Bank & Trust Co", customers.get(2131).getCompany());
	}

	@Test
	@DisplayName("Record 2132: Address is 211 N 4th Ave")
	void AddressOfRecord2132() {
		assertEquals("211 N 4th Ave", customers.get(2131).getAddress());
	}

	@Test
	@DisplayName("Record 2132: City is Durant")
	void CityOfRecord2132() {
		assertEquals("Durant", customers.get(2131).getCity());
	}

	@Test
	@DisplayName("Record 2132: County is Bryan")
	void CountyOfRecord2132() {
		assertEquals("Bryan", customers.get(2131).getCounty());
	}

	@Test
	@DisplayName("Record 2132: State is OK")
	void StateOfRecord2132() {
		assertEquals("OK", customers.get(2131).getState());
	}

	@Test
	@DisplayName("Record 2132: ZIP is 74701")
	void ZIPOfRecord2132() {
		assertEquals("74701", customers.get(2131).getZIP());
	}

	@Test
	@DisplayName("Record 2132: Phone is 580-924-8802")
	void PhoneOfRecord2132() {
		assertEquals("580-924-8802", customers.get(2131).getPhone());
	}

	@Test
	@DisplayName("Record 2132: Fax is 580-924-6388")
	void FaxOfRecord2132() {
		assertEquals("580-924-6388", customers.get(2131).getFax());
	}

	@Test
	@DisplayName("Record 2132: Email is stan@ballestas.com")
	void EmailOfRecord2132() {
		assertEquals("stan@ballestas.com", customers.get(2131).getEmail());
	}

	@Test
	@DisplayName("Record 2132: Web is http://www.stanballestas.com")
	void WebOfRecord2132() {
		assertEquals("http://www.stanballestas.com", customers.get(2131).getWeb());
	}
}
