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

@Tag("22")
class Record_1548 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1548: FirstName is Rhoda")
	void FirstNameOfRecord1548() {
		assertEquals("Rhoda", customers.get(1547).getFirstName());
	}

	@Test
	@DisplayName("Record 1548: LastName is Waack")
	void LastNameOfRecord1548() {
		assertEquals("Waack", customers.get(1547).getLastName());
	}

	@Test
	@DisplayName("Record 1548: Company is Best Western Jefferson Inn")
	void CompanyOfRecord1548() {
		assertEquals("Best Western Jefferson Inn", customers.get(1547).getCompany());
	}

	@Test
	@DisplayName("Record 1548: Address is 2908 Springboro Rd W")
	void AddressOfRecord1548() {
		assertEquals("2908 Springboro Rd W", customers.get(1547).getAddress());
	}

	@Test
	@DisplayName("Record 1548: City is Dayton")
	void CityOfRecord1548() {
		assertEquals("Dayton", customers.get(1547).getCity());
	}

	@Test
	@DisplayName("Record 1548: County is Montgomery")
	void CountyOfRecord1548() {
		assertEquals("Montgomery", customers.get(1547).getCounty());
	}

	@Test
	@DisplayName("Record 1548: State is OH")
	void StateOfRecord1548() {
		assertEquals("OH", customers.get(1547).getState());
	}

	@Test
	@DisplayName("Record 1548: ZIP is 45439")
	void ZIPOfRecord1548() {
		assertEquals("45439", customers.get(1547).getZIP());
	}

	@Test
	@DisplayName("Record 1548: Phone is 937-299-3311")
	void PhoneOfRecord1548() {
		assertEquals("937-299-3311", customers.get(1547).getPhone());
	}

	@Test
	@DisplayName("Record 1548: Fax is 937-299-3542")
	void FaxOfRecord1548() {
		assertEquals("937-299-3542", customers.get(1547).getFax());
	}

	@Test
	@DisplayName("Record 1548: Email is rhoda@waack.com")
	void EmailOfRecord1548() {
		assertEquals("rhoda@waack.com", customers.get(1547).getEmail());
	}

	@Test
	@DisplayName("Record 1548: Web is http://www.rhodawaack.com")
	void WebOfRecord1548() {
		assertEquals("http://www.rhodawaack.com", customers.get(1547).getWeb());
	}
}
