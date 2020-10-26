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

@Tag("13")
class Record_4244 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4244: FirstName is Wyatt")
	void FirstNameOfRecord4244() {
		assertEquals("Wyatt", customers.get(4243).getFirstName());
	}

	@Test
	@DisplayName("Record 4244: LastName is Paddock")
	void LastNameOfRecord4244() {
		assertEquals("Paddock", customers.get(4243).getLastName());
	}

	@Test
	@DisplayName("Record 4244: Company is Ridgewood Press")
	void CompanyOfRecord4244() {
		assertEquals("Ridgewood Press", customers.get(4243).getCompany());
	}

	@Test
	@DisplayName("Record 4244: Address is 1331 E Edinger Ave")
	void AddressOfRecord4244() {
		assertEquals("1331 E Edinger Ave", customers.get(4243).getAddress());
	}

	@Test
	@DisplayName("Record 4244: City is Santa Ana")
	void CityOfRecord4244() {
		assertEquals("Santa Ana", customers.get(4243).getCity());
	}

	@Test
	@DisplayName("Record 4244: County is Orange")
	void CountyOfRecord4244() {
		assertEquals("Orange", customers.get(4243).getCounty());
	}

	@Test
	@DisplayName("Record 4244: State is CA")
	void StateOfRecord4244() {
		assertEquals("CA", customers.get(4243).getState());
	}

	@Test
	@DisplayName("Record 4244: ZIP is 92705")
	void ZIPOfRecord4244() {
		assertEquals("92705", customers.get(4243).getZIP());
	}

	@Test
	@DisplayName("Record 4244: Phone is 714-667-9444")
	void PhoneOfRecord4244() {
		assertEquals("714-667-9444", customers.get(4243).getPhone());
	}

	@Test
	@DisplayName("Record 4244: Fax is 714-667-9281")
	void FaxOfRecord4244() {
		assertEquals("714-667-9281", customers.get(4243).getFax());
	}

	@Test
	@DisplayName("Record 4244: Email is wyatt@paddock.com")
	void EmailOfRecord4244() {
		assertEquals("wyatt@paddock.com", customers.get(4243).getEmail());
	}

	@Test
	@DisplayName("Record 4244: Web is http://www.wyattpaddock.com")
	void WebOfRecord4244() {
		assertEquals("http://www.wyattpaddock.com", customers.get(4243).getWeb());
	}
}
