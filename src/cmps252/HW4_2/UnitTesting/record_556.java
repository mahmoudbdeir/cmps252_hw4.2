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

@Tag("48")
class Record_556 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 556: FirstName is Lonnie")
	void FirstNameOfRecord556() {
		assertEquals("Lonnie", customers.get(555).getFirstName());
	}

	@Test
	@DisplayName("Record 556: LastName is Wojtczak")
	void LastNameOfRecord556() {
		assertEquals("Wojtczak", customers.get(555).getLastName());
	}

	@Test
	@DisplayName("Record 556: Company is Osnowits, Samuel Esq")
	void CompanyOfRecord556() {
		assertEquals("Osnowits, Samuel Esq", customers.get(555).getCompany());
	}

	@Test
	@DisplayName("Record 556: Address is 720 E Jackson St")
	void AddressOfRecord556() {
		assertEquals("720 E Jackson St", customers.get(555).getAddress());
	}

	@Test
	@DisplayName("Record 556: City is Medford")
	void CityOfRecord556() {
		assertEquals("Medford", customers.get(555).getCity());
	}

	@Test
	@DisplayName("Record 556: County is Jackson")
	void CountyOfRecord556() {
		assertEquals("Jackson", customers.get(555).getCounty());
	}

	@Test
	@DisplayName("Record 556: State is OR")
	void StateOfRecord556() {
		assertEquals("OR", customers.get(555).getState());
	}

	@Test
	@DisplayName("Record 556: ZIP is 97504")
	void ZIPOfRecord556() {
		assertEquals("97504", customers.get(555).getZIP());
	}

	@Test
	@DisplayName("Record 556: Phone is 541-773-8771")
	void PhoneOfRecord556() {
		assertEquals("541-773-8771", customers.get(555).getPhone());
	}

	@Test
	@DisplayName("Record 556: Fax is 541-773-5272")
	void FaxOfRecord556() {
		assertEquals("541-773-5272", customers.get(555).getFax());
	}

	@Test
	@DisplayName("Record 556: Email is lonnie@wojtczak.com")
	void EmailOfRecord556() {
		assertEquals("lonnie@wojtczak.com", customers.get(555).getEmail());
	}

	@Test
	@DisplayName("Record 556: Web is http://www.lonniewojtczak.com")
	void WebOfRecord556() {
		assertEquals("http://www.lonniewojtczak.com", customers.get(555).getWeb());
	}
}
