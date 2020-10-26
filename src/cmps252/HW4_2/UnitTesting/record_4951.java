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
class Record_4951 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4951: FirstName is Rueben")
	void FirstNameOfRecord4951() {
		assertEquals("Rueben", customers.get(4950).getFirstName());
	}

	@Test
	@DisplayName("Record 4951: LastName is Aquil")
	void LastNameOfRecord4951() {
		assertEquals("Aquil", customers.get(4950).getLastName());
	}

	@Test
	@DisplayName("Record 4951: Company is Derivan & Smith")
	void CompanyOfRecord4951() {
		assertEquals("Derivan & Smith", customers.get(4950).getCompany());
	}

	@Test
	@DisplayName("Record 4951: Address is 179 Kaahumanu Ave")
	void AddressOfRecord4951() {
		assertEquals("179 Kaahumanu Ave", customers.get(4950).getAddress());
	}

	@Test
	@DisplayName("Record 4951: City is Wailuku")
	void CityOfRecord4951() {
		assertEquals("Wailuku", customers.get(4950).getCity());
	}

	@Test
	@DisplayName("Record 4951: County is Maui")
	void CountyOfRecord4951() {
		assertEquals("Maui", customers.get(4950).getCounty());
	}

	@Test
	@DisplayName("Record 4951: State is HI")
	void StateOfRecord4951() {
		assertEquals("HI", customers.get(4950).getState());
	}

	@Test
	@DisplayName("Record 4951: ZIP is 96793")
	void ZIPOfRecord4951() {
		assertEquals("96793", customers.get(4950).getZIP());
	}

	@Test
	@DisplayName("Record 4951: Phone is 808-243-9342")
	void PhoneOfRecord4951() {
		assertEquals("808-243-9342", customers.get(4950).getPhone());
	}

	@Test
	@DisplayName("Record 4951: Fax is 808-243-1305")
	void FaxOfRecord4951() {
		assertEquals("808-243-1305", customers.get(4950).getFax());
	}

	@Test
	@DisplayName("Record 4951: Email is rueben@aquil.com")
	void EmailOfRecord4951() {
		assertEquals("rueben@aquil.com", customers.get(4950).getEmail());
	}

	@Test
	@DisplayName("Record 4951: Web is http://www.ruebenaquil.com")
	void WebOfRecord4951() {
		assertEquals("http://www.ruebenaquil.com", customers.get(4950).getWeb());
	}
}
