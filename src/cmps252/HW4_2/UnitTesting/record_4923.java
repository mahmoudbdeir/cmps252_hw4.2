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
class Record_4923 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4923: FirstName is Leland")
	void FirstNameOfRecord4923() {
		assertEquals("Leland", customers.get(4922).getFirstName());
	}

	@Test
	@DisplayName("Record 4923: LastName is Dunton")
	void LastNameOfRecord4923() {
		assertEquals("Dunton", customers.get(4922).getLastName());
	}

	@Test
	@DisplayName("Record 4923: Company is Scott Delaire Tile Co")
	void CompanyOfRecord4923() {
		assertEquals("Scott Delaire Tile Co", customers.get(4922).getCompany());
	}

	@Test
	@DisplayName("Record 4923: Address is 1012 14th St Nw  #-906")
	void AddressOfRecord4923() {
		assertEquals("1012 14th St Nw  #-906", customers.get(4922).getAddress());
	}

	@Test
	@DisplayName("Record 4923: City is Washington")
	void CityOfRecord4923() {
		assertEquals("Washington", customers.get(4922).getCity());
	}

	@Test
	@DisplayName("Record 4923: County is District of Columbia")
	void CountyOfRecord4923() {
		assertEquals("District of Columbia", customers.get(4922).getCounty());
	}

	@Test
	@DisplayName("Record 4923: State is DC")
	void StateOfRecord4923() {
		assertEquals("DC", customers.get(4922).getState());
	}

	@Test
	@DisplayName("Record 4923: ZIP is 20005")
	void ZIPOfRecord4923() {
		assertEquals("20005", customers.get(4922).getZIP());
	}

	@Test
	@DisplayName("Record 4923: Phone is 202-347-0477")
	void PhoneOfRecord4923() {
		assertEquals("202-347-0477", customers.get(4922).getPhone());
	}

	@Test
	@DisplayName("Record 4923: Fax is 202-347-0339")
	void FaxOfRecord4923() {
		assertEquals("202-347-0339", customers.get(4922).getFax());
	}

	@Test
	@DisplayName("Record 4923: Email is leland@dunton.com")
	void EmailOfRecord4923() {
		assertEquals("leland@dunton.com", customers.get(4922).getEmail());
	}

	@Test
	@DisplayName("Record 4923: Web is http://www.lelanddunton.com")
	void WebOfRecord4923() {
		assertEquals("http://www.lelanddunton.com", customers.get(4922).getWeb());
	}
}
