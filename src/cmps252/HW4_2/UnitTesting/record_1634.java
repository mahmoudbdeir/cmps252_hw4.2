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
class Record_1634 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1634: FirstName is Christen")
	void FirstNameOfRecord1634() {
		assertEquals("Christen", customers.get(1633).getFirstName());
	}

	@Test
	@DisplayName("Record 1634: LastName is Pruse")
	void LastNameOfRecord1634() {
		assertEquals("Pruse", customers.get(1633).getLastName());
	}

	@Test
	@DisplayName("Record 1634: Company is Travel Network")
	void CompanyOfRecord1634() {
		assertEquals("Travel Network", customers.get(1633).getCompany());
	}

	@Test
	@DisplayName("Record 1634: Address is 1212 S Rainbow Blvd Bldg")
	void AddressOfRecord1634() {
		assertEquals("1212 S Rainbow Blvd Bldg", customers.get(1633).getAddress());
	}

	@Test
	@DisplayName("Record 1634: City is Las Vegas")
	void CityOfRecord1634() {
		assertEquals("Las Vegas", customers.get(1633).getCity());
	}

	@Test
	@DisplayName("Record 1634: County is Clark")
	void CountyOfRecord1634() {
		assertEquals("Clark", customers.get(1633).getCounty());
	}

	@Test
	@DisplayName("Record 1634: State is NV")
	void StateOfRecord1634() {
		assertEquals("NV", customers.get(1633).getState());
	}

	@Test
	@DisplayName("Record 1634: ZIP is 89102")
	void ZIPOfRecord1634() {
		assertEquals("89102", customers.get(1633).getZIP());
	}

	@Test
	@DisplayName("Record 1634: Phone is 702-870-5147")
	void PhoneOfRecord1634() {
		assertEquals("702-870-5147", customers.get(1633).getPhone());
	}

	@Test
	@DisplayName("Record 1634: Fax is 702-870-5466")
	void FaxOfRecord1634() {
		assertEquals("702-870-5466", customers.get(1633).getFax());
	}

	@Test
	@DisplayName("Record 1634: Email is christen@pruse.com")
	void EmailOfRecord1634() {
		assertEquals("christen@pruse.com", customers.get(1633).getEmail());
	}

	@Test
	@DisplayName("Record 1634: Web is http://www.christenpruse.com")
	void WebOfRecord1634() {
		assertEquals("http://www.christenpruse.com", customers.get(1633).getWeb());
	}
}
