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

@Tag("12")
class Record_157 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 157: FirstName is Sonya")
	void FirstNameOfRecord157() {
		assertEquals("Sonya", customers.get(156).getFirstName());
	}

	@Test
	@DisplayName("Record 157: LastName is Delee")
	void LastNameOfRecord157() {
		assertEquals("Delee", customers.get(156).getLastName());
	}

	@Test
	@DisplayName("Record 157: Company is Kiilani Gifts & Gardens")
	void CompanyOfRecord157() {
		assertEquals("Kiilani Gifts & Gardens", customers.get(156).getCompany());
	}

	@Test
	@DisplayName("Record 157: Address is 2304 S Babcock St")
	void AddressOfRecord157() {
		assertEquals("2304 S Babcock St", customers.get(156).getAddress());
	}

	@Test
	@DisplayName("Record 157: City is Melbourne")
	void CityOfRecord157() {
		assertEquals("Melbourne", customers.get(156).getCity());
	}

	@Test
	@DisplayName("Record 157: County is Brevard")
	void CountyOfRecord157() {
		assertEquals("Brevard", customers.get(156).getCounty());
	}

	@Test
	@DisplayName("Record 157: State is FL")
	void StateOfRecord157() {
		assertEquals("FL", customers.get(156).getState());
	}

	@Test
	@DisplayName("Record 157: ZIP is 32901")
	void ZIPOfRecord157() {
		assertEquals("32901", customers.get(156).getZIP());
	}

	@Test
	@DisplayName("Record 157: Phone is 321-725-0147")
	void PhoneOfRecord157() {
		assertEquals("321-725-0147", customers.get(156).getPhone());
	}

	@Test
	@DisplayName("Record 157: Fax is 321-725-7393")
	void FaxOfRecord157() {
		assertEquals("321-725-7393", customers.get(156).getFax());
	}

	@Test
	@DisplayName("Record 157: Email is sonya@delee.com")
	void EmailOfRecord157() {
		assertEquals("sonya@delee.com", customers.get(156).getEmail());
	}

	@Test
	@DisplayName("Record 157: Web is http://www.sonyadelee.com")
	void WebOfRecord157() {
		assertEquals("http://www.sonyadelee.com", customers.get(156).getWeb());
	}
}
