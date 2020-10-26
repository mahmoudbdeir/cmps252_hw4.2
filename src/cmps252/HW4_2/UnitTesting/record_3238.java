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
class Record_3238 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3238: FirstName is Maxwell")
	void FirstNameOfRecord3238() {
		assertEquals("Maxwell", customers.get(3237).getFirstName());
	}

	@Test
	@DisplayName("Record 3238: LastName is Wheeless")
	void LastNameOfRecord3238() {
		assertEquals("Wheeless", customers.get(3237).getLastName());
	}

	@Test
	@DisplayName("Record 3238: Company is Cantwell Allman Smith & Trokey")
	void CompanyOfRecord3238() {
		assertEquals("Cantwell Allman Smith & Trokey", customers.get(3237).getCompany());
	}

	@Test
	@DisplayName("Record 3238: Address is 713 Beltrami Ave Nw")
	void AddressOfRecord3238() {
		assertEquals("713 Beltrami Ave Nw", customers.get(3237).getAddress());
	}

	@Test
	@DisplayName("Record 3238: City is Bemidji")
	void CityOfRecord3238() {
		assertEquals("Bemidji", customers.get(3237).getCity());
	}

	@Test
	@DisplayName("Record 3238: County is Beltrami")
	void CountyOfRecord3238() {
		assertEquals("Beltrami", customers.get(3237).getCounty());
	}

	@Test
	@DisplayName("Record 3238: State is MN")
	void StateOfRecord3238() {
		assertEquals("MN", customers.get(3237).getState());
	}

	@Test
	@DisplayName("Record 3238: ZIP is 56601")
	void ZIPOfRecord3238() {
		assertEquals("56601", customers.get(3237).getZIP());
	}

	@Test
	@DisplayName("Record 3238: Phone is 218-751-9059")
	void PhoneOfRecord3238() {
		assertEquals("218-751-9059", customers.get(3237).getPhone());
	}

	@Test
	@DisplayName("Record 3238: Fax is 218-751-5034")
	void FaxOfRecord3238() {
		assertEquals("218-751-5034", customers.get(3237).getFax());
	}

	@Test
	@DisplayName("Record 3238: Email is maxwell@wheeless.com")
	void EmailOfRecord3238() {
		assertEquals("maxwell@wheeless.com", customers.get(3237).getEmail());
	}

	@Test
	@DisplayName("Record 3238: Web is http://www.maxwellwheeless.com")
	void WebOfRecord3238() {
		assertEquals("http://www.maxwellwheeless.com", customers.get(3237).getWeb());
	}
}
