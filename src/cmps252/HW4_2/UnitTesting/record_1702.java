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

@Tag("0")
class Record_1702 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1702: FirstName is Floyd")
	void FirstNameOfRecord1702() {
		assertEquals("Floyd", customers.get(1701).getFirstName());
	}

	@Test
	@DisplayName("Record 1702: LastName is Philips")
	void LastNameOfRecord1702() {
		assertEquals("Philips", customers.get(1701).getLastName());
	}

	@Test
	@DisplayName("Record 1702: Company is Dangelo Law Office")
	void CompanyOfRecord1702() {
		assertEquals("Dangelo Law Office", customers.get(1701).getCompany());
	}

	@Test
	@DisplayName("Record 1702: Address is 115 N 5th St")
	void AddressOfRecord1702() {
		assertEquals("115 N 5th St", customers.get(1701).getAddress());
	}

	@Test
	@DisplayName("Record 1702: City is Perkasie")
	void CityOfRecord1702() {
		assertEquals("Perkasie", customers.get(1701).getCity());
	}

	@Test
	@DisplayName("Record 1702: County is Bucks")
	void CountyOfRecord1702() {
		assertEquals("Bucks", customers.get(1701).getCounty());
	}

	@Test
	@DisplayName("Record 1702: State is PA")
	void StateOfRecord1702() {
		assertEquals("PA", customers.get(1701).getState());
	}

	@Test
	@DisplayName("Record 1702: ZIP is 18944")
	void ZIPOfRecord1702() {
		assertEquals("18944", customers.get(1701).getZIP());
	}

	@Test
	@DisplayName("Record 1702: Phone is 215-257-5612")
	void PhoneOfRecord1702() {
		assertEquals("215-257-5612", customers.get(1701).getPhone());
	}

	@Test
	@DisplayName("Record 1702: Fax is 215-257-2493")
	void FaxOfRecord1702() {
		assertEquals("215-257-2493", customers.get(1701).getFax());
	}

	@Test
	@DisplayName("Record 1702: Email is floyd@philips.com")
	void EmailOfRecord1702() {
		assertEquals("floyd@philips.com", customers.get(1701).getEmail());
	}

	@Test
	@DisplayName("Record 1702: Web is http://www.floydphilips.com")
	void WebOfRecord1702() {
		assertEquals("http://www.floydphilips.com", customers.get(1701).getWeb());
	}
}
