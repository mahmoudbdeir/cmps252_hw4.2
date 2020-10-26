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

@Tag("35")
class Record_636 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 636: FirstName is Pam")
	void FirstNameOfRecord636() {
		assertEquals("Pam", customers.get(635).getFirstName());
	}

	@Test
	@DisplayName("Record 636: LastName is Zamora")
	void LastNameOfRecord636() {
		assertEquals("Zamora", customers.get(635).getLastName());
	}

	@Test
	@DisplayName("Record 636: Company is Brodnik, Lawrence E Cpa")
	void CompanyOfRecord636() {
		assertEquals("Brodnik, Lawrence E Cpa", customers.get(635).getCompany());
	}

	@Test
	@DisplayName("Record 636: Address is 311 S Haven St")
	void AddressOfRecord636() {
		assertEquals("311 S Haven St", customers.get(635).getAddress());
	}

	@Test
	@DisplayName("Record 636: City is Baltimore")
	void CityOfRecord636() {
		assertEquals("Baltimore", customers.get(635).getCity());
	}

	@Test
	@DisplayName("Record 636: County is Baltimore City")
	void CountyOfRecord636() {
		assertEquals("Baltimore City", customers.get(635).getCounty());
	}

	@Test
	@DisplayName("Record 636: State is MD")
	void StateOfRecord636() {
		assertEquals("MD", customers.get(635).getState());
	}

	@Test
	@DisplayName("Record 636: ZIP is 21224")
	void ZIPOfRecord636() {
		assertEquals("21224", customers.get(635).getZIP());
	}

	@Test
	@DisplayName("Record 636: Phone is 410-276-1001")
	void PhoneOfRecord636() {
		assertEquals("410-276-1001", customers.get(635).getPhone());
	}

	@Test
	@DisplayName("Record 636: Fax is 410-276-1722")
	void FaxOfRecord636() {
		assertEquals("410-276-1722", customers.get(635).getFax());
	}

	@Test
	@DisplayName("Record 636: Email is pam@zamora.com")
	void EmailOfRecord636() {
		assertEquals("pam@zamora.com", customers.get(635).getEmail());
	}

	@Test
	@DisplayName("Record 636: Web is http://www.pamzamora.com")
	void WebOfRecord636() {
		assertEquals("http://www.pamzamora.com", customers.get(635).getWeb());
	}
}
