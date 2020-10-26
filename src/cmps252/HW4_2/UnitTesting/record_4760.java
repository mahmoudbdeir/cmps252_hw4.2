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

@Tag("38")
class Record_4760 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4760: FirstName is Lynda")
	void FirstNameOfRecord4760() {
		assertEquals("Lynda", customers.get(4759).getFirstName());
	}

	@Test
	@DisplayName("Record 4760: LastName is Hanoa")
	void LastNameOfRecord4760() {
		assertEquals("Hanoa", customers.get(4759).getLastName());
	}

	@Test
	@DisplayName("Record 4760: Company is Ferdinand, Lane M Esq")
	void CompanyOfRecord4760() {
		assertEquals("Ferdinand, Lane M Esq", customers.get(4759).getCompany());
	}

	@Test
	@DisplayName("Record 4760: Address is 911 Silver Spring Ave")
	void AddressOfRecord4760() {
		assertEquals("911 Silver Spring Ave", customers.get(4759).getAddress());
	}

	@Test
	@DisplayName("Record 4760: City is Silver Spring")
	void CityOfRecord4760() {
		assertEquals("Silver Spring", customers.get(4759).getCity());
	}

	@Test
	@DisplayName("Record 4760: County is Montgomery")
	void CountyOfRecord4760() {
		assertEquals("Montgomery", customers.get(4759).getCounty());
	}

	@Test
	@DisplayName("Record 4760: State is MD")
	void StateOfRecord4760() {
		assertEquals("MD", customers.get(4759).getState());
	}

	@Test
	@DisplayName("Record 4760: ZIP is 20910")
	void ZIPOfRecord4760() {
		assertEquals("20910", customers.get(4759).getZIP());
	}

	@Test
	@DisplayName("Record 4760: Phone is 301-588-5382")
	void PhoneOfRecord4760() {
		assertEquals("301-588-5382", customers.get(4759).getPhone());
	}

	@Test
	@DisplayName("Record 4760: Fax is 301-588-6357")
	void FaxOfRecord4760() {
		assertEquals("301-588-6357", customers.get(4759).getFax());
	}

	@Test
	@DisplayName("Record 4760: Email is lynda@hanoa.com")
	void EmailOfRecord4760() {
		assertEquals("lynda@hanoa.com", customers.get(4759).getEmail());
	}

	@Test
	@DisplayName("Record 4760: Web is http://www.lyndahanoa.com")
	void WebOfRecord4760() {
		assertEquals("http://www.lyndahanoa.com", customers.get(4759).getWeb());
	}
}
