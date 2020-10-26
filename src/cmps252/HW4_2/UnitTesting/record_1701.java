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

@Tag("26")
class Record_1701 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1701: FirstName is Andrew")
	void FirstNameOfRecord1701() {
		assertEquals("Andrew", customers.get(1700).getFirstName());
	}

	@Test
	@DisplayName("Record 1701: LastName is Anick")
	void LastNameOfRecord1701() {
		assertEquals("Anick", customers.get(1700).getLastName());
	}

	@Test
	@DisplayName("Record 1701: Company is Robert, James R Jr")
	void CompanyOfRecord1701() {
		assertEquals("Robert, James R Jr", customers.get(1700).getCompany());
	}

	@Test
	@DisplayName("Record 1701: Address is 1097 Memorex Dr")
	void AddressOfRecord1701() {
		assertEquals("1097 Memorex Dr", customers.get(1700).getAddress());
	}

	@Test
	@DisplayName("Record 1701: City is Santa Clara")
	void CityOfRecord1701() {
		assertEquals("Santa Clara", customers.get(1700).getCity());
	}

	@Test
	@DisplayName("Record 1701: County is Santa Clara")
	void CountyOfRecord1701() {
		assertEquals("Santa Clara", customers.get(1700).getCounty());
	}

	@Test
	@DisplayName("Record 1701: State is CA")
	void StateOfRecord1701() {
		assertEquals("CA", customers.get(1700).getState());
	}

	@Test
	@DisplayName("Record 1701: ZIP is 95050")
	void ZIPOfRecord1701() {
		assertEquals("95050", customers.get(1700).getZIP());
	}

	@Test
	@DisplayName("Record 1701: Phone is 408-727-1614")
	void PhoneOfRecord1701() {
		assertEquals("408-727-1614", customers.get(1700).getPhone());
	}

	@Test
	@DisplayName("Record 1701: Fax is 408-727-3637")
	void FaxOfRecord1701() {
		assertEquals("408-727-3637", customers.get(1700).getFax());
	}

	@Test
	@DisplayName("Record 1701: Email is andrew@anick.com")
	void EmailOfRecord1701() {
		assertEquals("andrew@anick.com", customers.get(1700).getEmail());
	}

	@Test
	@DisplayName("Record 1701: Web is http://www.andrewanick.com")
	void WebOfRecord1701() {
		assertEquals("http://www.andrewanick.com", customers.get(1700).getWeb());
	}
}
