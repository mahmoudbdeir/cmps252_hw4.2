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

@Tag("39")
class Record_1919 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1919: FirstName is Liliana")
	void FirstNameOfRecord1919() {
		assertEquals("Liliana", customers.get(1918).getFirstName());
	}

	@Test
	@DisplayName("Record 1919: LastName is Hanger")
	void LastNameOfRecord1919() {
		assertEquals("Hanger", customers.get(1918).getLastName());
	}

	@Test
	@DisplayName("Record 1919: Company is Wells, D Michael Esq")
	void CompanyOfRecord1919() {
		assertEquals("Wells, D Michael Esq", customers.get(1918).getCompany());
	}

	@Test
	@DisplayName("Record 1919: Address is 555 N Carancahua St  #-880")
	void AddressOfRecord1919() {
		assertEquals("555 N Carancahua St  #-880", customers.get(1918).getAddress());
	}

	@Test
	@DisplayName("Record 1919: City is Corpus Christi")
	void CityOfRecord1919() {
		assertEquals("Corpus Christi", customers.get(1918).getCity());
	}

	@Test
	@DisplayName("Record 1919: County is Nueces")
	void CountyOfRecord1919() {
		assertEquals("Nueces", customers.get(1918).getCounty());
	}

	@Test
	@DisplayName("Record 1919: State is TX")
	void StateOfRecord1919() {
		assertEquals("TX", customers.get(1918).getState());
	}

	@Test
	@DisplayName("Record 1919: ZIP is 78478")
	void ZIPOfRecord1919() {
		assertEquals("78478", customers.get(1918).getZIP());
	}

	@Test
	@DisplayName("Record 1919: Phone is 361-882-1701")
	void PhoneOfRecord1919() {
		assertEquals("361-882-1701", customers.get(1918).getPhone());
	}

	@Test
	@DisplayName("Record 1919: Fax is 361-882-6162")
	void FaxOfRecord1919() {
		assertEquals("361-882-6162", customers.get(1918).getFax());
	}

	@Test
	@DisplayName("Record 1919: Email is liliana@hanger.com")
	void EmailOfRecord1919() {
		assertEquals("liliana@hanger.com", customers.get(1918).getEmail());
	}

	@Test
	@DisplayName("Record 1919: Web is http://www.lilianahanger.com")
	void WebOfRecord1919() {
		assertEquals("http://www.lilianahanger.com", customers.get(1918).getWeb());
	}
}
