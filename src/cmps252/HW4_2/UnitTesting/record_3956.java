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

@Tag("44")
class Record_3956 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3956: FirstName is Phyllis")
	void FirstNameOfRecord3956() {
		assertEquals("Phyllis", customers.get(3955).getFirstName());
	}

	@Test
	@DisplayName("Record 3956: LastName is Kothymer")
	void LastNameOfRecord3956() {
		assertEquals("Kothymer", customers.get(3955).getLastName());
	}

	@Test
	@DisplayName("Record 3956: Company is York Corrugating Co")
	void CompanyOfRecord3956() {
		assertEquals("York Corrugating Co", customers.get(3955).getCompany());
	}

	@Test
	@DisplayName("Record 3956: Address is 1056 W Van Buren St")
	void AddressOfRecord3956() {
		assertEquals("1056 W Van Buren St", customers.get(3955).getAddress());
	}

	@Test
	@DisplayName("Record 3956: City is Chicago")
	void CityOfRecord3956() {
		assertEquals("Chicago", customers.get(3955).getCity());
	}

	@Test
	@DisplayName("Record 3956: County is Cook")
	void CountyOfRecord3956() {
		assertEquals("Cook", customers.get(3955).getCounty());
	}

	@Test
	@DisplayName("Record 3956: State is IL")
	void StateOfRecord3956() {
		assertEquals("IL", customers.get(3955).getState());
	}

	@Test
	@DisplayName("Record 3956: ZIP is 60607")
	void ZIPOfRecord3956() {
		assertEquals("60607", customers.get(3955).getZIP());
	}

	@Test
	@DisplayName("Record 3956: Phone is 312-226-4148")
	void PhoneOfRecord3956() {
		assertEquals("312-226-4148", customers.get(3955).getPhone());
	}

	@Test
	@DisplayName("Record 3956: Fax is 312-226-6623")
	void FaxOfRecord3956() {
		assertEquals("312-226-6623", customers.get(3955).getFax());
	}

	@Test
	@DisplayName("Record 3956: Email is phyllis@kothymer.com")
	void EmailOfRecord3956() {
		assertEquals("phyllis@kothymer.com", customers.get(3955).getEmail());
	}

	@Test
	@DisplayName("Record 3956: Web is http://www.phylliskothymer.com")
	void WebOfRecord3956() {
		assertEquals("http://www.phylliskothymer.com", customers.get(3955).getWeb());
	}
}
