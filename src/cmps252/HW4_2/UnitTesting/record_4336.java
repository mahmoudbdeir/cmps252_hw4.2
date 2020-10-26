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

@Tag("38")
class Record_4336 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4336: FirstName is Cathleen")
	void FirstNameOfRecord4336() {
		assertEquals("Cathleen", customers.get(4335).getFirstName());
	}

	@Test
	@DisplayName("Record 4336: LastName is Syger")
	void LastNameOfRecord4336() {
		assertEquals("Syger", customers.get(4335).getLastName());
	}

	@Test
	@DisplayName("Record 4336: Company is Scholl, Verne C Esq")
	void CompanyOfRecord4336() {
		assertEquals("Scholl, Verne C Esq", customers.get(4335).getCompany());
	}

	@Test
	@DisplayName("Record 4336: Address is 5555 Grossmont Center Dr")
	void AddressOfRecord4336() {
		assertEquals("5555 Grossmont Center Dr", customers.get(4335).getAddress());
	}

	@Test
	@DisplayName("Record 4336: City is La Mesa")
	void CityOfRecord4336() {
		assertEquals("La Mesa", customers.get(4335).getCity());
	}

	@Test
	@DisplayName("Record 4336: County is San Diego")
	void CountyOfRecord4336() {
		assertEquals("San Diego", customers.get(4335).getCounty());
	}

	@Test
	@DisplayName("Record 4336: State is CA")
	void StateOfRecord4336() {
		assertEquals("CA", customers.get(4335).getState());
	}

	@Test
	@DisplayName("Record 4336: ZIP is 91942")
	void ZIPOfRecord4336() {
		assertEquals("91942", customers.get(4335).getZIP());
	}

	@Test
	@DisplayName("Record 4336: Phone is 619-465-4664")
	void PhoneOfRecord4336() {
		assertEquals("619-465-4664", customers.get(4335).getPhone());
	}

	@Test
	@DisplayName("Record 4336: Fax is 619-465-5314")
	void FaxOfRecord4336() {
		assertEquals("619-465-5314", customers.get(4335).getFax());
	}

	@Test
	@DisplayName("Record 4336: Email is cathleen@syger.com")
	void EmailOfRecord4336() {
		assertEquals("cathleen@syger.com", customers.get(4335).getEmail());
	}

	@Test
	@DisplayName("Record 4336: Web is http://www.cathleensyger.com")
	void WebOfRecord4336() {
		assertEquals("http://www.cathleensyger.com", customers.get(4335).getWeb());
	}
}
