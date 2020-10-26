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

@Tag("1")
class Record_2236 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2236: FirstName is Marci")
	void FirstNameOfRecord2236() {
		assertEquals("Marci", customers.get(2235).getFirstName());
	}

	@Test
	@DisplayName("Record 2236: LastName is Braucks")
	void LastNameOfRecord2236() {
		assertEquals("Braucks", customers.get(2235).getLastName());
	}

	@Test
	@DisplayName("Record 2236: Company is Ourso, Alvin J Jr")
	void CompanyOfRecord2236() {
		assertEquals("Ourso, Alvin J Jr", customers.get(2235).getCompany());
	}

	@Test
	@DisplayName("Record 2236: Address is 85 Watermill Ln")
	void AddressOfRecord2236() {
		assertEquals("85 Watermill Ln", customers.get(2235).getAddress());
	}

	@Test
	@DisplayName("Record 2236: City is Great Neck")
	void CityOfRecord2236() {
		assertEquals("Great Neck", customers.get(2235).getCity());
	}

	@Test
	@DisplayName("Record 2236: County is Nassau")
	void CountyOfRecord2236() {
		assertEquals("Nassau", customers.get(2235).getCounty());
	}

	@Test
	@DisplayName("Record 2236: State is NY")
	void StateOfRecord2236() {
		assertEquals("NY", customers.get(2235).getState());
	}

	@Test
	@DisplayName("Record 2236: ZIP is 11021")
	void ZIPOfRecord2236() {
		assertEquals("11021", customers.get(2235).getZIP());
	}

	@Test
	@DisplayName("Record 2236: Phone is 516-487-7542")
	void PhoneOfRecord2236() {
		assertEquals("516-487-7542", customers.get(2235).getPhone());
	}

	@Test
	@DisplayName("Record 2236: Fax is 516-487-2083")
	void FaxOfRecord2236() {
		assertEquals("516-487-2083", customers.get(2235).getFax());
	}

	@Test
	@DisplayName("Record 2236: Email is marci@braucks.com")
	void EmailOfRecord2236() {
		assertEquals("marci@braucks.com", customers.get(2235).getEmail());
	}

	@Test
	@DisplayName("Record 2236: Web is http://www.marcibraucks.com")
	void WebOfRecord2236() {
		assertEquals("http://www.marcibraucks.com", customers.get(2235).getWeb());
	}
}
