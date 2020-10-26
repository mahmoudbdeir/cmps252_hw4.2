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

@Tag("6")
class Record_1541 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1541: FirstName is Sharlene")
	void FirstNameOfRecord1541() {
		assertEquals("Sharlene", customers.get(1540).getFirstName());
	}

	@Test
	@DisplayName("Record 1541: LastName is Marin")
	void LastNameOfRecord1541() {
		assertEquals("Marin", customers.get(1540).getLastName());
	}

	@Test
	@DisplayName("Record 1541: Company is Mar Flo Inc")
	void CompanyOfRecord1541() {
		assertEquals("Mar Flo Inc", customers.get(1540).getCompany());
	}

	@Test
	@DisplayName("Record 1541: Address is 501 W Riggin Rd")
	void AddressOfRecord1541() {
		assertEquals("501 W Riggin Rd", customers.get(1540).getAddress());
	}

	@Test
	@DisplayName("Record 1541: City is Muncie")
	void CityOfRecord1541() {
		assertEquals("Muncie", customers.get(1540).getCity());
	}

	@Test
	@DisplayName("Record 1541: County is Delaware")
	void CountyOfRecord1541() {
		assertEquals("Delaware", customers.get(1540).getCounty());
	}

	@Test
	@DisplayName("Record 1541: State is IN")
	void StateOfRecord1541() {
		assertEquals("IN", customers.get(1540).getState());
	}

	@Test
	@DisplayName("Record 1541: ZIP is 47303")
	void ZIPOfRecord1541() {
		assertEquals("47303", customers.get(1540).getZIP());
	}

	@Test
	@DisplayName("Record 1541: Phone is 765-289-7864")
	void PhoneOfRecord1541() {
		assertEquals("765-289-7864", customers.get(1540).getPhone());
	}

	@Test
	@DisplayName("Record 1541: Fax is 765-289-5165")
	void FaxOfRecord1541() {
		assertEquals("765-289-5165", customers.get(1540).getFax());
	}

	@Test
	@DisplayName("Record 1541: Email is sharlene@marin.com")
	void EmailOfRecord1541() {
		assertEquals("sharlene@marin.com", customers.get(1540).getEmail());
	}

	@Test
	@DisplayName("Record 1541: Web is http://www.sharlenemarin.com")
	void WebOfRecord1541() {
		assertEquals("http://www.sharlenemarin.com", customers.get(1540).getWeb());
	}
}
