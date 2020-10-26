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

@Tag("32")
class Record_2562 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2562: FirstName is Omar")
	void FirstNameOfRecord2562() {
		assertEquals("Omar", customers.get(2561).getFirstName());
	}

	@Test
	@DisplayName("Record 2562: LastName is Niemczyk")
	void LastNameOfRecord2562() {
		assertEquals("Niemczyk", customers.get(2561).getLastName());
	}

	@Test
	@DisplayName("Record 2562: Company is Marva Marble Co Inc")
	void CompanyOfRecord2562() {
		assertEquals("Marva Marble Co Inc", customers.get(2561).getCompany());
	}

	@Test
	@DisplayName("Record 2562: Address is 2912 W Clarendon Ave")
	void AddressOfRecord2562() {
		assertEquals("2912 W Clarendon Ave", customers.get(2561).getAddress());
	}

	@Test
	@DisplayName("Record 2562: City is Phoenix")
	void CityOfRecord2562() {
		assertEquals("Phoenix", customers.get(2561).getCity());
	}

	@Test
	@DisplayName("Record 2562: County is Maricopa")
	void CountyOfRecord2562() {
		assertEquals("Maricopa", customers.get(2561).getCounty());
	}

	@Test
	@DisplayName("Record 2562: State is AZ")
	void StateOfRecord2562() {
		assertEquals("AZ", customers.get(2561).getState());
	}

	@Test
	@DisplayName("Record 2562: ZIP is 85017")
	void ZIPOfRecord2562() {
		assertEquals("85017", customers.get(2561).getZIP());
	}

	@Test
	@DisplayName("Record 2562: Phone is 602-277-6964")
	void PhoneOfRecord2562() {
		assertEquals("602-277-6964", customers.get(2561).getPhone());
	}

	@Test
	@DisplayName("Record 2562: Fax is 602-277-2494")
	void FaxOfRecord2562() {
		assertEquals("602-277-2494", customers.get(2561).getFax());
	}

	@Test
	@DisplayName("Record 2562: Email is omar@niemczyk.com")
	void EmailOfRecord2562() {
		assertEquals("omar@niemczyk.com", customers.get(2561).getEmail());
	}

	@Test
	@DisplayName("Record 2562: Web is http://www.omarniemczyk.com")
	void WebOfRecord2562() {
		assertEquals("http://www.omarniemczyk.com", customers.get(2561).getWeb());
	}
}
