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
class Record_2339 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2339: FirstName is Merry")
	void FirstNameOfRecord2339() {
		assertEquals("Merry", customers.get(2338).getFirstName());
	}

	@Test
	@DisplayName("Record 2339: LastName is Legel")
	void LastNameOfRecord2339() {
		assertEquals("Legel", customers.get(2338).getLastName());
	}

	@Test
	@DisplayName("Record 2339: Company is Johns Hopkins Univ Wic Prgm")
	void CompanyOfRecord2339() {
		assertEquals("Johns Hopkins Univ Wic Prgm", customers.get(2338).getCompany());
	}

	@Test
	@DisplayName("Record 2339: Address is 5 N Bents St")
	void AddressOfRecord2339() {
		assertEquals("5 N Bents St", customers.get(2338).getAddress());
	}

	@Test
	@DisplayName("Record 2339: City is Frederick")
	void CityOfRecord2339() {
		assertEquals("Frederick", customers.get(2338).getCity());
	}

	@Test
	@DisplayName("Record 2339: County is Frederick")
	void CountyOfRecord2339() {
		assertEquals("Frederick", customers.get(2338).getCounty());
	}

	@Test
	@DisplayName("Record 2339: State is MD")
	void StateOfRecord2339() {
		assertEquals("MD", customers.get(2338).getState());
	}

	@Test
	@DisplayName("Record 2339: ZIP is 21701")
	void ZIPOfRecord2339() {
		assertEquals("21701", customers.get(2338).getZIP());
	}

	@Test
	@DisplayName("Record 2339: Phone is 301-253-8012")
	void PhoneOfRecord2339() {
		assertEquals("301-253-8012", customers.get(2338).getPhone());
	}

	@Test
	@DisplayName("Record 2339: Fax is 301-253-6379")
	void FaxOfRecord2339() {
		assertEquals("301-253-6379", customers.get(2338).getFax());
	}

	@Test
	@DisplayName("Record 2339: Email is merry@legel.com")
	void EmailOfRecord2339() {
		assertEquals("merry@legel.com", customers.get(2338).getEmail());
	}

	@Test
	@DisplayName("Record 2339: Web is http://www.merrylegel.com")
	void WebOfRecord2339() {
		assertEquals("http://www.merrylegel.com", customers.get(2338).getWeb());
	}
}
