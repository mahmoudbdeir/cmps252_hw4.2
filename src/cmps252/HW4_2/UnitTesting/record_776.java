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
class Record_776 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 776: FirstName is Leona")
	void FirstNameOfRecord776() {
		assertEquals("Leona", customers.get(775).getFirstName());
	}

	@Test
	@DisplayName("Record 776: LastName is Golts")
	void LastNameOfRecord776() {
		assertEquals("Golts", customers.get(775).getLastName());
	}

	@Test
	@DisplayName("Record 776: Company is Magnetek")
	void CompanyOfRecord776() {
		assertEquals("Magnetek", customers.get(775).getCompany());
	}

	@Test
	@DisplayName("Record 776: Address is 3101 Vernon Blvd")
	void AddressOfRecord776() {
		assertEquals("3101 Vernon Blvd", customers.get(775).getAddress());
	}

	@Test
	@DisplayName("Record 776: City is Astoria")
	void CityOfRecord776() {
		assertEquals("Astoria", customers.get(775).getCity());
	}

	@Test
	@DisplayName("Record 776: County is Queens")
	void CountyOfRecord776() {
		assertEquals("Queens", customers.get(775).getCounty());
	}

	@Test
	@DisplayName("Record 776: State is NY")
	void StateOfRecord776() {
		assertEquals("NY", customers.get(775).getState());
	}

	@Test
	@DisplayName("Record 776: ZIP is 11106")
	void ZIPOfRecord776() {
		assertEquals("11106", customers.get(775).getZIP());
	}

	@Test
	@DisplayName("Record 776: Phone is 718-204-8790")
	void PhoneOfRecord776() {
		assertEquals("718-204-8790", customers.get(775).getPhone());
	}

	@Test
	@DisplayName("Record 776: Fax is 718-204-7602")
	void FaxOfRecord776() {
		assertEquals("718-204-7602", customers.get(775).getFax());
	}

	@Test
	@DisplayName("Record 776: Email is leona@golts.com")
	void EmailOfRecord776() {
		assertEquals("leona@golts.com", customers.get(775).getEmail());
	}

	@Test
	@DisplayName("Record 776: Web is http://www.leonagolts.com")
	void WebOfRecord776() {
		assertEquals("http://www.leonagolts.com", customers.get(775).getWeb());
	}
}
