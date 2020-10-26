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

@Tag("3")
class Record_388 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 388: FirstName is Maya")
	void FirstNameOfRecord388() {
		assertEquals("Maya", customers.get(387).getFirstName());
	}

	@Test
	@DisplayName("Record 388: LastName is Elridge")
	void LastNameOfRecord388() {
		assertEquals("Elridge", customers.get(387).getLastName());
	}

	@Test
	@DisplayName("Record 388: Company is Archibald, Barbara G Esq")
	void CompanyOfRecord388() {
		assertEquals("Archibald, Barbara G Esq", customers.get(387).getCompany());
	}

	@Test
	@DisplayName("Record 388: Address is 220 Willow St")
	void AddressOfRecord388() {
		assertEquals("220 Willow St", customers.get(387).getAddress());
	}

	@Test
	@DisplayName("Record 388: City is North Little Rock")
	void CityOfRecord388() {
		assertEquals("North Little Rock", customers.get(387).getCity());
	}

	@Test
	@DisplayName("Record 388: County is Pulaski")
	void CountyOfRecord388() {
		assertEquals("Pulaski", customers.get(387).getCounty());
	}

	@Test
	@DisplayName("Record 388: State is AR")
	void StateOfRecord388() {
		assertEquals("AR", customers.get(387).getState());
	}

	@Test
	@DisplayName("Record 388: ZIP is 72114")
	void ZIPOfRecord388() {
		assertEquals("72114", customers.get(387).getZIP());
	}

	@Test
	@DisplayName("Record 388: Phone is 501-372-2968")
	void PhoneOfRecord388() {
		assertEquals("501-372-2968", customers.get(387).getPhone());
	}

	@Test
	@DisplayName("Record 388: Fax is 501-372-0282")
	void FaxOfRecord388() {
		assertEquals("501-372-0282", customers.get(387).getFax());
	}

	@Test
	@DisplayName("Record 388: Email is maya@elridge.com")
	void EmailOfRecord388() {
		assertEquals("maya@elridge.com", customers.get(387).getEmail());
	}

	@Test
	@DisplayName("Record 388: Web is http://www.mayaelridge.com")
	void WebOfRecord388() {
		assertEquals("http://www.mayaelridge.com", customers.get(387).getWeb());
	}
}
