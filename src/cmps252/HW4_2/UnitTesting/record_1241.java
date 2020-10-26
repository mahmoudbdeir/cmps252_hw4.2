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

@Tag("9")
class Record_1241 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1241: FirstName is Cari")
	void FirstNameOfRecord1241() {
		assertEquals("Cari", customers.get(1240).getFirstName());
	}

	@Test
	@DisplayName("Record 1241: LastName is Finazzo")
	void LastNameOfRecord1241() {
		assertEquals("Finazzo", customers.get(1240).getLastName());
	}

	@Test
	@DisplayName("Record 1241: Company is Becker, Steven Allen Esq")
	void CompanyOfRecord1241() {
		assertEquals("Becker, Steven Allen Esq", customers.get(1240).getCompany());
	}

	@Test
	@DisplayName("Record 1241: Address is 1387 E Lafayette St")
	void AddressOfRecord1241() {
		assertEquals("1387 E Lafayette St", customers.get(1240).getAddress());
	}

	@Test
	@DisplayName("Record 1241: City is Tallahassee")
	void CityOfRecord1241() {
		assertEquals("Tallahassee", customers.get(1240).getCity());
	}

	@Test
	@DisplayName("Record 1241: County is Leon")
	void CountyOfRecord1241() {
		assertEquals("Leon", customers.get(1240).getCounty());
	}

	@Test
	@DisplayName("Record 1241: State is FL")
	void StateOfRecord1241() {
		assertEquals("FL", customers.get(1240).getState());
	}

	@Test
	@DisplayName("Record 1241: ZIP is 32301")
	void ZIPOfRecord1241() {
		assertEquals("32301", customers.get(1240).getZIP());
	}

	@Test
	@DisplayName("Record 1241: Phone is 850-877-8778")
	void PhoneOfRecord1241() {
		assertEquals("850-877-8778", customers.get(1240).getPhone());
	}

	@Test
	@DisplayName("Record 1241: Fax is 850-877-2163")
	void FaxOfRecord1241() {
		assertEquals("850-877-2163", customers.get(1240).getFax());
	}

	@Test
	@DisplayName("Record 1241: Email is cari@finazzo.com")
	void EmailOfRecord1241() {
		assertEquals("cari@finazzo.com", customers.get(1240).getEmail());
	}

	@Test
	@DisplayName("Record 1241: Web is http://www.carifinazzo.com")
	void WebOfRecord1241() {
		assertEquals("http://www.carifinazzo.com", customers.get(1240).getWeb());
	}
}
