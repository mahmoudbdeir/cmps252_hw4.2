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
class Record_1753 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1753: FirstName is Demarcus")
	void FirstNameOfRecord1753() {
		assertEquals("Demarcus", customers.get(1752).getFirstName());
	}

	@Test
	@DisplayName("Record 1753: LastName is Forsman")
	void LastNameOfRecord1753() {
		assertEquals("Forsman", customers.get(1752).getLastName());
	}

	@Test
	@DisplayName("Record 1753: Company is C G Tanner & Son Inc")
	void CompanyOfRecord1753() {
		assertEquals("C G Tanner & Son Inc", customers.get(1752).getCompany());
	}

	@Test
	@DisplayName("Record 1753: Address is 5235 S Kyrene Rd  #-28")
	void AddressOfRecord1753() {
		assertEquals("5235 S Kyrene Rd  #-28", customers.get(1752).getAddress());
	}

	@Test
	@DisplayName("Record 1753: City is Tempe")
	void CityOfRecord1753() {
		assertEquals("Tempe", customers.get(1752).getCity());
	}

	@Test
	@DisplayName("Record 1753: County is Maricopa")
	void CountyOfRecord1753() {
		assertEquals("Maricopa", customers.get(1752).getCounty());
	}

	@Test
	@DisplayName("Record 1753: State is AZ")
	void StateOfRecord1753() {
		assertEquals("AZ", customers.get(1752).getState());
	}

	@Test
	@DisplayName("Record 1753: ZIP is 85283")
	void ZIPOfRecord1753() {
		assertEquals("85283", customers.get(1752).getZIP());
	}

	@Test
	@DisplayName("Record 1753: Phone is 480-345-9822")
	void PhoneOfRecord1753() {
		assertEquals("480-345-9822", customers.get(1752).getPhone());
	}

	@Test
	@DisplayName("Record 1753: Fax is 480-345-5268")
	void FaxOfRecord1753() {
		assertEquals("480-345-5268", customers.get(1752).getFax());
	}

	@Test
	@DisplayName("Record 1753: Email is demarcus@forsman.com")
	void EmailOfRecord1753() {
		assertEquals("demarcus@forsman.com", customers.get(1752).getEmail());
	}

	@Test
	@DisplayName("Record 1753: Web is http://www.demarcusforsman.com")
	void WebOfRecord1753() {
		assertEquals("http://www.demarcusforsman.com", customers.get(1752).getWeb());
	}
}
