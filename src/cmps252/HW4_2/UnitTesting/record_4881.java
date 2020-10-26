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

@Tag("36")
class Record_4881 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4881: FirstName is Tracey")
	void FirstNameOfRecord4881() {
		assertEquals("Tracey", customers.get(4880).getFirstName());
	}

	@Test
	@DisplayName("Record 4881: LastName is Lybman")
	void LastNameOfRecord4881() {
		assertEquals("Lybman", customers.get(4880).getLastName());
	}

	@Test
	@DisplayName("Record 4881: Company is Grtr S Dade S Miami Kendall")
	void CompanyOfRecord4881() {
		assertEquals("Grtr S Dade S Miami Kendall", customers.get(4880).getCompany());
	}

	@Test
	@DisplayName("Record 4881: Address is 14500 Midway Rd")
	void AddressOfRecord4881() {
		assertEquals("14500 Midway Rd", customers.get(4880).getAddress());
	}

	@Test
	@DisplayName("Record 4881: City is Dallas")
	void CityOfRecord4881() {
		assertEquals("Dallas", customers.get(4880).getCity());
	}

	@Test
	@DisplayName("Record 4881: County is Dallas")
	void CountyOfRecord4881() {
		assertEquals("Dallas", customers.get(4880).getCounty());
	}

	@Test
	@DisplayName("Record 4881: State is TX")
	void StateOfRecord4881() {
		assertEquals("TX", customers.get(4880).getState());
	}

	@Test
	@DisplayName("Record 4881: ZIP is 75244")
	void ZIPOfRecord4881() {
		assertEquals("75244", customers.get(4880).getZIP());
	}

	@Test
	@DisplayName("Record 4881: Phone is 972-386-9331")
	void PhoneOfRecord4881() {
		assertEquals("972-386-9331", customers.get(4880).getPhone());
	}

	@Test
	@DisplayName("Record 4881: Fax is 972-386-1339")
	void FaxOfRecord4881() {
		assertEquals("972-386-1339", customers.get(4880).getFax());
	}

	@Test
	@DisplayName("Record 4881: Email is tracey@lybman.com")
	void EmailOfRecord4881() {
		assertEquals("tracey@lybman.com", customers.get(4880).getEmail());
	}

	@Test
	@DisplayName("Record 4881: Web is http://www.traceylybman.com")
	void WebOfRecord4881() {
		assertEquals("http://www.traceylybman.com", customers.get(4880).getWeb());
	}
}
