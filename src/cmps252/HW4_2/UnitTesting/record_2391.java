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

@Tag("19")
class Record_2391 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2391: FirstName is Catrina")
	void FirstNameOfRecord2391() {
		assertEquals("Catrina", customers.get(2390).getFirstName());
	}

	@Test
	@DisplayName("Record 2391: LastName is Petrea")
	void LastNameOfRecord2391() {
		assertEquals("Petrea", customers.get(2390).getLastName());
	}

	@Test
	@DisplayName("Record 2391: Company is Van Atkins")
	void CompanyOfRecord2391() {
		assertEquals("Van Atkins", customers.get(2390).getCompany());
	}

	@Test
	@DisplayName("Record 2391: Address is 187 Water St")
	void AddressOfRecord2391() {
		assertEquals("187 Water St", customers.get(2390).getAddress());
	}

	@Test
	@DisplayName("Record 2391: City is Laconia")
	void CityOfRecord2391() {
		assertEquals("Laconia", customers.get(2390).getCity());
	}

	@Test
	@DisplayName("Record 2391: County is Belknap")
	void CountyOfRecord2391() {
		assertEquals("Belknap", customers.get(2390).getCounty());
	}

	@Test
	@DisplayName("Record 2391: State is NH")
	void StateOfRecord2391() {
		assertEquals("NH", customers.get(2390).getState());
	}

	@Test
	@DisplayName("Record 2391: ZIP is 3246")
	void ZIPOfRecord2391() {
		assertEquals("3246", customers.get(2390).getZIP());
	}

	@Test
	@DisplayName("Record 2391: Phone is 603-524-3393")
	void PhoneOfRecord2391() {
		assertEquals("603-524-3393", customers.get(2390).getPhone());
	}

	@Test
	@DisplayName("Record 2391: Fax is 603-524-5425")
	void FaxOfRecord2391() {
		assertEquals("603-524-5425", customers.get(2390).getFax());
	}

	@Test
	@DisplayName("Record 2391: Email is catrina@petrea.com")
	void EmailOfRecord2391() {
		assertEquals("catrina@petrea.com", customers.get(2390).getEmail());
	}

	@Test
	@DisplayName("Record 2391: Web is http://www.catrinapetrea.com")
	void WebOfRecord2391() {
		assertEquals("http://www.catrinapetrea.com", customers.get(2390).getWeb());
	}
}
