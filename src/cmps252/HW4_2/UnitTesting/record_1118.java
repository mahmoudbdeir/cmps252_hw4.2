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

@Tag("25")
class Record_1118 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1118: FirstName is Kirsten")
	void FirstNameOfRecord1118() {
		assertEquals("Kirsten", customers.get(1117).getFirstName());
	}

	@Test
	@DisplayName("Record 1118: LastName is Glomb")
	void LastNameOfRecord1118() {
		assertEquals("Glomb", customers.get(1117).getLastName());
	}

	@Test
	@DisplayName("Record 1118: Company is Cci Of Valdosta")
	void CompanyOfRecord1118() {
		assertEquals("Cci Of Valdosta", customers.get(1117).getCompany());
	}

	@Test
	@DisplayName("Record 1118: Address is 3437 Sw 24th Ave")
	void AddressOfRecord1118() {
		assertEquals("3437 Sw 24th Ave", customers.get(1117).getAddress());
	}

	@Test
	@DisplayName("Record 1118: City is Gainesville")
	void CityOfRecord1118() {
		assertEquals("Gainesville", customers.get(1117).getCity());
	}

	@Test
	@DisplayName("Record 1118: County is Alachua")
	void CountyOfRecord1118() {
		assertEquals("Alachua", customers.get(1117).getCounty());
	}

	@Test
	@DisplayName("Record 1118: State is FL")
	void StateOfRecord1118() {
		assertEquals("FL", customers.get(1117).getState());
	}

	@Test
	@DisplayName("Record 1118: ZIP is 32607")
	void ZIPOfRecord1118() {
		assertEquals("32607", customers.get(1117).getZIP());
	}

	@Test
	@DisplayName("Record 1118: Phone is 352-378-0341")
	void PhoneOfRecord1118() {
		assertEquals("352-378-0341", customers.get(1117).getPhone());
	}

	@Test
	@DisplayName("Record 1118: Fax is 352-378-2796")
	void FaxOfRecord1118() {
		assertEquals("352-378-2796", customers.get(1117).getFax());
	}

	@Test
	@DisplayName("Record 1118: Email is kirsten@glomb.com")
	void EmailOfRecord1118() {
		assertEquals("kirsten@glomb.com", customers.get(1117).getEmail());
	}

	@Test
	@DisplayName("Record 1118: Web is http://www.kirstenglomb.com")
	void WebOfRecord1118() {
		assertEquals("http://www.kirstenglomb.com", customers.get(1117).getWeb());
	}
}
