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

@Tag("46")
class Record_4985 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4985: FirstName is Kip")
	void FirstNameOfRecord4985() {
		assertEquals("Kip", customers.get(4984).getFirstName());
	}

	@Test
	@DisplayName("Record 4985: LastName is Leasher")
	void LastNameOfRecord4985() {
		assertEquals("Leasher", customers.get(4984).getLastName());
	}

	@Test
	@DisplayName("Record 4985: Company is High School")
	void CompanyOfRecord4985() {
		assertEquals("High School", customers.get(4984).getCompany());
	}

	@Test
	@DisplayName("Record 4985: Address is 5525 N Macarthur Blvd")
	void AddressOfRecord4985() {
		assertEquals("5525 N Macarthur Blvd", customers.get(4984).getAddress());
	}

	@Test
	@DisplayName("Record 4985: City is Irving")
	void CityOfRecord4985() {
		assertEquals("Irving", customers.get(4984).getCity());
	}

	@Test
	@DisplayName("Record 4985: County is Dallas")
	void CountyOfRecord4985() {
		assertEquals("Dallas", customers.get(4984).getCounty());
	}

	@Test
	@DisplayName("Record 4985: State is TX")
	void StateOfRecord4985() {
		assertEquals("TX", customers.get(4984).getState());
	}

	@Test
	@DisplayName("Record 4985: ZIP is 75038")
	void ZIPOfRecord4985() {
		assertEquals("75038", customers.get(4984).getZIP());
	}

	@Test
	@DisplayName("Record 4985: Phone is 972-550-1199")
	void PhoneOfRecord4985() {
		assertEquals("972-550-1199", customers.get(4984).getPhone());
	}

	@Test
	@DisplayName("Record 4985: Fax is 972-550-1149")
	void FaxOfRecord4985() {
		assertEquals("972-550-1149", customers.get(4984).getFax());
	}

	@Test
	@DisplayName("Record 4985: Email is kip@leasher.com")
	void EmailOfRecord4985() {
		assertEquals("kip@leasher.com", customers.get(4984).getEmail());
	}

	@Test
	@DisplayName("Record 4985: Web is http://www.kipleasher.com")
	void WebOfRecord4985() {
		assertEquals("http://www.kipleasher.com", customers.get(4984).getWeb());
	}
}
