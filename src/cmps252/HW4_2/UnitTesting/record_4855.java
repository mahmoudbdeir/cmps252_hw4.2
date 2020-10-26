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

@Tag("0")
class Record_4855 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4855: FirstName is Ernestine")
	void FirstNameOfRecord4855() {
		assertEquals("Ernestine", customers.get(4854).getFirstName());
	}

	@Test
	@DisplayName("Record 4855: LastName is Keyna")
	void LastNameOfRecord4855() {
		assertEquals("Keyna", customers.get(4854).getLastName());
	}

	@Test
	@DisplayName("Record 4855: Company is Jamar")
	void CompanyOfRecord4855() {
		assertEquals("Jamar", customers.get(4854).getCompany());
	}

	@Test
	@DisplayName("Record 4855: Address is 2801 Candler Rd")
	void AddressOfRecord4855() {
		assertEquals("2801 Candler Rd", customers.get(4854).getAddress());
	}

	@Test
	@DisplayName("Record 4855: City is Decatur")
	void CityOfRecord4855() {
		assertEquals("Decatur", customers.get(4854).getCity());
	}

	@Test
	@DisplayName("Record 4855: County is Dekalb")
	void CountyOfRecord4855() {
		assertEquals("Dekalb", customers.get(4854).getCounty());
	}

	@Test
	@DisplayName("Record 4855: State is GA")
	void StateOfRecord4855() {
		assertEquals("GA", customers.get(4854).getState());
	}

	@Test
	@DisplayName("Record 4855: ZIP is 30034")
	void ZIPOfRecord4855() {
		assertEquals("30034", customers.get(4854).getZIP());
	}

	@Test
	@DisplayName("Record 4855: Phone is 404-244-4378")
	void PhoneOfRecord4855() {
		assertEquals("404-244-4378", customers.get(4854).getPhone());
	}

	@Test
	@DisplayName("Record 4855: Fax is 404-244-9006")
	void FaxOfRecord4855() {
		assertEquals("404-244-9006", customers.get(4854).getFax());
	}

	@Test
	@DisplayName("Record 4855: Email is ernestine@keyna.com")
	void EmailOfRecord4855() {
		assertEquals("ernestine@keyna.com", customers.get(4854).getEmail());
	}

	@Test
	@DisplayName("Record 4855: Web is http://www.ernestinekeyna.com")
	void WebOfRecord4855() {
		assertEquals("http://www.ernestinekeyna.com", customers.get(4854).getWeb());
	}
}
