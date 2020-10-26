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

@Tag("1")
class Record_2349 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2349: FirstName is Gustavo")
	void FirstNameOfRecord2349() {
		assertEquals("Gustavo", customers.get(2348).getFirstName());
	}

	@Test
	@DisplayName("Record 2349: LastName is Shroll")
	void LastNameOfRecord2349() {
		assertEquals("Shroll", customers.get(2348).getLastName());
	}

	@Test
	@DisplayName("Record 2349: Company is Rose The Hill Co Inc")
	void CompanyOfRecord2349() {
		assertEquals("Rose The Hill Co Inc", customers.get(2348).getCompany());
	}

	@Test
	@DisplayName("Record 2349: Address is 10308 Hwy 61")
	void AddressOfRecord2349() {
		assertEquals("10308 Hwy 61", customers.get(2348).getAddress());
	}

	@Test
	@DisplayName("Record 2349: City is Saint Rose")
	void CityOfRecord2349() {
		assertEquals("Saint Rose", customers.get(2348).getCity());
	}

	@Test
	@DisplayName("Record 2349: County is Saint Charles")
	void CountyOfRecord2349() {
		assertEquals("Saint Charles", customers.get(2348).getCounty());
	}

	@Test
	@DisplayName("Record 2349: State is LA")
	void StateOfRecord2349() {
		assertEquals("LA", customers.get(2348).getState());
	}

	@Test
	@DisplayName("Record 2349: ZIP is 70087")
	void ZIPOfRecord2349() {
		assertEquals("70087", customers.get(2348).getZIP());
	}

	@Test
	@DisplayName("Record 2349: Phone is 985-469-1564")
	void PhoneOfRecord2349() {
		assertEquals("985-469-1564", customers.get(2348).getPhone());
	}

	@Test
	@DisplayName("Record 2349: Fax is 985-469-3506")
	void FaxOfRecord2349() {
		assertEquals("985-469-3506", customers.get(2348).getFax());
	}

	@Test
	@DisplayName("Record 2349: Email is gustavo@shroll.com")
	void EmailOfRecord2349() {
		assertEquals("gustavo@shroll.com", customers.get(2348).getEmail());
	}

	@Test
	@DisplayName("Record 2349: Web is http://www.gustavoshroll.com")
	void WebOfRecord2349() {
		assertEquals("http://www.gustavoshroll.com", customers.get(2348).getWeb());
	}
}
