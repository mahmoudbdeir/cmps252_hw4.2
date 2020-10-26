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

@Tag("41")
class Record_3632 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3632: FirstName is Casey")
	void FirstNameOfRecord3632() {
		assertEquals("Casey", customers.get(3631).getFirstName());
	}

	@Test
	@DisplayName("Record 3632: LastName is Dellasciucca")
	void LastNameOfRecord3632() {
		assertEquals("Dellasciucca", customers.get(3631).getLastName());
	}

	@Test
	@DisplayName("Record 3632: Company is Jiffy Machine Aerospace Div")
	void CompanyOfRecord3632() {
		assertEquals("Jiffy Machine Aerospace Div", customers.get(3631).getCompany());
	}

	@Test
	@DisplayName("Record 3632: Address is 2586 Buffalo Rd")
	void AddressOfRecord3632() {
		assertEquals("2586 Buffalo Rd", customers.get(3631).getAddress());
	}

	@Test
	@DisplayName("Record 3632: City is Rochester")
	void CityOfRecord3632() {
		assertEquals("Rochester", customers.get(3631).getCity());
	}

	@Test
	@DisplayName("Record 3632: County is Monroe")
	void CountyOfRecord3632() {
		assertEquals("Monroe", customers.get(3631).getCounty());
	}

	@Test
	@DisplayName("Record 3632: State is NY")
	void StateOfRecord3632() {
		assertEquals("NY", customers.get(3631).getState());
	}

	@Test
	@DisplayName("Record 3632: ZIP is 14624")
	void ZIPOfRecord3632() {
		assertEquals("14624", customers.get(3631).getZIP());
	}

	@Test
	@DisplayName("Record 3632: Phone is 585-865-2410")
	void PhoneOfRecord3632() {
		assertEquals("585-865-2410", customers.get(3631).getPhone());
	}

	@Test
	@DisplayName("Record 3632: Fax is 585-865-0375")
	void FaxOfRecord3632() {
		assertEquals("585-865-0375", customers.get(3631).getFax());
	}

	@Test
	@DisplayName("Record 3632: Email is casey@dellasciucca.com")
	void EmailOfRecord3632() {
		assertEquals("casey@dellasciucca.com", customers.get(3631).getEmail());
	}

	@Test
	@DisplayName("Record 3632: Web is http://www.caseydellasciucca.com")
	void WebOfRecord3632() {
		assertEquals("http://www.caseydellasciucca.com", customers.get(3631).getWeb());
	}
}
