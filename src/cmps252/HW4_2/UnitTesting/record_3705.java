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

@Tag("37")
class Record_3705 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3705: FirstName is Elvis")
	void FirstNameOfRecord3705() {
		assertEquals("Elvis", customers.get(3704).getFirstName());
	}

	@Test
	@DisplayName("Record 3705: LastName is Kowalowski")
	void LastNameOfRecord3705() {
		assertEquals("Kowalowski", customers.get(3704).getLastName());
	}

	@Test
	@DisplayName("Record 3705: Company is Nice Creme Inc")
	void CompanyOfRecord3705() {
		assertEquals("Nice Creme Inc", customers.get(3704).getCompany());
	}

	@Test
	@DisplayName("Record 3705: Address is 31 Cook Ct")
	void AddressOfRecord3705() {
		assertEquals("31 Cook Ct", customers.get(3704).getAddress());
	}

	@Test
	@DisplayName("Record 3705: City is Laconia")
	void CityOfRecord3705() {
		assertEquals("Laconia", customers.get(3704).getCity());
	}

	@Test
	@DisplayName("Record 3705: County is Belknap")
	void CountyOfRecord3705() {
		assertEquals("Belknap", customers.get(3704).getCounty());
	}

	@Test
	@DisplayName("Record 3705: State is NH")
	void StateOfRecord3705() {
		assertEquals("NH", customers.get(3704).getState());
	}

	@Test
	@DisplayName("Record 3705: ZIP is 3246")
	void ZIPOfRecord3705() {
		assertEquals("3246", customers.get(3704).getZIP());
	}

	@Test
	@DisplayName("Record 3705: Phone is 603-528-8912")
	void PhoneOfRecord3705() {
		assertEquals("603-528-8912", customers.get(3704).getPhone());
	}

	@Test
	@DisplayName("Record 3705: Fax is 603-528-7996")
	void FaxOfRecord3705() {
		assertEquals("603-528-7996", customers.get(3704).getFax());
	}

	@Test
	@DisplayName("Record 3705: Email is elvis@kowalowski.com")
	void EmailOfRecord3705() {
		assertEquals("elvis@kowalowski.com", customers.get(3704).getEmail());
	}

	@Test
	@DisplayName("Record 3705: Web is http://www.elviskowalowski.com")
	void WebOfRecord3705() {
		assertEquals("http://www.elviskowalowski.com", customers.get(3704).getWeb());
	}
}
