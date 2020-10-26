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

@Tag("1")
class Record_1600 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1600: FirstName is Jay")
	void FirstNameOfRecord1600() {
		assertEquals("Jay", customers.get(1599).getFirstName());
	}

	@Test
	@DisplayName("Record 1600: LastName is Lugo")
	void LastNameOfRecord1600() {
		assertEquals("Lugo", customers.get(1599).getLastName());
	}

	@Test
	@DisplayName("Record 1600: Company is Northwestern Mutl Life Ins Co")
	void CompanyOfRecord1600() {
		assertEquals("Northwestern Mutl Life Ins Co", customers.get(1599).getCompany());
	}

	@Test
	@DisplayName("Record 1600: Address is 757 E Silver Lake Rd S")
	void AddressOfRecord1600() {
		assertEquals("757 E Silver Lake Rd S", customers.get(1599).getAddress());
	}

	@Test
	@DisplayName("Record 1600: City is Traverse City")
	void CityOfRecord1600() {
		assertEquals("Traverse City", customers.get(1599).getCity());
	}

	@Test
	@DisplayName("Record 1600: County is Grand Traverse")
	void CountyOfRecord1600() {
		assertEquals("Grand Traverse", customers.get(1599).getCounty());
	}

	@Test
	@DisplayName("Record 1600: State is MI")
	void StateOfRecord1600() {
		assertEquals("MI", customers.get(1599).getState());
	}

	@Test
	@DisplayName("Record 1600: ZIP is 49684")
	void ZIPOfRecord1600() {
		assertEquals("49684", customers.get(1599).getZIP());
	}

	@Test
	@DisplayName("Record 1600: Phone is 231-943-2446")
	void PhoneOfRecord1600() {
		assertEquals("231-943-2446", customers.get(1599).getPhone());
	}

	@Test
	@DisplayName("Record 1600: Fax is 231-943-6926")
	void FaxOfRecord1600() {
		assertEquals("231-943-6926", customers.get(1599).getFax());
	}

	@Test
	@DisplayName("Record 1600: Email is jay@lugo.com")
	void EmailOfRecord1600() {
		assertEquals("jay@lugo.com", customers.get(1599).getEmail());
	}

	@Test
	@DisplayName("Record 1600: Web is http://www.jaylugo.com")
	void WebOfRecord1600() {
		assertEquals("http://www.jaylugo.com", customers.get(1599).getWeb());
	}
}
