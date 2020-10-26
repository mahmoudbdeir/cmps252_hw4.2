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

@Tag("10")
class Record_3065 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3065: FirstName is Elvis")
	void FirstNameOfRecord3065() {
		assertEquals("Elvis", customers.get(3064).getFirstName());
	}

	@Test
	@DisplayName("Record 3065: LastName is Kirkconnell")
	void LastNameOfRecord3065() {
		assertEquals("Kirkconnell", customers.get(3064).getLastName());
	}

	@Test
	@DisplayName("Record 3065: Company is Du Ross & Du Ross")
	void CompanyOfRecord3065() {
		assertEquals("Du Ross & Du Ross", customers.get(3064).getCompany());
	}

	@Test
	@DisplayName("Record 3065: Address is 3313 15 Ave")
	void AddressOfRecord3065() {
		assertEquals("3313 15 Ave", customers.get(3064).getAddress());
	}

	@Test
	@DisplayName("Record 3065: City is Pittsburgh")
	void CityOfRecord3065() {
		assertEquals("Pittsburgh", customers.get(3064).getCity());
	}

	@Test
	@DisplayName("Record 3065: County is Allegheny")
	void CountyOfRecord3065() {
		assertEquals("Allegheny", customers.get(3064).getCounty());
	}

	@Test
	@DisplayName("Record 3065: State is PA")
	void StateOfRecord3065() {
		assertEquals("PA", customers.get(3064).getState());
	}

	@Test
	@DisplayName("Record 3065: ZIP is 15201")
	void ZIPOfRecord3065() {
		assertEquals("15201", customers.get(3064).getZIP());
	}

	@Test
	@DisplayName("Record 3065: Phone is 412-621-2770")
	void PhoneOfRecord3065() {
		assertEquals("412-621-2770", customers.get(3064).getPhone());
	}

	@Test
	@DisplayName("Record 3065: Fax is 412-621-9986")
	void FaxOfRecord3065() {
		assertEquals("412-621-9986", customers.get(3064).getFax());
	}

	@Test
	@DisplayName("Record 3065: Email is elvis@kirkconnell.com")
	void EmailOfRecord3065() {
		assertEquals("elvis@kirkconnell.com", customers.get(3064).getEmail());
	}

	@Test
	@DisplayName("Record 3065: Web is http://www.elviskirkconnell.com")
	void WebOfRecord3065() {
		assertEquals("http://www.elviskirkconnell.com", customers.get(3064).getWeb());
	}
}
