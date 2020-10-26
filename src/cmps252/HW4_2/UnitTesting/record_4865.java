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

@Tag("0")
class Record_4865 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4865: FirstName is Colton")
	void FirstNameOfRecord4865() {
		assertEquals("Colton", customers.get(4864).getFirstName());
	}

	@Test
	@DisplayName("Record 4865: LastName is Bankes")
	void LastNameOfRecord4865() {
		assertEquals("Bankes", customers.get(4864).getLastName());
	}

	@Test
	@DisplayName("Record 4865: Company is Estill, Alice Esq")
	void CompanyOfRecord4865() {
		assertEquals("Estill, Alice Esq", customers.get(4864).getCompany());
	}

	@Test
	@DisplayName("Record 4865: Address is 500 Oak St Ne")
	void AddressOfRecord4865() {
		assertEquals("500 Oak St Ne", customers.get(4864).getAddress());
	}

	@Test
	@DisplayName("Record 4865: City is Albuquerque")
	void CityOfRecord4865() {
		assertEquals("Albuquerque", customers.get(4864).getCity());
	}

	@Test
	@DisplayName("Record 4865: County is Bernalillo")
	void CountyOfRecord4865() {
		assertEquals("Bernalillo", customers.get(4864).getCounty());
	}

	@Test
	@DisplayName("Record 4865: State is NM")
	void StateOfRecord4865() {
		assertEquals("NM", customers.get(4864).getState());
	}

	@Test
	@DisplayName("Record 4865: ZIP is 87106")
	void ZIPOfRecord4865() {
		assertEquals("87106", customers.get(4864).getZIP());
	}

	@Test
	@DisplayName("Record 4865: Phone is 505-242-0460")
	void PhoneOfRecord4865() {
		assertEquals("505-242-0460", customers.get(4864).getPhone());
	}

	@Test
	@DisplayName("Record 4865: Fax is 505-242-0447")
	void FaxOfRecord4865() {
		assertEquals("505-242-0447", customers.get(4864).getFax());
	}

	@Test
	@DisplayName("Record 4865: Email is colton@bankes.com")
	void EmailOfRecord4865() {
		assertEquals("colton@bankes.com", customers.get(4864).getEmail());
	}

	@Test
	@DisplayName("Record 4865: Web is http://www.coltonbankes.com")
	void WebOfRecord4865() {
		assertEquals("http://www.coltonbankes.com", customers.get(4864).getWeb());
	}
}
