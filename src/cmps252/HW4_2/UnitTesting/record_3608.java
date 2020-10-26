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
class Record_3608 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3608: FirstName is Tammy")
	void FirstNameOfRecord3608() {
		assertEquals("Tammy", customers.get(3607).getFirstName());
	}

	@Test
	@DisplayName("Record 3608: LastName is Banchero")
	void LastNameOfRecord3608() {
		assertEquals("Banchero", customers.get(3607).getLastName());
	}

	@Test
	@DisplayName("Record 3608: Company is Mccaw Cellular Commctns Inc")
	void CompanyOfRecord3608() {
		assertEquals("Mccaw Cellular Commctns Inc", customers.get(3607).getCompany());
	}

	@Test
	@DisplayName("Record 3608: Address is 155 S Main St")
	void AddressOfRecord3608() {
		assertEquals("155 S Main St", customers.get(3607).getAddress());
	}

	@Test
	@DisplayName("Record 3608: City is Providence")
	void CityOfRecord3608() {
		assertEquals("Providence", customers.get(3607).getCity());
	}

	@Test
	@DisplayName("Record 3608: County is Providence")
	void CountyOfRecord3608() {
		assertEquals("Providence", customers.get(3607).getCounty());
	}

	@Test
	@DisplayName("Record 3608: State is RI")
	void StateOfRecord3608() {
		assertEquals("RI", customers.get(3607).getState());
	}

	@Test
	@DisplayName("Record 3608: ZIP is 2903")
	void ZIPOfRecord3608() {
		assertEquals("2903", customers.get(3607).getZIP());
	}

	@Test
	@DisplayName("Record 3608: Phone is 401-331-9175")
	void PhoneOfRecord3608() {
		assertEquals("401-331-9175", customers.get(3607).getPhone());
	}

	@Test
	@DisplayName("Record 3608: Fax is 401-331-1521")
	void FaxOfRecord3608() {
		assertEquals("401-331-1521", customers.get(3607).getFax());
	}

	@Test
	@DisplayName("Record 3608: Email is tammy@banchero.com")
	void EmailOfRecord3608() {
		assertEquals("tammy@banchero.com", customers.get(3607).getEmail());
	}

	@Test
	@DisplayName("Record 3608: Web is http://www.tammybanchero.com")
	void WebOfRecord3608() {
		assertEquals("http://www.tammybanchero.com", customers.get(3607).getWeb());
	}
}
