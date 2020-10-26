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

@Tag("24")
class Record_3337 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3337: FirstName is Lina")
	void FirstNameOfRecord3337() {
		assertEquals("Lina", customers.get(3336).getFirstName());
	}

	@Test
	@DisplayName("Record 3337: LastName is Greeley")
	void LastNameOfRecord3337() {
		assertEquals("Greeley", customers.get(3336).getLastName());
	}

	@Test
	@DisplayName("Record 3337: Company is Trimbur Davis & Clark Pc")
	void CompanyOfRecord3337() {
		assertEquals("Trimbur Davis & Clark Pc", customers.get(3336).getCompany());
	}

	@Test
	@DisplayName("Record 3337: Address is 2002 Interstate 45 N")
	void AddressOfRecord3337() {
		assertEquals("2002 Interstate 45 N", customers.get(3336).getAddress());
	}

	@Test
	@DisplayName("Record 3337: City is Conroe")
	void CityOfRecord3337() {
		assertEquals("Conroe", customers.get(3336).getCity());
	}

	@Test
	@DisplayName("Record 3337: County is Montgomery")
	void CountyOfRecord3337() {
		assertEquals("Montgomery", customers.get(3336).getCounty());
	}

	@Test
	@DisplayName("Record 3337: State is TX")
	void StateOfRecord3337() {
		assertEquals("TX", customers.get(3336).getState());
	}

	@Test
	@DisplayName("Record 3337: ZIP is 77301")
	void ZIPOfRecord3337() {
		assertEquals("77301", customers.get(3336).getZIP());
	}

	@Test
	@DisplayName("Record 3337: Phone is 936-539-5280")
	void PhoneOfRecord3337() {
		assertEquals("936-539-5280", customers.get(3336).getPhone());
	}

	@Test
	@DisplayName("Record 3337: Fax is 936-539-4315")
	void FaxOfRecord3337() {
		assertEquals("936-539-4315", customers.get(3336).getFax());
	}

	@Test
	@DisplayName("Record 3337: Email is lina@greeley.com")
	void EmailOfRecord3337() {
		assertEquals("lina@greeley.com", customers.get(3336).getEmail());
	}

	@Test
	@DisplayName("Record 3337: Web is http://www.linagreeley.com")
	void WebOfRecord3337() {
		assertEquals("http://www.linagreeley.com", customers.get(3336).getWeb());
	}
}
