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

@Tag("46")
class Record_1384 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1384: FirstName is Marian")
	void FirstNameOfRecord1384() {
		assertEquals("Marian", customers.get(1383).getFirstName());
	}

	@Test
	@DisplayName("Record 1384: LastName is Lawford")
	void LastNameOfRecord1384() {
		assertEquals("Lawford", customers.get(1383).getLastName());
	}

	@Test
	@DisplayName("Record 1384: Company is Continental Silite Intrntl")
	void CompanyOfRecord1384() {
		assertEquals("Continental Silite Intrntl", customers.get(1383).getCompany());
	}

	@Test
	@DisplayName("Record 1384: Address is 10772 Noel St")
	void AddressOfRecord1384() {
		assertEquals("10772 Noel St", customers.get(1383).getAddress());
	}

	@Test
	@DisplayName("Record 1384: City is Los Alamitos")
	void CityOfRecord1384() {
		assertEquals("Los Alamitos", customers.get(1383).getCity());
	}

	@Test
	@DisplayName("Record 1384: County is Orange")
	void CountyOfRecord1384() {
		assertEquals("Orange", customers.get(1383).getCounty());
	}

	@Test
	@DisplayName("Record 1384: State is CA")
	void StateOfRecord1384() {
		assertEquals("CA", customers.get(1383).getState());
	}

	@Test
	@DisplayName("Record 1384: ZIP is 90720")
	void ZIPOfRecord1384() {
		assertEquals("90720", customers.get(1383).getZIP());
	}

	@Test
	@DisplayName("Record 1384: Phone is 562-952-8810")
	void PhoneOfRecord1384() {
		assertEquals("562-952-8810", customers.get(1383).getPhone());
	}

	@Test
	@DisplayName("Record 1384: Fax is 562-952-4677")
	void FaxOfRecord1384() {
		assertEquals("562-952-4677", customers.get(1383).getFax());
	}

	@Test
	@DisplayName("Record 1384: Email is marian@lawford.com")
	void EmailOfRecord1384() {
		assertEquals("marian@lawford.com", customers.get(1383).getEmail());
	}

	@Test
	@DisplayName("Record 1384: Web is http://www.marianlawford.com")
	void WebOfRecord1384() {
		assertEquals("http://www.marianlawford.com", customers.get(1383).getWeb());
	}
}
