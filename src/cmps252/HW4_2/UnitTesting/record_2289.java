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
class Record_2289 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2289: FirstName is Noemi")
	void FirstNameOfRecord2289() {
		assertEquals("Noemi", customers.get(2288).getFirstName());
	}

	@Test
	@DisplayName("Record 2289: LastName is Canchola")
	void LastNameOfRecord2289() {
		assertEquals("Canchola", customers.get(2288).getLastName());
	}

	@Test
	@DisplayName("Record 2289: Company is Rynders Inc")
	void CompanyOfRecord2289() {
		assertEquals("Rynders Inc", customers.get(2288).getCompany());
	}

	@Test
	@DisplayName("Record 2289: Address is 107 E 27th St")
	void AddressOfRecord2289() {
		assertEquals("107 E 27th St", customers.get(2288).getAddress());
	}

	@Test
	@DisplayName("Record 2289: City is Hays")
	void CityOfRecord2289() {
		assertEquals("Hays", customers.get(2288).getCity());
	}

	@Test
	@DisplayName("Record 2289: County is Ellis")
	void CountyOfRecord2289() {
		assertEquals("Ellis", customers.get(2288).getCounty());
	}

	@Test
	@DisplayName("Record 2289: State is KS")
	void StateOfRecord2289() {
		assertEquals("KS", customers.get(2288).getState());
	}

	@Test
	@DisplayName("Record 2289: ZIP is 67601")
	void ZIPOfRecord2289() {
		assertEquals("67601", customers.get(2288).getZIP());
	}

	@Test
	@DisplayName("Record 2289: Phone is 785-625-5025")
	void PhoneOfRecord2289() {
		assertEquals("785-625-5025", customers.get(2288).getPhone());
	}

	@Test
	@DisplayName("Record 2289: Fax is 785-625-6215")
	void FaxOfRecord2289() {
		assertEquals("785-625-6215", customers.get(2288).getFax());
	}

	@Test
	@DisplayName("Record 2289: Email is noemi@canchola.com")
	void EmailOfRecord2289() {
		assertEquals("noemi@canchola.com", customers.get(2288).getEmail());
	}

	@Test
	@DisplayName("Record 2289: Web is http://www.noemicanchola.com")
	void WebOfRecord2289() {
		assertEquals("http://www.noemicanchola.com", customers.get(2288).getWeb());
	}
}
