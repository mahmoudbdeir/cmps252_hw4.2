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

@Tag("23")
class Record_2878 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2878: FirstName is Leann")
	void FirstNameOfRecord2878() {
		assertEquals("Leann", customers.get(2877).getFirstName());
	}

	@Test
	@DisplayName("Record 2878: LastName is Mooers")
	void LastNameOfRecord2878() {
		assertEquals("Mooers", customers.get(2877).getLastName());
	}

	@Test
	@DisplayName("Record 2878: Company is Mehringer, Susan E Esq")
	void CompanyOfRecord2878() {
		assertEquals("Mehringer, Susan E Esq", customers.get(2877).getCompany());
	}

	@Test
	@DisplayName("Record 2878: Address is 7002 N Little River Trnp")
	void AddressOfRecord2878() {
		assertEquals("7002 N Little River Trnp", customers.get(2877).getAddress());
	}

	@Test
	@DisplayName("Record 2878: City is Annandale")
	void CityOfRecord2878() {
		assertEquals("Annandale", customers.get(2877).getCity());
	}

	@Test
	@DisplayName("Record 2878: County is Fairfax")
	void CountyOfRecord2878() {
		assertEquals("Fairfax", customers.get(2877).getCounty());
	}

	@Test
	@DisplayName("Record 2878: State is VA")
	void StateOfRecord2878() {
		assertEquals("VA", customers.get(2877).getState());
	}

	@Test
	@DisplayName("Record 2878: ZIP is 22003")
	void ZIPOfRecord2878() {
		assertEquals("22003", customers.get(2877).getZIP());
	}

	@Test
	@DisplayName("Record 2878: Phone is 703-642-5914")
	void PhoneOfRecord2878() {
		assertEquals("703-642-5914", customers.get(2877).getPhone());
	}

	@Test
	@DisplayName("Record 2878: Fax is 703-642-0748")
	void FaxOfRecord2878() {
		assertEquals("703-642-0748", customers.get(2877).getFax());
	}

	@Test
	@DisplayName("Record 2878: Email is leann@mooers.com")
	void EmailOfRecord2878() {
		assertEquals("leann@mooers.com", customers.get(2877).getEmail());
	}

	@Test
	@DisplayName("Record 2878: Web is http://www.leannmooers.com")
	void WebOfRecord2878() {
		assertEquals("http://www.leannmooers.com", customers.get(2877).getWeb());
	}
}
