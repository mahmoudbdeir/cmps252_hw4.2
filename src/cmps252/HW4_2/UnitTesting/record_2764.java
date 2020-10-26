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

@Tag("4")
class Record_2764 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2764: FirstName is Nathaniel")
	void FirstNameOfRecord2764() {
		assertEquals("Nathaniel", customers.get(2763).getFirstName());
	}

	@Test
	@DisplayName("Record 2764: LastName is Hoste")
	void LastNameOfRecord2764() {
		assertEquals("Hoste", customers.get(2763).getLastName());
	}

	@Test
	@DisplayName("Record 2764: Company is Glass Images & Creations")
	void CompanyOfRecord2764() {
		assertEquals("Glass Images & Creations", customers.get(2763).getCompany());
	}

	@Test
	@DisplayName("Record 2764: Address is 4300 Ridgewood Center Dr")
	void AddressOfRecord2764() {
		assertEquals("4300 Ridgewood Center Dr", customers.get(2763).getAddress());
	}

	@Test
	@DisplayName("Record 2764: City is Woodbridge")
	void CityOfRecord2764() {
		assertEquals("Woodbridge", customers.get(2763).getCity());
	}

	@Test
	@DisplayName("Record 2764: County is Prince William")
	void CountyOfRecord2764() {
		assertEquals("Prince William", customers.get(2763).getCounty());
	}

	@Test
	@DisplayName("Record 2764: State is VA")
	void StateOfRecord2764() {
		assertEquals("VA", customers.get(2763).getState());
	}

	@Test
	@DisplayName("Record 2764: ZIP is 22192")
	void ZIPOfRecord2764() {
		assertEquals("22192", customers.get(2763).getZIP());
	}

	@Test
	@DisplayName("Record 2764: Phone is 703-590-0472")
	void PhoneOfRecord2764() {
		assertEquals("703-590-0472", customers.get(2763).getPhone());
	}

	@Test
	@DisplayName("Record 2764: Fax is 703-590-0291")
	void FaxOfRecord2764() {
		assertEquals("703-590-0291", customers.get(2763).getFax());
	}

	@Test
	@DisplayName("Record 2764: Email is nathaniel@hoste.com")
	void EmailOfRecord2764() {
		assertEquals("nathaniel@hoste.com", customers.get(2763).getEmail());
	}

	@Test
	@DisplayName("Record 2764: Web is http://www.nathanielhoste.com")
	void WebOfRecord2764() {
		assertEquals("http://www.nathanielhoste.com", customers.get(2763).getWeb());
	}
}
