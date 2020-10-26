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

@Tag("6")
class Record_2783 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2783: FirstName is Margaret")
	void FirstNameOfRecord2783() {
		assertEquals("Margaret", customers.get(2782).getFirstName());
	}

	@Test
	@DisplayName("Record 2783: LastName is Crumm")
	void LastNameOfRecord2783() {
		assertEquals("Crumm", customers.get(2782).getLastName());
	}

	@Test
	@DisplayName("Record 2783: Company is Stringer, Robert B Esq")
	void CompanyOfRecord2783() {
		assertEquals("Stringer, Robert B Esq", customers.get(2782).getCompany());
	}

	@Test
	@DisplayName("Record 2783: Address is 658 Suffolk Ave")
	void AddressOfRecord2783() {
		assertEquals("658 Suffolk Ave", customers.get(2782).getAddress());
	}

	@Test
	@DisplayName("Record 2783: City is Brentwood")
	void CityOfRecord2783() {
		assertEquals("Brentwood", customers.get(2782).getCity());
	}

	@Test
	@DisplayName("Record 2783: County is Suffolk")
	void CountyOfRecord2783() {
		assertEquals("Suffolk", customers.get(2782).getCounty());
	}

	@Test
	@DisplayName("Record 2783: State is NY")
	void StateOfRecord2783() {
		assertEquals("NY", customers.get(2782).getState());
	}

	@Test
	@DisplayName("Record 2783: ZIP is 11717")
	void ZIPOfRecord2783() {
		assertEquals("11717", customers.get(2782).getZIP());
	}

	@Test
	@DisplayName("Record 2783: Phone is 631-273-1978")
	void PhoneOfRecord2783() {
		assertEquals("631-273-1978", customers.get(2782).getPhone());
	}

	@Test
	@DisplayName("Record 2783: Fax is 631-273-0582")
	void FaxOfRecord2783() {
		assertEquals("631-273-0582", customers.get(2782).getFax());
	}

	@Test
	@DisplayName("Record 2783: Email is margaret@crumm.com")
	void EmailOfRecord2783() {
		assertEquals("margaret@crumm.com", customers.get(2782).getEmail());
	}

	@Test
	@DisplayName("Record 2783: Web is http://www.margaretcrumm.com")
	void WebOfRecord2783() {
		assertEquals("http://www.margaretcrumm.com", customers.get(2782).getWeb());
	}
}
