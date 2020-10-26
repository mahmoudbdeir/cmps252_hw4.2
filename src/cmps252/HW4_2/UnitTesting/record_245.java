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

@Tag("26")
class Record_245 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 245: FirstName is Stephanie")
	void FirstNameOfRecord245() {
		assertEquals("Stephanie", customers.get(244).getFirstName());
	}

	@Test
	@DisplayName("Record 245: LastName is Swille")
	void LastNameOfRecord245() {
		assertEquals("Swille", customers.get(244).getLastName());
	}

	@Test
	@DisplayName("Record 245: Company is Hulsey, Benjamin H Esq")
	void CompanyOfRecord245() {
		assertEquals("Hulsey, Benjamin H Esq", customers.get(244).getCompany());
	}

	@Test
	@DisplayName("Record 245: Address is 3900 Bango Rd")
	void AddressOfRecord245() {
		assertEquals("3900 Bango Rd", customers.get(244).getAddress());
	}

	@Test
	@DisplayName("Record 245: City is Fallon")
	void CityOfRecord245() {
		assertEquals("Fallon", customers.get(244).getCity());
	}

	@Test
	@DisplayName("Record 245: County is Churchill")
	void CountyOfRecord245() {
		assertEquals("Churchill", customers.get(244).getCounty());
	}

	@Test
	@DisplayName("Record 245: State is NV")
	void StateOfRecord245() {
		assertEquals("NV", customers.get(244).getState());
	}

	@Test
	@DisplayName("Record 245: ZIP is 89406")
	void ZIPOfRecord245() {
		assertEquals("89406", customers.get(244).getZIP());
	}

	@Test
	@DisplayName("Record 245: Phone is 775-867-2120")
	void PhoneOfRecord245() {
		assertEquals("775-867-2120", customers.get(244).getPhone());
	}

	@Test
	@DisplayName("Record 245: Fax is 775-867-6252")
	void FaxOfRecord245() {
		assertEquals("775-867-6252", customers.get(244).getFax());
	}

	@Test
	@DisplayName("Record 245: Email is stephanie@swille.com")
	void EmailOfRecord245() {
		assertEquals("stephanie@swille.com", customers.get(244).getEmail());
	}

	@Test
	@DisplayName("Record 245: Web is http://www.stephanieswille.com")
	void WebOfRecord245() {
		assertEquals("http://www.stephanieswille.com", customers.get(244).getWeb());
	}
}
