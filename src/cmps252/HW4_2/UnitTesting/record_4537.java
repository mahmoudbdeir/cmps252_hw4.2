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

@Tag("48")
class Record_4537 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4537: FirstName is Damien")
	void FirstNameOfRecord4537() {
		assertEquals("Damien", customers.get(4536).getFirstName());
	}

	@Test
	@DisplayName("Record 4537: LastName is Contrera")
	void LastNameOfRecord4537() {
		assertEquals("Contrera", customers.get(4536).getLastName());
	}

	@Test
	@DisplayName("Record 4537: Company is Swenson, Kevin D Esq")
	void CompanyOfRecord4537() {
		assertEquals("Swenson, Kevin D Esq", customers.get(4536).getCompany());
	}

	@Test
	@DisplayName("Record 4537: Address is Box #-4100")
	void AddressOfRecord4537() {
		assertEquals("Box #-4100", customers.get(4536).getAddress());
	}

	@Test
	@DisplayName("Record 4537: City is Menlo Park")
	void CityOfRecord4537() {
		assertEquals("Menlo Park", customers.get(4536).getCity());
	}

	@Test
	@DisplayName("Record 4537: County is San Mateo")
	void CountyOfRecord4537() {
		assertEquals("San Mateo", customers.get(4536).getCounty());
	}

	@Test
	@DisplayName("Record 4537: State is CA")
	void StateOfRecord4537() {
		assertEquals("CA", customers.get(4536).getState());
	}

	@Test
	@DisplayName("Record 4537: ZIP is 94026")
	void ZIPOfRecord4537() {
		assertEquals("94026", customers.get(4536).getZIP());
	}

	@Test
	@DisplayName("Record 4537: Phone is 650-599-8915")
	void PhoneOfRecord4537() {
		assertEquals("650-599-8915", customers.get(4536).getPhone());
	}

	@Test
	@DisplayName("Record 4537: Fax is 650-599-7118")
	void FaxOfRecord4537() {
		assertEquals("650-599-7118", customers.get(4536).getFax());
	}

	@Test
	@DisplayName("Record 4537: Email is damien@contrera.com")
	void EmailOfRecord4537() {
		assertEquals("damien@contrera.com", customers.get(4536).getEmail());
	}

	@Test
	@DisplayName("Record 4537: Web is http://www.damiencontrera.com")
	void WebOfRecord4537() {
		assertEquals("http://www.damiencontrera.com", customers.get(4536).getWeb());
	}
}
