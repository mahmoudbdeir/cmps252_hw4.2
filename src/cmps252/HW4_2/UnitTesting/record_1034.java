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

@Tag("10")
class Record_1034 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1034: FirstName is Josh")
	void FirstNameOfRecord1034() {
		assertEquals("Josh", customers.get(1033).getFirstName());
	}

	@Test
	@DisplayName("Record 1034: LastName is Wildberger")
	void LastNameOfRecord1034() {
		assertEquals("Wildberger", customers.get(1033).getLastName());
	}

	@Test
	@DisplayName("Record 1034: Company is David Birenbeam & Associates")
	void CompanyOfRecord1034() {
		assertEquals("David Birenbeam & Associates", customers.get(1033).getCompany());
	}

	@Test
	@DisplayName("Record 1034: Address is 11505 15th Ave")
	void AddressOfRecord1034() {
		assertEquals("11505 15th Ave", customers.get(1033).getAddress());
	}

	@Test
	@DisplayName("Record 1034: City is College Point")
	void CityOfRecord1034() {
		assertEquals("College Point", customers.get(1033).getCity());
	}

	@Test
	@DisplayName("Record 1034: County is Queens")
	void CountyOfRecord1034() {
		assertEquals("Queens", customers.get(1033).getCounty());
	}

	@Test
	@DisplayName("Record 1034: State is NY")
	void StateOfRecord1034() {
		assertEquals("NY", customers.get(1033).getState());
	}

	@Test
	@DisplayName("Record 1034: ZIP is 11356")
	void ZIPOfRecord1034() {
		assertEquals("11356", customers.get(1033).getZIP());
	}

	@Test
	@DisplayName("Record 1034: Phone is 718-359-5018")
	void PhoneOfRecord1034() {
		assertEquals("718-359-5018", customers.get(1033).getPhone());
	}

	@Test
	@DisplayName("Record 1034: Fax is 718-359-7074")
	void FaxOfRecord1034() {
		assertEquals("718-359-7074", customers.get(1033).getFax());
	}

	@Test
	@DisplayName("Record 1034: Email is josh@wildberger.com")
	void EmailOfRecord1034() {
		assertEquals("josh@wildberger.com", customers.get(1033).getEmail());
	}

	@Test
	@DisplayName("Record 1034: Web is http://www.joshwildberger.com")
	void WebOfRecord1034() {
		assertEquals("http://www.joshwildberger.com", customers.get(1033).getWeb());
	}
}
