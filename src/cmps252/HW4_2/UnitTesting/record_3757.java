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

@Tag("19")
class Record_3757 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3757: FirstName is Patty")
	void FirstNameOfRecord3757() {
		assertEquals("Patty", customers.get(3756).getFirstName());
	}

	@Test
	@DisplayName("Record 3757: LastName is Plott")
	void LastNameOfRecord3757() {
		assertEquals("Plott", customers.get(3756).getLastName());
	}

	@Test
	@DisplayName("Record 3757: Company is Wood Artisans Inc")
	void CompanyOfRecord3757() {
		assertEquals("Wood Artisans Inc", customers.get(3756).getCompany());
	}

	@Test
	@DisplayName("Record 3757: Address is 991151 Iwaena St")
	void AddressOfRecord3757() {
		assertEquals("991151 Iwaena St", customers.get(3756).getAddress());
	}

	@Test
	@DisplayName("Record 3757: City is Aiea")
	void CityOfRecord3757() {
		assertEquals("Aiea", customers.get(3756).getCity());
	}

	@Test
	@DisplayName("Record 3757: County is Honolulu")
	void CountyOfRecord3757() {
		assertEquals("Honolulu", customers.get(3756).getCounty());
	}

	@Test
	@DisplayName("Record 3757: State is HI")
	void StateOfRecord3757() {
		assertEquals("HI", customers.get(3756).getState());
	}

	@Test
	@DisplayName("Record 3757: ZIP is 96701")
	void ZIPOfRecord3757() {
		assertEquals("96701", customers.get(3756).getZIP());
	}

	@Test
	@DisplayName("Record 3757: Phone is 808-487-1491")
	void PhoneOfRecord3757() {
		assertEquals("808-487-1491", customers.get(3756).getPhone());
	}

	@Test
	@DisplayName("Record 3757: Fax is 808-487-0697")
	void FaxOfRecord3757() {
		assertEquals("808-487-0697", customers.get(3756).getFax());
	}

	@Test
	@DisplayName("Record 3757: Email is patty@plott.com")
	void EmailOfRecord3757() {
		assertEquals("patty@plott.com", customers.get(3756).getEmail());
	}

	@Test
	@DisplayName("Record 3757: Web is http://www.pattyplott.com")
	void WebOfRecord3757() {
		assertEquals("http://www.pattyplott.com", customers.get(3756).getWeb());
	}
}
