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
class Record_727 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 727: FirstName is Travis")
	void FirstNameOfRecord727() {
		assertEquals("Travis", customers.get(726).getFirstName());
	}

	@Test
	@DisplayName("Record 727: LastName is Roys")
	void LastNameOfRecord727() {
		assertEquals("Roys", customers.get(726).getLastName());
	}

	@Test
	@DisplayName("Record 727: Company is Kennedy, Melvin D Esq")
	void CompanyOfRecord727() {
		assertEquals("Kennedy, Melvin D Esq", customers.get(726).getCompany());
	}

	@Test
	@DisplayName("Record 727: Address is 3227 N Harlem Ave")
	void AddressOfRecord727() {
		assertEquals("3227 N Harlem Ave", customers.get(726).getAddress());
	}

	@Test
	@DisplayName("Record 727: City is Chicago")
	void CityOfRecord727() {
		assertEquals("Chicago", customers.get(726).getCity());
	}

	@Test
	@DisplayName("Record 727: County is Cook")
	void CountyOfRecord727() {
		assertEquals("Cook", customers.get(726).getCounty());
	}

	@Test
	@DisplayName("Record 727: State is IL")
	void StateOfRecord727() {
		assertEquals("IL", customers.get(726).getState());
	}

	@Test
	@DisplayName("Record 727: ZIP is 60634")
	void ZIPOfRecord727() {
		assertEquals("60634", customers.get(726).getZIP());
	}

	@Test
	@DisplayName("Record 727: Phone is 773-725-9278")
	void PhoneOfRecord727() {
		assertEquals("773-725-9278", customers.get(726).getPhone());
	}

	@Test
	@DisplayName("Record 727: Fax is 773-725-0867")
	void FaxOfRecord727() {
		assertEquals("773-725-0867", customers.get(726).getFax());
	}

	@Test
	@DisplayName("Record 727: Email is travis@roys.com")
	void EmailOfRecord727() {
		assertEquals("travis@roys.com", customers.get(726).getEmail());
	}

	@Test
	@DisplayName("Record 727: Web is http://www.travisroys.com")
	void WebOfRecord727() {
		assertEquals("http://www.travisroys.com", customers.get(726).getWeb());
	}
}
