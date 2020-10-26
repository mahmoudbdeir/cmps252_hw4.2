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
class Record_2192 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2192: FirstName is Consuelo")
	void FirstNameOfRecord2192() {
		assertEquals("Consuelo", customers.get(2191).getFirstName());
	}

	@Test
	@DisplayName("Record 2192: LastName is Bowley")
	void LastNameOfRecord2192() {
		assertEquals("Bowley", customers.get(2191).getLastName());
	}

	@Test
	@DisplayName("Record 2192: Company is Miller, Laurie Ann Esq")
	void CompanyOfRecord2192() {
		assertEquals("Miller, Laurie Ann Esq", customers.get(2191).getCompany());
	}

	@Test
	@DisplayName("Record 2192: Address is 1626 Rivers St")
	void AddressOfRecord2192() {
		assertEquals("1626 Rivers St", customers.get(2191).getAddress());
	}

	@Test
	@DisplayName("Record 2192: City is Greenwood")
	void CityOfRecord2192() {
		assertEquals("Greenwood", customers.get(2191).getCity());
	}

	@Test
	@DisplayName("Record 2192: County is Greenwood")
	void CountyOfRecord2192() {
		assertEquals("Greenwood", customers.get(2191).getCounty());
	}

	@Test
	@DisplayName("Record 2192: State is SC")
	void StateOfRecord2192() {
		assertEquals("SC", customers.get(2191).getState());
	}

	@Test
	@DisplayName("Record 2192: ZIP is 29649")
	void ZIPOfRecord2192() {
		assertEquals("29649", customers.get(2191).getZIP());
	}

	@Test
	@DisplayName("Record 2192: Phone is 864-223-2641")
	void PhoneOfRecord2192() {
		assertEquals("864-223-2641", customers.get(2191).getPhone());
	}

	@Test
	@DisplayName("Record 2192: Fax is 864-223-3906")
	void FaxOfRecord2192() {
		assertEquals("864-223-3906", customers.get(2191).getFax());
	}

	@Test
	@DisplayName("Record 2192: Email is consuelo@bowley.com")
	void EmailOfRecord2192() {
		assertEquals("consuelo@bowley.com", customers.get(2191).getEmail());
	}

	@Test
	@DisplayName("Record 2192: Web is http://www.consuelobowley.com")
	void WebOfRecord2192() {
		assertEquals("http://www.consuelobowley.com", customers.get(2191).getWeb());
	}
}
