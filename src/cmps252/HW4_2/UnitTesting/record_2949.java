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

@Tag("33")
class Record_2949 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2949: FirstName is Efren")
	void FirstNameOfRecord2949() {
		assertEquals("Efren", customers.get(2948).getFirstName());
	}

	@Test
	@DisplayName("Record 2949: LastName is Sito")
	void LastNameOfRecord2949() {
		assertEquals("Sito", customers.get(2948).getLastName());
	}

	@Test
	@DisplayName("Record 2949: Company is Copenhaver, David L Esq")
	void CompanyOfRecord2949() {
		assertEquals("Copenhaver, David L Esq", customers.get(2948).getCompany());
	}

	@Test
	@DisplayName("Record 2949: Address is 11168 Penrose St")
	void AddressOfRecord2949() {
		assertEquals("11168 Penrose St", customers.get(2948).getAddress());
	}

	@Test
	@DisplayName("Record 2949: City is Sun Valley")
	void CityOfRecord2949() {
		assertEquals("Sun Valley", customers.get(2948).getCity());
	}

	@Test
	@DisplayName("Record 2949: County is Los Angeles")
	void CountyOfRecord2949() {
		assertEquals("Los Angeles", customers.get(2948).getCounty());
	}

	@Test
	@DisplayName("Record 2949: State is CA")
	void StateOfRecord2949() {
		assertEquals("CA", customers.get(2948).getState());
	}

	@Test
	@DisplayName("Record 2949: ZIP is 91352")
	void ZIPOfRecord2949() {
		assertEquals("91352", customers.get(2948).getZIP());
	}

	@Test
	@DisplayName("Record 2949: Phone is 818-771-5337")
	void PhoneOfRecord2949() {
		assertEquals("818-771-5337", customers.get(2948).getPhone());
	}

	@Test
	@DisplayName("Record 2949: Fax is 818-771-5821")
	void FaxOfRecord2949() {
		assertEquals("818-771-5821", customers.get(2948).getFax());
	}

	@Test
	@DisplayName("Record 2949: Email is efren@sito.com")
	void EmailOfRecord2949() {
		assertEquals("efren@sito.com", customers.get(2948).getEmail());
	}

	@Test
	@DisplayName("Record 2949: Web is http://www.efrensito.com")
	void WebOfRecord2949() {
		assertEquals("http://www.efrensito.com", customers.get(2948).getWeb());
	}
}
