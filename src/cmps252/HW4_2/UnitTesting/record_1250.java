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

@Tag("35")
class Record_1250 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1250: FirstName is Amy")
	void FirstNameOfRecord1250() {
		assertEquals("Amy", customers.get(1249).getFirstName());
	}

	@Test
	@DisplayName("Record 1250: LastName is Kudzma")
	void LastNameOfRecord1250() {
		assertEquals("Kudzma", customers.get(1249).getLastName());
	}

	@Test
	@DisplayName("Record 1250: Company is Law Magazine")
	void CompanyOfRecord1250() {
		assertEquals("Law Magazine", customers.get(1249).getCompany());
	}

	@Test
	@DisplayName("Record 1250: Address is 596 Carroll St")
	void AddressOfRecord1250() {
		assertEquals("596 Carroll St", customers.get(1249).getAddress());
	}

	@Test
	@DisplayName("Record 1250: City is Sunnyvale")
	void CityOfRecord1250() {
		assertEquals("Sunnyvale", customers.get(1249).getCity());
	}

	@Test
	@DisplayName("Record 1250: County is Santa Clara")
	void CountyOfRecord1250() {
		assertEquals("Santa Clara", customers.get(1249).getCounty());
	}

	@Test
	@DisplayName("Record 1250: State is CA")
	void StateOfRecord1250() {
		assertEquals("CA", customers.get(1249).getState());
	}

	@Test
	@DisplayName("Record 1250: ZIP is 94086")
	void ZIPOfRecord1250() {
		assertEquals("94086", customers.get(1249).getZIP());
	}

	@Test
	@DisplayName("Record 1250: Phone is 408-730-1950")
	void PhoneOfRecord1250() {
		assertEquals("408-730-1950", customers.get(1249).getPhone());
	}

	@Test
	@DisplayName("Record 1250: Fax is 408-730-7355")
	void FaxOfRecord1250() {
		assertEquals("408-730-7355", customers.get(1249).getFax());
	}

	@Test
	@DisplayName("Record 1250: Email is amy@kudzma.com")
	void EmailOfRecord1250() {
		assertEquals("amy@kudzma.com", customers.get(1249).getEmail());
	}

	@Test
	@DisplayName("Record 1250: Web is http://www.amykudzma.com")
	void WebOfRecord1250() {
		assertEquals("http://www.amykudzma.com", customers.get(1249).getWeb());
	}
}
