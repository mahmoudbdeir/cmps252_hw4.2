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

@Tag("9")
class Record_3438 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3438: FirstName is Tracey")
	void FirstNameOfRecord3438() {
		assertEquals("Tracey", customers.get(3437).getFirstName());
	}

	@Test
	@DisplayName("Record 3438: LastName is Satawa")
	void LastNameOfRecord3438() {
		assertEquals("Satawa", customers.get(3437).getLastName());
	}

	@Test
	@DisplayName("Record 3438: Company is Marlor Press")
	void CompanyOfRecord3438() {
		assertEquals("Marlor Press", customers.get(3437).getCompany());
	}

	@Test
	@DisplayName("Record 3438: Address is 13802 N Scottsdale Rd")
	void AddressOfRecord3438() {
		assertEquals("13802 N Scottsdale Rd", customers.get(3437).getAddress());
	}

	@Test
	@DisplayName("Record 3438: City is Scottsdale")
	void CityOfRecord3438() {
		assertEquals("Scottsdale", customers.get(3437).getCity());
	}

	@Test
	@DisplayName("Record 3438: County is Maricopa")
	void CountyOfRecord3438() {
		assertEquals("Maricopa", customers.get(3437).getCounty());
	}

	@Test
	@DisplayName("Record 3438: State is AZ")
	void StateOfRecord3438() {
		assertEquals("AZ", customers.get(3437).getState());
	}

	@Test
	@DisplayName("Record 3438: ZIP is 85254")
	void ZIPOfRecord3438() {
		assertEquals("85254", customers.get(3437).getZIP());
	}

	@Test
	@DisplayName("Record 3438: Phone is 602-998-9946")
	void PhoneOfRecord3438() {
		assertEquals("602-998-9946", customers.get(3437).getPhone());
	}

	@Test
	@DisplayName("Record 3438: Fax is 602-998-0922")
	void FaxOfRecord3438() {
		assertEquals("602-998-0922", customers.get(3437).getFax());
	}

	@Test
	@DisplayName("Record 3438: Email is tracey@satawa.com")
	void EmailOfRecord3438() {
		assertEquals("tracey@satawa.com", customers.get(3437).getEmail());
	}

	@Test
	@DisplayName("Record 3438: Web is http://www.traceysatawa.com")
	void WebOfRecord3438() {
		assertEquals("http://www.traceysatawa.com", customers.get(3437).getWeb());
	}
}
