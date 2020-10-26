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

@Tag("13")
class Record_3661 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3661: FirstName is Ila")
	void FirstNameOfRecord3661() {
		assertEquals("Ila", customers.get(3660).getFirstName());
	}

	@Test
	@DisplayName("Record 3661: LastName is Sardi")
	void LastNameOfRecord3661() {
		assertEquals("Sardi", customers.get(3660).getLastName());
	}

	@Test
	@DisplayName("Record 3661: Company is Erts, Ralph V Esq")
	void CompanyOfRecord3661() {
		assertEquals("Erts, Ralph V Esq", customers.get(3660).getCompany());
	}

	@Test
	@DisplayName("Record 3661: Address is 251 Michelle Ct")
	void AddressOfRecord3661() {
		assertEquals("251 Michelle Ct", customers.get(3660).getAddress());
	}

	@Test
	@DisplayName("Record 3661: City is South San Francisco")
	void CityOfRecord3661() {
		assertEquals("South San Francisco", customers.get(3660).getCity());
	}

	@Test
	@DisplayName("Record 3661: County is San Mateo")
	void CountyOfRecord3661() {
		assertEquals("San Mateo", customers.get(3660).getCounty());
	}

	@Test
	@DisplayName("Record 3661: State is CA")
	void StateOfRecord3661() {
		assertEquals("CA", customers.get(3660).getState());
	}

	@Test
	@DisplayName("Record 3661: ZIP is 94080")
	void ZIPOfRecord3661() {
		assertEquals("94080", customers.get(3660).getZIP());
	}

	@Test
	@DisplayName("Record 3661: Phone is 650-952-3363")
	void PhoneOfRecord3661() {
		assertEquals("650-952-3363", customers.get(3660).getPhone());
	}

	@Test
	@DisplayName("Record 3661: Fax is 650-952-9703")
	void FaxOfRecord3661() {
		assertEquals("650-952-9703", customers.get(3660).getFax());
	}

	@Test
	@DisplayName("Record 3661: Email is ila@sardi.com")
	void EmailOfRecord3661() {
		assertEquals("ila@sardi.com", customers.get(3660).getEmail());
	}

	@Test
	@DisplayName("Record 3661: Web is http://www.ilasardi.com")
	void WebOfRecord3661() {
		assertEquals("http://www.ilasardi.com", customers.get(3660).getWeb());
	}
}
