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

@Tag("21")
class Record_1204 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1204: FirstName is King")
	void FirstNameOfRecord1204() {
		assertEquals("King", customers.get(1203).getFirstName());
	}

	@Test
	@DisplayName("Record 1204: LastName is Loadholt")
	void LastNameOfRecord1204() {
		assertEquals("Loadholt", customers.get(1203).getLastName());
	}

	@Test
	@DisplayName("Record 1204: Company is Kyya Y 93 Fm Hit Radio")
	void CompanyOfRecord1204() {
		assertEquals("Kyya Y 93 Fm Hit Radio", customers.get(1203).getCompany());
	}

	@Test
	@DisplayName("Record 1204: Address is 4313 E Magnolia St")
	void AddressOfRecord1204() {
		assertEquals("4313 E Magnolia St", customers.get(1203).getAddress());
	}

	@Test
	@DisplayName("Record 1204: City is Phoenix")
	void CityOfRecord1204() {
		assertEquals("Phoenix", customers.get(1203).getCity());
	}

	@Test
	@DisplayName("Record 1204: County is Maricopa")
	void CountyOfRecord1204() {
		assertEquals("Maricopa", customers.get(1203).getCounty());
	}

	@Test
	@DisplayName("Record 1204: State is AZ")
	void StateOfRecord1204() {
		assertEquals("AZ", customers.get(1203).getState());
	}

	@Test
	@DisplayName("Record 1204: ZIP is 85034")
	void ZIPOfRecord1204() {
		assertEquals("85034", customers.get(1203).getZIP());
	}

	@Test
	@DisplayName("Record 1204: Phone is 602-470-4765")
	void PhoneOfRecord1204() {
		assertEquals("602-470-4765", customers.get(1203).getPhone());
	}

	@Test
	@DisplayName("Record 1204: Fax is 602-470-6065")
	void FaxOfRecord1204() {
		assertEquals("602-470-6065", customers.get(1203).getFax());
	}

	@Test
	@DisplayName("Record 1204: Email is king@loadholt.com")
	void EmailOfRecord1204() {
		assertEquals("king@loadholt.com", customers.get(1203).getEmail());
	}

	@Test
	@DisplayName("Record 1204: Web is http://www.kingloadholt.com")
	void WebOfRecord1204() {
		assertEquals("http://www.kingloadholt.com", customers.get(1203).getWeb());
	}
}
