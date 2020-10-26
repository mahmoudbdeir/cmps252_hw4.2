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

@Tag("11")
class Record_4854 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4854: FirstName is Karrie")
	void FirstNameOfRecord4854() {
		assertEquals("Karrie", customers.get(4853).getFirstName());
	}

	@Test
	@DisplayName("Record 4854: LastName is Graveline")
	void LastNameOfRecord4854() {
		assertEquals("Graveline", customers.get(4853).getLastName());
	}

	@Test
	@DisplayName("Record 4854: Company is Patterson & Keough Pa")
	void CompanyOfRecord4854() {
		assertEquals("Patterson & Keough Pa", customers.get(4853).getCompany());
	}

	@Test
	@DisplayName("Record 4854: Address is 2100 Highway 66")
	void AddressOfRecord4854() {
		assertEquals("2100 Highway 66", customers.get(4853).getAddress());
	}

	@Test
	@DisplayName("Record 4854: City is Rowlett")
	void CityOfRecord4854() {
		assertEquals("Rowlett", customers.get(4853).getCity());
	}

	@Test
	@DisplayName("Record 4854: County is Dallas")
	void CountyOfRecord4854() {
		assertEquals("Dallas", customers.get(4853).getCounty());
	}

	@Test
	@DisplayName("Record 4854: State is TX")
	void StateOfRecord4854() {
		assertEquals("TX", customers.get(4853).getState());
	}

	@Test
	@DisplayName("Record 4854: ZIP is 75088")
	void ZIPOfRecord4854() {
		assertEquals("75088", customers.get(4853).getZIP());
	}

	@Test
	@DisplayName("Record 4854: Phone is 972-475-9256")
	void PhoneOfRecord4854() {
		assertEquals("972-475-9256", customers.get(4853).getPhone());
	}

	@Test
	@DisplayName("Record 4854: Fax is 972-475-1341")
	void FaxOfRecord4854() {
		assertEquals("972-475-1341", customers.get(4853).getFax());
	}

	@Test
	@DisplayName("Record 4854: Email is karrie@graveline.com")
	void EmailOfRecord4854() {
		assertEquals("karrie@graveline.com", customers.get(4853).getEmail());
	}

	@Test
	@DisplayName("Record 4854: Web is http://www.karriegraveline.com")
	void WebOfRecord4854() {
		assertEquals("http://www.karriegraveline.com", customers.get(4853).getWeb());
	}
}
