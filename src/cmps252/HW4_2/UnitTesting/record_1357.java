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

@Tag("35")
class Record_1357 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1357: FirstName is Deborah")
	void FirstNameOfRecord1357() {
		assertEquals("Deborah", customers.get(1356).getFirstName());
	}

	@Test
	@DisplayName("Record 1357: LastName is Bockskopf")
	void LastNameOfRecord1357() {
		assertEquals("Bockskopf", customers.get(1356).getLastName());
	}

	@Test
	@DisplayName("Record 1357: Company is Signs Now")
	void CompanyOfRecord1357() {
		assertEquals("Signs Now", customers.get(1356).getCompany());
	}

	@Test
	@DisplayName("Record 1357: Address is 220 Lake Dr E")
	void AddressOfRecord1357() {
		assertEquals("220 Lake Dr E", customers.get(1356).getAddress());
	}

	@Test
	@DisplayName("Record 1357: City is Cherry Hill")
	void CityOfRecord1357() {
		assertEquals("Cherry Hill", customers.get(1356).getCity());
	}

	@Test
	@DisplayName("Record 1357: County is Camden")
	void CountyOfRecord1357() {
		assertEquals("Camden", customers.get(1356).getCounty());
	}

	@Test
	@DisplayName("Record 1357: State is NJ")
	void StateOfRecord1357() {
		assertEquals("NJ", customers.get(1356).getState());
	}

	@Test
	@DisplayName("Record 1357: ZIP is 8002")
	void ZIPOfRecord1357() {
		assertEquals("8002", customers.get(1356).getZIP());
	}

	@Test
	@DisplayName("Record 1357: Phone is 856-482-3711")
	void PhoneOfRecord1357() {
		assertEquals("856-482-3711", customers.get(1356).getPhone());
	}

	@Test
	@DisplayName("Record 1357: Fax is 856-482-3101")
	void FaxOfRecord1357() {
		assertEquals("856-482-3101", customers.get(1356).getFax());
	}

	@Test
	@DisplayName("Record 1357: Email is deborah@bockskopf.com")
	void EmailOfRecord1357() {
		assertEquals("deborah@bockskopf.com", customers.get(1356).getEmail());
	}

	@Test
	@DisplayName("Record 1357: Web is http://www.deborahbockskopf.com")
	void WebOfRecord1357() {
		assertEquals("http://www.deborahbockskopf.com", customers.get(1356).getWeb());
	}
}
