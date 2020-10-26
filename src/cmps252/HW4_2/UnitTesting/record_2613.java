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

@Tag("12")
class Record_2613 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2613: FirstName is Nathaniel")
	void FirstNameOfRecord2613() {
		assertEquals("Nathaniel", customers.get(2612).getFirstName());
	}

	@Test
	@DisplayName("Record 2613: LastName is Boquet")
	void LastNameOfRecord2613() {
		assertEquals("Boquet", customers.get(2612).getLastName());
	}

	@Test
	@DisplayName("Record 2613: Company is Okamoto, Kenneth T Esq")
	void CompanyOfRecord2613() {
		assertEquals("Okamoto, Kenneth T Esq", customers.get(2612).getCompany());
	}

	@Test
	@DisplayName("Record 2613: Address is 1915 Junction Hwy")
	void AddressOfRecord2613() {
		assertEquals("1915 Junction Hwy", customers.get(2612).getAddress());
	}

	@Test
	@DisplayName("Record 2613: City is Kerrville")
	void CityOfRecord2613() {
		assertEquals("Kerrville", customers.get(2612).getCity());
	}

	@Test
	@DisplayName("Record 2613: County is Kerr")
	void CountyOfRecord2613() {
		assertEquals("Kerr", customers.get(2612).getCounty());
	}

	@Test
	@DisplayName("Record 2613: State is TX")
	void StateOfRecord2613() {
		assertEquals("TX", customers.get(2612).getState());
	}

	@Test
	@DisplayName("Record 2613: ZIP is 78028")
	void ZIPOfRecord2613() {
		assertEquals("78028", customers.get(2612).getZIP());
	}

	@Test
	@DisplayName("Record 2613: Phone is 830-895-7548")
	void PhoneOfRecord2613() {
		assertEquals("830-895-7548", customers.get(2612).getPhone());
	}

	@Test
	@DisplayName("Record 2613: Fax is 830-895-7706")
	void FaxOfRecord2613() {
		assertEquals("830-895-7706", customers.get(2612).getFax());
	}

	@Test
	@DisplayName("Record 2613: Email is nathaniel@boquet.com")
	void EmailOfRecord2613() {
		assertEquals("nathaniel@boquet.com", customers.get(2612).getEmail());
	}

	@Test
	@DisplayName("Record 2613: Web is http://www.nathanielboquet.com")
	void WebOfRecord2613() {
		assertEquals("http://www.nathanielboquet.com", customers.get(2612).getWeb());
	}
}
