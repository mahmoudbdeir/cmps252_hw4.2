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

@Tag("12")
class Record_2204 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2204: FirstName is Melissa")
	void FirstNameOfRecord2204() {
		assertEquals("Melissa", customers.get(2203).getFirstName());
	}

	@Test
	@DisplayName("Record 2204: LastName is Polzer")
	void LastNameOfRecord2204() {
		assertEquals("Polzer", customers.get(2203).getLastName());
	}

	@Test
	@DisplayName("Record 2204: Company is South Central Indiana Remc")
	void CompanyOfRecord2204() {
		assertEquals("South Central Indiana Remc", customers.get(2203).getCompany());
	}

	@Test
	@DisplayName("Record 2204: Address is 8060 Pitkin Ave")
	void AddressOfRecord2204() {
		assertEquals("8060 Pitkin Ave", customers.get(2203).getAddress());
	}

	@Test
	@DisplayName("Record 2204: City is Ozone Park")
	void CityOfRecord2204() {
		assertEquals("Ozone Park", customers.get(2203).getCity());
	}

	@Test
	@DisplayName("Record 2204: County is Queens")
	void CountyOfRecord2204() {
		assertEquals("Queens", customers.get(2203).getCounty());
	}

	@Test
	@DisplayName("Record 2204: State is NY")
	void StateOfRecord2204() {
		assertEquals("NY", customers.get(2203).getState());
	}

	@Test
	@DisplayName("Record 2204: ZIP is 11417")
	void ZIPOfRecord2204() {
		assertEquals("11417", customers.get(2203).getZIP());
	}

	@Test
	@DisplayName("Record 2204: Phone is 718-848-2886")
	void PhoneOfRecord2204() {
		assertEquals("718-848-2886", customers.get(2203).getPhone());
	}

	@Test
	@DisplayName("Record 2204: Fax is 718-848-4955")
	void FaxOfRecord2204() {
		assertEquals("718-848-4955", customers.get(2203).getFax());
	}

	@Test
	@DisplayName("Record 2204: Email is melissa@polzer.com")
	void EmailOfRecord2204() {
		assertEquals("melissa@polzer.com", customers.get(2203).getEmail());
	}

	@Test
	@DisplayName("Record 2204: Web is http://www.melissapolzer.com")
	void WebOfRecord2204() {
		assertEquals("http://www.melissapolzer.com", customers.get(2203).getWeb());
	}
}
