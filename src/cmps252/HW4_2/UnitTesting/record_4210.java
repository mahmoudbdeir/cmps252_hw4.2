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
class Record_4210 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4210: FirstName is Olen")
	void FirstNameOfRecord4210() {
		assertEquals("Olen", customers.get(4209).getFirstName());
	}

	@Test
	@DisplayName("Record 4210: LastName is Shempert")
	void LastNameOfRecord4210() {
		assertEquals("Shempert", customers.get(4209).getLastName());
	}

	@Test
	@DisplayName("Record 4210: Company is Orton, Edward Esq")
	void CompanyOfRecord4210() {
		assertEquals("Orton, Edward Esq", customers.get(4209).getCompany());
	}

	@Test
	@DisplayName("Record 4210: Address is 40 York Rd")
	void AddressOfRecord4210() {
		assertEquals("40 York Rd", customers.get(4209).getAddress());
	}

	@Test
	@DisplayName("Record 4210: City is Towson")
	void CityOfRecord4210() {
		assertEquals("Towson", customers.get(4209).getCity());
	}

	@Test
	@DisplayName("Record 4210: County is Baltimore")
	void CountyOfRecord4210() {
		assertEquals("Baltimore", customers.get(4209).getCounty());
	}

	@Test
	@DisplayName("Record 4210: State is MD")
	void StateOfRecord4210() {
		assertEquals("MD", customers.get(4209).getState());
	}

	@Test
	@DisplayName("Record 4210: ZIP is 21204")
	void ZIPOfRecord4210() {
		assertEquals("21204", customers.get(4209).getZIP());
	}

	@Test
	@DisplayName("Record 4210: Phone is 410-828-1893")
	void PhoneOfRecord4210() {
		assertEquals("410-828-1893", customers.get(4209).getPhone());
	}

	@Test
	@DisplayName("Record 4210: Fax is 410-828-9355")
	void FaxOfRecord4210() {
		assertEquals("410-828-9355", customers.get(4209).getFax());
	}

	@Test
	@DisplayName("Record 4210: Email is olen@shempert.com")
	void EmailOfRecord4210() {
		assertEquals("olen@shempert.com", customers.get(4209).getEmail());
	}

	@Test
	@DisplayName("Record 4210: Web is http://www.olenshempert.com")
	void WebOfRecord4210() {
		assertEquals("http://www.olenshempert.com", customers.get(4209).getWeb());
	}
}
