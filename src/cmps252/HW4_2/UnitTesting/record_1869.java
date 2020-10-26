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

@Tag("3")
class Record_1869 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1869: FirstName is Elvia")
	void FirstNameOfRecord1869() {
		assertEquals("Elvia", customers.get(1868).getFirstName());
	}

	@Test
	@DisplayName("Record 1869: LastName is Wilner")
	void LastNameOfRecord1869() {
		assertEquals("Wilner", customers.get(1868).getLastName());
	}

	@Test
	@DisplayName("Record 1869: Company is Alvin J Coleman & Son Inc")
	void CompanyOfRecord1869() {
		assertEquals("Alvin J Coleman & Son Inc", customers.get(1868).getCompany());
	}

	@Test
	@DisplayName("Record 1869: Address is Menands Mkt")
	void AddressOfRecord1869() {
		assertEquals("Menands Mkt", customers.get(1868).getAddress());
	}

	@Test
	@DisplayName("Record 1869: City is Albany")
	void CityOfRecord1869() {
		assertEquals("Albany", customers.get(1868).getCity());
	}

	@Test
	@DisplayName("Record 1869: County is Albany")
	void CountyOfRecord1869() {
		assertEquals("Albany", customers.get(1868).getCounty());
	}

	@Test
	@DisplayName("Record 1869: State is NY")
	void StateOfRecord1869() {
		assertEquals("NY", customers.get(1868).getState());
	}

	@Test
	@DisplayName("Record 1869: ZIP is 12204")
	void ZIPOfRecord1869() {
		assertEquals("12204", customers.get(1868).getZIP());
	}

	@Test
	@DisplayName("Record 1869: Phone is 518-465-3445")
	void PhoneOfRecord1869() {
		assertEquals("518-465-3445", customers.get(1868).getPhone());
	}

	@Test
	@DisplayName("Record 1869: Fax is 518-465-1614")
	void FaxOfRecord1869() {
		assertEquals("518-465-1614", customers.get(1868).getFax());
	}

	@Test
	@DisplayName("Record 1869: Email is elvia@wilner.com")
	void EmailOfRecord1869() {
		assertEquals("elvia@wilner.com", customers.get(1868).getEmail());
	}

	@Test
	@DisplayName("Record 1869: Web is http://www.elviawilner.com")
	void WebOfRecord1869() {
		assertEquals("http://www.elviawilner.com", customers.get(1868).getWeb());
	}
}
