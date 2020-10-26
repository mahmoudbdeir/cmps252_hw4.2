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

@Tag("13")
class Record_1547 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1547: FirstName is Jerry")
	void FirstNameOfRecord1547() {
		assertEquals("Jerry", customers.get(1546).getFirstName());
	}

	@Test
	@DisplayName("Record 1547: LastName is Cugini")
	void LastNameOfRecord1547() {
		assertEquals("Cugini", customers.get(1546).getLastName());
	}

	@Test
	@DisplayName("Record 1547: Company is Richard D Jones Dds Pc")
	void CompanyOfRecord1547() {
		assertEquals("Richard D Jones Dds Pc", customers.get(1546).getCompany());
	}

	@Test
	@DisplayName("Record 1547: Address is 445 Northern Blvd")
	void AddressOfRecord1547() {
		assertEquals("445 Northern Blvd", customers.get(1546).getAddress());
	}

	@Test
	@DisplayName("Record 1547: City is Great Neck")
	void CityOfRecord1547() {
		assertEquals("Great Neck", customers.get(1546).getCity());
	}

	@Test
	@DisplayName("Record 1547: County is Nassau")
	void CountyOfRecord1547() {
		assertEquals("Nassau", customers.get(1546).getCounty());
	}

	@Test
	@DisplayName("Record 1547: State is NY")
	void StateOfRecord1547() {
		assertEquals("NY", customers.get(1546).getState());
	}

	@Test
	@DisplayName("Record 1547: ZIP is 11021")
	void ZIPOfRecord1547() {
		assertEquals("11021", customers.get(1546).getZIP());
	}

	@Test
	@DisplayName("Record 1547: Phone is 516-466-8900")
	void PhoneOfRecord1547() {
		assertEquals("516-466-8900", customers.get(1546).getPhone());
	}

	@Test
	@DisplayName("Record 1547: Fax is 516-466-8598")
	void FaxOfRecord1547() {
		assertEquals("516-466-8598", customers.get(1546).getFax());
	}

	@Test
	@DisplayName("Record 1547: Email is jerry@cugini.com")
	void EmailOfRecord1547() {
		assertEquals("jerry@cugini.com", customers.get(1546).getEmail());
	}

	@Test
	@DisplayName("Record 1547: Web is http://www.jerrycugini.com")
	void WebOfRecord1547() {
		assertEquals("http://www.jerrycugini.com", customers.get(1546).getWeb());
	}
}
