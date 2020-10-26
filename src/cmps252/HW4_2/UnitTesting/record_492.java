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

@Tag("18")
class Record_492 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 492: FirstName is Seth")
	void FirstNameOfRecord492() {
		assertEquals("Seth", customers.get(491).getFirstName());
	}

	@Test
	@DisplayName("Record 492: LastName is Chepiga")
	void LastNameOfRecord492() {
		assertEquals("Chepiga", customers.get(491).getLastName());
	}

	@Test
	@DisplayName("Record 492: Company is Kelstar Enterprises Inc")
	void CompanyOfRecord492() {
		assertEquals("Kelstar Enterprises Inc", customers.get(491).getCompany());
	}

	@Test
	@DisplayName("Record 492: Address is 44171 N Groesbeck Hwy")
	void AddressOfRecord492() {
		assertEquals("44171 N Groesbeck Hwy", customers.get(491).getAddress());
	}

	@Test
	@DisplayName("Record 492: City is Clinton Township")
	void CityOfRecord492() {
		assertEquals("Clinton Township", customers.get(491).getCity());
	}

	@Test
	@DisplayName("Record 492: County is Macomb")
	void CountyOfRecord492() {
		assertEquals("Macomb", customers.get(491).getCounty());
	}

	@Test
	@DisplayName("Record 492: State is MI")
	void StateOfRecord492() {
		assertEquals("MI", customers.get(491).getState());
	}

	@Test
	@DisplayName("Record 492: ZIP is 48036")
	void ZIPOfRecord492() {
		assertEquals("48036", customers.get(491).getZIP());
	}

	@Test
	@DisplayName("Record 492: Phone is 586-469-1343")
	void PhoneOfRecord492() {
		assertEquals("586-469-1343", customers.get(491).getPhone());
	}

	@Test
	@DisplayName("Record 492: Fax is 586-469-9893")
	void FaxOfRecord492() {
		assertEquals("586-469-9893", customers.get(491).getFax());
	}

	@Test
	@DisplayName("Record 492: Email is seth@chepiga.com")
	void EmailOfRecord492() {
		assertEquals("seth@chepiga.com", customers.get(491).getEmail());
	}

	@Test
	@DisplayName("Record 492: Web is http://www.sethchepiga.com")
	void WebOfRecord492() {
		assertEquals("http://www.sethchepiga.com", customers.get(491).getWeb());
	}
}
