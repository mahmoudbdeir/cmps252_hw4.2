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

@Tag("9")
class Record_3183 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3183: FirstName is Dollie")
	void FirstNameOfRecord3183() {
		assertEquals("Dollie", customers.get(3182).getFirstName());
	}

	@Test
	@DisplayName("Record 3183: LastName is Nestle")
	void LastNameOfRecord3183() {
		assertEquals("Nestle", customers.get(3182).getLastName());
	}

	@Test
	@DisplayName("Record 3183: Company is Garland, Tom")
	void CompanyOfRecord3183() {
		assertEquals("Garland, Tom", customers.get(3182).getCompany());
	}

	@Test
	@DisplayName("Record 3183: Address is 5220 N 125th St")
	void AddressOfRecord3183() {
		assertEquals("5220 N 125th St", customers.get(3182).getAddress());
	}

	@Test
	@DisplayName("Record 3183: City is Butler")
	void CityOfRecord3183() {
		assertEquals("Butler", customers.get(3182).getCity());
	}

	@Test
	@DisplayName("Record 3183: County is Waukesha")
	void CountyOfRecord3183() {
		assertEquals("Waukesha", customers.get(3182).getCounty());
	}

	@Test
	@DisplayName("Record 3183: State is WI")
	void StateOfRecord3183() {
		assertEquals("WI", customers.get(3182).getState());
	}

	@Test
	@DisplayName("Record 3183: ZIP is 53007")
	void ZIPOfRecord3183() {
		assertEquals("53007", customers.get(3182).getZIP());
	}

	@Test
	@DisplayName("Record 3183: Phone is 262-781-7023")
	void PhoneOfRecord3183() {
		assertEquals("262-781-7023", customers.get(3182).getPhone());
	}

	@Test
	@DisplayName("Record 3183: Fax is 262-781-7045")
	void FaxOfRecord3183() {
		assertEquals("262-781-7045", customers.get(3182).getFax());
	}

	@Test
	@DisplayName("Record 3183: Email is dollie@nestle.com")
	void EmailOfRecord3183() {
		assertEquals("dollie@nestle.com", customers.get(3182).getEmail());
	}

	@Test
	@DisplayName("Record 3183: Web is http://www.dollienestle.com")
	void WebOfRecord3183() {
		assertEquals("http://www.dollienestle.com", customers.get(3182).getWeb());
	}
}
