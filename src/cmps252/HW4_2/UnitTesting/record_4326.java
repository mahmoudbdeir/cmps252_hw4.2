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

@Tag("47")
class Record_4326 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4326: FirstName is Kerri")
	void FirstNameOfRecord4326() {
		assertEquals("Kerri", customers.get(4325).getFirstName());
	}

	@Test
	@DisplayName("Record 4326: LastName is Gonder")
	void LastNameOfRecord4326() {
		assertEquals("Gonder", customers.get(4325).getLastName());
	}

	@Test
	@DisplayName("Record 4326: Company is Tsi Graphics Inc")
	void CompanyOfRecord4326() {
		assertEquals("Tsi Graphics Inc", customers.get(4325).getCompany());
	}

	@Test
	@DisplayName("Record 4326: Address is 4550 Montgomery Ave")
	void AddressOfRecord4326() {
		assertEquals("4550 Montgomery Ave", customers.get(4325).getAddress());
	}

	@Test
	@DisplayName("Record 4326: City is Bethesda")
	void CityOfRecord4326() {
		assertEquals("Bethesda", customers.get(4325).getCity());
	}

	@Test
	@DisplayName("Record 4326: County is Montgomery")
	void CountyOfRecord4326() {
		assertEquals("Montgomery", customers.get(4325).getCounty());
	}

	@Test
	@DisplayName("Record 4326: State is MD")
	void StateOfRecord4326() {
		assertEquals("MD", customers.get(4325).getState());
	}

	@Test
	@DisplayName("Record 4326: ZIP is 20814")
	void ZIPOfRecord4326() {
		assertEquals("20814", customers.get(4325).getZIP());
	}

	@Test
	@DisplayName("Record 4326: Phone is 301-951-5536")
	void PhoneOfRecord4326() {
		assertEquals("301-951-5536", customers.get(4325).getPhone());
	}

	@Test
	@DisplayName("Record 4326: Fax is 301-951-1081")
	void FaxOfRecord4326() {
		assertEquals("301-951-1081", customers.get(4325).getFax());
	}

	@Test
	@DisplayName("Record 4326: Email is kerri@gonder.com")
	void EmailOfRecord4326() {
		assertEquals("kerri@gonder.com", customers.get(4325).getEmail());
	}

	@Test
	@DisplayName("Record 4326: Web is http://www.kerrigonder.com")
	void WebOfRecord4326() {
		assertEquals("http://www.kerrigonder.com", customers.get(4325).getWeb());
	}
}
