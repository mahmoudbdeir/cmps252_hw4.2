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

@Tag("3")
class Record_2264 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2264: FirstName is Kristin")
	void FirstNameOfRecord2264() {
		assertEquals("Kristin", customers.get(2263).getFirstName());
	}

	@Test
	@DisplayName("Record 2264: LastName is Eagar")
	void LastNameOfRecord2264() {
		assertEquals("Eagar", customers.get(2263).getLastName());
	}

	@Test
	@DisplayName("Record 2264: Company is Welborn Transport Inc")
	void CompanyOfRecord2264() {
		assertEquals("Welborn Transport Inc", customers.get(2263).getCompany());
	}

	@Test
	@DisplayName("Record 2264: Address is 8008 Old Alexandria Ferry Rd")
	void AddressOfRecord2264() {
		assertEquals("8008 Old Alexandria Ferry Rd", customers.get(2263).getAddress());
	}

	@Test
	@DisplayName("Record 2264: City is Clinton")
	void CityOfRecord2264() {
		assertEquals("Clinton", customers.get(2263).getCity());
	}

	@Test
	@DisplayName("Record 2264: County is Prince Georges")
	void CountyOfRecord2264() {
		assertEquals("Prince Georges", customers.get(2263).getCounty());
	}

	@Test
	@DisplayName("Record 2264: State is MD")
	void StateOfRecord2264() {
		assertEquals("MD", customers.get(2263).getState());
	}

	@Test
	@DisplayName("Record 2264: ZIP is 20735")
	void ZIPOfRecord2264() {
		assertEquals("20735", customers.get(2263).getZIP());
	}

	@Test
	@DisplayName("Record 2264: Phone is 301-868-0447")
	void PhoneOfRecord2264() {
		assertEquals("301-868-0447", customers.get(2263).getPhone());
	}

	@Test
	@DisplayName("Record 2264: Fax is 301-868-0305")
	void FaxOfRecord2264() {
		assertEquals("301-868-0305", customers.get(2263).getFax());
	}

	@Test
	@DisplayName("Record 2264: Email is kristin@eagar.com")
	void EmailOfRecord2264() {
		assertEquals("kristin@eagar.com", customers.get(2263).getEmail());
	}

	@Test
	@DisplayName("Record 2264: Web is http://www.kristineagar.com")
	void WebOfRecord2264() {
		assertEquals("http://www.kristineagar.com", customers.get(2263).getWeb());
	}
}
