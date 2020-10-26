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

@Tag("48")
class Record_792 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 792: FirstName is Wes")
	void FirstNameOfRecord792() {
		assertEquals("Wes", customers.get(791).getFirstName());
	}

	@Test
	@DisplayName("Record 792: LastName is Wicka")
	void LastNameOfRecord792() {
		assertEquals("Wicka", customers.get(791).getLastName());
	}

	@Test
	@DisplayName("Record 792: Company is Kol Kraft Manufacturing Co")
	void CompanyOfRecord792() {
		assertEquals("Kol Kraft Manufacturing Co", customers.get(791).getCompany());
	}

	@Test
	@DisplayName("Record 792: Address is 2137 W Lincoln Ave")
	void AddressOfRecord792() {
		assertEquals("2137 W Lincoln Ave", customers.get(791).getAddress());
	}

	@Test
	@DisplayName("Record 792: City is Anahym")
	void CityOfRecord792() {
		assertEquals("Anahym", customers.get(791).getCity());
	}

	@Test
	@DisplayName("Record 792: County is Orange")
	void CountyOfRecord792() {
		assertEquals("Orange", customers.get(791).getCounty());
	}

	@Test
	@DisplayName("Record 792: State is CA")
	void StateOfRecord792() {
		assertEquals("CA", customers.get(791).getState());
	}

	@Test
	@DisplayName("Record 792: ZIP is 92801")
	void ZIPOfRecord792() {
		assertEquals("92801", customers.get(791).getZIP());
	}

	@Test
	@DisplayName("Record 792: Phone is 714-491-2883")
	void PhoneOfRecord792() {
		assertEquals("714-491-2883", customers.get(791).getPhone());
	}

	@Test
	@DisplayName("Record 792: Fax is 714-491-5874")
	void FaxOfRecord792() {
		assertEquals("714-491-5874", customers.get(791).getFax());
	}

	@Test
	@DisplayName("Record 792: Email is wes@wicka.com")
	void EmailOfRecord792() {
		assertEquals("wes@wicka.com", customers.get(791).getEmail());
	}

	@Test
	@DisplayName("Record 792: Web is http://www.weswicka.com")
	void WebOfRecord792() {
		assertEquals("http://www.weswicka.com", customers.get(791).getWeb());
	}
}
