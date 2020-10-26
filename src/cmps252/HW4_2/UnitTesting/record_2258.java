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
class Record_2258 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2258: FirstName is Lincoln")
	void FirstNameOfRecord2258() {
		assertEquals("Lincoln", customers.get(2257).getFirstName());
	}

	@Test
	@DisplayName("Record 2258: LastName is Derubys")
	void LastNameOfRecord2258() {
		assertEquals("Derubys", customers.get(2257).getLastName());
	}

	@Test
	@DisplayName("Record 2258: Company is Pro Mic Corporation")
	void CompanyOfRecord2258() {
		assertEquals("Pro Mic Corporation", customers.get(2257).getCompany());
	}

	@Test
	@DisplayName("Record 2258: Address is 1507 9th St")
	void AddressOfRecord2258() {
		assertEquals("1507 9th St", customers.get(2257).getAddress());
	}

	@Test
	@DisplayName("Record 2258: City is Modesto")
	void CityOfRecord2258() {
		assertEquals("Modesto", customers.get(2257).getCity());
	}

	@Test
	@DisplayName("Record 2258: County is Stanislaus")
	void CountyOfRecord2258() {
		assertEquals("Stanislaus", customers.get(2257).getCounty());
	}

	@Test
	@DisplayName("Record 2258: State is CA")
	void StateOfRecord2258() {
		assertEquals("CA", customers.get(2257).getState());
	}

	@Test
	@DisplayName("Record 2258: ZIP is 95354")
	void ZIPOfRecord2258() {
		assertEquals("95354", customers.get(2257).getZIP());
	}

	@Test
	@DisplayName("Record 2258: Phone is 209-577-1546")
	void PhoneOfRecord2258() {
		assertEquals("209-577-1546", customers.get(2257).getPhone());
	}

	@Test
	@DisplayName("Record 2258: Fax is 209-577-3995")
	void FaxOfRecord2258() {
		assertEquals("209-577-3995", customers.get(2257).getFax());
	}

	@Test
	@DisplayName("Record 2258: Email is lincoln@derubys.com")
	void EmailOfRecord2258() {
		assertEquals("lincoln@derubys.com", customers.get(2257).getEmail());
	}

	@Test
	@DisplayName("Record 2258: Web is http://www.lincolnderubys.com")
	void WebOfRecord2258() {
		assertEquals("http://www.lincolnderubys.com", customers.get(2257).getWeb());
	}
}
