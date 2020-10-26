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

@Tag("33")
class Record_2347 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2347: FirstName is Daren")
	void FirstNameOfRecord2347() {
		assertEquals("Daren", customers.get(2346).getFirstName());
	}

	@Test
	@DisplayName("Record 2347: LastName is Schieffer")
	void LastNameOfRecord2347() {
		assertEquals("Schieffer", customers.get(2346).getLastName());
	}

	@Test
	@DisplayName("Record 2347: Company is Red Roof Inns")
	void CompanyOfRecord2347() {
		assertEquals("Red Roof Inns", customers.get(2346).getCompany());
	}

	@Test
	@DisplayName("Record 2347: Address is 801b W 8th")
	void AddressOfRecord2347() {
		assertEquals("801b W 8th", customers.get(2346).getAddress());
	}

	@Test
	@DisplayName("Record 2347: City is Cincinnati")
	void CityOfRecord2347() {
		assertEquals("Cincinnati", customers.get(2346).getCity());
	}

	@Test
	@DisplayName("Record 2347: County is Hamilton")
	void CountyOfRecord2347() {
		assertEquals("Hamilton", customers.get(2346).getCounty());
	}

	@Test
	@DisplayName("Record 2347: State is OH")
	void StateOfRecord2347() {
		assertEquals("OH", customers.get(2346).getState());
	}

	@Test
	@DisplayName("Record 2347: ZIP is 45203")
	void ZIPOfRecord2347() {
		assertEquals("45203", customers.get(2346).getZIP());
	}

	@Test
	@DisplayName("Record 2347: Phone is 513-381-9311")
	void PhoneOfRecord2347() {
		assertEquals("513-381-9311", customers.get(2346).getPhone());
	}

	@Test
	@DisplayName("Record 2347: Fax is 513-381-9798")
	void FaxOfRecord2347() {
		assertEquals("513-381-9798", customers.get(2346).getFax());
	}

	@Test
	@DisplayName("Record 2347: Email is daren@schieffer.com")
	void EmailOfRecord2347() {
		assertEquals("daren@schieffer.com", customers.get(2346).getEmail());
	}

	@Test
	@DisplayName("Record 2347: Web is http://www.darenschieffer.com")
	void WebOfRecord2347() {
		assertEquals("http://www.darenschieffer.com", customers.get(2346).getWeb());
	}
}
