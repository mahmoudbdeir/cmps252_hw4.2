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

@Tag("34")
class Record_2859 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2859: FirstName is Hattie")
	void FirstNameOfRecord2859() {
		assertEquals("Hattie", customers.get(2858).getFirstName());
	}

	@Test
	@DisplayName("Record 2859: LastName is Toler")
	void LastNameOfRecord2859() {
		assertEquals("Toler", customers.get(2858).getLastName());
	}

	@Test
	@DisplayName("Record 2859: Company is Concrete Forming Acc Wi")
	void CompanyOfRecord2859() {
		assertEquals("Concrete Forming Acc Wi", customers.get(2858).getCompany());
	}

	@Test
	@DisplayName("Record 2859: Address is 344 40th St")
	void AddressOfRecord2859() {
		assertEquals("344 40th St", customers.get(2858).getAddress());
	}

	@Test
	@DisplayName("Record 2859: City is Oakland")
	void CityOfRecord2859() {
		assertEquals("Oakland", customers.get(2858).getCity());
	}

	@Test
	@DisplayName("Record 2859: County is Alameda")
	void CountyOfRecord2859() {
		assertEquals("Alameda", customers.get(2858).getCounty());
	}

	@Test
	@DisplayName("Record 2859: State is CA")
	void StateOfRecord2859() {
		assertEquals("CA", customers.get(2858).getState());
	}

	@Test
	@DisplayName("Record 2859: ZIP is 94609")
	void ZIPOfRecord2859() {
		assertEquals("94609", customers.get(2858).getZIP());
	}

	@Test
	@DisplayName("Record 2859: Phone is 510-654-1829")
	void PhoneOfRecord2859() {
		assertEquals("510-654-1829", customers.get(2858).getPhone());
	}

	@Test
	@DisplayName("Record 2859: Fax is 510-654-9159")
	void FaxOfRecord2859() {
		assertEquals("510-654-9159", customers.get(2858).getFax());
	}

	@Test
	@DisplayName("Record 2859: Email is hattie@toler.com")
	void EmailOfRecord2859() {
		assertEquals("hattie@toler.com", customers.get(2858).getEmail());
	}

	@Test
	@DisplayName("Record 2859: Web is http://www.hattietoler.com")
	void WebOfRecord2859() {
		assertEquals("http://www.hattietoler.com", customers.get(2858).getWeb());
	}
}
