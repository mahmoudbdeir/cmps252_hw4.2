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

@Tag("49")
class Record_800 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 800: FirstName is Noe")
	void FirstNameOfRecord800() {
		assertEquals("Noe", customers.get(799).getFirstName());
	}

	@Test
	@DisplayName("Record 800: LastName is Shams")
	void LastNameOfRecord800() {
		assertEquals("Shams", customers.get(799).getLastName());
	}

	@Test
	@DisplayName("Record 800: Company is Bornstone, William S Esq")
	void CompanyOfRecord800() {
		assertEquals("Bornstone, William S Esq", customers.get(799).getCompany());
	}

	@Test
	@DisplayName("Record 800: Address is 307 3rd Ave")
	void AddressOfRecord800() {
		assertEquals("307 3rd Ave", customers.get(799).getAddress());
	}

	@Test
	@DisplayName("Record 800: City is New York")
	void CityOfRecord800() {
		assertEquals("New York", customers.get(799).getCity());
	}

	@Test
	@DisplayName("Record 800: County is New York")
	void CountyOfRecord800() {
		assertEquals("New York", customers.get(799).getCounty());
	}

	@Test
	@DisplayName("Record 800: State is NY")
	void StateOfRecord800() {
		assertEquals("NY", customers.get(799).getState());
	}

	@Test
	@DisplayName("Record 800: ZIP is 10010")
	void ZIPOfRecord800() {
		assertEquals("10010", customers.get(799).getZIP());
	}

	@Test
	@DisplayName("Record 800: Phone is 212-475-4689")
	void PhoneOfRecord800() {
		assertEquals("212-475-4689", customers.get(799).getPhone());
	}

	@Test
	@DisplayName("Record 800: Fax is 212-475-1422")
	void FaxOfRecord800() {
		assertEquals("212-475-1422", customers.get(799).getFax());
	}

	@Test
	@DisplayName("Record 800: Email is noe@shams.com")
	void EmailOfRecord800() {
		assertEquals("noe@shams.com", customers.get(799).getEmail());
	}

	@Test
	@DisplayName("Record 800: Web is http://www.noeshams.com")
	void WebOfRecord800() {
		assertEquals("http://www.noeshams.com", customers.get(799).getWeb());
	}
}
