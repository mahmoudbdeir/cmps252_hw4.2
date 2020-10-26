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

@Tag("28")
class Record_2868 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2868: FirstName is Teri")
	void FirstNameOfRecord2868() {
		assertEquals("Teri", customers.get(2867).getFirstName());
	}

	@Test
	@DisplayName("Record 2868: LastName is Kaea")
	void LastNameOfRecord2868() {
		assertEquals("Kaea", customers.get(2867).getLastName());
	}

	@Test
	@DisplayName("Record 2868: Company is Trigon Blue Cross Blue Shyld")
	void CompanyOfRecord2868() {
		assertEquals("Trigon Blue Cross Blue Shyld", customers.get(2867).getCompany());
	}

	@Test
	@DisplayName("Record 2868: Address is 820 Mchenry Ave")
	void AddressOfRecord2868() {
		assertEquals("820 Mchenry Ave", customers.get(2867).getAddress());
	}

	@Test
	@DisplayName("Record 2868: City is Woodstock")
	void CityOfRecord2868() {
		assertEquals("Woodstock", customers.get(2867).getCity());
	}

	@Test
	@DisplayName("Record 2868: County is McHenry")
	void CountyOfRecord2868() {
		assertEquals("McHenry", customers.get(2867).getCounty());
	}

	@Test
	@DisplayName("Record 2868: State is IL")
	void StateOfRecord2868() {
		assertEquals("IL", customers.get(2867).getState());
	}

	@Test
	@DisplayName("Record 2868: ZIP is 60098")
	void ZIPOfRecord2868() {
		assertEquals("60098", customers.get(2867).getZIP());
	}

	@Test
	@DisplayName("Record 2868: Phone is 815-338-6846")
	void PhoneOfRecord2868() {
		assertEquals("815-338-6846", customers.get(2867).getPhone());
	}

	@Test
	@DisplayName("Record 2868: Fax is 815-338-6668")
	void FaxOfRecord2868() {
		assertEquals("815-338-6668", customers.get(2867).getFax());
	}

	@Test
	@DisplayName("Record 2868: Email is teri@kaea.com")
	void EmailOfRecord2868() {
		assertEquals("teri@kaea.com", customers.get(2867).getEmail());
	}

	@Test
	@DisplayName("Record 2868: Web is http://www.terikaea.com")
	void WebOfRecord2868() {
		assertEquals("http://www.terikaea.com", customers.get(2867).getWeb());
	}
}
