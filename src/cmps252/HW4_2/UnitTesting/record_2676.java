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

@Tag("40")
class Record_2676 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2676: FirstName is Gracie")
	void FirstNameOfRecord2676() {
		assertEquals("Gracie", customers.get(2675).getFirstName());
	}

	@Test
	@DisplayName("Record 2676: LastName is Clattenburg")
	void LastNameOfRecord2676() {
		assertEquals("Clattenburg", customers.get(2675).getLastName());
	}

	@Test
	@DisplayName("Record 2676: Company is Sidran Inc")
	void CompanyOfRecord2676() {
		assertEquals("Sidran Inc", customers.get(2675).getCompany());
	}

	@Test
	@DisplayName("Record 2676: Address is 2008 Victory Blvd")
	void AddressOfRecord2676() {
		assertEquals("2008 Victory Blvd", customers.get(2675).getAddress());
	}

	@Test
	@DisplayName("Record 2676: City is Staten Island")
	void CityOfRecord2676() {
		assertEquals("Staten Island", customers.get(2675).getCity());
	}

	@Test
	@DisplayName("Record 2676: County is Richmond")
	void CountyOfRecord2676() {
		assertEquals("Richmond", customers.get(2675).getCounty());
	}

	@Test
	@DisplayName("Record 2676: State is NY")
	void StateOfRecord2676() {
		assertEquals("NY", customers.get(2675).getState());
	}

	@Test
	@DisplayName("Record 2676: ZIP is 10314")
	void ZIPOfRecord2676() {
		assertEquals("10314", customers.get(2675).getZIP());
	}

	@Test
	@DisplayName("Record 2676: Phone is 718-876-6075")
	void PhoneOfRecord2676() {
		assertEquals("718-876-6075", customers.get(2675).getPhone());
	}

	@Test
	@DisplayName("Record 2676: Fax is 718-876-2067")
	void FaxOfRecord2676() {
		assertEquals("718-876-2067", customers.get(2675).getFax());
	}

	@Test
	@DisplayName("Record 2676: Email is gracie@clattenburg.com")
	void EmailOfRecord2676() {
		assertEquals("gracie@clattenburg.com", customers.get(2675).getEmail());
	}

	@Test
	@DisplayName("Record 2676: Web is http://www.gracieclattenburg.com")
	void WebOfRecord2676() {
		assertEquals("http://www.gracieclattenburg.com", customers.get(2675).getWeb());
	}
}
