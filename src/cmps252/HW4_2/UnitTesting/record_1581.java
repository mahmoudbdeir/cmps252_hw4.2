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

@Tag("3")
class Record_1581 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1581: FirstName is Beatrice")
	void FirstNameOfRecord1581() {
		assertEquals("Beatrice", customers.get(1580).getFirstName());
	}

	@Test
	@DisplayName("Record 1581: LastName is Graczyk")
	void LastNameOfRecord1581() {
		assertEquals("Graczyk", customers.get(1580).getLastName());
	}

	@Test
	@DisplayName("Record 1581: Company is Evans, Kirk W Esq")
	void CompanyOfRecord1581() {
		assertEquals("Evans, Kirk W Esq", customers.get(1580).getCompany());
	}

	@Test
	@DisplayName("Record 1581: Address is 155 Michael Dr")
	void AddressOfRecord1581() {
		assertEquals("155 Michael Dr", customers.get(1580).getAddress());
	}

	@Test
	@DisplayName("Record 1581: City is Syosset")
	void CityOfRecord1581() {
		assertEquals("Syosset", customers.get(1580).getCity());
	}

	@Test
	@DisplayName("Record 1581: County is Nassau")
	void CountyOfRecord1581() {
		assertEquals("Nassau", customers.get(1580).getCounty());
	}

	@Test
	@DisplayName("Record 1581: State is NY")
	void StateOfRecord1581() {
		assertEquals("NY", customers.get(1580).getState());
	}

	@Test
	@DisplayName("Record 1581: ZIP is 11791")
	void ZIPOfRecord1581() {
		assertEquals("11791", customers.get(1580).getZIP());
	}

	@Test
	@DisplayName("Record 1581: Phone is 516-496-5583")
	void PhoneOfRecord1581() {
		assertEquals("516-496-5583", customers.get(1580).getPhone());
	}

	@Test
	@DisplayName("Record 1581: Fax is 516-496-7994")
	void FaxOfRecord1581() {
		assertEquals("516-496-7994", customers.get(1580).getFax());
	}

	@Test
	@DisplayName("Record 1581: Email is beatrice@graczyk.com")
	void EmailOfRecord1581() {
		assertEquals("beatrice@graczyk.com", customers.get(1580).getEmail());
	}

	@Test
	@DisplayName("Record 1581: Web is http://www.beatricegraczyk.com")
	void WebOfRecord1581() {
		assertEquals("http://www.beatricegraczyk.com", customers.get(1580).getWeb());
	}
}
