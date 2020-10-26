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

@Tag("16")
class Record_1595 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1595: FirstName is Willis")
	void FirstNameOfRecord1595() {
		assertEquals("Willis", customers.get(1594).getFirstName());
	}

	@Test
	@DisplayName("Record 1595: LastName is Oppliger")
	void LastNameOfRecord1595() {
		assertEquals("Oppliger", customers.get(1594).getLastName());
	}

	@Test
	@DisplayName("Record 1595: Company is Denvir, James P Esq")
	void CompanyOfRecord1595() {
		assertEquals("Denvir, James P Esq", customers.get(1594).getCompany());
	}

	@Test
	@DisplayName("Record 1595: Address is 2109 Washington St")
	void AddressOfRecord1595() {
		assertEquals("2109 Washington St", customers.get(1594).getAddress());
	}

	@Test
	@DisplayName("Record 1595: City is Laredo")
	void CityOfRecord1595() {
		assertEquals("Laredo", customers.get(1594).getCity());
	}

	@Test
	@DisplayName("Record 1595: County is Webb")
	void CountyOfRecord1595() {
		assertEquals("Webb", customers.get(1594).getCounty());
	}

	@Test
	@DisplayName("Record 1595: State is TX")
	void StateOfRecord1595() {
		assertEquals("TX", customers.get(1594).getState());
	}

	@Test
	@DisplayName("Record 1595: ZIP is 78040")
	void ZIPOfRecord1595() {
		assertEquals("78040", customers.get(1594).getZIP());
	}

	@Test
	@DisplayName("Record 1595: Phone is 956-725-4656")
	void PhoneOfRecord1595() {
		assertEquals("956-725-4656", customers.get(1594).getPhone());
	}

	@Test
	@DisplayName("Record 1595: Fax is 956-725-7384")
	void FaxOfRecord1595() {
		assertEquals("956-725-7384", customers.get(1594).getFax());
	}

	@Test
	@DisplayName("Record 1595: Email is willis@oppliger.com")
	void EmailOfRecord1595() {
		assertEquals("willis@oppliger.com", customers.get(1594).getEmail());
	}

	@Test
	@DisplayName("Record 1595: Web is http://www.willisoppliger.com")
	void WebOfRecord1595() {
		assertEquals("http://www.willisoppliger.com", customers.get(1594).getWeb());
	}
}
