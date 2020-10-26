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
class Record_3620 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3620: FirstName is Ione")
	void FirstNameOfRecord3620() {
		assertEquals("Ione", customers.get(3619).getFirstName());
	}

	@Test
	@DisplayName("Record 3620: LastName is Rotando")
	void LastNameOfRecord3620() {
		assertEquals("Rotando", customers.get(3619).getLastName());
	}

	@Test
	@DisplayName("Record 3620: Company is Aby, Sally M Esq")
	void CompanyOfRecord3620() {
		assertEquals("Aby, Sally M Esq", customers.get(3619).getCompany());
	}

	@Test
	@DisplayName("Record 3620: Address is 2085 W Lewis Pl")
	void AddressOfRecord3620() {
		assertEquals("2085 W Lewis Pl", customers.get(3619).getAddress());
	}

	@Test
	@DisplayName("Record 3620: City is Edinburgh")
	void CityOfRecord3620() {
		assertEquals("Edinburgh", customers.get(3619).getCity());
	}

	@Test
	@DisplayName("Record 3620: County is Johnson")
	void CountyOfRecord3620() {
		assertEquals("Johnson", customers.get(3619).getCounty());
	}

	@Test
	@DisplayName("Record 3620: State is IN")
	void StateOfRecord3620() {
		assertEquals("IN", customers.get(3619).getState());
	}

	@Test
	@DisplayName("Record 3620: ZIP is 46124")
	void ZIPOfRecord3620() {
		assertEquals("46124", customers.get(3619).getZIP());
	}

	@Test
	@DisplayName("Record 3620: Phone is 812-526-8294")
	void PhoneOfRecord3620() {
		assertEquals("812-526-8294", customers.get(3619).getPhone());
	}

	@Test
	@DisplayName("Record 3620: Fax is 812-526-8098")
	void FaxOfRecord3620() {
		assertEquals("812-526-8098", customers.get(3619).getFax());
	}

	@Test
	@DisplayName("Record 3620: Email is ione@rotando.com")
	void EmailOfRecord3620() {
		assertEquals("ione@rotando.com", customers.get(3619).getEmail());
	}

	@Test
	@DisplayName("Record 3620: Web is http://www.ionerotando.com")
	void WebOfRecord3620() {
		assertEquals("http://www.ionerotando.com", customers.get(3619).getWeb());
	}
}
