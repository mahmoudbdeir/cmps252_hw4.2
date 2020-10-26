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

@Tag("30")
class Record_4522 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4522: FirstName is Brice")
	void FirstNameOfRecord4522() {
		assertEquals("Brice", customers.get(4521).getFirstName());
	}

	@Test
	@DisplayName("Record 4522: LastName is Yetto")
	void LastNameOfRecord4522() {
		assertEquals("Yetto", customers.get(4521).getLastName());
	}

	@Test
	@DisplayName("Record 4522: Company is R Michael Tabor Inc")
	void CompanyOfRecord4522() {
		assertEquals("R Michael Tabor Inc", customers.get(4521).getCompany());
	}

	@Test
	@DisplayName("Record 4522: Address is 270 S Pine St")
	void AddressOfRecord4522() {
		assertEquals("270 S Pine St", customers.get(4521).getAddress());
	}

	@Test
	@DisplayName("Record 4522: City is Hazleton")
	void CityOfRecord4522() {
		assertEquals("Hazleton", customers.get(4521).getCity());
	}

	@Test
	@DisplayName("Record 4522: County is Luzerne")
	void CountyOfRecord4522() {
		assertEquals("Luzerne", customers.get(4521).getCounty());
	}

	@Test
	@DisplayName("Record 4522: State is PA")
	void StateOfRecord4522() {
		assertEquals("PA", customers.get(4521).getState());
	}

	@Test
	@DisplayName("Record 4522: ZIP is 18201")
	void ZIPOfRecord4522() {
		assertEquals("18201", customers.get(4521).getZIP());
	}

	@Test
	@DisplayName("Record 4522: Phone is 570-455-5977")
	void PhoneOfRecord4522() {
		assertEquals("570-455-5977", customers.get(4521).getPhone());
	}

	@Test
	@DisplayName("Record 4522: Fax is 570-455-4794")
	void FaxOfRecord4522() {
		assertEquals("570-455-4794", customers.get(4521).getFax());
	}

	@Test
	@DisplayName("Record 4522: Email is brice@yetto.com")
	void EmailOfRecord4522() {
		assertEquals("brice@yetto.com", customers.get(4521).getEmail());
	}

	@Test
	@DisplayName("Record 4522: Web is http://www.briceyetto.com")
	void WebOfRecord4522() {
		assertEquals("http://www.briceyetto.com", customers.get(4521).getWeb());
	}
}
