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

@Tag("1")
class Record_3318 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3318: FirstName is Gayle")
	void FirstNameOfRecord3318() {
		assertEquals("Gayle", customers.get(3317).getFirstName());
	}

	@Test
	@DisplayName("Record 3318: LastName is Hatherly")
	void LastNameOfRecord3318() {
		assertEquals("Hatherly", customers.get(3317).getLastName());
	}

	@Test
	@DisplayName("Record 3318: Company is Mclellan, Lawrence P Esq")
	void CompanyOfRecord3318() {
		assertEquals("Mclellan, Lawrence P Esq", customers.get(3317).getCompany());
	}

	@Test
	@DisplayName("Record 3318: Address is 8th Ave")
	void AddressOfRecord3318() {
		assertEquals("8th Ave", customers.get(3317).getAddress());
	}

	@Test
	@DisplayName("Record 3318: City is Philadelphia")
	void CityOfRecord3318() {
		assertEquals("Philadelphia", customers.get(3317).getCity());
	}

	@Test
	@DisplayName("Record 3318: County is Philadelphia")
	void CountyOfRecord3318() {
		assertEquals("Philadelphia", customers.get(3317).getCounty());
	}

	@Test
	@DisplayName("Record 3318: State is PA")
	void StateOfRecord3318() {
		assertEquals("PA", customers.get(3317).getState());
	}

	@Test
	@DisplayName("Record 3318: ZIP is 19123")
	void ZIPOfRecord3318() {
		assertEquals("19123", customers.get(3317).getZIP());
	}

	@Test
	@DisplayName("Record 3318: Phone is 215-627-7010")
	void PhoneOfRecord3318() {
		assertEquals("215-627-7010", customers.get(3317).getPhone());
	}

	@Test
	@DisplayName("Record 3318: Fax is 215-627-8701")
	void FaxOfRecord3318() {
		assertEquals("215-627-8701", customers.get(3317).getFax());
	}

	@Test
	@DisplayName("Record 3318: Email is gayle@hatherly.com")
	void EmailOfRecord3318() {
		assertEquals("gayle@hatherly.com", customers.get(3317).getEmail());
	}

	@Test
	@DisplayName("Record 3318: Web is http://www.gaylehatherly.com")
	void WebOfRecord3318() {
		assertEquals("http://www.gaylehatherly.com", customers.get(3317).getWeb());
	}
}
