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

@Tag("18")
class Record_3593 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3593: FirstName is Maurine")
	void FirstNameOfRecord3593() {
		assertEquals("Maurine", customers.get(3592).getFirstName());
	}

	@Test
	@DisplayName("Record 3593: LastName is Desantis")
	void LastNameOfRecord3593() {
		assertEquals("Desantis", customers.get(3592).getLastName());
	}

	@Test
	@DisplayName("Record 3593: Company is Ksjl 96.1 Fm")
	void CompanyOfRecord3593() {
		assertEquals("Ksjl 96.1 Fm", customers.get(3592).getCompany());
	}

	@Test
	@DisplayName("Record 3593: Address is 12213 15th Ave")
	void AddressOfRecord3593() {
		assertEquals("12213 15th Ave", customers.get(3592).getAddress());
	}

	@Test
	@DisplayName("Record 3593: City is College Point")
	void CityOfRecord3593() {
		assertEquals("College Point", customers.get(3592).getCity());
	}

	@Test
	@DisplayName("Record 3593: County is Queens")
	void CountyOfRecord3593() {
		assertEquals("Queens", customers.get(3592).getCounty());
	}

	@Test
	@DisplayName("Record 3593: State is NY")
	void StateOfRecord3593() {
		assertEquals("NY", customers.get(3592).getState());
	}

	@Test
	@DisplayName("Record 3593: ZIP is 11356")
	void ZIPOfRecord3593() {
		assertEquals("11356", customers.get(3592).getZIP());
	}

	@Test
	@DisplayName("Record 3593: Phone is 718-358-5886")
	void PhoneOfRecord3593() {
		assertEquals("718-358-5886", customers.get(3592).getPhone());
	}

	@Test
	@DisplayName("Record 3593: Fax is 718-358-5738")
	void FaxOfRecord3593() {
		assertEquals("718-358-5738", customers.get(3592).getFax());
	}

	@Test
	@DisplayName("Record 3593: Email is maurine@desantis.com")
	void EmailOfRecord3593() {
		assertEquals("maurine@desantis.com", customers.get(3592).getEmail());
	}

	@Test
	@DisplayName("Record 3593: Web is http://www.maurinedesantis.com")
	void WebOfRecord3593() {
		assertEquals("http://www.maurinedesantis.com", customers.get(3592).getWeb());
	}
}
