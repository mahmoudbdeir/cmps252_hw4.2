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
class Record_2007 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2007: FirstName is Juliet")
	void FirstNameOfRecord2007() {
		assertEquals("Juliet", customers.get(2006).getFirstName());
	}

	@Test
	@DisplayName("Record 2007: LastName is Corsini")
	void LastNameOfRecord2007() {
		assertEquals("Corsini", customers.get(2006).getLastName());
	}

	@Test
	@DisplayName("Record 2007: Company is Masters Machine Co")
	void CompanyOfRecord2007() {
		assertEquals("Masters Machine Co", customers.get(2006).getCompany());
	}

	@Test
	@DisplayName("Record 2007: Address is 2955 Bellevue St")
	void AddressOfRecord2007() {
		assertEquals("2955 Bellevue St", customers.get(2006).getAddress());
	}

	@Test
	@DisplayName("Record 2007: City is Detroit")
	void CityOfRecord2007() {
		assertEquals("Detroit", customers.get(2006).getCity());
	}

	@Test
	@DisplayName("Record 2007: County is Wayne")
	void CountyOfRecord2007() {
		assertEquals("Wayne", customers.get(2006).getCounty());
	}

	@Test
	@DisplayName("Record 2007: State is MI")
	void StateOfRecord2007() {
		assertEquals("MI", customers.get(2006).getState());
	}

	@Test
	@DisplayName("Record 2007: ZIP is 48207")
	void ZIPOfRecord2007() {
		assertEquals("48207", customers.get(2006).getZIP());
	}

	@Test
	@DisplayName("Record 2007: Phone is 313-571-0306")
	void PhoneOfRecord2007() {
		assertEquals("313-571-0306", customers.get(2006).getPhone());
	}

	@Test
	@DisplayName("Record 2007: Fax is 313-571-3733")
	void FaxOfRecord2007() {
		assertEquals("313-571-3733", customers.get(2006).getFax());
	}

	@Test
	@DisplayName("Record 2007: Email is juliet@corsini.com")
	void EmailOfRecord2007() {
		assertEquals("juliet@corsini.com", customers.get(2006).getEmail());
	}

	@Test
	@DisplayName("Record 2007: Web is http://www.julietcorsini.com")
	void WebOfRecord2007() {
		assertEquals("http://www.julietcorsini.com", customers.get(2006).getWeb());
	}
}
