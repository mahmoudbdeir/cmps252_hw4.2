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
class Record_1812 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1812: FirstName is Ericka")
	void FirstNameOfRecord1812() {
		assertEquals("Ericka", customers.get(1811).getFirstName());
	}

	@Test
	@DisplayName("Record 1812: LastName is Coffinberger")
	void LastNameOfRecord1812() {
		assertEquals("Coffinberger", customers.get(1811).getLastName());
	}

	@Test
	@DisplayName("Record 1812: Company is Brothers")
	void CompanyOfRecord1812() {
		assertEquals("Brothers", customers.get(1811).getCompany());
	}

	@Test
	@DisplayName("Record 1812: Address is 11407 Cron Hill Dr  #-d")
	void AddressOfRecord1812() {
		assertEquals("11407 Cron Hill Dr  #-d", customers.get(1811).getAddress());
	}

	@Test
	@DisplayName("Record 1812: City is Owings Mills")
	void CityOfRecord1812() {
		assertEquals("Owings Mills", customers.get(1811).getCity());
	}

	@Test
	@DisplayName("Record 1812: County is Baltimore")
	void CountyOfRecord1812() {
		assertEquals("Baltimore", customers.get(1811).getCounty());
	}

	@Test
	@DisplayName("Record 1812: State is MD")
	void StateOfRecord1812() {
		assertEquals("MD", customers.get(1811).getState());
	}

	@Test
	@DisplayName("Record 1812: ZIP is 21117")
	void ZIPOfRecord1812() {
		assertEquals("21117", customers.get(1811).getZIP());
	}

	@Test
	@DisplayName("Record 1812: Phone is 410-581-2200")
	void PhoneOfRecord1812() {
		assertEquals("410-581-2200", customers.get(1811).getPhone());
	}

	@Test
	@DisplayName("Record 1812: Fax is 410-581-3706")
	void FaxOfRecord1812() {
		assertEquals("410-581-3706", customers.get(1811).getFax());
	}

	@Test
	@DisplayName("Record 1812: Email is ericka@coffinberger.com")
	void EmailOfRecord1812() {
		assertEquals("ericka@coffinberger.com", customers.get(1811).getEmail());
	}

	@Test
	@DisplayName("Record 1812: Web is http://www.erickacoffinberger.com")
	void WebOfRecord1812() {
		assertEquals("http://www.erickacoffinberger.com", customers.get(1811).getWeb());
	}
}
