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

@Tag("28")
class Record_4256 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4256: FirstName is Antone")
	void FirstNameOfRecord4256() {
		assertEquals("Antone", customers.get(4255).getFirstName());
	}

	@Test
	@DisplayName("Record 4256: LastName is Bleggi")
	void LastNameOfRecord4256() {
		assertEquals("Bleggi", customers.get(4255).getLastName());
	}

	@Test
	@DisplayName("Record 4256: Company is Automated Office Solutions")
	void CompanyOfRecord4256() {
		assertEquals("Automated Office Solutions", customers.get(4255).getCompany());
	}

	@Test
	@DisplayName("Record 4256: Address is 1000 West Ave")
	void AddressOfRecord4256() {
		assertEquals("1000 West Ave", customers.get(4255).getAddress());
	}

	@Test
	@DisplayName("Record 4256: City is Austin")
	void CityOfRecord4256() {
		assertEquals("Austin", customers.get(4255).getCity());
	}

	@Test
	@DisplayName("Record 4256: County is Travis")
	void CountyOfRecord4256() {
		assertEquals("Travis", customers.get(4255).getCounty());
	}

	@Test
	@DisplayName("Record 4256: State is TX")
	void StateOfRecord4256() {
		assertEquals("TX", customers.get(4255).getState());
	}

	@Test
	@DisplayName("Record 4256: ZIP is 78701")
	void ZIPOfRecord4256() {
		assertEquals("78701", customers.get(4255).getZIP());
	}

	@Test
	@DisplayName("Record 4256: Phone is 512-478-4532")
	void PhoneOfRecord4256() {
		assertEquals("512-478-4532", customers.get(4255).getPhone());
	}

	@Test
	@DisplayName("Record 4256: Fax is 512-478-2053")
	void FaxOfRecord4256() {
		assertEquals("512-478-2053", customers.get(4255).getFax());
	}

	@Test
	@DisplayName("Record 4256: Email is antone@bleggi.com")
	void EmailOfRecord4256() {
		assertEquals("antone@bleggi.com", customers.get(4255).getEmail());
	}

	@Test
	@DisplayName("Record 4256: Web is http://www.antonebleggi.com")
	void WebOfRecord4256() {
		assertEquals("http://www.antonebleggi.com", customers.get(4255).getWeb());
	}
}
