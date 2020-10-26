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

@Tag("5")
class Record_1866 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1866: FirstName is Kasey")
	void FirstNameOfRecord1866() {
		assertEquals("Kasey", customers.get(1865).getFirstName());
	}

	@Test
	@DisplayName("Record 1866: LastName is Zahl")
	void LastNameOfRecord1866() {
		assertEquals("Zahl", customers.get(1865).getLastName());
	}

	@Test
	@DisplayName("Record 1866: Company is Kats, Bruce Esq")
	void CompanyOfRecord1866() {
		assertEquals("Kats, Bruce Esq", customers.get(1865).getCompany());
	}

	@Test
	@DisplayName("Record 1866: Address is 117 Gordon St")
	void AddressOfRecord1866() {
		assertEquals("117 Gordon St", customers.get(1865).getAddress());
	}

	@Test
	@DisplayName("Record 1866: City is Elk Grove Village")
	void CityOfRecord1866() {
		assertEquals("Elk Grove Village", customers.get(1865).getCity());
	}

	@Test
	@DisplayName("Record 1866: County is Cook")
	void CountyOfRecord1866() {
		assertEquals("Cook", customers.get(1865).getCounty());
	}

	@Test
	@DisplayName("Record 1866: State is IL")
	void StateOfRecord1866() {
		assertEquals("IL", customers.get(1865).getState());
	}

	@Test
	@DisplayName("Record 1866: ZIP is 60007")
	void ZIPOfRecord1866() {
		assertEquals("60007", customers.get(1865).getZIP());
	}

	@Test
	@DisplayName("Record 1866: Phone is 847-439-3295")
	void PhoneOfRecord1866() {
		assertEquals("847-439-3295", customers.get(1865).getPhone());
	}

	@Test
	@DisplayName("Record 1866: Fax is 847-439-4294")
	void FaxOfRecord1866() {
		assertEquals("847-439-4294", customers.get(1865).getFax());
	}

	@Test
	@DisplayName("Record 1866: Email is kasey@zahl.com")
	void EmailOfRecord1866() {
		assertEquals("kasey@zahl.com", customers.get(1865).getEmail());
	}

	@Test
	@DisplayName("Record 1866: Web is http://www.kaseyzahl.com")
	void WebOfRecord1866() {
		assertEquals("http://www.kaseyzahl.com", customers.get(1865).getWeb());
	}
}
