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

@Tag("45")
class Record_1108 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1108: FirstName is Gisela")
	void FirstNameOfRecord1108() {
		assertEquals("Gisela", customers.get(1107).getFirstName());
	}

	@Test
	@DisplayName("Record 1108: LastName is Rusche")
	void LastNameOfRecord1108() {
		assertEquals("Rusche", customers.get(1107).getLastName());
	}

	@Test
	@DisplayName("Record 1108: Company is Boyle, James B Jr")
	void CompanyOfRecord1108() {
		assertEquals("Boyle, James B Jr", customers.get(1107).getCompany());
	}

	@Test
	@DisplayName("Record 1108: Address is 406 N Downtown Mall")
	void AddressOfRecord1108() {
		assertEquals("406 N Downtown Mall", customers.get(1107).getAddress());
	}

	@Test
	@DisplayName("Record 1108: City is Las Cruces")
	void CityOfRecord1108() {
		assertEquals("Las Cruces", customers.get(1107).getCity());
	}

	@Test
	@DisplayName("Record 1108: County is Dona Ana")
	void CountyOfRecord1108() {
		assertEquals("Dona Ana", customers.get(1107).getCounty());
	}

	@Test
	@DisplayName("Record 1108: State is NM")
	void StateOfRecord1108() {
		assertEquals("NM", customers.get(1107).getState());
	}

	@Test
	@DisplayName("Record 1108: ZIP is 88001")
	void ZIPOfRecord1108() {
		assertEquals("88001", customers.get(1107).getZIP());
	}

	@Test
	@DisplayName("Record 1108: Phone is 505-527-1390")
	void PhoneOfRecord1108() {
		assertEquals("505-527-1390", customers.get(1107).getPhone());
	}

	@Test
	@DisplayName("Record 1108: Fax is 505-527-0791")
	void FaxOfRecord1108() {
		assertEquals("505-527-0791", customers.get(1107).getFax());
	}

	@Test
	@DisplayName("Record 1108: Email is gisela@rusche.com")
	void EmailOfRecord1108() {
		assertEquals("gisela@rusche.com", customers.get(1107).getEmail());
	}

	@Test
	@DisplayName("Record 1108: Web is http://www.giselarusche.com")
	void WebOfRecord1108() {
		assertEquals("http://www.giselarusche.com", customers.get(1107).getWeb());
	}
}
