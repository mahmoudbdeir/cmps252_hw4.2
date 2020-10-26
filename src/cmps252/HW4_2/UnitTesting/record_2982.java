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

@Tag("9")
class Record_2982 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2982: FirstName is Bridget")
	void FirstNameOfRecord2982() {
		assertEquals("Bridget", customers.get(2981).getFirstName());
	}

	@Test
	@DisplayName("Record 2982: LastName is Fannin")
	void LastNameOfRecord2982() {
		assertEquals("Fannin", customers.get(2981).getLastName());
	}

	@Test
	@DisplayName("Record 2982: Company is Manes, Stephen Esq")
	void CompanyOfRecord2982() {
		assertEquals("Manes, Stephen Esq", customers.get(2981).getCompany());
	}

	@Test
	@DisplayName("Record 2982: Address is 31316 Via Colinas")
	void AddressOfRecord2982() {
		assertEquals("31316 Via Colinas", customers.get(2981).getAddress());
	}

	@Test
	@DisplayName("Record 2982: City is Thousand Oaks")
	void CityOfRecord2982() {
		assertEquals("Thousand Oaks", customers.get(2981).getCity());
	}

	@Test
	@DisplayName("Record 2982: County is Ventura")
	void CountyOfRecord2982() {
		assertEquals("Ventura", customers.get(2981).getCounty());
	}

	@Test
	@DisplayName("Record 2982: State is CA")
	void StateOfRecord2982() {
		assertEquals("CA", customers.get(2981).getState());
	}

	@Test
	@DisplayName("Record 2982: ZIP is 91362")
	void ZIPOfRecord2982() {
		assertEquals("91362", customers.get(2981).getZIP());
	}

	@Test
	@DisplayName("Record 2982: Phone is 805-865-3836")
	void PhoneOfRecord2982() {
		assertEquals("805-865-3836", customers.get(2981).getPhone());
	}

	@Test
	@DisplayName("Record 2982: Fax is 805-865-7227")
	void FaxOfRecord2982() {
		assertEquals("805-865-7227", customers.get(2981).getFax());
	}

	@Test
	@DisplayName("Record 2982: Email is bridget@fannin.com")
	void EmailOfRecord2982() {
		assertEquals("bridget@fannin.com", customers.get(2981).getEmail());
	}

	@Test
	@DisplayName("Record 2982: Web is http://www.bridgetfannin.com")
	void WebOfRecord2982() {
		assertEquals("http://www.bridgetfannin.com", customers.get(2981).getWeb());
	}
}
