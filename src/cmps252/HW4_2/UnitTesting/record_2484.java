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

@Tag("47")
class Record_2484 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2484: FirstName is Kendra")
	void FirstNameOfRecord2484() {
		assertEquals("Kendra", customers.get(2483).getFirstName());
	}

	@Test
	@DisplayName("Record 2484: LastName is Dille")
	void LastNameOfRecord2484() {
		assertEquals("Dille", customers.get(2483).getLastName());
	}

	@Test
	@DisplayName("Record 2484: Company is Ambrette, L Conrad Esq")
	void CompanyOfRecord2484() {
		assertEquals("Ambrette, L Conrad Esq", customers.get(2483).getCompany());
	}

	@Test
	@DisplayName("Record 2484: Address is 59 Shore St")
	void AddressOfRecord2484() {
		assertEquals("59 Shore St", customers.get(2483).getAddress());
	}

	@Test
	@DisplayName("Record 2484: City is Falmouth")
	void CityOfRecord2484() {
		assertEquals("Falmouth", customers.get(2483).getCity());
	}

	@Test
	@DisplayName("Record 2484: County is Barnstable")
	void CountyOfRecord2484() {
		assertEquals("Barnstable", customers.get(2483).getCounty());
	}

	@Test
	@DisplayName("Record 2484: State is MA")
	void StateOfRecord2484() {
		assertEquals("MA", customers.get(2483).getState());
	}

	@Test
	@DisplayName("Record 2484: ZIP is 2540")
	void ZIPOfRecord2484() {
		assertEquals("2540", customers.get(2483).getZIP());
	}

	@Test
	@DisplayName("Record 2484: Phone is 508-540-1095")
	void PhoneOfRecord2484() {
		assertEquals("508-540-1095", customers.get(2483).getPhone());
	}

	@Test
	@DisplayName("Record 2484: Fax is 508-540-1453")
	void FaxOfRecord2484() {
		assertEquals("508-540-1453", customers.get(2483).getFax());
	}

	@Test
	@DisplayName("Record 2484: Email is kendra@dille.com")
	void EmailOfRecord2484() {
		assertEquals("kendra@dille.com", customers.get(2483).getEmail());
	}

	@Test
	@DisplayName("Record 2484: Web is http://www.kendradille.com")
	void WebOfRecord2484() {
		assertEquals("http://www.kendradille.com", customers.get(2483).getWeb());
	}
}
