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

@Tag("11")
class Record_939 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 939: FirstName is Leeann")
	void FirstNameOfRecord939() {
		assertEquals("Leeann", customers.get(938).getFirstName());
	}

	@Test
	@DisplayName("Record 939: LastName is Hinz")
	void LastNameOfRecord939() {
		assertEquals("Hinz", customers.get(938).getLastName());
	}

	@Test
	@DisplayName("Record 939: Company is Aluminum Brick & Glass Intrntl")
	void CompanyOfRecord939() {
		assertEquals("Aluminum Brick & Glass Intrntl", customers.get(938).getCompany());
	}

	@Test
	@DisplayName("Record 939: Address is 1620 Ogden Ave")
	void AddressOfRecord939() {
		assertEquals("1620 Ogden Ave", customers.get(938).getAddress());
	}

	@Test
	@DisplayName("Record 939: City is Lisle")
	void CityOfRecord939() {
		assertEquals("Lisle", customers.get(938).getCity());
	}

	@Test
	@DisplayName("Record 939: County is DuPage")
	void CountyOfRecord939() {
		assertEquals("DuPage", customers.get(938).getCounty());
	}

	@Test
	@DisplayName("Record 939: State is IL")
	void StateOfRecord939() {
		assertEquals("IL", customers.get(938).getState());
	}

	@Test
	@DisplayName("Record 939: ZIP is 60532")
	void ZIPOfRecord939() {
		assertEquals("60532", customers.get(938).getZIP());
	}

	@Test
	@DisplayName("Record 939: Phone is 630-968-7676")
	void PhoneOfRecord939() {
		assertEquals("630-968-7676", customers.get(938).getPhone());
	}

	@Test
	@DisplayName("Record 939: Fax is 630-968-7828")
	void FaxOfRecord939() {
		assertEquals("630-968-7828", customers.get(938).getFax());
	}

	@Test
	@DisplayName("Record 939: Email is leeann@hinz.com")
	void EmailOfRecord939() {
		assertEquals("leeann@hinz.com", customers.get(938).getEmail());
	}

	@Test
	@DisplayName("Record 939: Web is http://www.leeannhinz.com")
	void WebOfRecord939() {
		assertEquals("http://www.leeannhinz.com", customers.get(938).getWeb());
	}
}
