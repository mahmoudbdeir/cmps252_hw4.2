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
class Record_1289 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1289: FirstName is Sierra")
	void FirstNameOfRecord1289() {
		assertEquals("Sierra", customers.get(1288).getFirstName());
	}

	@Test
	@DisplayName("Record 1289: LastName is Maderios")
	void LastNameOfRecord1289() {
		assertEquals("Maderios", customers.get(1288).getLastName());
	}

	@Test
	@DisplayName("Record 1289: Company is Buchanan, Susan Fox Esq")
	void CompanyOfRecord1289() {
		assertEquals("Buchanan, Susan Fox Esq", customers.get(1288).getCompany());
	}

	@Test
	@DisplayName("Record 1289: Address is 1443 E Gun Hill Rd")
	void AddressOfRecord1289() {
		assertEquals("1443 E Gun Hill Rd", customers.get(1288).getAddress());
	}

	@Test
	@DisplayName("Record 1289: City is Bronx")
	void CityOfRecord1289() {
		assertEquals("Bronx", customers.get(1288).getCity());
	}

	@Test
	@DisplayName("Record 1289: County is Bronx")
	void CountyOfRecord1289() {
		assertEquals("Bronx", customers.get(1288).getCounty());
	}

	@Test
	@DisplayName("Record 1289: State is NY")
	void StateOfRecord1289() {
		assertEquals("NY", customers.get(1288).getState());
	}

	@Test
	@DisplayName("Record 1289: ZIP is 10469")
	void ZIPOfRecord1289() {
		assertEquals("10469", customers.get(1288).getZIP());
	}

	@Test
	@DisplayName("Record 1289: Phone is 718-320-8447")
	void PhoneOfRecord1289() {
		assertEquals("718-320-8447", customers.get(1288).getPhone());
	}

	@Test
	@DisplayName("Record 1289: Fax is 718-320-4758")
	void FaxOfRecord1289() {
		assertEquals("718-320-4758", customers.get(1288).getFax());
	}

	@Test
	@DisplayName("Record 1289: Email is sierra@maderios.com")
	void EmailOfRecord1289() {
		assertEquals("sierra@maderios.com", customers.get(1288).getEmail());
	}

	@Test
	@DisplayName("Record 1289: Web is http://www.sierramaderios.com")
	void WebOfRecord1289() {
		assertEquals("http://www.sierramaderios.com", customers.get(1288).getWeb());
	}
}
