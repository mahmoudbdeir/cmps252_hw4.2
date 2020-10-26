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

@Tag("44")
class Record_2202 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2202: FirstName is Edmundo")
	void FirstNameOfRecord2202() {
		assertEquals("Edmundo", customers.get(2201).getFirstName());
	}

	@Test
	@DisplayName("Record 2202: LastName is Hartsch")
	void LastNameOfRecord2202() {
		assertEquals("Hartsch", customers.get(2201).getLastName());
	}

	@Test
	@DisplayName("Record 2202: Company is Willingham Associates Inc")
	void CompanyOfRecord2202() {
		assertEquals("Willingham Associates Inc", customers.get(2201).getCompany());
	}

	@Test
	@DisplayName("Record 2202: Address is 800 W La Palma Ave")
	void AddressOfRecord2202() {
		assertEquals("800 W La Palma Ave", customers.get(2201).getAddress());
	}

	@Test
	@DisplayName("Record 2202: City is Anahym")
	void CityOfRecord2202() {
		assertEquals("Anahym", customers.get(2201).getCity());
	}

	@Test
	@DisplayName("Record 2202: County is Orange")
	void CountyOfRecord2202() {
		assertEquals("Orange", customers.get(2201).getCounty());
	}

	@Test
	@DisplayName("Record 2202: State is CA")
	void StateOfRecord2202() {
		assertEquals("CA", customers.get(2201).getState());
	}

	@Test
	@DisplayName("Record 2202: ZIP is 92801")
	void ZIPOfRecord2202() {
		assertEquals("92801", customers.get(2201).getZIP());
	}

	@Test
	@DisplayName("Record 2202: Phone is 714-563-2514")
	void PhoneOfRecord2202() {
		assertEquals("714-563-2514", customers.get(2201).getPhone());
	}

	@Test
	@DisplayName("Record 2202: Fax is 714-563-4769")
	void FaxOfRecord2202() {
		assertEquals("714-563-4769", customers.get(2201).getFax());
	}

	@Test
	@DisplayName("Record 2202: Email is edmundo@hartsch.com")
	void EmailOfRecord2202() {
		assertEquals("edmundo@hartsch.com", customers.get(2201).getEmail());
	}

	@Test
	@DisplayName("Record 2202: Web is http://www.edmundohartsch.com")
	void WebOfRecord2202() {
		assertEquals("http://www.edmundohartsch.com", customers.get(2201).getWeb());
	}
}
