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

@Tag("11")
class Record_931 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 931: FirstName is Isaiah")
	void FirstNameOfRecord931() {
		assertEquals("Isaiah", customers.get(930).getFirstName());
	}

	@Test
	@DisplayName("Record 931: LastName is Frisk")
	void LastNameOfRecord931() {
		assertEquals("Frisk", customers.get(930).getLastName());
	}

	@Test
	@DisplayName("Record 931: Company is Ramada Inn")
	void CompanyOfRecord931() {
		assertEquals("Ramada Inn", customers.get(930).getCompany());
	}

	@Test
	@DisplayName("Record 931: Address is 43805 Van Dyke Ave")
	void AddressOfRecord931() {
		assertEquals("43805 Van Dyke Ave", customers.get(930).getAddress());
	}

	@Test
	@DisplayName("Record 931: City is Sterling Hyghts")
	void CityOfRecord931() {
		assertEquals("Sterling Hyghts", customers.get(930).getCity());
	}

	@Test
	@DisplayName("Record 931: County is Macomb")
	void CountyOfRecord931() {
		assertEquals("Macomb", customers.get(930).getCounty());
	}

	@Test
	@DisplayName("Record 931: State is MI")
	void StateOfRecord931() {
		assertEquals("MI", customers.get(930).getState());
	}

	@Test
	@DisplayName("Record 931: ZIP is 48314")
	void ZIPOfRecord931() {
		assertEquals("48314", customers.get(930).getZIP());
	}

	@Test
	@DisplayName("Record 931: Phone is 586-731-7557")
	void PhoneOfRecord931() {
		assertEquals("586-731-7557", customers.get(930).getPhone());
	}

	@Test
	@DisplayName("Record 931: Fax is 586-731-3637")
	void FaxOfRecord931() {
		assertEquals("586-731-3637", customers.get(930).getFax());
	}

	@Test
	@DisplayName("Record 931: Email is isaiah@frisk.com")
	void EmailOfRecord931() {
		assertEquals("isaiah@frisk.com", customers.get(930).getEmail());
	}

	@Test
	@DisplayName("Record 931: Web is http://www.isaiahfrisk.com")
	void WebOfRecord931() {
		assertEquals("http://www.isaiahfrisk.com", customers.get(930).getWeb());
	}
}
