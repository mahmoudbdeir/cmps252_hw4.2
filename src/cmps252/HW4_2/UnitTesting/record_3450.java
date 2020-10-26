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

@Tag("27")
class Record_3450 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3450: FirstName is Chong")
	void FirstNameOfRecord3450() {
		assertEquals("Chong", customers.get(3449).getFirstName());
	}

	@Test
	@DisplayName("Record 3450: LastName is Kalafut")
	void LastNameOfRecord3450() {
		assertEquals("Kalafut", customers.get(3449).getLastName());
	}

	@Test
	@DisplayName("Record 3450: Company is Polo Club")
	void CompanyOfRecord3450() {
		assertEquals("Polo Club", customers.get(3449).getCompany());
	}

	@Test
	@DisplayName("Record 3450: Address is 1944 S Quebec")
	void AddressOfRecord3450() {
		assertEquals("1944 S Quebec", customers.get(3449).getAddress());
	}

	@Test
	@DisplayName("Record 3450: City is Denver")
	void CityOfRecord3450() {
		assertEquals("Denver", customers.get(3449).getCity());
	}

	@Test
	@DisplayName("Record 3450: County is Denver")
	void CountyOfRecord3450() {
		assertEquals("Denver", customers.get(3449).getCounty());
	}

	@Test
	@DisplayName("Record 3450: State is CO")
	void StateOfRecord3450() {
		assertEquals("CO", customers.get(3449).getState());
	}

	@Test
	@DisplayName("Record 3450: ZIP is 80231")
	void ZIPOfRecord3450() {
		assertEquals("80231", customers.get(3449).getZIP());
	}

	@Test
	@DisplayName("Record 3450: Phone is 303-337-5070")
	void PhoneOfRecord3450() {
		assertEquals("303-337-5070", customers.get(3449).getPhone());
	}

	@Test
	@DisplayName("Record 3450: Fax is 303-337-2386")
	void FaxOfRecord3450() {
		assertEquals("303-337-2386", customers.get(3449).getFax());
	}

	@Test
	@DisplayName("Record 3450: Email is chong@kalafut.com")
	void EmailOfRecord3450() {
		assertEquals("chong@kalafut.com", customers.get(3449).getEmail());
	}

	@Test
	@DisplayName("Record 3450: Web is http://www.chongkalafut.com")
	void WebOfRecord3450() {
		assertEquals("http://www.chongkalafut.com", customers.get(3449).getWeb());
	}
}
