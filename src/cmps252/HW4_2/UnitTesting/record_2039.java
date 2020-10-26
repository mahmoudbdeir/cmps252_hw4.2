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

@Tag("40")
class Record_2039 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2039: FirstName is Pat")
	void FirstNameOfRecord2039() {
		assertEquals("Pat", customers.get(2038).getFirstName());
	}

	@Test
	@DisplayName("Record 2039: LastName is Siert")
	void LastNameOfRecord2039() {
		assertEquals("Siert", customers.get(2038).getLastName());
	}

	@Test
	@DisplayName("Record 2039: Company is Harbour Food Service Equip Inc")
	void CompanyOfRecord2039() {
		assertEquals("Harbour Food Service Equip Inc", customers.get(2038).getCompany());
	}

	@Test
	@DisplayName("Record 2039: Address is 278 Beverly Rd")
	void AddressOfRecord2039() {
		assertEquals("278 Beverly Rd", customers.get(2038).getAddress());
	}

	@Test
	@DisplayName("Record 2039: City is Pittsburgh")
	void CityOfRecord2039() {
		assertEquals("Pittsburgh", customers.get(2038).getCity());
	}

	@Test
	@DisplayName("Record 2039: County is Allegheny")
	void CountyOfRecord2039() {
		assertEquals("Allegheny", customers.get(2038).getCounty());
	}

	@Test
	@DisplayName("Record 2039: State is PA")
	void StateOfRecord2039() {
		assertEquals("PA", customers.get(2038).getState());
	}

	@Test
	@DisplayName("Record 2039: ZIP is 15216")
	void ZIPOfRecord2039() {
		assertEquals("15216", customers.get(2038).getZIP());
	}

	@Test
	@DisplayName("Record 2039: Phone is 412-343-6509")
	void PhoneOfRecord2039() {
		assertEquals("412-343-6509", customers.get(2038).getPhone());
	}

	@Test
	@DisplayName("Record 2039: Fax is 412-343-7659")
	void FaxOfRecord2039() {
		assertEquals("412-343-7659", customers.get(2038).getFax());
	}

	@Test
	@DisplayName("Record 2039: Email is pat@siert.com")
	void EmailOfRecord2039() {
		assertEquals("pat@siert.com", customers.get(2038).getEmail());
	}

	@Test
	@DisplayName("Record 2039: Web is http://www.patsiert.com")
	void WebOfRecord2039() {
		assertEquals("http://www.patsiert.com", customers.get(2038).getWeb());
	}
}
