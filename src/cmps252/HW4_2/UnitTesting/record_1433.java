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

@Tag("34")
class Record_1433 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1433: FirstName is Latoya")
	void FirstNameOfRecord1433() {
		assertEquals("Latoya", customers.get(1432).getFirstName());
	}

	@Test
	@DisplayName("Record 1433: LastName is Vassallo")
	void LastNameOfRecord1433() {
		assertEquals("Vassallo", customers.get(1432).getLastName());
	}

	@Test
	@DisplayName("Record 1433: Company is Wynstone Supply Corp")
	void CompanyOfRecord1433() {
		assertEquals("Wynstone Supply Corp", customers.get(1432).getCompany());
	}

	@Test
	@DisplayName("Record 1433: Address is 100 A Hibig Rd")
	void AddressOfRecord1433() {
		assertEquals("100 A Hibig Rd", customers.get(1432).getAddress());
	}

	@Test
	@DisplayName("Record 1433: City is Conroe")
	void CityOfRecord1433() {
		assertEquals("Conroe", customers.get(1432).getCity());
	}

	@Test
	@DisplayName("Record 1433: County is Montgomery")
	void CountyOfRecord1433() {
		assertEquals("Montgomery", customers.get(1432).getCounty());
	}

	@Test
	@DisplayName("Record 1433: State is TX")
	void StateOfRecord1433() {
		assertEquals("TX", customers.get(1432).getState());
	}

	@Test
	@DisplayName("Record 1433: ZIP is 77301")
	void ZIPOfRecord1433() {
		assertEquals("77301", customers.get(1432).getZIP());
	}

	@Test
	@DisplayName("Record 1433: Phone is 936-539-6819")
	void PhoneOfRecord1433() {
		assertEquals("936-539-6819", customers.get(1432).getPhone());
	}

	@Test
	@DisplayName("Record 1433: Fax is 936-539-2803")
	void FaxOfRecord1433() {
		assertEquals("936-539-2803", customers.get(1432).getFax());
	}

	@Test
	@DisplayName("Record 1433: Email is latoya@vassallo.com")
	void EmailOfRecord1433() {
		assertEquals("latoya@vassallo.com", customers.get(1432).getEmail());
	}

	@Test
	@DisplayName("Record 1433: Web is http://www.latoyavassallo.com")
	void WebOfRecord1433() {
		assertEquals("http://www.latoyavassallo.com", customers.get(1432).getWeb());
	}
}
