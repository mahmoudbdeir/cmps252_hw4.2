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

@Tag("10")
class Record_3713 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3713: FirstName is Jessie")
	void FirstNameOfRecord3713() {
		assertEquals("Jessie", customers.get(3712).getFirstName());
	}

	@Test
	@DisplayName("Record 3713: LastName is Hektner")
	void LastNameOfRecord3713() {
		assertEquals("Hektner", customers.get(3712).getLastName());
	}

	@Test
	@DisplayName("Record 3713: Company is Howard Johnson")
	void CompanyOfRecord3713() {
		assertEquals("Howard Johnson", customers.get(3712).getCompany());
	}

	@Test
	@DisplayName("Record 3713: Address is 991096 Iwaena St")
	void AddressOfRecord3713() {
		assertEquals("991096 Iwaena St", customers.get(3712).getAddress());
	}

	@Test
	@DisplayName("Record 3713: City is Aiea")
	void CityOfRecord3713() {
		assertEquals("Aiea", customers.get(3712).getCity());
	}

	@Test
	@DisplayName("Record 3713: County is Honolulu")
	void CountyOfRecord3713() {
		assertEquals("Honolulu", customers.get(3712).getCounty());
	}

	@Test
	@DisplayName("Record 3713: State is HI")
	void StateOfRecord3713() {
		assertEquals("HI", customers.get(3712).getState());
	}

	@Test
	@DisplayName("Record 3713: ZIP is 96701")
	void ZIPOfRecord3713() {
		assertEquals("96701", customers.get(3712).getZIP());
	}

	@Test
	@DisplayName("Record 3713: Phone is 808-487-2420")
	void PhoneOfRecord3713() {
		assertEquals("808-487-2420", customers.get(3712).getPhone());
	}

	@Test
	@DisplayName("Record 3713: Fax is 808-487-9598")
	void FaxOfRecord3713() {
		assertEquals("808-487-9598", customers.get(3712).getFax());
	}

	@Test
	@DisplayName("Record 3713: Email is jessie@hektner.com")
	void EmailOfRecord3713() {
		assertEquals("jessie@hektner.com", customers.get(3712).getEmail());
	}

	@Test
	@DisplayName("Record 3713: Web is http://www.jessiehektner.com")
	void WebOfRecord3713() {
		assertEquals("http://www.jessiehektner.com", customers.get(3712).getWeb());
	}
}
