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

@Tag("5")
class Record_4076 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4076: FirstName is Andy")
	void FirstNameOfRecord4076() {
		assertEquals("Andy", customers.get(4075).getFirstName());
	}

	@Test
	@DisplayName("Record 4076: LastName is Martone")
	void LastNameOfRecord4076() {
		assertEquals("Martone", customers.get(4075).getLastName());
	}

	@Test
	@DisplayName("Record 4076: Company is Pump Haus Deli")
	void CompanyOfRecord4076() {
		assertEquals("Pump Haus Deli", customers.get(4075).getCompany());
	}

	@Test
	@DisplayName("Record 4076: Address is 2014 Citrus Blvd")
	void AddressOfRecord4076() {
		assertEquals("2014 Citrus Blvd", customers.get(4075).getAddress());
	}

	@Test
	@DisplayName("Record 4076: City is Leesburg")
	void CityOfRecord4076() {
		assertEquals("Leesburg", customers.get(4075).getCity());
	}

	@Test
	@DisplayName("Record 4076: County is Lake")
	void CountyOfRecord4076() {
		assertEquals("Lake", customers.get(4075).getCounty());
	}

	@Test
	@DisplayName("Record 4076: State is FL")
	void StateOfRecord4076() {
		assertEquals("FL", customers.get(4075).getState());
	}

	@Test
	@DisplayName("Record 4076: ZIP is 34748")
	void ZIPOfRecord4076() {
		assertEquals("34748", customers.get(4075).getZIP());
	}

	@Test
	@DisplayName("Record 4076: Phone is 352-323-1127")
	void PhoneOfRecord4076() {
		assertEquals("352-323-1127", customers.get(4075).getPhone());
	}

	@Test
	@DisplayName("Record 4076: Fax is 352-323-0321")
	void FaxOfRecord4076() {
		assertEquals("352-323-0321", customers.get(4075).getFax());
	}

	@Test
	@DisplayName("Record 4076: Email is andy@martone.com")
	void EmailOfRecord4076() {
		assertEquals("andy@martone.com", customers.get(4075).getEmail());
	}

	@Test
	@DisplayName("Record 4076: Web is http://www.andymartone.com")
	void WebOfRecord4076() {
		assertEquals("http://www.andymartone.com", customers.get(4075).getWeb());
	}
}
