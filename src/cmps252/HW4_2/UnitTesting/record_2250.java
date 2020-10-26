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

@Tag("43")
class Record_2250 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2250: FirstName is Aurelio")
	void FirstNameOfRecord2250() {
		assertEquals("Aurelio", customers.get(2249).getFirstName());
	}

	@Test
	@DisplayName("Record 2250: LastName is Weathersbee")
	void LastNameOfRecord2250() {
		assertEquals("Weathersbee", customers.get(2249).getLastName());
	}

	@Test
	@DisplayName("Record 2250: Company is Marek & Morris")
	void CompanyOfRecord2250() {
		assertEquals("Marek & Morris", customers.get(2249).getCompany());
	}

	@Test
	@DisplayName("Record 2250: Address is 1680 Pomona Ave")
	void AddressOfRecord2250() {
		assertEquals("1680 Pomona Ave", customers.get(2249).getAddress());
	}

	@Test
	@DisplayName("Record 2250: City is San Jose")
	void CityOfRecord2250() {
		assertEquals("San Jose", customers.get(2249).getCity());
	}

	@Test
	@DisplayName("Record 2250: County is Santa Clara")
	void CountyOfRecord2250() {
		assertEquals("Santa Clara", customers.get(2249).getCounty());
	}

	@Test
	@DisplayName("Record 2250: State is CA")
	void StateOfRecord2250() {
		assertEquals("CA", customers.get(2249).getState());
	}

	@Test
	@DisplayName("Record 2250: ZIP is 95110")
	void ZIPOfRecord2250() {
		assertEquals("95110", customers.get(2249).getZIP());
	}

	@Test
	@DisplayName("Record 2250: Phone is 408-995-8149")
	void PhoneOfRecord2250() {
		assertEquals("408-995-8149", customers.get(2249).getPhone());
	}

	@Test
	@DisplayName("Record 2250: Fax is 408-995-1932")
	void FaxOfRecord2250() {
		assertEquals("408-995-1932", customers.get(2249).getFax());
	}

	@Test
	@DisplayName("Record 2250: Email is aurelio@weathersbee.com")
	void EmailOfRecord2250() {
		assertEquals("aurelio@weathersbee.com", customers.get(2249).getEmail());
	}

	@Test
	@DisplayName("Record 2250: Web is http://www.aurelioweathersbee.com")
	void WebOfRecord2250() {
		assertEquals("http://www.aurelioweathersbee.com", customers.get(2249).getWeb());
	}
}
