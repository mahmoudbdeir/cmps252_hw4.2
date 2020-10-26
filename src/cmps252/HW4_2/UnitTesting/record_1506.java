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

@Tag("42")
class Record_1506 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1506: FirstName is Mercedes")
	void FirstNameOfRecord1506() {
		assertEquals("Mercedes", customers.get(1505).getFirstName());
	}

	@Test
	@DisplayName("Record 1506: LastName is Nipple")
	void LastNameOfRecord1506() {
		assertEquals("Nipple", customers.get(1505).getLastName());
	}

	@Test
	@DisplayName("Record 1506: Company is N Car Law Enfcmnt Ofcr Assn")
	void CompanyOfRecord1506() {
		assertEquals("N Car Law Enfcmnt Ofcr Assn", customers.get(1505).getCompany());
	}

	@Test
	@DisplayName("Record 1506: Address is 8 S Main St")
	void AddressOfRecord1506() {
		assertEquals("8 S Main St", customers.get(1505).getAddress());
	}

	@Test
	@DisplayName("Record 1506: City is Millbury")
	void CityOfRecord1506() {
		assertEquals("Millbury", customers.get(1505).getCity());
	}

	@Test
	@DisplayName("Record 1506: County is Worcester")
	void CountyOfRecord1506() {
		assertEquals("Worcester", customers.get(1505).getCounty());
	}

	@Test
	@DisplayName("Record 1506: State is MA")
	void StateOfRecord1506() {
		assertEquals("MA", customers.get(1505).getState());
	}

	@Test
	@DisplayName("Record 1506: ZIP is 1527")
	void ZIPOfRecord1506() {
		assertEquals("1527", customers.get(1505).getZIP());
	}

	@Test
	@DisplayName("Record 1506: Phone is 508-865-3986")
	void PhoneOfRecord1506() {
		assertEquals("508-865-3986", customers.get(1505).getPhone());
	}

	@Test
	@DisplayName("Record 1506: Fax is 508-865-3276")
	void FaxOfRecord1506() {
		assertEquals("508-865-3276", customers.get(1505).getFax());
	}

	@Test
	@DisplayName("Record 1506: Email is mercedes@nipple.com")
	void EmailOfRecord1506() {
		assertEquals("mercedes@nipple.com", customers.get(1505).getEmail());
	}

	@Test
	@DisplayName("Record 1506: Web is http://www.mercedesnipple.com")
	void WebOfRecord1506() {
		assertEquals("http://www.mercedesnipple.com", customers.get(1505).getWeb());
	}
}
