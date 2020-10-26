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

@Tag("19")
class Record_2766 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2766: FirstName is Brooke")
	void FirstNameOfRecord2766() {
		assertEquals("Brooke", customers.get(2765).getFirstName());
	}

	@Test
	@DisplayName("Record 2766: LastName is Cottew")
	void LastNameOfRecord2766() {
		assertEquals("Cottew", customers.get(2765).getLastName());
	}

	@Test
	@DisplayName("Record 2766: Company is Kansas Oxygen Inc")
	void CompanyOfRecord2766() {
		assertEquals("Kansas Oxygen Inc", customers.get(2765).getCompany());
	}

	@Test
	@DisplayName("Record 2766: Address is South St & Rt 17m M")
	void AddressOfRecord2766() {
		assertEquals("South St & Rt 17m M", customers.get(2765).getAddress());
	}

	@Test
	@DisplayName("Record 2766: City is Goshen")
	void CityOfRecord2766() {
		assertEquals("Goshen", customers.get(2765).getCity());
	}

	@Test
	@DisplayName("Record 2766: County is Orange")
	void CountyOfRecord2766() {
		assertEquals("Orange", customers.get(2765).getCounty());
	}

	@Test
	@DisplayName("Record 2766: State is NY")
	void StateOfRecord2766() {
		assertEquals("NY", customers.get(2765).getState());
	}

	@Test
	@DisplayName("Record 2766: ZIP is 10924")
	void ZIPOfRecord2766() {
		assertEquals("10924", customers.get(2765).getZIP());
	}

	@Test
	@DisplayName("Record 2766: Phone is 845-294-4039")
	void PhoneOfRecord2766() {
		assertEquals("845-294-4039", customers.get(2765).getPhone());
	}

	@Test
	@DisplayName("Record 2766: Fax is 845-294-5064")
	void FaxOfRecord2766() {
		assertEquals("845-294-5064", customers.get(2765).getFax());
	}

	@Test
	@DisplayName("Record 2766: Email is brooke@cottew.com")
	void EmailOfRecord2766() {
		assertEquals("brooke@cottew.com", customers.get(2765).getEmail());
	}

	@Test
	@DisplayName("Record 2766: Web is http://www.brookecottew.com")
	void WebOfRecord2766() {
		assertEquals("http://www.brookecottew.com", customers.get(2765).getWeb());
	}
}
