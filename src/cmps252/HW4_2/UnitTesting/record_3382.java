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

@Tag("36")
class Record_3382 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3382: FirstName is Coleen")
	void FirstNameOfRecord3382() {
		assertEquals("Coleen", customers.get(3381).getFirstName());
	}

	@Test
	@DisplayName("Record 3382: LastName is Bockelmann")
	void LastNameOfRecord3382() {
		assertEquals("Bockelmann", customers.get(3381).getLastName());
	}

	@Test
	@DisplayName("Record 3382: Company is Filter Express Hvac")
	void CompanyOfRecord3382() {
		assertEquals("Filter Express Hvac", customers.get(3381).getCompany());
	}

	@Test
	@DisplayName("Record 3382: Address is 407 Irving St")
	void AddressOfRecord3382() {
		assertEquals("407 Irving St", customers.get(3381).getAddress());
	}

	@Test
	@DisplayName("Record 3382: City is Olean")
	void CityOfRecord3382() {
		assertEquals("Olean", customers.get(3381).getCity());
	}

	@Test
	@DisplayName("Record 3382: County is Cattaraugus")
	void CountyOfRecord3382() {
		assertEquals("Cattaraugus", customers.get(3381).getCounty());
	}

	@Test
	@DisplayName("Record 3382: State is NY")
	void StateOfRecord3382() {
		assertEquals("NY", customers.get(3381).getState());
	}

	@Test
	@DisplayName("Record 3382: ZIP is 14760")
	void ZIPOfRecord3382() {
		assertEquals("14760", customers.get(3381).getZIP());
	}

	@Test
	@DisplayName("Record 3382: Phone is 716-372-6240")
	void PhoneOfRecord3382() {
		assertEquals("716-372-6240", customers.get(3381).getPhone());
	}

	@Test
	@DisplayName("Record 3382: Fax is 716-372-4622")
	void FaxOfRecord3382() {
		assertEquals("716-372-4622", customers.get(3381).getFax());
	}

	@Test
	@DisplayName("Record 3382: Email is coleen@bockelmann.com")
	void EmailOfRecord3382() {
		assertEquals("coleen@bockelmann.com", customers.get(3381).getEmail());
	}

	@Test
	@DisplayName("Record 3382: Web is http://www.coleenbockelmann.com")
	void WebOfRecord3382() {
		assertEquals("http://www.coleenbockelmann.com", customers.get(3381).getWeb());
	}
}
