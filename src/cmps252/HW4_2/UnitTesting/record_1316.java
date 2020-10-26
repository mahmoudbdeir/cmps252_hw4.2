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

@Tag("28")
class Record_1316 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1316: FirstName is Fidel")
	void FirstNameOfRecord1316() {
		assertEquals("Fidel", customers.get(1315).getFirstName());
	}

	@Test
	@DisplayName("Record 1316: LastName is Gerlock")
	void LastNameOfRecord1316() {
		assertEquals("Gerlock", customers.get(1315).getLastName());
	}

	@Test
	@DisplayName("Record 1316: Company is Rosenow, Jack G Esq")
	void CompanyOfRecord1316() {
		assertEquals("Rosenow, Jack G Esq", customers.get(1315).getCompany());
	}

	@Test
	@DisplayName("Record 1316: Address is 1818 Old Steese Hwy N")
	void AddressOfRecord1316() {
		assertEquals("1818 Old Steese Hwy N", customers.get(1315).getAddress());
	}

	@Test
	@DisplayName("Record 1316: City is Fairbanks")
	void CityOfRecord1316() {
		assertEquals("Fairbanks", customers.get(1315).getCity());
	}

	@Test
	@DisplayName("Record 1316: County is Fairbanks North Star")
	void CountyOfRecord1316() {
		assertEquals("Fairbanks North Star", customers.get(1315).getCounty());
	}

	@Test
	@DisplayName("Record 1316: State is AK")
	void StateOfRecord1316() {
		assertEquals("AK", customers.get(1315).getState());
	}

	@Test
	@DisplayName("Record 1316: ZIP is 99712")
	void ZIPOfRecord1316() {
		assertEquals("99712", customers.get(1315).getZIP());
	}

	@Test
	@DisplayName("Record 1316: Phone is 907-457-1843")
	void PhoneOfRecord1316() {
		assertEquals("907-457-1843", customers.get(1315).getPhone());
	}

	@Test
	@DisplayName("Record 1316: Fax is 907-457-0998")
	void FaxOfRecord1316() {
		assertEquals("907-457-0998", customers.get(1315).getFax());
	}

	@Test
	@DisplayName("Record 1316: Email is fidel@gerlock.com")
	void EmailOfRecord1316() {
		assertEquals("fidel@gerlock.com", customers.get(1315).getEmail());
	}

	@Test
	@DisplayName("Record 1316: Web is http://www.fidelgerlock.com")
	void WebOfRecord1316() {
		assertEquals("http://www.fidelgerlock.com", customers.get(1315).getWeb());
	}
}
