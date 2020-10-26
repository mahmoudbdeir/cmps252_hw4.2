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

@Tag("13")
class Record_266 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 266: FirstName is Alonzo")
	void FirstNameOfRecord266() {
		assertEquals("Alonzo", customers.get(265).getFirstName());
	}

	@Test
	@DisplayName("Record 266: LastName is Shubov")
	void LastNameOfRecord266() {
		assertEquals("Shubov", customers.get(265).getLastName());
	}

	@Test
	@DisplayName("Record 266: Company is South Florida Yachts Inc")
	void CompanyOfRecord266() {
		assertEquals("South Florida Yachts Inc", customers.get(265).getCompany());
	}

	@Test
	@DisplayName("Record 266: Address is 468 Moore Ln")
	void AddressOfRecord266() {
		assertEquals("468 Moore Ln", customers.get(265).getAddress());
	}

	@Test
	@DisplayName("Record 266: City is Billings")
	void CityOfRecord266() {
		assertEquals("Billings", customers.get(265).getCity());
	}

	@Test
	@DisplayName("Record 266: County is Yellowstone")
	void CountyOfRecord266() {
		assertEquals("Yellowstone", customers.get(265).getCounty());
	}

	@Test
	@DisplayName("Record 266: State is MT")
	void StateOfRecord266() {
		assertEquals("MT", customers.get(265).getState());
	}

	@Test
	@DisplayName("Record 266: ZIP is 59101")
	void ZIPOfRecord266() {
		assertEquals("59101", customers.get(265).getZIP());
	}

	@Test
	@DisplayName("Record 266: Phone is 406-245-8735")
	void PhoneOfRecord266() {
		assertEquals("406-245-8735", customers.get(265).getPhone());
	}

	@Test
	@DisplayName("Record 266: Fax is 406-245-5833")
	void FaxOfRecord266() {
		assertEquals("406-245-5833", customers.get(265).getFax());
	}

	@Test
	@DisplayName("Record 266: Email is alonzo@shubov.com")
	void EmailOfRecord266() {
		assertEquals("alonzo@shubov.com", customers.get(265).getEmail());
	}

	@Test
	@DisplayName("Record 266: Web is http://www.alonzoshubov.com")
	void WebOfRecord266() {
		assertEquals("http://www.alonzoshubov.com", customers.get(265).getWeb());
	}
}
