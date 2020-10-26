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

@Tag("8")
class Record_1973 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1973: FirstName is Danny")
	void FirstNameOfRecord1973() {
		assertEquals("Danny", customers.get(1972).getFirstName());
	}

	@Test
	@DisplayName("Record 1973: LastName is Spirito")
	void LastNameOfRecord1973() {
		assertEquals("Spirito", customers.get(1972).getLastName());
	}

	@Test
	@DisplayName("Record 1973: Company is Schlienger, Kent L Esq")
	void CompanyOfRecord1973() {
		assertEquals("Schlienger, Kent L Esq", customers.get(1972).getCompany());
	}

	@Test
	@DisplayName("Record 1973: Address is 1090 Vermont Ave Nw")
	void AddressOfRecord1973() {
		assertEquals("1090 Vermont Ave Nw", customers.get(1972).getAddress());
	}

	@Test
	@DisplayName("Record 1973: City is Washington")
	void CityOfRecord1973() {
		assertEquals("Washington", customers.get(1972).getCity());
	}

	@Test
	@DisplayName("Record 1973: County is District of Columbia")
	void CountyOfRecord1973() {
		assertEquals("District of Columbia", customers.get(1972).getCounty());
	}

	@Test
	@DisplayName("Record 1973: State is DC")
	void StateOfRecord1973() {
		assertEquals("DC", customers.get(1972).getState());
	}

	@Test
	@DisplayName("Record 1973: ZIP is 20005")
	void ZIPOfRecord1973() {
		assertEquals("20005", customers.get(1972).getZIP());
	}

	@Test
	@DisplayName("Record 1973: Phone is 202-333-9892")
	void PhoneOfRecord1973() {
		assertEquals("202-333-9892", customers.get(1972).getPhone());
	}

	@Test
	@DisplayName("Record 1973: Fax is 202-333-8732")
	void FaxOfRecord1973() {
		assertEquals("202-333-8732", customers.get(1972).getFax());
	}

	@Test
	@DisplayName("Record 1973: Email is danny@spirito.com")
	void EmailOfRecord1973() {
		assertEquals("danny@spirito.com", customers.get(1972).getEmail());
	}

	@Test
	@DisplayName("Record 1973: Web is http://www.dannyspirito.com")
	void WebOfRecord1973() {
		assertEquals("http://www.dannyspirito.com", customers.get(1972).getWeb());
	}
}
