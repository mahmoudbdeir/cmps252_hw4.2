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

@Tag("42")
class Record_932 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 932: FirstName is Walker")
	void FirstNameOfRecord932() {
		assertEquals("Walker", customers.get(931).getFirstName());
	}

	@Test
	@DisplayName("Record 932: LastName is Styons")
	void LastNameOfRecord932() {
		assertEquals("Styons", customers.get(931).getLastName());
	}

	@Test
	@DisplayName("Record 932: Company is Riley Haddad And Lombardi")
	void CompanyOfRecord932() {
		assertEquals("Riley Haddad And Lombardi", customers.get(931).getCompany());
	}

	@Test
	@DisplayName("Record 932: Address is 4853 Cordell Ave")
	void AddressOfRecord932() {
		assertEquals("4853 Cordell Ave", customers.get(931).getAddress());
	}

	@Test
	@DisplayName("Record 932: City is Bethesda")
	void CityOfRecord932() {
		assertEquals("Bethesda", customers.get(931).getCity());
	}

	@Test
	@DisplayName("Record 932: County is Montgomery")
	void CountyOfRecord932() {
		assertEquals("Montgomery", customers.get(931).getCounty());
	}

	@Test
	@DisplayName("Record 932: State is MD")
	void StateOfRecord932() {
		assertEquals("MD", customers.get(931).getState());
	}

	@Test
	@DisplayName("Record 932: ZIP is 20814")
	void ZIPOfRecord932() {
		assertEquals("20814", customers.get(931).getZIP());
	}

	@Test
	@DisplayName("Record 932: Phone is 301-951-5805")
	void PhoneOfRecord932() {
		assertEquals("301-951-5805", customers.get(931).getPhone());
	}

	@Test
	@DisplayName("Record 932: Fax is 301-951-1394")
	void FaxOfRecord932() {
		assertEquals("301-951-1394", customers.get(931).getFax());
	}

	@Test
	@DisplayName("Record 932: Email is walker@styons.com")
	void EmailOfRecord932() {
		assertEquals("walker@styons.com", customers.get(931).getEmail());
	}

	@Test
	@DisplayName("Record 932: Web is http://www.walkerstyons.com")
	void WebOfRecord932() {
		assertEquals("http://www.walkerstyons.com", customers.get(931).getWeb());
	}
}
