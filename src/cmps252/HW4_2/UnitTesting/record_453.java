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

@Tag("49")
class Record_453 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 453: FirstName is Trudy")
	void FirstNameOfRecord453() {
		assertEquals("Trudy", customers.get(452).getFirstName());
	}

	@Test
	@DisplayName("Record 453: LastName is Curit")
	void LastNameOfRecord453() {
		assertEquals("Curit", customers.get(452).getLastName());
	}

	@Test
	@DisplayName("Record 453: Company is G F Office Furniture Ltd")
	void CompanyOfRecord453() {
		assertEquals("G F Office Furniture Ltd", customers.get(452).getCompany());
	}

	@Test
	@DisplayName("Record 453: Address is 326 Elm St")
	void AddressOfRecord453() {
		assertEquals("326 Elm St", customers.get(452).getAddress());
	}

	@Test
	@DisplayName("Record 453: City is Graham")
	void CityOfRecord453() {
		assertEquals("Graham", customers.get(452).getCity());
	}

	@Test
	@DisplayName("Record 453: County is Young")
	void CountyOfRecord453() {
		assertEquals("Young", customers.get(452).getCounty());
	}

	@Test
	@DisplayName("Record 453: State is TX")
	void StateOfRecord453() {
		assertEquals("TX", customers.get(452).getState());
	}

	@Test
	@DisplayName("Record 453: ZIP is 76450")
	void ZIPOfRecord453() {
		assertEquals("76450", customers.get(452).getZIP());
	}

	@Test
	@DisplayName("Record 453: Phone is 940-549-6436")
	void PhoneOfRecord453() {
		assertEquals("940-549-6436", customers.get(452).getPhone());
	}

	@Test
	@DisplayName("Record 453: Fax is 940-549-0317")
	void FaxOfRecord453() {
		assertEquals("940-549-0317", customers.get(452).getFax());
	}

	@Test
	@DisplayName("Record 453: Email is trudy@curit.com")
	void EmailOfRecord453() {
		assertEquals("trudy@curit.com", customers.get(452).getEmail());
	}

	@Test
	@DisplayName("Record 453: Web is http://www.trudycurit.com")
	void WebOfRecord453() {
		assertEquals("http://www.trudycurit.com", customers.get(452).getWeb());
	}
}
