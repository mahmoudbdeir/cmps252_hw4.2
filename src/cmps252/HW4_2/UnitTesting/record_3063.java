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

@Tag("4")
class Record_3063 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3063: FirstName is Kisha")
	void FirstNameOfRecord3063() {
		assertEquals("Kisha", customers.get(3062).getFirstName());
	}

	@Test
	@DisplayName("Record 3063: LastName is Khounthavong")
	void LastNameOfRecord3063() {
		assertEquals("Khounthavong", customers.get(3062).getLastName());
	}

	@Test
	@DisplayName("Record 3063: Company is Gripp")
	void CompanyOfRecord3063() {
		assertEquals("Gripp", customers.get(3062).getCompany());
	}

	@Test
	@DisplayName("Record 3063: Address is 4864 I 55s S")
	void AddressOfRecord3063() {
		assertEquals("4864 I 55s S", customers.get(3062).getAddress());
	}

	@Test
	@DisplayName("Record 3063: City is Jackson")
	void CityOfRecord3063() {
		assertEquals("Jackson", customers.get(3062).getCity());
	}

	@Test
	@DisplayName("Record 3063: County is Hinds")
	void CountyOfRecord3063() {
		assertEquals("Hinds", customers.get(3062).getCounty());
	}

	@Test
	@DisplayName("Record 3063: State is MS")
	void StateOfRecord3063() {
		assertEquals("MS", customers.get(3062).getState());
	}

	@Test
	@DisplayName("Record 3063: ZIP is 39212")
	void ZIPOfRecord3063() {
		assertEquals("39212", customers.get(3062).getZIP());
	}

	@Test
	@DisplayName("Record 3063: Phone is 601-373-1346")
	void PhoneOfRecord3063() {
		assertEquals("601-373-1346", customers.get(3062).getPhone());
	}

	@Test
	@DisplayName("Record 3063: Fax is 601-373-5137")
	void FaxOfRecord3063() {
		assertEquals("601-373-5137", customers.get(3062).getFax());
	}

	@Test
	@DisplayName("Record 3063: Email is kisha@khounthavong.com")
	void EmailOfRecord3063() {
		assertEquals("kisha@khounthavong.com", customers.get(3062).getEmail());
	}

	@Test
	@DisplayName("Record 3063: Web is http://www.kishakhounthavong.com")
	void WebOfRecord3063() {
		assertEquals("http://www.kishakhounthavong.com", customers.get(3062).getWeb());
	}
}
