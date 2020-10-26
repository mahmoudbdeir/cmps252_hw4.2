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

@Tag("30")
class Record_2015 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2015: FirstName is Brandi")
	void FirstNameOfRecord2015() {
		assertEquals("Brandi", customers.get(2014).getFirstName());
	}

	@Test
	@DisplayName("Record 2015: LastName is Hollomon")
	void LastNameOfRecord2015() {
		assertEquals("Hollomon", customers.get(2014).getLastName());
	}

	@Test
	@DisplayName("Record 2015: Company is Gordon Horseshoe Co")
	void CompanyOfRecord2015() {
		assertEquals("Gordon Horseshoe Co", customers.get(2014).getCompany());
	}

	@Test
	@DisplayName("Record 2015: Address is 335 W 38th St")
	void AddressOfRecord2015() {
		assertEquals("335 W 38th St", customers.get(2014).getAddress());
	}

	@Test
	@DisplayName("Record 2015: City is New York")
	void CityOfRecord2015() {
		assertEquals("New York", customers.get(2014).getCity());
	}

	@Test
	@DisplayName("Record 2015: County is New York")
	void CountyOfRecord2015() {
		assertEquals("New York", customers.get(2014).getCounty());
	}

	@Test
	@DisplayName("Record 2015: State is NY")
	void StateOfRecord2015() {
		assertEquals("NY", customers.get(2014).getState());
	}

	@Test
	@DisplayName("Record 2015: ZIP is 10018")
	void ZIPOfRecord2015() {
		assertEquals("10018", customers.get(2014).getZIP());
	}

	@Test
	@DisplayName("Record 2015: Phone is 212-947-0663")
	void PhoneOfRecord2015() {
		assertEquals("212-947-0663", customers.get(2014).getPhone());
	}

	@Test
	@DisplayName("Record 2015: Fax is 212-947-5054")
	void FaxOfRecord2015() {
		assertEquals("212-947-5054", customers.get(2014).getFax());
	}

	@Test
	@DisplayName("Record 2015: Email is brandi@hollomon.com")
	void EmailOfRecord2015() {
		assertEquals("brandi@hollomon.com", customers.get(2014).getEmail());
	}

	@Test
	@DisplayName("Record 2015: Web is http://www.brandihollomon.com")
	void WebOfRecord2015() {
		assertEquals("http://www.brandihollomon.com", customers.get(2014).getWeb());
	}
}
