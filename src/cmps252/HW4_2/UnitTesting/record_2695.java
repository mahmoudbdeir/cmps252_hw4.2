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

@Tag("0")
class Record_2695 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2695: FirstName is Dave")
	void FirstNameOfRecord2695() {
		assertEquals("Dave", customers.get(2694).getFirstName());
	}

	@Test
	@DisplayName("Record 2695: LastName is Cisco")
	void LastNameOfRecord2695() {
		assertEquals("Cisco", customers.get(2694).getLastName());
	}

	@Test
	@DisplayName("Record 2695: Company is Gailey, Herman A Iii")
	void CompanyOfRecord2695() {
		assertEquals("Gailey, Herman A Iii", customers.get(2694).getCompany());
	}

	@Test
	@DisplayName("Record 2695: Address is 1830 Embarcadero")
	void AddressOfRecord2695() {
		assertEquals("1830 Embarcadero", customers.get(2694).getAddress());
	}

	@Test
	@DisplayName("Record 2695: City is Oakland")
	void CityOfRecord2695() {
		assertEquals("Oakland", customers.get(2694).getCity());
	}

	@Test
	@DisplayName("Record 2695: County is Alameda")
	void CountyOfRecord2695() {
		assertEquals("Alameda", customers.get(2694).getCounty());
	}

	@Test
	@DisplayName("Record 2695: State is CA")
	void StateOfRecord2695() {
		assertEquals("CA", customers.get(2694).getState());
	}

	@Test
	@DisplayName("Record 2695: ZIP is 94606")
	void ZIPOfRecord2695() {
		assertEquals("94606", customers.get(2694).getZIP());
	}

	@Test
	@DisplayName("Record 2695: Phone is 510-535-2606")
	void PhoneOfRecord2695() {
		assertEquals("510-535-2606", customers.get(2694).getPhone());
	}

	@Test
	@DisplayName("Record 2695: Fax is 510-535-7454")
	void FaxOfRecord2695() {
		assertEquals("510-535-7454", customers.get(2694).getFax());
	}

	@Test
	@DisplayName("Record 2695: Email is dave@cisco.com")
	void EmailOfRecord2695() {
		assertEquals("dave@cisco.com", customers.get(2694).getEmail());
	}

	@Test
	@DisplayName("Record 2695: Web is http://www.davecisco.com")
	void WebOfRecord2695() {
		assertEquals("http://www.davecisco.com", customers.get(2694).getWeb());
	}
}
