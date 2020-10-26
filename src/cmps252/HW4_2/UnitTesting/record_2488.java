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

@Tag("22")
class Record_2488 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2488: FirstName is Carey")
	void FirstNameOfRecord2488() {
		assertEquals("Carey", customers.get(2487).getFirstName());
	}

	@Test
	@DisplayName("Record 2488: LastName is Bilder")
	void LastNameOfRecord2488() {
		assertEquals("Bilder", customers.get(2487).getLastName());
	}

	@Test
	@DisplayName("Record 2488: Company is Kinkos Copies")
	void CompanyOfRecord2488() {
		assertEquals("Kinkos Copies", customers.get(2487).getCompany());
	}

	@Test
	@DisplayName("Record 2488: Address is 131 Tomahawk Dr  #-21")
	void AddressOfRecord2488() {
		assertEquals("131 Tomahawk Dr  #-21", customers.get(2487).getAddress());
	}

	@Test
	@DisplayName("Record 2488: City is Satellite Beach")
	void CityOfRecord2488() {
		assertEquals("Satellite Beach", customers.get(2487).getCity());
	}

	@Test
	@DisplayName("Record 2488: County is Brevard")
	void CountyOfRecord2488() {
		assertEquals("Brevard", customers.get(2487).getCounty());
	}

	@Test
	@DisplayName("Record 2488: State is FL")
	void StateOfRecord2488() {
		assertEquals("FL", customers.get(2487).getState());
	}

	@Test
	@DisplayName("Record 2488: ZIP is 32937")
	void ZIPOfRecord2488() {
		assertEquals("32937", customers.get(2487).getZIP());
	}

	@Test
	@DisplayName("Record 2488: Phone is 321-777-2302")
	void PhoneOfRecord2488() {
		assertEquals("321-777-2302", customers.get(2487).getPhone());
	}

	@Test
	@DisplayName("Record 2488: Fax is 321-777-2734")
	void FaxOfRecord2488() {
		assertEquals("321-777-2734", customers.get(2487).getFax());
	}

	@Test
	@DisplayName("Record 2488: Email is carey@bilder.com")
	void EmailOfRecord2488() {
		assertEquals("carey@bilder.com", customers.get(2487).getEmail());
	}

	@Test
	@DisplayName("Record 2488: Web is http://www.careybilder.com")
	void WebOfRecord2488() {
		assertEquals("http://www.careybilder.com", customers.get(2487).getWeb());
	}
}
