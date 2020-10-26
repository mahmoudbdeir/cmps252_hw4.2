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

@Tag("47")
class Record_926 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 926: FirstName is Nellie")
	void FirstNameOfRecord926() {
		assertEquals("Nellie", customers.get(925).getFirstName());
	}

	@Test
	@DisplayName("Record 926: LastName is Deuell")
	void LastNameOfRecord926() {
		assertEquals("Deuell", customers.get(925).getLastName());
	}

	@Test
	@DisplayName("Record 926: Company is Kinder, Suzette S Esq")
	void CompanyOfRecord926() {
		assertEquals("Kinder, Suzette S Esq", customers.get(925).getCompany());
	}

	@Test
	@DisplayName("Record 926: Address is 720 South St")
	void AddressOfRecord926() {
		assertEquals("720 South St", customers.get(925).getAddress());
	}

	@Test
	@DisplayName("Record 926: City is Honolulu")
	void CityOfRecord926() {
		assertEquals("Honolulu", customers.get(925).getCity());
	}

	@Test
	@DisplayName("Record 926: County is Honolulu")
	void CountyOfRecord926() {
		assertEquals("Honolulu", customers.get(925).getCounty());
	}

	@Test
	@DisplayName("Record 926: State is HI")
	void StateOfRecord926() {
		assertEquals("HI", customers.get(925).getState());
	}

	@Test
	@DisplayName("Record 926: ZIP is 96813")
	void ZIPOfRecord926() {
		assertEquals("96813", customers.get(925).getZIP());
	}

	@Test
	@DisplayName("Record 926: Phone is 808-533-3682")
	void PhoneOfRecord926() {
		assertEquals("808-533-3682", customers.get(925).getPhone());
	}

	@Test
	@DisplayName("Record 926: Fax is 808-533-7402")
	void FaxOfRecord926() {
		assertEquals("808-533-7402", customers.get(925).getFax());
	}

	@Test
	@DisplayName("Record 926: Email is nellie@deuell.com")
	void EmailOfRecord926() {
		assertEquals("nellie@deuell.com", customers.get(925).getEmail());
	}

	@Test
	@DisplayName("Record 926: Web is http://www.nelliedeuell.com")
	void WebOfRecord926() {
		assertEquals("http://www.nelliedeuell.com", customers.get(925).getWeb());
	}
}
