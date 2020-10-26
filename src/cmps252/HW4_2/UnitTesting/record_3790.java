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

@Tag("21")
class Record_3790 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3790: FirstName is Jodie")
	void FirstNameOfRecord3790() {
		assertEquals("Jodie", customers.get(3789).getFirstName());
	}

	@Test
	@DisplayName("Record 3790: LastName is Cepas")
	void LastNameOfRecord3790() {
		assertEquals("Cepas", customers.get(3789).getLastName());
	}

	@Test
	@DisplayName("Record 3790: Company is Development Cnslrs Intrntl Ltd")
	void CompanyOfRecord3790() {
		assertEquals("Development Cnslrs Intrntl Ltd", customers.get(3789).getCompany());
	}

	@Test
	@DisplayName("Record 3790: Address is 3668 Us Highway 12e E")
	void AddressOfRecord3790() {
		assertEquals("3668 Us Highway 12e E", customers.get(3789).getAddress());
	}

	@Test
	@DisplayName("Record 3790: City is East Helena")
	void CityOfRecord3790() {
		assertEquals("East Helena", customers.get(3789).getCity());
	}

	@Test
	@DisplayName("Record 3790: County is Lewis and Clark")
	void CountyOfRecord3790() {
		assertEquals("Lewis and Clark", customers.get(3789).getCounty());
	}

	@Test
	@DisplayName("Record 3790: State is MT")
	void StateOfRecord3790() {
		assertEquals("MT", customers.get(3789).getState());
	}

	@Test
	@DisplayName("Record 3790: ZIP is 59635")
	void ZIPOfRecord3790() {
		assertEquals("59635", customers.get(3789).getZIP());
	}

	@Test
	@DisplayName("Record 3790: Phone is 406-227-7455")
	void PhoneOfRecord3790() {
		assertEquals("406-227-7455", customers.get(3789).getPhone());
	}

	@Test
	@DisplayName("Record 3790: Fax is 406-227-0521")
	void FaxOfRecord3790() {
		assertEquals("406-227-0521", customers.get(3789).getFax());
	}

	@Test
	@DisplayName("Record 3790: Email is jodie@cepas.com")
	void EmailOfRecord3790() {
		assertEquals("jodie@cepas.com", customers.get(3789).getEmail());
	}

	@Test
	@DisplayName("Record 3790: Web is http://www.jodiecepas.com")
	void WebOfRecord3790() {
		assertEquals("http://www.jodiecepas.com", customers.get(3789).getWeb());
	}
}
