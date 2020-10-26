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
class Record_4648 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4648: FirstName is Diego")
	void FirstNameOfRecord4648() {
		assertEquals("Diego", customers.get(4647).getFirstName());
	}

	@Test
	@DisplayName("Record 4648: LastName is Tokita")
	void LastNameOfRecord4648() {
		assertEquals("Tokita", customers.get(4647).getLastName());
	}

	@Test
	@DisplayName("Record 4648: Company is Mcclendon, Glen P Esq")
	void CompanyOfRecord4648() {
		assertEquals("Mcclendon, Glen P Esq", customers.get(4647).getCompany());
	}

	@Test
	@DisplayName("Record 4648: Address is 337 Heymann Blvd")
	void AddressOfRecord4648() {
		assertEquals("337 Heymann Blvd", customers.get(4647).getAddress());
	}

	@Test
	@DisplayName("Record 4648: City is Lafayette")
	void CityOfRecord4648() {
		assertEquals("Lafayette", customers.get(4647).getCity());
	}

	@Test
	@DisplayName("Record 4648: County is Lafayette")
	void CountyOfRecord4648() {
		assertEquals("Lafayette", customers.get(4647).getCounty());
	}

	@Test
	@DisplayName("Record 4648: State is LA")
	void StateOfRecord4648() {
		assertEquals("LA", customers.get(4647).getState());
	}

	@Test
	@DisplayName("Record 4648: ZIP is 70503")
	void ZIPOfRecord4648() {
		assertEquals("70503", customers.get(4647).getZIP());
	}

	@Test
	@DisplayName("Record 4648: Phone is 337-235-5092")
	void PhoneOfRecord4648() {
		assertEquals("337-235-5092", customers.get(4647).getPhone());
	}

	@Test
	@DisplayName("Record 4648: Fax is 337-235-7948")
	void FaxOfRecord4648() {
		assertEquals("337-235-7948", customers.get(4647).getFax());
	}

	@Test
	@DisplayName("Record 4648: Email is diego@tokita.com")
	void EmailOfRecord4648() {
		assertEquals("diego@tokita.com", customers.get(4647).getEmail());
	}

	@Test
	@DisplayName("Record 4648: Web is http://www.diegotokita.com")
	void WebOfRecord4648() {
		assertEquals("http://www.diegotokita.com", customers.get(4647).getWeb());
	}
}
