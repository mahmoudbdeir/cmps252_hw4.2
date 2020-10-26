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
class Record_4122 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4122: FirstName is Selina")
	void FirstNameOfRecord4122() {
		assertEquals("Selina", customers.get(4121).getFirstName());
	}

	@Test
	@DisplayName("Record 4122: LastName is Hawkes")
	void LastNameOfRecord4122() {
		assertEquals("Hawkes", customers.get(4121).getLastName());
	}

	@Test
	@DisplayName("Record 4122: Company is Whiting, Jeffrey L Esq")
	void CompanyOfRecord4122() {
		assertEquals("Whiting, Jeffrey L Esq", customers.get(4121).getCompany());
	}

	@Test
	@DisplayName("Record 4122: Address is 7401 Central Hwy")
	void AddressOfRecord4122() {
		assertEquals("7401 Central Hwy", customers.get(4121).getAddress());
	}

	@Test
	@DisplayName("Record 4122: City is Merchantville")
	void CityOfRecord4122() {
		assertEquals("Merchantville", customers.get(4121).getCity());
	}

	@Test
	@DisplayName("Record 4122: County is Camden")
	void CountyOfRecord4122() {
		assertEquals("Camden", customers.get(4121).getCounty());
	}

	@Test
	@DisplayName("Record 4122: State is NJ")
	void StateOfRecord4122() {
		assertEquals("NJ", customers.get(4121).getState());
	}

	@Test
	@DisplayName("Record 4122: ZIP is 8109")
	void ZIPOfRecord4122() {
		assertEquals("8109", customers.get(4121).getZIP());
	}

	@Test
	@DisplayName("Record 4122: Phone is 856-663-3411")
	void PhoneOfRecord4122() {
		assertEquals("856-663-3411", customers.get(4121).getPhone());
	}

	@Test
	@DisplayName("Record 4122: Fax is 856-663-3817")
	void FaxOfRecord4122() {
		assertEquals("856-663-3817", customers.get(4121).getFax());
	}

	@Test
	@DisplayName("Record 4122: Email is selina@hawkes.com")
	void EmailOfRecord4122() {
		assertEquals("selina@hawkes.com", customers.get(4121).getEmail());
	}

	@Test
	@DisplayName("Record 4122: Web is http://www.selinahawkes.com")
	void WebOfRecord4122() {
		assertEquals("http://www.selinahawkes.com", customers.get(4121).getWeb());
	}
}
