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
class Record_1285 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1285: FirstName is Everett")
	void FirstNameOfRecord1285() {
		assertEquals("Everett", customers.get(1284).getFirstName());
	}

	@Test
	@DisplayName("Record 1285: LastName is Prentiss")
	void LastNameOfRecord1285() {
		assertEquals("Prentiss", customers.get(1284).getLastName());
	}

	@Test
	@DisplayName("Record 1285: Company is Compu De Sign")
	void CompanyOfRecord1285() {
		assertEquals("Compu De Sign", customers.get(1284).getCompany());
	}

	@Test
	@DisplayName("Record 1285: Address is 798 S Atcher St")
	void AddressOfRecord1285() {
		assertEquals("798 S Atcher St", customers.get(1284).getAddress());
	}

	@Test
	@DisplayName("Record 1285: City is Radcliff")
	void CityOfRecord1285() {
		assertEquals("Radcliff", customers.get(1284).getCity());
	}

	@Test
	@DisplayName("Record 1285: County is Hardin")
	void CountyOfRecord1285() {
		assertEquals("Hardin", customers.get(1284).getCounty());
	}

	@Test
	@DisplayName("Record 1285: State is KY")
	void StateOfRecord1285() {
		assertEquals("KY", customers.get(1284).getState());
	}

	@Test
	@DisplayName("Record 1285: ZIP is 40160")
	void ZIPOfRecord1285() {
		assertEquals("40160", customers.get(1284).getZIP());
	}

	@Test
	@DisplayName("Record 1285: Phone is 270-351-7777")
	void PhoneOfRecord1285() {
		assertEquals("270-351-7777", customers.get(1284).getPhone());
	}

	@Test
	@DisplayName("Record 1285: Fax is 270-351-3626")
	void FaxOfRecord1285() {
		assertEquals("270-351-3626", customers.get(1284).getFax());
	}

	@Test
	@DisplayName("Record 1285: Email is everett@prentiss.com")
	void EmailOfRecord1285() {
		assertEquals("everett@prentiss.com", customers.get(1284).getEmail());
	}

	@Test
	@DisplayName("Record 1285: Web is http://www.everettprentiss.com")
	void WebOfRecord1285() {
		assertEquals("http://www.everettprentiss.com", customers.get(1284).getWeb());
	}
}
