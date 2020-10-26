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

@Tag("33")
class Record_4832 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4832: FirstName is Edmond")
	void FirstNameOfRecord4832() {
		assertEquals("Edmond", customers.get(4831).getFirstName());
	}

	@Test
	@DisplayName("Record 4832: LastName is Kothakota")
	void LastNameOfRecord4832() {
		assertEquals("Kothakota", customers.get(4831).getLastName());
	}

	@Test
	@DisplayName("Record 4832: Company is Hammonton Animal Hospital")
	void CompanyOfRecord4832() {
		assertEquals("Hammonton Animal Hospital", customers.get(4831).getCompany());
	}

	@Test
	@DisplayName("Record 4832: Address is 2201 Route 38")
	void AddressOfRecord4832() {
		assertEquals("2201 Route 38", customers.get(4831).getAddress());
	}

	@Test
	@DisplayName("Record 4832: City is Cherry Hill")
	void CityOfRecord4832() {
		assertEquals("Cherry Hill", customers.get(4831).getCity());
	}

	@Test
	@DisplayName("Record 4832: County is Camden")
	void CountyOfRecord4832() {
		assertEquals("Camden", customers.get(4831).getCounty());
	}

	@Test
	@DisplayName("Record 4832: State is NJ")
	void StateOfRecord4832() {
		assertEquals("NJ", customers.get(4831).getState());
	}

	@Test
	@DisplayName("Record 4832: ZIP is 8002")
	void ZIPOfRecord4832() {
		assertEquals("8002", customers.get(4831).getZIP());
	}

	@Test
	@DisplayName("Record 4832: Phone is 856-321-0412")
	void PhoneOfRecord4832() {
		assertEquals("856-321-0412", customers.get(4831).getPhone());
	}

	@Test
	@DisplayName("Record 4832: Fax is 856-321-5565")
	void FaxOfRecord4832() {
		assertEquals("856-321-5565", customers.get(4831).getFax());
	}

	@Test
	@DisplayName("Record 4832: Email is edmond@kothakota.com")
	void EmailOfRecord4832() {
		assertEquals("edmond@kothakota.com", customers.get(4831).getEmail());
	}

	@Test
	@DisplayName("Record 4832: Web is http://www.edmondkothakota.com")
	void WebOfRecord4832() {
		assertEquals("http://www.edmondkothakota.com", customers.get(4831).getWeb());
	}
}
