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

@Tag("25")
class Record_1069 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1069: FirstName is Dionne")
	void FirstNameOfRecord1069() {
		assertEquals("Dionne", customers.get(1068).getFirstName());
	}

	@Test
	@DisplayName("Record 1069: LastName is Leaper")
	void LastNameOfRecord1069() {
		assertEquals("Leaper", customers.get(1068).getLastName());
	}

	@Test
	@DisplayName("Record 1069: Company is Bagel Place")
	void CompanyOfRecord1069() {
		assertEquals("Bagel Place", customers.get(1068).getCompany());
	}

	@Test
	@DisplayName("Record 1069: Address is 3721 Corporate Dr")
	void AddressOfRecord1069() {
		assertEquals("3721 Corporate Dr", customers.get(1068).getAddress());
	}

	@Test
	@DisplayName("Record 1069: City is Columbus")
	void CityOfRecord1069() {
		assertEquals("Columbus", customers.get(1068).getCity());
	}

	@Test
	@DisplayName("Record 1069: County is Franklin")
	void CountyOfRecord1069() {
		assertEquals("Franklin", customers.get(1068).getCounty());
	}

	@Test
	@DisplayName("Record 1069: State is OH")
	void StateOfRecord1069() {
		assertEquals("OH", customers.get(1068).getState());
	}

	@Test
	@DisplayName("Record 1069: ZIP is 43231")
	void ZIPOfRecord1069() {
		assertEquals("43231", customers.get(1068).getZIP());
	}

	@Test
	@DisplayName("Record 1069: Phone is 614-891-2441")
	void PhoneOfRecord1069() {
		assertEquals("614-891-2441", customers.get(1068).getPhone());
	}

	@Test
	@DisplayName("Record 1069: Fax is 614-891-4812")
	void FaxOfRecord1069() {
		assertEquals("614-891-4812", customers.get(1068).getFax());
	}

	@Test
	@DisplayName("Record 1069: Email is dionne@leaper.com")
	void EmailOfRecord1069() {
		assertEquals("dionne@leaper.com", customers.get(1068).getEmail());
	}

	@Test
	@DisplayName("Record 1069: Web is http://www.dionneleaper.com")
	void WebOfRecord1069() {
		assertEquals("http://www.dionneleaper.com", customers.get(1068).getWeb());
	}
}
