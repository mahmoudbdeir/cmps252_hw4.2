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

@Tag("41")
class Record_31 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 31: FirstName is Gloria")
	void FirstNameOfRecord31() {
		assertEquals("Gloria", customers.get(30).getFirstName());
	}

	@Test
	@DisplayName("Record 31: LastName is Hink")
	void LastNameOfRecord31() {
		assertEquals("Hink", customers.get(30).getLastName());
	}

	@Test
	@DisplayName("Record 31: Company is Smith, D Lamar Esq")
	void CompanyOfRecord31() {
		assertEquals("Smith, D Lamar Esq", customers.get(30).getCompany());
	}

	@Test
	@DisplayName("Record 31: Address is 710 107th St")
	void AddressOfRecord31() {
		assertEquals("710 107th St", customers.get(30).getAddress());
	}

	@Test
	@DisplayName("Record 31: City is Arlington")
	void CityOfRecord31() {
		assertEquals("Arlington", customers.get(30).getCity());
	}

	@Test
	@DisplayName("Record 31: County is Tarrant")
	void CountyOfRecord31() {
		assertEquals("Tarrant", customers.get(30).getCounty());
	}

	@Test
	@DisplayName("Record 31: State is TX")
	void StateOfRecord31() {
		assertEquals("TX", customers.get(30).getState());
	}

	@Test
	@DisplayName("Record 31: ZIP is 76011")
	void ZIPOfRecord31() {
		assertEquals("76011", customers.get(30).getZIP());
	}

	@Test
	@DisplayName("Record 31: Phone is 817-640-3567")
	void PhoneOfRecord31() {
		assertEquals("817-640-3567", customers.get(30).getPhone());
	}

	@Test
	@DisplayName("Record 31: Fax is 817-640-5181")
	void FaxOfRecord31() {
		assertEquals("817-640-5181", customers.get(30).getFax());
	}

	@Test
	@DisplayName("Record 31: Email is gloria@hink.com")
	void EmailOfRecord31() {
		assertEquals("gloria@hink.com", customers.get(30).getEmail());
	}

	@Test
	@DisplayName("Record 31: Web is http://www.gloriahink.com")
	void WebOfRecord31() {
		assertEquals("http://www.gloriahink.com", customers.get(30).getWeb());
	}
}
