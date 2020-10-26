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

@Tag("44")
class Record_3504 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3504: FirstName is Carroll")
	void FirstNameOfRecord3504() {
		assertEquals("Carroll", customers.get(3503).getFirstName());
	}

	@Test
	@DisplayName("Record 3504: LastName is Peer")
	void LastNameOfRecord3504() {
		assertEquals("Peer", customers.get(3503).getLastName());
	}

	@Test
	@DisplayName("Record 3504: Company is Audubon Cellars Wine Tasting")
	void CompanyOfRecord3504() {
		assertEquals("Audubon Cellars Wine Tasting", customers.get(3503).getCompany());
	}

	@Test
	@DisplayName("Record 3504: Address is 1515 E Compton Blvd")
	void AddressOfRecord3504() {
		assertEquals("1515 E Compton Blvd", customers.get(3503).getAddress());
	}

	@Test
	@DisplayName("Record 3504: City is Compton")
	void CityOfRecord3504() {
		assertEquals("Compton", customers.get(3503).getCity());
	}

	@Test
	@DisplayName("Record 3504: County is Los Angeles")
	void CountyOfRecord3504() {
		assertEquals("Los Angeles", customers.get(3503).getCounty());
	}

	@Test
	@DisplayName("Record 3504: State is CA")
	void StateOfRecord3504() {
		assertEquals("CA", customers.get(3503).getState());
	}

	@Test
	@DisplayName("Record 3504: ZIP is 90221")
	void ZIPOfRecord3504() {
		assertEquals("90221", customers.get(3503).getZIP());
	}

	@Test
	@DisplayName("Record 3504: Phone is 310-635-9696")
	void PhoneOfRecord3504() {
		assertEquals("310-635-9696", customers.get(3503).getPhone());
	}

	@Test
	@DisplayName("Record 3504: Fax is 310-635-3282")
	void FaxOfRecord3504() {
		assertEquals("310-635-3282", customers.get(3503).getFax());
	}

	@Test
	@DisplayName("Record 3504: Email is carroll@peer.com")
	void EmailOfRecord3504() {
		assertEquals("carroll@peer.com", customers.get(3503).getEmail());
	}

	@Test
	@DisplayName("Record 3504: Web is http://www.carrollpeer.com")
	void WebOfRecord3504() {
		assertEquals("http://www.carrollpeer.com", customers.get(3503).getWeb());
	}
}
