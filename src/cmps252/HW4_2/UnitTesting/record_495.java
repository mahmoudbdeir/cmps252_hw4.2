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

@Tag("49")
class Record_495 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 495: FirstName is Colton")
	void FirstNameOfRecord495() {
		assertEquals("Colton", customers.get(494).getFirstName());
	}

	@Test
	@DisplayName("Record 495: LastName is Courseault")
	void LastNameOfRecord495() {
		assertEquals("Courseault", customers.get(494).getLastName());
	}

	@Test
	@DisplayName("Record 495: Company is Arquati Window Covering")
	void CompanyOfRecord495() {
		assertEquals("Arquati Window Covering", customers.get(494).getCompany());
	}

	@Test
	@DisplayName("Record 495: Address is 1707 Arthur St Ne")
	void AddressOfRecord495() {
		assertEquals("1707 Arthur St Ne", customers.get(494).getAddress());
	}

	@Test
	@DisplayName("Record 495: City is Minneapolis")
	void CityOfRecord495() {
		assertEquals("Minneapolis", customers.get(494).getCity());
	}

	@Test
	@DisplayName("Record 495: County is Hennepin")
	void CountyOfRecord495() {
		assertEquals("Hennepin", customers.get(494).getCounty());
	}

	@Test
	@DisplayName("Record 495: State is MN")
	void StateOfRecord495() {
		assertEquals("MN", customers.get(494).getState());
	}

	@Test
	@DisplayName("Record 495: ZIP is 55413")
	void ZIPOfRecord495() {
		assertEquals("55413", customers.get(494).getZIP());
	}

	@Test
	@DisplayName("Record 495: Phone is 612-788-5627")
	void PhoneOfRecord495() {
		assertEquals("612-788-5627", customers.get(494).getPhone());
	}

	@Test
	@DisplayName("Record 495: Fax is 612-788-0679")
	void FaxOfRecord495() {
		assertEquals("612-788-0679", customers.get(494).getFax());
	}

	@Test
	@DisplayName("Record 495: Email is colton@courseault.com")
	void EmailOfRecord495() {
		assertEquals("colton@courseault.com", customers.get(494).getEmail());
	}

	@Test
	@DisplayName("Record 495: Web is http://www.coltoncourseault.com")
	void WebOfRecord495() {
		assertEquals("http://www.coltoncourseault.com", customers.get(494).getWeb());
	}
}
