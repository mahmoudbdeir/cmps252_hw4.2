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

@Tag("12")
class Record_1336 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1336: FirstName is Manuela")
	void FirstNameOfRecord1336() {
		assertEquals("Manuela", customers.get(1335).getFirstName());
	}

	@Test
	@DisplayName("Record 1336: LastName is Aquilar")
	void LastNameOfRecord1336() {
		assertEquals("Aquilar", customers.get(1335).getLastName());
	}

	@Test
	@DisplayName("Record 1336: Company is Meridian Bank")
	void CompanyOfRecord1336() {
		assertEquals("Meridian Bank", customers.get(1335).getCompany());
	}

	@Test
	@DisplayName("Record 1336: Address is 4155 Tudor Centre Dr")
	void AddressOfRecord1336() {
		assertEquals("4155 Tudor Centre Dr", customers.get(1335).getAddress());
	}

	@Test
	@DisplayName("Record 1336: City is Anchorage")
	void CityOfRecord1336() {
		assertEquals("Anchorage", customers.get(1335).getCity());
	}

	@Test
	@DisplayName("Record 1336: County is Anchorage")
	void CountyOfRecord1336() {
		assertEquals("Anchorage", customers.get(1335).getCounty());
	}

	@Test
	@DisplayName("Record 1336: State is AK")
	void StateOfRecord1336() {
		assertEquals("AK", customers.get(1335).getState());
	}

	@Test
	@DisplayName("Record 1336: ZIP is 99508")
	void ZIPOfRecord1336() {
		assertEquals("99508", customers.get(1335).getZIP());
	}

	@Test
	@DisplayName("Record 1336: Phone is 907-562-3247")
	void PhoneOfRecord1336() {
		assertEquals("907-562-3247", customers.get(1335).getPhone());
	}

	@Test
	@DisplayName("Record 1336: Fax is 907-562-8039")
	void FaxOfRecord1336() {
		assertEquals("907-562-8039", customers.get(1335).getFax());
	}

	@Test
	@DisplayName("Record 1336: Email is manuela@aquilar.com")
	void EmailOfRecord1336() {
		assertEquals("manuela@aquilar.com", customers.get(1335).getEmail());
	}

	@Test
	@DisplayName("Record 1336: Web is http://www.manuelaaquilar.com")
	void WebOfRecord1336() {
		assertEquals("http://www.manuelaaquilar.com", customers.get(1335).getWeb());
	}
}
