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
class Record_3490 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3490: FirstName is Zoila")
	void FirstNameOfRecord3490() {
		assertEquals("Zoila", customers.get(3489).getFirstName());
	}

	@Test
	@DisplayName("Record 3490: LastName is Tempest")
	void LastNameOfRecord3490() {
		assertEquals("Tempest", customers.get(3489).getLastName());
	}

	@Test
	@DisplayName("Record 3490: Company is Bondata")
	void CompanyOfRecord3490() {
		assertEquals("Bondata", customers.get(3489).getCompany());
	}

	@Test
	@DisplayName("Record 3490: Address is 544 Union Ave")
	void AddressOfRecord3490() {
		assertEquals("544 Union Ave", customers.get(3489).getAddress());
	}

	@Test
	@DisplayName("Record 3490: City is Brooklyn")
	void CityOfRecord3490() {
		assertEquals("Brooklyn", customers.get(3489).getCity());
	}

	@Test
	@DisplayName("Record 3490: County is Kings")
	void CountyOfRecord3490() {
		assertEquals("Kings", customers.get(3489).getCounty());
	}

	@Test
	@DisplayName("Record 3490: State is NY")
	void StateOfRecord3490() {
		assertEquals("NY", customers.get(3489).getState());
	}

	@Test
	@DisplayName("Record 3490: ZIP is 11211")
	void ZIPOfRecord3490() {
		assertEquals("11211", customers.get(3489).getZIP());
	}

	@Test
	@DisplayName("Record 3490: Phone is 718-963-9256")
	void PhoneOfRecord3490() {
		assertEquals("718-963-9256", customers.get(3489).getPhone());
	}

	@Test
	@DisplayName("Record 3490: Fax is 718-963-6063")
	void FaxOfRecord3490() {
		assertEquals("718-963-6063", customers.get(3489).getFax());
	}

	@Test
	@DisplayName("Record 3490: Email is zoila@tempest.com")
	void EmailOfRecord3490() {
		assertEquals("zoila@tempest.com", customers.get(3489).getEmail());
	}

	@Test
	@DisplayName("Record 3490: Web is http://www.zoilatempest.com")
	void WebOfRecord3490() {
		assertEquals("http://www.zoilatempest.com", customers.get(3489).getWeb());
	}
}
