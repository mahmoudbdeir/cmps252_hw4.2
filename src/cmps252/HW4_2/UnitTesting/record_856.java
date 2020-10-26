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

@Tag("18")
class Record_856 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 856: FirstName is Maximo")
	void FirstNameOfRecord856() {
		assertEquals("Maximo", customers.get(855).getFirstName());
	}

	@Test
	@DisplayName("Record 856: LastName is Gillund")
	void LastNameOfRecord856() {
		assertEquals("Gillund", customers.get(855).getLastName());
	}

	@Test
	@DisplayName("Record 856: Company is Intercontinental Publ Inc")
	void CompanyOfRecord856() {
		assertEquals("Intercontinental Publ Inc", customers.get(855).getCompany());
	}

	@Test
	@DisplayName("Record 856: Address is 433 E 5th Ave")
	void AddressOfRecord856() {
		assertEquals("433 E 5th Ave", customers.get(855).getAddress());
	}

	@Test
	@DisplayName("Record 856: City is Gary")
	void CityOfRecord856() {
		assertEquals("Gary", customers.get(855).getCity());
	}

	@Test
	@DisplayName("Record 856: County is Lake")
	void CountyOfRecord856() {
		assertEquals("Lake", customers.get(855).getCounty());
	}

	@Test
	@DisplayName("Record 856: State is IN")
	void StateOfRecord856() {
		assertEquals("IN", customers.get(855).getState());
	}

	@Test
	@DisplayName("Record 856: ZIP is 46402")
	void ZIPOfRecord856() {
		assertEquals("46402", customers.get(855).getZIP());
	}

	@Test
	@DisplayName("Record 856: Phone is 219-885-1094")
	void PhoneOfRecord856() {
		assertEquals("219-885-1094", customers.get(855).getPhone());
	}

	@Test
	@DisplayName("Record 856: Fax is 219-885-6088")
	void FaxOfRecord856() {
		assertEquals("219-885-6088", customers.get(855).getFax());
	}

	@Test
	@DisplayName("Record 856: Email is maximo@gillund.com")
	void EmailOfRecord856() {
		assertEquals("maximo@gillund.com", customers.get(855).getEmail());
	}

	@Test
	@DisplayName("Record 856: Web is http://www.maximogillund.com")
	void WebOfRecord856() {
		assertEquals("http://www.maximogillund.com", customers.get(855).getWeb());
	}
}
