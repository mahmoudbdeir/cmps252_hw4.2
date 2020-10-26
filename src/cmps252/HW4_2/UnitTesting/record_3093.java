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
class Record_3093 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3093: FirstName is Pat")
	void FirstNameOfRecord3093() {
		assertEquals("Pat", customers.get(3092).getFirstName());
	}

	@Test
	@DisplayName("Record 3093: LastName is Hooley")
	void LastNameOfRecord3093() {
		assertEquals("Hooley", customers.get(3092).getLastName());
	}

	@Test
	@DisplayName("Record 3093: Company is Sydman, Bdo")
	void CompanyOfRecord3093() {
		assertEquals("Sydman, Bdo", customers.get(3092).getCompany());
	}

	@Test
	@DisplayName("Record 3093: Address is 615 Bloomfield Ave")
	void AddressOfRecord3093() {
		assertEquals("615 Bloomfield Ave", customers.get(3092).getAddress());
	}

	@Test
	@DisplayName("Record 3093: City is Bloomfield")
	void CityOfRecord3093() {
		assertEquals("Bloomfield", customers.get(3092).getCity());
	}

	@Test
	@DisplayName("Record 3093: County is Essex")
	void CountyOfRecord3093() {
		assertEquals("Essex", customers.get(3092).getCounty());
	}

	@Test
	@DisplayName("Record 3093: State is NJ")
	void StateOfRecord3093() {
		assertEquals("NJ", customers.get(3092).getState());
	}

	@Test
	@DisplayName("Record 3093: ZIP is 7003")
	void ZIPOfRecord3093() {
		assertEquals("7003", customers.get(3092).getZIP());
	}

	@Test
	@DisplayName("Record 3093: Phone is 973-429-1258")
	void PhoneOfRecord3093() {
		assertEquals("973-429-1258", customers.get(3092).getPhone());
	}

	@Test
	@DisplayName("Record 3093: Fax is 973-429-8592")
	void FaxOfRecord3093() {
		assertEquals("973-429-8592", customers.get(3092).getFax());
	}

	@Test
	@DisplayName("Record 3093: Email is pat@hooley.com")
	void EmailOfRecord3093() {
		assertEquals("pat@hooley.com", customers.get(3092).getEmail());
	}

	@Test
	@DisplayName("Record 3093: Web is http://www.pathooley.com")
	void WebOfRecord3093() {
		assertEquals("http://www.pathooley.com", customers.get(3092).getWeb());
	}
}
