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

@Tag("26")
class Record_2144 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2144: FirstName is Ramiro")
	void FirstNameOfRecord2144() {
		assertEquals("Ramiro", customers.get(2143).getFirstName());
	}

	@Test
	@DisplayName("Record 2144: LastName is Savela")
	void LastNameOfRecord2144() {
		assertEquals("Savela", customers.get(2143).getLastName());
	}

	@Test
	@DisplayName("Record 2144: Company is Language Company Translations")
	void CompanyOfRecord2144() {
		assertEquals("Language Company Translations", customers.get(2143).getCompany());
	}

	@Test
	@DisplayName("Record 2144: Address is 502 Soquel Ave")
	void AddressOfRecord2144() {
		assertEquals("502 Soquel Ave", customers.get(2143).getAddress());
	}

	@Test
	@DisplayName("Record 2144: City is Santa Cruz")
	void CityOfRecord2144() {
		assertEquals("Santa Cruz", customers.get(2143).getCity());
	}

	@Test
	@DisplayName("Record 2144: County is Santa Cruz")
	void CountyOfRecord2144() {
		assertEquals("Santa Cruz", customers.get(2143).getCounty());
	}

	@Test
	@DisplayName("Record 2144: State is CA")
	void StateOfRecord2144() {
		assertEquals("CA", customers.get(2143).getState());
	}

	@Test
	@DisplayName("Record 2144: ZIP is 95062")
	void ZIPOfRecord2144() {
		assertEquals("95062", customers.get(2143).getZIP());
	}

	@Test
	@DisplayName("Record 2144: Phone is 831-423-0314")
	void PhoneOfRecord2144() {
		assertEquals("831-423-0314", customers.get(2143).getPhone());
	}

	@Test
	@DisplayName("Record 2144: Fax is 831-423-7908")
	void FaxOfRecord2144() {
		assertEquals("831-423-7908", customers.get(2143).getFax());
	}

	@Test
	@DisplayName("Record 2144: Email is ramiro@savela.com")
	void EmailOfRecord2144() {
		assertEquals("ramiro@savela.com", customers.get(2143).getEmail());
	}

	@Test
	@DisplayName("Record 2144: Web is http://www.ramirosavela.com")
	void WebOfRecord2144() {
		assertEquals("http://www.ramirosavela.com", customers.get(2143).getWeb());
	}
}
