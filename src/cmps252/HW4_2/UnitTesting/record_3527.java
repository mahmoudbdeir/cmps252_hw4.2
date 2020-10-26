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

@Tag("16")
class Record_3527 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3527: FirstName is Lyman")
	void FirstNameOfRecord3527() {
		assertEquals("Lyman", customers.get(3526).getFirstName());
	}

	@Test
	@DisplayName("Record 3527: LastName is Makler")
	void LastNameOfRecord3527() {
		assertEquals("Makler", customers.get(3526).getLastName());
	}

	@Test
	@DisplayName("Record 3527: Company is Dollar Signs")
	void CompanyOfRecord3527() {
		assertEquals("Dollar Signs", customers.get(3526).getCompany());
	}

	@Test
	@DisplayName("Record 3527: Address is Hill Drive & Hwy 54s S")
	void AddressOfRecord3527() {
		assertEquals("Hill Drive & Hwy 54s S", customers.get(3526).getAddress());
	}

	@Test
	@DisplayName("Record 3527: City is Saint Mynrad")
	void CityOfRecord3527() {
		assertEquals("Saint Mynrad", customers.get(3526).getCity());
	}

	@Test
	@DisplayName("Record 3527: County is Spencer")
	void CountyOfRecord3527() {
		assertEquals("Spencer", customers.get(3526).getCounty());
	}

	@Test
	@DisplayName("Record 3527: State is IN")
	void StateOfRecord3527() {
		assertEquals("IN", customers.get(3526).getState());
	}

	@Test
	@DisplayName("Record 3527: ZIP is 47577")
	void ZIPOfRecord3527() {
		assertEquals("47577", customers.get(3526).getZIP());
	}

	@Test
	@DisplayName("Record 3527: Phone is 812-357-3589")
	void PhoneOfRecord3527() {
		assertEquals("812-357-3589", customers.get(3526).getPhone());
	}

	@Test
	@DisplayName("Record 3527: Fax is 812-357-9962")
	void FaxOfRecord3527() {
		assertEquals("812-357-9962", customers.get(3526).getFax());
	}

	@Test
	@DisplayName("Record 3527: Email is lyman@makler.com")
	void EmailOfRecord3527() {
		assertEquals("lyman@makler.com", customers.get(3526).getEmail());
	}

	@Test
	@DisplayName("Record 3527: Web is http://www.lymanmakler.com")
	void WebOfRecord3527() {
		assertEquals("http://www.lymanmakler.com", customers.get(3526).getWeb());
	}
}
