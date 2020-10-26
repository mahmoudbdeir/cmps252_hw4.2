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

@Tag("31")
class Record_964 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 964: FirstName is Rynaldo")
	void FirstNameOfRecord964() {
		assertEquals("Rynaldo", customers.get(963).getFirstName());
	}

	@Test
	@DisplayName("Record 964: LastName is Wiederholt")
	void LastNameOfRecord964() {
		assertEquals("Wiederholt", customers.get(963).getLastName());
	}

	@Test
	@DisplayName("Record 964: Company is Gruber, Joseph J")
	void CompanyOfRecord964() {
		assertEquals("Gruber, Joseph J", customers.get(963).getCompany());
	}

	@Test
	@DisplayName("Record 964: Address is 2190 N Crede Ave")
	void AddressOfRecord964() {
		assertEquals("2190 N Crede Ave", customers.get(963).getAddress());
	}

	@Test
	@DisplayName("Record 964: City is Crystal River")
	void CityOfRecord964() {
		assertEquals("Crystal River", customers.get(963).getCity());
	}

	@Test
	@DisplayName("Record 964: County is Citrus")
	void CountyOfRecord964() {
		assertEquals("Citrus", customers.get(963).getCounty());
	}

	@Test
	@DisplayName("Record 964: State is FL")
	void StateOfRecord964() {
		assertEquals("FL", customers.get(963).getState());
	}

	@Test
	@DisplayName("Record 964: ZIP is 34428")
	void ZIPOfRecord964() {
		assertEquals("34428", customers.get(963).getZIP());
	}

	@Test
	@DisplayName("Record 964: Phone is 352-795-9529")
	void PhoneOfRecord964() {
		assertEquals("352-795-9529", customers.get(963).getPhone());
	}

	@Test
	@DisplayName("Record 964: Fax is 352-795-0707")
	void FaxOfRecord964() {
		assertEquals("352-795-0707", customers.get(963).getFax());
	}

	@Test
	@DisplayName("Record 964: Email is rynaldo@wiederholt.com")
	void EmailOfRecord964() {
		assertEquals("rynaldo@wiederholt.com", customers.get(963).getEmail());
	}

	@Test
	@DisplayName("Record 964: Web is http://www.rynaldowiederholt.com")
	void WebOfRecord964() {
		assertEquals("http://www.rynaldowiederholt.com", customers.get(963).getWeb());
	}
}
