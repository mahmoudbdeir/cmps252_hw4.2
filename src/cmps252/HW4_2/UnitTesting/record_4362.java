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

@Tag("49")
class Record_4362 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4362: FirstName is Vesta")
	void FirstNameOfRecord4362() {
		assertEquals("Vesta", customers.get(4361).getFirstName());
	}

	@Test
	@DisplayName("Record 4362: LastName is Papik")
	void LastNameOfRecord4362() {
		assertEquals("Papik", customers.get(4361).getLastName());
	}

	@Test
	@DisplayName("Record 4362: Company is Sunnywoods Flower Shop Inc")
	void CompanyOfRecord4362() {
		assertEquals("Sunnywoods Flower Shop Inc", customers.get(4361).getCompany());
	}

	@Test
	@DisplayName("Record 4362: Address is 333 Market St")
	void AddressOfRecord4362() {
		assertEquals("333 Market St", customers.get(4361).getAddress());
	}

	@Test
	@DisplayName("Record 4362: City is San Francisco")
	void CityOfRecord4362() {
		assertEquals("San Francisco", customers.get(4361).getCity());
	}

	@Test
	@DisplayName("Record 4362: County is San Francisco")
	void CountyOfRecord4362() {
		assertEquals("San Francisco", customers.get(4361).getCounty());
	}

	@Test
	@DisplayName("Record 4362: State is CA")
	void StateOfRecord4362() {
		assertEquals("CA", customers.get(4361).getState());
	}

	@Test
	@DisplayName("Record 4362: ZIP is 94105")
	void ZIPOfRecord4362() {
		assertEquals("94105", customers.get(4361).getZIP());
	}

	@Test
	@DisplayName("Record 4362: Phone is 415-227-4799")
	void PhoneOfRecord4362() {
		assertEquals("415-227-4799", customers.get(4361).getPhone());
	}

	@Test
	@DisplayName("Record 4362: Fax is 415-227-1194")
	void FaxOfRecord4362() {
		assertEquals("415-227-1194", customers.get(4361).getFax());
	}

	@Test
	@DisplayName("Record 4362: Email is vesta@papik.com")
	void EmailOfRecord4362() {
		assertEquals("vesta@papik.com", customers.get(4361).getEmail());
	}

	@Test
	@DisplayName("Record 4362: Web is http://www.vestapapik.com")
	void WebOfRecord4362() {
		assertEquals("http://www.vestapapik.com", customers.get(4361).getWeb());
	}
}
