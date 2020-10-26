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

@Tag("35")
class Record_2243 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2243: FirstName is Tommie")
	void FirstNameOfRecord2243() {
		assertEquals("Tommie", customers.get(2242).getFirstName());
	}

	@Test
	@DisplayName("Record 2243: LastName is Siglar")
	void LastNameOfRecord2243() {
		assertEquals("Siglar", customers.get(2242).getLastName());
	}

	@Test
	@DisplayName("Record 2243: Company is Industrial Realty Co Inc")
	void CompanyOfRecord2243() {
		assertEquals("Industrial Realty Co Inc", customers.get(2242).getCompany());
	}

	@Test
	@DisplayName("Record 2243: Address is 72 W Main St")
	void AddressOfRecord2243() {
		assertEquals("72 W Main St", customers.get(2242).getAddress());
	}

	@Test
	@DisplayName("Record 2243: City is Rockaway")
	void CityOfRecord2243() {
		assertEquals("Rockaway", customers.get(2242).getCity());
	}

	@Test
	@DisplayName("Record 2243: County is Morris")
	void CountyOfRecord2243() {
		assertEquals("Morris", customers.get(2242).getCounty());
	}

	@Test
	@DisplayName("Record 2243: State is NJ")
	void StateOfRecord2243() {
		assertEquals("NJ", customers.get(2242).getState());
	}

	@Test
	@DisplayName("Record 2243: ZIP is 7866")
	void ZIPOfRecord2243() {
		assertEquals("7866", customers.get(2242).getZIP());
	}

	@Test
	@DisplayName("Record 2243: Phone is 973-627-2744")
	void PhoneOfRecord2243() {
		assertEquals("973-627-2744", customers.get(2242).getPhone());
	}

	@Test
	@DisplayName("Record 2243: Fax is 973-627-8295")
	void FaxOfRecord2243() {
		assertEquals("973-627-8295", customers.get(2242).getFax());
	}

	@Test
	@DisplayName("Record 2243: Email is tommie@siglar.com")
	void EmailOfRecord2243() {
		assertEquals("tommie@siglar.com", customers.get(2242).getEmail());
	}

	@Test
	@DisplayName("Record 2243: Web is http://www.tommiesiglar.com")
	void WebOfRecord2243() {
		assertEquals("http://www.tommiesiglar.com", customers.get(2242).getWeb());
	}
}
