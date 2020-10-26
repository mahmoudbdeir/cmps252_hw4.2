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

@Tag("29")
class Record_33 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 33: FirstName is Jamey")
	void FirstNameOfRecord33() {
		assertEquals("Jamey", customers.get(32).getFirstName());
	}

	@Test
	@DisplayName("Record 33: LastName is Cellar")
	void LastNameOfRecord33() {
		assertEquals("Cellar", customers.get(32).getLastName());
	}

	@Test
	@DisplayName("Record 33: Company is World Const & Parliament Assn")
	void CompanyOfRecord33() {
		assertEquals("World Const & Parliament Assn", customers.get(32).getCompany());
	}

	@Test
	@DisplayName("Record 33: Address is 701 W Garden St")
	void AddressOfRecord33() {
		assertEquals("701 W Garden St", customers.get(32).getAddress());
	}

	@Test
	@DisplayName("Record 33: City is Pensacola")
	void CityOfRecord33() {
		assertEquals("Pensacola", customers.get(32).getCity());
	}

	@Test
	@DisplayName("Record 33: County is Escambia")
	void CountyOfRecord33() {
		assertEquals("Escambia", customers.get(32).getCounty());
	}

	@Test
	@DisplayName("Record 33: State is FL")
	void StateOfRecord33() {
		assertEquals("FL", customers.get(32).getState());
	}

	@Test
	@DisplayName("Record 33: ZIP is 32501")
	void ZIPOfRecord33() {
		assertEquals("32501", customers.get(32).getZIP());
	}

	@Test
	@DisplayName("Record 33: Phone is 850-434-4388")
	void PhoneOfRecord33() {
		assertEquals("850-434-4388", customers.get(32).getPhone());
	}

	@Test
	@DisplayName("Record 33: Fax is 850-434-1766")
	void FaxOfRecord33() {
		assertEquals("850-434-1766", customers.get(32).getFax());
	}

	@Test
	@DisplayName("Record 33: Email is jamey@cellar.com")
	void EmailOfRecord33() {
		assertEquals("jamey@cellar.com", customers.get(32).getEmail());
	}

	@Test
	@DisplayName("Record 33: Web is http://www.jameycellar.com")
	void WebOfRecord33() {
		assertEquals("http://www.jameycellar.com", customers.get(32).getWeb());
	}
}
