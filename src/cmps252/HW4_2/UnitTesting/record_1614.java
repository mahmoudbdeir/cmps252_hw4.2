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

@Tag("42")
class Record_1614 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1614: FirstName is Lona")
	void FirstNameOfRecord1614() {
		assertEquals("Lona", customers.get(1613).getFirstName());
	}

	@Test
	@DisplayName("Record 1614: LastName is Hively")
	void LastNameOfRecord1614() {
		assertEquals("Hively", customers.get(1613).getLastName());
	}

	@Test
	@DisplayName("Record 1614: Company is Onyl, Thomas F Esq")
	void CompanyOfRecord1614() {
		assertEquals("Onyl, Thomas F Esq", customers.get(1613).getCompany());
	}

	@Test
	@DisplayName("Record 1614: Address is 10505 Judicial Dr")
	void AddressOfRecord1614() {
		assertEquals("10505 Judicial Dr", customers.get(1613).getAddress());
	}

	@Test
	@DisplayName("Record 1614: City is Fairfax")
	void CityOfRecord1614() {
		assertEquals("Fairfax", customers.get(1613).getCity());
	}

	@Test
	@DisplayName("Record 1614: County is Fairfax City")
	void CountyOfRecord1614() {
		assertEquals("Fairfax City", customers.get(1613).getCounty());
	}

	@Test
	@DisplayName("Record 1614: State is VA")
	void StateOfRecord1614() {
		assertEquals("VA", customers.get(1613).getState());
	}

	@Test
	@DisplayName("Record 1614: ZIP is 22030")
	void ZIPOfRecord1614() {
		assertEquals("22030", customers.get(1613).getZIP());
	}

	@Test
	@DisplayName("Record 1614: Phone is 703-385-7352")
	void PhoneOfRecord1614() {
		assertEquals("703-385-7352", customers.get(1613).getPhone());
	}

	@Test
	@DisplayName("Record 1614: Fax is 703-385-0771")
	void FaxOfRecord1614() {
		assertEquals("703-385-0771", customers.get(1613).getFax());
	}

	@Test
	@DisplayName("Record 1614: Email is lona@hively.com")
	void EmailOfRecord1614() {
		assertEquals("lona@hively.com", customers.get(1613).getEmail());
	}

	@Test
	@DisplayName("Record 1614: Web is http://www.lonahively.com")
	void WebOfRecord1614() {
		assertEquals("http://www.lonahively.com", customers.get(1613).getWeb());
	}
}
