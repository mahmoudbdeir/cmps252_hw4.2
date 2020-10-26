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

@Tag("49")
class Record_2653 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2653: FirstName is Tracie")
	void FirstNameOfRecord2653() {
		assertEquals("Tracie", customers.get(2652).getFirstName());
	}

	@Test
	@DisplayName("Record 2653: LastName is Sites")
	void LastNameOfRecord2653() {
		assertEquals("Sites", customers.get(2652).getLastName());
	}

	@Test
	@DisplayName("Record 2653: Company is Celestial Seasonings")
	void CompanyOfRecord2653() {
		assertEquals("Celestial Seasonings", customers.get(2652).getCompany());
	}

	@Test
	@DisplayName("Record 2653: Address is 1580 Hylan Blvd")
	void AddressOfRecord2653() {
		assertEquals("1580 Hylan Blvd", customers.get(2652).getAddress());
	}

	@Test
	@DisplayName("Record 2653: City is Staten Island")
	void CityOfRecord2653() {
		assertEquals("Staten Island", customers.get(2652).getCity());
	}

	@Test
	@DisplayName("Record 2653: County is Richmond")
	void CountyOfRecord2653() {
		assertEquals("Richmond", customers.get(2652).getCounty());
	}

	@Test
	@DisplayName("Record 2653: State is NY")
	void StateOfRecord2653() {
		assertEquals("NY", customers.get(2652).getState());
	}

	@Test
	@DisplayName("Record 2653: ZIP is 10305")
	void ZIPOfRecord2653() {
		assertEquals("10305", customers.get(2652).getZIP());
	}

	@Test
	@DisplayName("Record 2653: Phone is 718-979-3801")
	void PhoneOfRecord2653() {
		assertEquals("718-979-3801", customers.get(2652).getPhone());
	}

	@Test
	@DisplayName("Record 2653: Fax is 718-979-6618")
	void FaxOfRecord2653() {
		assertEquals("718-979-6618", customers.get(2652).getFax());
	}

	@Test
	@DisplayName("Record 2653: Email is tracie@sites.com")
	void EmailOfRecord2653() {
		assertEquals("tracie@sites.com", customers.get(2652).getEmail());
	}

	@Test
	@DisplayName("Record 2653: Web is http://www.traciesites.com")
	void WebOfRecord2653() {
		assertEquals("http://www.traciesites.com", customers.get(2652).getWeb());
	}
}
