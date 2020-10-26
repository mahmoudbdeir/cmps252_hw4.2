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

@Tag("17")
class Record_4534 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4534: FirstName is Neville")
	void FirstNameOfRecord4534() {
		assertEquals("Neville", customers.get(4533).getFirstName());
	}

	@Test
	@DisplayName("Record 4534: LastName is Maliska")
	void LastNameOfRecord4534() {
		assertEquals("Maliska", customers.get(4533).getLastName());
	}

	@Test
	@DisplayName("Record 4534: Company is Greve, Wendy E Esq")
	void CompanyOfRecord4534() {
		assertEquals("Greve, Wendy E Esq", customers.get(4533).getCompany());
	}

	@Test
	@DisplayName("Record 4534: Address is 265 Main St")
	void AddressOfRecord4534() {
		assertEquals("265 Main St", customers.get(4533).getAddress());
	}

	@Test
	@DisplayName("Record 4534: City is Goshen")
	void CityOfRecord4534() {
		assertEquals("Goshen", customers.get(4533).getCity());
	}

	@Test
	@DisplayName("Record 4534: County is Orange")
	void CountyOfRecord4534() {
		assertEquals("Orange", customers.get(4533).getCounty());
	}

	@Test
	@DisplayName("Record 4534: State is NY")
	void StateOfRecord4534() {
		assertEquals("NY", customers.get(4533).getState());
	}

	@Test
	@DisplayName("Record 4534: ZIP is 10924")
	void ZIPOfRecord4534() {
		assertEquals("10924", customers.get(4533).getZIP());
	}

	@Test
	@DisplayName("Record 4534: Phone is 845-294-5004")
	void PhoneOfRecord4534() {
		assertEquals("845-294-5004", customers.get(4533).getPhone());
	}

	@Test
	@DisplayName("Record 4534: Fax is 845-294-3413")
	void FaxOfRecord4534() {
		assertEquals("845-294-3413", customers.get(4533).getFax());
	}

	@Test
	@DisplayName("Record 4534: Email is neville@maliska.com")
	void EmailOfRecord4534() {
		assertEquals("neville@maliska.com", customers.get(4533).getEmail());
	}

	@Test
	@DisplayName("Record 4534: Web is http://www.nevillemaliska.com")
	void WebOfRecord4534() {
		assertEquals("http://www.nevillemaliska.com", customers.get(4533).getWeb());
	}
}
