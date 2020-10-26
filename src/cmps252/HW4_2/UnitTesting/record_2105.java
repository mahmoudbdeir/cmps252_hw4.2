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

@Tag("23")
class Record_2105 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2105: FirstName is Karyn")
	void FirstNameOfRecord2105() {
		assertEquals("Karyn", customers.get(2104).getFirstName());
	}

	@Test
	@DisplayName("Record 2105: LastName is Calender")
	void LastNameOfRecord2105() {
		assertEquals("Calender", customers.get(2104).getLastName());
	}

	@Test
	@DisplayName("Record 2105: Company is Cabrillo Federal Credit Union")
	void CompanyOfRecord2105() {
		assertEquals("Cabrillo Federal Credit Union", customers.get(2104).getCompany());
	}

	@Test
	@DisplayName("Record 2105: Address is 3770 Highland Ave")
	void AddressOfRecord2105() {
		assertEquals("3770 Highland Ave", customers.get(2104).getAddress());
	}

	@Test
	@DisplayName("Record 2105: City is Manhattan Beach")
	void CityOfRecord2105() {
		assertEquals("Manhattan Beach", customers.get(2104).getCity());
	}

	@Test
	@DisplayName("Record 2105: County is Los Angeles")
	void CountyOfRecord2105() {
		assertEquals("Los Angeles", customers.get(2104).getCounty());
	}

	@Test
	@DisplayName("Record 2105: State is CA")
	void StateOfRecord2105() {
		assertEquals("CA", customers.get(2104).getState());
	}

	@Test
	@DisplayName("Record 2105: ZIP is 90266")
	void ZIPOfRecord2105() {
		assertEquals("90266", customers.get(2104).getZIP());
	}

	@Test
	@DisplayName("Record 2105: Phone is 310-545-5673")
	void PhoneOfRecord2105() {
		assertEquals("310-545-5673", customers.get(2104).getPhone());
	}

	@Test
	@DisplayName("Record 2105: Fax is 310-545-9641")
	void FaxOfRecord2105() {
		assertEquals("310-545-9641", customers.get(2104).getFax());
	}

	@Test
	@DisplayName("Record 2105: Email is karyn@calender.com")
	void EmailOfRecord2105() {
		assertEquals("karyn@calender.com", customers.get(2104).getEmail());
	}

	@Test
	@DisplayName("Record 2105: Web is http://www.karyncalender.com")
	void WebOfRecord2105() {
		assertEquals("http://www.karyncalender.com", customers.get(2104).getWeb());
	}
}
