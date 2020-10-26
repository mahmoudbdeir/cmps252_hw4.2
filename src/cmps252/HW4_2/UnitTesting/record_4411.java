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

@Tag("3")
class Record_4411 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4411: FirstName is Marion")
	void FirstNameOfRecord4411() {
		assertEquals("Marion", customers.get(4410).getFirstName());
	}

	@Test
	@DisplayName("Record 4411: LastName is Rodriuez")
	void LastNameOfRecord4411() {
		assertEquals("Rodriuez", customers.get(4410).getLastName());
	}

	@Test
	@DisplayName("Record 4411: Company is Sir Speedy Printing Center")
	void CompanyOfRecord4411() {
		assertEquals("Sir Speedy Printing Center", customers.get(4410).getCompany());
	}

	@Test
	@DisplayName("Record 4411: Address is 2801 Ponce De Leon Blvd  #-470")
	void AddressOfRecord4411() {
		assertEquals("2801 Ponce De Leon Blvd  #-470", customers.get(4410).getAddress());
	}

	@Test
	@DisplayName("Record 4411: City is Miami")
	void CityOfRecord4411() {
		assertEquals("Miami", customers.get(4410).getCity());
	}

	@Test
	@DisplayName("Record 4411: County is Miami-Dade")
	void CountyOfRecord4411() {
		assertEquals("Miami-Dade", customers.get(4410).getCounty());
	}

	@Test
	@DisplayName("Record 4411: State is FL")
	void StateOfRecord4411() {
		assertEquals("FL", customers.get(4410).getState());
	}

	@Test
	@DisplayName("Record 4411: ZIP is 33134")
	void ZIPOfRecord4411() {
		assertEquals("33134", customers.get(4410).getZIP());
	}

	@Test
	@DisplayName("Record 4411: Phone is 305-445-3696")
	void PhoneOfRecord4411() {
		assertEquals("305-445-3696", customers.get(4410).getPhone());
	}

	@Test
	@DisplayName("Record 4411: Fax is 305-445-3299")
	void FaxOfRecord4411() {
		assertEquals("305-445-3299", customers.get(4410).getFax());
	}

	@Test
	@DisplayName("Record 4411: Email is marion@rodriuez.com")
	void EmailOfRecord4411() {
		assertEquals("marion@rodriuez.com", customers.get(4410).getEmail());
	}

	@Test
	@DisplayName("Record 4411: Web is http://www.marionrodriuez.com")
	void WebOfRecord4411() {
		assertEquals("http://www.marionrodriuez.com", customers.get(4410).getWeb());
	}
}
