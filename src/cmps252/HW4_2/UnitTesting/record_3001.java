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

@Tag("29")
class Record_3001 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3001: FirstName is Jeannie")
	void FirstNameOfRecord3001() {
		assertEquals("Jeannie", customers.get(3000).getFirstName());
	}

	@Test
	@DisplayName("Record 3001: LastName is Valtierra")
	void LastNameOfRecord3001() {
		assertEquals("Valtierra", customers.get(3000).getLastName());
	}

	@Test
	@DisplayName("Record 3001: Company is Research Center")
	void CompanyOfRecord3001() {
		assertEquals("Research Center", customers.get(3000).getCompany());
	}

	@Test
	@DisplayName("Record 3001: Address is 585 Howard St")
	void AddressOfRecord3001() {
		assertEquals("585 Howard St", customers.get(3000).getAddress());
	}

	@Test
	@DisplayName("Record 3001: City is San Francisco")
	void CityOfRecord3001() {
		assertEquals("San Francisco", customers.get(3000).getCity());
	}

	@Test
	@DisplayName("Record 3001: County is San Francisco")
	void CountyOfRecord3001() {
		assertEquals("San Francisco", customers.get(3000).getCounty());
	}

	@Test
	@DisplayName("Record 3001: State is CA")
	void StateOfRecord3001() {
		assertEquals("CA", customers.get(3000).getState());
	}

	@Test
	@DisplayName("Record 3001: ZIP is 94105")
	void ZIPOfRecord3001() {
		assertEquals("94105", customers.get(3000).getZIP());
	}

	@Test
	@DisplayName("Record 3001: Phone is 415-781-2408")
	void PhoneOfRecord3001() {
		assertEquals("415-781-2408", customers.get(3000).getPhone());
	}

	@Test
	@DisplayName("Record 3001: Fax is 415-781-8995")
	void FaxOfRecord3001() {
		assertEquals("415-781-8995", customers.get(3000).getFax());
	}

	@Test
	@DisplayName("Record 3001: Email is jeannie@valtierra.com")
	void EmailOfRecord3001() {
		assertEquals("jeannie@valtierra.com", customers.get(3000).getEmail());
	}

	@Test
	@DisplayName("Record 3001: Web is http://www.jeannievaltierra.com")
	void WebOfRecord3001() {
		assertEquals("http://www.jeannievaltierra.com", customers.get(3000).getWeb());
	}
}
