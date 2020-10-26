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

@Tag("18")
class Record_1884 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1884: FirstName is Rufus")
	void FirstNameOfRecord1884() {
		assertEquals("Rufus", customers.get(1883).getFirstName());
	}

	@Test
	@DisplayName("Record 1884: LastName is Bryd")
	void LastNameOfRecord1884() {
		assertEquals("Bryd", customers.get(1883).getLastName());
	}

	@Test
	@DisplayName("Record 1884: Company is Mail Boxes Etc")
	void CompanyOfRecord1884() {
		assertEquals("Mail Boxes Etc", customers.get(1883).getCompany());
	}

	@Test
	@DisplayName("Record 1884: Address is 860 W Oak St")
	void AddressOfRecord1884() {
		assertEquals("860 W Oak St", customers.get(1883).getAddress());
	}

	@Test
	@DisplayName("Record 1884: City is Old Forge")
	void CityOfRecord1884() {
		assertEquals("Old Forge", customers.get(1883).getCity());
	}

	@Test
	@DisplayName("Record 1884: County is Lackawanna")
	void CountyOfRecord1884() {
		assertEquals("Lackawanna", customers.get(1883).getCounty());
	}

	@Test
	@DisplayName("Record 1884: State is PA")
	void StateOfRecord1884() {
		assertEquals("PA", customers.get(1883).getState());
	}

	@Test
	@DisplayName("Record 1884: ZIP is 18518")
	void ZIPOfRecord1884() {
		assertEquals("18518", customers.get(1883).getZIP());
	}

	@Test
	@DisplayName("Record 1884: Phone is 570-457-6572")
	void PhoneOfRecord1884() {
		assertEquals("570-457-6572", customers.get(1883).getPhone());
	}

	@Test
	@DisplayName("Record 1884: Fax is 570-457-8393")
	void FaxOfRecord1884() {
		assertEquals("570-457-8393", customers.get(1883).getFax());
	}

	@Test
	@DisplayName("Record 1884: Email is rufus@bryd.com")
	void EmailOfRecord1884() {
		assertEquals("rufus@bryd.com", customers.get(1883).getEmail());
	}

	@Test
	@DisplayName("Record 1884: Web is http://www.rufusbryd.com")
	void WebOfRecord1884() {
		assertEquals("http://www.rufusbryd.com", customers.get(1883).getWeb());
	}
}
