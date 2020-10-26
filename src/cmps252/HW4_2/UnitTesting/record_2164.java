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

@Tag("48")
class Record_2164 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2164: FirstName is Kathie")
	void FirstNameOfRecord2164() {
		assertEquals("Kathie", customers.get(2163).getFirstName());
	}

	@Test
	@DisplayName("Record 2164: LastName is Dudgeon")
	void LastNameOfRecord2164() {
		assertEquals("Dudgeon", customers.get(2163).getLastName());
	}

	@Test
	@DisplayName("Record 2164: Company is Untd Van Lines Agnt Untd Move")
	void CompanyOfRecord2164() {
		assertEquals("Untd Van Lines Agnt Untd Move", customers.get(2163).getCompany());
	}

	@Test
	@DisplayName("Record 2164: Address is 131 Nassau St")
	void AddressOfRecord2164() {
		assertEquals("131 Nassau St", customers.get(2163).getAddress());
	}

	@Test
	@DisplayName("Record 2164: City is Brooklyn")
	void CityOfRecord2164() {
		assertEquals("Brooklyn", customers.get(2163).getCity());
	}

	@Test
	@DisplayName("Record 2164: County is Kings")
	void CountyOfRecord2164() {
		assertEquals("Kings", customers.get(2163).getCounty());
	}

	@Test
	@DisplayName("Record 2164: State is NY")
	void StateOfRecord2164() {
		assertEquals("NY", customers.get(2163).getState());
	}

	@Test
	@DisplayName("Record 2164: ZIP is 11201")
	void ZIPOfRecord2164() {
		assertEquals("11201", customers.get(2163).getZIP());
	}

	@Test
	@DisplayName("Record 2164: Phone is 718-236-9954")
	void PhoneOfRecord2164() {
		assertEquals("718-236-9954", customers.get(2163).getPhone());
	}

	@Test
	@DisplayName("Record 2164: Fax is 718-236-9228")
	void FaxOfRecord2164() {
		assertEquals("718-236-9228", customers.get(2163).getFax());
	}

	@Test
	@DisplayName("Record 2164: Email is kathie@dudgeon.com")
	void EmailOfRecord2164() {
		assertEquals("kathie@dudgeon.com", customers.get(2163).getEmail());
	}

	@Test
	@DisplayName("Record 2164: Web is http://www.kathiedudgeon.com")
	void WebOfRecord2164() {
		assertEquals("http://www.kathiedudgeon.com", customers.get(2163).getWeb());
	}
}
