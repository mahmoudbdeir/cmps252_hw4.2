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

@Tag("24")
class Record_1698 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1698: FirstName is Arlene")
	void FirstNameOfRecord1698() {
		assertEquals("Arlene", customers.get(1697).getFirstName());
	}

	@Test
	@DisplayName("Record 1698: LastName is Gareau")
	void LastNameOfRecord1698() {
		assertEquals("Gareau", customers.get(1697).getLastName());
	}

	@Test
	@DisplayName("Record 1698: Company is Windshields America")
	void CompanyOfRecord1698() {
		assertEquals("Windshields America", customers.get(1697).getCompany());
	}

	@Test
	@DisplayName("Record 1698: Address is 310 Alpha Dr")
	void AddressOfRecord1698() {
		assertEquals("310 Alpha Dr", customers.get(1697).getAddress());
	}

	@Test
	@DisplayName("Record 1698: City is Pittsburgh")
	void CityOfRecord1698() {
		assertEquals("Pittsburgh", customers.get(1697).getCity());
	}

	@Test
	@DisplayName("Record 1698: County is Allegheny")
	void CountyOfRecord1698() {
		assertEquals("Allegheny", customers.get(1697).getCounty());
	}

	@Test
	@DisplayName("Record 1698: State is PA")
	void StateOfRecord1698() {
		assertEquals("PA", customers.get(1697).getState());
	}

	@Test
	@DisplayName("Record 1698: ZIP is 15238")
	void ZIPOfRecord1698() {
		assertEquals("15238", customers.get(1697).getZIP());
	}

	@Test
	@DisplayName("Record 1698: Phone is 412-963-8520")
	void PhoneOfRecord1698() {
		assertEquals("412-963-8520", customers.get(1697).getPhone());
	}

	@Test
	@DisplayName("Record 1698: Fax is 412-963-5101")
	void FaxOfRecord1698() {
		assertEquals("412-963-5101", customers.get(1697).getFax());
	}

	@Test
	@DisplayName("Record 1698: Email is arlene@gareau.com")
	void EmailOfRecord1698() {
		assertEquals("arlene@gareau.com", customers.get(1697).getEmail());
	}

	@Test
	@DisplayName("Record 1698: Web is http://www.arlenegareau.com")
	void WebOfRecord1698() {
		assertEquals("http://www.arlenegareau.com", customers.get(1697).getWeb());
	}
}
