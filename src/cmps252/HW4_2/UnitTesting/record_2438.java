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

@Tag("22")
class Record_2438 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2438: FirstName is Joy")
	void FirstNameOfRecord2438() {
		assertEquals("Joy", customers.get(2437).getFirstName());
	}

	@Test
	@DisplayName("Record 2438: LastName is Caneza")
	void LastNameOfRecord2438() {
		assertEquals("Caneza", customers.get(2437).getLastName());
	}

	@Test
	@DisplayName("Record 2438: Company is Currie, Dover M")
	void CompanyOfRecord2438() {
		assertEquals("Currie, Dover M", customers.get(2437).getCompany());
	}

	@Test
	@DisplayName("Record 2438: Address is 424 E 92nd St")
	void AddressOfRecord2438() {
		assertEquals("424 E 92nd St", customers.get(2437).getAddress());
	}

	@Test
	@DisplayName("Record 2438: City is New York")
	void CityOfRecord2438() {
		assertEquals("New York", customers.get(2437).getCity());
	}

	@Test
	@DisplayName("Record 2438: County is New York")
	void CountyOfRecord2438() {
		assertEquals("New York", customers.get(2437).getCounty());
	}

	@Test
	@DisplayName("Record 2438: State is NY")
	void StateOfRecord2438() {
		assertEquals("NY", customers.get(2437).getState());
	}

	@Test
	@DisplayName("Record 2438: ZIP is 10128")
	void ZIPOfRecord2438() {
		assertEquals("10128", customers.get(2437).getZIP());
	}

	@Test
	@DisplayName("Record 2438: Phone is 212-348-5506")
	void PhoneOfRecord2438() {
		assertEquals("212-348-5506", customers.get(2437).getPhone());
	}

	@Test
	@DisplayName("Record 2438: Fax is 212-348-4792")
	void FaxOfRecord2438() {
		assertEquals("212-348-4792", customers.get(2437).getFax());
	}

	@Test
	@DisplayName("Record 2438: Email is joy@caneza.com")
	void EmailOfRecord2438() {
		assertEquals("joy@caneza.com", customers.get(2437).getEmail());
	}

	@Test
	@DisplayName("Record 2438: Web is http://www.joycaneza.com")
	void WebOfRecord2438() {
		assertEquals("http://www.joycaneza.com", customers.get(2437).getWeb());
	}
}
