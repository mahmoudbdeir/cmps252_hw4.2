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

@Tag("5")
class Record_122 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 122: FirstName is Delma")
	void FirstNameOfRecord122() {
		assertEquals("Delma", customers.get(121).getFirstName());
	}

	@Test
	@DisplayName("Record 122: LastName is Merrell")
	void LastNameOfRecord122() {
		assertEquals("Merrell", customers.get(121).getLastName());
	}

	@Test
	@DisplayName("Record 122: Company is Bearing & Industrial Sales Inc")
	void CompanyOfRecord122() {
		assertEquals("Bearing & Industrial Sales Inc", customers.get(121).getCompany());
	}

	@Test
	@DisplayName("Record 122: Address is 1040 N Grove St")
	void AddressOfRecord122() {
		assertEquals("1040 N Grove St", customers.get(121).getAddress());
	}

	@Test
	@DisplayName("Record 122: City is Anahym")
	void CityOfRecord122() {
		assertEquals("Anahym", customers.get(121).getCity());
	}

	@Test
	@DisplayName("Record 122: County is Orange")
	void CountyOfRecord122() {
		assertEquals("Orange", customers.get(121).getCounty());
	}

	@Test
	@DisplayName("Record 122: State is CA")
	void StateOfRecord122() {
		assertEquals("CA", customers.get(121).getState());
	}

	@Test
	@DisplayName("Record 122: ZIP is 92806")
	void ZIPOfRecord122() {
		assertEquals("92806", customers.get(121).getZIP());
	}

	@Test
	@DisplayName("Record 122: Phone is 714-630-0565")
	void PhoneOfRecord122() {
		assertEquals("714-630-0565", customers.get(121).getPhone());
	}

	@Test
	@DisplayName("Record 122: Fax is 714-630-1269")
	void FaxOfRecord122() {
		assertEquals("714-630-1269", customers.get(121).getFax());
	}

	@Test
	@DisplayName("Record 122: Email is delma@merrell.com")
	void EmailOfRecord122() {
		assertEquals("delma@merrell.com", customers.get(121).getEmail());
	}

	@Test
	@DisplayName("Record 122: Web is http://www.delmamerrell.com")
	void WebOfRecord122() {
		assertEquals("http://www.delmamerrell.com", customers.get(121).getWeb());
	}
}
