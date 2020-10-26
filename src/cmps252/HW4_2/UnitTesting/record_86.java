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

@Tag("27")
class Record_86 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 86: FirstName is Dana")
	void FirstNameOfRecord86() {
		assertEquals("Dana", customers.get(85).getFirstName());
	}

	@Test
	@DisplayName("Record 86: LastName is Crimes")
	void LastNameOfRecord86() {
		assertEquals("Crimes", customers.get(85).getLastName());
	}

	@Test
	@DisplayName("Record 86: Company is Merrifield, David Esq")
	void CompanyOfRecord86() {
		assertEquals("Merrifield, David Esq", customers.get(85).getCompany());
	}

	@Test
	@DisplayName("Record 86: Address is 8615 Elder Creek Rd")
	void AddressOfRecord86() {
		assertEquals("8615 Elder Creek Rd", customers.get(85).getAddress());
	}

	@Test
	@DisplayName("Record 86: City is Sacramento")
	void CityOfRecord86() {
		assertEquals("Sacramento", customers.get(85).getCity());
	}

	@Test
	@DisplayName("Record 86: County is Sacramento")
	void CountyOfRecord86() {
		assertEquals("Sacramento", customers.get(85).getCounty());
	}

	@Test
	@DisplayName("Record 86: State is CA")
	void StateOfRecord86() {
		assertEquals("CA", customers.get(85).getState());
	}

	@Test
	@DisplayName("Record 86: ZIP is 95828")
	void ZIPOfRecord86() {
		assertEquals("95828", customers.get(85).getZIP());
	}

	@Test
	@DisplayName("Record 86: Phone is 916-381-1070")
	void PhoneOfRecord86() {
		assertEquals("916-381-1070", customers.get(85).getPhone());
	}

	@Test
	@DisplayName("Record 86: Fax is 916-381-3987")
	void FaxOfRecord86() {
		assertEquals("916-381-3987", customers.get(85).getFax());
	}

	@Test
	@DisplayName("Record 86: Email is dana@crimes.com")
	void EmailOfRecord86() {
		assertEquals("dana@crimes.com", customers.get(85).getEmail());
	}

	@Test
	@DisplayName("Record 86: Web is http://www.danacrimes.com")
	void WebOfRecord86() {
		assertEquals("http://www.danacrimes.com", customers.get(85).getWeb());
	}
}
