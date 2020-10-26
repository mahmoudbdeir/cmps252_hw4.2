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

@Tag("26")
class Record_3663 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3663: FirstName is Jami")
	void FirstNameOfRecord3663() {
		assertEquals("Jami", customers.get(3662).getFirstName());
	}

	@Test
	@DisplayName("Record 3663: LastName is Lewi")
	void LastNameOfRecord3663() {
		assertEquals("Lewi", customers.get(3662).getLastName());
	}

	@Test
	@DisplayName("Record 3663: Company is American Crane Co")
	void CompanyOfRecord3663() {
		assertEquals("American Crane Co", customers.get(3662).getCompany());
	}

	@Test
	@DisplayName("Record 3663: Address is 14001 Distribution Way")
	void AddressOfRecord3663() {
		assertEquals("14001 Distribution Way", customers.get(3662).getAddress());
	}

	@Test
	@DisplayName("Record 3663: City is Dallas")
	void CityOfRecord3663() {
		assertEquals("Dallas", customers.get(3662).getCity());
	}

	@Test
	@DisplayName("Record 3663: County is Dallas")
	void CountyOfRecord3663() {
		assertEquals("Dallas", customers.get(3662).getCounty());
	}

	@Test
	@DisplayName("Record 3663: State is TX")
	void StateOfRecord3663() {
		assertEquals("TX", customers.get(3662).getState());
	}

	@Test
	@DisplayName("Record 3663: ZIP is 75234")
	void ZIPOfRecord3663() {
		assertEquals("75234", customers.get(3662).getZIP());
	}

	@Test
	@DisplayName("Record 3663: Phone is 972-241-7707")
	void PhoneOfRecord3663() {
		assertEquals("972-241-7707", customers.get(3662).getPhone());
	}

	@Test
	@DisplayName("Record 3663: Fax is 972-241-6653")
	void FaxOfRecord3663() {
		assertEquals("972-241-6653", customers.get(3662).getFax());
	}

	@Test
	@DisplayName("Record 3663: Email is jami@lewi.com")
	void EmailOfRecord3663() {
		assertEquals("jami@lewi.com", customers.get(3662).getEmail());
	}

	@Test
	@DisplayName("Record 3663: Web is http://www.jamilewi.com")
	void WebOfRecord3663() {
		assertEquals("http://www.jamilewi.com", customers.get(3662).getWeb());
	}
}
