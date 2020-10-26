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

@Tag("13")
class Record_4757 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4757: FirstName is Arline")
	void FirstNameOfRecord4757() {
		assertEquals("Arline", customers.get(4756).getFirstName());
	}

	@Test
	@DisplayName("Record 4757: LastName is Bonjorno")
	void LastNameOfRecord4757() {
		assertEquals("Bonjorno", customers.get(4756).getLastName());
	}

	@Test
	@DisplayName("Record 4757: Company is Villager Lodge")
	void CompanyOfRecord4757() {
		assertEquals("Villager Lodge", customers.get(4756).getCompany());
	}

	@Test
	@DisplayName("Record 4757: Address is 900 Madison St")
	void AddressOfRecord4757() {
		assertEquals("900 Madison St", customers.get(4756).getAddress());
	}

	@Test
	@DisplayName("Record 4757: City is Seattle")
	void CityOfRecord4757() {
		assertEquals("Seattle", customers.get(4756).getCity());
	}

	@Test
	@DisplayName("Record 4757: County is King")
	void CountyOfRecord4757() {
		assertEquals("King", customers.get(4756).getCounty());
	}

	@Test
	@DisplayName("Record 4757: State is WA")
	void StateOfRecord4757() {
		assertEquals("WA", customers.get(4756).getState());
	}

	@Test
	@DisplayName("Record 4757: ZIP is 98104")
	void ZIPOfRecord4757() {
		assertEquals("98104", customers.get(4756).getZIP());
	}

	@Test
	@DisplayName("Record 4757: Phone is 206-343-4537")
	void PhoneOfRecord4757() {
		assertEquals("206-343-4537", customers.get(4756).getPhone());
	}

	@Test
	@DisplayName("Record 4757: Fax is 206-343-6354")
	void FaxOfRecord4757() {
		assertEquals("206-343-6354", customers.get(4756).getFax());
	}

	@Test
	@DisplayName("Record 4757: Email is arline@bonjorno.com")
	void EmailOfRecord4757() {
		assertEquals("arline@bonjorno.com", customers.get(4756).getEmail());
	}

	@Test
	@DisplayName("Record 4757: Web is http://www.arlinebonjorno.com")
	void WebOfRecord4757() {
		assertEquals("http://www.arlinebonjorno.com", customers.get(4756).getWeb());
	}
}
