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

@Tag("36")
class Record_2141 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2141: FirstName is Beryl")
	void FirstNameOfRecord2141() {
		assertEquals("Beryl", customers.get(2140).getFirstName());
	}

	@Test
	@DisplayName("Record 2141: LastName is Iacobelli")
	void LastNameOfRecord2141() {
		assertEquals("Iacobelli", customers.get(2140).getLastName());
	}

	@Test
	@DisplayName("Record 2141: Company is Kurashima, Gerald H Esq")
	void CompanyOfRecord2141() {
		assertEquals("Kurashima, Gerald H Esq", customers.get(2140).getCompany());
	}

	@Test
	@DisplayName("Record 2141: Address is 245 Boston Ave")
	void AddressOfRecord2141() {
		assertEquals("245 Boston Ave", customers.get(2140).getAddress());
	}

	@Test
	@DisplayName("Record 2141: City is Bridgeport")
	void CityOfRecord2141() {
		assertEquals("Bridgeport", customers.get(2140).getCity());
	}

	@Test
	@DisplayName("Record 2141: County is Fairfield")
	void CountyOfRecord2141() {
		assertEquals("Fairfield", customers.get(2140).getCounty());
	}

	@Test
	@DisplayName("Record 2141: State is CT")
	void StateOfRecord2141() {
		assertEquals("CT", customers.get(2140).getState());
	}

	@Test
	@DisplayName("Record 2141: ZIP is 6610")
	void ZIPOfRecord2141() {
		assertEquals("6610", customers.get(2140).getZIP());
	}

	@Test
	@DisplayName("Record 2141: Phone is 203-367-4772")
	void PhoneOfRecord2141() {
		assertEquals("203-367-4772", customers.get(2140).getPhone());
	}

	@Test
	@DisplayName("Record 2141: Fax is 203-367-3489")
	void FaxOfRecord2141() {
		assertEquals("203-367-3489", customers.get(2140).getFax());
	}

	@Test
	@DisplayName("Record 2141: Email is beryl@iacobelli.com")
	void EmailOfRecord2141() {
		assertEquals("beryl@iacobelli.com", customers.get(2140).getEmail());
	}

	@Test
	@DisplayName("Record 2141: Web is http://www.beryliacobelli.com")
	void WebOfRecord2141() {
		assertEquals("http://www.beryliacobelli.com", customers.get(2140).getWeb());
	}
}
