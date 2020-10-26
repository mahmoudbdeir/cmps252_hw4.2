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

@Tag("2")
class Record_699 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 699: FirstName is Rebecca")
	void FirstNameOfRecord699() {
		assertEquals("Rebecca", customers.get(698).getFirstName());
	}

	@Test
	@DisplayName("Record 699: LastName is Imada")
	void LastNameOfRecord699() {
		assertEquals("Imada", customers.get(698).getLastName());
	}

	@Test
	@DisplayName("Record 699: Company is Torp, Frederick H Esq")
	void CompanyOfRecord699() {
		assertEquals("Torp, Frederick H Esq", customers.get(698).getCompany());
	}

	@Test
	@DisplayName("Record 699: Address is 3320 S Cobb Dr")
	void AddressOfRecord699() {
		assertEquals("3320 S Cobb Dr", customers.get(698).getAddress());
	}

	@Test
	@DisplayName("Record 699: City is Smyrna")
	void CityOfRecord699() {
		assertEquals("Smyrna", customers.get(698).getCity());
	}

	@Test
	@DisplayName("Record 699: County is Cobb")
	void CountyOfRecord699() {
		assertEquals("Cobb", customers.get(698).getCounty());
	}

	@Test
	@DisplayName("Record 699: State is GA")
	void StateOfRecord699() {
		assertEquals("GA", customers.get(698).getState());
	}

	@Test
	@DisplayName("Record 699: ZIP is 30080")
	void ZIPOfRecord699() {
		assertEquals("30080", customers.get(698).getZIP());
	}

	@Test
	@DisplayName("Record 699: Phone is 770-436-5620")
	void PhoneOfRecord699() {
		assertEquals("770-436-5620", customers.get(698).getPhone());
	}

	@Test
	@DisplayName("Record 699: Fax is 770-436-1972")
	void FaxOfRecord699() {
		assertEquals("770-436-1972", customers.get(698).getFax());
	}

	@Test
	@DisplayName("Record 699: Email is rebecca@imada.com")
	void EmailOfRecord699() {
		assertEquals("rebecca@imada.com", customers.get(698).getEmail());
	}

	@Test
	@DisplayName("Record 699: Web is http://www.rebeccaimada.com")
	void WebOfRecord699() {
		assertEquals("http://www.rebeccaimada.com", customers.get(698).getWeb());
	}
}
