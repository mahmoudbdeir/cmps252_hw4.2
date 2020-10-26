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

@Tag("31")
class Record_1196 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1196: FirstName is Helene")
	void FirstNameOfRecord1196() {
		assertEquals("Helene", customers.get(1195).getFirstName());
	}

	@Test
	@DisplayName("Record 1196: LastName is Fuhrmyster")
	void LastNameOfRecord1196() {
		assertEquals("Fuhrmyster", customers.get(1195).getLastName());
	}

	@Test
	@DisplayName("Record 1196: Company is Jack Bassoff Inc")
	void CompanyOfRecord1196() {
		assertEquals("Jack Bassoff Inc", customers.get(1195).getCompany());
	}

	@Test
	@DisplayName("Record 1196: Address is 6789 Main St")
	void AddressOfRecord1196() {
		assertEquals("6789 Main St", customers.get(1195).getAddress());
	}

	@Test
	@DisplayName("Record 1196: City is Buffalo")
	void CityOfRecord1196() {
		assertEquals("Buffalo", customers.get(1195).getCity());
	}

	@Test
	@DisplayName("Record 1196: County is Erie")
	void CountyOfRecord1196() {
		assertEquals("Erie", customers.get(1195).getCounty());
	}

	@Test
	@DisplayName("Record 1196: State is NY")
	void StateOfRecord1196() {
		assertEquals("NY", customers.get(1195).getState());
	}

	@Test
	@DisplayName("Record 1196: ZIP is 14221")
	void ZIPOfRecord1196() {
		assertEquals("14221", customers.get(1195).getZIP());
	}

	@Test
	@DisplayName("Record 1196: Phone is 716-626-7155")
	void PhoneOfRecord1196() {
		assertEquals("716-626-7155", customers.get(1195).getPhone());
	}

	@Test
	@DisplayName("Record 1196: Fax is 716-626-4978")
	void FaxOfRecord1196() {
		assertEquals("716-626-4978", customers.get(1195).getFax());
	}

	@Test
	@DisplayName("Record 1196: Email is helene@fuhrmyster.com")
	void EmailOfRecord1196() {
		assertEquals("helene@fuhrmyster.com", customers.get(1195).getEmail());
	}

	@Test
	@DisplayName("Record 1196: Web is http://www.helenefuhrmyster.com")
	void WebOfRecord1196() {
		assertEquals("http://www.helenefuhrmyster.com", customers.get(1195).getWeb());
	}
}
