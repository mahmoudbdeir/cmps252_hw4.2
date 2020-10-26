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

@Tag("9")
class Record_2210 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2210: FirstName is Jonathon")
	void FirstNameOfRecord2210() {
		assertEquals("Jonathon", customers.get(2209).getFirstName());
	}

	@Test
	@DisplayName("Record 2210: LastName is Klohs")
	void LastNameOfRecord2210() {
		assertEquals("Klohs", customers.get(2209).getLastName());
	}

	@Test
	@DisplayName("Record 2210: Company is Avant Garde Limousine")
	void CompanyOfRecord2210() {
		assertEquals("Avant Garde Limousine", customers.get(2209).getCompany());
	}

	@Test
	@DisplayName("Record 2210: Address is 5301 E Washington St")
	void AddressOfRecord2210() {
		assertEquals("5301 E Washington St", customers.get(2209).getAddress());
	}

	@Test
	@DisplayName("Record 2210: City is Phoenix")
	void CityOfRecord2210() {
		assertEquals("Phoenix", customers.get(2209).getCity());
	}

	@Test
	@DisplayName("Record 2210: County is Maricopa")
	void CountyOfRecord2210() {
		assertEquals("Maricopa", customers.get(2209).getCounty());
	}

	@Test
	@DisplayName("Record 2210: State is AZ")
	void StateOfRecord2210() {
		assertEquals("AZ", customers.get(2209).getState());
	}

	@Test
	@DisplayName("Record 2210: ZIP is 85034")
	void ZIPOfRecord2210() {
		assertEquals("85034", customers.get(2209).getZIP());
	}

	@Test
	@DisplayName("Record 2210: Phone is 602-220-3346")
	void PhoneOfRecord2210() {
		assertEquals("602-220-3346", customers.get(2209).getPhone());
	}

	@Test
	@DisplayName("Record 2210: Fax is 602-220-3309")
	void FaxOfRecord2210() {
		assertEquals("602-220-3309", customers.get(2209).getFax());
	}

	@Test
	@DisplayName("Record 2210: Email is jonathon@klohs.com")
	void EmailOfRecord2210() {
		assertEquals("jonathon@klohs.com", customers.get(2209).getEmail());
	}

	@Test
	@DisplayName("Record 2210: Web is http://www.jonathonklohs.com")
	void WebOfRecord2210() {
		assertEquals("http://www.jonathonklohs.com", customers.get(2209).getWeb());
	}
}
