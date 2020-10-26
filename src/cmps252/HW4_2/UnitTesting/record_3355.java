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

@Tag("7")
class Record_3355 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3355: FirstName is Augustus")
	void FirstNameOfRecord3355() {
		assertEquals("Augustus", customers.get(3354).getFirstName());
	}

	@Test
	@DisplayName("Record 3355: LastName is Campione")
	void LastNameOfRecord3355() {
		assertEquals("Campione", customers.get(3354).getLastName());
	}

	@Test
	@DisplayName("Record 3355: Company is Mayfield & Brooks")
	void CompanyOfRecord3355() {
		assertEquals("Mayfield & Brooks", customers.get(3354).getCompany());
	}

	@Test
	@DisplayName("Record 3355: Address is 1325 Egbert Ave")
	void AddressOfRecord3355() {
		assertEquals("1325 Egbert Ave", customers.get(3354).getAddress());
	}

	@Test
	@DisplayName("Record 3355: City is San Francisco")
	void CityOfRecord3355() {
		assertEquals("San Francisco", customers.get(3354).getCity());
	}

	@Test
	@DisplayName("Record 3355: County is San Francisco")
	void CountyOfRecord3355() {
		assertEquals("San Francisco", customers.get(3354).getCounty());
	}

	@Test
	@DisplayName("Record 3355: State is CA")
	void StateOfRecord3355() {
		assertEquals("CA", customers.get(3354).getState());
	}

	@Test
	@DisplayName("Record 3355: ZIP is 94124")
	void ZIPOfRecord3355() {
		assertEquals("94124", customers.get(3354).getZIP());
	}

	@Test
	@DisplayName("Record 3355: Phone is 415-822-5286")
	void PhoneOfRecord3355() {
		assertEquals("415-822-5286", customers.get(3354).getPhone());
	}

	@Test
	@DisplayName("Record 3355: Fax is 415-822-6246")
	void FaxOfRecord3355() {
		assertEquals("415-822-6246", customers.get(3354).getFax());
	}

	@Test
	@DisplayName("Record 3355: Email is augustus@campione.com")
	void EmailOfRecord3355() {
		assertEquals("augustus@campione.com", customers.get(3354).getEmail());
	}

	@Test
	@DisplayName("Record 3355: Web is http://www.augustuscampione.com")
	void WebOfRecord3355() {
		assertEquals("http://www.augustuscampione.com", customers.get(3354).getWeb());
	}
}
