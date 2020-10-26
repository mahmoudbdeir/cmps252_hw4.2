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
class Record_4054 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4054: FirstName is Annmarie")
	void FirstNameOfRecord4054() {
		assertEquals("Annmarie", customers.get(4053).getFirstName());
	}

	@Test
	@DisplayName("Record 4054: LastName is Anzualda")
	void LastNameOfRecord4054() {
		assertEquals("Anzualda", customers.get(4053).getLastName());
	}

	@Test
	@DisplayName("Record 4054: Company is Coogan, James H Esq")
	void CompanyOfRecord4054() {
		assertEquals("Coogan, James H Esq", customers.get(4053).getCompany());
	}

	@Test
	@DisplayName("Record 4054: Address is 415 Grand Ave")
	void AddressOfRecord4054() {
		assertEquals("415 Grand Ave", customers.get(4053).getAddress());
	}

	@Test
	@DisplayName("Record 4054: City is South San Francisco")
	void CityOfRecord4054() {
		assertEquals("South San Francisco", customers.get(4053).getCity());
	}

	@Test
	@DisplayName("Record 4054: County is San Mateo")
	void CountyOfRecord4054() {
		assertEquals("San Mateo", customers.get(4053).getCounty());
	}

	@Test
	@DisplayName("Record 4054: State is CA")
	void StateOfRecord4054() {
		assertEquals("CA", customers.get(4053).getState());
	}

	@Test
	@DisplayName("Record 4054: ZIP is 94080")
	void ZIPOfRecord4054() {
		assertEquals("94080", customers.get(4053).getZIP());
	}

	@Test
	@DisplayName("Record 4054: Phone is 650-589-6952")
	void PhoneOfRecord4054() {
		assertEquals("650-589-6952", customers.get(4053).getPhone());
	}

	@Test
	@DisplayName("Record 4054: Fax is 650-589-5901")
	void FaxOfRecord4054() {
		assertEquals("650-589-5901", customers.get(4053).getFax());
	}

	@Test
	@DisplayName("Record 4054: Email is annmarie@anzualda.com")
	void EmailOfRecord4054() {
		assertEquals("annmarie@anzualda.com", customers.get(4053).getEmail());
	}

	@Test
	@DisplayName("Record 4054: Web is http://www.annmarieanzualda.com")
	void WebOfRecord4054() {
		assertEquals("http://www.annmarieanzualda.com", customers.get(4053).getWeb());
	}
}
