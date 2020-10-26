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

@Tag("6")
class Record_313 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 313: FirstName is Lee")
	void FirstNameOfRecord313() {
		assertEquals("Lee", customers.get(312).getFirstName());
	}

	@Test
	@DisplayName("Record 313: LastName is Karl")
	void LastNameOfRecord313() {
		assertEquals("Karl", customers.get(312).getLastName());
	}

	@Test
	@DisplayName("Record 313: Company is Bates, Ernie Esq")
	void CompanyOfRecord313() {
		assertEquals("Bates, Ernie Esq", customers.get(312).getCompany());
	}

	@Test
	@DisplayName("Record 313: Address is Rr 1")
	void AddressOfRecord313() {
		assertEquals("Rr 1", customers.get(312).getAddress());
	}

	@Test
	@DisplayName("Record 313: City is Thomasville")
	void CityOfRecord313() {
		assertEquals("Thomasville", customers.get(312).getCity());
	}

	@Test
	@DisplayName("Record 313: County is Davidson")
	void CountyOfRecord313() {
		assertEquals("Davidson", customers.get(312).getCounty());
	}

	@Test
	@DisplayName("Record 313: State is NC")
	void StateOfRecord313() {
		assertEquals("NC", customers.get(312).getState());
	}

	@Test
	@DisplayName("Record 313: ZIP is 27360")
	void ZIPOfRecord313() {
		assertEquals("27360", customers.get(312).getZIP());
	}

	@Test
	@DisplayName("Record 313: Phone is 336-475-4717")
	void PhoneOfRecord313() {
		assertEquals("336-475-4717", customers.get(312).getPhone());
	}

	@Test
	@DisplayName("Record 313: Fax is 336-475-9034")
	void FaxOfRecord313() {
		assertEquals("336-475-9034", customers.get(312).getFax());
	}

	@Test
	@DisplayName("Record 313: Email is lee@karl.com")
	void EmailOfRecord313() {
		assertEquals("lee@karl.com", customers.get(312).getEmail());
	}

	@Test
	@DisplayName("Record 313: Web is http://www.leekarl.com")
	void WebOfRecord313() {
		assertEquals("http://www.leekarl.com", customers.get(312).getWeb());
	}
}
