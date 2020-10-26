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

@Tag("37")
class Record_1233 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1233: FirstName is Luke")
	void FirstNameOfRecord1233() {
		assertEquals("Luke", customers.get(1232).getFirstName());
	}

	@Test
	@DisplayName("Record 1233: LastName is Zeagler")
	void LastNameOfRecord1233() {
		assertEquals("Zeagler", customers.get(1232).getLastName());
	}

	@Test
	@DisplayName("Record 1233: Company is Clendening, Rebecca T Esq")
	void CompanyOfRecord1233() {
		assertEquals("Clendening, Rebecca T Esq", customers.get(1232).getCompany());
	}

	@Test
	@DisplayName("Record 1233: Address is 1200 Conn Valley Rd")
	void AddressOfRecord1233() {
		assertEquals("1200 Conn Valley Rd", customers.get(1232).getAddress());
	}

	@Test
	@DisplayName("Record 1233: City is Saint Helena")
	void CityOfRecord1233() {
		assertEquals("Saint Helena", customers.get(1232).getCity());
	}

	@Test
	@DisplayName("Record 1233: County is Napa")
	void CountyOfRecord1233() {
		assertEquals("Napa", customers.get(1232).getCounty());
	}

	@Test
	@DisplayName("Record 1233: State is CA")
	void StateOfRecord1233() {
		assertEquals("CA", customers.get(1232).getState());
	}

	@Test
	@DisplayName("Record 1233: ZIP is 94574")
	void ZIPOfRecord1233() {
		assertEquals("94574", customers.get(1232).getZIP());
	}

	@Test
	@DisplayName("Record 1233: Phone is 707-963-3961")
	void PhoneOfRecord1233() {
		assertEquals("707-963-3961", customers.get(1232).getPhone());
	}

	@Test
	@DisplayName("Record 1233: Fax is 707-963-9712")
	void FaxOfRecord1233() {
		assertEquals("707-963-9712", customers.get(1232).getFax());
	}

	@Test
	@DisplayName("Record 1233: Email is luke@zeagler.com")
	void EmailOfRecord1233() {
		assertEquals("luke@zeagler.com", customers.get(1232).getEmail());
	}

	@Test
	@DisplayName("Record 1233: Web is http://www.lukezeagler.com")
	void WebOfRecord1233() {
		assertEquals("http://www.lukezeagler.com", customers.get(1232).getWeb());
	}
}
