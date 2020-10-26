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
class Record_1989 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1989: FirstName is Carmella")
	void FirstNameOfRecord1989() {
		assertEquals("Carmella", customers.get(1988).getFirstName());
	}

	@Test
	@DisplayName("Record 1989: LastName is Aboulahoud")
	void LastNameOfRecord1989() {
		assertEquals("Aboulahoud", customers.get(1988).getLastName());
	}

	@Test
	@DisplayName("Record 1989: Company is Averitt, Jimmy C")
	void CompanyOfRecord1989() {
		assertEquals("Averitt, Jimmy C", customers.get(1988).getCompany());
	}

	@Test
	@DisplayName("Record 1989: Address is 810 Park Way")
	void AddressOfRecord1989() {
		assertEquals("810 Park Way", customers.get(1988).getAddress());
	}

	@Test
	@DisplayName("Record 1989: City is Broomall")
	void CityOfRecord1989() {
		assertEquals("Broomall", customers.get(1988).getCity());
	}

	@Test
	@DisplayName("Record 1989: County is Delaware")
	void CountyOfRecord1989() {
		assertEquals("Delaware", customers.get(1988).getCounty());
	}

	@Test
	@DisplayName("Record 1989: State is PA")
	void StateOfRecord1989() {
		assertEquals("PA", customers.get(1988).getState());
	}

	@Test
	@DisplayName("Record 1989: ZIP is 19008")
	void ZIPOfRecord1989() {
		assertEquals("19008", customers.get(1988).getZIP());
	}

	@Test
	@DisplayName("Record 1989: Phone is 610-328-2416")
	void PhoneOfRecord1989() {
		assertEquals("610-328-2416", customers.get(1988).getPhone());
	}

	@Test
	@DisplayName("Record 1989: Fax is 610-328-5381")
	void FaxOfRecord1989() {
		assertEquals("610-328-5381", customers.get(1988).getFax());
	}

	@Test
	@DisplayName("Record 1989: Email is carmella@aboulahoud.com")
	void EmailOfRecord1989() {
		assertEquals("carmella@aboulahoud.com", customers.get(1988).getEmail());
	}

	@Test
	@DisplayName("Record 1989: Web is http://www.carmellaaboulahoud.com")
	void WebOfRecord1989() {
		assertEquals("http://www.carmellaaboulahoud.com", customers.get(1988).getWeb());
	}
}
