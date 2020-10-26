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

@Tag("24")
class Record_2274 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2274: FirstName is Lauretta")
	void FirstNameOfRecord2274() {
		assertEquals("Lauretta", customers.get(2273).getFirstName());
	}

	@Test
	@DisplayName("Record 2274: LastName is Cichonski")
	void LastNameOfRecord2274() {
		assertEquals("Cichonski", customers.get(2273).getLastName());
	}

	@Test
	@DisplayName("Record 2274: Company is Masana, Michael P Esq")
	void CompanyOfRecord2274() {
		assertEquals("Masana, Michael P Esq", customers.get(2273).getCompany());
	}

	@Test
	@DisplayName("Record 2274: Address is 29 Sugar Hollow Rd")
	void AddressOfRecord2274() {
		assertEquals("29 Sugar Hollow Rd", customers.get(2273).getAddress());
	}

	@Test
	@DisplayName("Record 2274: City is Danbury")
	void CityOfRecord2274() {
		assertEquals("Danbury", customers.get(2273).getCity());
	}

	@Test
	@DisplayName("Record 2274: County is Fairfield")
	void CountyOfRecord2274() {
		assertEquals("Fairfield", customers.get(2273).getCounty());
	}

	@Test
	@DisplayName("Record 2274: State is CT")
	void StateOfRecord2274() {
		assertEquals("CT", customers.get(2273).getState());
	}

	@Test
	@DisplayName("Record 2274: ZIP is 06810")
	void ZIPOfRecord2274() {
		assertEquals("06810", customers.get(2273).getZIP());
	}

	@Test
	@DisplayName("Record 2274: Phone is 203-797-0237")
	void PhoneOfRecord2274() {
		assertEquals("203-797-0237", customers.get(2273).getPhone());
	}

	@Test
	@DisplayName("Record 2274: Fax is 203-797-8777")
	void FaxOfRecord2274() {
		assertEquals("203-797-8777", customers.get(2273).getFax());
	}

	@Test
	@DisplayName("Record 2274: Email is lauretta@cichonski.com")
	void EmailOfRecord2274() {
		assertEquals("lauretta@cichonski.com", customers.get(2273).getEmail());
	}

	@Test
	@DisplayName("Record 2274: Web is http://www.laurettacichonski.com")
	void WebOfRecord2274() {
		assertEquals("http://www.laurettacichonski.com", customers.get(2273).getWeb());
	}
}
