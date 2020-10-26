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

@Tag("44")
class Record_4274 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4274: FirstName is Ernestina")
	void FirstNameOfRecord4274() {
		assertEquals("Ernestina", customers.get(4273).getFirstName());
	}

	@Test
	@DisplayName("Record 4274: LastName is Megna")
	void LastNameOfRecord4274() {
		assertEquals("Megna", customers.get(4273).getLastName());
	}

	@Test
	@DisplayName("Record 4274: Company is Golden Eagle Trading Co")
	void CompanyOfRecord4274() {
		assertEquals("Golden Eagle Trading Co", customers.get(4273).getCompany());
	}

	@Test
	@DisplayName("Record 4274: Address is 347 S Ridgewood Ave")
	void AddressOfRecord4274() {
		assertEquals("347 S Ridgewood Ave", customers.get(4273).getAddress());
	}

	@Test
	@DisplayName("Record 4274: City is Daytona Beach")
	void CityOfRecord4274() {
		assertEquals("Daytona Beach", customers.get(4273).getCity());
	}

	@Test
	@DisplayName("Record 4274: County is Volusia")
	void CountyOfRecord4274() {
		assertEquals("Volusia", customers.get(4273).getCounty());
	}

	@Test
	@DisplayName("Record 4274: State is FL")
	void StateOfRecord4274() {
		assertEquals("FL", customers.get(4273).getState());
	}

	@Test
	@DisplayName("Record 4274: ZIP is 32114")
	void ZIPOfRecord4274() {
		assertEquals("32114", customers.get(4273).getZIP());
	}

	@Test
	@DisplayName("Record 4274: Phone is 386-255-1108")
	void PhoneOfRecord4274() {
		assertEquals("386-255-1108", customers.get(4273).getPhone());
	}

	@Test
	@DisplayName("Record 4274: Fax is 386-255-8384")
	void FaxOfRecord4274() {
		assertEquals("386-255-8384", customers.get(4273).getFax());
	}

	@Test
	@DisplayName("Record 4274: Email is ernestina@megna.com")
	void EmailOfRecord4274() {
		assertEquals("ernestina@megna.com", customers.get(4273).getEmail());
	}

	@Test
	@DisplayName("Record 4274: Web is http://www.ernestinamegna.com")
	void WebOfRecord4274() {
		assertEquals("http://www.ernestinamegna.com", customers.get(4273).getWeb());
	}
}
