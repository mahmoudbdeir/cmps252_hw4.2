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

@Tag("29")
class Record_427 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 427: FirstName is Deloris")
	void FirstNameOfRecord427() {
		assertEquals("Deloris", customers.get(426).getFirstName());
	}

	@Test
	@DisplayName("Record 427: LastName is Tuffey")
	void LastNameOfRecord427() {
		assertEquals("Tuffey", customers.get(426).getLastName());
	}

	@Test
	@DisplayName("Record 427: Company is Pasta House Company")
	void CompanyOfRecord427() {
		assertEquals("Pasta House Company", customers.get(426).getCompany());
	}

	@Test
	@DisplayName("Record 427: Address is 3719 Santa Maria Ave")
	void AddressOfRecord427() {
		assertEquals("3719 Santa Maria Ave", customers.get(426).getAddress());
	}

	@Test
	@DisplayName("Record 427: City is Laredo")
	void CityOfRecord427() {
		assertEquals("Laredo", customers.get(426).getCity());
	}

	@Test
	@DisplayName("Record 427: County is Webb")
	void CountyOfRecord427() {
		assertEquals("Webb", customers.get(426).getCounty());
	}

	@Test
	@DisplayName("Record 427: State is TX")
	void StateOfRecord427() {
		assertEquals("TX", customers.get(426).getState());
	}

	@Test
	@DisplayName("Record 427: ZIP is 78041")
	void ZIPOfRecord427() {
		assertEquals("78041", customers.get(426).getZIP());
	}

	@Test
	@DisplayName("Record 427: Phone is 956-722-7126")
	void PhoneOfRecord427() {
		assertEquals("956-722-7126", customers.get(426).getPhone());
	}

	@Test
	@DisplayName("Record 427: Fax is 956-722-4336")
	void FaxOfRecord427() {
		assertEquals("956-722-4336", customers.get(426).getFax());
	}

	@Test
	@DisplayName("Record 427: Email is deloris@tuffey.com")
	void EmailOfRecord427() {
		assertEquals("deloris@tuffey.com", customers.get(426).getEmail());
	}

	@Test
	@DisplayName("Record 427: Web is http://www.deloristuffey.com")
	void WebOfRecord427() {
		assertEquals("http://www.deloristuffey.com", customers.get(426).getWeb());
	}
}
