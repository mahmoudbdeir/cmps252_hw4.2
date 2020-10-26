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

@Tag("25")
class Record_4309 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4309: FirstName is Vincenzo")
	void FirstNameOfRecord4309() {
		assertEquals("Vincenzo", customers.get(4308).getFirstName());
	}

	@Test
	@DisplayName("Record 4309: LastName is Leys")
	void LastNameOfRecord4309() {
		assertEquals("Leys", customers.get(4308).getLastName());
	}

	@Test
	@DisplayName("Record 4309: Company is Galaxy Motor Inn")
	void CompanyOfRecord4309() {
		assertEquals("Galaxy Motor Inn", customers.get(4308).getCompany());
	}

	@Test
	@DisplayName("Record 4309: Address is 1625 Broadway  #-770")
	void AddressOfRecord4309() {
		assertEquals("1625 Broadway  #-770", customers.get(4308).getAddress());
	}

	@Test
	@DisplayName("Record 4309: City is Denver")
	void CityOfRecord4309() {
		assertEquals("Denver", customers.get(4308).getCity());
	}

	@Test
	@DisplayName("Record 4309: County is Denver")
	void CountyOfRecord4309() {
		assertEquals("Denver", customers.get(4308).getCounty());
	}

	@Test
	@DisplayName("Record 4309: State is CO")
	void StateOfRecord4309() {
		assertEquals("CO", customers.get(4308).getState());
	}

	@Test
	@DisplayName("Record 4309: ZIP is 80202")
	void ZIPOfRecord4309() {
		assertEquals("80202", customers.get(4308).getZIP());
	}

	@Test
	@DisplayName("Record 4309: Phone is 303-592-8146")
	void PhoneOfRecord4309() {
		assertEquals("303-592-8146", customers.get(4308).getPhone());
	}

	@Test
	@DisplayName("Record 4309: Fax is 303-592-4283")
	void FaxOfRecord4309() {
		assertEquals("303-592-4283", customers.get(4308).getFax());
	}

	@Test
	@DisplayName("Record 4309: Email is vincenzo@leys.com")
	void EmailOfRecord4309() {
		assertEquals("vincenzo@leys.com", customers.get(4308).getEmail());
	}

	@Test
	@DisplayName("Record 4309: Web is http://www.vincenzoleys.com")
	void WebOfRecord4309() {
		assertEquals("http://www.vincenzoleys.com", customers.get(4308).getWeb());
	}
}
