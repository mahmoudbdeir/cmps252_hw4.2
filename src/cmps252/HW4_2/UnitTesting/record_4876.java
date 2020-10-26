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

@Tag("44")
class Record_4876 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4876: FirstName is Georgia")
	void FirstNameOfRecord4876() {
		assertEquals("Georgia", customers.get(4875).getFirstName());
	}

	@Test
	@DisplayName("Record 4876: LastName is Kohles")
	void LastNameOfRecord4876() {
		assertEquals("Kohles", customers.get(4875).getLastName());
	}

	@Test
	@DisplayName("Record 4876: Company is Covin, Mark D Esq")
	void CompanyOfRecord4876() {
		assertEquals("Covin, Mark D Esq", customers.get(4875).getCompany());
	}

	@Test
	@DisplayName("Record 4876: Address is 68100 Ramon Rd  #-c7")
	void AddressOfRecord4876() {
		assertEquals("68100 Ramon Rd  #-c7", customers.get(4875).getAddress());
	}

	@Test
	@DisplayName("Record 4876: City is Cathedral City")
	void CityOfRecord4876() {
		assertEquals("Cathedral City", customers.get(4875).getCity());
	}

	@Test
	@DisplayName("Record 4876: County is Riverside")
	void CountyOfRecord4876() {
		assertEquals("Riverside", customers.get(4875).getCounty());
	}

	@Test
	@DisplayName("Record 4876: State is CA")
	void StateOfRecord4876() {
		assertEquals("CA", customers.get(4875).getState());
	}

	@Test
	@DisplayName("Record 4876: ZIP is 92234")
	void ZIPOfRecord4876() {
		assertEquals("92234", customers.get(4875).getZIP());
	}

	@Test
	@DisplayName("Record 4876: Phone is 760-321-2592")
	void PhoneOfRecord4876() {
		assertEquals("760-321-2592", customers.get(4875).getPhone());
	}

	@Test
	@DisplayName("Record 4876: Fax is 760-321-1889")
	void FaxOfRecord4876() {
		assertEquals("760-321-1889", customers.get(4875).getFax());
	}

	@Test
	@DisplayName("Record 4876: Email is georgia@kohles.com")
	void EmailOfRecord4876() {
		assertEquals("georgia@kohles.com", customers.get(4875).getEmail());
	}

	@Test
	@DisplayName("Record 4876: Web is http://www.georgiakohles.com")
	void WebOfRecord4876() {
		assertEquals("http://www.georgiakohles.com", customers.get(4875).getWeb());
	}
}
