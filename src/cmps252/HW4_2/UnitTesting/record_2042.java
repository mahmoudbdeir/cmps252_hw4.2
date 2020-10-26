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
class Record_2042 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2042: FirstName is Gretchen")
	void FirstNameOfRecord2042() {
		assertEquals("Gretchen", customers.get(2041).getFirstName());
	}

	@Test
	@DisplayName("Record 2042: LastName is Nyghbors")
	void LastNameOfRecord2042() {
		assertEquals("Nyghbors", customers.get(2041).getLastName());
	}

	@Test
	@DisplayName("Record 2042: Company is Blackburn Fetter Ins Agcy Inc")
	void CompanyOfRecord2042() {
		assertEquals("Blackburn Fetter Ins Agcy Inc", customers.get(2041).getCompany());
	}

	@Test
	@DisplayName("Record 2042: Address is 23 Us Highway 206")
	void AddressOfRecord2042() {
		assertEquals("23 Us Highway 206", customers.get(2041).getAddress());
	}

	@Test
	@DisplayName("Record 2042: City is Stanhope")
	void CityOfRecord2042() {
		assertEquals("Stanhope", customers.get(2041).getCity());
	}

	@Test
	@DisplayName("Record 2042: County is Sussex")
	void CountyOfRecord2042() {
		assertEquals("Sussex", customers.get(2041).getCounty());
	}

	@Test
	@DisplayName("Record 2042: State is NJ")
	void StateOfRecord2042() {
		assertEquals("NJ", customers.get(2041).getState());
	}

	@Test
	@DisplayName("Record 2042: ZIP is 7874")
	void ZIPOfRecord2042() {
		assertEquals("7874", customers.get(2041).getZIP());
	}

	@Test
	@DisplayName("Record 2042: Phone is 973-347-4749")
	void PhoneOfRecord2042() {
		assertEquals("973-347-4749", customers.get(2041).getPhone());
	}

	@Test
	@DisplayName("Record 2042: Fax is 973-347-7869")
	void FaxOfRecord2042() {
		assertEquals("973-347-7869", customers.get(2041).getFax());
	}

	@Test
	@DisplayName("Record 2042: Email is gretchen@nyghbors.com")
	void EmailOfRecord2042() {
		assertEquals("gretchen@nyghbors.com", customers.get(2041).getEmail());
	}

	@Test
	@DisplayName("Record 2042: Web is http://www.gretchennyghbors.com")
	void WebOfRecord2042() {
		assertEquals("http://www.gretchennyghbors.com", customers.get(2041).getWeb());
	}
}
