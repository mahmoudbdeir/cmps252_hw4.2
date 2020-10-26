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

@Tag("42")
class Record_395 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 395: FirstName is Celeste")
	void FirstNameOfRecord395() {
		assertEquals("Celeste", customers.get(394).getFirstName());
	}

	@Test
	@DisplayName("Record 395: LastName is Eriquez")
	void LastNameOfRecord395() {
		assertEquals("Eriquez", customers.get(394).getLastName());
	}

	@Test
	@DisplayName("Record 395: Company is Cafe Ole Magazine")
	void CompanyOfRecord395() {
		assertEquals("Cafe Ole Magazine", customers.get(394).getCompany());
	}

	@Test
	@DisplayName("Record 395: Address is 515 W 19th St")
	void AddressOfRecord395() {
		assertEquals("515 W 19th St", customers.get(394).getAddress());
	}

	@Test
	@DisplayName("Record 395: City is Idaho Falls")
	void CityOfRecord395() {
		assertEquals("Idaho Falls", customers.get(394).getCity());
	}

	@Test
	@DisplayName("Record 395: County is Bonneville")
	void CountyOfRecord395() {
		assertEquals("Bonneville", customers.get(394).getCounty());
	}

	@Test
	@DisplayName("Record 395: State is ID")
	void StateOfRecord395() {
		assertEquals("ID", customers.get(394).getState());
	}

	@Test
	@DisplayName("Record 395: ZIP is 83402")
	void ZIPOfRecord395() {
		assertEquals("83402", customers.get(394).getZIP());
	}

	@Test
	@DisplayName("Record 395: Phone is 208-529-7858")
	void PhoneOfRecord395() {
		assertEquals("208-529-7858", customers.get(394).getPhone());
	}

	@Test
	@DisplayName("Record 395: Fax is 208-529-5444")
	void FaxOfRecord395() {
		assertEquals("208-529-5444", customers.get(394).getFax());
	}

	@Test
	@DisplayName("Record 395: Email is celeste@eriquez.com")
	void EmailOfRecord395() {
		assertEquals("celeste@eriquez.com", customers.get(394).getEmail());
	}

	@Test
	@DisplayName("Record 395: Web is http://www.celesteeriquez.com")
	void WebOfRecord395() {
		assertEquals("http://www.celesteeriquez.com", customers.get(394).getWeb());
	}
}
