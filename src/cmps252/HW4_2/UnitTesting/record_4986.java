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

@Tag("38")
class Record_4986 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4986: FirstName is Carter")
	void FirstNameOfRecord4986() {
		assertEquals("Carter", customers.get(4985).getFirstName());
	}

	@Test
	@DisplayName("Record 4986: LastName is Ratulowski")
	void LastNameOfRecord4986() {
		assertEquals("Ratulowski", customers.get(4985).getLastName());
	}

	@Test
	@DisplayName("Record 4986: Company is Northwest Baltimore Corp")
	void CompanyOfRecord4986() {
		assertEquals("Northwest Baltimore Corp", customers.get(4985).getCompany());
	}

	@Test
	@DisplayName("Record 4986: Address is 3249 E Ridgeview St")
	void AddressOfRecord4986() {
		assertEquals("3249 E Ridgeview St", customers.get(4985).getAddress());
	}

	@Test
	@DisplayName("Record 4986: City is Springfield")
	void CityOfRecord4986() {
		assertEquals("Springfield", customers.get(4985).getCity());
	}

	@Test
	@DisplayName("Record 4986: County is Greene")
	void CountyOfRecord4986() {
		assertEquals("Greene", customers.get(4985).getCounty());
	}

	@Test
	@DisplayName("Record 4986: State is MO")
	void StateOfRecord4986() {
		assertEquals("MO", customers.get(4985).getState());
	}

	@Test
	@DisplayName("Record 4986: ZIP is 65804")
	void ZIPOfRecord4986() {
		assertEquals("65804", customers.get(4985).getZIP());
	}

	@Test
	@DisplayName("Record 4986: Phone is 417-887-7433")
	void PhoneOfRecord4986() {
		assertEquals("417-887-7433", customers.get(4985).getPhone());
	}

	@Test
	@DisplayName("Record 4986: Fax is 417-887-6354")
	void FaxOfRecord4986() {
		assertEquals("417-887-6354", customers.get(4985).getFax());
	}

	@Test
	@DisplayName("Record 4986: Email is carter@ratulowski.com")
	void EmailOfRecord4986() {
		assertEquals("carter@ratulowski.com", customers.get(4985).getEmail());
	}

	@Test
	@DisplayName("Record 4986: Web is http://www.carterratulowski.com")
	void WebOfRecord4986() {
		assertEquals("http://www.carterratulowski.com", customers.get(4985).getWeb());
	}
}
