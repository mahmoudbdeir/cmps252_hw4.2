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

@Tag("38")
class Record_1192 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1192: FirstName is Alonso")
	void FirstNameOfRecord1192() {
		assertEquals("Alonso", customers.get(1191).getFirstName());
	}

	@Test
	@DisplayName("Record 1192: LastName is Loughborough")
	void LastNameOfRecord1192() {
		assertEquals("Loughborough", customers.get(1191).getLastName());
	}

	@Test
	@DisplayName("Record 1192: Company is Synergy Associates Inc")
	void CompanyOfRecord1192() {
		assertEquals("Synergy Associates Inc", customers.get(1191).getCompany());
	}

	@Test
	@DisplayName("Record 1192: Address is 7340 Milnor St")
	void AddressOfRecord1192() {
		assertEquals("7340 Milnor St", customers.get(1191).getAddress());
	}

	@Test
	@DisplayName("Record 1192: City is Philadelphia")
	void CityOfRecord1192() {
		assertEquals("Philadelphia", customers.get(1191).getCity());
	}

	@Test
	@DisplayName("Record 1192: County is Philadelphia")
	void CountyOfRecord1192() {
		assertEquals("Philadelphia", customers.get(1191).getCounty());
	}

	@Test
	@DisplayName("Record 1192: State is PA")
	void StateOfRecord1192() {
		assertEquals("PA", customers.get(1191).getState());
	}

	@Test
	@DisplayName("Record 1192: ZIP is 19136")
	void ZIPOfRecord1192() {
		assertEquals("19136", customers.get(1191).getZIP());
	}

	@Test
	@DisplayName("Record 1192: Phone is 215-624-2426")
	void PhoneOfRecord1192() {
		assertEquals("215-624-2426", customers.get(1191).getPhone());
	}

	@Test
	@DisplayName("Record 1192: Fax is 215-624-7963")
	void FaxOfRecord1192() {
		assertEquals("215-624-7963", customers.get(1191).getFax());
	}

	@Test
	@DisplayName("Record 1192: Email is alonso@loughborough.com")
	void EmailOfRecord1192() {
		assertEquals("alonso@loughborough.com", customers.get(1191).getEmail());
	}

	@Test
	@DisplayName("Record 1192: Web is http://www.alonsoloughborough.com")
	void WebOfRecord1192() {
		assertEquals("http://www.alonsoloughborough.com", customers.get(1191).getWeb());
	}
}
