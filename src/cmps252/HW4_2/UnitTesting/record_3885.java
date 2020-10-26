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

@Tag("17")
class Record_3885 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3885: FirstName is Vince")
	void FirstNameOfRecord3885() {
		assertEquals("Vince", customers.get(3884).getFirstName());
	}

	@Test
	@DisplayName("Record 3885: LastName is Majchrzak")
	void LastNameOfRecord3885() {
		assertEquals("Majchrzak", customers.get(3884).getLastName());
	}

	@Test
	@DisplayName("Record 3885: Company is Ross, Paul E")
	void CompanyOfRecord3885() {
		assertEquals("Ross, Paul E", customers.get(3884).getCompany());
	}

	@Test
	@DisplayName("Record 3885: Address is 60 S Abel St")
	void AddressOfRecord3885() {
		assertEquals("60 S Abel St", customers.get(3884).getAddress());
	}

	@Test
	@DisplayName("Record 3885: City is Milpitas")
	void CityOfRecord3885() {
		assertEquals("Milpitas", customers.get(3884).getCity());
	}

	@Test
	@DisplayName("Record 3885: County is Santa Clara")
	void CountyOfRecord3885() {
		assertEquals("Santa Clara", customers.get(3884).getCounty());
	}

	@Test
	@DisplayName("Record 3885: State is CA")
	void StateOfRecord3885() {
		assertEquals("CA", customers.get(3884).getState());
	}

	@Test
	@DisplayName("Record 3885: ZIP is 95035")
	void ZIPOfRecord3885() {
		assertEquals("95035", customers.get(3884).getZIP());
	}

	@Test
	@DisplayName("Record 3885: Phone is 408-263-7772")
	void PhoneOfRecord3885() {
		assertEquals("408-263-7772", customers.get(3884).getPhone());
	}

	@Test
	@DisplayName("Record 3885: Fax is 408-263-7598")
	void FaxOfRecord3885() {
		assertEquals("408-263-7598", customers.get(3884).getFax());
	}

	@Test
	@DisplayName("Record 3885: Email is vince@majchrzak.com")
	void EmailOfRecord3885() {
		assertEquals("vince@majchrzak.com", customers.get(3884).getEmail());
	}

	@Test
	@DisplayName("Record 3885: Web is http://www.vincemajchrzak.com")
	void WebOfRecord3885() {
		assertEquals("http://www.vincemajchrzak.com", customers.get(3884).getWeb());
	}
}
