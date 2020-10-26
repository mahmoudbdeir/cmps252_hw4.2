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
class Record_954 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 954: FirstName is June")
	void FirstNameOfRecord954() {
		assertEquals("June", customers.get(953).getFirstName());
	}

	@Test
	@DisplayName("Record 954: LastName is Hemm")
	void LastNameOfRecord954() {
		assertEquals("Hemm", customers.get(953).getLastName());
	}

	@Test
	@DisplayName("Record 954: Company is American Sign Shops")
	void CompanyOfRecord954() {
		assertEquals("American Sign Shops", customers.get(953).getCompany());
	}

	@Test
	@DisplayName("Record 954: Address is 14001 Distribution Way")
	void AddressOfRecord954() {
		assertEquals("14001 Distribution Way", customers.get(953).getAddress());
	}

	@Test
	@DisplayName("Record 954: City is Dallas")
	void CityOfRecord954() {
		assertEquals("Dallas", customers.get(953).getCity());
	}

	@Test
	@DisplayName("Record 954: County is Dallas")
	void CountyOfRecord954() {
		assertEquals("Dallas", customers.get(953).getCounty());
	}

	@Test
	@DisplayName("Record 954: State is TX")
	void StateOfRecord954() {
		assertEquals("TX", customers.get(953).getState());
	}

	@Test
	@DisplayName("Record 954: ZIP is 75234")
	void ZIPOfRecord954() {
		assertEquals("75234", customers.get(953).getZIP());
	}

	@Test
	@DisplayName("Record 954: Phone is 972-241-1780")
	void PhoneOfRecord954() {
		assertEquals("972-241-1780", customers.get(953).getPhone());
	}

	@Test
	@DisplayName("Record 954: Fax is 972-241-6232")
	void FaxOfRecord954() {
		assertEquals("972-241-6232", customers.get(953).getFax());
	}

	@Test
	@DisplayName("Record 954: Email is june@hemm.com")
	void EmailOfRecord954() {
		assertEquals("june@hemm.com", customers.get(953).getEmail());
	}

	@Test
	@DisplayName("Record 954: Web is http://www.junehemm.com")
	void WebOfRecord954() {
		assertEquals("http://www.junehemm.com", customers.get(953).getWeb());
	}
}
