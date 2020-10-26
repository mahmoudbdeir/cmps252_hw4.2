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
class Record_1518 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1518: FirstName is Marjorie")
	void FirstNameOfRecord1518() {
		assertEquals("Marjorie", customers.get(1517).getFirstName());
	}

	@Test
	@DisplayName("Record 1518: LastName is Soqui")
	void LastNameOfRecord1518() {
		assertEquals("Soqui", customers.get(1517).getLastName());
	}

	@Test
	@DisplayName("Record 1518: Company is Perez, Roger Esq")
	void CompanyOfRecord1518() {
		assertEquals("Perez, Roger Esq", customers.get(1517).getCompany());
	}

	@Test
	@DisplayName("Record 1518: Address is 2601 Crestview Dr")
	void AddressOfRecord1518() {
		assertEquals("2601 Crestview Dr", customers.get(1517).getAddress());
	}

	@Test
	@DisplayName("Record 1518: City is Newberg")
	void CityOfRecord1518() {
		assertEquals("Newberg", customers.get(1517).getCity());
	}

	@Test
	@DisplayName("Record 1518: County is Yamhill")
	void CountyOfRecord1518() {
		assertEquals("Yamhill", customers.get(1517).getCounty());
	}

	@Test
	@DisplayName("Record 1518: State is OR")
	void StateOfRecord1518() {
		assertEquals("OR", customers.get(1517).getState());
	}

	@Test
	@DisplayName("Record 1518: ZIP is 97132")
	void ZIPOfRecord1518() {
		assertEquals("97132", customers.get(1517).getZIP());
	}

	@Test
	@DisplayName("Record 1518: Phone is 503-538-6000")
	void PhoneOfRecord1518() {
		assertEquals("503-538-6000", customers.get(1517).getPhone());
	}

	@Test
	@DisplayName("Record 1518: Fax is 503-538-1512")
	void FaxOfRecord1518() {
		assertEquals("503-538-1512", customers.get(1517).getFax());
	}

	@Test
	@DisplayName("Record 1518: Email is marjorie@soqui.com")
	void EmailOfRecord1518() {
		assertEquals("marjorie@soqui.com", customers.get(1517).getEmail());
	}

	@Test
	@DisplayName("Record 1518: Web is http://www.marjoriesoqui.com")
	void WebOfRecord1518() {
		assertEquals("http://www.marjoriesoqui.com", customers.get(1517).getWeb());
	}
}
