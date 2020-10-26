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

@Tag("19")
class Record_882 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 882: FirstName is Charla")
	void FirstNameOfRecord882() {
		assertEquals("Charla", customers.get(881).getFirstName());
	}

	@Test
	@DisplayName("Record 882: LastName is Beren")
	void LastNameOfRecord882() {
		assertEquals("Beren", customers.get(881).getLastName());
	}

	@Test
	@DisplayName("Record 882: Company is Nutrena Feeds")
	void CompanyOfRecord882() {
		assertEquals("Nutrena Feeds", customers.get(881).getCompany());
	}

	@Test
	@DisplayName("Record 882: Address is 601 Airport Blvd")
	void AddressOfRecord882() {
		assertEquals("601 Airport Blvd", customers.get(881).getAddress());
	}

	@Test
	@DisplayName("Record 882: City is South San Francisco")
	void CityOfRecord882() {
		assertEquals("South San Francisco", customers.get(881).getCity());
	}

	@Test
	@DisplayName("Record 882: County is San Mateo")
	void CountyOfRecord882() {
		assertEquals("San Mateo", customers.get(881).getCounty());
	}

	@Test
	@DisplayName("Record 882: State is CA")
	void StateOfRecord882() {
		assertEquals("CA", customers.get(881).getState());
	}

	@Test
	@DisplayName("Record 882: ZIP is 94080")
	void ZIPOfRecord882() {
		assertEquals("94080", customers.get(881).getZIP());
	}

	@Test
	@DisplayName("Record 882: Phone is 650-588-9021")
	void PhoneOfRecord882() {
		assertEquals("650-588-9021", customers.get(881).getPhone());
	}

	@Test
	@DisplayName("Record 882: Fax is 650-588-1559")
	void FaxOfRecord882() {
		assertEquals("650-588-1559", customers.get(881).getFax());
	}

	@Test
	@DisplayName("Record 882: Email is charla@beren.com")
	void EmailOfRecord882() {
		assertEquals("charla@beren.com", customers.get(881).getEmail());
	}

	@Test
	@DisplayName("Record 882: Web is http://www.charlaberen.com")
	void WebOfRecord882() {
		assertEquals("http://www.charlaberen.com", customers.get(881).getWeb());
	}
}
