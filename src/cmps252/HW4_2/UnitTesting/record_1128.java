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

@Tag("34")
class Record_1128 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1128: FirstName is Alexandra")
	void FirstNameOfRecord1128() {
		assertEquals("Alexandra", customers.get(1127).getFirstName());
	}

	@Test
	@DisplayName("Record 1128: LastName is Thackston")
	void LastNameOfRecord1128() {
		assertEquals("Thackston", customers.get(1127).getLastName());
	}

	@Test
	@DisplayName("Record 1128: Company is Tuuk, Stephen M Esq")
	void CompanyOfRecord1128() {
		assertEquals("Tuuk, Stephen M Esq", customers.get(1127).getCompany());
	}

	@Test
	@DisplayName("Record 1128: Address is 407 N Orchard St")
	void AddressOfRecord1128() {
		assertEquals("407 N Orchard St", customers.get(1127).getAddress());
	}

	@Test
	@DisplayName("Record 1128: City is Boise")
	void CityOfRecord1128() {
		assertEquals("Boise", customers.get(1127).getCity());
	}

	@Test
	@DisplayName("Record 1128: County is Ada")
	void CountyOfRecord1128() {
		assertEquals("Ada", customers.get(1127).getCounty());
	}

	@Test
	@DisplayName("Record 1128: State is ID")
	void StateOfRecord1128() {
		assertEquals("ID", customers.get(1127).getState());
	}

	@Test
	@DisplayName("Record 1128: ZIP is 83706")
	void ZIPOfRecord1128() {
		assertEquals("83706", customers.get(1127).getZIP());
	}

	@Test
	@DisplayName("Record 1128: Phone is 208-377-2598")
	void PhoneOfRecord1128() {
		assertEquals("208-377-2598", customers.get(1127).getPhone());
	}

	@Test
	@DisplayName("Record 1128: Fax is 208-377-2515")
	void FaxOfRecord1128() {
		assertEquals("208-377-2515", customers.get(1127).getFax());
	}

	@Test
	@DisplayName("Record 1128: Email is alexandra@thackston.com")
	void EmailOfRecord1128() {
		assertEquals("alexandra@thackston.com", customers.get(1127).getEmail());
	}

	@Test
	@DisplayName("Record 1128: Web is http://www.alexandrathackston.com")
	void WebOfRecord1128() {
		assertEquals("http://www.alexandrathackston.com", customers.get(1127).getWeb());
	}
}
