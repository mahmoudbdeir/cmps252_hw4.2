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

@Tag("5")
class Record_2014 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2014: FirstName is Ricardo")
	void FirstNameOfRecord2014() {
		assertEquals("Ricardo", customers.get(2013).getFirstName());
	}

	@Test
	@DisplayName("Record 2014: LastName is Wortman")
	void LastNameOfRecord2014() {
		assertEquals("Wortman", customers.get(2013).getLastName());
	}

	@Test
	@DisplayName("Record 2014: Company is Konevich, Robert W Esq")
	void CompanyOfRecord2014() {
		assertEquals("Konevich, Robert W Esq", customers.get(2013).getCompany());
	}

	@Test
	@DisplayName("Record 2014: Address is 453 N Pearl St")
	void AddressOfRecord2014() {
		assertEquals("453 N Pearl St", customers.get(2013).getAddress());
	}

	@Test
	@DisplayName("Record 2014: City is Albany")
	void CityOfRecord2014() {
		assertEquals("Albany", customers.get(2013).getCity());
	}

	@Test
	@DisplayName("Record 2014: County is Albany")
	void CountyOfRecord2014() {
		assertEquals("Albany", customers.get(2013).getCounty());
	}

	@Test
	@DisplayName("Record 2014: State is NY")
	void StateOfRecord2014() {
		assertEquals("NY", customers.get(2013).getState());
	}

	@Test
	@DisplayName("Record 2014: ZIP is 12204")
	void ZIPOfRecord2014() {
		assertEquals("12204", customers.get(2013).getZIP());
	}

	@Test
	@DisplayName("Record 2014: Phone is 518-436-6029")
	void PhoneOfRecord2014() {
		assertEquals("518-436-6029", customers.get(2013).getPhone());
	}

	@Test
	@DisplayName("Record 2014: Fax is 518-436-5466")
	void FaxOfRecord2014() {
		assertEquals("518-436-5466", customers.get(2013).getFax());
	}

	@Test
	@DisplayName("Record 2014: Email is ricardo@wortman.com")
	void EmailOfRecord2014() {
		assertEquals("ricardo@wortman.com", customers.get(2013).getEmail());
	}

	@Test
	@DisplayName("Record 2014: Web is http://www.ricardowortman.com")
	void WebOfRecord2014() {
		assertEquals("http://www.ricardowortman.com", customers.get(2013).getWeb());
	}
}
