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

@Tag("0")
class Record_2701 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2701: FirstName is Dionne")
	void FirstNameOfRecord2701() {
		assertEquals("Dionne", customers.get(2700).getFirstName());
	}

	@Test
	@DisplayName("Record 2701: LastName is Tibbitts")
	void LastNameOfRecord2701() {
		assertEquals("Tibbitts", customers.get(2700).getLastName());
	}

	@Test
	@DisplayName("Record 2701: Company is Ecker, Richard I Md")
	void CompanyOfRecord2701() {
		assertEquals("Ecker, Richard I Md", customers.get(2700).getCompany());
	}

	@Test
	@DisplayName("Record 2701: Address is 612 W Savidge St")
	void AddressOfRecord2701() {
		assertEquals("612 W Savidge St", customers.get(2700).getAddress());
	}

	@Test
	@DisplayName("Record 2701: City is Spring Lake")
	void CityOfRecord2701() {
		assertEquals("Spring Lake", customers.get(2700).getCity());
	}

	@Test
	@DisplayName("Record 2701: County is Ottawa")
	void CountyOfRecord2701() {
		assertEquals("Ottawa", customers.get(2700).getCounty());
	}

	@Test
	@DisplayName("Record 2701: State is MI")
	void StateOfRecord2701() {
		assertEquals("MI", customers.get(2700).getState());
	}

	@Test
	@DisplayName("Record 2701: ZIP is 49456")
	void ZIPOfRecord2701() {
		assertEquals("49456", customers.get(2700).getZIP());
	}

	@Test
	@DisplayName("Record 2701: Phone is 616-842-5338")
	void PhoneOfRecord2701() {
		assertEquals("616-842-5338", customers.get(2700).getPhone());
	}

	@Test
	@DisplayName("Record 2701: Fax is 616-842-9936")
	void FaxOfRecord2701() {
		assertEquals("616-842-9936", customers.get(2700).getFax());
	}

	@Test
	@DisplayName("Record 2701: Email is dionne@tibbitts.com")
	void EmailOfRecord2701() {
		assertEquals("dionne@tibbitts.com", customers.get(2700).getEmail());
	}

	@Test
	@DisplayName("Record 2701: Web is http://www.dionnetibbitts.com")
	void WebOfRecord2701() {
		assertEquals("http://www.dionnetibbitts.com", customers.get(2700).getWeb());
	}
}
