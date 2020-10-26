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

@Tag("19")
class Record_861 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 861: FirstName is Cortney")
	void FirstNameOfRecord861() {
		assertEquals("Cortney", customers.get(860).getFirstName());
	}

	@Test
	@DisplayName("Record 861: LastName is Argueta")
	void LastNameOfRecord861() {
		assertEquals("Argueta", customers.get(860).getLastName());
	}

	@Test
	@DisplayName("Record 861: Company is Dye, Jeffrey L Esq")
	void CompanyOfRecord861() {
		assertEquals("Dye, Jeffrey L Esq", customers.get(860).getCompany());
	}

	@Test
	@DisplayName("Record 861: Address is 750 E Slauson Ave")
	void AddressOfRecord861() {
		assertEquals("750 E Slauson Ave", customers.get(860).getAddress());
	}

	@Test
	@DisplayName("Record 861: City is Los Angeles")
	void CityOfRecord861() {
		assertEquals("Los Angeles", customers.get(860).getCity());
	}

	@Test
	@DisplayName("Record 861: County is Los Angeles")
	void CountyOfRecord861() {
		assertEquals("Los Angeles", customers.get(860).getCounty());
	}

	@Test
	@DisplayName("Record 861: State is CA")
	void StateOfRecord861() {
		assertEquals("CA", customers.get(860).getState());
	}

	@Test
	@DisplayName("Record 861: ZIP is 90011")
	void ZIPOfRecord861() {
		assertEquals("90011", customers.get(860).getZIP());
	}

	@Test
	@DisplayName("Record 861: Phone is 213-235-3589")
	void PhoneOfRecord861() {
		assertEquals("213-235-3589", customers.get(860).getPhone());
	}

	@Test
	@DisplayName("Record 861: Fax is 213-235-5357")
	void FaxOfRecord861() {
		assertEquals("213-235-5357", customers.get(860).getFax());
	}

	@Test
	@DisplayName("Record 861: Email is cortney@argueta.com")
	void EmailOfRecord861() {
		assertEquals("cortney@argueta.com", customers.get(860).getEmail());
	}

	@Test
	@DisplayName("Record 861: Web is http://www.cortneyargueta.com")
	void WebOfRecord861() {
		assertEquals("http://www.cortneyargueta.com", customers.get(860).getWeb());
	}
}
