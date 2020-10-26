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

@Tag("37")
class Record_2075 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2075: FirstName is Leola")
	void FirstNameOfRecord2075() {
		assertEquals("Leola", customers.get(2074).getFirstName());
	}

	@Test
	@DisplayName("Record 2075: LastName is Doherty")
	void LastNameOfRecord2075() {
		assertEquals("Doherty", customers.get(2074).getLastName());
	}

	@Test
	@DisplayName("Record 2075: Company is Kokopelli Gifts")
	void CompanyOfRecord2075() {
		assertEquals("Kokopelli Gifts", customers.get(2074).getCompany());
	}

	@Test
	@DisplayName("Record 2075: Address is 704 E 142nd St")
	void AddressOfRecord2075() {
		assertEquals("704 E 142nd St", customers.get(2074).getAddress());
	}

	@Test
	@DisplayName("Record 2075: City is Dolton")
	void CityOfRecord2075() {
		assertEquals("Dolton", customers.get(2074).getCity());
	}

	@Test
	@DisplayName("Record 2075: County is Cook")
	void CountyOfRecord2075() {
		assertEquals("Cook", customers.get(2074).getCounty());
	}

	@Test
	@DisplayName("Record 2075: State is IL")
	void StateOfRecord2075() {
		assertEquals("IL", customers.get(2074).getState());
	}

	@Test
	@DisplayName("Record 2075: ZIP is 60419")
	void ZIPOfRecord2075() {
		assertEquals("60419", customers.get(2074).getZIP());
	}

	@Test
	@DisplayName("Record 2075: Phone is 708-849-9649")
	void PhoneOfRecord2075() {
		assertEquals("708-849-9649", customers.get(2074).getPhone());
	}

	@Test
	@DisplayName("Record 2075: Fax is 708-849-3647")
	void FaxOfRecord2075() {
		assertEquals("708-849-3647", customers.get(2074).getFax());
	}

	@Test
	@DisplayName("Record 2075: Email is leola@doherty.com")
	void EmailOfRecord2075() {
		assertEquals("leola@doherty.com", customers.get(2074).getEmail());
	}

	@Test
	@DisplayName("Record 2075: Web is http://www.leoladoherty.com")
	void WebOfRecord2075() {
		assertEquals("http://www.leoladoherty.com", customers.get(2074).getWeb());
	}
}
