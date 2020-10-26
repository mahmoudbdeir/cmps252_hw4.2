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

@Tag("17")
class Record_1653 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1653: FirstName is Kaitlyn")
	void FirstNameOfRecord1653() {
		assertEquals("Kaitlyn", customers.get(1652).getFirstName());
	}

	@Test
	@DisplayName("Record 1653: LastName is Burden")
	void LastNameOfRecord1653() {
		assertEquals("Burden", customers.get(1652).getLastName());
	}

	@Test
	@DisplayName("Record 1653: Company is Northcoast Environmental Ctr")
	void CompanyOfRecord1653() {
		assertEquals("Northcoast Environmental Ctr", customers.get(1652).getCompany());
	}

	@Test
	@DisplayName("Record 1653: Address is 58 S Main St")
	void AddressOfRecord1653() {
		assertEquals("58 S Main St", customers.get(1652).getAddress());
	}

	@Test
	@DisplayName("Record 1653: City is Waterbury")
	void CityOfRecord1653() {
		assertEquals("Waterbury", customers.get(1652).getCity());
	}

	@Test
	@DisplayName("Record 1653: County is Washington")
	void CountyOfRecord1653() {
		assertEquals("Washington", customers.get(1652).getCounty());
	}

	@Test
	@DisplayName("Record 1653: State is VT")
	void StateOfRecord1653() {
		assertEquals("VT", customers.get(1652).getState());
	}

	@Test
	@DisplayName("Record 1653: ZIP is 5676")
	void ZIPOfRecord1653() {
		assertEquals("5676", customers.get(1652).getZIP());
	}

	@Test
	@DisplayName("Record 1653: Phone is 802-244-5930")
	void PhoneOfRecord1653() {
		assertEquals("802-244-5930", customers.get(1652).getPhone());
	}

	@Test
	@DisplayName("Record 1653: Fax is 802-244-9664")
	void FaxOfRecord1653() {
		assertEquals("802-244-9664", customers.get(1652).getFax());
	}

	@Test
	@DisplayName("Record 1653: Email is kaitlyn@burden.com")
	void EmailOfRecord1653() {
		assertEquals("kaitlyn@burden.com", customers.get(1652).getEmail());
	}

	@Test
	@DisplayName("Record 1653: Web is http://www.kaitlynburden.com")
	void WebOfRecord1653() {
		assertEquals("http://www.kaitlynburden.com", customers.get(1652).getWeb());
	}
}
