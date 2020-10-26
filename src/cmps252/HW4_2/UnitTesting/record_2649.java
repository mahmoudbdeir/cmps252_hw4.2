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

@Tag("1")
class Record_2649 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2649: FirstName is Cheri")
	void FirstNameOfRecord2649() {
		assertEquals("Cheri", customers.get(2648).getFirstName());
	}

	@Test
	@DisplayName("Record 2649: LastName is Hubble")
	void LastNameOfRecord2649() {
		assertEquals("Hubble", customers.get(2648).getLastName());
	}

	@Test
	@DisplayName("Record 2649: Company is Hodroff, Jeff")
	void CompanyOfRecord2649() {
		assertEquals("Hodroff, Jeff", customers.get(2648).getCompany());
	}

	@Test
	@DisplayName("Record 2649: Address is 915 E Julian St")
	void AddressOfRecord2649() {
		assertEquals("915 E Julian St", customers.get(2648).getAddress());
	}

	@Test
	@DisplayName("Record 2649: City is San Jose")
	void CityOfRecord2649() {
		assertEquals("San Jose", customers.get(2648).getCity());
	}

	@Test
	@DisplayName("Record 2649: County is Santa Clara")
	void CountyOfRecord2649() {
		assertEquals("Santa Clara", customers.get(2648).getCounty());
	}

	@Test
	@DisplayName("Record 2649: State is CA")
	void StateOfRecord2649() {
		assertEquals("CA", customers.get(2648).getState());
	}

	@Test
	@DisplayName("Record 2649: ZIP is 95112")
	void ZIPOfRecord2649() {
		assertEquals("95112", customers.get(2648).getZIP());
	}

	@Test
	@DisplayName("Record 2649: Phone is 408-998-2012")
	void PhoneOfRecord2649() {
		assertEquals("408-998-2012", customers.get(2648).getPhone());
	}

	@Test
	@DisplayName("Record 2649: Fax is 408-998-8738")
	void FaxOfRecord2649() {
		assertEquals("408-998-8738", customers.get(2648).getFax());
	}

	@Test
	@DisplayName("Record 2649: Email is cheri@hubble.com")
	void EmailOfRecord2649() {
		assertEquals("cheri@hubble.com", customers.get(2648).getEmail());
	}

	@Test
	@DisplayName("Record 2649: Web is http://www.cherihubble.com")
	void WebOfRecord2649() {
		assertEquals("http://www.cherihubble.com", customers.get(2648).getWeb());
	}
}
