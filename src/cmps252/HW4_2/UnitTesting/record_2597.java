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

@Tag("43")
class Record_2597 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2597: FirstName is Tonia")
	void FirstNameOfRecord2597() {
		assertEquals("Tonia", customers.get(2596).getFirstName());
	}

	@Test
	@DisplayName("Record 2597: LastName is Linberg")
	void LastNameOfRecord2597() {
		assertEquals("Linberg", customers.get(2596).getLastName());
	}

	@Test
	@DisplayName("Record 2597: Company is Mail Center")
	void CompanyOfRecord2597() {
		assertEquals("Mail Center", customers.get(2596).getCompany());
	}

	@Test
	@DisplayName("Record 2597: Address is 1396 Howell Mill Rd Nw")
	void AddressOfRecord2597() {
		assertEquals("1396 Howell Mill Rd Nw", customers.get(2596).getAddress());
	}

	@Test
	@DisplayName("Record 2597: City is Atlanta")
	void CityOfRecord2597() {
		assertEquals("Atlanta", customers.get(2596).getCity());
	}

	@Test
	@DisplayName("Record 2597: County is Fulton")
	void CountyOfRecord2597() {
		assertEquals("Fulton", customers.get(2596).getCounty());
	}

	@Test
	@DisplayName("Record 2597: State is GA")
	void StateOfRecord2597() {
		assertEquals("GA", customers.get(2596).getState());
	}

	@Test
	@DisplayName("Record 2597: ZIP is 30318")
	void ZIPOfRecord2597() {
		assertEquals("30318", customers.get(2596).getZIP());
	}

	@Test
	@DisplayName("Record 2597: Phone is 404-352-9387")
	void PhoneOfRecord2597() {
		assertEquals("404-352-9387", customers.get(2596).getPhone());
	}

	@Test
	@DisplayName("Record 2597: Fax is 404-352-4376")
	void FaxOfRecord2597() {
		assertEquals("404-352-4376", customers.get(2596).getFax());
	}

	@Test
	@DisplayName("Record 2597: Email is tonia@linberg.com")
	void EmailOfRecord2597() {
		assertEquals("tonia@linberg.com", customers.get(2596).getEmail());
	}

	@Test
	@DisplayName("Record 2597: Web is http://www.tonialinberg.com")
	void WebOfRecord2597() {
		assertEquals("http://www.tonialinberg.com", customers.get(2596).getWeb());
	}
}
