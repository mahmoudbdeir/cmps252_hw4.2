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

@Tag("36")
class Record_2220 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2220: FirstName is Brenda")
	void FirstNameOfRecord2220() {
		assertEquals("Brenda", customers.get(2219).getFirstName());
	}

	@Test
	@DisplayName("Record 2220: LastName is Burket")
	void LastNameOfRecord2220() {
		assertEquals("Burket", customers.get(2219).getLastName());
	}

	@Test
	@DisplayName("Record 2220: Company is Color Carton Corp")
	void CompanyOfRecord2220() {
		assertEquals("Color Carton Corp", customers.get(2219).getCompany());
	}

	@Test
	@DisplayName("Record 2220: Address is 1 Jacobus Ave")
	void AddressOfRecord2220() {
		assertEquals("1 Jacobus Ave", customers.get(2219).getAddress());
	}

	@Test
	@DisplayName("Record 2220: City is Kearny")
	void CityOfRecord2220() {
		assertEquals("Kearny", customers.get(2219).getCity());
	}

	@Test
	@DisplayName("Record 2220: County is Hudson")
	void CountyOfRecord2220() {
		assertEquals("Hudson", customers.get(2219).getCounty());
	}

	@Test
	@DisplayName("Record 2220: State is NJ")
	void StateOfRecord2220() {
		assertEquals("NJ", customers.get(2219).getState());
	}

	@Test
	@DisplayName("Record 2220: ZIP is 7032")
	void ZIPOfRecord2220() {
		assertEquals("7032", customers.get(2219).getZIP());
	}

	@Test
	@DisplayName("Record 2220: Phone is 201-589-1566")
	void PhoneOfRecord2220() {
		assertEquals("201-589-1566", customers.get(2219).getPhone());
	}

	@Test
	@DisplayName("Record 2220: Fax is 201-589-2831")
	void FaxOfRecord2220() {
		assertEquals("201-589-2831", customers.get(2219).getFax());
	}

	@Test
	@DisplayName("Record 2220: Email is brenda@burket.com")
	void EmailOfRecord2220() {
		assertEquals("brenda@burket.com", customers.get(2219).getEmail());
	}

	@Test
	@DisplayName("Record 2220: Web is http://www.brendaburket.com")
	void WebOfRecord2220() {
		assertEquals("http://www.brendaburket.com", customers.get(2219).getWeb());
	}
}
