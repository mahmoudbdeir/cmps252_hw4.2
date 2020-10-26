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

@Tag("43")
class Record_2660 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2660: FirstName is Dayna")
	void FirstNameOfRecord2660() {
		assertEquals("Dayna", customers.get(2659).getFirstName());
	}

	@Test
	@DisplayName("Record 2660: LastName is Senich")
	void LastNameOfRecord2660() {
		assertEquals("Senich", customers.get(2659).getLastName());
	}

	@Test
	@DisplayName("Record 2660: Company is Strauss, Scott Michael Esq")
	void CompanyOfRecord2660() {
		assertEquals("Strauss, Scott Michael Esq", customers.get(2659).getCompany());
	}

	@Test
	@DisplayName("Record 2660: Address is 6 Noble Plz")
	void AddressOfRecord2660() {
		assertEquals("6 Noble Plz", customers.get(2659).getAddress());
	}

	@Test
	@DisplayName("Record 2660: City is Smithfield")
	void CityOfRecord2660() {
		assertEquals("Smithfield", customers.get(2659).getCity());
	}

	@Test
	@DisplayName("Record 2660: County is Johnston")
	void CountyOfRecord2660() {
		assertEquals("Johnston", customers.get(2659).getCounty());
	}

	@Test
	@DisplayName("Record 2660: State is NC")
	void StateOfRecord2660() {
		assertEquals("NC", customers.get(2659).getState());
	}

	@Test
	@DisplayName("Record 2660: ZIP is 27577")
	void ZIPOfRecord2660() {
		assertEquals("27577", customers.get(2659).getZIP());
	}

	@Test
	@DisplayName("Record 2660: Phone is 919-934-4686")
	void PhoneOfRecord2660() {
		assertEquals("919-934-4686", customers.get(2659).getPhone());
	}

	@Test
	@DisplayName("Record 2660: Fax is 919-934-6266")
	void FaxOfRecord2660() {
		assertEquals("919-934-6266", customers.get(2659).getFax());
	}

	@Test
	@DisplayName("Record 2660: Email is dayna@senich.com")
	void EmailOfRecord2660() {
		assertEquals("dayna@senich.com", customers.get(2659).getEmail());
	}

	@Test
	@DisplayName("Record 2660: Web is http://www.daynasenich.com")
	void WebOfRecord2660() {
		assertEquals("http://www.daynasenich.com", customers.get(2659).getWeb());
	}
}
