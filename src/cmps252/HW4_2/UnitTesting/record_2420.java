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
class Record_2420 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2420: FirstName is Josefa")
	void FirstNameOfRecord2420() {
		assertEquals("Josefa", customers.get(2419).getFirstName());
	}

	@Test
	@DisplayName("Record 2420: LastName is Jorres")
	void LastNameOfRecord2420() {
		assertEquals("Jorres", customers.get(2419).getLastName());
	}

	@Test
	@DisplayName("Record 2420: Company is Yng Men Chrstn Assn Child Care")
	void CompanyOfRecord2420() {
		assertEquals("Yng Men Chrstn Assn Child Care", customers.get(2419).getCompany());
	}

	@Test
	@DisplayName("Record 2420: Address is 217 2nd St")
	void AddressOfRecord2420() {
		assertEquals("217 2nd St", customers.get(2419).getAddress());
	}

	@Test
	@DisplayName("Record 2420: City is San Francisco")
	void CityOfRecord2420() {
		assertEquals("San Francisco", customers.get(2419).getCity());
	}

	@Test
	@DisplayName("Record 2420: County is San Francisco")
	void CountyOfRecord2420() {
		assertEquals("San Francisco", customers.get(2419).getCounty());
	}

	@Test
	@DisplayName("Record 2420: State is CA")
	void StateOfRecord2420() {
		assertEquals("CA", customers.get(2419).getState());
	}

	@Test
	@DisplayName("Record 2420: ZIP is 94105")
	void ZIPOfRecord2420() {
		assertEquals("94105", customers.get(2419).getZIP());
	}

	@Test
	@DisplayName("Record 2420: Phone is 415-777-0381")
	void PhoneOfRecord2420() {
		assertEquals("415-777-0381", customers.get(2419).getPhone());
	}

	@Test
	@DisplayName("Record 2420: Fax is 415-777-4873")
	void FaxOfRecord2420() {
		assertEquals("415-777-4873", customers.get(2419).getFax());
	}

	@Test
	@DisplayName("Record 2420: Email is josefa@jorres.com")
	void EmailOfRecord2420() {
		assertEquals("josefa@jorres.com", customers.get(2419).getEmail());
	}

	@Test
	@DisplayName("Record 2420: Web is http://www.josefajorres.com")
	void WebOfRecord2420() {
		assertEquals("http://www.josefajorres.com", customers.get(2419).getWeb());
	}
}
