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

@Tag("49")
class Record_2356 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2356: FirstName is Rachel")
	void FirstNameOfRecord2356() {
		assertEquals("Rachel", customers.get(2355).getFirstName());
	}

	@Test
	@DisplayName("Record 2356: LastName is Tietse")
	void LastNameOfRecord2356() {
		assertEquals("Tietse", customers.get(2355).getLastName());
	}

	@Test
	@DisplayName("Record 2356: Company is Vacuum Schmelze")
	void CompanyOfRecord2356() {
		assertEquals("Vacuum Schmelze", customers.get(2355).getCompany());
	}

	@Test
	@DisplayName("Record 2356: Address is 15312 Spencerville Ct")
	void AddressOfRecord2356() {
		assertEquals("15312 Spencerville Ct", customers.get(2355).getAddress());
	}

	@Test
	@DisplayName("Record 2356: City is Burtonsville")
	void CityOfRecord2356() {
		assertEquals("Burtonsville", customers.get(2355).getCity());
	}

	@Test
	@DisplayName("Record 2356: County is Montgomery")
	void CountyOfRecord2356() {
		assertEquals("Montgomery", customers.get(2355).getCounty());
	}

	@Test
	@DisplayName("Record 2356: State is MD")
	void StateOfRecord2356() {
		assertEquals("MD", customers.get(2355).getState());
	}

	@Test
	@DisplayName("Record 2356: ZIP is 20866")
	void ZIPOfRecord2356() {
		assertEquals("20866", customers.get(2355).getZIP());
	}

	@Test
	@DisplayName("Record 2356: Phone is 301-421-2031")
	void PhoneOfRecord2356() {
		assertEquals("301-421-2031", customers.get(2355).getPhone());
	}

	@Test
	@DisplayName("Record 2356: Fax is 301-421-9856")
	void FaxOfRecord2356() {
		assertEquals("301-421-9856", customers.get(2355).getFax());
	}

	@Test
	@DisplayName("Record 2356: Email is rachel@tietse.com")
	void EmailOfRecord2356() {
		assertEquals("rachel@tietse.com", customers.get(2355).getEmail());
	}

	@Test
	@DisplayName("Record 2356: Web is http://www.racheltietse.com")
	void WebOfRecord2356() {
		assertEquals("http://www.racheltietse.com", customers.get(2355).getWeb());
	}
}
