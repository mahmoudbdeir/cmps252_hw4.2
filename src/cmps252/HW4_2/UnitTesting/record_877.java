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

@Tag("31")
class Record_877 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 877: FirstName is Cortez")
	void FirstNameOfRecord877() {
		assertEquals("Cortez", customers.get(876).getFirstName());
	}

	@Test
	@DisplayName("Record 877: LastName is Kloster")
	void LastNameOfRecord877() {
		assertEquals("Kloster", customers.get(876).getLastName());
	}

	@Test
	@DisplayName("Record 877: Company is Brydert Air Products")
	void CompanyOfRecord877() {
		assertEquals("Brydert Air Products", customers.get(876).getCompany());
	}

	@Test
	@DisplayName("Record 877: Address is 1900 Garth Rd  #-2")
	void AddressOfRecord877() {
		assertEquals("1900 Garth Rd  #-2", customers.get(876).getAddress());
	}

	@Test
	@DisplayName("Record 877: City is Baytown")
	void CityOfRecord877() {
		assertEquals("Baytown", customers.get(876).getCity());
	}

	@Test
	@DisplayName("Record 877: County is Harris")
	void CountyOfRecord877() {
		assertEquals("Harris", customers.get(876).getCounty());
	}

	@Test
	@DisplayName("Record 877: State is TX")
	void StateOfRecord877() {
		assertEquals("TX", customers.get(876).getState());
	}

	@Test
	@DisplayName("Record 877: ZIP is 77520")
	void ZIPOfRecord877() {
		assertEquals("77520", customers.get(876).getZIP());
	}

	@Test
	@DisplayName("Record 877: Phone is 281-427-7133")
	void PhoneOfRecord877() {
		assertEquals("281-427-7133", customers.get(876).getPhone());
	}

	@Test
	@DisplayName("Record 877: Fax is 281-427-4092")
	void FaxOfRecord877() {
		assertEquals("281-427-4092", customers.get(876).getFax());
	}

	@Test
	@DisplayName("Record 877: Email is cortez@kloster.com")
	void EmailOfRecord877() {
		assertEquals("cortez@kloster.com", customers.get(876).getEmail());
	}

	@Test
	@DisplayName("Record 877: Web is http://www.cortezkloster.com")
	void WebOfRecord877() {
		assertEquals("http://www.cortezkloster.com", customers.get(876).getWeb());
	}
}
