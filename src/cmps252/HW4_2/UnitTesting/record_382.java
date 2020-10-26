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
class Record_382 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 382: FirstName is Doris")
	void FirstNameOfRecord382() {
		assertEquals("Doris", customers.get(381).getFirstName());
	}

	@Test
	@DisplayName("Record 382: LastName is Drilling")
	void LastNameOfRecord382() {
		assertEquals("Drilling", customers.get(381).getLastName());
	}

	@Test
	@DisplayName("Record 382: Company is Larkin Industries Inc")
	void CompanyOfRecord382() {
		assertEquals("Larkin Industries Inc", customers.get(381).getCompany());
	}

	@Test
	@DisplayName("Record 382: Address is 13288 E Main St")
	void AddressOfRecord382() {
		assertEquals("13288 E Main St", customers.get(381).getAddress());
	}

	@Test
	@DisplayName("Record 382: City is Larose")
	void CityOfRecord382() {
		assertEquals("Larose", customers.get(381).getCity());
	}

	@Test
	@DisplayName("Record 382: County is Lafourche")
	void CountyOfRecord382() {
		assertEquals("Lafourche", customers.get(381).getCounty());
	}

	@Test
	@DisplayName("Record 382: State is LA")
	void StateOfRecord382() {
		assertEquals("LA", customers.get(381).getState());
	}

	@Test
	@DisplayName("Record 382: ZIP is 70373")
	void ZIPOfRecord382() {
		assertEquals("70373", customers.get(381).getZIP());
	}

	@Test
	@DisplayName("Record 382: Phone is 985-693-4894")
	void PhoneOfRecord382() {
		assertEquals("985-693-4894", customers.get(381).getPhone());
	}

	@Test
	@DisplayName("Record 382: Fax is 985-693-8608")
	void FaxOfRecord382() {
		assertEquals("985-693-8608", customers.get(381).getFax());
	}

	@Test
	@DisplayName("Record 382: Email is doris@drilling.com")
	void EmailOfRecord382() {
		assertEquals("doris@drilling.com", customers.get(381).getEmail());
	}

	@Test
	@DisplayName("Record 382: Web is http://www.dorisdrilling.com")
	void WebOfRecord382() {
		assertEquals("http://www.dorisdrilling.com", customers.get(381).getWeb());
	}
}
