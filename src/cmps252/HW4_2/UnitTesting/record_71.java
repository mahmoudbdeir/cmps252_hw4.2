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

@Tag("45")
class Record_71 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 71: FirstName is Jarrett")
	void FirstNameOfRecord71() {
		assertEquals("Jarrett", customers.get(70).getFirstName());
	}

	@Test
	@DisplayName("Record 71: LastName is Pfister")
	void LastNameOfRecord71() {
		assertEquals("Pfister", customers.get(70).getLastName());
	}

	@Test
	@DisplayName("Record 71: Company is Holden & Hahn")
	void CompanyOfRecord71() {
		assertEquals("Holden & Hahn", customers.get(70).getCompany());
	}

	@Test
	@DisplayName("Record 71: Address is 3101 Texas Ave")
	void AddressOfRecord71() {
		assertEquals("3101 Texas Ave", customers.get(70).getAddress());
	}

	@Test
	@DisplayName("Record 71: City is La Marque")
	void CityOfRecord71() {
		assertEquals("La Marque", customers.get(70).getCity());
	}

	@Test
	@DisplayName("Record 71: County is Galveston")
	void CountyOfRecord71() {
		assertEquals("Galveston", customers.get(70).getCounty());
	}

	@Test
	@DisplayName("Record 71: State is TX")
	void StateOfRecord71() {
		assertEquals("TX", customers.get(70).getState());
	}

	@Test
	@DisplayName("Record 71: ZIP is 77568")
	void ZIPOfRecord71() {
		assertEquals("77568", customers.get(70).getZIP());
	}

	@Test
	@DisplayName("Record 71: Phone is 409-938-7841")
	void PhoneOfRecord71() {
		assertEquals("409-938-7841", customers.get(70).getPhone());
	}

	@Test
	@DisplayName("Record 71: Fax is 409-938-1499")
	void FaxOfRecord71() {
		assertEquals("409-938-1499", customers.get(70).getFax());
	}

	@Test
	@DisplayName("Record 71: Email is jarrett@pfister.com")
	void EmailOfRecord71() {
		assertEquals("jarrett@pfister.com", customers.get(70).getEmail());
	}

	@Test
	@DisplayName("Record 71: Web is http://www.jarrettpfister.com")
	void WebOfRecord71() {
		assertEquals("http://www.jarrettpfister.com", customers.get(70).getWeb());
	}
}
