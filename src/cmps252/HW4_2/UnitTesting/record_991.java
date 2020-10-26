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
class Record_991 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 991: FirstName is Doretha")
	void FirstNameOfRecord991() {
		assertEquals("Doretha", customers.get(990).getFirstName());
	}

	@Test
	@DisplayName("Record 991: LastName is Kauer")
	void LastNameOfRecord991() {
		assertEquals("Kauer", customers.get(990).getLastName());
	}

	@Test
	@DisplayName("Record 991: Company is Sandvik Inc")
	void CompanyOfRecord991() {
		assertEquals("Sandvik Inc", customers.get(990).getCompany());
	}

	@Test
	@DisplayName("Record 991: Address is 1714 John St")
	void AddressOfRecord991() {
		assertEquals("1714 John St", customers.get(990).getAddress());
	}

	@Test
	@DisplayName("Record 991: City is Cincinnati")
	void CityOfRecord991() {
		assertEquals("Cincinnati", customers.get(990).getCity());
	}

	@Test
	@DisplayName("Record 991: County is Hamilton")
	void CountyOfRecord991() {
		assertEquals("Hamilton", customers.get(990).getCounty());
	}

	@Test
	@DisplayName("Record 991: State is OH")
	void StateOfRecord991() {
		assertEquals("OH", customers.get(990).getState());
	}

	@Test
	@DisplayName("Record 991: ZIP is 45214")
	void ZIPOfRecord991() {
		assertEquals("45214", customers.get(990).getZIP());
	}

	@Test
	@DisplayName("Record 991: Phone is 513-241-3118")
	void PhoneOfRecord991() {
		assertEquals("513-241-3118", customers.get(990).getPhone());
	}

	@Test
	@DisplayName("Record 991: Fax is 513-241-5683")
	void FaxOfRecord991() {
		assertEquals("513-241-5683", customers.get(990).getFax());
	}

	@Test
	@DisplayName("Record 991: Email is doretha@kauer.com")
	void EmailOfRecord991() {
		assertEquals("doretha@kauer.com", customers.get(990).getEmail());
	}

	@Test
	@DisplayName("Record 991: Web is http://www.dorethakauer.com")
	void WebOfRecord991() {
		assertEquals("http://www.dorethakauer.com", customers.get(990).getWeb());
	}
}
