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

@Tag("42")
class Record_1056 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1056: FirstName is Henrietta")
	void FirstNameOfRecord1056() {
		assertEquals("Henrietta", customers.get(1055).getFirstName());
	}

	@Test
	@DisplayName("Record 1056: LastName is Cato")
	void LastNameOfRecord1056() {
		assertEquals("Cato", customers.get(1055).getLastName());
	}

	@Test
	@DisplayName("Record 1056: Company is My Chauffeur Limo")
	void CompanyOfRecord1056() {
		assertEquals("My Chauffeur Limo", customers.get(1055).getCompany());
	}

	@Test
	@DisplayName("Record 1056: Address is 3800 San Pablo Ave")
	void AddressOfRecord1056() {
		assertEquals("3800 San Pablo Ave", customers.get(1055).getAddress());
	}

	@Test
	@DisplayName("Record 1056: City is Emeryville")
	void CityOfRecord1056() {
		assertEquals("Emeryville", customers.get(1055).getCity());
	}

	@Test
	@DisplayName("Record 1056: County is Alameda")
	void CountyOfRecord1056() {
		assertEquals("Alameda", customers.get(1055).getCounty());
	}

	@Test
	@DisplayName("Record 1056: State is CA")
	void StateOfRecord1056() {
		assertEquals("CA", customers.get(1055).getState());
	}

	@Test
	@DisplayName("Record 1056: ZIP is 94608")
	void ZIPOfRecord1056() {
		assertEquals("94608", customers.get(1055).getZIP());
	}

	@Test
	@DisplayName("Record 1056: Phone is 510-601-5941")
	void PhoneOfRecord1056() {
		assertEquals("510-601-5941", customers.get(1055).getPhone());
	}

	@Test
	@DisplayName("Record 1056: Fax is 510-601-4638")
	void FaxOfRecord1056() {
		assertEquals("510-601-4638", customers.get(1055).getFax());
	}

	@Test
	@DisplayName("Record 1056: Email is henrietta@cato.com")
	void EmailOfRecord1056() {
		assertEquals("henrietta@cato.com", customers.get(1055).getEmail());
	}

	@Test
	@DisplayName("Record 1056: Web is http://www.henriettacato.com")
	void WebOfRecord1056() {
		assertEquals("http://www.henriettacato.com", customers.get(1055).getWeb());
	}
}
