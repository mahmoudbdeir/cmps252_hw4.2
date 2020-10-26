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

@Tag("26")
class Record_2964 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2964: FirstName is Ashley")
	void FirstNameOfRecord2964() {
		assertEquals("Ashley", customers.get(2963).getFirstName());
	}

	@Test
	@DisplayName("Record 2964: LastName is Holycross")
	void LastNameOfRecord2964() {
		assertEquals("Holycross", customers.get(2963).getLastName());
	}

	@Test
	@DisplayName("Record 2964: Company is Products International")
	void CompanyOfRecord2964() {
		assertEquals("Products International", customers.get(2963).getCompany());
	}

	@Test
	@DisplayName("Record 2964: Address is 801 Orange Ave")
	void AddressOfRecord2964() {
		assertEquals("801 Orange Ave", customers.get(2963).getAddress());
	}

	@Test
	@DisplayName("Record 2964: City is Daytona Beach")
	void CityOfRecord2964() {
		assertEquals("Daytona Beach", customers.get(2963).getCity());
	}

	@Test
	@DisplayName("Record 2964: County is Volusia")
	void CountyOfRecord2964() {
		assertEquals("Volusia", customers.get(2963).getCounty());
	}

	@Test
	@DisplayName("Record 2964: State is FL")
	void StateOfRecord2964() {
		assertEquals("FL", customers.get(2963).getState());
	}

	@Test
	@DisplayName("Record 2964: ZIP is 32114")
	void ZIPOfRecord2964() {
		assertEquals("32114", customers.get(2963).getZIP());
	}

	@Test
	@DisplayName("Record 2964: Phone is 386-253-2687")
	void PhoneOfRecord2964() {
		assertEquals("386-253-2687", customers.get(2963).getPhone());
	}

	@Test
	@DisplayName("Record 2964: Fax is 386-253-8978")
	void FaxOfRecord2964() {
		assertEquals("386-253-8978", customers.get(2963).getFax());
	}

	@Test
	@DisplayName("Record 2964: Email is ashley@holycross.com")
	void EmailOfRecord2964() {
		assertEquals("ashley@holycross.com", customers.get(2963).getEmail());
	}

	@Test
	@DisplayName("Record 2964: Web is http://www.ashleyholycross.com")
	void WebOfRecord2964() {
		assertEquals("http://www.ashleyholycross.com", customers.get(2963).getWeb());
	}
}
