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

@Tag("23")
class Record_1769 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1769: FirstName is Marlene")
	void FirstNameOfRecord1769() {
		assertEquals("Marlene", customers.get(1768).getFirstName());
	}

	@Test
	@DisplayName("Record 1769: LastName is Nemeth")
	void LastNameOfRecord1769() {
		assertEquals("Nemeth", customers.get(1768).getLastName());
	}

	@Test
	@DisplayName("Record 1769: Company is Omnibus Inc")
	void CompanyOfRecord1769() {
		assertEquals("Omnibus Inc", customers.get(1768).getCompany());
	}

	@Test
	@DisplayName("Record 1769: Address is 101 Pikes Peak Dr")
	void AddressOfRecord1769() {
		assertEquals("101 Pikes Peak Dr", customers.get(1768).getAddress());
	}

	@Test
	@DisplayName("Record 1769: City is San Rafael")
	void CityOfRecord1769() {
		assertEquals("San Rafael", customers.get(1768).getCity());
	}

	@Test
	@DisplayName("Record 1769: County is Marin")
	void CountyOfRecord1769() {
		assertEquals("Marin", customers.get(1768).getCounty());
	}

	@Test
	@DisplayName("Record 1769: State is CA")
	void StateOfRecord1769() {
		assertEquals("CA", customers.get(1768).getState());
	}

	@Test
	@DisplayName("Record 1769: ZIP is 94903")
	void ZIPOfRecord1769() {
		assertEquals("94903", customers.get(1768).getZIP());
	}

	@Test
	@DisplayName("Record 1769: Phone is 415-472-5906")
	void PhoneOfRecord1769() {
		assertEquals("415-472-5906", customers.get(1768).getPhone());
	}

	@Test
	@DisplayName("Record 1769: Fax is 415-472-8632")
	void FaxOfRecord1769() {
		assertEquals("415-472-8632", customers.get(1768).getFax());
	}

	@Test
	@DisplayName("Record 1769: Email is marlene@nemeth.com")
	void EmailOfRecord1769() {
		assertEquals("marlene@nemeth.com", customers.get(1768).getEmail());
	}

	@Test
	@DisplayName("Record 1769: Web is http://www.marlenenemeth.com")
	void WebOfRecord1769() {
		assertEquals("http://www.marlenenemeth.com", customers.get(1768).getWeb());
	}
}
