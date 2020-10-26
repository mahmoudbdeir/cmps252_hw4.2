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
class Record_3003 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3003: FirstName is Loyd")
	void FirstNameOfRecord3003() {
		assertEquals("Loyd", customers.get(3002).getFirstName());
	}

	@Test
	@DisplayName("Record 3003: LastName is Ford")
	void LastNameOfRecord3003() {
		assertEquals("Ford", customers.get(3002).getLastName());
	}

	@Test
	@DisplayName("Record 3003: Company is Kissinger, Thomas F")
	void CompanyOfRecord3003() {
		assertEquals("Kissinger, Thomas F", customers.get(3002).getCompany());
	}

	@Test
	@DisplayName("Record 3003: Address is 824 S Mill Ave")
	void AddressOfRecord3003() {
		assertEquals("824 S Mill Ave", customers.get(3002).getAddress());
	}

	@Test
	@DisplayName("Record 3003: City is Tempe")
	void CityOfRecord3003() {
		assertEquals("Tempe", customers.get(3002).getCity());
	}

	@Test
	@DisplayName("Record 3003: County is Maricopa")
	void CountyOfRecord3003() {
		assertEquals("Maricopa", customers.get(3002).getCounty());
	}

	@Test
	@DisplayName("Record 3003: State is AZ")
	void StateOfRecord3003() {
		assertEquals("AZ", customers.get(3002).getState());
	}

	@Test
	@DisplayName("Record 3003: ZIP is 85281")
	void ZIPOfRecord3003() {
		assertEquals("85281", customers.get(3002).getZIP());
	}

	@Test
	@DisplayName("Record 3003: Phone is 480-967-2861")
	void PhoneOfRecord3003() {
		assertEquals("480-967-2861", customers.get(3002).getPhone());
	}

	@Test
	@DisplayName("Record 3003: Fax is 480-967-0662")
	void FaxOfRecord3003() {
		assertEquals("480-967-0662", customers.get(3002).getFax());
	}

	@Test
	@DisplayName("Record 3003: Email is loyd@ford.com")
	void EmailOfRecord3003() {
		assertEquals("loyd@ford.com", customers.get(3002).getEmail());
	}

	@Test
	@DisplayName("Record 3003: Web is http://www.loydford.com")
	void WebOfRecord3003() {
		assertEquals("http://www.loydford.com", customers.get(3002).getWeb());
	}
}
