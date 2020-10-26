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

@Tag("28")
class Record_997 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 997: FirstName is Lauren")
	void FirstNameOfRecord997() {
		assertEquals("Lauren", customers.get(996).getFirstName());
	}

	@Test
	@DisplayName("Record 997: LastName is Ewbank")
	void LastNameOfRecord997() {
		assertEquals("Ewbank", customers.get(996).getLastName());
	}

	@Test
	@DisplayName("Record 997: Company is American Metal Products")
	void CompanyOfRecord997() {
		assertEquals("American Metal Products", customers.get(996).getCompany());
	}

	@Test
	@DisplayName("Record 997: Address is 1922 Martin Luther King Jr Ave")
	void AddressOfRecord997() {
		assertEquals("1922 Martin Luther King Jr Ave", customers.get(996).getAddress());
	}

	@Test
	@DisplayName("Record 997: City is Washington")
	void CityOfRecord997() {
		assertEquals("Washington", customers.get(996).getCity());
	}

	@Test
	@DisplayName("Record 997: County is District of Columbia")
	void CountyOfRecord997() {
		assertEquals("District of Columbia", customers.get(996).getCounty());
	}

	@Test
	@DisplayName("Record 997: State is DC")
	void StateOfRecord997() {
		assertEquals("DC", customers.get(996).getState());
	}

	@Test
	@DisplayName("Record 997: ZIP is 20020")
	void ZIPOfRecord997() {
		assertEquals("20020", customers.get(996).getZIP());
	}

	@Test
	@DisplayName("Record 997: Phone is 202-610-3673")
	void PhoneOfRecord997() {
		assertEquals("202-610-3673", customers.get(996).getPhone());
	}

	@Test
	@DisplayName("Record 997: Fax is 202-610-7172")
	void FaxOfRecord997() {
		assertEquals("202-610-7172", customers.get(996).getFax());
	}

	@Test
	@DisplayName("Record 997: Email is lauren@ewbank.com")
	void EmailOfRecord997() {
		assertEquals("lauren@ewbank.com", customers.get(996).getEmail());
	}

	@Test
	@DisplayName("Record 997: Web is http://www.laurenewbank.com")
	void WebOfRecord997() {
		assertEquals("http://www.laurenewbank.com", customers.get(996).getWeb());
	}
}
