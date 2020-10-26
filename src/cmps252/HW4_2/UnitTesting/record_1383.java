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

@Tag("8")
class Record_1383 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1383: FirstName is Patty")
	void FirstNameOfRecord1383() {
		assertEquals("Patty", customers.get(1382).getFirstName());
	}

	@Test
	@DisplayName("Record 1383: LastName is Sysler")
	void LastNameOfRecord1383() {
		assertEquals("Sysler", customers.get(1382).getLastName());
	}

	@Test
	@DisplayName("Record 1383: Company is Computer Placement Inc")
	void CompanyOfRecord1383() {
		assertEquals("Computer Placement Inc", customers.get(1382).getCompany());
	}

	@Test
	@DisplayName("Record 1383: Address is 1733 Mckinley Ave")
	void AddressOfRecord1383() {
		assertEquals("1733 Mckinley Ave", customers.get(1382).getAddress());
	}

	@Test
	@DisplayName("Record 1383: City is Columbus")
	void CityOfRecord1383() {
		assertEquals("Columbus", customers.get(1382).getCity());
	}

	@Test
	@DisplayName("Record 1383: County is Franklin")
	void CountyOfRecord1383() {
		assertEquals("Franklin", customers.get(1382).getCounty());
	}

	@Test
	@DisplayName("Record 1383: State is OH")
	void StateOfRecord1383() {
		assertEquals("OH", customers.get(1382).getState());
	}

	@Test
	@DisplayName("Record 1383: ZIP is 43222")
	void ZIPOfRecord1383() {
		assertEquals("43222", customers.get(1382).getZIP());
	}

	@Test
	@DisplayName("Record 1383: Phone is 614-351-4340")
	void PhoneOfRecord1383() {
		assertEquals("614-351-4340", customers.get(1382).getPhone());
	}

	@Test
	@DisplayName("Record 1383: Fax is 614-351-5377")
	void FaxOfRecord1383() {
		assertEquals("614-351-5377", customers.get(1382).getFax());
	}

	@Test
	@DisplayName("Record 1383: Email is patty@sysler.com")
	void EmailOfRecord1383() {
		assertEquals("patty@sysler.com", customers.get(1382).getEmail());
	}

	@Test
	@DisplayName("Record 1383: Web is http://www.pattysysler.com")
	void WebOfRecord1383() {
		assertEquals("http://www.pattysysler.com", customers.get(1382).getWeb());
	}
}
