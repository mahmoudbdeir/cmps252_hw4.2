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

@Tag("18")
class Record_1522 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1522: FirstName is Karina")
	void FirstNameOfRecord1522() {
		assertEquals("Karina", customers.get(1521).getFirstName());
	}

	@Test
	@DisplayName("Record 1522: LastName is Wesemann")
	void LastNameOfRecord1522() {
		assertEquals("Wesemann", customers.get(1521).getLastName());
	}

	@Test
	@DisplayName("Record 1522: Company is Cannon Engineering & Equip Co")
	void CompanyOfRecord1522() {
		assertEquals("Cannon Engineering & Equip Co", customers.get(1521).getCompany());
	}

	@Test
	@DisplayName("Record 1522: Address is 9430 Scranton Rd")
	void AddressOfRecord1522() {
		assertEquals("9430 Scranton Rd", customers.get(1521).getAddress());
	}

	@Test
	@DisplayName("Record 1522: City is San Diego")
	void CityOfRecord1522() {
		assertEquals("San Diego", customers.get(1521).getCity());
	}

	@Test
	@DisplayName("Record 1522: County is San Diego")
	void CountyOfRecord1522() {
		assertEquals("San Diego", customers.get(1521).getCounty());
	}

	@Test
	@DisplayName("Record 1522: State is CA")
	void StateOfRecord1522() {
		assertEquals("CA", customers.get(1521).getState());
	}

	@Test
	@DisplayName("Record 1522: ZIP is 92121")
	void ZIPOfRecord1522() {
		assertEquals("92121", customers.get(1521).getZIP());
	}

	@Test
	@DisplayName("Record 1522: Phone is 858-546-7779")
	void PhoneOfRecord1522() {
		assertEquals("858-546-7779", customers.get(1521).getPhone());
	}

	@Test
	@DisplayName("Record 1522: Fax is 858-546-7285")
	void FaxOfRecord1522() {
		assertEquals("858-546-7285", customers.get(1521).getFax());
	}

	@Test
	@DisplayName("Record 1522: Email is karina@wesemann.com")
	void EmailOfRecord1522() {
		assertEquals("karina@wesemann.com", customers.get(1521).getEmail());
	}

	@Test
	@DisplayName("Record 1522: Web is http://www.karinawesemann.com")
	void WebOfRecord1522() {
		assertEquals("http://www.karinawesemann.com", customers.get(1521).getWeb());
	}
}
